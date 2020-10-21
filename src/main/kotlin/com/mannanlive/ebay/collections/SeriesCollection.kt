package com.mannanlive.ebay.collections

data class SeriesCollection(
    val setName: String,
    val set: List<Card>,
    val searchString: String,
    val exclusionStrings: List<String>
)
