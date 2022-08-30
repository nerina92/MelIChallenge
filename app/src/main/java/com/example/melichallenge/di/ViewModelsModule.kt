package com.example.melichallenge.di

import com.example.melichallenge.ui.viewModel.ItemDetailViewModel
import com.example.melichallenge.ui.viewModel.SearchViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule=module{
    viewModel { SearchViewModel(get())}
    viewModel { ItemDetailViewModel(get()) }
}