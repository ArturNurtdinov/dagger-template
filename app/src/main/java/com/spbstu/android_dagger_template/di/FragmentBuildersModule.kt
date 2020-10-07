package com.spbstu.android_dagger_template.di

import com.spbstu.android_dagger_template.feature.first.presentation.fragment.fragment.FirstFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeFirstFragment(): FirstFragment
}