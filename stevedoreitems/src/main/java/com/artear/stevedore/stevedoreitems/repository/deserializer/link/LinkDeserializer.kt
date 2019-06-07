package com.artear.stevedore.stevedoreitems.repository.deserializer.link

import com.artear.stevedore.stevedoreitems.repository.getSafeModelObject
import com.artear.stevedore.stevedoreitems.repository.model.link.Link
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type

class LinkDeserializer : JsonDeserializer<Link> {

    override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): Link {
        val url = json.asJsonObject.get("url").asString
        val internal = json.getSafeModelObject("internal", context, String::class.java)
        return Link(url, internal)
    }

}