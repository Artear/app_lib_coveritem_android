package com.artear.stevedore.stevedoreitems.repository.model.box

import com.google.gson.annotations.SerializedName

enum class BoxType(val description: String) {
    @SerializedName("article")
    ARTICLE("article"),
    @SerializedName("media")
    MEDIA("media"),
    @SerializedName("tag")
    TAG("tag"),
    @SerializedName("category")
    CATEGORY("category"),
    @SerializedName("picture")
    PICTURE("picture"),
    @SerializedName("dfp")
    DFP("dfp"),
    @SerializedName("rating")
    RATING("rating");
}