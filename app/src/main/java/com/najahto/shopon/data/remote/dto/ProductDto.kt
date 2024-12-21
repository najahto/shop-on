package com.najahto.shopon.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class ProductDto (
    val id: Long?,
    val title: String?,
    val price: Double?,
    val category: String?,
    val description: String?,
    val image: String?,
)