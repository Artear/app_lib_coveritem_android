package com.artear.stevedore.stevedoreitems.presentation.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.artear.stevedore.stevedoreitems.presentation.contract.ArtearViewHolder
import com.artear.stevedore.stevedoreitems.presentation.model.ArtearItemDecoration
import com.artear.stevedore.stevedoreitems.presentation.model.ArtearObject


class DefaultViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        ArtearViewHolder<ArtearObject<*>> {

    override fun bind(model: ArtearObject<*>, artearItemDecoration: ArtearItemDecoration) {
        //Empty. Not bind anything
    }

}