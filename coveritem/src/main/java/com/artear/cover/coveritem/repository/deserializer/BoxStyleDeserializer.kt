package com.artear.cover.coveritem.repository.deserializer

import com.artear.cover.coveritem.repository.getModelObject
import com.artear.cover.coveritem.repository.getSafeModelObject
import com.artear.cover.coveritem.repository.model.box.BoxStyle
import com.artear.cover.coveritem.repository.model.box.BoxStyleType
import com.artear.cover.coveritem.repository.model.style.StyleBackground
import com.artear.cover.coveritem.repository.model.style.StyleRound
import com.artear.cover.coveritem.repository.model.style.StyleText
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type

class BoxStyleDeserializer : JsonDeserializer<BoxStyle> {

    override fun deserialize(json: JsonElement, typeOfT: Type?, context: JsonDeserializationContext): BoxStyle {

        val type = json.getModelObject("type", context, BoxStyleType::class.java)
        val weight = json.asJsonObject.get("weight").asFloat
        val background = json.getSafeModelObject("background", context, StyleBackground::class.java)
        val title = json.getSafeModelObject("title", context, StyleText::class.java)
        val description = json.getSafeModelObject("description", context, StyleText::class.java)
        val rounded = json.getSafeModelObject("rounded", context, StyleRound::class.java)

        return BoxStyle(type, weight, background, title, description, rounded)
    }

}
