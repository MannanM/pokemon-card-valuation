package com.mannanlive.ebay.generators

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

class CreateCollectionTest {
    @Test
    fun `tokenizes words correctly`() {
        assertThat(
            CreateCollection.nameVariants("A Poké Maniac"),
            equalTo("A (Poké,Poke) Maniac")
        )
    }
}
