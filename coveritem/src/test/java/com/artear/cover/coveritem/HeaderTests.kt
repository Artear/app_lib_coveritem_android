package com.artear.cover.coveritem

import com.artear.cover.coveritem.repository.model.header.ContainerHeader
import com.google.gson.Gson
import okhttp3.MediaType
import okhttp3.ResponseBody
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito
import timber.log.Timber


class HeaderTests {

    private lateinit var gson: Gson
    private lateinit var alpha001: ResponseBody

    @Before
    @Throws(Exception::class)
    fun setUp() {

        Timber.plant(Mockito.mock(Timber.Tree::class.java))

        val loader = javaClass.classLoader!!
        val wrongMediaJson = TestUtils().loadJSONFromAsset(loader, "header", "header")

        val mediaType = MediaType.parse("application/json")

        alpha001 = ResponseBody.create(mediaType, wrongMediaJson!!)

        gson = Gson()
    }

    @Test
    fun testHeaderTitle() {
        val block = gson.fromJson(alpha001.string(), ContainerHeader::class.java)

        Assert.assertEquals(block.title, "Esto es un Header")
    }
}