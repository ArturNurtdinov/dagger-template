package com.spbstu.android_dagger_template.feature.first.di

import androidx.lifecycle.ViewModel
import com.spbstu.android_dagger_template.di.base.ViewModelKey
import com.spbstu.android_dagger_template.di.scope.FeatureScope
import com.spbstu.android_dagger_template.feature.first.presentation.FirstFragmentViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class FirstModule {
    @Binds
    @IntoMap
    @FeatureScope
    @ViewModelKey(FirstFragmentViewModel::class)
    internal abstract fun viewModel(viewModel: FirstFragmentViewModel): ViewModel
}