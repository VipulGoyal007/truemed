package com.intellihealth.truemeds.data.model.home

import com.intellihealth.salt.models.StickyNonStickyNotificationModel


data class ApplyCouponBottomSheetModel (
    val header: String?,
    val headerContent: String?,
    val subHeaderContent : String?,
    val buttonText: String?,
    val timerData : String?,
    var isTimerVisible : Boolean,
    var minOrderValue : String,
    var discountCashback: String,
    var expiryDays:String,
    var termsAndCondition:String,
    var setStickyData: StickyNonStickyNotificationModel?
)