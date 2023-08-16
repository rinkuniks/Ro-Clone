package com.example.roverclone.model.enterMobile

import com.example.roverclone.utility.Constants
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class EnterMobileRequest(
  @Expose
  @SerializedName(Constants.PHONE)
  var phone: String? = null,
  @Expose
  @SerializedName(Constants.USER_TYPE)
  var userType: String? = null,
  @Expose
  @SerializedName(Constants.COUNTRY_CODE)
  var countryCode: String? = null,
  @Expose
  @SerializedName(Constants.DEVICETOKEN)
  var deviceToken: String? = null,
  @Expose
  @SerializedName(Constants.DEVICETYPE)
  var deviceType: String? = null,
  @Expose
  @SerializedName(Constants.DEVICEID)
  var deviceId: String? = null
)
