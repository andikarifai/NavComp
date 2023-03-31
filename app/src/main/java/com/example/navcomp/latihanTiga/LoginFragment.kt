package com.example.navcomp.latihanTiga

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import com.example.navcomp.R
import com.example.navcomp.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var navController = Navigation.findNavController(view)

        binding.btnLogin.setOnClickListener {
            // Validasi input
            val username = binding.etUsername.text.toString()
            val password = binding.etPassword.text.toString()

            // Jika username dan password benar, navigasi ke HomeFragment
            if (username == "user" && password == "password") {
                val bundle = bundleOf("username" to username)
                navController.navigate(R.id.action_loginFragment2_to_homeFragment, bundle)
            } else {
                Toast.makeText(context, "Invalid credentials", Toast.LENGTH_SHORT).show()
            }
        }
            binding.btnRegister.setOnClickListener {
                navController.navigate(R.id.action_firstFragment_to_secondFragment)
            }

            binding.btnLogin.setOnClickListener {
                // Perform login operation and check credentials
                // If credentials are correct, navigate to HomeFragment
                navController.navigate(R.id.action_loginFragment2_to_homeFragment)
            }

        }
    }

