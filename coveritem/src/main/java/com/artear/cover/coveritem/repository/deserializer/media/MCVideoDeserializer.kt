package com.artear.cover.coveritem.repository.deserializer.media

import com.artear.cover.coveritem.repository.getModelObject
import com.artear.cover.coveritem.repository.model.media.MediaContentPicture
import com.artear.cover.coveritem.repository.model.media.MediaContentVideo
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type

class MCVideoDeserializer : JsonDeserializer<MediaContentVideo> {

    override fun deserialize(
            json: JsonElement,
            typeOfT: Type,
            context: JsonDeserializationContext
    ): MediaContentVideo {

        val id = json.asJsonObject.get("id").asString
        val url = json.asJsonObject.get("url").asString
        val title = json.asJsonObject.get("title").asString
        val image = json.getModelObject("image", context, MediaContentPicture::class.java)

        return MediaContentVideo(id, url, title, image)
    }

}
