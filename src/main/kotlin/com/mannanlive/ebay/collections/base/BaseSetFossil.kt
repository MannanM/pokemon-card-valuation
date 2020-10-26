package com.mannanlive.ebay.collections.base

import com.mannanlive.ebay.collections.Card
import com.mannanlive.ebay.collections.CardType
import com.mannanlive.ebay.collections.SeriesCollection
import com.mannanlive.ebay.collections.SeriesCollector

class BaseSetFossil {
    companion object {
        val collection = SeriesCollection(
            "FO",
            listOf(
                Card(1, "Aerodactyl", CardType.NORMAL),
                Card(2, "Articuno", CardType.NORMAL),
                Card(3, "Ditto", CardType.NORMAL),
                Card(4, "Dragonite", CardType.NORMAL),
                Card(5, "Gengar", CardType.NORMAL),
                Card(6, "Haunter", CardType.NORMAL),
                Card(7, "Hitmonlee", CardType.NORMAL),
                Card(8, "Hypno", CardType.NORMAL),
                Card(9, "Kabutops", CardType.NORMAL),
                Card(10, "Lapras", CardType.NORMAL, ignoreTrades = listOf(
                    //multiple
                    184483433049
                )),
                Card(11, "Magneton", CardType.NORMAL),
                Card(12, "Moltres", CardType.NORMAL),
                Card(13, "Muk", CardType.NORMAL),
                Card(14, "Raichu", CardType.NORMAL),
                Card(15, "Zapdos", CardType.NORMAL),
                Card(16, "Aerodactyl", CardType.NORMAL),
                Card(17, "Articuno", CardType.NORMAL),
                Card(18, "Ditto", CardType.NORMAL),
                Card(19, "Dragonite", CardType.NORMAL),
                Card(20, "Gengar", CardType.NORMAL),
                Card(21, "Haunter", CardType.NORMAL),
                Card(22, "Hitmonlee", CardType.NORMAL),
                Card(23, "Hypno", CardType.NORMAL),
                Card(24, "Kabutops", CardType.NORMAL),
                Card(25, "Lapras", CardType.NORMAL),
                Card(26, "Magneton", CardType.NORMAL),
                Card(27, "Moltres", CardType.NORMAL),
                Card(28, "Muk", CardType.NORMAL),
                Card(29, "Raichu", CardType.NORMAL),
                Card(30, "Zapdos", CardType.NORMAL),
                Card(31, "Arbok", CardType.NORMAL),
                Card(32, "Cloyster", CardType.NORMAL),
                Card(33, "Gastly", CardType.NORMAL),
                Card(34, "Golbat", CardType.NORMAL),
                Card(35, "Golduck", CardType.NORMAL),
                Card(36, "Golem", CardType.NORMAL),
                Card(37, "Graveler", CardType.NORMAL),
                Card(38, "Kingler", CardType.NORMAL),
                Card(39, "Magmar", CardType.NORMAL),
                Card(40, "Omastar", CardType.NORMAL),
                Card(41, "Sandslash", CardType.NORMAL),
                Card(42, "Seadra", CardType.NORMAL),
                Card(43, "Slowbro", CardType.NORMAL),
                Card(44, "Tentacruel", CardType.NORMAL),
                Card(45, "Weezing", CardType.NORMAL),
                Card(46, "Ekans", CardType.NORMAL),
                Card(47, "Geodude", CardType.NORMAL),
                Card(48, "Grimer", CardType.NORMAL),
                Card(49, "Horsea", CardType.NORMAL),
                Card(50, "Kabuto", CardType.NORMAL),
                Card(51, "Krabby", CardType.NORMAL),
                Card(52, "Omanyte", CardType.NORMAL),
                Card(53, "Psyduck", CardType.NORMAL),
                Card(54, "Shellder", CardType.NORMAL),
                Card(55, "Slowpoke", CardType.NORMAL),
                Card(56, "Tentacool", CardType.NORMAL),
                Card(57, "Zubat", CardType.NORMAL),
                Card(58, "Mr. Fuji", CardType.NORMAL),
                Card(59, "Energy Search", CardType.NORMAL),
                Card(60, "Gambler", CardType.NORMAL),
                Card(61, "Recycle", CardType.NORMAL),
                Card(62, "Mysterious Fossil", CardType.NORMAL)
            ),
            "fossil",
            listOf("shadowless", "first", "psa", "bgs")
        )

        @JvmStatic
        fun main(args: Array<String>) = SeriesCollector().collect(collection)
    }
}
