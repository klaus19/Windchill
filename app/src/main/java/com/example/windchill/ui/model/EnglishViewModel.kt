package com.example.windchill.ui.model


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.math.pow

class EnglishViewModel:ViewModel() {

      val chillFactor:LiveData<Double>
          get() = _chillFactor
     val _chillFactor=MutableLiveData<Double>()


         val temperatureInFarhenite:LiveData<Double>
              get() = _temperatureInFarhenite
      val _temperatureInFarhenite=MutableLiveData<Double>()

          val velocityOfWind_InMiles:LiveData<Double>
            get() = _velocityOfWind_InMiles
      val _velocityOfWind_InMiles = MutableLiveData<Double>()


       fun letsFindwindchillFactor():MutableLiveData<Double>{

         //  _chillFactor.value = _temperatureInFarhenite.toString().toDouble() * _velocityOfWind_InMiles.toString().toDouble()

           // _chillFactor.value = 35.74+(0.6215*_temperatureInFarhenite.toString().toDouble()) -(
             //       35.75*_velocityOfWind_InMiles.toString().toDouble().pow(0.16))+
               //     (0.4275*_temperatureInFarhenite.toString().toDouble())*(_velocityOfWind_InMiles.toString()
               // .toDouble().pow(0.16))

           val a = 35.75*_velocityOfWind_InMiles.toString().toDouble().pow(0.16)
           val b = 0.4275*_temperatureInFarhenite.toString().toDouble()*a

           _chillFactor.value = 35.74 + 0.6215*_temperatureInFarhenite.toString().toDouble() - a+b

            return _chillFactor
        }


    }
