package com.artear.stevedore.stevedoreitems.repository.model.media

import com.artear.stevedore.stevedoreitems.repository.deserializer.media.MediaDeserializer

import com.google.gson.annotations.JsonAdapter

@JsonAdapter(MediaDeserializer::class)
data class Media(override val type: MediaType, override val data: MediaData, override val style: MediaStyle?) :
    DataWrapper<MediaType, MediaData, MediaStyle?>(type, data, style)