package com.artear.cover.coveritem.repository.model.style

import com.artear.cover.coveritem.repository.deserializer.style.StyleTextDeserializer
import com.google.gson.annotations.JsonAdapter

/**
 * Structure for text visualization
 *
 * @property hidden [Boolean] Indicates if owner has to be shown
 * @property numberOfLines [Int] Max number of lines shown
 * @property color [StyleColorMode] Color configuration
 * @property underline [StyleUnderline] Underline configuration
 */
@JsonAdapter(StyleTextDeserializer::class)
class StyleText(
        var hidden: Boolean,
        var numberOfLines: Int? = 0,
        var color: StyleColorMode?,
        var underline: StyleUnderline?
)