package com.spbstu.android_dagger_template.feature.second.presentation

import android.os.Bundle
import android.util.Log
import com.spbstu.android_dagger_template.R
import com.spbstu.android_dagger_template.base.InjectionFragment
import com.spbstu.android_dagger_template.feature.first.presentation.FirstFragmentViewModel
import com.spbstu.android_dagger_template.main.MainViewModel
import javax.inject.Inject

class SecondFragment : InjectionFragment<SecondFragmentViewModel>(R.layout.fragment_second) {


    @Inject
    lateinit var shared: MainViewModel

    companion object {
        @JvmStatic
        fun newInstance() = SecondFragment()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.edit()
        Log.d("WWWW", "${shared.data}")
    }
}