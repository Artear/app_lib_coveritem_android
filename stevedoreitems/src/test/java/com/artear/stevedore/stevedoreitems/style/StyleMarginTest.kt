package com.artear.stevedore.stevedoreitems.style

import com.artear.stevedore.stevedoreitems.TestUtils
import com.artear.stevedore.stevedoreitems.repository.model.style.StyleMargin
import com.google.gson.Gson
import okhttp3.MediaType
import okhttp3.ResponseBody
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito
import timber.log.Timber


class StyleMarginTest {


    private lateinit var gson: Gson
    private lateinit var okResponseStyleMargin: ResponseBody
    private lateinit var wrongRectResponseStyleMargin: ResponseBody

    @Before
    fun setUp() {
        Timber.plant(Mockito.mock(Timber.Tree::class.java))

        val loader = javaClass.classLoader!!
        val folder = "style/margin"
        val okStyleMargin = TestUtils().loadJSONFromAsset(loader, folder, "style_margin_ok")
        val wrongStyleMarginRect = TestUtils().loadJSONFromAsset(loader, folder, "style_margin_without_rect")

        val mediaType = MediaType.parse("application/json")

        okResponseStyleMargin = ResponseBody.create(mediaType, okStyleMargin!!)
        wrongRectResponseStyleMargin = ResponseBody.create(mediaType, wrongStyleMarginRect!!)

        gson = Gson()
    }

    @Test
    fun testStyleMarginOk() {
        val styleMargin = gson.fromJson(okResponseStyleMargin.string(), StyleMargin::class.java)
        Assert.assertEquals(73, styleMargin.rect.top)
    }

    @Test(expected = IllegalArgumentException::class)
    fun testWrongRectInStyleMargin() {
        gson.fromJson(wrongRectResponseStyleMargin.string(), StyleMargin::class.java)
    }

}