package com.artear.stevedore.stevedoreitems.repository.model.style

import com.artear.stevedore.stevedoreitems.repository.deserializer.style.StyleMarginRectDeserializer
import com.google.gson.annotations.JsonAdapter

/**
 * Object to define margins of an object.
 *
 * @param [Int] top Margin Top value
 * @param [Int] bottom Margin Bottom value
 * @param [Int] left Margin Left value
 * @param [Int] right Margin Right value
 */
@JsonAdapter(StyleMarginRectDeserializer::class)
class StyleMarginRect(
    var top: Int,
    var bottom: Int,
    var left: Int,
    var right: Int
)
