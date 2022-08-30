package com.example.melichallenge.di

import com.example.melichallenge.data.MeliChallengeRepository
import org.koin.dsl.module

val repositoryModule = module {
    //single<InterfaceRepository> { Repository() }
    single{
        MeliChallengeRepository(get())
    }
}