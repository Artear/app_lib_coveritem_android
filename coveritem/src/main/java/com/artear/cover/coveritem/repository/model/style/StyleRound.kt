package com.artear.cover.coveritem.repository.model.style

import com.artear.cover.coveritem.repository.deserializer.style.StyleRoundDeserializer
import com.google.gson.annotations.JsonAdapter

/**
 * Structure for round corners
 * @property topLeft Top Left Corner Radius Value [Int]
 * @property topRight Top Right Corner Radius Value [Int]
 * @property bottomLeft Bottom Left Corner Radius Value [Int]
 * @property bottomRight Bottom Right Corner Radius Value [Int]
 */
@JsonAdapter(StyleRoundDeserializer::class)
class StyleRound(

        var topLeft: Int,
        var topRight: Int,
        var bottomLeft: Int,
        var bottomRight: Int
)
