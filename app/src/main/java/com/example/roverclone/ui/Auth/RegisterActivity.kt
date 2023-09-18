package com.example.roverclone.ui.Auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.roverclone.R
import com.example.roverclone.databinding.ActivityRegisterBinding
import com.example.roverclone.ui.Home.HomeActivity

class RegisterActivity : AppCompatActivity() {

  private lateinit var binding: ActivityRegisterBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityRegisterBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.btnContinue.setOnClickListener {
      val intent = Intent(this, HomeActivity::class.java)
      startActivity(intent)
    }
  }
}