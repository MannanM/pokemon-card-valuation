package com.mannanlive.ebay.collections.ecard
    
import com.mannanlive.ebay.collections.Card
import com.mannanlive.ebay.collections.CardType
import com.mannanlive.ebay.collections.SeriesCollection
import com.mannanlive.ebay.collections.SeriesCollector

class ECardSkyridge {
    companion object {
        val collection = SeriesCollection(
            "ECARD3",
            listOf(
                Card(145, "Celebi", CardType.SECRET),
                Card(146, "Charizard", CardType.SECRET),
                Card(147, "Crobat", CardType.SECRET),
                Card(148, "Golem", CardType.SECRET),
                Card(149, "Ho-oh", CardType.SECRET),
                Card(150, "Kabutops", CardType.SECRET)
            ),
            "Skyridge",
            listOf("japanese", "metal")
        )

        @JvmStatic
        fun main(args: Array<String>) {
            SeriesCollector().collect(collection)
        }
    }
}
