package com.spbstu.android_dagger_template.feature.first.presentation.fragment.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

class FirstFragmentViewModel @Inject constructor() : ViewModel() {

    init {
        GlobalScope.launch(Dispatchers.IO) {
            startInfo()
        }
    }

    private val _infoText = MutableLiveData<String>()
    val infoText: LiveData<String> = _infoText

    private suspend fun startInfo() {
        while (true) {
            delay(1000)
            _infoText.value = System.currentTimeMillis().toString()
        }
    }
}