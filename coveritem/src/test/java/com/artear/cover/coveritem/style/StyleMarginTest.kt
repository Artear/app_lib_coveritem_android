package com.artear.cover.coveritem.style

import com.artear.cover.coveritem.TestUtils
import com.artear.cover.coveritem.repository.model.style.StyleMargin
import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
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
    private lateinit var wrongResponseStyleMargin: ResponseBody
    private lateinit var wrongRectResponseStyleMargin: ResponseBody

    @Before
    fun setUp() {
        Timber.plant(Mockito.mock(Timber.Tree::class.java))

        val loader = javaClass.classLoader!!
        val folder = "style/margin"
        val okStyleMargin = TestUtils().loadJSONFromAsset(loader, folder, "style_margin_ok")
        val wrongStyleMargin = TestUtils().loadJSONFromAsset(loader, folder, "style_margin_wrong")
        val wrongStyleMarginRect = TestUtils().loadJSONFromAsset(loader, folder, "style_margin_without_rect")

        val mediaType = MediaType.parse("application/json")

        okResponseStyleMargin = ResponseBody.create(mediaType, okStyleMargin!!)
        wrongResponseStyleMargin = ResponseBody.create(mediaType, wrongStyleMargin!!)
        wrongRectResponseStyleMargin = ResponseBody.create(mediaType, wrongStyleMarginRect!!)

        gson = Gson()
    }

    @Test
    fun testStyleMarginOk() {
        val styleMargin = gson.fromJson(okResponseStyleMargin.string(), StyleMargin::class.java)
        Assert.assertEquals(true, styleMargin.apply)
        Assert.assertEquals(73, styleMargin.rect.top)
    }

    @Test(expected = JsonSyntaxException::class)
    fun testWrongApplyStyleMargin() {
        gson.fromJson(wrongResponseStyleMargin.string(), StyleMargin::class.java)
    }

    @Test(expected = IllegalArgumentException::class)
    fun testWrongRectInStyleMargin() {
        gson.fromJson(wrongRectResponseStyleMargin.string(), StyleMargin::class.java)
    }

}