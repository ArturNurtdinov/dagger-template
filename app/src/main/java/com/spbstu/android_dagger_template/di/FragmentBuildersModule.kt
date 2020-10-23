package com.spbstu.android_dagger_template.di

import com.spbstu.android_dagger_template.feature.first.presentation.FirstFragment
import com.spbstu.android_dagger_template.feature.second.presentation.SecondFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeFirstFragment(): FirstFragment
    @ContributesAndroidInjector
    abstract fun contributeSecondFragment(): SecondFragment
}