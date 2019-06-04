package com.artear.cover.coveritem.repository.deserializer.media

import com.artear.cover.coveritem.repository.getSafeModelObject
import com.artear.cover.coveritem.repository.model.media.MediaStyle
import com.artear.cover.coveritem.repository.model.style.StyleBackground
import com.artear.cover.coveritem.repository.model.style.StylePlaceholder
import com.artear.cover.coveritem.repository.model.style.StyleRound
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type

class MediaStyleDeserializer : JsonDeserializer<MediaStyle> {

    override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): MediaStyle {

        val background = json.getSafeModelObject("background", context, StyleBackground::class.java)
        val placeholder = json.getSafeModelObject("placeholder", context, StylePlaceholder::class.java)
        val rounded = json.getSafeModelObject("rounded", context, StyleRound::class.java)

        return MediaStyle(background, placeholder, rounded)
    }

}