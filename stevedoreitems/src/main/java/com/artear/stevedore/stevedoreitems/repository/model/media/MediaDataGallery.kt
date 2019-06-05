package com.artear.stevedore.stevedoreitems.repository.model.media


import com.artear.stevedore.stevedoreitems.repository.deserializer.media.MDGalleryDeserializer
import com.google.gson.annotations.JsonAdapter


@JsonAdapter(MDGalleryDeserializer::class)
data class MediaDataGallery(
    val title: String?,
    val items: List<MediaDataPicture>
) : MediaData()

