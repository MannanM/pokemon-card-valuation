package com.mannanlive.ebay.collections.sm

import com.mannanlive.ebay.collections.Card
import com.mannanlive.ebay.collections.CardType
import com.mannanlive.ebay.collections.SeriesCollection
import com.mannanlive.ebay.collections.SeriesCollector

class SunMoonBase {
    companion object {
        val collection = SeriesCollection(
            "SM1",
            listOf(
                Card(12, "Decidueye-GX", CardType.GX),
                Card(15, "Lurantis-GX", CardType.GX),
                Card(27, "Incineroar-GX", CardType.GX),
                Card(35, "Lapras-GX", CardType.GX),
                Card(42, "Primarina-GX", CardType.GX),
                Card(61, "Espeon-GX", CardType.GX),
                Card(66, "Lunala-GX", CardType.GX),
                Card(80, "Umbreon-GX", CardType.GX),
                Card(89, "Solgaleo-GX", CardType.GX),
                Card(100, "Tauros-GX", CardType.GX),
                Card(110, "Gumshoos-GX", CardType.GX),
                Card(138, "Lurantis-GX", CardType.ULTRA),
                Card(139, "Lapras-GX", CardType.ULTRA),
                Card(140, "Espeon-GX", CardType.ULTRA),
                Card(141, "Lunala-GX", CardType.ULTRA),
                Card(142, "Umbreon-GX", CardType.ULTRA),
                Card(143, "Solgaleo-GX", CardType.ULTRA),
                Card(144, "Tauros-GX", CardType.ULTRA),
                Card(145, "Gumshoos-GX", CardType.ULTRA),
                Card(146, "Ilima", CardType.ULTRA),
                Card(147, "Lillie", CardType.ULTRA),
                Card(148, "Professor Kukui", CardType.ULTRA),
                Card(149, "Team Skull Grunt", CardType.ULTRA),
                Card(150, "Lurantis-GX", CardType.RAINBOW),
                Card(151, "Lapras-GX", CardType.RAINBOW),
                Card(152, "Espeon-GX", CardType.RAINBOW),
                Card(153, "Lunala-GX", CardType.RAINBOW),
                Card(154, "Umbreon-GX", CardType.RAINBOW),
                Card(155, "Solgaleo-GX", CardType.RAINBOW),
                Card(156, "Tauros-GX", CardType.RAINBOW),
                Card(157, "Gumshoos-GX", CardType.RAINBOW),
                Card(158, "Nest Ball", CardType.SECRET),
                Card(159, "Rotom Dex", CardType.SECRET),
                Card(160, "Switch", CardType.SECRET),
                Card(161, "Ultra Ball", CardType.SECRET),
                Card(162, "Psychic Energy", CardType.SECRET),
                Card(163, "Metal Energy", CardType.SECRET)
            ),
            "Sun%20Moon",
            listOf("jumbo", "promo", "psa")
        )

        @JvmStatic
        fun main(args: Array<String>) {
            SeriesCollector().collect(collection)
        }
    }
}
    