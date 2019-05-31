package com.artear.cover.coveritem.repository.deserializer.media

import com.artear.cover.coveritem.repository.getModelObject
import com.artear.cover.coveritem.repository.model.media.MediaDataPicture
import com.artear.cover.coveritem.repository.model.media.MediaDataYoutube
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type

class MDYoutubeDeserializer : JsonDeserializer<MediaDataYoutube> {

    override fun deserialize(
            json: JsonElement,
            typeOfT: Type,
            context: JsonDeserializationContext
    ): MediaDataYoutube {

        val id = json.asJsonObject.get("id").asString
        val url = json.asJsonObject.get("url").asString
        val title = json.asJsonObject.get("title").asString
        val image = json.getModelObject("image", context, MediaDataPicture::class.java)

        return MediaDataYoutube(id, url, title, image)
    }

}
