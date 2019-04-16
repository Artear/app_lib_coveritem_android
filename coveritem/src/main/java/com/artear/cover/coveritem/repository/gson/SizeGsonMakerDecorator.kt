package com.artear.cover.coveritem.repository.gson

import com.artear.cover.coveritem.repository.deserializer.SizeDeserializer
import com.artear.tools.media.Size
import com.google.gson.GsonBuilder


class SizeGsonMakerDecorator(gsonMaker: GsonMaker) : GsonMakerDecorator(gsonMaker) {

    override fun makeGsonBuilder(): GsonBuilder {
        return gsonMaker.makeGsonBuilder()
                .registerTypeAdapter(Size::class.java, SizeDeserializer())
    }
}