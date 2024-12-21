package com.najahto.shopon.domain.repository

import com.najahto.shopon.core.domain.util.NetworkError
import com.najahto.shopon.core.domain.util.Result
import com.najahto.shopon.domain.models.Product

interface ProductRepository {
    suspend fun getProducts() : Result<List<Product>, NetworkError>
}