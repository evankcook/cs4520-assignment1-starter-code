package com.cs4520.assignment1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.cs4520.assignment1.databinding.LoginFragmentBinding

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        val binding = LoginFragmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.loginButton)
        button.apply{
            setOnClickListener {
                val username = view.findViewById<EditText>(R.id.usernameInput)
                val password = view.findViewById<EditText>(R.id.passwordInput)
                if (username.text.toString() == "admin" && password.text.toString() == "admin") {
                    username.text.clear()
                    password.text.clear()
                findNavController().navigate(R.id.action_loginFragment_to_productListFragment)
                } else {
                    Toast.makeText(context, "Incorrect password. Please try again.",
                        Toast.LENGTH_SHORT).show()
                }
            }
        }

    }
}