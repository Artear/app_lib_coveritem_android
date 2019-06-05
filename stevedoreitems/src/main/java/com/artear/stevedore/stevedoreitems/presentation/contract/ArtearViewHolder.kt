package com.artear.stevedore.stevedoreitems.presentation.contract

import com.artear.stevedore.stevedoreitems.presentation.model.ArtearObject
import com.artear.stevedore.stevedoreitems.presentation.model.ArtearSection
import com.artear.stevedore.stevedoreitems.presentation.model.ArtearStyle


interface ArtearViewHolder<T : ArtearObject<out ArtearStyle>> {
    fun bind(model: T, artearSection: ArtearSection)
}