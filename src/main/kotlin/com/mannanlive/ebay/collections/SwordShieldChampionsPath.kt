package com.mannanlive.ebay.collections

class SwordShieldChampionsPath {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SeriesCollector()
                .collect(
                    "SWSH35",
                    listOf(
                        Card(1, "Venusaur V", CardType.V),
                        Card(5, "Eldegoss V", CardType.V),
                        Card(8, "Incineroar V", CardType.V),
                        Card(13, "Wailord V", CardType.V),
                        Card(14, "Drednaw V", CardType.V),
                        Card(15, "Drednaw VMAX", CardType.VMAX),
                        Card(16, "Gardevoir V", CardType.V),
                        Card(17, "Gardevoir VMAX", CardType.VMAX),
                        Card(21, "Galarian Cursola V", CardType.V),
                        Card(22, "Alcremie V", CardType.V),
                        Card(23, "Alcremie VMAX", CardType.VMAX),
                        Card(27, "Lucario V", CardType.V),
                        Card(32, "Grapploct V", CardType.V),
                        Card(47, "Duraludon V", CardType.V),
                        Card(69, "Drednaw V", CardType.FULL_ART),
                        Card(70, "Gardevoir V", CardType.FULL_ART),
                        Card(71, "Galarian Cursola V", CardType.FULL_ART),
                        Card(72, "Grapploct V", CardType.FULL_ART),
                        Card(73, "Hop", CardType.FULL_ART),
                        Card(74, "Charizard VMAX", CardType.HYPER_RARE),
                        Card(75, "Drednaw VMAX", CardType.HYPER_RARE),
                        Card(76, "Gardevoir VMAX", CardType.HYPER_RARE),
                        Card(77, "Kabu", CardType.HYPER_RARE),
                        Card(78, "Piers", CardType.HYPER_RARE),
                        Card(79, "Charizard V", CardType.SHINY),
                        Card(80, "Suspicious Food Tin", CardType.SECRET_RARE)
                    ),
                    "champion",
                    listOf("digital", "darkness", "rebel", "jumbo", "promo")
                )
        }
    }
}
