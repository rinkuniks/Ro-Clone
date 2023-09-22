package com.example.roverclone.retrofit

object Urls {
  //Base url
//  const val BASE_URL = "https://rovertaxi-dev.affleprojects.com/api/"; //Staging base url
  const val BASE_URL = "https://roverrsd-uat.affleprojects.com/api/" //UAT Base url
//  const val BASE_URL = "https://www.rovertaxi.net/api/";  // Prod URL

  //Authenticate
  const val SEND_OTP = "sendOtp"
  const val VERIFY_OTP = "verifyOtp"
  const val LOGIN = "login"
  const val REGISTER_USER = "registerUser"
  const val RESET_PASSWORD = "resetPassword"
  const val LOGOUT = "logout"
}
