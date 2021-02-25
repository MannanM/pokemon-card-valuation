package com.mannanlive.ebay.collections.sm
    
import com.mannanlive.ebay.collections.Card
import com.mannanlive.ebay.collections.CardType
import com.mannanlive.ebay.collections.SeriesCollection
import com.mannanlive.ebay.collections.SeriesCollector

class SunMoonBurningShadows {
    companion object {
        val collection = SeriesCollection(
            "SM3",
            listOf(
                Card(17, "Golisopod-GX", CardType.GX),
                Card(20, "Charizard-GX", CardType.GX),
                Card(21, "Ho-Oh-GX", CardType.GX),
                Card(25, "Salazzle-GX", CardType.GX),
                Card(39, "Tapu Fini-GX", CardType.GX),
                Card(39, "Tapu Fini-GX", CardType.GX, suffix="a"),
                Card(63, "Necrozma-GX", CardType.GX),
                Card(64, "Machamp-GX", CardType.GX),
                Card(80, "Marshadow-GX", CardType.GX),
                Card(84, "Alolan Muk-GX", CardType.GX),
                Card(88, "Darkrai-GX", CardType.GX),
                Card(88, "Darkrai-GX", CardType.GX, suffix="a"),
                Card(93, "Gardevoir-GX", CardType.GX),
                Card(99, "Noivern-GX", CardType.GX),
                Card(129, "Golisopod-GX", CardType.ULTRA),
                Card(130, "Tapu Bulu-GX", CardType.ULTRA),
                Card(131, "Ho-Oh-GX", CardType.ULTRA),
                Card(132, "Salazzle-GX", CardType.ULTRA),
                Card(133, "Tapu Fini-GX", CardType.ULTRA),
                Card(134, "Necrozma-GX", CardType.ULTRA),
                Card(135, "Machamp-GX", CardType.ULTRA),
                Card(136, "Lycanroc-GX", CardType.ULTRA),
                Card(137, "Marshadow-GX", CardType.ULTRA),
                Card(138, "Alolan Muk-GX", CardType.ULTRA),
                Card(139, "Darkrai-GX", CardType.ULTRA),
                Card(140, "Gardevoir-GX", CardType.ULTRA),
                Card(141, "Noivern-GX", CardType.ULTRA),
                Card(142, "Acerola", CardType.ULTRA),
                Card(143, "Guzma", CardType.ULTRA),
                Card(144, "Kiawe", CardType.ULTRA),
                Card(145, "Plumeria", CardType.ULTRA),
                Card(146, "Sophocles", CardType.ULTRA),
                Card(147, "Wicke", CardType.ULTRA),
                Card(148, "Golisopod-GX", CardType.RAINBOW),
                Card(149, "Tapu Bulu-GX", CardType.RAINBOW),
                Card(150, "Charizard-GX", CardType.RAINBOW),
                Card(151, "Salazzle-GX", CardType.RAINBOW),
                Card(152, "Tapu Fini-GX", CardType.RAINBOW),
                Card(153, "Necrozma-GX", CardType.RAINBOW),
                Card(154, "Machamp-GX", CardType.RAINBOW),
                Card(155, "Lycanroc-GX", CardType.RAINBOW),
                Card(156, "Marshadow-GX", CardType.RAINBOW),
                Card(157, "Alolan Muk-GX", CardType.RAINBOW),
                Card(158, "Darkrai-GX", CardType.RAINBOW),
                Card(159, "Gardevoir-GX", CardType.RAINBOW),
                Card(160, "Noivern-GX", CardType.RAINBOW),
                Card(161, "Bodybuilding Dumbbells", CardType.SECRET),
                Card(162, "Choice Band", CardType.SECRET),
                Card(163, "Escape Rope", CardType.SECRET),
                Card(164, "Multi Switch", CardType.SECRET),
                Card(165, "Rescue Stretcher", CardType.SECRET),
                Card(166, "Super Scoop Up", CardType.SECRET),
                Card(167, "Fire Energy", CardType.SECRET),
                Card(168, "Darkness Energy", CardType.SECRET),
                Card(169, "Fairy Energy", CardType.SECRET)
            ),
            "Burning%20Shadows",
            listOf("jumbo", "promo", "psa", "japanese")
        )

        @JvmStatic
        fun main(args: Array<String>) {
            SeriesCollector().collect(collection)
        }
    }
}
