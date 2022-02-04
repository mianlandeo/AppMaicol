package com.example.maicolapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.maicolapp.data.model.RcArrayHome
import com.example.maicolapp.databinding.FragmentHomeBinding
import com.example.maicolapp.viewmodel.AdapterHomeRv
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerInit()

    }
    private fun recyclerInit(){
        rcHome.apply {
          binding.rcHome.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
            binding.rcHome.adapter = AdapterHomeRv(RcArrayHome.dataList)
        }

        fun recyclerCenter(){

        }

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}