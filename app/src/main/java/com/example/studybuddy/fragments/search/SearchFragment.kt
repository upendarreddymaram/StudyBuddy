package com.example.studybuddy.fragments.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.studybuddy.R

class SearchFragment : Fragment() {
//    private lateinit var searchViewModel: SearchViewModel
//    private lateinit var binding: FragmentSearchBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_search, container, false)


//        searchViewModel =
//            ViewModelProvider(this)[searchViewModel::class.java]
//
//        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_search, container, false)
//
//        binding.searchViewModel = searchViewModel
//
//        val view = binding.root
//
//        searchViewModel.text.observe(viewLifecycleOwner, Observer {
//            binding.textView.text = it
//        })
//        return view

    }
}