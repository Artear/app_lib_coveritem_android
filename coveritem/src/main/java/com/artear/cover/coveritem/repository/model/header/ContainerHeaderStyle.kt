package com.artear.cover.coveritem.repository.model.header

import com.artear.cover.coveritem.presentation.model.ArtearStyle
import com.artear.cover.coveritem.repository.model.style.StyleBackground
import com.artear.cover.coveritem.repository.model.style.StyleMargin
import com.artear.cover.coveritem.repository.model.style.StyleRound
import com.artear.cover.coveritem.repository.model.style.StyleText

class ContainerHeaderStyle(
    val background: StyleBackground?,
    var title: StyleText?,
    var rounded: StyleRound?,
    var margin: StyleMargin?
) : ArtearStyle()