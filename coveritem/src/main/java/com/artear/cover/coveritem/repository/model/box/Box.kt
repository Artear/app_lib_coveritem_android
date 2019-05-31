package com.artear.cover.coveritem.repository.model.box

import com.artear.cover.coveritem.repository.model.BoxData

data class Box(var type: BoxType, val style: BoxStyle, val data: BoxData)