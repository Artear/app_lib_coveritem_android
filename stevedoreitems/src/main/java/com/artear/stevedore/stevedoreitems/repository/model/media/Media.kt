package com.artear.stevedore.stevedoreitems.repository.model.media

import com.artear.stevedore.stevedoreitems.repository.deserializer.media.MediaDeserializer
import com.artear.stevedore.stevedoreitems.repository.model.media.MediaType.*

import com.google.gson.annotations.JsonAdapter

@JsonAdapter(MediaDeserializer::class)
data class Media(override val type: MediaType, override val data: MediaData, override val style: MediaStyle?) :
        DataWrapper<MediaType, MediaData, MediaStyle?>(type, data, style) {

    fun getImage(media: Media): String? {
        return when (media.type) {
            PICTURE -> (media.data as MediaDataPicture).url
            YOUTUBE -> (media.data as MediaDataYoutube).image.url
            GALLERY -> {
                val items = (media.data as MediaDataGallery).items
                when {
                    items.isNotEmpty() -> items[0].url
                    else -> null
                }

            }
            VIDEO -> (media.data as MediaDataVideo).image.url
        }
    }

}