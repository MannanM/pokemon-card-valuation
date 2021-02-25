package com.mannanlive.ebay.collections.sm
    
import com.mannanlive.ebay.collections.Card
import com.mannanlive.ebay.collections.CardType
import com.mannanlive.ebay.collections.SeriesCollection
import com.mannanlive.ebay.collections.SeriesCollector

class SunMoonForbiddenLight {
    companion object {
        val collection = SeriesCollection(
            "SM6",
            listOf(
                Card(20, "Palkia-GX", CardType.GX),
                Card(24, "Greninja-GX", CardType.GX),
                Card(31, "Volcanion ◇", CardType.PRISM_STAR),
                Card(56, "Naganadel-GX", CardType.GX),
                Card(73, "Zygarde-GX", CardType.GX),
                Card(74, "Diancie ◇", CardType.PRISM_STAR),
                Card(79, "Yveltal-GX", CardType.GX),
                Card(82, "Dialga-GX", CardType.GX),
                Card(90, "Xerneas-GX", CardType.GX),
                Card(95, "Ultra Necrozma-GX", CardType.GX),
                Card(96, "Arceus ◇", CardType.PRISM_STAR),
                Card(110, "Lysandre ◇", CardType.PRISM_STAR),
                Card(117, "Beast Energy ◇", CardType.PRISM_STAR),
                Card(119, "Palkia-GX", CardType.ULTRA),
                Card(120, "Greninja-GX", CardType.ULTRA),
                Card(121, "Naganadel-GX", CardType.ULTRA),
                Card(122, "Lucario-GX", CardType.ULTRA),
                Card(123, "Zygarde-GX", CardType.ULTRA),
                Card(124, "Yveltal-GX", CardType.ULTRA),
                Card(125, "Dialga-GX", CardType.ULTRA),
                Card(126, "Xerneas-GX", CardType.ULTRA),
                Card(127, "Ultra Necrozma-GX", CardType.ULTRA),
                Card(128, "Bonnie", CardType.ULTRA),
                Card(129, "Crasher Wake", CardType.ULTRA),
                Card(130, "Diantha", CardType.ULTRA),
                Card(131, "Ultra Recon Squad", CardType.ULTRA),
                Card(132, "Palkia-GX", CardType.RAINBOW),
                Card(133, "Greninja-GX", CardType.RAINBOW),
                Card(134, "Naganadel-GX", CardType.RAINBOW),
                Card(135, "Lucario-GX", CardType.RAINBOW),
                Card(136, "Zygarde-GX", CardType.RAINBOW),
                Card(137, "Yveltal-GX", CardType.RAINBOW),
                Card(138, "Dialga-GX", CardType.RAINBOW),
                Card(139, "Xerneas-GX", CardType.RAINBOW),
                Card(140, "Ultra Necrozma-GX", CardType.RAINBOW),
                Card(141, "Beast Ring", CardType.SECRET),
                Card(142, "Eneporter", CardType.SECRET),
                Card(143, "Energy Recycler", CardType.SECRET),
                Card(144, "Metal Frying Pan", CardType.SECRET),
                Card(145, "Mysterious Treasure", CardType.SECRET),
                Card(146, "Unit Energy FightingDarknessFairy", CardType.SECRET)
            ),
            "Forbidden%20Light",
            listOf("jumbo", "promo", "psa")
        )

        @JvmStatic
        fun main(args: Array<String>) {
            SeriesCollector().collect(collection)
        }
    }
}
