package com.artear.stevedore.stevedoreitems.repository.gson

import com.google.gson.GsonBuilder


class SimpleGsonMaker : GsonMaker {

    override fun makeGsonBuilder(): GsonBuilder {
        return GsonBuilder()
    }
}