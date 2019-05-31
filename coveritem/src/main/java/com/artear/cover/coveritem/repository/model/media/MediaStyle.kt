package com.artear.cover.coveritem.repository.model.media

import com.artear.cover.coveritem.repository.deserializer.media.MediaStyleDeserializer
import com.artear.cover.coveritem.repository.model.style.StyleBackground
import com.artear.cover.coveritem.repository.model.style.StylePlaceholder
import com.google.gson.annotations.JsonAdapter


@JsonAdapter(MediaStyleDeserializer::class)
data class MediaStyle(val background: StyleBackground, val placeholder: StylePlaceholder)