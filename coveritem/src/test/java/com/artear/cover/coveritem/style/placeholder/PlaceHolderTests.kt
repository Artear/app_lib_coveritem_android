package com.artear.cover.coveritem.style.placeholder

import com.artear.cover.coveritem.TestUtils
import com.artear.cover.coveritem.repository.model.style.StylePlaceholder
import com.google.gson.Gson
import okhttp3.MediaType
import okhttp3.ResponseBody
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito
import timber.log.Timber


class PlaceHolderTests {

    private lateinit var gson: Gson
    private lateinit var alpha001: ResponseBody

    @Before
    @Throws(Exception::class)
    fun setUp() {

        Timber.plant(Mockito.mock(Timber.Tree::class.java))

        val loader = javaClass.classLoader!!
        val wrongMediaJson = TestUtils().loadJSONFromAsset(loader, "placeholder", "placeholder")

        val mediaType = MediaType.parse("application/json")

        alpha001 = ResponseBody.create(mediaType, wrongMediaJson!!)

        gson = Gson()
    }

    @Test
    fun testHiddenValue() {
        val placeholder = gson.fromJson(alpha001.string(), StylePlaceholder::class.java)

        Assert.assertEquals(placeholder.hidden, false)
    }
}