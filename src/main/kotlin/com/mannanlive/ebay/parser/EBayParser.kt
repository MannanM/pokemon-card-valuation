package com.mannanlive.ebay.parser

import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat
import org.jsoup.Jsoup
import org.jsoup.nodes.Element
import java.lang.IllegalStateException
import java.math.BigDecimal

class EBayParser {
    private val now = DateTime.now()
    private val formatter = DateTimeFormat.forPattern("dd-MMM HH:mm")

    fun process(input: String): List<Listing> {
        if (input.contains("Please verify yourself")) {
            throw IllegalStateException("eBay has blocked due for captcha")
        }
        return Jsoup.parse(input).select("li.sresult").mapNotNull { row ->
            val cancelledOffer = row.select("li.lvprice span.sboffer")
            val overseasText = row.select("li").text()
            if (cancelledOffer.size > 0 || overseasText.contains(" From ")) {
                null
            } else {
                val listingId = row.attr("listingid").toLong()
                val date = getDate(row)
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
        text.extractAmount + safeGetShipping(shipping)
    } catch (ex: Exception) {
        println("Unable to process: amount=$text")
        null
    }

    private fun safeGetShipping(shipping: String): BigDecimal = try {
        if (listOf("Free postage", "Postage not specified", "Pickup only: Free").contains(shipping)) {
            BigDecimal.ZERO
        } else {
            shipping.extractAmount
        }
    } catch (ex: Exception) {
        println("Unable to process shipping: shipping=$shipping")
        BigDecimal.ZERO
    }

    private val String.extractAmount: BigDecimal
        get() = this
            .replace(",", "")
            .replace(" postage", "")
            .split("$")[1]
            .toBigDecimal()

    private fun getDate(row: Element): DateTime {
        val date = formatter.parseDateTime(row.select("li.timeleft").text())
        return if (date.year == 2000) {
            val dateAsThisYear = date.plusYears(now.year - date.year)
            if (dateAsThisYear.isAfterNow) {
                dateAsThisYear.minusYears(1)
            } else {
                dateAsThisYear
            }
        } else {
            date
        }
    }

    data class Listing(
        val id: Long,
        val price: BigDecimal,
        val date: DateTime
    )
}
