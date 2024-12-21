package com.najahto.shopon.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
class ProductResponseDto (
    val data: List<ProductDto>
)