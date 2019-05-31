package com.artear.cover.coveritem.repository.model.style

import com.artear.cover.coveritem.repository.deserializer.style.StyleColorModeDeserializer
import com.google.gson.annotations.JsonAdapter
import com.google.gson.annotations.SerializedName

@JsonAdapter(StyleColorModeDeserializer::class)
class StyleColorMode(
        @SerializedName("light")
        var light: String,
        @SerializedName("dark")
        var dark: String
)