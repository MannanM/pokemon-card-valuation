package com.mannanlive.ebay.collections.swsh

import com.mannanlive.ebay.collections.Card
import com.mannanlive.ebay.collections.CardType
import com.mannanlive.ebay.collections.SeriesCollection
import com.mannanlive.ebay.collections.SeriesCollector

class SwordShieldVividVoltage {
    companion object {
        val collection = SeriesCollection(
            "SWSH4",
            listOf(
                Card(9, "Celebi", CardType.AMAZING_RARE),
                Card(20, "Orbeetle V", CardType.V),
                Card(21, "Orbeetle VMAX", CardType.VMAX),
                Card(22, "Zarude V", CardType.V),
                Card(23, "Charmander", CardType.NORMAL),
                Card(24, "Charmeleon", CardType.NORMAL),
                Card(25, "Charizard", CardType.NORMAL),
                Card(29, "Talonflame V", CardType.V),
                Card(36, "Galarian Darmanitan V", CardType.V),
                Card(37, "Galarian Darmanitan VMAX", CardType.VMAX),
                Card(43, "Pikachu V", CardType.V),
                Card(44, "Pikachu VMAX", CardType.VMAX),
                Card(49, "Ampharos V", CardType.V),
                Card(50, "Raikou", CardType.AMAZING_RARE),
                Card(82, "Zacian", CardType.AMAZING_RARE),
                Card(98, "Coalossal V", CardType.V),
                Card(99, "Coalossal VMAX", CardType.VMAX),
                Card(102, "Zamazenta", CardType.AMAZING_RARE),
                Card(106, "Drapion V", CardType.V),
                Card(115, "Steelix V", CardType.V),
                Card(119, "Jirachi", CardType.AMAZING_RARE),
                Card(126, "Aegislash V", CardType.V),
                Card(127, "Aegislash VMAX", CardType.VMAX),
                Card(138, "Rayquaza", CardType.AMAZING_RARE),
                Card(140, "Togekiss V", CardType.V),
                Card(141, "Togekiss VMAX", CardType.VMAX),
                Card(166, "Orbeetle V", CardType.FULL_ART),
                Card(167, "Zarude V", CardType.FULL_ART),
                Card(168, "Talonflame V", CardType.FULL_ART),
                Card(169, "Galarian Darmanitan V", CardType.FULL_ART),
                Card(170, "Pikachu V", CardType.FULL_ART),
                Card(171, "Ampharos V", CardType.FULL_ART),
                Card(172, "Alakazam V", CardType.FULL_ART),
                Card(173, "Coalossal V", CardType.FULL_ART),
                Card(174, "Galarian Sirfetch'd V", CardType.FULL_ART),
                Card(175, "Drapion V", CardType.FULL_ART),
                Card(176, "Steelix V", CardType.FULL_ART),
                Card(177, "Aegislash V", CardType.FULL_ART),
                Card(178, "Togekiss V", CardType.FULL_ART),
                Card(179, "Allister", CardType.FULL_ART),
                Card(180, "Bea", CardType.FULL_ART),
                Card(181, "Beauty", CardType.FULL_ART),
                Card(182, "Leon", CardType.FULL_ART),
                Card(183, "Nessa", CardType.FULL_ART),
                Card(184, "Opal", CardType.FULL_ART),
                Card(185, "Pokémon Center Lady", CardType.FULL_ART),
                Card(186, "Orbeetle VMAX", CardType.HYPER_RARE),
                Card(187, "Galarian Darmanitan VMAX", CardType.HYPER_RARE),
                Card(188, "Pikachu VMAX", CardType.HYPER_RARE),
                Card(189, "Coalossal VMAX", CardType.HYPER_RARE),
                Card(190, "Aegislash VMAX", CardType.HYPER_RARE),
                Card(191, "Togekiss VMAX", CardType.HYPER_RARE),
                Card(192, "Allister", CardType.HYPER_RARE),
                Card(193, "Bea", CardType.HYPER_RARE),
                Card(194, "Beauty", CardType.HYPER_RARE),
                Card(195, "Leon", CardType.HYPER_RARE),
                Card(196, "Nessa", CardType.HYPER_RARE),
                Card(197, "Opal", CardType.HYPER_RARE),
                Card(198, "Galarian Obstagoon", CardType.SECRET_RARE),
                Card(199, "Oranguru", CardType.SECRET_RARE),
                Card(200, "Cape of Toughness", CardType.SECRET_RARE),
                Card(201, "Hero's Medal", CardType.SECRET_RARE),
                Card(202, "Memory Capsule", CardType.SECRET_RARE),
                Card(203, "Telescopic Sight", CardType.SECRET_RARE)
            ),
            "vivid",
            listOf("digital", "darkness", "rebel", "jumbo", "promo")
        )

        @JvmStatic
        fun main(args: Array<String>) = SeriesCollector().collect(collection)
    }
}
