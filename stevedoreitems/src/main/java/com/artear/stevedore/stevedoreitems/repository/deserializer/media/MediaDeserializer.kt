package com.artear.stevedore.stevedoreitems.repository.deserializer.media

import com.artear.stevedore.stevedoreitems.repository.DeserializerUtil.Companion.getDataFromJson
import com.artear.stevedore.stevedoreitems.repository.DeserializerUtil.Companion.getStyleFromJson
import com.artear.stevedore.stevedoreitems.repository.DeserializerUtil.Companion.getTypeFromJson
import com.artear.stevedore.stevedoreitems.repository.model.media.*
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type

class MediaDeserializer : JsonDeserializer<Media> {

    override fun deserialize(json: JsonElement, typeOfT: Type?, context: JsonDeserializationContext): Media {

        val type = getTypeFromJson<MediaType>(context, json)

        val data = when (type) {
            MediaType.PICTURE -> getDataFromJson<MediaDataPicture>(context, json)
            MediaType.YOUTUBE -> getDataFromJson<MediaDataYoutube>(context, json)
            MediaType.GALLERY -> getDataFromJson<MediaDataGallery>(context, json)
            MediaType.VIDEO -> getDataFromJson<MediaDataVideo>(context, json)
        }

        val style = getStyleFromJson<MediaStyle>(context, json)

        return Media(type, data, style)
    }

}
