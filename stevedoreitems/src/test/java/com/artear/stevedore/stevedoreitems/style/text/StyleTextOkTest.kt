package com.artear.stevedore.stevedoreitems.style.text

import com.artear.stevedore.stevedoreitems.TestUtils
import com.artear.stevedore.stevedoreitems.repository.model.style.StyleText
import com.google.gson.Gson
import okhttp3.MediaType
import okhttp3.ResponseBody
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito
import timber.log.Timber


class StyleTextOkTest {

    private lateinit var gson: Gson
    private lateinit var responseBody: ResponseBody

    @Before
    fun setUp() {

        Timber.plant(Mockito.mock(Timber.Tree::class.java))

        val loader = javaClass.classLoader!!
        val json = TestUtils().loadJSONFromAsset(loader, "style/text", "text_ok")

        val mediaType = MediaType.parse("application/json")

        responseBody = ResponseBody.create(mediaType, json!!)

        gson = Gson()

    }

    @Test
    fun hiddenTest() {
        val styleText = gson.fromJson(responseBody.string(), StyleText::class.java)
        Assert.assertEquals(styleText.hidden, false)
    }

    @Test
    fun numberOfLinesTest() {
        val styleText = gson.fromJson(responseBody.string(), StyleText::class.java)
        Assert.assertEquals(styleText.numberOfLines, 3)
    }

    /*
        "underline": {
            "color": {
              "light": "#660066",
              "dark": "#CC00CC"
            }
        }

     */

    @Test
    fun underlineLightTest() {
        val styleText = gson.fromJson(responseBody.string(), StyleText::class.java)
        Assert.assertEquals(styleText.underline!!.color.light, "#660066")
    }

    @Test
    fun underlineDarkTest() {
        val styleText = gson.fromJson(responseBody.string(), StyleText::class.java)
        Assert.assertEquals(styleText.underline!!.color.dark, "#CC00CC")
    }


    @Test
    fun lightColorTest() {
        val styleText = gson.fromJson(responseBody.string(), StyleText::class.java)
        Assert.assertEquals(styleText.color!!.light, "#CC00CC")
    }

    @Test
    fun darkColorTest() {
        val styleText = gson.fromJson(responseBody.string(), StyleText::class.java)
        Assert.assertEquals(styleText.color!!.dark, "#660066")
    }

}