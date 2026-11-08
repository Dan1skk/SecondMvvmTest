package com.example.test_mvvm.di

import com.example.test_mvvm.hero.HeroVM
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val VMModules = module {
    viewModelOf(::HeroVM)
}