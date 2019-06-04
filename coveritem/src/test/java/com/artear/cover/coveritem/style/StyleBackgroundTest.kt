package com.artear.cover.coveritem.style

import com.artear.cover.coveritem.TestUtils
import com.artear.cover.coveritem.repository.model.style.StyleBackground
import com.google.gson.Gson
import okhttp3.MediaType
import okhttp3.ResponseBody
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito
import timber.log.Timber


class StyleBackgroundTest {


    private lateinit var gson: Gson
    private lateinit var okResponseBackground: ResponseBody
    private lateinit var wrongResponseBackground: ResponseBody

    @Before
    fun setUp() {

        Timber.plant(Mockito.mock(Timber.Tree::class.java))

        val loader = javaClass.classLoader!!
        val okStyleBackground = TestUtils().loadJSONFromAsset(loader, "style/background", "style_background_ok")
        val wrongStyleBackground = TestUtils().loadJSONFromAsset(loader, "style/background", "style_background_wrong")

        val mediaType = MediaType.parse("application/json")

        okResponseBackground = ResponseBody.create(mediaType, okStyleBackground!!)
        wrongResponseBackground = ResponseBody.create(mediaType, wrongStyleBackground!!)

        gson = Gson()
    }

    @Test
    fun testBackgroundColorOk() {
        val styleBackground = gson.fromJson(okResponseBackground.string(), StyleBackground::class.java)
        Assert.assertEquals("#660066", styleBackground.color.dark)
    }

    @Test(expected = IllegalArgumentException::class)
    fun testBackgroundMissingColor() {
        gson.fromJson(wrongResponseBackground.string(), StyleBackground::class.java)
    }

}