package com.artear.cover.coveritem.presentation.adapter

import com.artear.cover.coveritem.presentation.contract.SpanItemAdapter
import com.artear.tools.android.log.logW


open class SpanContentAdapter(private val defaultSpanSize: Int) : ContentAdapter() {

    open fun onSpanSizeRequired(position: Int): Int {
        val itemAdapter = getItemAdapter(position)
        return if (itemAdapter is SpanItemAdapter<*>)
            itemAdapter.onSpanSizeRequired(list[position])
        else {
            logW {
                "CoverItem Library -- SpanContentAdapter - The item adapter ${itemAdapter.javaClass} is not " +
                        "implements SpanItemAdapter. The default value = $defaultSpanSize has been returned"
            }
            defaultSpanSize
        }

    }

}