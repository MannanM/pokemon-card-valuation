package com.mannanlive.ebay.collections.base

import com.mannanlive.ebay.collections.Card
import com.mannanlive.ebay.collections.CardType
import com.mannanlive.ebay.collections.SeriesCollection
import com.mannanlive.ebay.collections.SeriesCollector

class BaseSetBaseSet {
    companion object {
        private val bigThree = listOf(
            283967758263,
            392983175832,
            124380401348,
            392915613748,
            392938545676,
            233779816758,
            224314245620,
            284139122777,
            224300282619,
            154222901038,
            //complete sets
            254779861279,
            //inauthentic
            274480853756
        )
        private val littleThree = listOf(
            //multiple
            284057334229,
            264907412987,
            264902285207,
            284075412995,
            284065109122,
            174514224190
        )
        val BaseSetCards = listOf(
            Card(1, "Alakazam", CardType.NORMAL),
            Card(2, "Blastoise", CardType.NORMAL, ignoreTrades = bigThree + listOf(
                //inauthentic
                274422702526,
                224204274106,
                184490368737,
                //base set 2
                124393194743,
                363166716347,
                //multiple
                353268439825
            )),
            Card(3, "Chansey", CardType.NORMAL, ignoreTrades = listOf(
                //multiple
                392927847093
            )),
            Card(4, "Charizard", CardType.NORMAL, ignoreTrades = bigThree + listOf(
                //inauthentic / wrong
                114204687513,
                303608704493,
                143679036065,
                293641892973,
                //already graded
                164349921385,
                164368549629,
                284057612162,
                //base set 2
                383764648334,
                363166716347,
                //damaged
                164405902888,
                //multiple
                353268439825
            )),
            Card(5, "Clefairy", CardType.NORMAL),
            Card(6, "Gyarados", CardType.NORMAL, ignoreTrades = listOf(
                //multiple
                184487354952,
                333612561903
            )),
            Card(7, "Hitmonchan", CardType.NORMAL),
            Card(8, "Machamp", CardType.NORMAL, ignoreTrades = listOf(
                //multiple
                333612561903
            )),
            Card(9, "Magneton", CardType.NORMAL, ignoreTrades = listOf(
                //multiple
                392919257498
            )),
            Card(10, "Mewtwo", CardType.NORMAL, ignoreTrades = listOf(
                //first edition + german
                184520269942
            )),
            Card(11, "Nidoking", CardType.NORMAL, ignoreTrades = listOf(
                //multiple
                392919257498
            )),
            Card(12, "Ninetales", CardType.NORMAL, ignoreTrades = listOf(
                //multiple
                333612561903,
                392927847093
            )),
            Card(13, "Poliwrath", CardType.NORMAL, ignoreTrades = listOf(
                //multiple
                392927847093,
                392919257498,
                //other language
                274635778251
            )),
            Card(14, "Raichu", CardType.NORMAL),
            Card(15, "Venusaur", CardType.NORMAL, ignoreTrades = bigThree + listOf(
                //inauthentic
                283942514978,
                //multiple
                264836588577
            )),
            Card(16, "Zapdos", CardType.NORMAL, ignoreTrades = listOf(
                //multiple
                333612561903,
                392927847093,
                392919257498
            )),
            Card(17, "Beedrill", CardType.NORMAL),
            Card(18, "Dragonair", CardType.NORMAL),
            Card(19, "Dugtrio", CardType.NORMAL),
            Card(20, "Electabuzz", CardType.NORMAL),
            Card(21, "Electrode", CardType.NORMAL),
            Card(22, "Pidgeotto", CardType.NORMAL),
            Card(23, "Arcanine", CardType.NORMAL),
            Card(24, "Charmeleon", CardType.NORMAL, ignoreTrades = listOf(
                //multiple
                264836611565,
                324326110675,
                174503618729
            )),
            Card(25, "Dewgong", CardType.NORMAL),
            Card(26, "Dratini", CardType.NORMAL),
            Card(27, "Farfetch'd", CardType.NORMAL),
            Card(28, "Growlithe", CardType.NORMAL),
            Card(29, "Haunter", CardType.NORMAL),
            Card(30, "Ivysaur", CardType.NORMAL, ignoreTrades = listOf(
                //multiple
                264836588577
            )),
            Card(31, "Jynx", CardType.NORMAL),
            Card(32, "Kadabra", CardType.NORMAL),
            Card(33, "Kakuna", CardType.NORMAL),
            Card(34, "Machoke", CardType.NORMAL),
            Card(35, "Magikarp", CardType.NORMAL),
            Card(36, "Magmar", CardType.NORMAL),
            Card(37, "Nidorino", CardType.NORMAL),
            Card(38, "Poliwhirl", CardType.NORMAL),
            Card(39, "Porygon", CardType.NORMAL),
            Card(40, "Raticate", CardType.NORMAL),
            Card(41, "Seel", CardType.NORMAL),
            Card(42, "Wartortle", CardType.NORMAL),
            Card(43, "Abra", CardType.NORMAL),
            Card(44, "Bulbasaur", CardType.NORMAL, ignoreTrades = littleThree + listOf(
                //multiple
                264836588577
            )),
            Card(45, "Caterpie", CardType.NORMAL),
            Card(46, "Charmander", CardType.NORMAL, ignoreTrades = littleThree + listOf(
                264836611565,
                174503618729
            )),
            Card(47, "Diglett", CardType.NORMAL),
            Card(48, "Doduo", CardType.NORMAL),
            Card(49, "Drowzee", CardType.NORMAL),
            Card(50, "Gastly", CardType.NORMAL),
            Card(51, "Koffing", CardType.NORMAL),
            Card(52, "Machop", CardType.NORMAL),
            Card(53, "Magnemite", CardType.NORMAL),
            Card(54, "Metapod", CardType.NORMAL),
            Card(55, "Nidoran M", CardType.NORMAL),
            Card(56, "Onix", CardType.NORMAL, ignoreTrades = listOf(
                //first edition
                393005719963,
                224196176028
            )),
            Card(57, "Pidgey", CardType.NORMAL),
            Card(58, "Pikachu", CardType.NORMAL),
            Card(59, "Poliwag", CardType.NORMAL),
            Card(60, "Ponyta", CardType.NORMAL),
            Card(61, "Rattata", CardType.NORMAL),
            Card(62, "Sandshrew", CardType.NORMAL),
            Card(63, "Squirtle", CardType.NORMAL, ignoreTrades = littleThree + listOf()),
            Card(64, "Starmie", CardType.NORMAL),
            Card(65, "Staryu", CardType.NORMAL),
            Card(66, "Tangela", CardType.NORMAL),
            Card(67, "Voltorb", CardType.NORMAL),
            Card(68, "Vulpix", CardType.NORMAL),
            Card(69, "Weedle", CardType.NORMAL),
            Card(70, "Clefairy Doll", CardType.NORMAL),
            Card(71, "Computer Search", CardType.NORMAL, ignoreTrades = listOf(
                // Multiple
                274588538772
            )),
            Card(72, "Devolution Spray", CardType.NORMAL),
            Card(73, "Imposter Professor Oak", CardType.NORMAL),
            Card(74, "Item Finder", CardType.NORMAL),
            Card(75, "Lass", CardType.NORMAL),
            Card(76, "Pokemon Breeder", CardType.NORMAL, ignoreTrades = listOf(
                // Multiple
                274588538772
            )),
            Card(77, "Pokemon Trader", CardType.NORMAL, ignoreTrades = listOf(
                //multiple
                254760740118
            )),
            Card(78, "Scoop Up", CardType.NORMAL),
            Card(79, "Super Energy Removal", CardType.NORMAL, ignoreTrades = listOf(
                // Multiple
                274588538772
            )),
            Card(80, "Defender", CardType.NORMAL),
            Card(81, "Energy Retrieval", CardType.NORMAL),
            Card(82, "Full Heal", CardType.NORMAL),
            Card(83, "Maintenance", CardType.NORMAL),
            Card(84, "PlusPower", CardType.NORMAL),
            Card(85, "Pokemon Center", CardType.NORMAL),
            Card(86, "Pokemon Flute", CardType.NORMAL),
            Card(87, "Pokedex", CardType.NORMAL),
            Card(88, "Professor Oak", CardType.NORMAL),
            Card(89, "Revive", CardType.NORMAL),
            Card(90, "Super Potion", CardType.NORMAL),
            Card(91, "Bill", CardType.NORMAL),
            Card(92, "Energy Removal", CardType.NORMAL),
            Card(93, "Gust of Wind", CardType.NORMAL, ignoreTrades = listOf(
                //multiple
                254760740118
            )),
            Card(94, "Potion", CardType.NORMAL),
            Card(95, "Switch", CardType.NORMAL),
            Card(96, "Double Colorless Energy", CardType.NORMAL)
        )
        val collection = SeriesCollection(
            "BS",
            BaseSetCards,
            "base",
            listOf("shadowless", "first", "1st", "german")
        )

        @JvmStatic
        fun main(args: Array<String>) = SeriesCollector().collect(collection)
    }
}
