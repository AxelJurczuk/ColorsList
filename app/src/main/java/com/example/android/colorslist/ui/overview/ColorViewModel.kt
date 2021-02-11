package com.example.android.colorslist.ui.overview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android.colorslist.data.ColorDataSet
import com.example.android.colorslist.model.Color

class ColorViewModel: ViewModel (){

    private val listLiveData = MutableLiveData<List<Color>>()
    private val colorDataSet = ColorDataSet()

    init {
        getColorList()
    }

    private fun getColorList(){
        val list = colorDataSet.getColorList()
        listLiveData.value = list
    }
    fun getLiveDataList():LiveData<List<Color>>{
        return listLiveData
    }
}