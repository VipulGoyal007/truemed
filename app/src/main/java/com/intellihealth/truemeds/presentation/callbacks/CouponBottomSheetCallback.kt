package com.intellihealth.truemeds.presentation.callbacks

import com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse

interface CouponBottomSheetCallback {
    fun applyCouponButtonClick(couponCodeResponse: CouponCodeResponse.Coupon?)
    fun removeCouponButtonClick(couponCodeResponse: CouponCodeResponse.Coupon?)
}