package com.example.roverclone.ui.Auth

import android.Manifest
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat
import com.example.roverclone.R
import com.example.roverclone.databinding.ActivitySplashBinding
import com.example.roverclone.utility.CommonUtils
import com.google.android.material.snackbar.Snackbar

class SplashActivity : AppCompatActivity() {

  private lateinit var binding: ActivitySplashBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivitySplashBinding.inflate(layoutInflater)
    setContentView(binding.root)

    //After 3 sec splash will go off
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