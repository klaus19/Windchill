package com.example.windchill.ui.model


import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.math.pow

class EnglishViewModel:ViewModel() {



      val chillFactor:LiveData<Double>
          get() = _chillFactor
     val _chillFactor=MutableLiveData<Double>()


       //  val temperatureInFarhenite:LiveData<Double>
       //       get() = _temperatureInFarhenite
     // val _temperatureInFarhenite:MutableLiveData<Double>() =
    var _temperatureInFarhenite = MutableLiveData<Double>()

          val velocityOfWind_InMiles:LiveData<Double>
            get() = _velocityOfWind_InMiles
      var _velocityOfWind_InMiles = MutableLiveData<Double>()


       fun letsFindwindchillFactor():MutableLiveData<Double>{


            val xt = _temperatureInFarhenite.value
            Log.d( "TA",  "${xt} test")
            var a = _temperatureInFarhenite.value?:0.toString().toInt()
            var b = _velocityOfWind_InMiles.value?:0.toString().toInt()
           _chillFactor.value = a.toDouble()+ b.toDouble()

            return _chillFactor
        }


    }
