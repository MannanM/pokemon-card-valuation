package com.mannanlive.ebay.collections.sm

import com.mannanlive.ebay.collections.Card
import com.mannanlive.ebay.collections.CardType
import com.mannanlive.ebay.collections.SeriesCollection
import com.mannanlive.ebay.collections.SeriesCollector

class SunMoonGuardiansRisingBase {
    companion object {
        val collection = SeriesCollection(
            "SM2",
            listOf(
                Card(18, "Turtonator-GX", CardType.GX),
                Card(22, "Alolan Ninetales-GX", CardType.GX),
                Card(38, "Wishiwashi-GX", CardType.GX),
                Card(45, "Vikavolt-GX", CardType.GX),
                Card(47, "Tapu Koko-GX", CardType.GX),
                Card(57, "Toxapex-GX", CardType.GX),
                Card(60, "Tapu Lele-GX", CardType.GX),
                Card(60, "Tapu Lele-GX", CardType.GX, suffix = "a"),
                Card(74, "Lycanroc-GX", CardType.GX),
                Card(85, "Metagross-GX", CardType.GX),
                Card(92, "Sylveon-GX", CardType.GX),
                Card(92, "Sylveon-GX", CardType.GX, suffix = "a"),
                Card(100, "Kommo-o-GX", CardType.GX),
                Card(115, "Drampa-GX", CardType.GX),
                Card(131, "Turtonator-GX", CardType.ULTRA),
                Card(132, "Alolan Ninetales-GX", CardType.ULTRA),
                Card(133, "Wishiwashi-GX", CardType.ULTRA),
                Card(134, "Vikavolt-GX", CardType.ULTRA),
                Card(135, "Tapu Koko-GX", CardType.ULTRA),
                Card(136, "Toxapex-GX", CardType.ULTRA),
                Card(137, "Tapu Lele-GX", CardType.ULTRA),
                Card(138, "Lycanroc-GX", CardType.ULTRA),
                Card(139, "Metagross-GX", CardType.ULTRA),
                Card(140, "Sylveon-GX", CardType.ULTRA),
                Card(141, "Kommo-o-GX", CardType.ULTRA),
                Card(142, "Drampa-GX", CardType.ULTRA),
                Card(143, "Hala", CardType.ULTRA),
                Card(144, "Hau", CardType.ULTRA),
                Card(145, "Mallow", CardType.ULTRA),
                Card(146, "Decidueye-GX", CardType.RAINBOW),
                Card(147, "Incineroar-GX", CardType.RAINBOW),
                Card(148, "Turtonator-GX", CardType.RAINBOW),
                Card(149, "Primarina-GX", CardType.RAINBOW),
                Card(150, "Alolan Ninetales-GX", CardType.RAINBOW),
                Card(151, "Wishiwashi-GX", CardType.RAINBOW),
                Card(152, "Vikavolt-GX", CardType.RAINBOW),
                Card(153, "Tapu Koko-GX", CardType.RAINBOW),
                Card(154, "Toxapex-GX", CardType.RAINBOW),
                Card(155, "Tapu Lele-GX", CardType.RAINBOW),
                Card(156, "Lycanroc-GX", CardType.RAINBOW),
                Card(157, "Metagross-GX", CardType.RAINBOW),
                Card(157, "Metagross-GX", CardType.ULTRA, suffix = "a"),
                Card(158, "Sylveon-GX", CardType.RAINBOW),
                Card(159, "Kommo-o-GX", CardType.RAINBOW),
                Card(160, "Drampa-GX", CardType.RAINBOW),
                Card(161, "Aqua Patch", CardType.SECRET),
                Card(162, "Enhanced Hammer", CardType.SECRET),
                Card(163, "Field Blower", CardType.SECRET),
                Card(164, "Max Potion", CardType.SECRET),
                Card(165, "Rare Candy", CardType.SECRET),
                Card(166, "Double Colorless Energy", CardType.SECRET),
                Card(167, "Grass Energy", CardType.SECRET),
                Card(168, "Lightning Energy", CardType.SECRET),
                Card(169, "Fighting Energy", CardType.SECRET)

            ),
            "Guardians%20Rising",
            listOf("jumbo", "promo","japanese")
        )

        @JvmStatic
        fun main(args: Array<String>) {
            SeriesCollector().collect(collection)
        }
    }
}
