package com.artear.stevedore.stevedoreitems.repository.deserializer.style

import com.artear.stevedore.stevedoreitems.repository.model.style.StyleMarginRect
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type

class StyleMarginRectDeserializer : JsonDeserializer<StyleMarginRect> {

    override fun deserialize(
        json: JsonElement,
        typeOfT: Type?,
        context: JsonDeserializationContext
    ): StyleMarginRect {

        val top = json.asJsonObject.get("top").asInt
        val bottom = json.asJsonObject.get("bottom").asInt
        val left = json.asJsonObject.get("left").asInt
        val right = json.asJsonObject.get("right").asInt

        return StyleMarginRect(top, bottom, left, right)
    }

}
