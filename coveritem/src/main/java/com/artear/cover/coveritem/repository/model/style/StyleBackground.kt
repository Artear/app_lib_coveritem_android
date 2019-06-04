package com.artear.cover.coveritem.repository.model.style

import com.artear.cover.coveritem.repository.deserializer.style.StyleBackgroundDeserializer
import com.google.gson.annotations.JsonAdapter
import com.google.gson.annotations.SerializedName

@JsonAdapter(StyleBackgroundDeserializer::class)
class StyleBackground(
        @SerializedName("color")
        var color: StyleColorMode
)