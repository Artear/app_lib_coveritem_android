package com.artear.cover.coveritem.style.color

import com.artear.cover.coveritem.TestUtils
import com.artear.cover.coveritem.repository.model.style.StyleColorMode
import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import okhttp3.MediaType
import okhttp3.ResponseBody
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.ExpectedException
import org.mockito.Mockito
import timber.log.Timber


class StyleColorDarkRequiredTest {

    private lateinit var gson: Gson
    private lateinit var responseBody: ResponseBody

    @Before
    fun setUp() {

        Timber.plant(Mockito.mock(Timber.Tree::class.java))

        val loader = javaClass.classLoader!!
        val json = TestUtils().loadJSONFromAsset(loader, "style/colors", "dark_required")

        val mediaType = MediaType.parse("application/json")

        responseBody = ResponseBody.create(mediaType, json!!)

        gson = Gson()
    }

    @Rule
    @JvmField
    var thrown: ExpectedException = ExpectedException.none()

    @Test
    @Throws(JsonSyntaxException::class)
    fun shouldFailDarkException() {
        thrown.expect(JsonSyntaxException::class.java)
        thrown.expectMessage("json.asJsonObject.get(\"dark\") must not be null")
        gson.fromJson(responseBody.string(), StyleColorMode::class.java)

    }

}