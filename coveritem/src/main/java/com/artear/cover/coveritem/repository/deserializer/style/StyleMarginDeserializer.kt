package com.artear.cover.coveritem.repository.deserializer.style

import com.artear.cover.coveritem.repository.getModelObject
import com.artear.cover.coveritem.repository.model.style.StyleMargin
import com.artear.cover.coveritem.repository.model.style.StyleMarginRect
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type

class StyleMarginDeserializer : JsonDeserializer<StyleMargin> {

    override fun deserialize(json: JsonElement, typeOfT: Type?, context: JsonDeserializationContext): StyleMargin {

        val apply = json.asJsonObject.get("apply").asBoolean
        val rect = json.getModelObject("rect", context, StyleMarginRect::class.java)

        return StyleMargin(apply, rect)
    }

}
