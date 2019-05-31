package com.artear.cover.coveritem.repository.model.media


import com.artear.cover.coveritem.repository.deserializer.media.MCVideoDeserializer
import com.google.gson.annotations.JsonAdapter


@JsonAdapter(MCVideoDeserializer::class)
data class MediaContentVideo(
        val id: String,
        val url: String,
        val title: String,
        val image: MediaContentPicture
) : MediaContent()


