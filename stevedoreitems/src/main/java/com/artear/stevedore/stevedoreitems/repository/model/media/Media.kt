package com.artear.stevedore.stevedoreitems.repository.model.media

import com.artear.stevedore.stevedoreitems.repository.deserializer.media.MediaDeserializer

import com.google.gson.annotations.JsonAdapter

@JsonAdapter(MediaDeserializer::class)
data class Media(override val type: MediaType, override val data: MediaData, override val style: MediaStyle?) :
        DataWrapper<MediaType, MediaData, MediaStyle?>(type, data, style) {

    fun getImage(media: Media): String {
        return when (media.type) {
            MediaType.PICTURE -> (media.data as MediaDataPicture).url
            MediaType.YOUTUBE -> (media.data as MediaDataYoutube).image.url
            MediaType.GALLERY -> (media.data as MediaDataGallery).items[0].url //TODO: REVISAR
            MediaType.VIDEO -> (media.data as MediaDataVideo).image.url
        }
    }

}