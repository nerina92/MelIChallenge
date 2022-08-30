package com.example.melichallenge.di

import io.ktor.client.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.serialization.json.Json
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


val networkModule = module{
    //single { createHttpClient(get()) }
    single { provideOkHttpClient() }
    single { provideRetrofit(get()) }
}
fun provideOkHttpClient(): OkHttpClient {
    val okHttpClientBuilder = OkHttpClient.Builder()
    okHttpClientBuilder.interceptors().add(TimeOutInterceptor())
    return okHttpClientBuilder.build()
}

fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit =
    Retrofit.Builder().baseUrl("https://api.mercadolibre.com")
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()

val jsonModule=module{
    single { createJson() }
}

val coroutineModule = module {
    single { CoroutineScope(Dispatchers.Default + SupervisorJob() ) }
}

fun createJson() = Json {
    isLenient = true;//Propiedad para analisis del JSON mas libre, no requiere claves entre comillas, por ejemplo
    ignoreUnknownKeys = true;//Evita que las claves desconocidas encontradas en la deserializacion produzcan un error
    prettyPrint = true;//Esta propiedad agrega sangrías y saltos de línea para una mejor legibilidad
    explicitNulls = false
}

fun createHttpClient(json: Json) = HttpClient (){
    install(ContentNegotiation) {
        var converter = KotlinxSerializationConverter(json)
        register(ContentType.Application.Json, converter!!)
    }
}
