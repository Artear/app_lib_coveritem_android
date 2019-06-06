package com.artear.stevedore.stevedoreitems.repository.model.style

import com.artear.stevedore.stevedoreitems.repository.deserializer.style.StyleMarginDeserializer
import com.google.gson.annotations.JsonAdapter

/**
 *
 * @param apply [Boolean]
 * @param rect [StyleMarginRect]
 */
@JsonAdapter(StyleMarginDeserializer::class)
class StyleMargin(
    var rect: StyleMarginRect
)
