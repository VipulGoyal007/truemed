package com.example.example

import com.google.gson.annotations.SerializedName


data class CustomerDeviceInfoRequest (

  @SerializedName("customerId") var customerId: String?  = "",
  @SerializedName("aaid") var aaid: String?  = "",
  @SerializedName("firebaseId") var firebaseId: String?  = "",
  @SerializedName("deviceId") var deviceId: String?  = "",
  @SerializedName("deviceManufacturerBy") var deviceManufacturerBy: String?  = "",
  @SerializedName("deviceModel") var deviceModel: String?  = "",
  @SerializedName("osVersion") var osVersion: String?  = "",
  @SerializedName("appVersion") var appVersion: String?  = "",
  @SerializedName("source") var source: String?  = "",
  @SerializedName("ip") var ip: String?  = "",
  @SerializedName("appInstanceId") var appInstanceId: String?  = "",


)