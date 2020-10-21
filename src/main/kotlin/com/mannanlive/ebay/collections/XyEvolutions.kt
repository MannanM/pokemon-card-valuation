package com.mannanlive.ebay.collections

class XyEvolutions {
    companion object {
        val collection = SeriesCollection(
            "XY12",
            listOf(
                Card(1, "Venusaur EX", CardType.EX),
                Card(2, "M Venusaur EX", CardType.MEGA_EX),
                Card(9, "Charmander", CardType.NORMAL),
                Card(10, "Charmeleon", CardType.NORMAL),
                Card(11, "Charizard", CardType.NORMAL, ignoreTrades = listOf(
                    //multiple
                    283963637440,
                    184489075013,
                    383765414719,
                    383678336081
                ), addedTrades = listOf(
                    arrayOf("2020-10-19T18:59", 450.0, 133551288865),
                    arrayOf("2020-09-25T15:22", 97.0, 203109350106)
                )),
                Card(12, "Charizard EX", CardType.EX, ignoreTrades = listOf(402350240395)),
                Card(13, "M Charizard EX", CardType.MEGA_EX, ignoreTrades = listOf(402350240395)),
                Card(16, "Ninetales BREAK", CardType.BREAK),
                Card(21, "Blastoise EX", CardType.EX),
                Card(22, "M Blastoise EX", CardType.MEGA_EX),
                Card(26, "Slowbro EX", CardType.EX),
                Card(27, "M Slowbro EX", CardType.MEGA_EX),
                Card(35, "Pikachu", CardType.NORMAL),
                Card(51, "Mewtwo", CardType.NORMAL),
                Card(52, "Mewtwo EX", CardType.EX),
                Card(53, "Mew", CardType.NORMAL),
                Card(64, "Pidgeot EX", CardType.EX),
                Card(65, "M Pidgeot EX", CardType.MEGA_EX),
                Card(72, "Dragonite EX", CardType.EX),
                Card(73, "Blastoise Spirit Link", CardType.NORMAL),
                Card(74, "Brock's Grit", CardType.NORMAL),
                Card(75, "Charizard Spirit Link", CardType.NORMAL),
                Card(76, "Devolution Spray", CardType.NORMAL),
                Card(77, "Energy Retrieval", CardType.NORMAL),
                Card(78, "Full Heal", CardType.NORMAL),
                Card(79, "Maintenance", CardType.NORMAL),
                Card(80, "Misty's Determination", CardType.NORMAL),
                Card(81, "Pidgeot Spirit Link", CardType.NORMAL),
                Card(82, "Pokedex", CardType.NORMAL),
                Card(83, "Potion", CardType.NORMAL),
                Card(84, "Professor Oak's Hint", CardType.NORMAL),
                Card(85, "Revive", CardType.NORMAL),
                Card(86, "Slowbro Spirit Link", CardType.NORMAL),
                Card(87, "Super Potion", CardType.NORMAL),
                Card(88, "Switch", CardType.NORMAL),
                Card(89, "Venusaur Spirit Link", CardType.NORMAL),
                Card(90, "Double Colorless Energy", CardType.NORMAL),
                Card(91, "Grass Energy", CardType.NORMAL),
                Card(100, "M Venusaur EX", CardType.FULL_ART),
                Card(101, "M Charizard EX", CardType.FULL_ART),
                Card(102, "M Blastoise EX", CardType.FULL_ART),
                Card(103, "Mewtwo EX", CardType.FULL_ART),
                Card(104, "Pidgeot EX", CardType.FULL_ART),
                Card(105, "M Pidgeot EX", CardType.FULL_ART),
                Card(106, "Dragonite EX", CardType.FULL_ART),
                Card(107, "Brock's Grit", CardType.FULL_ART),
                Card(108, "Misty's Determination", CardType.EX),
                Card(109, "Exeggutor", CardType.SECRET_RARE),
                Card(110, "Flying Pikachu", CardType.SECRET_RARE),
                Card(111, "Surfing Pikachu", CardType.SECRET_RARE),
                Card(112, "Imakuni's Doduo", CardType.SECRET_RARE),
                Card(113, "Here Comes Team Rocket!", CardType.SECRET_RARE)
            ),
            "evolutions",
            listOf("digital", "jumbo", "promo", "psa", "bgs")
        )

        @JvmStatic
        fun main(args: Array<String>) = SeriesCollector().collect(collection)
    }
}
