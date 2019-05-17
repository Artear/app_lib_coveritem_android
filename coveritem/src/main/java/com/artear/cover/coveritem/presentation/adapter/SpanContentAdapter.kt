package com.artear.cover.coveritem.presentation.adapter

import com.artear.cover.coveritem.presentation.contract.SpanItemAdapter


open class SpanContentAdapter(private val defaultSpanSize: Int = 0) : ContentAdapter() {

    open fun onSpanSizeRequired(position: Int): Int {
        val itemAdapter = getItemAdapter(position)
        return if (itemAdapter is SpanItemAdapter<*>)
            itemAdapter.onSpanSizeRequired(list[position])
        else
            defaultSpanSize
    }

}