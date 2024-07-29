package com.intellihealth.truemeds.data.model.coupon

import com.intellihealth.salt.constants.CouponConstant
import com.intellihealth.salt.models.CouponModel
import java.util.Random

data class CouponResponse(
    var message: String,
    var isSuccess: Boolean,
    var totalCartAmount: Double,
    var savingAmount: Double,
    var couponAppliedAmt: Double = 0.0,
) {}