package com.example.navcomp.latihanTiga

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navcomp.R
import com.example.navcomp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Retrieve username from arguments and set it to the text view
        arguments?.let {
            val username = it.getString("username")
            binding.tvHello.text = "Hello $username!"
        }

        // Navigate to profile screen when profile button is clicked
        binding.icProfil.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_profileFragment2)
        }
    }
}
