package com.mannanlive.ebay.collections.sm
    
import com.mannanlive.ebay.collections.Card
import com.mannanlive.ebay.collections.CardType
import com.mannanlive.ebay.collections.SeriesCollection
import com.mannanlive.ebay.collections.SeriesCollector

class SunMoonUnifiedMinds {
    companion object {
        val collection = SeriesCollection(
            "SM11",
            listOf(
                Card(1, "Rowlet & Alolan Exeggutor-GX", CardType.GX),
                Card(25, "Heatran-GX", CardType.GX),
                Card(35, "Slowpoke & Psyduck-GX", CardType.GX),
                Card(47, "Keldeo-GX", CardType.GX),
                Card(54, "Raichu & Alolan Raichu-GX", CardType.GX),
                Card(71, "Mewtwo & Mew-GX", CardType.GX),
                Card(72, "Espeon & Deoxys-GX", CardType.GX),
                Card(78, "Latios-GX", CardType.GX),
                Card(79, "Jirachi-GX", CardType.ULTRA),
                Card(106, "Aerodactyl-GX", CardType.GX),
                Card(125, "Umbreon & Darkrai-GX", CardType.GX),
                Card(126, "Mega Sableye & Tyranitar-GX", CardType.GX),
                Card(132, "Weavile-GX", CardType.GX),
                Card(141, "Mawile-GX", CardType.GX),
                Card(146, "Garchomp & Giratina-GX", CardType.GX),
                Card(152, "Dragonite-GX", CardType.GX),
                Card(160, "Naganadel-GX", CardType.GX),
                Card(214, "Rowlet & Alolan Exeggutor-GX", CardType.ULTRA),
                Card(215, "Rowlet & Alolan Exeggutor-GX", CardType.ULTRA),
                Card(216, "Heatran-GX", CardType.ULTRA),
                Card(217, "Slowpoke & Psyduck-GX", CardType.ULTRA),
                Card(218, "Slowpoke & Psyduck-GX", CardType.ULTRA),
                Card(219, "Keldeo-GX", CardType.ULTRA),
                Card(220, "Raichu & Alolan Raichu-GX", CardType.ULTRA),
                Card(221, "Raichu & Alolan Raichu-GX", CardType.ULTRA),
                Card(222, "Mewtwo & Mew-GX", CardType.ULTRA),
                Card(223, "Latios-GX", CardType.ULTRA),
                Card(224, "Aerodactyl-GX", CardType.ULTRA),
                Card(225, "Mega Sableye & Tyranitar-GX", CardType.ULTRA),
                Card(226, "Mega Sableye & Tyranitar-GX", CardType.ULTRA),
                Card(227, "Mawile-GX", CardType.ULTRA),
                Card(228, "Garchomp & Giratina-GX", CardType.ULTRA),
                Card(229, "Dragonite-GX", CardType.ULTRA),
                Card(230, "Naganadel-GX", CardType.ULTRA),
                Card(231, "Blue's Tactics", CardType.ULTRA),
                Card(232, "Channeler", CardType.ULTRA),
                Card(233, "Coach Trainer", CardType.ULTRA),
                Card(234, "Grimsley", CardType.ULTRA),
                Card(235, "Misty's Favor", CardType.ULTRA),
                Card(236, "Poké Maniac", CardType.ULTRA, "(Poké,Poke) Maniac"),
                Card(237, "Rowlet & Alolan Exeggutor-GX", CardType.RAINBOW),
                Card(238, "Heatran-GX", CardType.RAINBOW),
                Card(239, "Slowpoke & Psyduck-GX", CardType.RAINBOW),
                Card(240, "Keldeo-GX", CardType.RAINBOW),
                Card(241, "Raichu & Alolan Raichu-GX", CardType.RAINBOW),
                Card(242, "Mewtwo & Mew-GX", CardType.RAINBOW),
                Card(243, "Latios-GX", CardType.RAINBOW),
                Card(244, "Aerodactyl-GX", CardType.RAINBOW),
                Card(245, "Mega Sableye & Tyranitar-GX", CardType.RAINBOW),
                Card(246, "Mawile-GX", CardType.RAINBOW),
                Card(247, "Garchomp & Giratina-GX", CardType.RAINBOW),
                Card(248, "Dragonite-GX", CardType.RAINBOW)
            ),
            "Unified%20Minds",
            listOf("jumbo", "promo","japanese")
        )

        @JvmStatic
        fun main(args: Array<String>) {
            SeriesCollector().collect(collection)
        }
    }
}
