package com.mannanlive.ebay.collections.swsh

import com.mannanlive.ebay.collections.Card
import com.mannanlive.ebay.collections.CardType
import com.mannanlive.ebay.collections.SeriesCollection
import com.mannanlive.ebay.collections.SeriesCollector

class SwordShieldBattleStyles {
    companion object {
        val collection = SeriesCollection(
            "SWSH5",
            listOf(
                Card(40, "Empoleon V", CardType.V),
                Card(85, "Single Strike Urshifu V", CardType.V),
                Card(86, "Single Strike Urshifu VMAX", CardType.VMAX),
                Card(87, "Rapid Strike Urshifu V", CardType.V),
                Card(88, "Rapid Strike Urshifu VMAX", CardType.VMAX),
                Card(97, "Tyranitar V", CardType.V)
            ),
            "battle",
            listOf("digital", "rebel", "darkness", "vivid", "jumbo", "promo")
        )

        @JvmStatic
        fun main(args: Array<String>) = SeriesCollector().collect(collection)
    }
}
