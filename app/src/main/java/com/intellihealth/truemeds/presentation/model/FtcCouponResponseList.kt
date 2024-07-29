package com.intellihealth.truemeds.presentation.model

import com.intellihealth.truemeds.data.model.orderflow.CouponCodeDataModel

data class FtcCouponResponseList(
    var currentServerFtcTime: Long = 0L,
    var expiryServerFtcTime: Long = 0L,
    var isFtcCouponApplied: Boolean = false,
    val couponList: MutableList<CouponCodeDataModel> = ArrayList(emptyList())
)