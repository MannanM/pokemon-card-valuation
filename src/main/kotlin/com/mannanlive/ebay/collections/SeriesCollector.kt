package com.mannanlive.ebay.collections

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import com.mannanlive.ebay.EBayClient
import com.mannanlive.ebay.parser.EBayParser
import org.joda.time.format.DateTimeFormat
import org.joda.time.format.DateTimeFormatter
import java.io.File

class SeriesCollector {
    companion object {
        val outFormatter: DateTimeFormatter = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm")
    }
    private val eBayClient = EBayClient()
    private val eBayParser = EBayParser()
    private val objectMapper = ObjectMapper().registerKotlinModule()

    fun collect(collection: SeriesCollection) {
        println("Processing ${collection.setName}...")
        val file = File("./static/src/data/${collection.setName}.json")
        val results = mutableMapOf<String, PopulatedCard>()

        val padRequired = calculatePadRequired(collection.set)

        for (card in collection.set) {
            val paddedLeftId = card.prefix + card.id.toString().padStart(padRequired, '0')
            val searchCardId = searchCardId(card, paddedLeftId)
            val history = eBayClient.getHistory(
                "${collection.searchString}+${searchCardId}+${card.searchString}",
                collection.exclusionStrings.joinToString("+")
            )

            val output = eBayParser.process(history) + card.manualListings
            //need to add filter list for lot items
            val new = output.map { arrayOf(outFormatter.print(it.date), it.price, it.id) }
            val mergeExisting = (new + existing(file, paddedLeftId))
                .filter { !card.ignoreTrades.contains(it[2]) }
                .distinct()
                .sortedBy { it[0].toString() }

            results[paddedLeftId] = PopulatedCard(card.name, card.type, mergeExisting)
            Thread.sleep(1000)
            println("processed $paddedLeftId... found ${new.size}")
        }

        file.writeText(
            objectMapper.writeValueAsString(
                results
            )
        )
//        var trades = 0
//        val lastTrades = mutableListOf<BigDecimal>()
//        results.values.forEach {
//            trades += it.data.size
//            lastTrades.add((it.data.lastOrNull()?.get(1) ?: BigDecimal.ZERO) as BigDecimal)
//        }
//        println("Trades: $trades")
//        val sumByDouble = lastTrades.sumByDouble { it.toDouble() }
//        println("Total Last: $sumByDouble")
//        println("Average Last: ${sumByDouble / lastTrades.filter { it == BigDecimal.ZERO }.size}")
    }

    private fun existing(file: File, paddedLeftId: String): List<Array<Any>> {
        return if (file.exists()) {
            val original: Map<String, PopulatedCard> = objectMapper.readValue(file)
            original[paddedLeftId]?.data ?: listOf()
        } else {
            listOf()
        }
    }

    private fun calculatePadRequired(cardSet: List<Card>): Int {
        val maxCardId = cardSet.maxBy { it.id }?.id ?: 0
        return when {
            maxCardId >= 100 -> 3
            maxCardId >= 10 -> 2
            else -> 1
        }
    }

    private fun searchCardId(card: Card, paddedLeftId: String): String {
        val cardId = card.prefix + card.id.toString()
        return if (cardId != paddedLeftId) {
            //eBay supports searching with an or condition, so this will search for e.g. (8,008)
            "%28${card.id}%2C${paddedLeftId}%29"
        } else {
            cardId
        }
    }
}
