package com.example.roverclone.ui.Auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.roverclone.R
import com.example.roverclone.databinding.ActivitySplashBinding
import com.example.roverclone.databinding.ActivityVerifyBinding

class VerifyActivity : AppCompatActivity() {

  private lateinit var binding: ActivityVerifyBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityVerifyBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.btnLogin.setOnClickListener {
      val intent = Intent(this, RegisterActivity::class.java)
      startActivity(intent)
    }
  }
}
