package com.example.roverclone.ui.Auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.roverclone.R
import com.example.roverclone.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

  private lateinit var binding: ActivityRegisterBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityRegisterBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.btnContinue.setOnClickListener {

    }

  }
}