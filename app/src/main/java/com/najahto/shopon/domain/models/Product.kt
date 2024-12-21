package com.najahto.shopon.domain.models


data class Product (
    val id: Long,
    val title: String,
    val price: Double,
    val category: String,
    val description: String,
    val image: String,
)