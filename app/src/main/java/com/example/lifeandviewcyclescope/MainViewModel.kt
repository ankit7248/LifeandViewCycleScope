package com.example.lifeandviewcyclescope

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel: ViewModel(){
    private val TAG : String = "KotlinFun"

    init {
        viewModelScope.launch{
            while (true)
            {
                delay(500)
                Log.d(TAG,"HELLO FROM ANKIT")
            }
        }
    }
    override fun onCleared() {
        super.onCleared()
        Log.d(TAG,"View Model Destroyed")
    }
}