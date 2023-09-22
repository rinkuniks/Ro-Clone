package com.example.roverclone.retrofit.interfaces

import com.example.roverclone.model.enterMobile.EnterMobileRequest
import com.example.roverclone.model.enterMobile.EnterMobileResponse
import com.example.roverclone.retrofit.Urls
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface RetrofitInterface {

  @Headers("Content-Type: application/json")

  @POST(Urls.SEND_OTP)
  suspend fun enterMobile(
    @Body enterMobileRequestModel: EnterMobileRequest
  ): Response<EnterMobileResponse>
}