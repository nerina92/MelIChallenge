package com.example.melichallenge.di

import com.example.melichallenge.domain.GetSearchResultUseCase
import org.koin.dsl.module

val UseCaseModule = module {
    single{
        GetSearchResultUseCase(get())
    }
}