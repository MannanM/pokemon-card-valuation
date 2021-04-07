package com.mannanlive.ebay.collections.sm
    
import com.mannanlive.ebay.collections.Card
import com.mannanlive.ebay.collections.CardType
import com.mannanlive.ebay.collections.SeriesCollection
import com.mannanlive.ebay.collections.SeriesCollector

class SunMoonUltraPrism {
    companion object {
        val collection = SeriesCollection(
            "SM5",
            listOf(
                Card(13, "Leafeon-GX", CardType.GX),
                Card(39, "Glaceon-GX", CardType.GX),
                Card(58, "Giratina ◇", CardType.PRISM_STAR),
                Card(62, "Lunala ◇", CardType.PRISM_STAR),
                Card(63, "Dawn Wings Necrozma-GX", CardType.GX),
                Card(77, "Darkrai ◇", CardType.PRISM_STAR),
                Card(89, "Solgaleo ◇", CardType.PRISM_STAR),
                Card(90, "Dusk Mane Necrozma-GX", CardType.GX),
                Card(100, "Dialga-GX", CardType.GX),
                Card(101, "Palkia-GX", CardType.GX),
                Card(116, "Silvally-GX", CardType.GX),
                Card(120, "Cyrus ◇", CardType.PRISM_STAR),
                Card(136, "Super Boost Energy ◇", CardType.PRISM_STAR),
                Card(139, "Leafeon-GX", CardType.ULTRA),
                Card(140, "Pheromosa-GX", CardType.ULTRA),
                Card(141, "Glaceon-GX", CardType.ULTRA),
                Card(142, "Xurkitree-GX", CardType.ULTRA),
                Card(143, "Dawn Wings Necrozma-GX", CardType.ULTRA),
                Card(144, "Celesteela-GX", CardType.ULTRA),
                Card(145, "Dusk Mane Necrozma-GX", CardType.ULTRA),
                Card(146, "Dialga-GX", CardType.ULTRA),
                Card(147, "Palkia-GX", CardType.ULTRA),
                Card(148, "Cynthia", CardType.ULTRA),
                Card(149, "Gardenia", CardType.ULTRA),
                Card(150, "Lana", CardType.ULTRA),
                Card(151, "Lillie", CardType.ULTRA),
                Card(152, "Looker", CardType.ULTRA),
                Card(153, "Lusamine", CardType.ULTRA),
                Card(153, "Lusamine", CardType.ULTRA, suffix="a"),
                Card(154, "Mars", CardType.ULTRA),
                Card(155, "Pokémon Fan Club", CardType.ULTRA, "(Pokémon,Pokemon) Fan Club"),
                Card(156, "Volkner", CardType.ULTRA),
                Card(157, "Leafeon-GX", CardType.RAINBOW),
                Card(158, "Pheromosa-GX", CardType.RAINBOW),
                Card(159, "Glaceon-GX", CardType.RAINBOW),
                Card(160, "Xurkitree-GX", CardType.RAINBOW),
                Card(161, "Dawn Wings Necrozma-GX", CardType.RAINBOW),
                Card(162, "Celesteela-GX", CardType.RAINBOW),
                Card(163, "Dusk Mane Necrozma-GX", CardType.RAINBOW),
                Card(164, "Dialga-GX", CardType.RAINBOW),
                Card(165, "Palkia-GX", CardType.RAINBOW),
                Card(166, "Crushing Hammer", CardType.SECRET),
                Card(167, "Escape Board", CardType.SECRET),
                Card(168, "Missing Clover", CardType.SECRET),
                Card(169, "Peeking Red Card", CardType.SECRET),
                Card(170, "Unit Energy GrassFireWater", CardType.SECRET),
                Card(171, "Unit Energy LightningPsychicMetal", CardType.SECRET),
                Card(172, "Lunala-GX", CardType.SECRET),
                Card(173, "Solgaleo-GX", CardType.SECRET)
            ),
            "Ultra%20Prism",
            listOf("jumbo", "promo", "psa")
        )

        @JvmStatic
        fun main(args: Array<String>) {
            SeriesCollector().collect(collection)
        }
    }
}
