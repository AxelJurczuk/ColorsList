package com.example.android.colorslist.ui.overview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.colorslist.R
import com.example.android.colorslist.model.Color

class ColorAdapter(private val context: Context, private val listener:OnItemClick)
    :RecyclerView.Adapter<ColorAdapter.ItemViewHolder>() {
    var colorList= emptyList<Color>()

    class ItemViewHolder(private val view: View):RecyclerView.ViewHolder(view){
        val textColor:TextView= view.findViewById(R.id.tv_color)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent,false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = colorList[position]

        when (item.colorRes) {
            1 -> {
                holder.textColor.setBackgroundResource(R.color.yellow)
            }
            2 -> {
                holder.textColor.setBackgroundResource(R.color.red)
            }
            3 -> {
                holder.textColor.setBackgroundResource(R.color.blue)
            }
            else -> {
                holder.textColor.setBackgroundResource(R.color.black)
            }
        }

        holder.itemView.setOnClickListener {
            listener.onItemClickListener(position)
        }
    }

    override fun getItemCount(): Int {
        return colorList.size
    }

    interface OnItemClick {
        fun onItemClickListener(position:Int)
    }
}