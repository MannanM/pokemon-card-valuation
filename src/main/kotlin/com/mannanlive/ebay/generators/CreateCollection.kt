package com.mannanlive.ebay.generators

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.node.ArrayNode
import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.HttpClientBuilder
import java.io.File

class CreateCollection {
    private val objectMapper: ObjectMapper = ObjectMapper()
    private val client = HttpClientBuilder.create().build()
    private val builder = StringBuilder()

    fun create(type: String) {
        val (outPackage, name, outClass) = getSetInfo(type)

        writeHeader(outPackage, outClass, type)
        writeCards(type)
        writeFooter(name)
        writeFile(outPackage, outClass)
    }

    private fun writeHeader(outPackage: String, outClass: String, type: String) {
        builder.append("""package com.mannanlive.ebay.collections.$outPackage
    
    import com.mannanlive.ebay.collections.Card
    import com.mannanlive.ebay.collections.CardType
    import com.mannanlive.ebay.collections.SeriesCollection
    import com.mannanlive.ebay.collections.SeriesCollector
    
    class $outClass {
        companion object {
            val collection = SeriesCollection(
                "${type.toUpperCase()}",
                listOf(
""")
    }

    private fun writeCards(type: String) {
        val interestingCards = getCardList(type)
        interestingCards
            .forEachIndexed { i, card ->
                val rarity = card.get("rarity")
                    .textValue()
                    .replace("Rare ", "")
                    .replace("Holo ", "")
                    .replace(" ", "_")
                    .toUpperCase()
                builder.append("                Card(")
                    .append(card.get("number").textValue())
                    .append(", ")
                    .append(card.get("name"))
                    .append(", CardType.$rarity)")
                    .append(
                        if (i == interestingCards.size - 1) {
                            ""
                        } else {
                            ","
                        }
                    )
                    .append("\r\n")
            }
    }

    private fun writeFooter(name: String) {
        builder.append("""
            ),
            "$name",
            listOf("jumbo", "promo", "psa")
        )

        @JvmStatic
        fun main(args: Array<String>) {
            SeriesCollector().collect(collection)
        }
    }
}
""")
    }

    private fun getSetInfo(type: String): Triple<String, String, String> {
        val seriesInfo: JsonNode = callApi("$API/v2/sets/$type").get("data")
        val outPackage = type.filter { !it.isDigit() }
        val name = seriesInfo.get("name").textValue()
        val series = seriesInfo.get("name").textValue()
        val modifiedName = if (name == series) {
            "Base"
        } else {
            name
        }
        val outClass = (series + modifiedName).filter { it.isLetter() }
        return Triple(outPackage, name, outClass)
    }

    private fun getCardList(type: String): List<JsonNode> {
        val cardList = callApi("$API/v2/cards?q=set.id:$type").get("data") as ArrayNode
        val ignoreRarities = listOf("Common", "Uncommon", "Rare", "Rare Holo")
        return cardList.filter { card -> !ignoreRarities.contains(card.get("rarity").textValue()) }
    }

    private fun callApi(url: String): JsonNode = objectMapper.readTree(
        client.execute(HttpGet(url).also {
            it.addHeader("X-Api-Key", API_KEY)
        }).entity.content
    )

    private fun writeFile(outPackage: String, outClass: String) {
        val path = File("src/main/kotlin/com/mannanlive/ebay/collections/$outPackage")
        path.mkdirs()
        File(path, "$outClass.kt").writeText(builder.toString())
    }

    companion object {
        private const val API = "https://api.pokemontcg.io"
        private const val API_KEY = "8b0b1e93-f297-4104-bf5e-42bf19ca69c0"

        @JvmStatic
        fun main(args: Array<String>) = CreateCollection().create("sm2")
    }
}
