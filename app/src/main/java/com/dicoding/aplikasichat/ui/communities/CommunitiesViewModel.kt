package com.dicoding.aplikasichat.ui.communities

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunitiesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is communities Fragment"
    }
    val text: LiveData<String> = _text
}