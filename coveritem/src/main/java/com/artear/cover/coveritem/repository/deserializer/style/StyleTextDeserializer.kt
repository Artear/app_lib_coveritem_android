package com.artear.cover.coveritem.repository.deserializer.style

import com.artear.cover.coveritem.repository.getSafeModelObject
import com.artear.cover.coveritem.repository.model.style.StyleColorMode
import com.artear.cover.coveritem.repository.model.style.StyleText
import com.artear.cover.coveritem.repository.model.style.StyleUnderline
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type

class StyleTextDeserializer : JsonDeserializer<StyleText> {

    override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): StyleText {

        val hidden = json.asJsonObject.get("hidden").asBoolean
        val numberOfLines = json.asJsonObject.get("number_of_lines")?.asInt
        val color = json.getSafeModelObject("color", context, StyleColorMode::class.java)
        val underline = json.getSafeModelObject("underline", context, StyleUnderline::class.java)

        return StyleText(hidden, numberOfLines, color, underline)
    }

}