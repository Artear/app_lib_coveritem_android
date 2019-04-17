package com.artear.cover.coveritem.repository.gson

import com.google.gson.GsonBuilder


abstract class GsonMakerDecorator(protected val gsonMaker: GsonMaker) :
    GsonMaker {

    override fun makeGsonBuilder(): GsonBuilder {
        return gsonMaker.makeGsonBuilder()
    }

}