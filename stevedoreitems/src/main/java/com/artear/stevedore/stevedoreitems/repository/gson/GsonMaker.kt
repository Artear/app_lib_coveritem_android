package com.artear.stevedore.stevedoreitems.repository.gson

import com.google.gson.GsonBuilder


interface GsonMaker {

    fun makeGsonBuilder(): GsonBuilder
}