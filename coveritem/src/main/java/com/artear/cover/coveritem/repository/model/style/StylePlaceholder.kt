package com.artear.cover.coveritem.repository.model.style

import com.artear.cover.coveritem.repository.deserializer.style.StylePlaceholderDeserializer
import com.google.gson.annotations.JsonAdapter

/**
 *
 * @param [Boolean] hidden Defines visibility of PlaceHolder
 */
@JsonAdapter(StylePlaceholderDeserializer::class)
class StylePlaceholder(var hidden: Boolean)