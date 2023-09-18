package com.example.roverclone.ui.Home.ui.request

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyRequestViewModel : ViewModel() {

  private val _text = MutableLiveData<String>().apply {
    value = "This is gallery Fragment"
  }
  val text: LiveData<String> = _text
}