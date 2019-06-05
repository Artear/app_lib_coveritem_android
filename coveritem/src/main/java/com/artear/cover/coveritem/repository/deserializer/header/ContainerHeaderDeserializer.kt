package com.artear.cover.coveritem.repository.deserializer.header

import com.artear.cover.coveritem.repository.getSafeModelObject
import com.artear.cover.coveritem.repository.model.header.ContainerHeader
import com.artear.cover.coveritem.repository.model.header.ContainerHeaderStyle
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type

class ContainerHeaderDeserializer : JsonDeserializer<ContainerHeader> {

    override fun deserialize(json: JsonElement, typeOfT: Type?, context: JsonDeserializationContext): ContainerHeader {

        val title = json.asJsonObject.get("title").asString
        val style = json.getSafeModelObject("style", context, ContainerHeaderStyle::class.java)

        return ContainerHeader(title,style)
    }

}
