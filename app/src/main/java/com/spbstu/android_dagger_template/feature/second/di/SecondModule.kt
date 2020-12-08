package com.spbstu.android_dagger_template.feature.second.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import androidx.lifecycle.ViewModel
import com.spbstu.android_dagger_template.di.base.ViewModelKey
import com.spbstu.android_dagger_template.di.scope.FeatureScope
import com.spbstu.android_dagger_template.feature.second.presentation.SecondFragmentViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module
abstract class SecondModule {
    @Binds
    @IntoMap
    @FeatureScope
    @ViewModelKey(SecondFragmentViewModel::class)
    internal abstract fun viewModel(viewModel: SecondFragmentViewModel): ViewModel

    companion object {

        @JvmStatic
        @Provides
        @FeatureScope
        internal fun provideSharedPreferences(app: Application): SharedPreferences =
            app.getSharedPreferences("shared", Context.MODE_PRIVATE)
    }
}