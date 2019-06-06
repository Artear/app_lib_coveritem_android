package com.artear.stevedore.stevedoreitems.repository.deserializer.style

import com.artear.stevedore.stevedoreitems.repository.getModelObject
import com.artear.stevedore.stevedoreitems.repository.model.style.StyleMargin
import com.artear.stevedore.stevedoreitems.repository.model.style.StyleMarginRect
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type

class StyleMarginDeserializer : JsonDeserializer<StyleMargin> {

    override fun deserialize(json: JsonElement, typeOfT: Type?, context: JsonDeserializationContext): StyleMargin {
        val rect = json.getModelObject("rect", context, StyleMarginRect::class.java)
        return StyleMargin(rect)
    }

}
