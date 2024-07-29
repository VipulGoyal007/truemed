package com.intellihealth.truemeds.mvvm.data.appsflyer

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class AFAddressAdded(
    @SerializedName("city") var city: String? = null,
    @SerializedName("pincode") var pincode: String? = null,
    @SerializedName("state") var state: String? = null,
)