package com.spbstu.android_dagger_template.di

import com.spbstu.android_dagger_template.main.MainActivity
import com.spbstu.android_dagger_template.main.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {
    @ContributesAndroidInjector(
        modules = [
            FragmentBuildersModule::class,
            ViewModelModule::class,
            MainModule::class
        ]
    )
    abstract fun contributeMainActivity(): MainActivity
}