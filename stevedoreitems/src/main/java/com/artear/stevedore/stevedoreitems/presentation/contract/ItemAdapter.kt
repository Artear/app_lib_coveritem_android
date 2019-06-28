package com.artear.stevedore.stevedoreitems.presentation.contract

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.artear.stevedore.stevedoreitems.presentation.model.ArtearItem
import com.artear.stevedore.stevedoreitems.presentation.model.ArtearItemDecoration
import com.artear.stevedore.stevedoreitems.presentation.model.ArtearObject
import com.artear.stevedore.stevedoreitems.presentation.model.ArtearStyle


interface ItemAdapter<T : ArtearObject<out ArtearStyle>> {

    fun isForViewType(item: ArtearItem): Boolean

    fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder

    @Suppress("UNCHECKED_CAST")
    fun onBindViewHolder(holder: RecyclerView.ViewHolder, artearItem: ArtearItem) {
        onBindViewHolderBase(holder as ArtearViewHolder<T>, artearItem.model as T, artearItem.artearItemDecoration)
    }

    fun onBindViewHolderBase(holder: ArtearViewHolder<T>, model: T, artearItemDecoration: ArtearItemDecoration)
}
