package com.artear.stevedore.stevedoreitems.repository.model.style

import com.artear.stevedore.stevedoreitems.repository.deserializer.style.StylePlaceholderDeserializer
import com.google.gson.annotations.JsonAdapter

/**
 *
 * @param [Boolean] hidden Defines visibility of PlaceHolder
 */
@JsonAdapter(StylePlaceholderDeserializer::class)
class StylePlaceholder(var hidden: Boolean)