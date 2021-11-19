package com.mannanlive.ebay.collections.sm
    
import com.mannanlive.ebay.collections.Card
import com.mannanlive.ebay.collections.CardType
import com.mannanlive.ebay.collections.SeriesCollection
import com.mannanlive.ebay.collections.SeriesCollector

class SunMoonCrimsonInvasion {
    companion object {
        val collection = SeriesCollection(
            "SM4",
            listOf(
                Card(18, "Gyarados-GX", CardType.GX),
                Card(34, "Alolan Golem-GX", CardType.GX),
                Card(49, "Nihilego-GX", CardType.GX),
                Card(57, "Buzzwole-GX", CardType.GX),
                Card(63, "Guzzlord-GX", CardType.GX),
                Card(63, "Guzzlord-GX", CardType.GX, suffix="a"),
                Card(70, "Kartana-GX", CardType.GX),
                Card(74, "Alolan Exeggutor-GX", CardType.GX),
                Card(90, "Silvally-GX", CardType.GX),
                Card(101, "Gyarados-GX", CardType.ULTRA),
                Card(102, "Alolan Golem-GX", CardType.ULTRA),
                Card(103, "Nihilego-GX", CardType.ULTRA),
                Card(104, "Buzzwole-GX", CardType.ULTRA),
                Card(105, "Guzzlord-GX", CardType.ULTRA),
                Card(106, "Kartana-GX", CardType.ULTRA),
                Card(107, "Alolan Exeggutor-GX", CardType.ULTRA),
                Card(108, "Silvally-GX", CardType.ULTRA),
                Card(109, "Gladion", CardType.ULTRA),
                Card(110, "Lusamine", CardType.ULTRA),
                Card(111, "Olivia", CardType.ULTRA),
                Card(112, "Gyarados-GX", CardType.RAINBOW),
                Card(113, "Alolan Golem-GX", CardType.RAINBOW),
                Card(114, "Nihilego-GX", CardType.RAINBOW),
                Card(115, "Buzzwole-GX", CardType.RAINBOW),
                Card(116, "Guzzlord-GX", CardType.RAINBOW),
                Card(117, "Kartana-GX", CardType.RAINBOW),
                Card(118, "Alolan Exeggutor-GX", CardType.RAINBOW),
                Card(119, "Silvally-GX", CardType.RAINBOW),
                Card(120, "Counter Catcher", CardType.SECRET),
                Card(121, "Wishful Baton", CardType.SECRET),
                Card(122, "Counter Energy", CardType.SECRET),
                Card(123, "Warp Energy", CardType.SECRET),
                Card(124, "Water Energy", CardType.SECRET)
            ),
            "Crimson%20Invasion",
            listOf("jumbo", "promo","japanese")
        )

        @JvmStatic
        fun main(args: Array<String>) {
            SeriesCollector().collect(collection)
        }
    }
}
