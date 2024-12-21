package com.najahto.shopon.data.mappers

import com.najahto.shopon.data.remote.dto.ProductDto
import com.najahto.shopon.domain.models.Product

fun ProductDto.toProduct(): Product {
    return Product(
        id = id ?: -1,
        title = title ?: "",
        price = price ?: 0.0,
        category = category ?: "",
        description = description ?: "",
        image = image ?: "",
    )
}