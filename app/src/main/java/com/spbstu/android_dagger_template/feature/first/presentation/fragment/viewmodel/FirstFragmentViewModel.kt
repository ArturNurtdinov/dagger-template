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
    private val _infoText = MutableLiveData<String>().also {
        loadInfo()
    }
    val infoText: LiveData<String> = _infoText

    private fun loadInfo() {
        GlobalScope.launch(Dispatchers.IO) {
            while (true) {
                delay(1000)
                _infoText.postValue(System.currentTimeMillis().toString())
            }
        }
    }
}