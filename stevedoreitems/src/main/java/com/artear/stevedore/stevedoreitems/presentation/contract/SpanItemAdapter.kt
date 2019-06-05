package com.artear.stevedore.stevedoreitems.presentation.contract

import com.artear.stevedore.stevedoreitems.presentation.model.ArtearItem
import com.artear.stevedore.stevedoreitems.presentation.model.ArtearObject


interface SpanItemAdapter<T : ArtearObject<*>> : ItemAdapter<T> {

    @Suppress("UNCHECKED_CAST")
    fun onSpanSizeRequired(artearItem: ArtearItem): Int {
        return onSpanSizeRequired(artearItem.model as T)
    }

    fun onSpanSizeRequired(model: T): Int
}