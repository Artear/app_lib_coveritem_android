package com.artear.cover.coveritem.repository.model.style

import com.artear.cover.coveritem.repository.deserializer.style.StylePlaceholderDeserializer
import com.google.gson.annotations.JsonAdapter

@JsonAdapter(StylePlaceholderDeserializer::class)
class StylePlaceholder(val hidden: Boolean)