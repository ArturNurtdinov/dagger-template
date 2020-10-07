package com.spbstu.android_dagger_template.di

import com.spbstu.android_dagger_template.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {
    @ContributesAndroidInjector(
        modules = [
            FragmentBuildersModule::class
        ]
    )
    abstract fun contributeMainActivity(): MainActivity
}