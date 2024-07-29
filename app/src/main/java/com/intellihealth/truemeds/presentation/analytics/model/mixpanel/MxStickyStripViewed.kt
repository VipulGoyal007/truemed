package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName

//todo same use for sticky_strip_clicked
data class MxStickyStripViewed(
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("coupon_id")
    var couponId: String? = null,
    @SerializedName("coupon_name")
    var couponName: String? = null,
    @SerializedName("coupon_subtitle")
    var couponSubtitle: String? = null,
    @SerializedName("is_coupon_applied")
    var isCouponApplied: Boolean = false,
    @SerializedName("urgency_time_remaining")
    var urgencyTimeRemaining: Long? = null
)