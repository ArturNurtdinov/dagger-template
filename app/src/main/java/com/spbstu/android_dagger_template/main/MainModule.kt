package com.spbstu.android_dagger_template.main

import androidx.lifecycle.ViewModelProvider
import dagger.Module
import dagger.Provides

@Module
abstract class MainModule {
    @Module
    companion object {
        @JvmStatic
        @Provides
        fun provideViewModel(
            activity: MainActivity,
            factory: MainViewModelFactory
        ): MainViewModel =
            ViewModelProvider(activity, factory).get(MainViewModel::class.java)
    }
}