package com.artear.cover.coveritem.repository.model.style

import com.google.gson.annotations.SerializedName


class StyleText(
        @SerializedName("hidden")
        var hidden: Boolean,
        @SerializedName("number_of_lines")
        var numberOfLines: Int,
        @SerializedName("color")
        var color: StyleColorMode,
        @SerializedName("underline")
        var underline: StyleUnderline
)