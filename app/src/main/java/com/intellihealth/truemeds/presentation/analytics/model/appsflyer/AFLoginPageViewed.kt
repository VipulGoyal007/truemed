package com.intellihealth.truemeds.mvvm.data.appsflyer

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class AFLoginPageViewed(
    @SerializedName("is_truecaller") var isTrueCaller: Boolean = false,
)
