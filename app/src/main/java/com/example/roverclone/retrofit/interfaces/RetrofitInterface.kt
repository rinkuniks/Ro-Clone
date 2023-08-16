package com.example.roverclone.retrofit.interfaces

import com.example.roverclone.model.enterMobile.EnterMobileRequest
import com.example.roverclone.model.enterMobile.EnterMobileResponse
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface RetrofitInterface {

  @Headers("Content-Type: application/json")

  @POST("api/authaccount/login")
  suspend fun userLogin(
    @Body enterMobileRequestModel: EnterMobileRequest
  ): EnterMobileResponse
}