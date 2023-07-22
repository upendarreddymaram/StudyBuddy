package com.example.studybuddy.fragments.college

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.studybuddy.R

class CollegeFragment : Fragment() {
//    private lateinit var collegeViewModel: CollegeViewModel
//    private lateinit var binding: FragmentCollegeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_college, container, false)
//        collegeViewModel =
//            ViewModelProvider(this)[collegeViewModel::class.java]
//
//        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_college, container, false)
//
//        binding.collegeViewModel = collegeViewModel
//
//        val view = binding.root
//
//        collegeViewModel.text.observe(viewLifecycleOwner, Observer {
//            binding.textView.text = it
//        })
//        return view
    }
}