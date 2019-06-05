package com.artear.stevedore.stevedoreitems.repository.model.media


import com.artear.stevedore.stevedoreitems.repository.deserializer.media.MDVideoDeserializer
import com.google.gson.annotations.JsonAdapter


@JsonAdapter(MDVideoDeserializer::class)
data class MediaDataVideo(
    val id: String,
    val url: String,
    val title: String?,
    val image: MediaDataPicture
) : MediaData()


