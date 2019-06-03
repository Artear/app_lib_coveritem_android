package com.artear.cover.coveritem.style.color

import com.artear.cover.coveritem.TestUtils
import com.artear.cover.coveritem.repository.model.style.StyleColorMode
import com.google.gson.Gson
import okhttp3.MediaType
import okhttp3.ResponseBody
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito
import timber.log.Timber


class StyleColorOkTest {

    private lateinit var gson: Gson
    private lateinit var responseBody: ResponseBody

    @Before
    fun setUp() {

        Timber.plant(Mockito.mock(Timber.Tree::class.java))

        val loader = javaClass.classLoader!!
        val json = TestUtils().loadJSONFromAsset(loader, "style/colors", "ok")

        val mediaType = MediaType.parse("application/json")

        responseBody = ResponseBody.create(mediaType, json!!)

        gson = Gson()
    }

    @Test
    fun lightColorTest() {
        val colorMode = gson.fromJson(responseBody.string(), StyleColorMode::class.java)
        Assert.assertEquals(colorMode.light, "#CC00CC")
    }

    @Test
    fun darkColorTest() {
        val colorMode = gson.fromJson(responseBody.string(), StyleColorMode::class.java)
        Assert.assertEquals(colorMode.dark, "#330033")
    }

}