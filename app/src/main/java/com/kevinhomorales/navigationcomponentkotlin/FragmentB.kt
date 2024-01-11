package com.kevinhomorales.navigationcomponentkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.kevinhomorales.navigationcomponentkotlin.databinding.FragmentBBinding

class FragmentB: Fragment() {

    private lateinit var binding: FragmentBBinding
    val args: FragmentBArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return setUpView(inflater, container)
    }


    private fun setUpView(inflater: LayoutInflater, container: ViewGroup?): View {
        binding = FragmentBBinding.inflate(inflater, container, false)
        binding.labelId.text = args.sample
        return binding.root
    }
}