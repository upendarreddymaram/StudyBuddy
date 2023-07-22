package com.example.studybuddy.fragments.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.studybuddy.R

class HomeFragment: Fragment() {
//    private lateinit var homeViewModel: HomeViewModel
//    private lateinit var binding:FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

                return inflater.inflate(R.layout.fragment_home, container, false)


//        homeViewModel =
//            ViewModelProvider(this)[homeViewModel::class.java]
//
//        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false)
//
//        binding.homeViewModel = homeViewModel
//
//        val view = binding.root
//
//        homeViewModel.text.observe(viewLifecycleOwner, Observer {
//            binding.textView.text = it
//        })
//        return view
    }
}