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

        println(" - generating header")
        writeHeader(outPackage, outClass, type)
        println(" - generating cards")
        writeCards(type)
        println(" - generating footer")
        writeFooter(name)
        println(" - writing file")
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
                val cardNumber = card.get("number").textValue()
                val cardPrefixOrSuffix = getCardPrefixOrSuffix(cardNumber)

                builder.append("                Card(")
                    .append(cardNumber.filter { it.isDigit() }.trimStart('0'))
                    .append(", ")
                    .append(card.get("name").toString().replace("-GX", " GX"))
                    .append(", CardType.$rarity")
                if (card.get("name").textValue().contains("é")) {
                    builder.append(""", "${nameVariants(card.get("name").textValue())}"""")
                }
                if (cardPrefixOrSuffix.first.isNotEmpty()) {
                    builder.append(""", prefix = "${cardPrefixOrSuffix.first}"""")
                }
                if (cardPrefixOrSuffix.second.isNotEmpty()) {
                    builder.append(""", suffix = "${cardPrefixOrSuffix.second}"""")
                }
                builder.append(")")
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

    private fun getCardPrefixOrSuffix(cardNumber: String): Pair<String, String> {
        val extraChars = cardNumber.filter { it.isLetter() }
        return if (extraChars.isNotEmpty()) {
            if (cardNumber.startsWith(extraChars)) {
                extraChars to ""
            } else {
                "" to extraChars
            }
        } else {
            "" to ""
        }
    }

    private fun writeFooter(name: String) {
        builder.append("""            ),
            "${name.replace(" ", "%20")}",
            listOf("jumbo", "promo", "psa", "japanese")
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
        println(" - getting set info")
        val seriesInfo: JsonNode = callApi("$API/v2/sets/$type").get("data")
        val outPackage = type.filter { !it.isDigit() }
        val name = seriesInfo.get("name").textValue()
        val series = seriesInfo.get("series").textValue()
        val modifiedName = if (name == series) {
            "Base"
        } else {
            name
        }
        val outClass = (series + modifiedName).filter { it.isLetter() }
        println(" - getting image")
        ImageExtractor.extract(type, seriesInfo.get("images").get("symbol").textValue())
        return Triple(outPackage, name, outClass)
    }

    private fun getCardList(type: String): List<JsonNode> {
        val cardList = callApi("$API/v2/cards?q=set.id:$type").get("data") as ArrayNode
        val ignoreRarities = listOf("Common", "Uncommon", "Rare", "Rare Holo")
        return cardList.filter { card -> !ignoreRarities.contains(card.get("rarity").textValue()) }
    }

    private fun callApi(url: String): JsonNode =
        client.execute(HttpGet(url).also { it.addHeader("X-Api-Key", API_KEY) })
            .entity.content.use { content -> objectMapper.readTree(content) }

    private fun writeFile(outPackage: String, outClass: String) {
        val path = File("src/main/kotlin/com/mannanlive/ebay/collections/$outPackage")
        path.mkdirs()
        File(path, "$outClass.kt").writeText(builder.toString())
    }

    fun listSets() =
        (callApi("$API/v2/sets?orderBy=-releaseDate").get("data") as ArrayNode).forEach {
            println("${it.get("releaseDate").textValue()}: ${it.get("name")} [${it.get("id")}] - Cards #${it.get("total").intValue()}")
        }

    companion object {
        private const val API = "https://api.pokemontcg.io"
        private const val API_KEY = "8b0b1e93-f297-4104-bf5e-42bf19ca69c0"

        @JvmStatic
        fun main(args: Array<String>) = CreateCollection().listSets()
//        fun main(args: Array<String>) = listOf(
//            "dp5"
//        ).forEach {
//            println("Processing $it...")
//            CreateCollection().create(it.toLowerCase())
//        }

        fun nameVariants(input: String): String =
            input.split(" ").joinToString(" ") {
                if (it.contains("é")) {
                    "($it,${it.replace("é", "e")})"
                } else {
                    it
                }
            }
    }
}
