package com.artear.cover.coveritem.repository.deserializer.media

import com.artear.cover.coveritem.repository.getModelList
import com.artear.cover.coveritem.repository.model.media.MediaContentGallery
import com.artear.cover.coveritem.repository.model.media.MediaContentPicture
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type

class MCGalleryDeserializer : JsonDeserializer<MediaContentGallery> {

    override fun deserialize(
            json: JsonElement,
            typeOfT: Type,
            context: JsonDeserializationContext
    ): MediaContentGallery {

        val title = json.asJsonObject.get("title").asString
        val items = json.getModelList("items", context, MediaContentPicture::class)

        return MediaContentGallery(title, items)
    }

}
