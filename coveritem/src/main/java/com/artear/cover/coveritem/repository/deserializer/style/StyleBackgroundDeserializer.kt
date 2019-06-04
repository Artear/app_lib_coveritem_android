package com.artear.cover.coveritem.repository.deserializer.style

import com.artear.cover.coveritem.repository.getModelObject
import com.artear.cover.coveritem.repository.model.style.StyleBackground
import com.artear.cover.coveritem.repository.model.style.StyleColorMode
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type

class StyleBackgroundDeserializer : JsonDeserializer<StyleBackground> {

    override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): StyleBackground {
        val color = json.getModelObject("color", context, StyleColorMode::class.java)
        return StyleBackground(color)
    }

}