package com.intellihealth.truemeds.mvvm.data.appsflyer

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class AFBannerClicked(
    @SerializedName("Banner Name")var bannerName : String? = null,
    @SerializedName("Banner Sequence number")var bannerSequenceNumber : Long? = null,
    @SerializedName("banner destination")var bannerDestination : String? = null
)