package com.example.epicaesthetic.ui.aesthetic

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AestheticViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is aesthetic Fragment"
    }
    val text: LiveData<String> = _text
}