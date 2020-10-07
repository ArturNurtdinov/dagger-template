package com.spbstu.android_dagger_template.feature.second.presentation.viewmodel

import android.content.SharedPreferences
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class SecondFragmentViewModel @Inject constructor(private val sharedPreferences: SharedPreferences): ViewModel() {
    fun edit() {
        // just to ensure this works
        sharedPreferences.edit().putString("some_key", "Some info").apply()
    }
}