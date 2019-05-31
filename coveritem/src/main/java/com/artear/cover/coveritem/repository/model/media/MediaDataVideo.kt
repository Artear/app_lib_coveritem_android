package com.artear.cover.coveritem.repository.model.media


import com.artear.cover.coveritem.repository.deserializer.media.MDVideoDeserializer
import com.google.gson.annotations.JsonAdapter


@JsonAdapter(MDVideoDeserializer::class)
data class MediaDataVideo(
        val id: String,
        val url: String,
        val title: String,
        val image: MediaDataPicture
) : MediaData()


