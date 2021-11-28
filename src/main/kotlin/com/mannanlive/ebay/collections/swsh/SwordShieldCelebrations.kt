package com.mannanlive.ebay.collections.swsh
    
import com.mannanlive.ebay.collections.Card
import com.mannanlive.ebay.collections.CardType
import com.mannanlive.ebay.collections.SeriesCollection
import com.mannanlive.ebay.collections.SeriesCollector

class SwordShieldCelebrations {
    companion object {
        val collection = SeriesCollection(
            "CEL25",
            listOf(
                Card(2, "Blastoise", CardType.NORMAL),
                Card(4, "Charizard", CardType.NORMAL),
                Card(15, "Venusaur", CardType.NORMAL),
                Card(15, "Here Comes Team Rocket!", CardType.NORMAL),
                Card(15, "Rocket’s Zapdos", CardType.NORMAL),
                Card(15, "Claydol", CardType.NORMAL),
                Card(73, "Imposter Professor Oak", CardType.NORMAL),
                Card(8, "Dark Gyarados", CardType.NORMAL),
                Card(24, "_____’s Pikachu", CardType.NORMAL),
                Card(20, "Cleffa", CardType.NORMAL),
                Card(66, "Shining Magikarp", CardType.NORMAL),
                Card(9, "Team Magma’s Groudon", CardType.NORMAL),
                Card(86, "Rocket’s Admin.", CardType.NORMAL),
                Card(88, "Mew ex", CardType.EX),
                Card(93, "Gardevoir ex", CardType.EX),
                Card(17, "Umbreon ★", CardType.NORMAL),
                Card(109, "Luxray GL LV.X", CardType.LVX),
                Card(145, "Garchomp C LV.X", CardType.LVX),
                Card(107, "Donphan", CardType.NORMAL),
                Card(113, "Reshiram", CardType.NORMAL),
                Card(114, "Zekrom", CardType.EX),
                Card(54, "Mewtwo-EX", CardType.EX),
                Card(97, "Xerneas-EX", CardType.EX),
                Card(76, "M Rayquaza-EX", CardType.EX),
                Card(60, "Tapu Lele GX", CardType.GX),

                Card(6, "Flying Pikachu V", CardType.V),
                Card(7, "Flying Pikachu VMAX", CardType.VMAX),
                Card(8, "Surfing Pikachu V", CardType.V),
                Card(9, "Surfing Pikachu VMAX", CardType.VMAX),
                Card(16, "Zacian V", CardType.V),
                Card(18, "Zamazenta V", CardType.V),
                Card(24, "Professor’s Research (Professor Oak)", CardType.ULTRA)
            ),
            "Celebrations",
            listOf("jumbo", "promo", "japanese")
        )

        @JvmStatic
        fun main(args: Array<String>) {
            SeriesCollector().collect(collection)
        }
    }
}
