package com.example.roverclone.ui.Auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.roverclone.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

  private lateinit var binding: ActivitySplashBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivitySplashBinding.inflate(layoutInflater)
    setContentView(binding.root)

    Handler(Looper.getMainLooper()).postDelayed(Runnable {
      //This method will be executed once the timer is over
      // Start your app main activity
      val intent = Intent(this, EnterMobileActivity::class.java)
      startActivity(intent)
      // close this activity
      finish()
    }, 3000)

  }
}