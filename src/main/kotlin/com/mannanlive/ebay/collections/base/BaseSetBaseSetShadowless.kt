package com.mannanlive.ebay.collections.base

import com.mannanlive.ebay.collections.SeriesCollection
import com.mannanlive.ebay.collections.SeriesCollector
import com.mannanlive.ebay.collections.base.BaseSetBaseSet.Companion.BaseSetCards

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
