package com.spbstu.android_dagger_template.feature.first.presentation

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.spbstu.android_dagger_template.R
import com.spbstu.android_dagger_template.base.InjectionFragment
import com.spbstu.android_dagger_template.main.MainViewModel
import kotlinx.android.synthetic.main.fragment_first.*
import javax.inject.Inject

class FirstFragment : InjectionFragment<FirstFragmentViewModel>(R.layout.fragment_first) {

    companion object {
        @JvmStatic
        fun newInstance() = FirstFragment()
    }


    @Inject
    lateinit var shared: MainViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.infoText.observe(viewLifecycleOwner, Observer {
            frg_first__text.text = it
        })

        frg_first__next.setOnClickListener {
            shared.data = frg_first__text.text.toString()
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }
    }
}