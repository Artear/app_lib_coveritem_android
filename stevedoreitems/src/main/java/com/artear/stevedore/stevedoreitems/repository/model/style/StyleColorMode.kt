package com.artear.stevedore.stevedoreitems.repository.model.style

import com.artear.stevedore.stevedoreitems.repository.deserializer.style.StyleColorModeDeserializer
import com.google.gson.annotations.JsonAdapter

/**
 * Structure for color configurations
 * @param light [String] Light Color Value
 * @param dark [String] Dark Color Value
 */
@JsonAdapter(StyleColorModeDeserializer::class)
class StyleColorMode(
    var light: String,
    var dark: String
)