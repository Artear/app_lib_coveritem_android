package com.artear.cover.coveritem.repository.model.media

abstract class DataWrapper<Type : Enum<Type>, Data, Style>(
    open val type: Type,
    open val data: Data,
    open val style: Style
)
