package com.artear.stevedore.stevedoreitems.repository.deserializer.media

import com.artear.stevedore.stevedoreitems.repository.getModelObject
import com.artear.stevedore.stevedoreitems.repository.getSafeModelObject
import com.artear.stevedore.stevedoreitems.repository.model.media.MediaDataPicture
import com.artear.stevedore.stevedoreitems.repository.model.media.MediaDataYoutube
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
        val title = json.getSafeModelObject("title", context, String::class.java)
        val image = json.getModelObject("image", context, MediaDataPicture::class.java)

        return MediaDataYoutube(id, url, title, image)
    }

}
