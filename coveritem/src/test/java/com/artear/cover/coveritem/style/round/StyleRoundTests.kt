package com.artear.cover.coveritem.style.round

import com.artear.cover.coveritem.TestUtils
import com.artear.cover.coveritem.repository.model.style.StyleRound
import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import okhttp3.MediaType
import okhttp3.ResponseBody
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.ExpectedException
import org.mockito.Mockito
import timber.log.Timber


class StyleRoundTests {

    private lateinit var gson: Gson
    private lateinit var loader: ClassLoader

    @Before
    fun setUp() {

        Timber.plant(Mockito.mock(Timber.Tree::class.java))

        loader = javaClass.classLoader!!


    }

    @Test
    fun okTest() {

        val jsonOk = TestUtils().loadJSONFromAsset(loader, "style/round", "ok")
        val mediaType = MediaType.parse("application/json")
        var responseBody = ResponseBody.create(mediaType, jsonOk!!)

        gson = Gson()

        val styleRound = gson.fromJson(responseBody.string(), StyleRound::class.java)
        Assert.assertEquals(styleRound.topLeft, 10)
        Assert.assertEquals(styleRound.topRight, 20)
        Assert.assertEquals(styleRound.bottomLeft, 30)
        Assert.assertEquals(styleRound.bottomRight, 40)
    }


    @Rule
    @JvmField
    var thrown: ExpectedException = ExpectedException.none()

    @Test
    @Throws(JsonSyntaxException::class)
    fun bottomLeftRequiredTest() {
        thrown.expect(JsonSyntaxException::class.java)
        thrown.expectMessage("json.asJsonObject.get(\"bottom_left\") must not be null")
        val bottomLeftRequired = TestUtils().loadJSONFromAsset(loader, "style/round", "bottom_left_required")
        val mediaType = MediaType.parse("application/json")
        var responseBody = ResponseBody.create(mediaType, bottomLeftRequired!!)

        gson = Gson()

        val styleRound = gson.fromJson(responseBody.string(), StyleRound::class.java)
        Assert.assertEquals(styleRound.bottomLeft, false)
    }

    @Test
    @Throws(JsonSyntaxException::class)
    fun bottomRightRequiredTest() {
        thrown.expect(JsonSyntaxException::class.java)
        thrown.expectMessage("json.asJsonObject.get(\"bottom_right\") must not be null")
        val bottomRightRequired = TestUtils().loadJSONFromAsset(loader, "style/round", "bottom_right_required")
        val mediaType = MediaType.parse("application/json")
        var responseBody = ResponseBody.create(mediaType, bottomRightRequired!!)

        gson = Gson()

        val styleRound = gson.fromJson(responseBody.string(), StyleRound::class.java)
        Assert.assertEquals(styleRound, false)
    }

    @Test
    @Throws(JsonSyntaxException::class)
    fun topRightRequiredTest() {
        thrown.expect(JsonSyntaxException::class.java)
        thrown.expectMessage("json.asJsonObject.get(\"top_right\") must not be null")
        val topRightRequired = TestUtils().loadJSONFromAsset(loader, "style/round", "top_right_required")
        val mediaType = MediaType.parse("application/json")
        var responseBody = ResponseBody.create(mediaType, topRightRequired!!)

        gson = Gson()

        val styleRound = gson.fromJson(responseBody.string(), StyleRound::class.java)
        Assert.assertEquals(styleRound, false)
    }

    @Test
    @Throws(JsonSyntaxException::class)
    fun topLeftRequiredTest() {
        thrown.expect(JsonSyntaxException::class.java)
        thrown.expectMessage("json.asJsonObject.get(\"top_left\") must not be null")
        val topLeftRequired = TestUtils().loadJSONFromAsset(loader, "style/round", "top_left_required")
        val mediaType = MediaType.parse("application/json")
        var responseBody = ResponseBody.create(mediaType, topLeftRequired!!)

        gson = Gson()

        val styleRound = gson.fromJson(responseBody.string(), StyleRound::class.java)
        Assert.assertEquals(styleRound, false)
    }

}