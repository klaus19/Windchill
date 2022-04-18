package com.example.windchill.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.windchill.R
import com.example.windchill.databinding.FragmentEnglishBinding
import com.example.windchill.ui.model.EnglishViewModel


class EnglishFragment : Fragment() {



    lateinit var _binding:FragmentEnglishBinding
    lateinit var viewModel: EnglishViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         _binding = FragmentEnglishBinding.inflate(inflater,container,false)
        val view = _binding.root
        return view

         viewModel = ViewModelProvider(requireActivity()).get(EnglishViewModel::class.java)


        _binding.btnCalculateEnglish.setOnClickListener {

                findChillFactor()
        }
    }

    fun findChillFactor(){

        viewModel.letsFindwindchillFactor().observe(viewLifecycleOwner) {


            _binding.txtValue.text = viewModel._chillFactor.toString()
            viewModel.letsFindwindchillFactor()

        }
        viewModel._temperatureInFarhenite.value = _binding?.editTemperatureFR?.text.toString().toDouble()
        viewModel._velocityOfWind_InMiles.value = _binding?.editWindM?.text.toString().toDouble()

    }

}