package com.artear.cover.coveritem.repository.model.style


import com.artear.cover.coveritem.repository.deserializer.style.StyleUnderlineDeserializer
import com.google.gson.annotations.JsonAdapter

@JsonAdapter(StyleUnderlineDeserializer::class)
class StyleUnderline(
    var color: StyleColorMode
)