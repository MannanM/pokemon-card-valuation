package com.mannanlive.ebay.collections.sm
    
import com.mannanlive.ebay.collections.Card
import com.mannanlive.ebay.collections.CardType
import com.mannanlive.ebay.collections.SeriesCollection
import com.mannanlive.ebay.collections.SeriesCollector

class SunMoonLostThunder {
    companion object {
        val collection = SeriesCollection(
            "SM8",
            listOf(
                Card(17, "Shuckle-GX", CardType.GX),
                Card(19, "Celebi ◇", CardType.PRISM_STAR),
                Card(22, "Sceptile-GX", CardType.GX),
                Card(34, "Virizion-GX", CardType.GX),
                Card(44, "Magcargo-GX", CardType.GX),
                Card(52, "Blacephalon-GX", CardType.GX),
                Card(60, "Suicune-GX", CardType.GX),
                Card(86, "Zeraora-GX", CardType.GX),
                Card(98, "Sigilyph-GX", CardType.GX),
                Card(121, "Tyranitar-GX", CardType.GX),
                Card(130, "Genesect-GX", CardType.GX),
                Card(132, "Alolan Ninetales-GX", CardType.GX),
                Card(144, "Xerneas ◇", CardType.PRISM_STAR),
                Card(149, "Mimikyu-GX", CardType.GX),
                Card(154, "Ditto ◇", CardType.PRISM_STAR),
                Card(159, "Lugia-GX", CardType.GX),
                Card(178, "Heat Factory ◇", CardType.PRISM_STAR),
                Card(180, "Life Forest ◇", CardType.PRISM_STAR),
                Card(182, "Lusamine ◇", CardType.PRISM_STAR),
                Card(191, "Thunder Mountain ◇", CardType.PRISM_STAR),
                Card(195, "Shuckle-GX", CardType.ULTRA),
                Card(196, "Sceptile-GX", CardType.ULTRA),
                Card(197, "Virizion-GX", CardType.ULTRA),
                Card(198, "Magcargo-GX", CardType.ULTRA),
                Card(199, "Blacephalon-GX", CardType.ULTRA),
                Card(200, "Suicune-GX", CardType.ULTRA),
                Card(201, "Zeraora-GX", CardType.ULTRA),
                Card(202, "Sigilyph-GX", CardType.ULTRA),
                Card(203, "Tyranitar-GX", CardType.ULTRA),
                Card(204, "Genesect-GX", CardType.ULTRA),
                Card(205, "Alolan Ninetales-GX", CardType.ULTRA),
                Card(206, "Mimikyu-GX", CardType.ULTRA),
                Card(207, "Lugia-GX", CardType.ULTRA),
                Card(208, "Faba", CardType.ULTRA),
                Card(209, "Judge", CardType.ULTRA),
                Card(210, "Kahili", CardType.ULTRA),
                Card(211, "Mina", CardType.ULTRA),
                Card(212, "Morty", CardType.ULTRA),
                Card(213, "Professor Elm's Lecture", CardType.ULTRA),
                Card(214, "Whitney", CardType.ULTRA),
                Card(215, "Shuckle-GX", CardType.RAINBOW),
                Card(216, "Sceptile-GX", CardType.RAINBOW),
                Card(217, "Virizion-GX", CardType.RAINBOW),
                Card(218, "Magcargo-GX", CardType.RAINBOW),
                Card(219, "Blacephalon-GX", CardType.RAINBOW),
                Card(220, "Suicune-GX", CardType.RAINBOW),
                Card(221, "Zeraora-GX", CardType.RAINBOW),
                Card(222, "Sigilyph-GX", CardType.RAINBOW),
                Card(223, "Tyranitar-GX", CardType.RAINBOW),
                Card(224, "Genesect-GX", CardType.RAINBOW),
                Card(225, "Alolan Ninetales-GX", CardType.RAINBOW),
                Card(226, "Mimikyu-GX", CardType.RAINBOW),
                Card(227, "Lugia-GX", CardType.RAINBOW),
                Card(228, "Adventure Bag", CardType.SECRET),
                Card(229, "Choice Helmet", CardType.SECRET),
                Card(230, "Counter Gain", CardType.SECRET),
                Card(231, "Custom Catcher", CardType.SECRET),
                Card(232, "Electropower", CardType.SECRET),
                Card(233, "Lost Blender", CardType.SECRET),
                Card(234, "Net Ball", CardType.SECRET),
                Card(235, "Spell Tag", CardType.SECRET),
                Card(236, "Wait and See Hammer", CardType.SECRET)
            ),
            "Lost%20Thunder",
            listOf("jumbo", "promo", "psa", "japanese")
        )

        @JvmStatic
        fun main(args: Array<String>) {
            SeriesCollector().collect(collection)
        }
    }
}
