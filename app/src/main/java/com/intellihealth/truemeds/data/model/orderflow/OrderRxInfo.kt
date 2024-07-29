package com.intellihealth.truemeds.data.model.orderflow

import com.google.gson.annotations.SerializedName

data class OrderRxInfo(
    @SerializedName("orderId") var orderId: Long? = null,
    @SerializedName("imageUrl") var imageUrl: String? = null,
    @SerializedName("imageId") var imageId: Long? = null
)
