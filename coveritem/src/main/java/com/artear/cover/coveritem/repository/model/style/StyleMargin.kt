package com.artear.cover.coveritem.repository.model.style

import com.artear.cover.coveritem.repository.deserializer.style.StyleMarginDeserializer
import com.google.gson.annotations.JsonAdapter

/**
 *
 * @param apply [Boolean]
 * @param rect [StyleMarginRect]
 */
@JsonAdapter(StyleMarginDeserializer::class)
class StyleMargin(
    var apply: Boolean,
    var rect: StyleMarginRect
)
