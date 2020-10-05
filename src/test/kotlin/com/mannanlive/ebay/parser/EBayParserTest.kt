package com.mannanlive.ebay.parser

import com.fasterxml.jackson.databind.ObjectMapper
import com.mannanlive.ebay.EBayClient
import org.hamcrest.CoreMatchers.equalTo
import org.joda.time.format.DateTimeFormat
import org.junit.Assert
import org.junit.Test
import java.io.File

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

        Assert.assertThat(output.size, equalTo(44))
    }

    @Test
    fun `generate sword and shield base set`() {
        val eBayClient = EBayClient()
        val eBayParser = EBayParser()

        val results = mutableMapOf<String, Any>()
        for (i in 1..216) {
            val paddedLeftId = i.toString().padStart(3, '0')
            val history = if (i == 202) {
                eBayClient.getHistory(
                    "sword+shield+$paddedLeftId+team+yell+grunt",
                    "digital+rebel+darkness+jumbo+promo+184"
                )
            } else {
                eBayClient.getHistory(
                    "sword+shield+$paddedLeftId",
                    "digital+rebel+darkness+jumbo+promo"
                )
            }

            val output = eBayParser.process(history)
            //need to add filter list for lot items
            val formatted = output
                .sortedBy { it.date }
                .map { arrayOf(outFormatter.print(it.date), it.price) }
            results[paddedLeftId] = formatted
            Thread.sleep(1000)
            println("processed $i...")
        }

        File("Output.json").writeText(
            ObjectMapper().writeValueAsString(
                results
            )
        )
    }
}
