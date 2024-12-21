package com.najahto.shopon.di

import com.najahto.shopon.data.repository.ProductRepositoryImpl
import com.najahto.shopon.domain.repository.ProductRepository
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val repositoryModule = module {
    singleOf(::ProductRepositoryImpl).bind<ProductRepository>()
}