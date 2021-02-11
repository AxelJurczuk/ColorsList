package com.example.android.colorslist.data

import com.example.android.colorslist.model.Color

class ColorDataSet {

    fun getColorList():List<Color> {
        val list = mutableListOf<Color>()
        for(i in 0..100000){
            list.add(Color())
            list[i].colorRes = getColor(i)
        }
        return list
    }
    fun getColor (position:Int):Int{
        if (position%3 == 0 && position%5 == 0){
            return 1
        }
        if (position%3 == 0) {
            return 2
        }
        if (position%5 == 0){
            return 3
        }
        return 0
    }
}