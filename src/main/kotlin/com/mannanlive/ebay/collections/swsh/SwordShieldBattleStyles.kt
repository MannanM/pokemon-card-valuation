package com.mannanlive.ebay.collections.swsh
    
import com.mannanlive.ebay.collections.Card
import com.mannanlive.ebay.collections.CardType
import com.mannanlive.ebay.collections.SeriesCollection
import com.mannanlive.ebay.collections.SeriesCollector

class SwordShieldBattleStyles {
    companion object {
        val collection = SeriesCollection(
            "SWSH5",
            listOf(
                Card(6, "Kricketune V", CardType.V),
                Card(18, "Flapple V", CardType.V),
                Card(19, "Flapple VMAX", CardType.VMAX),
                Card(21, "Victini V", CardType.V),
                Card(22, "Victini VMAX", CardType.VMAX),
                Card(40, "Empoleon V", CardType.V),
                Card(50, "Tapu Koko V", CardType.V),
                Card(51, "Tapu Koko VMAX", CardType.VMAX),
                Card(62, "Mimikyu V", CardType.V),
                Card(63, "Necrozma V", CardType.V),
                Card(85, "Single Strike Urshifu V", CardType.V),
                Card(86, "Single Strike Urshifu VMAX", CardType.VMAX),
                Card(87, "Rapid Strike Urshifu V", CardType.V),
                Card(88, "Rapid Strike Urshifu VMAX", CardType.VMAX),
                Card(97, "Tyranitar V", CardType.V),
                Card(109, "Corviknight V", CardType.V),
                Card(110, "Corviknight VMAX", CardType.VMAX),
                Card(117, "Stoutland V", CardType.V),
                Card(142, "Kricketune V", CardType.V),
                Card(143, "Flapple V", CardType.V),
                Card(144, "Victini V", CardType.V),
                Card(145, "Empoleon V", CardType.V),
                Card(146, "Empoleon V", CardType.V),
                Card(147, "Tapu Koko V", CardType.V),
                Card(148, "Mimikyu V", CardType.V),
                Card(149, "Necrozma V", CardType.V),
                Card(150, "Single Strike Urshifu V", CardType.V),
                Card(151, "Single Strike Urshifu V", CardType.V),
                Card(152, "Rapid Strike Urshifu V", CardType.V),
                Card(153, "Rapid Strike Urshifu V", CardType.V),
                Card(154, "Tyranitar V", CardType.V),
                Card(155, "Tyranitar V", CardType.V),
                Card(156, "Corviknight V", CardType.V),
                Card(157, "Stoutland V", CardType.V),
                Card(158, "Bruno", CardType.ULTRA),
                Card(159, "Cheryl", CardType.ULTRA),
                Card(160, "Korrina's Focus", CardType.ULTRA),
                Card(161, "Phoebe", CardType.ULTRA),
                Card(162, "Rapid Strike Style Mustard", CardType.ULTRA),
                Card(163, "Single Strike Style Mustard", CardType.ULTRA),
                Card(168, "Single Strike Urshifu VMAX", CardType.RAINBOW),
                Card(170, "Rapid Strike Urshifu VMAX", CardType.RAINBOW),
                Card(164, "Flapple VMAX", CardType.RAINBOW),
                Card(165, "Victini VMAX", CardType.RAINBOW),
                Card(166, "Tapu Koko VMAX", CardType.RAINBOW),
                Card(167, "Single Strike Urshifu VMAX", CardType.RAINBOW),
                Card(169, "Rapid Strike Urshifu VMAX", CardType.RAINBOW),
                Card(171, "Corviknight VMAX", CardType.RAINBOW),
                Card(172, "Bruno", CardType.RAINBOW),
                Card(173, "Cheryl", CardType.RAINBOW),
                Card(174, "Korrina's Focus", CardType.RAINBOW),
                Card(175, "Phoebe", CardType.RAINBOW),
                Card(176, "Rapid Strike Style Mustard", CardType.RAINBOW),
                Card(177, "Single Strike Style Mustard", CardType.RAINBOW),
                Card(178, "Octillery", CardType.SECRET),
                Card(179, "Houndoom", CardType.SECRET),
                Card(180, "Exp. Share", CardType.SECRET),
                Card(181, "Level Ball", CardType.SECRET),
                Card(182, "Rapid Strike Energy", CardType.SECRET),
                Card(183, "Single Strike Energy", CardType.SECRET)
            ),
            "Battle%20Styles",
            listOf("jumbo", "promo", "psa", "japanese")
        )

        @JvmStatic
        fun main(args: Array<String>) {
            SeriesCollector().collect(collection)
        }
    }
}
