package com.mannanlive.ebay.collections

import com.fasterxml.jackson.databind.ObjectMapper
import com.mannanlive.ebay.EBayClient
import com.mannanlive.ebay.parser.EBayParser
import org.joda.time.format.DateTimeFormat
import org.joda.time.format.DateTimeFormatter
import java.io.File
import java.math.BigDecimal

class SeriesCollector {
    companion object {
        val outFormatter: DateTimeFormatter = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm")
    }
    private val eBayClient = EBayClient()
    private val eBayParser = EBayParser()

    fun collect(collection: SeriesCollection) {
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
            val formatted = output
                .filter { !card.ignoreTrades.contains(it.id) }
                .sortedBy { it.date }
                .map { arrayOf(outFormatter.print(it.date), it.price, it.id) }
            results[paddedLeftId] = PopulatedCard(card.name, card.type, formatted)
            Thread.sleep(1000)
            println("processed $paddedLeftId... found ${formatted.size}")
        }

        File("./static/src/data/${collection.setName}.json").writeText(
            ObjectMapper().writeValueAsString(
                results
            )
        )

        var trades = 0
        val lastTrades = mutableListOf<BigDecimal>()
        results.values.forEach {
            trades += it.data.size
            lastTrades.add((it.data.lastOrNull()?.get(1) ?: BigDecimal.ZERO) as BigDecimal)
        }
        println("Trades: $trades")
        val sumByDouble = lastTrades.sumByDouble { it.toDouble() }
        println("Total Last: $sumByDouble")
        println("Average Last: ${sumByDouble / lastTrades.filter { it == BigDecimal.ZERO }.size}")
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
