package com.najahto.shopon.di

import com.najahto.shopon.core.data.networking.HttpClientFactory
import io.ktor.client.engine.cio.CIO

import org.koin.dsl.module

val networkModule = module {
    single { HttpClientFactory.create(CIO.create()) }
}