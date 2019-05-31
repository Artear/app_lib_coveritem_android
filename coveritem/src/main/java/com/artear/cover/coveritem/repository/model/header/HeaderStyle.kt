package com.artear.cover.coveritem.repository.model.header

import com.artear.cover.coveritem.presentation.model.ArtearStyle
import com.artear.cover.coveritem.repository.model.style.StyleBackground
import com.artear.cover.coveritem.repository.model.style.StyleText

class HeaderStyle(
        val background: StyleBackground,
        var title: StyleText
) : ArtearStyle()