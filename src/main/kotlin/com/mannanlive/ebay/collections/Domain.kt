package com.mannanlive.ebay.collections

data class PopulatedCard(
    val name: String,
    val type: CardType,
    val data: List<Array<Any>>
)

data class Card(
    val id: Int,
    val name: String,
    val type: CardType
)

enum class CardType {
    V,
    VMAX,
    HYPER_RARE,
    FULL_ART,
    SECRET_RARE,
    SHINY
}
