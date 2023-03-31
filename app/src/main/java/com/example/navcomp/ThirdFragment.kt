package com.example.navcomp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navcomp.databinding.FragmentSecondBinding
import com.example.navcomp.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
lateinit var binding: FragmentThirdBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentThirdBinding.inflate(layoutInflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val getNama = arguments?.getString("NAMA")
        val lastName = arguments?.getString("LASTNAME")
        binding.txtNama.setText(getNama)
    }


}