package com.mannanlive.ebay.collections.sm
    
import com.mannanlive.ebay.collections.Card
import com.mannanlive.ebay.collections.CardType
import com.mannanlive.ebay.collections.SeriesCollection
import com.mannanlive.ebay.collections.SeriesCollector

class SunMoonShiningLegends {
    companion object {
        val collection = SeriesCollection(
            "SM35",
            listOf(
                Card(9, "Shining Genesect", CardType.SHINING),
                Card(10, "Entei-GX", CardType.GX),
                Card(10, "Entei-GX", CardType.GX, suffix="a"),
                Card(27, "Shining Volcanion", CardType.SHINING),
                Card(29, "Raichu-GX", CardType.GX),
                Card(39, "Mewtwo-GX", CardType.GX),
                Card(40, "Shining Mew", CardType.SHINING),
                Card(42, "Shining Jirachi", CardType.SHINING),
                Card(53, "Zoroark-GX", CardType.GX),
                Card(56, "Shining Rayquaza", CardType.SHINING),
                Card(57, "Shining Arceus", CardType.SHINING),
                Card(71, "Entei-GX", CardType.ULTRA),
                Card(72, "Mewtwo-GX", CardType.ULTRA),
                Card(73, "Pokémon Breeder", CardType.ULTRA, "(Pokémon,Pokemon) Breeder"),
                Card(74, "Entei-GX", CardType.RAINBOW),
                Card(75, "Raichu-GX", CardType.RAINBOW),
                Card(76, "Mewtwo-GX", CardType.RAINBOW),
                Card(77, "Zoroark-GX", CardType.RAINBOW),
                Card(77, "Zoroark-GX", CardType.ULTRA, suffix="a"),
                Card(78, "Mewtwo-GX", CardType.SECRET)
            ),
            "Shining%20Legends",
            listOf("jumbo", "promo", "psa", "japanese")
        )

        @JvmStatic
        fun main(args: Array<String>) {
            SeriesCollector().collect(collection)
        }
    }
}
