package com.artear.stevedore.stevedoreitems.repository.model.style


import com.artear.stevedore.stevedoreitems.repository.deserializer.style.StyleUnderlineDeserializer
import com.google.gson.annotations.JsonAdapter

@JsonAdapter(StyleUnderlineDeserializer::class)
class StyleUnderline(
    var color: StyleColorMode
)