package com.example.studybuddy.fragments.privatecontent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.studybuddy.R

class PrivateContentFragment : Fragment() {
//    private lateinit var privateContentViewModel: PrivateContentViewModel
//    private lateinit var binding: FragmentPrivatecontentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_privatecontent, container, false)

//        privateContentViewModel =
//            ViewModelProvider(this)[privateContentViewModel::class.java]
//
//        binding =
//            DataBindingUtil.inflate(inflater, R.layout.fragment_privatecontent, container, false)
//
//        binding.privateContentViewModel = privateContentViewModel
//
//        val view = binding.root
//
//        privateContentViewModel.text.observe(viewLifecycleOwner, Observer {
//            binding.textView.text = it
//        })
//        return view

    }
}