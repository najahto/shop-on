package com.najahto.shopon.di

import com.najahto.shopon.core.data.networking.HttpClientFactory
import com.najahto.shopon.data.remote.datasource.RemoteProductDataSource
import com.najahto.shopon.domain.datasource.ProductDataSource
import io.ktor.client.engine.cio.CIO
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind

import org.koin.dsl.module

val networkModule = module {

    single { HttpClientFactory.create(CIO.create()) }

    singleOf (::RemoteProductDataSource).bind<ProductDataSource>()

}