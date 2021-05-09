package com.example.epicaesthetic.ui.all

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AllViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is all groups Fragment"
    }
    val text: LiveData<String> = _text
}