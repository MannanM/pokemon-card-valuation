package com.mannanlive.ebay.collections.base

import com.mannanlive.ebay.collections.Card
import com.mannanlive.ebay.collections.CardType
import com.mannanlive.ebay.collections.SeriesCollection
import com.mannanlive.ebay.collections.SeriesCollector

class BaseSetJungle {
    companion object {
        val collection = SeriesCollection(
            "JU",
            listOf(
                Card(1, "Clefable", CardType.NORMAL),
                Card(2, "Electrode", CardType.NORMAL),
                Card(3, "Flareon", CardType.NORMAL, ignoreTrades = listOf(
                    //misprints
                    313237961566, 373249874286
                )),
                Card(4, "Jolteon", CardType.NORMAL),
                Card(5, "Kangaskhan", CardType.NORMAL),
                Card(6, "Mr. Mime", CardType.NORMAL),
                Card(7, "Nidoqueen", CardType.NORMAL),
                Card(8, "Pidgeot", CardType.NORMAL),
                Card(9, "Pinsir", CardType.NORMAL),
                Card(10, "Scyther", CardType.NORMAL),
                Card(11, "Snorlax", CardType.NORMAL),
                Card(12, "Vaporeon", CardType.NORMAL),
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
                Card(33, "Butterfree", CardType.NORMAL),
                Card(34, "Dodrio", CardType.NORMAL),
                Card(35, "Exeggutor", CardType.NORMAL),
                Card(36, "Fearow", CardType.NORMAL),
                Card(37, "Gloom", CardType.NORMAL),
                Card(38, "Lickitung", CardType.NORMAL),
                Card(39, "Marowak", CardType.NORMAL),
                Card(40, "Nidorina", CardType.NORMAL),
                Card(41, "Parasect", CardType.NORMAL),
                Card(42, "Persian", CardType.NORMAL),
                Card(43, "Primeape", CardType.NORMAL),
                Card(44, "Rapidash", CardType.NORMAL),
                Card(45, "Rhydon", CardType.NORMAL),
                Card(46, "Seaking", CardType.NORMAL),
                Card(47, "Tauros", CardType.NORMAL),
                Card(48, "Weepinbell", CardType.NORMAL),
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
            listOf("shadowless", "first", "psa", "bgs")
        )

        @JvmStatic
        fun main(args: Array<String>) = SeriesCollector().collect(collection)
    }
}
