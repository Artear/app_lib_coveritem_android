package com.artear.stevedore.stevedoreitems.repository.deserializer.style

import com.artear.stevedore.stevedoreitems.repository.getModelObject
import com.artear.stevedore.stevedoreitems.repository.model.style.StyleBackground
import com.artear.stevedore.stevedoreitems.repository.model.style.StyleColorMode
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