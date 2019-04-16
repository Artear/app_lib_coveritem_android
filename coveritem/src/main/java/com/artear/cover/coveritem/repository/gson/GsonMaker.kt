package com.artear.cover.coveritem.repository.gson

import com.google.gson.GsonBuilder


interface GsonMaker {

    fun makeGsonBuilder() : GsonBuilder
}