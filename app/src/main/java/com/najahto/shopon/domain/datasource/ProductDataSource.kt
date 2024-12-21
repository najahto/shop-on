package com.najahto.shopon.domain.datasource

import com.najahto.shopon.core.domain.util.NetworkError
import com.najahto.shopon.core.domain.util.Result
import com.najahto.shopon.domain.models.Product

interface ProductDataSource {

    suspend fun getProducts() : Result<List<Product>, NetworkError>

}