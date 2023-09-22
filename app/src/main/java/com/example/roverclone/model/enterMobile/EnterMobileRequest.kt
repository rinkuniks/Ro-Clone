package com.example.roverclone.model.enterMobile

data class EnterMobileRequest(
    val country_code: String,
    val deviceId: String,
    val deviceToken: String,
    val deviceType: String,
    val phone: String,
    val user_type: String
)