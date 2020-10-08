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
            val cancelledOffer = row.select("li.lvprice span.sboffer")
            if (cancelledOffer.size > 0) {
                null
            } else {
                val listingId = row.attr("listingid").toLong()
                val date = formatter.parseDateTime(row.select("li.timeleft").text())
                val price = getPrice(
                    row.select("li.lvprice").text(),
                    row.select("li.lvshipping").text()
                )
                if (price == null) {
                    null
                } else {
                    Listing(listingId, price, date)
                }
            }
        }
    }

    private fun getPrice(text: String, shipping: String): BigDecimal? = try {
        if (shipping == "Free postage") {
            text.extractAmount
        } else {
            text.extractAmount + shipping.extractAmount
        }
    } catch (ex: Exception) {
        println("Unable to process: amount=$text, shipping=$shipping")
        null
    }

    private val String.extractAmount: BigDecimal
        get() = this.replace(" postage", "").split("$")[1].toBigDecimal()

    data class Listing(
        val id: Long,
        val price: BigDecimal,
        val date: DateTime
    )
}
