package com.spbstu.android_dagger_template.di

import androidx.lifecycle.ViewModelProvider
import com.spbstu.android_dagger_template.base.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}