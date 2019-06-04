package com.artear.cover.coveritem

import com.artear.cover.coveritem.repository.model.box.BoxStyle
import com.artear.cover.coveritem.repository.model.box.BoxStyleType
import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import okhttp3.MediaType
import okhttp3.ResponseBody
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito
import timber.log.Timber


class BoxStyleTest {


    private lateinit var gson: Gson
    private lateinit var okBoxStyleResponse: ResponseBody
    private lateinit var withoutWeightBoxStyleResponse: ResponseBody
    private lateinit var wrongTypeBoxStyleResponse: ResponseBody

    @Before
    fun setUp() {

        Timber.plant(Mockito.mock(Timber.Tree::class.java))

        val loader = javaClass.classLoader!!
        val okBoxStyle = TestUtils().loadJSONFromAsset(loader, "box", "box_style_ok")
        val withoutWeightBoxStyle = TestUtils().loadJSONFromAsset(loader, "box", "box_style_without_weight")
        val wrongTypeBoxStyle = TestUtils().loadJSONFromAsset(loader, "box", "box_style_wrong_type")

        val mediaType = MediaType.parse("application/json")

        okBoxStyleResponse = ResponseBody.create(mediaType, okBoxStyle!!)
        withoutWeightBoxStyleResponse = ResponseBody.create(mediaType, withoutWeightBoxStyle!!)
        wrongTypeBoxStyleResponse = ResponseBody.create(mediaType, wrongTypeBoxStyle!!)

        gson = Gson()
    }

    @Test
    fun testBoxStyleComplete() {
        val boxStyle = gson.fromJson(okBoxStyleResponse.string(), BoxStyle::class.java)
        Assert.assertEquals(BoxStyleType.PLAIN, boxStyle.type)
        Assert.assertEquals(0.5f, boxStyle.weight)
    }

    @Test(expected = JsonSyntaxException::class)
    fun testBoxStyleWithoutWeight() {
        gson.fromJson(withoutWeightBoxStyleResponse.string(), BoxStyle::class.java)
    }

    @Test(expected = IllegalArgumentException::class)
    fun testBoxStyleWrongType() {
        gson.fromJson(wrongTypeBoxStyleResponse.string(), BoxStyle::class.java)
    }

}