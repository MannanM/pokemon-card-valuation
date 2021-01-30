package com.mannanlive.ebay.collections.base

import com.mannanlive.ebay.collections.Card
import com.mannanlive.ebay.collections.CardType
import com.mannanlive.ebay.collections.SeriesCollection
import com.mannanlive.ebay.collections.SeriesCollector

class BaseSetJungle {
    companion object {
        private val bigThree = listOf(
            303800980257,
            254809611563
        )
        val collection = SeriesCollection(
            "JU",
            listOf(
                Card(1, "Clefable", CardType.NORMAL),
                Card(2, "Electrode", CardType.NORMAL),
                Card(3, "Flareon", CardType.NORMAL, ignoreTrades = bigThree + listOf(
                    //misprints
                    313237961566,
                    373249874286
                )),
                Card(4, "Jolteon", CardType.NORMAL, ignoreTrades = bigThree),
                Card(5, "Kangaskhan", CardType.NORMAL),
                Card(6, "Mr. Mime", CardType.NORMAL),
                Card(7, "Nidoqueen", CardType.NORMAL),
                Card(8, "Pidgeot", CardType.NORMAL),
                Card(9, "Pinsir", CardType.NORMAL),
                Card(10, "Scyther", CardType.NORMAL),
                Card(11, "Snorlax", CardType.NORMAL),
                Card(12, "Vaporeon", CardType.NORMAL, ignoreTrades = bigThree + listOf(
                    //first edition
                    164471952108
                )),
                Card(13, "Venomoth", CardType.NORMAL),
                Card(14, "Victreebel", CardType.NORMAL),
                Card(15, "Vileplume", CardType.NORMAL),
                Card(16, "Wigglytuff", CardType.NORMAL),
                Card(17, "Clefable", CardType.NORMAL),
                Card(18, "Electrode", CardType.NORMAL),
                Card(19, "Flareon", CardType.NORMAL),
                Card(20, "Jolteon", CardType.NORMAL),
                Card(21, "Kangaskhan", CardType.NORMAL),
                Card(22, "Mr. Mime", CardType.NORMAL),
                Card(23, "Nidoqueen", CardType.NORMAL),
                Card(24, "Pidgeot", CardType.NORMAL),
                Card(25, "Pinsir", CardType.NORMAL),
                Card(26, "Scyther", CardType.NORMAL),
                Card(27, "Snorlax", CardType.NORMAL),
                Card(28, "Vaporeon", CardType.NORMAL),
                Card(29, "Venomoth", CardType.NORMAL),
                Card(30, "Victreebel", CardType.NORMAL),
                Card(31, "Vileplume", CardType.NORMAL),
                Card(32, "Wigglytuff", CardType.NORMAL),
                Card(33, "Butterfree", CardType.NORMAL, ignoreTrades = listOf(
                    //1st edition
                    184585227490,
                    274626364983,
                    265017030843
                )),
                Card(34, "Dodrio", CardType.NORMAL, ignoreTrades = listOf(
                    //1st edition
                    284044170445,
                    184585228314,
                    274626364128
                )),
                Card(35, "Exeggutor", CardType.NORMAL, ignoreTrades = listOf(
                    //1st edition
                    184585209805,
                    274626363465,
                    184595650730,
                    402630702679,
                    284044163314,
                    265017028646
                )),
                Card(36, "Fearow", CardType.NORMAL, ignoreTrades = listOf(
                    //1st edition
                    284105581861,
                    184585229937,
                    233841099793
                )),
                Card(37, "Gloom", CardType.NORMAL, ignoreTrades = listOf(
                    //1st edition
                    184585225620,
                    184595651966,
                    274261305201,
                    274626361391,
                    164484203791
                )),
                Card(38, "Lickitung", CardType.NORMAL, ignoreTrades = listOf(
                    //1st edition
                    184585216565,
                    283779081754,
                    184595651855,
                    124505353144,
                    274626360152
                )),
                Card(39, "Marowak", CardType.NORMAL, ignoreTrades = listOf(
                    //1st edition
                    184585212088,
                    184595651471,
                    402630691394,
                    293952926940,
                    274626358978,
                    333808519914
                )),
                Card(40, "Nidorina", CardType.NORMAL, ignoreTrades = listOf(
                    //1st edition
                    184585219980,
                    184566935093,
                    184595652364,
                    393018901062,
                    284044169063
                )),
                Card(41, "Parasect", CardType.NORMAL, ignoreTrades = listOf(
                    //1st edition
                    184585222737,
                    402630683062,
                    274626355095,
                    184595652118,
                    284044104746,
                    284062789097
                )),
                Card(42, "Persian", CardType.NORMAL, ignoreTrades = listOf(
                    //1st edition
                    184585206215,
                    184595650371,
                    184566974841,
                    402630688173,
                    264914467002
                )),
                Card(43, "Primeape", CardType.NORMAL, ignoreTrades = listOf(
                    //1st edition
                    284044101992,
                    203232688263,
                    274626352856,
                    274626352856,
                    284044101992,
                    324358967564,
                    284062800363,
                    324346544147,
                    333764605228
                )),
                Card(44, "Rapidash", CardType.NORMAL, ignoreTrades = listOf(
                    //1st edition
                    184585204922,
                    184595652757,
                    274626351292,
                    284044166586,
                    284062796775
                )),
                Card(45, "Rhydon", CardType.NORMAL, ignoreTrades = listOf(
                    //1st edition
                    174599443156,
                    402630706997,
                    274626350343,
                    184595649360,
                    124490595381,
                    184585241478,
                    284044173245,
                    363207142040,
                    284062787379,
                    303771724823,
                    333764606595
                )),
                Card(46, "Seaking", CardType.NORMAL, ignoreTrades = listOf(
                    //1st edition
                    184585200579,
                    184566948623,
                    184595652572,
                    363207860420,
                    174484531095
                )),
                Card(47, "Tauros", CardType.NORMAL, ignoreTrades = listOf(
                    //1st edition
                    303748133690,
                    184585214204,
                    154245245394,
                    274626348499,
                    184595651670,
                    154245245394,
                    303761721352,
                    333780996833,
                    284044161243,
                    283779081780
                )),
                Card(48, "Weepinbell", CardType.NORMAL, ignoreTrades = listOf(
                    //1st edition
                    363204169047,
                    164542363622,
                    274626347713,
                    224299875480,
                    184595649647,
                    184585238443
                )),
                Card(49, "Bellsprout", CardType.NORMAL),
                Card(50, "Cubone", CardType.NORMAL),
                Card(51, "Eevee", CardType.NORMAL),
                Card(52, "Exeggcute", CardType.NORMAL),
                Card(53, "Goldeen", CardType.NORMAL),
                Card(54, "Jigglypuff", CardType.NORMAL),
                Card(55, "Mankey", CardType.NORMAL),
                Card(56, "Meowth", CardType.NORMAL),
                Card(57, "Nidoran F", CardType.NORMAL),
                Card(58, "Oddish", CardType.NORMAL),
                Card(59, "Paras", CardType.NORMAL),
                Card(60, "Pikachu", CardType.NORMAL),
                Card(61, "Rhyhorn", CardType.NORMAL),
                Card(62, "Spearow", CardType.NORMAL),
                Card(63, "Venonat", CardType.NORMAL),
                Card(64, "Poke Ball", CardType.NORMAL)
            ),
            "jungle",
            listOf("shadowless", "first", "psa", "bgs", "1st")
        )

        @JvmStatic
        fun main(args: Array<String>) = SeriesCollector().collect(collection)
    }
}
