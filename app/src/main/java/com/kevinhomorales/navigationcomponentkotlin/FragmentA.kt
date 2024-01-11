package com.kevinhomorales.navigationcomponentkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.kevinhomorales.navigationcomponentkotlin.databinding.FragmentABinding

class FragmentA: Fragment() {

    private lateinit var binding: FragmentABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return setUpView(inflater, container)
    }

    private fun setUpView(inflater: LayoutInflater, container: ViewGroup?): View {
        binding = FragmentABinding.inflate(inflater, container, false)
        setUpActions()
        return binding.root
    }

    private fun setUpActions() {
        binding.navigationButtonId.setOnClickListener {
            findNavController().navigate(
                FragmentADirections.actionFragmentAToFragmentB(
                    sample = "Navigation Component"
                )
            )
        }
    }
}