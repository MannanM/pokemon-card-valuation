package com.mannanlive.ebay.collections.swsh

import com.mannanlive.ebay.collections.Card
import com.mannanlive.ebay.collections.CardType
import com.mannanlive.ebay.collections.SeriesCollection
import com.mannanlive.ebay.collections.SeriesCollector

class SwordShieldBase {
    companion object {
        val collection = SeriesCollection(
            "SWSH1",
            listOf(
                Card(1, "Celebi V", CardType.V),
                Card(9, "Dhelmise V", CardType.V),
                Card(24, "Torkoal V", CardType.V),
                Card(25, "Victini V", CardType.V),
                Card(49, "Lapras V", CardType.V),
                Card(50, "Lapras VMAX", CardType.VMAX),
                Card(53, "Keldeo V", CardType.V),
                Card(72, "Tapu Koko V", CardType.V),
                Card(79, "Morpeko V", CardType.V),
                Card(80, "Morpeko VMAX", CardType.VMAX),
                Card(86, "Wobbuffet V", CardType.V),
                Card(91, "Indeedee V", CardType.V),
                Card(104, "Regirock V", CardType.V),
                Card(115, "Stonjourner V", CardType.V),
                Card(116, "Stonjourner VMAX", CardType.VMAX),
                Card(120, "Sableye V", CardType.V),
                Card(138, "Zacian V", CardType.V),
                Card(139, "Zamazenta V", CardType.V),
                Card(141, "Snorlax V", CardType.V),
                Card(142, "Snorlax VMAX", CardType.VMAX),
                Card(187, "Dhelmise", CardType.FULL_ART),
                Card(188, "Torkoal", CardType.FULL_ART),
                Card(189, "Lapras", CardType.FULL_ART),
                Card(190, "Morpeko", CardType.FULL_ART),
                Card(191, "Wobbuffet", CardType.FULL_ART),
                Card(192, "Indeedee", CardType.FULL_ART),
                Card(193, "Stonjourner", CardType.FULL_ART),
                Card(194, "Sableye", CardType.FULL_ART),
                Card(195, "Zacian", CardType.FULL_ART),
                Card(196, "Zamazenta", CardType.FULL_ART,
                    ignoreTrades = listOf(
                        //PSA
                        203068188503
                    ),
                    addedTrades = listOf(
                        arrayOf("2020-10-29T10:01", 24.20, 224208917752)
                    )),
                Card(197, "Snorlax", CardType.FULL_ART),
                Card(198, "Cramorant", CardType.FULL_ART),
                Card(199, "Bede", CardType.FULL_ART),
                Card(200, "Marnie", CardType.FULL_ART),
                Card(201, "Professor's Research", CardType.FULL_ART),
                Card(202, "Team Yell Grunt", CardType.FULL_ART),
                Card(203, "Lapras VMAX", CardType.HYPER_RARE),
                Card(204, "Morpeko VMAX", CardType.HYPER_RARE),
                Card(205, "Stonjourner VMAX", CardType.HYPER_RARE),
                Card(206, "Snorlax VMAX", CardType.HYPER_RARE),
                Card(207, "Bede", CardType.HYPER_RARE),
                Card(208, "Marnie", CardType.HYPER_RARE),
                Card(209, "Professor's Research", CardType.HYPER_RARE),
                Card(210, "Team Yell Grunt", CardType.HYPER_RARE),
                Card(211, "Zacian V", CardType.SECRET_RARE),
                Card(212, "Zamazenta V", CardType.SECRET_RARE, ignoreTrades = listOf(
                    //wrongly identified
                    224208917752
                )),
                Card(213, "Air Balloon", CardType.SECRET_RARE),
                Card(214, "Metal Saucer", CardType.SECRET_RARE),
                Card(215, "Ordinary Rod", CardType.SECRET_RARE),
                Card(216, "Quick Ball", CardType.SECRET_RARE)
            ),
            "sword",
            listOf("digital", "rebel", "darkness", "vivid", "jumbo", "promo")
        )

        @JvmStatic
        fun main(args: Array<String>) {
            SeriesCollector().collect(collection)
        }
    }
}
