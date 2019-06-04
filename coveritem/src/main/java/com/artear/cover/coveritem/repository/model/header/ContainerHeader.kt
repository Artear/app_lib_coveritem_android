package com.artear.cover.coveritem.repository.model.header

import com.artear.cover.coveritem.repository.deserializer.header.ContainerHeaderDeserializer
import com.google.gson.annotations.JsonAdapter

@JsonAdapter(ContainerHeaderDeserializer::class)
data class ContainerHeader(
    val title: String,
    val style: ContainerHeaderStyle?
)