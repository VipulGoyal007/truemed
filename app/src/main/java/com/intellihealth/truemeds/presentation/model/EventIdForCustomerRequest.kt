package com.example.example

import com.google.gson.annotations.SerializedName


data class EventIdForCustomerRequest (

  @SerializedName("aaid") var aaid: String?  = "",
  @SerializedName("sdkVersion") var sdkVersion: String?  = "",
  @SerializedName("sdkId") var sdkId: String?  = "",
  @SerializedName("customerId") var customerId: String?  = "",
  @SerializedName("appsVersion") var appsVersion: String?  = "",
  @SerializedName("sdkSource") var sdkSource: String?  = "",
)