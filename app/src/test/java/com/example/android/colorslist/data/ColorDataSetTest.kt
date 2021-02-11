package com.example.android.colorslist.data


import org.junit.Test
import com.google.common.truth.Truth.assertThat


class ColorDataSetTest {
    private val colorDataSet = ColorDataSet()
    @Test
    fun `color is 1`(){
        val color = colorDataSet.getColor(15)
        assertThat(color).isEqualTo(1)
    }
    @Test
    fun `color is 2`(){
        val color = colorDataSet.getColor(9)
        assertThat(color).isEqualTo(2)
    }
    @Test
    fun `color is 3`(){
        val color = colorDataSet.getColor(20)
        assertThat(color).isEqualTo(3)
    }
    @Test
    fun `color is 0`(){
        val color = colorDataSet.getColor(17)
        assertThat(color).isEqualTo(0)
    }

}