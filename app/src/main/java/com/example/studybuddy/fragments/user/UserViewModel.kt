package com.example.studybuddy.fragments.user

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel:ViewModel() {


    private var _text = MutableLiveData<String>().apply {
        value = "user 111 Fragment"
    }
    var text: LiveData<String> = _text

}

