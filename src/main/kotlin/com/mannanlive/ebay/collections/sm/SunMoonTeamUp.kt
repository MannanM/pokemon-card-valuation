package com.mannanlive.ebay.collections.sm
    
import com.mannanlive.ebay.collections.Card
import com.mannanlive.ebay.collections.CardType
import com.mannanlive.ebay.collections.SeriesCollection
import com.mannanlive.ebay.collections.SeriesCollector

class SunMoonTeamUp {
    companion object {
        val collection = SeriesCollection(
            "SM9",
            listOf(
                Card(1, "Celebi & Venusaur-GX", CardType.GX),
                Card(10, "Shaymin ◇", CardType.PRISM_STAR),
                Card(33, "Pikachu & Zekrom-GX", CardType.GX),
                Card(43, "Ampharos-GX", CardType.GX),
                Card(51, "Tapu Koko ◇", CardType.PRISM_STAR),
                Card(53, "Gengar & Mimikyu-GX", CardType.GX),
                Card(67, "Mr. Mime-GX", CardType.GX),
                Card(82, "Lycanroc-GX", CardType.GX),
                Card(96, "Hoopa-GX", CardType.GX),
                Card(97, "Incineroar-GX", CardType.GX),
                Card(106, "Cobalion-GX", CardType.GX),
                Card(113, "Latias & Latios-GX", CardType.GX),
                Card(120, "Eevee & Snorlax-GX", CardType.GX),
                Card(134, "Black Market ◇", CardType.PRISM_STAR),
                Card(158, "Wondrous Labyrinth ◇", CardType.PRISM_STAR),
                Card(159, "Celebi & Venusaur-GX", CardType.ULTRA),
                Card(160, "Magikarp & Wailord-GX", CardType.ULTRA),
                Card(161, "Magikarp & Wailord-GX", CardType.ULTRA),
                Card(162, "Pikachu & Zekrom-GX", CardType.ULTRA),
                Card(163, "Ampharos-GX", CardType.ULTRA),
                Card(164, "Gengar & Mimikyu-GX", CardType.ULTRA),
                Card(165, "Gengar & Mimikyu-GX", CardType.ULTRA),
                Card(166, "Hoopa-GX", CardType.ULTRA),
                Card(167, "Incineroar-GX", CardType.ULTRA),
                Card(168, "Cobalion-GX", CardType.ULTRA),
                Card(169, "Latias & Latios-GX", CardType.ULTRA),
                Card(170, "Latias & Latios-GX", CardType.ULTRA),
                Card(171, "Eevee & Snorlax-GX", CardType.ULTRA),
                Card(172, "Brock's Grit", CardType.ULTRA),
                Card(173, "Dana", CardType.ULTRA),
                Card(174, "Erika's Hospitality", CardType.ULTRA),
                Card(175, "Evelyn", CardType.ULTRA),
                Card(176, "Ingo & Emmet", CardType.ULTRA),
                Card(177, "Jasmine", CardType.ULTRA),
                Card(178, "Morgan", CardType.ULTRA),
                Card(179, "Nanu", CardType.ULTRA),
                Card(180, "Nita", CardType.ULTRA),
                Card(181, "Sabrina's Suggestion", CardType.ULTRA),
                Card(182, "Celebi & Venusaur-GX", CardType.RAINBOW),
                Card(183, "Magikarp & Wailord-GX", CardType.RAINBOW),
                Card(184, "Pikachu & Zekrom-GX", CardType.RAINBOW),
                Card(185, "Ampharos-GX", CardType.RAINBOW),
                Card(186, "Gengar & Mimikyu-GX", CardType.RAINBOW),
                Card(187, "Hoopa-GX", CardType.RAINBOW),
                Card(188, "Incineroar-GX", CardType.RAINBOW),
                Card(189, "Cobalion-GX", CardType.RAINBOW),
                Card(190, "Latias & Latios-GX", CardType.RAINBOW),
                Card(191, "Eevee & Snorlax-GX", CardType.RAINBOW),
                Card(192, "Dangerous Drill", CardType.SECRET),
                Card(193, "Electrocharger", CardType.SECRET),
                Card(194, "Judge Whistle", CardType.SECRET),
                Card(195, "Metal Goggles", CardType.SECRET),
                Card(196, "Pokémon Communication", CardType.SECRET)
            ),
            "Team%20Up",
            listOf("jumbo", "promo", "psa", "japanese")
        )

        @JvmStatic
        fun main(args: Array<String>) {
            SeriesCollector().collect(collection)
        }
    }
}
