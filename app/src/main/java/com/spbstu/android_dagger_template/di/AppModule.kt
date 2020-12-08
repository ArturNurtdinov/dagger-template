package com.spbstu.android_dagger_template.di

import dagger.Module
import dagger.android.support.AndroidSupportInjectionModule

@Module(
    includes = [
        AndroidSupportInjectionModule::class,
        MainActivityModule::class
    ]
)
class AppModule {
}