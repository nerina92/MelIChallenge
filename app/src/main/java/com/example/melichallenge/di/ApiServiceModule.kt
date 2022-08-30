package com.example.melichallenge.di

import com.example.melichallenge.data.InterfazMeliChallRepository
import com.example.melichallenge.network.ApiServiceMeliChallenge
import org.koin.dsl.module
import retrofit2.Retrofit

val interfazApiServiceModule = module {
    single{
        provideApiDataService(get(),InterfazMeliChallRepository::class.java)
    }
}
fun provideApiDataService(retrofit: Retrofit, apiService: Class<InterfazMeliChallRepository>) =
    createDataService(retrofit, apiService)

fun <T> createDataService(retrofit: Retrofit, serviceClass: Class<T>): T = retrofit.create(serviceClass)

val apiServiceModule = module {
    //single { ApiService(get()) }
    single {

        ApiServiceMeliChallenge(get())
    }
//Factory crea una instancia diferente cada vez que es llamado (a diferencia de single)
}
