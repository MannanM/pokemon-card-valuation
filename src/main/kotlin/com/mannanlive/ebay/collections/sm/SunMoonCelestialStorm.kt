package com.mannanlive.ebay.collections.sm
    
import com.mannanlive.ebay.collections.Card
import com.mannanlive.ebay.collections.CardType
import com.mannanlive.ebay.collections.SeriesCollection
import com.mannanlive.ebay.collections.SeriesCollector

class SunMoonCelestialStorm {
    companion object {
        val collection = SeriesCollection(
            "SM7",
            listOf(
                Card(14, "Shiftry-GX", CardType.GX),
                Card(28, "Blaziken-GX", CardType.GX),
                Card(31, "Articuno-GX", CardType.GX),
                Card(48, "Electrode-GX", CardType.GX),
                Card(56, "Mr. Mime-GX", CardType.GX),
                Card(66, "Banette-GX", CardType.GX),
                Card(82, "Palossand-GX", CardType.GX),
                Card(85, "Alolan Raticate-GX", CardType.GX),
                Card(90, "Scizor-GX", CardType.GX),
                Card(97, "Jirachi ◇", CardType.PRISM_STAR),
                Card(102, "Stakataka-GX", CardType.GX),
                Card(107, "Latias ◇", CardType.PRISM_STAR),
                Card(108, "Latios ◇", CardType.PRISM_STAR),
                Card(109, "Rayquaza-GX", CardType.GX),
                Card(152, "Shiftry-GX", CardType.ULTRA),
                Card(153, "Blaziken-GX", CardType.ULTRA),
                Card(154, "Articuno-GX", CardType.ULTRA),
                Card(155, "Electrode-GX", CardType.ULTRA),
                Card(156, "Mr. Mime-GX", CardType.ULTRA),
                Card(157, "Banette-GX", CardType.ULTRA),
                Card(158, "Scizor-GX", CardType.ULTRA),
                Card(159, "Stakataka-GX", CardType.ULTRA),
                Card(160, "Rayquaza-GX", CardType.ULTRA),
                Card(161, "Apricorn Maker", CardType.ULTRA),
                Card(162, "Bill's Maintenance", CardType.ULTRA),
                Card(163, "Copycat", CardType.ULTRA),
                Card(164, "Lisia", CardType.ULTRA),
                Card(165, "Steven's Resolve", CardType.ULTRA),
                Card(166, "Tate & Liza", CardType.ULTRA),
                Card(167, "TV Reporter", CardType.ULTRA),
                Card(168, "Underground Expedition", CardType.ULTRA),
                Card(169, "Shiftry-GX", CardType.RAINBOW),
                Card(170, "Blaziken-GX", CardType.RAINBOW),
                Card(171, "Articuno-GX", CardType.RAINBOW),
                Card(172, "Electrode-GX", CardType.RAINBOW),
                Card(173, "Mr. Mime-GX", CardType.RAINBOW),
                Card(174, "Banette-GX", CardType.RAINBOW),
                Card(175, "Scizor-GX", CardType.RAINBOW),
                Card(176, "Stakataka-GX", CardType.RAINBOW),
                Card(177, "Rayquaza-GX", CardType.RAINBOW),
                Card(177, "Rayquaza-GX", CardType.ULTRA, suffix="a"),
                Card(178, "Acro Bike", CardType.SECRET),
                Card(179, "Hustle Belt", CardType.SECRET),
                Card(180, "Life Herb", CardType.SECRET),
                Card(181, "PokéNav", CardType.SECRET, "(PokéNav,PokeNav)"),
                Card(182, "Rainbow Brush", CardType.SECRET),
                Card(183, "Rainbow Energy", CardType.SECRET)
            ),
            "Celestial%20Storm",
            listOf("jumbo", "promo", "psa", "japanese")
        )

        @JvmStatic
        fun main(args: Array<String>) {
            SeriesCollector().collect(collection)
        }
    }
}
