package com.artear.stevedore.stevedoreitems.repository.model.style

import com.artear.stevedore.stevedoreitems.repository.deserializer.style.StyleBackgroundDeserializer
import com.google.gson.annotations.JsonAdapter
import com.google.gson.annotations.SerializedName

@JsonAdapter(StyleBackgroundDeserializer::class)
class StyleBackground(
    @SerializedName("color")
    var color: StyleColorMode
)