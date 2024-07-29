package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName
import java.util.Date


data class MxCouponRemoved(
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("coupon_discount_amount")
    var couponDiscountAmount: Double? = null,

    //todo unwanted space also on prod

    @SerializedName("coupon_expiry_date")
    var couponExpiryDate: Date? = null,
    @SerializedName("coupon_expiry_period")
    var couponExpiryPeriod: Int? = null,
    @SerializedName("coupon_id")
    var couponId: String? = null,
    @SerializedName("coupon_name")
    var couponName: String? = null,
    @SerializedName("discount_amount")
    var discountAmount: Double? = null,
    @SerializedName("urgency_time_remaining")
    var urgencyTimeRemaining: Long? = null,
    @SerializedName("coupon_subtitle")
    var couponSubtitle: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null
)