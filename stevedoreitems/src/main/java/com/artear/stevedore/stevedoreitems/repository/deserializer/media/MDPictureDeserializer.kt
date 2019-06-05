package com.artear.stevedore.stevedoreitems.repository.deserializer.media


import com.artear.stevedore.stevedoreitems.repository.getModelObject
import com.artear.stevedore.stevedoreitems.repository.model.media.MediaDataPicture
import com.artear.tools.media.Size
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type

class MDPictureDeserializer : JsonDeserializer<MediaDataPicture> {

    override fun deserialize(
            json: JsonElement,
            typeOfT: Type,
            context: JsonDeserializationContext
    ): MediaDataPicture {

        val jsonObject = json.asJsonObject

        val url = jsonObject.get("url").asString
        val title = jsonObject.get("title")?.asString
        val description = jsonObject.get("description")?.asString
        val alt = jsonObject.get("alt")?.asString
        val size = json.getModelObject("size", context, Size::class.java)

        return MediaDataPicture(url, title, description, alt, size)
    }

}
