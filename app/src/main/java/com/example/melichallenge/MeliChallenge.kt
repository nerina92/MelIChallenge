package com.example.melichallenge

import android.app.Application
import com.example.melichallenge.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


class MeliChallenge : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@MeliChallenge)
            modules(appModules)
        }
    }
}