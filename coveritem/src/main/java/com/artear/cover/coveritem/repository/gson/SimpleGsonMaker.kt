package com.artear.cover.coveritem.repository.gson

import com.google.gson.GsonBuilder


class SimpleGsonMaker : GsonMaker {

    override fun makeGsonBuilder(): GsonBuilder {
        return GsonBuilder()
    }
}