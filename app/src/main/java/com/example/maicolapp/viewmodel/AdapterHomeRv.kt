package com.example.maicolapp.viewmodel

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.maicolapp.R
import com.example.maicolapp.data.model.RvDataHome
import com.example.maicolapp.ui.home.HomeViewModel

class AdapterHomeRv(private val dataList: List<RvDataHome>): RecyclerView.Adapter<HomeViewModel>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewModel {
        val binding = LayoutInflater.from(parent.context).inflate(R.layout.item_rc_home, parent, false)
        return HomeViewModel(binding)

    }

    override fun onBindViewHolder(holder: HomeViewModel, position: Int) {
        val item = dataList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = dataList.size
}