package com.artear.stevedore.stevedoreitems.repository.deserializer.media


import com.artear.stevedore.stevedoreitems.repository.getModelObject
import com.artear.stevedore.stevedoreitems.repository.getSafeModelObject
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

        val url = json.asJsonObject.get("url").asString
        val title = json.getSafeModelObject("title", context, String::class.java)
        val description = json.getSafeModelObject("description", context, String::class.java)
        val alt = json.getSafeModelObject("description", context, String::class.java)
        val size = json.getModelObject("size", context, Size::class.java)

        return MediaDataPicture(url, title, description, alt, size)
    }


}
