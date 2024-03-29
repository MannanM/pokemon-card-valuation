package com.mannanlive.ebay.collections

import com.mannanlive.ebay.collections.SeriesCollector.Companion.outFormatter
import com.mannanlive.ebay.parser.EBayParser

data class PopulatedCard(
    val name: String,
    val type: CardType,
    val data: List<Array<out Any>>
)

data class Card(
    val id: Int,
    val name: String,
    val type: CardType,
    val alternateSearchString: String = name,
    val ignoreTrades: List<Long> = listOf(),
    val addedTrades: List<Array<Any>> = listOf(),
    val prefix: String = "",
    val suffix: String = ""
) {
    val manualListings: List<EBayParser.Listing>
        get() = addedTrades.map {
            EBayParser.Listing(
                it[2] as Long,
                (it[1] as Double).toBigDecimal(),
                outFormatter.parseDateTime(it[0].toString()))
        }

    val searchString: String
        get() = alternateSearchString
            .replace(" ", "+")
            .replace("&", "")
            .replace("◇", "")
            .replace("(", "%28")
            .replace(")", "%29")
            .replace(",", "%2C")
}

enum class CardType {
    NORMAL,
    V,
    VMAX,
    HYPER_RARE,
    FULL_ART,
    SECRET_RARE,
    SHINY,
    EX,
    MEGA_EX,
    BREAK,
    GX,
    AMAZING_RARE,
    ULTRA,
    RAINBOW,
    SECRET,
    SHINING,
    PRISM_STAR,
    SHINY_GX,
    LVX
}
