package com.artear.stevedore.stevedoreitems.repository.model.box

import com.google.gson.annotations.SerializedName

enum class BoxStyleType(val description: String) {
    @SerializedName("plain")
    PLAIN("plain"),
    @SerializedName("plain_background")
    PLAIN_BACKGROUND("plain_background"),
    @SerializedName("plain_horizontal")
    PLAIN_HORIZONTAL("plain_horizontal"),
    @SerializedName("card")
    CARD("card"),
    @SerializedName("globe")
    GLOBE("globe"),
    @SerializedName("globe_card")
    GLOBE_CARD("globe_card");
}