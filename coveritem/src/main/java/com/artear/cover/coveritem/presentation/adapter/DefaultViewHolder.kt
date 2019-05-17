package com.artear.cover.coveritem.presentation.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.artear.cover.coveritem.presentation.contract.ArtearViewHolder
import com.artear.cover.coveritem.presentation.model.ArtearObject
import com.artear.cover.coveritem.presentation.model.ArtearSection


class DefaultViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
    ArtearViewHolder<ArtearObject<*>> {

    override fun bind(model: ArtearObject<*>, artearSection: ArtearSection) {
        //Empty. Not bind anything
    }

}