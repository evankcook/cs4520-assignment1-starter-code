package com.cs4520.assignment1;

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment;
import com.cs4520.assignment1.databinding.ProductListFragmentBinding


class ProductListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        val binding = ProductListFragmentBinding.inflate(layoutInflater)
        return binding.root
    }

}