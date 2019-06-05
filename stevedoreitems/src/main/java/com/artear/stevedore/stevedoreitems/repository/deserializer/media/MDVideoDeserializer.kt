package com.artear.stevedore.stevedoreitems.repository.deserializer.media

import com.artear.stevedore.stevedoreitems.repository.getModelObject
import com.artear.stevedore.stevedoreitems.repository.model.media.MediaDataPicture
import com.artear.stevedore.stevedoreitems.repository.model.media.MediaDataVideo
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type

class MDVideoDeserializer : JsonDeserializer<MediaDataVideo> {

    override fun deserialize(
            json: JsonElement,
            typeOfT: Type,
            context: JsonDeserializationContext
    ): MediaDataVideo {

        val id = json.asJsonObject.get("id").asString
        val url = json.asJsonObject.get("url").asString
        val title = json.asJsonObject.get("title")?.asString
        val image = json.getModelObject("image", context, MediaDataPicture::class.java)

        return MediaDataVideo(id, url, title, image)
    }

}
