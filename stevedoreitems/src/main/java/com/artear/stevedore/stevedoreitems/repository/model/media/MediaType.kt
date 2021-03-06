package com.artear.stevedore.stevedoreitems.repository.model.media

import com.google.gson.annotations.SerializedName

enum class MediaType {
    @SerializedName("picture")
    PICTURE,
    @SerializedName("youtube")
    YOUTUBE,
    @SerializedName("gallery")
    GALLERY,
    @SerializedName("video")
    VIDEO,
}
