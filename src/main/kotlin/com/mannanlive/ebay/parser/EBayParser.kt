package com.mannanlive.ebay.parser

import org.joda.time.DateTime
import org.jsoup.Jsoup
import org.joda.time.format.DateTimeFormat
import java.lang.Exception
import java.math.BigDecimal

class EBayParser {
    private val formatter = DateTimeFormat.forPattern("dd-MMM HH:mm")

    fun process(input: String): List<Listing> {
        return Jsoup.parse(input).select("li.sresult").mapNotNull { row ->
            val listingId = row.attr("listingid").toLong()
            val date = formatter.parseDateTime(row.select("li.timeleft").text())
            val price = getPrice(row.select("li.lvprice").text())
            if (price == null) {
                null
            } else {
                Listing(listingId, price, date)
            }
        }
    }

    private fun getPrice(text: String) : BigDecimal? = try {
        text.split("$")[1].toBigDecimal()
    } catch (ex: Exception) {
        println(text)
        null
    }

    data class Listing(
        val id: Long,
        val price: BigDecimal,
        val date: DateTime
    )
}
