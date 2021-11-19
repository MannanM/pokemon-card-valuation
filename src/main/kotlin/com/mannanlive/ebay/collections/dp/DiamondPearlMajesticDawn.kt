package com.mannanlive.ebay.collections.dp
    
import com.mannanlive.ebay.collections.Card
import com.mannanlive.ebay.collections.CardType
import com.mannanlive.ebay.collections.SeriesCollection
import com.mannanlive.ebay.collections.SeriesCollector

class DiamondPearlMajesticDawn {
    companion object {
        val collection = SeriesCollection(
            "DP5",
            listOf(
                Card(97, "Garchomp LV.X", CardType.LVX),
                Card(98, "Glaceon LV.X", CardType.LVX),
                Card(99, "Leafeon LV.X", CardType.LVX),
                Card(100, "Porygon-Z LV.X", CardType.LVX)
            ),
            "Majestic%20Dawn",
            listOf("jumbo", "promo","japanese")
        )

        @JvmStatic
        fun main(args: Array<String>) {
            SeriesCollector().collect(collection)
        }
    }
}
