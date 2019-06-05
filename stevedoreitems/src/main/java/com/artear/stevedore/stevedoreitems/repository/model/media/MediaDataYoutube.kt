package com.artear.stevedore.stevedoreitems.repository.model.media

import com.artear.stevedore.stevedoreitems.repository.deserializer.media.MDYoutubeDeserializer
import com.google.gson.annotations.JsonAdapter

@JsonAdapter(MDYoutubeDeserializer::class)
data class MediaDataYoutube(
    val id: String,
    val url: String,
    val title: String?,
    val image: MediaDataPicture
) : MediaData()