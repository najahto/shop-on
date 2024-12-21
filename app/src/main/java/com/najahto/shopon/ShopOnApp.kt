package com.najahto.shopon

import android.app.Application
import com.najahto.shopon.di.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class ShopOnApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@ShopOnApp)
            androidLogger()

            modules(listOf(
                networkModule
            ))
        }
    }
}