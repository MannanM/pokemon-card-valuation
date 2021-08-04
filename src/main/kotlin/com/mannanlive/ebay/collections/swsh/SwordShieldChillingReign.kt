package com.mannanlive.ebay.collections.swsh
    
import com.mannanlive.ebay.collections.Card
import com.mannanlive.ebay.collections.CardType
import com.mannanlive.ebay.collections.SeriesCollection
import com.mannanlive.ebay.collections.SeriesCollector

class SwordShieldChillingReign {
    companion object {
        val collection = SeriesCollection(
            "SWSH6",
            listOf(
                Card(7, "Celebi V", CardType.V),
                Card(8, "Celebi VMAX", CardType.VMAX),
                Card(20, "Blaziken V", CardType.V),
                Card(21, "Blaziken VMAX", CardType.VMAX),
                Card(25, "Volcanion V", CardType.V),
                Card(45, "Ice Rider Calyrex V", CardType.V),
                Card(46, "Ice Rider Calyrex VMAX", CardType.VMAX),
                Card(53, "Zeraora V", CardType.V),
                Card(58, "Galarian Articuno V", CardType.V),
                Card(74, "Shadow Rider Calyrex V", CardType.V),
                Card(75, "Shadow Rider Calyrex VMAX", CardType.VMAX),
                Card(80, "Galarian Zapdos V", CardType.V),
                Card(89, "Sandaconda V", CardType.V),
                Card(90, "Sandaconda VMAX", CardType.VMAX),
                Card(97, "Galarian Moltres V", CardType.V),
                Card(99, "Galarian Slowking V", CardType.V),
                Card(100, "Galarian Slowking VMAX", CardType.VMAX),
                Card(104, "Liepard V", CardType.V),
                Card(112, "Metagross V", CardType.V),
                Card(113, "Metagross VMAX", CardType.VMAX),
                Card(119, "Blissey V", CardType.V),
                Card(124, "Tornadus V", CardType.V),
                Card(125, "Tornadus VMAX", CardType.VMAX),
                Card(160, "Celebi V", CardType.V),
                Card(161, "Blaziken V", CardType.V),
                Card(162, "Volcanion V", CardType.V),
                Card(163, "Ice Rider Calyrex V", CardType.V),
                Card(164, "Ice Rider Calyrex V", CardType.V),
                Card(165, "Zeraora V", CardType.V),
                Card(166, "Zeraora V", CardType.V),
                Card(167, "Galarian Rapidash V", CardType.V),
                Card(168, "Galarian Rapidash V", CardType.V),
                Card(169, "Galarian Articuno V", CardType.V),
                Card(170, "Galarian Articuno V", CardType.V),
                Card(171, "Shadow Rider Calyrex V", CardType.V),
                Card(172, "Shadow Rider Calyrex V", CardType.V),
                Card(173, "Galarian Zapdos V", CardType.V),
                Card(174, "Galarian Zapdos V", CardType.V),
                Card(175, "Sandaconda V", CardType.V),
                Card(176, "Galarian Moltres V", CardType.V),
                Card(177, "Galarian Moltres V", CardType.V),
                Card(178, "Galarian Slowking V", CardType.V),
                Card(179, "Galarian Slowking V", CardType.V),
                Card(180, "Liepard V", CardType.V),
                Card(181, "Metagross V", CardType.V),
                Card(182, "Blissey V", CardType.V),
                Card(183, "Blissey V", CardType.V),
                Card(184, "Tornadus V", CardType.V),
                Card(185, "Tornadus V", CardType.V),
                Card(186, "Agatha", CardType.ULTRA),
                Card(187, "Avery", CardType.ULTRA),
                Card(188, "Brawly", CardType.ULTRA),
                Card(189, "Caitlin", CardType.ULTRA),
                Card(190, "Doctor", CardType.ULTRA),
                Card(191, "Flannery", CardType.ULTRA),
                Card(192, "Honey", CardType.ULTRA),
                Card(193, "Karen's Conviction", CardType.ULTRA),
                Card(194, "Klara", CardType.ULTRA),
                Card(195, "Melony", CardType.ULTRA),
                Card(196, "Peonia", CardType.ULTRA),
                Card(197, "Peony", CardType.ULTRA),
                Card(198, "Siebold", CardType.ULTRA),
                Card(199, "Celebi VMAX", CardType.RAINBOW),
                Card(200, "Blaziken VMAX", CardType.RAINBOW),
                Card(201, "Blaziken VMAX", CardType.RAINBOW),
                Card(202, "Ice Rider Calyrex VMAX", CardType.RAINBOW),
                Card(203, "Ice Rider Calyrex VMAX", CardType.RAINBOW),
                Card(204, "Shadow Rider Calyrex VMAX", CardType.RAINBOW),
                Card(205, "Shadow Rider Calyrex VMAX", CardType.RAINBOW),
                Card(206, "Sandaconda VMAX", CardType.RAINBOW),
                Card(207, "Galarian Slowking VMAX", CardType.RAINBOW),
                Card(208, "Metagross VMAX", CardType.RAINBOW),
                Card(209, "Tornadus VMAX", CardType.RAINBOW),
                Card(210, "Agatha", CardType.RAINBOW),
                Card(211, "Avery", CardType.RAINBOW),
                Card(212, "Brawly", CardType.RAINBOW),
                Card(213, "Caitlin", CardType.RAINBOW),
                Card(214, "Doctor", CardType.RAINBOW),
                Card(215, "Flannery", CardType.RAINBOW),
                Card(216, "Karen's Conviction", CardType.RAINBOW),
                Card(217, "Klara", CardType.RAINBOW),
                Card(218, "Melony", CardType.RAINBOW),
                Card(219, "Peonia", CardType.RAINBOW),
                Card(220, "Peony", CardType.RAINBOW),
                Card(221, "Siebold", CardType.RAINBOW),
                Card(222, "Electrode", CardType.SECRET),
                Card(223, "Bronzong", CardType.SECRET),
                Card(224, "Snorlax", CardType.SECRET),
                Card(225, "Echoing Horn", CardType.SECRET),
                Card(226, "Fan of Waves", CardType.SECRET),
                Card(227, "Fog Crystal", CardType.SECRET),
                Card(228, "Rugged Helmet", CardType.SECRET),
                Card(229, "Urn of Vitality", CardType.SECRET),
                Card(230, "Welcoming Lantern", CardType.SECRET),
                Card(231, "Water Energy", CardType.SECRET),
                Card(232, "Psychic Energy", CardType.SECRET),
                Card(233, "Fighting Energy", CardType.SECRET)
            ),
            "Chilling%20Reign",
            listOf("jumbo", "promo", "psa", "japanese")
        )

        @JvmStatic
        fun main(args: Array<String>) {
            SeriesCollector().collect(collection)
        }
    }
}
