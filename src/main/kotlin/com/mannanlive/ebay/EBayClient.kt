package com.mannanlive.ebay

import com.amazonaws.util.IOUtils
import org.apache.http.HttpHeaders
import org.apache.http.StatusLine
import org.apache.http.client.CookieStore
import org.apache.http.client.methods.HttpGet
import org.apache.http.client.methods.HttpUriRequest
import org.apache.http.impl.client.BasicCookieStore
import org.apache.http.impl.client.HttpClientBuilder
import org.apache.http.util.EntityUtils

private const val ACCEPT = "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3"
private const val USER_AGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.100 Safari/537.36"

class EBayClient {

    private val httpCookieStore: CookieStore = BasicCookieStore()
    private val client = HttpClientBuilder.create().setDefaultCookieStore(httpCookieStore).build()

    fun getHistory(searchString: String, excludeString: String): String {
        val response = extractResponse(
            HttpGet(
                """https://www.ebay.com.au/sch/i.html?_from=R40&_nkw=${searchString}&_in_kw=1&_ex_kw=${excludeString}&_sacat=0&LH_Sold=1&_udlo=&_udhi=&_samilow=&_samihi=&_sadis=15&_stpos=4104&_fsradio2=%26LH_PrefLoc%3D1&_sargn=-1%26saslc%3D1&_salic=15&LH_SubLocation=1&_sop=15&_dmd=1&_ipg=200&LH_Complete=1&_fosrp=1"""
            ).apply {
                setHeader(HttpHeaders.ACCEPT, ACCEPT)
                setHeader(HttpHeaders.USER_AGENT, USER_AGENT)
            }
        )
        return if (response.first.statusCode == 200) {
            return response.second
        } else {
            ""
        }
    }

    private fun extractResponse(request: HttpUriRequest): Pair<StatusLine, String> {
        val response = client.execute(request)
        val statusLine = response.statusLine
        val result = IOUtils.toString(response.entity.content)
        EntityUtils.consume(response.entity)
        return statusLine to result
    }
}
