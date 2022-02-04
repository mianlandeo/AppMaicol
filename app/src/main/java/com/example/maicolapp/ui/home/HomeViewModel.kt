package com.example.maicolapp.ui.home

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.maicolapp.data.model.RvDataHome
import com.example.maicolapp.databinding.ItemRcHomeBinding

class HomeViewModel(view:View): RecyclerView.ViewHolder(view) {

    private val binding = ItemRcHomeBinding.bind(view)

    fun render (image: RvDataHome){
        Glide.with(binding.rcImage.context).load(image.image).into(binding.rcImage)
    }

}