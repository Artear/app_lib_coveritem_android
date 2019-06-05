package com.artear.stevedore.stevedoreitems.repository.model.box

import com.artear.stevedore.stevedoreitems.presentation.model.ArtearStyle
import com.artear.stevedore.stevedoreitems.repository.deserializer.BoxStyleDeserializer
import com.artear.stevedore.stevedoreitems.repository.model.style.StyleBackground
import com.artear.stevedore.stevedoreitems.repository.model.style.StyleRound
import com.artear.stevedore.stevedoreitems.repository.model.style.StyleText
import com.google.gson.annotations.JsonAdapter
import com.google.gson.annotations.SerializedName

@JsonAdapter(BoxStyleDeserializer::class)
class BoxStyle(
    @SerializedName("type")
    var type: BoxStyleType,
    @SerializedName("weight")
    val weight: Float,
    @SerializedName("background")
    val background: StyleBackground?,
    @SerializedName("title")
    val title: StyleText?,
    @SerializedName("description")
    val description: StyleText?,
    @SerializedName("rounded")
    val rounded: StyleRound?
) : ArtearStyle()