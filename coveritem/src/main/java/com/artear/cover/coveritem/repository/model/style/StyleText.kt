package com.artear.cover.coveritem.repository.model.style

import com.artear.cover.coveritem.repository.deserializer.style.StyleTextDeserializer
import com.google.gson.annotations.JsonAdapter

/**
 * Structure for text visualization
 *
 * @param hidden [Boolean] Indicates if owner has to be shown
 * @param numberOfLines [Int] Max number of lines shown
 * @param color [StyleColorMode] Color configuration
 * @param underline [StyleUnderline] Underline configuration
 */
@JsonAdapter(StyleTextDeserializer::class)
class StyleText(
    var hidden: Boolean,
    var numberOfLines: Int?,
    var color: StyleColorMode?,
    var underline: StyleUnderline?
)