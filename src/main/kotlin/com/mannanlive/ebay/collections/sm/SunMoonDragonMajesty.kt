package com.mannanlive.ebay.collections.sm
    
import com.mannanlive.ebay.collections.Card
import com.mannanlive.ebay.collections.CardType
import com.mannanlive.ebay.collections.SeriesCollection
import com.mannanlive.ebay.collections.SeriesCollector

class SunMoonDragonMajesty {
    companion object {
        val collection = SeriesCollection(
            "SM75",
            listOf(
                Card(7, "Victini ◇", CardType.PRISM_STAR),
                Card(11, "Reshiram-GX", CardType.GX),
                Card(18, "Kingdra-GX", CardType.GX),
                Card(37, "Dragonite-GX", CardType.GX),
                Card(41, "Altaria-GX", CardType.GX),
                Card(44, "Salamence-GX", CardType.GX),
                Card(48, "White Kyurem-GX", CardType.GX),
                Card(61, "Lance ◇", CardType.PRISM_STAR),
                Card(65, "Reshiram-GX", CardType.ULTRA),
                Card(66, "Kingdra-GX", CardType.ULTRA),
                Card(67, "Dragonite-GX", CardType.ULTRA),
                Card(68, "Altaria-GX", CardType.ULTRA),
                Card(69, "Blaine's Last Stand", CardType.ULTRA),
                Card(70, "Zinnia", CardType.ULTRA),
                Card(71, "Reshiram-GX", CardType.RAINBOW),
                Card(72, "Altaria-GX", CardType.RAINBOW),
                Card(73, "Salamence-GX", CardType.RAINBOW),
                Card(74, "White Kyurem-GX", CardType.RAINBOW),
                Card(75, "Dragon Talon", CardType.SECRET),
                Card(76, "Fiery Flint", CardType.SECRET),
                Card(77, "Switch Raft", CardType.SECRET),
                Card(78, "Ultra Necrozma-GX", CardType.SECRET)
            ),
            "Dragon%20Majesty",
            listOf("jumbo", "promo","japanese")
        )

        @JvmStatic
        fun main(args: Array<String>) {
            SeriesCollector().collect(collection)
        }
    }
}
