package com.intellihealth.truemeds.mvvm.data.appsflyer

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class AFLoginSuccess(
    @SerializedName("fill_type")val fillType : String?="",
    @SerializedName("customer_id")val customerId : String?="",
)