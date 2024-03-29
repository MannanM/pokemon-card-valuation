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
                Card(20, "Orbeetle V", CardType.V, ignoreTrades = listOf(
                    // multiple items
                    393180774797
                )),
                Card(21, "Orbeetle VMAX", CardType.VMAX, ignoreTrades = listOf(
                    // multiple items
                    254893056535,
                    //graded
                    184721515944
                )),
                Card(22, "Zarude V", CardType.V),
                Card(25, "Charizard", CardType.NORMAL, ignoreTrades = listOf(
                    //graded
                    303952633805
                )),
                Card(29, "Talonflame V", CardType.V),
                Card(36, "Galarian Darmanitan V", CardType.V),
                Card(37, "Galarian Darmanitan VMAX", CardType.VMAX),
                Card(43, "Pikachu V", CardType.V),
                Card(44, "Pikachu VMAX", CardType.VMAX, ignoreTrades = listOf(
                    // multiple items
                    274620768135,
                    393045298350,
                    393052130239,
                    264978173136
                )),
                Card(49, "Ampharos V", CardType.V),
                Card(50, "Raikou", CardType.AMAZING_RARE, ignoreTrades = listOf(
                    // multiple items
                    124538160651
                )),
                Card(82, "Zacian", CardType.AMAZING_RARE, ignoreTrades = listOf(
                    // multiple items
                    124538160651
                )),
                Card(98, "Coalossal V", CardType.V),
                Card(99, "Coalossal VMAX", CardType.VMAX),
                Card(102, "Zamazenta", CardType.AMAZING_RARE),
                Card(106, "Drapion V", CardType.V),
                Card(115, "Steelix V", CardType.V),
                Card(119, "Jirachi", CardType.AMAZING_RARE),
                Card(126, "Aegislash V", CardType.V),
                Card(127, "Aegislash VMAX", CardType.VMAX),
                Card(138, "Rayquaza", CardType.AMAZING_RARE, ignoreTrades = listOf(
                    // multiple items
                    124538160651
                )),
                Card(140, "Togekiss V", CardType.V),
                Card(141, "Togekiss VMAX", CardType.VMAX),
                Card(166, "Orbeetle V", CardType.FULL_ART),
                Card(167, "Zarude V", CardType.FULL_ART),
                Card(168, "Talonflame V", CardType.FULL_ART),
                Card(169, "Galarian Darmanitan V", CardType.FULL_ART),
                Card(170, "Pikachu V", CardType.FULL_ART, ignoreTrades = listOf(
                    //multiple
                    224375525262
                )),
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
                Card(185, "Pokémon Center Lady", CardType.FULL_ART, "(Pokémon,Pokemon) Center Lady", listOf(
                    // graded
                    203314424691
                )),
                Card(186, "Orbeetle VMAX", CardType.HYPER_RARE),
                Card(187, "Galarian Darmanitan VMAX", CardType.HYPER_RARE),
                Card(188, "Pikachu VMAX", CardType.HYPER_RARE, ignoreTrades = listOf(
                    //wrong
                    203230387683,
                    203229879598,
                    174529118680,
                    174527811710,
                    274592993405,
                    274661813105,
                    294110324995,
                    //graded
                    143901962276,
                    133681122022,
                    133737087633
                )),
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
                Card(200, "Cape of Toughness", CardType.SECRET_RARE, ignoreTrades = listOf(
                    // multiple
                    133617274123
                )),
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
