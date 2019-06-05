package com.artear.stevedore.stevedoreitems.repository.deserializer.media

import com.artear.stevedore.stevedoreitems.repository.getModelList
import com.artear.stevedore.stevedoreitems.repository.model.media.MediaDataGallery
import com.artear.stevedore.stevedoreitems.repository.model.media.MediaDataPicture
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type

class MDGalleryDeserializer : JsonDeserializer<MediaDataGallery> {

    override fun deserialize(
            json: JsonElement,
            typeOfT: Type,
            context: JsonDeserializationContext
    ): MediaDataGallery {

        val title = json.asJsonObject.get("title")?.asString
        val items = json.getModelList("items", context, MediaDataPicture::class)

        return MediaDataGallery(title, items)
    }

}
