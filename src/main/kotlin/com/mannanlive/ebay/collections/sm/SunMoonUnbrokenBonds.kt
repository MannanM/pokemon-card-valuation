package com.mannanlive.ebay.collections.sm
    
import com.mannanlive.ebay.collections.Card
import com.mannanlive.ebay.collections.CardType
import com.mannanlive.ebay.collections.SeriesCollection
import com.mannanlive.ebay.collections.SeriesCollector

class SunMoonUnbrokenBonds {
    companion object {
        val collection = SeriesCollection(
            "SM10",
            listOf(
                Card(1, "Pheromosa & Buzzwole-GX", CardType.GX),
                Card(12, "Venomoth-GX", CardType.GX),
                Card(20, "Reshiram & Charizard-GX", CardType.GX),
                Card(35, "Blastoise-GX", CardType.GX),
                Card(57, "Dedenne-GX", CardType.GX),
                Card(61, "Muk & Alolan Muk-GX", CardType.GX),
                Card(82, "Marshadow & Machamp-GX", CardType.GX),
                Card(107, "Greninja & Zoroark-GX", CardType.GX),
                Card(109, "Honchkrow-GX", CardType.GX),
                Card(120, "Lucario & Melmetal-GX", CardType.GX),
                Card(130, "Gardevoir & Sylveon-GX", CardType.GX),
                Card(140, "Whimsicott-GX", CardType.GX),
                Card(149, "Persian-GX", CardType.GX),
                Card(163, "Celesteela-GX", CardType.GX),
                Card(191, "Pheromosa & Buzzwole-GX", CardType.ULTRA),
                Card(192, "Pheromosa & Buzzwole-GX", CardType.ULTRA),
                Card(193, "Venomoth-GX", CardType.ULTRA),
                Card(194, "Reshiram & Charizard-GX", CardType.ULTRA),
                Card(195, "Dedenne-GX", CardType.ULTRA),
                Card(196, "Muk & Alolan Muk-GX", CardType.ULTRA),
                Card(197, "Muk & Alolan Muk-GX", CardType.ULTRA),
                Card(198, "Marshadow & Machamp-GX", CardType.ULTRA),
                Card(199, "Marshadow & Machamp-GX", CardType.ULTRA),
                Card(200, "Greninja & Zoroark-GX", CardType.ULTRA),
                Card(201, "Greninja & Zoroark-GX", CardType.ULTRA),
                Card(202, "Honchkrow-GX", CardType.ULTRA),
                Card(203, "Lucario & Melmetal-GX", CardType.ULTRA),
                Card(204, "Gardevoir & Sylveon-GX", CardType.ULTRA),
                Card(205, "Gardevoir & Sylveon-GX", CardType.ULTRA),
                Card(206, "Whimsicott-GX", CardType.ULTRA),
                Card(207, "Persian-GX", CardType.ULTRA),
                Card(208, "Celesteela-GX", CardType.ULTRA),
                Card(209, "Green's Exploration", CardType.ULTRA),
                Card(210, "Janine", CardType.ULTRA),
                Card(211, "Koga's Trap", CardType.ULTRA),
                Card(212, "Molayne", CardType.ULTRA),
                Card(213, "Red's Challenge", CardType.ULTRA),
                Card(214, "Welder", CardType.ULTRA),
                Card(215, "Pheromosa & Buzzwole-GX", CardType.RAINBOW),
                Card(216, "Venomoth-GX", CardType.RAINBOW),
                Card(217, "Reshiram & Charizard-GX", CardType.RAINBOW),
                Card(218, "Blastoise-GX", CardType.RAINBOW),
                Card(219, "Dedenne-GX", CardType.RAINBOW),
                Card(220, "Muk & Alolan Muk-GX", CardType.RAINBOW),
                Card(221, "Marshadow & Machamp-GX", CardType.RAINBOW),
                Card(222, "Greninja & Zoroark-GX", CardType.RAINBOW),
                Card(223, "Honchkrow-GX", CardType.RAINBOW),
                Card(224, "Lucario & Melmetal-GX", CardType.RAINBOW),
                Card(225, "Gardevoir & Sylveon-GX", CardType.RAINBOW),
                Card(226, "Whimsicott-GX", CardType.RAINBOW),
                Card(227, "Persian-GX", CardType.RAINBOW),
                Card(228, "Celesteela-GX", CardType.RAINBOW),
                Card(229, "Beast Bringer", CardType.SECRET),
                Card(230, "Electromagnetic Radar", CardType.SECRET),
                Card(231, "Fire Crystal", CardType.SECRET),
                Card(232, "Metal Core Barrier", CardType.SECRET),
                Card(233, "Pokégear 3.0", CardType.SECRET),
                Card(234, "Triple Acceleration Energy", CardType.SECRET)
            ),
            "Unbroken%20Bonds",
            listOf("jumbo", "promo", "psa", "japanese")
        )

        @JvmStatic
        fun main(args: Array<String>) {
            SeriesCollector().collect(collection)
        }
    }
}
