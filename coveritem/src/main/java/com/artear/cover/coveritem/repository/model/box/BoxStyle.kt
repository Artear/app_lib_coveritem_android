package com.artear.cover.coveritem.repository.model.box

import com.artear.cover.coveritem.presentation.model.ArtearStyle
import com.artear.cover.coveritem.repository.model.style.StyleBackground
import com.artear.cover.coveritem.repository.model.style.StyleText
import com.google.gson.annotations.SerializedName

class BoxStyle(
        @SerializedName("type")
        var type: BoxStyleType,
        @SerializedName("weight")
        val weight: Float? = 1f,
        @SerializedName("background")
        val background: StyleBackground,
        @SerializedName("title")
        val title: StyleText,
        @SerializedName("description")
        val description: StyleText
) : ArtearStyle()