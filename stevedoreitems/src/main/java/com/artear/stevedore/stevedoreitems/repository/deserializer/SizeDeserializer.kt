package com.artear.stevedore.stevedoreitems.repository.deserializer

import com.artear.tools.media.Size
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type

class SizeDeserializer : JsonDeserializer<Size> {

    override fun deserialize(
        json: JsonElement, typeOfT: Type,
        context: JsonDeserializationContext
    ): Size {
        val width = json.asJsonObject.get("width").asInt
        val height = json.asJsonObject.get("height").asInt
        return Size(width, height)
    }

}