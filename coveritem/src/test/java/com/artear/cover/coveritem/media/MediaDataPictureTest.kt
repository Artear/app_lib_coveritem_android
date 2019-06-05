package com.artear.cover.coveritem.media

import com.artear.cover.coveritem.TestUtils
import com.artear.cover.coveritem.repository.model.media.MediaDataPicture
import com.google.gson.Gson
import okhttp3.MediaType
import okhttp3.ResponseBody
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito
import timber.log.Timber


class MediaDataPictureTest {


    private lateinit var gson: Gson
    private lateinit var justNecessaryFieldsResponse: ResponseBody

    @Before
    fun setUp() {

        Timber.plant(Mockito.mock(Timber.Tree::class.java))

        val loader = javaClass.classLoader!!
        val justNecessaryFields = TestUtils().loadJSONFromAsset(loader, "media", "media_picture_only_necessary")

        val mediaType = MediaType.parse("application/json")

        justNecessaryFieldsResponse = ResponseBody.create(mediaType, justNecessaryFields!!)

        gson = Gson()
    }

    @Test
    fun testJustNecessaryField() {
        val mediaDataPicture = gson.fromJson(justNecessaryFieldsResponse.string(), MediaDataPicture::class.java)
        Assert.assertEquals("url", mediaDataPicture.url)
        Assert.assertEquals(2, mediaDataPicture.size.height)
        Assert.assertEquals(2, mediaDataPicture.size.width)
        Assert.assertNull(mediaDataPicture.title)
        Assert.assertNull(mediaDataPicture.description)
        Assert.assertNull(mediaDataPicture.alt)
    }


}