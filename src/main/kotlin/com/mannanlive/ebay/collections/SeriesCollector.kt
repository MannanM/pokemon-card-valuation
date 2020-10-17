package com.mannanlive.ebay.collections

import com.fasterxml.jackson.databind.ObjectMapper
import com.mannanlive.ebay.EBayClient
import com.mannanlive.ebay.parser.EBayParser
import org.joda.time.format.DateTimeFormat
import java.io.File
import java.math.BigDecimal

class SeriesCollector {
    private val outFormatter = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm")
    private val eBayClient = EBayClient()
    private val eBayParser = EBayParser()

    fun collect(
        setName: String,
        set: List<Card>,
        searchString: String,
        exclusionStrings: List<String>,
        filterIds: List<Long> = listOf()
    ) {
        val results = mutableMapOf<String, PopulatedCard>()

        for (card in set) {
            val paddedLeftId = card.id.toString().padStart(3, '0')
            val searchCardId = searchCardId(card, paddedLeftId)
            val history = eBayClient.getHistory(
                "$searchString+${searchCardId}+${card.name.replace(" ", "+")}",
                exclusionStrings.joinToString("+")
            )

            val output = eBayParser.process(history)
            //need to add filter list for lot items
            val formatted = output
                .filter { !filterIds.contains(it.id) }
                .sortedBy { it.date }
                .map { arrayOf(outFormatter.print(it.date), it.price, it.id) }
            results[paddedLeftId] = PopulatedCard(card.name, card.type, formatted)
            Thread.sleep(1000)
            println("processed ${card.id}...")
        }

        File("./static/src/data/$setName.json").writeText(
            ObjectMapper().writeValueAsString(
                results
            )
        )

        var trades = 0
        var lastTrades = mutableListOf<BigDecimal>()
        results.values.forEach {
            trades += it.data.size
            lastTrades.add((it.data.lastOrNull()?.get(1) ?: BigDecimal.ZERO) as BigDecimal)
        }
        println("Trades: $trades")
        val sumByDouble = lastTrades.sumByDouble { it.toDouble() }
        println("Total Last: $sumByDouble")
        println("Average Last: ${sumByDouble / lastTrades.filter { it == BigDecimal.ZERO }.size}")
    }

    private fun searchCardId(card: Card, paddedLeftId: String): String {
        return if (card.id < 100) {
            //eBay supports searching with an or condition, so this will search for e.g. (8,008)
            "%28${card.id}%2C${paddedLeftId}%29"
        } else {
            card.id.toString()
        }
    }
}