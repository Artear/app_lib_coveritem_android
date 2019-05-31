package com.artear.cover.coveritem.repository.deserializer.media

import com.artear.cover.coveritem.repository.getModelObject
import com.artear.cover.coveritem.repository.model.media.MediaStyle
import com.artear.cover.coveritem.repository.model.style.StyleBackground
import com.artear.cover.coveritem.repository.model.style.StylePlaceholder
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type

class MediaStyleDeserializer : JsonDeserializer<MediaStyle> {

    override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): MediaStyle {

        val background = json.getModelObject("background", context, StyleBackground::class.java)
        val placeholder = json.getModelObject("placeholder", context, StylePlaceholder::class.java)

        return MediaStyle(background, placeholder)
    }

}