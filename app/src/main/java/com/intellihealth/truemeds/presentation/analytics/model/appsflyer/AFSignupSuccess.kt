package com.intellihealth.truemeds.mvvm.data.appsflyer

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class AFSignupSuccess(
    @SerializedName("customer_id")val customerId : String?=""
)