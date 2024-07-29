package com.example.example

import com.google.gson.annotations.SerializedName


data class PaymentSelectionInfo (

  @SerializedName("paymentMethodIconUrl") var paymentMethodIconUrl: String?  = null,
  @SerializedName("paymentMethod" ) var paymentMethod : String?  = null,
  @SerializedName("paymentMethodId" ) var paymentMethodId: Int?     = null,
  @SerializedName("paymentNote") var paymentNote    : String?  = null,
  @SerializedName("lastPaymentMethodIconUrl") var lastPaymentMethodIconUrl: String?  = null,
  @SerializedName("lastPaymentMethod") var lastPaymentMethod: String?  = null,
  @SerializedName("lastPaymentMethodId") var lastPaymentMethodId: String?  = null,
  @SerializedName("paymentSpecificCouponApplied" ) var paymentSpecificCouponApplied : Boolean? = null

)