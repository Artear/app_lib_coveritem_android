package com.artear.cover.coveritem.presentation.contract

import com.artear.cover.coveritem.presentation.model.ArtearItem
import com.artear.cover.coveritem.presentation.model.ArtearObject


interface SpanItemAdapter<T : ArtearObject<*>> : ItemAdapter<T> {

    @Suppress("UNCHECKED_CAST")
    fun onSpanSizeRequired(artearItem: ArtearItem): Int {
        return onSpanSizeRequired(artearItem.model as T)
    }

    fun onSpanSizeRequired(model: T): Int
}