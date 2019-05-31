package com.artear.cover.coveritem.repository.model.media


import com.artear.cover.coveritem.repository.deserializer.media.MCPictureDeserializer
import com.artear.tools.media.Size
import com.google.gson.annotations.JsonAdapter


@JsonAdapter(MCPictureDeserializer::class)
data class MediaContentPicture(
        val url: String,
        val title: String,
        val description: String,
        val alt: String,
        val size: Size
) : MediaContent()

