package com.mannanlive.ebay

import org.junit.Test

class EBayClientTest {

    @Test
    fun foo() {
        println(
            EBayClient()
                .getHistory("sword+shield+201", "digital+rebel+darkness+jumbo+promo")
        )
    }
}