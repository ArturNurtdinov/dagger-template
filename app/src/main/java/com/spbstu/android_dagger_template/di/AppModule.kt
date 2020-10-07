package com.spbstu.android_dagger_template.di

import com.spbstu.android_dagger_template.feature.second.di.SecondModule
import dagger.Module

@Module(
    includes = [
        ViewModelModule::class,
        SecondModule::class
    ]
)
class AppModule {

}