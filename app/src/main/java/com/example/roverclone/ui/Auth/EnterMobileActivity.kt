package com.example.roverclone.ui.Auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.roverclone.databinding.ActivityEnterMobileBinding
import com.example.roverclone.utility.CommonUtils.isNetworkAvailable
import com.example.roverclone.utility.CommonUtils.showLoader
import com.example.roverclone.utility.CommonUtils.showToast

class EnterMobileActivity : AppCompatActivity() {

  private lateinit var binding : ActivityEnterMobileBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityEnterMobileBinding.inflate(layoutInflater)
    setContentView(binding.root)

    //onBtn Click validate and send otp
    binding.btnContinue.setOnClickListener {
      if (validateNumber() && isNetworkAvailable(this)){
        getOtpApi(binding.editTextMobile.text.toString())
      }
    }
  }

  private fun getOtpApi(mobile: String?) {
    showLoader(this)
//    val intent = Intent(this, VerifyActivity::class.java)
//    startActivity(intent)
  }

  private fun validateNumber(): Boolean {
    if (binding.editTextMobile.text.toString().isEmpty()) {
      showToast(this, "Please Enter Mobile Number")
      return false
    }else if (binding.editTextMobile.text?.length!! <= 9){
      showToast(this, "Please enter 10 digit")
      return false
    }
    return true
  }
}
