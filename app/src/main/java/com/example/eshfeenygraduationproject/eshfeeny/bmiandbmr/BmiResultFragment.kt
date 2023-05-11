package com.example.eshfeenygraduationproject.eshfeeny.bmiandbmr

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.eshfeenygraduationproject.R
import com.example.eshfeenygraduationproject.databinding.FragmentBmiResultBinding


class BmiResultFragment : Fragment() {
    private var binding : FragmentBmiResultBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBmiResultBinding.inflate(layoutInflater)

        // Inflate the layout for this fragment
        return binding?.root
    }
}