package com.artear.cover.coveritem.repository.model.media


import com.artear.cover.coveritem.repository.deserializer.media.MCGalleryDeserializer
import com.google.gson.annotations.JsonAdapter


@JsonAdapter(MCGalleryDeserializer::class)
data class MediaContentGallery(
        val title: String,
        val items: List<MediaContentPicture>
) : MediaContent()

