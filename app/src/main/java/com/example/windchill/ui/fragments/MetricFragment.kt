package com.example.windchill.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.windchill.R
import com.example.windchill.databinding.FragmentMetricBinding


class MetricFragment : Fragment() {


    lateinit var binding: FragmentMetricBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_metric, container, false)
    }


}