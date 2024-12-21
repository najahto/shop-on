package com.najahto.shopon.data.repository

import com.najahto.shopon.core.domain.util.NetworkError
import com.najahto.shopon.core.domain.util.Result
import com.najahto.shopon.domain.datasource.ProductDataSource
import com.najahto.shopon.domain.models.Product
import com.najahto.shopon.domain.repository.ProductRepository

class ProductRepositoryImpl(
    private val productDataSource: ProductDataSource
) : ProductRepository{

    override suspend fun getProducts(): Result<List<Product>, NetworkError> {
        return productDataSource.getProducts()
    }

}