package com.example.android.colorslist.data


import com.example.android.colorslist.R
import org.junit.Test
import com.google.common.truth.Truth.assertThat


class ColorDataSetTest {
    private val colorDataSet = ColorDataSet()
    @Test
    fun `index is divisible by 3 and 5 without reminder return yellow`(){
        val color = colorDataSet.getColor(15)
        assertThat(color).isEqualTo(R.color.yellow)
    }
    @Test
    fun `index is divisible by 3 without reminder return yellow`(){
        val color = colorDataSet.getColor(9)
        assertThat(color).isEqualTo(R.color.red)
    }
    @Test
    fun `index is divisible by 5 without reminder return blue`(){
        val color = colorDataSet.getColor(20)
        assertThat(color).isEqualTo(R.color.blue)
    }
    @Test
    fun `index is not divisible by 3 and or 5 without reminder return black`(){
        val color = colorDataSet.getColor(17)
        assertThat(color).isEqualTo(R.color.black)
    }

}