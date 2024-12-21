package com.najahto.shopon.data.remote.datasource

import com.najahto.shopon.core.data.networking.constructUrl
import com.najahto.shopon.core.data.networking.safeCall
import com.najahto.shopon.core.domain.util.NetworkError
import com.najahto.shopon.core.domain.util.Result
import com.najahto.shopon.core.domain.util.map
import com.najahto.shopon.data.mappers.toProduct
import com.najahto.shopon.data.remote.dto.ProductResponseDto
import com.najahto.shopon.domain.datasource.ProductDataSource
import com.najahto.shopon.domain.models.Product
import io.ktor.client.HttpClient
import io.ktor.client.request.get

class RemoteProductDataSource(
    private val httpClient: HttpClient
) : ProductDataSource {

    override suspend fun getProducts(): Result<List<Product>, NetworkError> {
        return safeCall<ProductResponseDto> {
            httpClient.get(
                urlString = constructUrl("/products")
            )
        }.map { response ->
            response.data.map {
                it.toProduct()
            }
        }
    }

}