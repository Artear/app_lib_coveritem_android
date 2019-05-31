package com.artear.cover.coveritem.repository.model.box

import com.google.gson.annotations.SerializedName

enum class BoxStyleType(val description: String) {
    @SerializedName("cell")
    CELL("cell"),
    @SerializedName("card")
    CARD("card"),
    @SerializedName("globe")
    GLOBE("globe");
}