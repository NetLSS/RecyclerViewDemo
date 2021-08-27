package com.lilcode.example.recyclerviewdemo

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lilcode.example.recyclerviewdemo.databinding.CardLayoutBinding

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private val titles = arrayOf(
        "Chapter One", "Chapter Two", "Chapter Three", "Chapter Four",
        "Chapter Five", "Chapter Six", "Chapter Seven", "Chapter Eight"
    )

    private val details = arrayOf(
        "Item one details",
        "Item two details",
        "Item three details",
        "Item four details",
        "Item five details",
        "Item six details",
        "Item seven details",
        "Item eight details",
    )

    private val images = intArrayOf(
        R.drawable.android_image_1,
        R.drawable.android_image_2,
        R.drawable.android_image_3,
        R.drawable.android_image_4,
        R.drawable.android_image_5,
        R.drawable.android_image_6,
        R.drawable.android_image_7,
        R.drawable.android_image_8,
    )

    inner class ViewHolder(private val binding: CardLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.itemTitle.text = titles[position]
            binding.itemDetail.text = details[position]
            binding.itemImage.setImageResource(images[position])
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val binding = CardLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return titles.size
    }
}