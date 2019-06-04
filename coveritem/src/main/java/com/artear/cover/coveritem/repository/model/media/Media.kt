package com.artear.cover.coveritem.repository.model.media

import com.artear.cover.coveritem.repository.deserializer.media.MediaDeserializer
import com.artear.cover.coveritem.repository.model.DataWrapper

import com.google.gson.annotations.JsonAdapter

@JsonAdapter(MediaDeserializer::class)
data class Media(override val type: MediaType, override val data: MediaData, override val style: MediaStyle?) :
    DataWrapper<MediaType, MediaData, MediaStyle?>(type, data, style)