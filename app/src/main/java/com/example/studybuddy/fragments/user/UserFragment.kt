package com.example.studybuddy.fragments.user

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.studybuddy.R

class UserFragment:Fragment() {

//    private lateinit var userViewModel: UserViewModel
//    private lateinit var binding: FragmentUserBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_user, container, false)

//        userViewModel =
//            ViewModelProvider(this)[UserViewModel::class.java]
//
//        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_user, container, false)
//
//        binding.userViewModel = userViewModel
//
//        val view = binding.root
//
//        userViewModel.text.observe(viewLifecycleOwner, Observer {
//            binding.textView.text = it
//        })
//        return view

    }
}