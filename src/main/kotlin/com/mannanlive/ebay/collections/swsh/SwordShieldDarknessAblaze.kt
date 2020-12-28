package com.mannanlive.ebay.collections.swsh

import com.mannanlive.ebay.collections.Card
import com.mannanlive.ebay.collections.CardType
import com.mannanlive.ebay.collections.SeriesCollection
import com.mannanlive.ebay.collections.SeriesCollector

class SwordShieldDarknessAblaze {
    companion object {

        val collection = SeriesCollection(
            "SWSH3",
            listOf(
                Card(1, "Butterfree V", CardType.V),
                Card(2, "Butterfree VMAX", CardType.VMAX),
                Card(19, "Charizard V", CardType.V, ignoreTrades = listOf(383718316849)),
                Card(20, "Charizard VMAX", CardType.VMAX, ignoreTrades = listOf(373136448383)),
                Card(21, "Houndoom V", CardType.V),
                Card(33, "Centiskorch V", CardType.V),
                Card(34, "Centiskorch VMAX", CardType.VMAX),
                Card(60, "Vikavolt V", CardType.V),
                Card(69, "Mew V", CardType.V),
                Card(95, "Rhyperior V", CardType.V),
                Card(99, "Galarian Slowbro V", CardType.V),
                Card(104, "Crobat V", CardType.V),
                Card(114, "Grimmsnarl V", CardType.V),
                Card(115, "Grimmsnarl VMAX", CardType.VMAX),
                Card(116, "Eternatus V", CardType.V),
                Card(117, "Eternatus VMAX", CardType.VMAX),
                Card(118, "Scizor V", CardType.V),
                Card(119, "Scizor VMAX", CardType.VMAX),
                Card(128, "Galarian Stunfisk V", CardType.V),
                Card(143, "Salamence V", CardType.V),
                Card(144, "Salamence VMAX", CardType.VMAX),
                Card(177, "Butterfree V", CardType.HYPER_RARE),
                Card(178, "Houndoom V", CardType.HYPER_RARE),
                Card(179, "Centiskorch V", CardType.HYPER_RARE),
                Card(180, "Vikavolt V", CardType.HYPER_RARE),
                Card(181, "Rhyperior V", CardType.HYPER_RARE),
                Card(182, "Crobat V", CardType.HYPER_RARE),
                Card(183, "Scizor V", CardType.HYPER_RARE),
                Card(184, "Galarian Stunfisk V", CardType.HYPER_RARE),
                Card(185, "Salamence V", CardType.HYPER_RARE),
                Card(186, "Kabu", CardType.HYPER_RARE),
                Card(187, "Piers", CardType.HYPER_RARE),
                Card(188, "Pokémon Breeder's Nurturing", CardType.HYPER_RARE),
                Card(189, "Rose", CardType.HYPER_RARE),
                Card(190, "Butterfree VMAX", CardType.HYPER_RARE),
                Card(191, "Centiskorch VMAX", CardType.HYPER_RARE),
                Card(192, "Eternatus VMAX", CardType.HYPER_RARE),
                Card(193, "Scizor VMAX", CardType.HYPER_RARE),
                Card(194, "Salamence VMAX", CardType.HYPER_RARE),
                Card(195, "Pokémon Breeder's Nurturing", CardType.HYPER_RARE),
                Card(196, "Rose", CardType.HYPER_RARE),
                Card(197, "Rillaboom", CardType.SECRET_RARE),
                Card(198, "Coalossal", CardType.SECRET_RARE),
                Card(199, "Big Parasol", CardType.SECRET_RARE),
                Card(200, "Turbo Patch", CardType.SECRET_RARE),
                Card(201, "Capture Energy", CardType.SECRET_RARE)
            ),
            "darkness",
            listOf("digital", "rebel", "jumbo", "promo", "psa")
        )

        @JvmStatic
        fun main(args: Array<String>) {
            SeriesCollector().collect(collection)
        }
    }
}
