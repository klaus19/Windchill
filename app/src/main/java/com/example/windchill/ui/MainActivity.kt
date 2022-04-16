package com.example.windchill.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.windchill.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnEnglish.setOnClickListener {

            if (binding.frameMetric.visibility==View.VISIBLE){
                binding.frameMetric.visibility = View.GONE
                binding.frame.visibility = View.VISIBLE
            }else{
                binding.frame.visibility = View.VISIBLE
            }
        }

        binding.btnMetric.setOnClickListener {

            if (binding.frame.visibility==View.VISIBLE){
                binding.frame.visibility = View.GONE
                binding.frameMetric.visibility = View.VISIBLE
            }else{
                binding.frameMetric.visibility = View.VISIBLE
            }
        }
    }
}