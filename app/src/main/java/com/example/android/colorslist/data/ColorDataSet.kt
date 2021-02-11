package com.example.android.colorslist.data

import com.example.android.colorslist.R
import com.example.android.colorslist.model.Color

class ColorDataSet {

    fun getColorList():List<Color> {
        val list = mutableListOf<Color>()
        for(i in 0..99999){
            list.add(Color(getColor(i)))
        }
        return list
    }
    fun getColor (position:Int):Int{
        if (position%3 == 0 && position%5 == 0){
            return R.color.yellow
        }
        if (position%3 == 0) {
            return R.color.red
        }
        if (position%5 == 0){
            return R.color.blue
        }
        return R.color.black
    }
}