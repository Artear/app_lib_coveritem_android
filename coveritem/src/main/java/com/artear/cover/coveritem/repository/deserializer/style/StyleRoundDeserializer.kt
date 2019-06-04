package com.artear.cover.coveritem.repository.deserializer.style

import com.artear.cover.coveritem.repository.model.style.StyleRound
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type

class StyleRoundDeserializer : JsonDeserializer<StyleRound> {

    override fun deserialize(
            json: JsonElement,
            typeOfT: Type,
            context: JsonDeserializationContext
    ): StyleRound {

        val topLeft = json.asJsonObject.get("top_left").asInt
        val topRight = json.asJsonObject.get("top_right").asInt
        val bottomLeft = json.asJsonObject.get("bottom_left").asInt
        val bottomRight = json.asJsonObject.get("bottom_right").asInt

        return StyleRound(topLeft, topRight, bottomLeft, bottomRight)
    }

}