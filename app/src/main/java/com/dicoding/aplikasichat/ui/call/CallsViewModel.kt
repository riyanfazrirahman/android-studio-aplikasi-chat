package com.dicoding.aplikasichat.ui.callimport androidx.lifecycle.LiveDataimport androidx.lifecycle.MutableLiveDataimport androidx.lifecycle.ViewModelclass CallsViewModel : ViewModel() {    private val _text = MutableLiveData<String>().apply {        value = "This is call Fragment"    }    val text: LiveData<String> = _text}