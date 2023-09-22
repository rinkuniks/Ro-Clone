package com.example.roverclone.model.enterMobile

data class Response(
    val code: Int,
    val message: String,
    val newUser: String,
    val otp: Int,
    val user_id: Int
)