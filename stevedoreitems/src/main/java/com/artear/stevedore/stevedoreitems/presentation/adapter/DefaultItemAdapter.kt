package com.artear.stevedore.stevedoreitems.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.artear.stevedore.stevedoreitems.R
import com.artear.stevedore.stevedoreitems.presentation.contract.ArtearViewHolder
import com.artear.stevedore.stevedoreitems.presentation.contract.ItemAdapter

import com.artear.stevedore.stevedoreitems.presentation.model.ArtearItem
import com.artear.stevedore.stevedoreitems.presentation.model.ArtearObject
import com.artear.stevedore.stevedoreitems.presentation.model.ArtearSection


class DefaultItemAdapter : ItemAdapter<ArtearObject<*>> {


    override fun isForViewType(item: ArtearItem): Boolean {
        return false
    }

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.empty_item_layout, parent, false)
        return DefaultViewHolder(view)
    }

    override fun onBindViewHolderBase(
        holder: ArtearViewHolder<ArtearObject<*>>,
        model: ArtearObject<*>, artearSection: ArtearSection
    ) {
        holder.bind(model, artearSection)
    }
}