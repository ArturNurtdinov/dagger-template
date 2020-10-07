package com.spbstu.android_dagger_template.feature.second.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.spbstu.android_dagger_template.R
import com.spbstu.android_dagger_template.ViewModelFactory
import com.spbstu.android_dagger_template.di.injector.Injectable
import com.spbstu.android_dagger_template.feature.second.presentation.viewmodel.SecondFragmentViewModel
import javax.inject.Inject

class SecondFragment : Fragment(), Injectable {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel: SecondFragmentViewModel by viewModels { viewModelFactory }

    companion object {
        @JvmStatic
        fun newInstance() = SecondFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.edit()
    }
}