package com.mannanlive.ebay.collections

import com.mannanlive.ebay.collections.BaseSetBaseSet.Companion.BaseSetCards

class BaseSetBaseSetShadowless {
    companion object {
        val collection = SeriesCollection(
            "BSS",
            BaseSetCards,
            "shadowless",
            listOf("psa", "bgs")
        )

        @JvmStatic
        fun main(args: Array<String>) = SeriesCollector().collect(collection)
    }
}
