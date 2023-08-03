package com.example.studybuddy.fragments.privatecontent.faculty

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.studybuddy.R
import com.example.studybuddy.databinding.FragmentFacultyLoginBinding

class FacultyLoginFragment:Fragment() {
//    private lateinit var binding = FragmentFacultyLoginBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_faculty_login, container, false)











        return view

    }
}