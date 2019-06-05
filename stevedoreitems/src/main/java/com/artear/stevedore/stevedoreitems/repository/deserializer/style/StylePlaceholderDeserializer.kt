package com.artear.stevedore.stevedoreitems.repository.deserializer.style

import com.artear.stevedore.stevedoreitems.repository.model.style.StylePlaceholder
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type

class StylePlaceholderDeserializer : JsonDeserializer<StylePlaceholder> {

    override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): StylePlaceholder {

        val hidden = json.asJsonObject.get("hidden").asBoolean

        return StylePlaceholder(hidden)

    }

}