package com.spbstu.android_dagger_template.feature.first.presentation.fragment.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.spbstu.android_dagger_template.R
import com.spbstu.android_dagger_template.di.injector.Injectable
import com.spbstu.android_dagger_template.feature.first.presentation.fragment.viewmodel.FirstFragmentViewModel
import kotlinx.android.synthetic.main.fragment_first.*
import javax.inject.Inject

class FirstFragment : Fragment(), Injectable {

    companion object {
        @JvmStatic
        fun newInstance() = FirstFragment()
    }

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel: FirstFragmentViewModel by viewModels { viewModelFactory }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.infoText.observe(viewLifecycleOwner, Observer {
            frg_first__text.text = it
        })
    }
}