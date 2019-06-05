package com.artear.stevedore.stevedoreitems.repository.deserializer.style

import com.artear.stevedore.stevedoreitems.repository.model.style.StyleColorMode
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type

class StyleColorModeDeserializer : JsonDeserializer<StyleColorMode> {

    override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): StyleColorMode {

        val light = json.asJsonObject.get("light").asString
        val dark = json.asJsonObject.get("dark").asString

        return StyleColorMode(light, dark)
    }

}