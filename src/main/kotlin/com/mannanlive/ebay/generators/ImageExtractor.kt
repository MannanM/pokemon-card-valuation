package com.mannanlive.ebay.generators

import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.HttpClientBuilder
import org.imgscalr.Scalr
import java.io.File
import javax.imageio.ImageIO

object ImageExtractor {

    fun extract(type: String, url: String, fileType: String = "png", width: Int = 20) {
        HttpClientBuilder.create().build().execute(HttpGet(url)).entity.content.use { content ->
            println(" - resizing image")
            val original = ImageIO.read(content)
            val resize = Scalr.resize(original, width)
            println(" - writing image")
            ImageIO.write(resize, fileType, File("static/src/img/${type.toUpperCase()}.$fileType"))
        }
    }
}