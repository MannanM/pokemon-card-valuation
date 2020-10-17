package com.mannanlive.ebay.parser

import com.fasterxml.jackson.databind.ObjectMapper
import org.hamcrest.CoreMatchers.equalTo
import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat
import org.junit.Assert
import org.junit.Test
import kotlin.math.roundToInt

class EBayParserTest {
    private val outFormatter = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ")

    @Test
    fun `HistoryParser process html correctly`() {
        val response = javaClass.getResource("/html/eBay-response.html").readText()

        val output = EBayParser().process(response)

        println(
            ObjectMapper().writeValueAsString(
                mapOf("values" to output.sortedBy { it.date }.map { arrayOf(outFormatter.print(it.date), it.price) })
            )
        )

        Assert.assertThat(output.size, equalTo(10))
        Assert.assertThat(output.sumByDouble { it.price.toDouble() }.roundToInt(), equalTo(326))
        Assert.assertThat(output[0].date, equalTo(DateTime.parse("2020-07-25T17:45:00")))
    }
}
