package com.spbstu.android_dagger_template.di

import android.app.Activity
import com.spbstu.android_dagger_template.main.MainActivity
import com.spbstu.android_dagger_template.di.scope.FeatureScope
import com.spbstu.android_dagger_template.feature.first.di.FirstModule
import com.spbstu.android_dagger_template.feature.first.presentation.FirstFragment
import com.spbstu.android_dagger_template.feature.second.di.SecondModule
import com.spbstu.android_dagger_template.feature.second.presentation.SecondFragment
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class FragmentBuildersModule {

    @Binds
    abstract fun activityContext(activity: MainActivity): Activity

    @FeatureScope
    @ContributesAndroidInjector(modules = [FirstModule::class])
    abstract fun contributeFirstFragment(): FirstFragment

    @FeatureScope
    @ContributesAndroidInjector(modules = [SecondModule::class])
    abstract fun contributeSecondFragment(): SecondFragment
}