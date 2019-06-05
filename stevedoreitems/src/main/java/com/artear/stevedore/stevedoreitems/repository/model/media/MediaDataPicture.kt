package com.artear.stevedore.stevedoreitems.repository.model.media


import com.artear.stevedore.stevedoreitems.repository.deserializer.media.MDPictureDeserializer
import com.artear.tools.media.Size
import com.google.gson.annotations.JsonAdapter


@JsonAdapter(MDPictureDeserializer::class)
data class MediaDataPicture(
    val url: String,
    val title: String?,
    val description: String?,
    val alt: String?,
    val size: Size
) : MediaData()

