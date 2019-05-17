package com.artear.cover.coveritem.presentation.contract

import com.artear.cover.coveritem.presentation.model.ArtearObject
import com.artear.cover.coveritem.presentation.model.ArtearSection
import com.artear.cover.coveritem.presentation.model.ArtearStyle


interface ArtearViewHolder<T : ArtearObject<out ArtearStyle>> {
    fun bind(model: T, artearSection: ArtearSection)
}