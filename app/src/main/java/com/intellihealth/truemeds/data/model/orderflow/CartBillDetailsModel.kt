package com.intellihealth.truemeds.data.model.orderflow

import android.os.Parcelable
import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Keep
@Parcelize
data class CartBillDetailsModel(
    @SerializedName("orderId")
    var orderId : Long? = 0,
    @SerializedName("mrp")
    var totalMrp: Double = 0.0,
    @SerializedName("discount")
    var totalDiscount: Double = 0.0,
    @SerializedName("packagingCharge")
    var sellerPackagingCharges: Double = 0.0,
    @SerializedName("deliveryCharge")
    var deliveryCharge: Double = 0.0,
    @SerializedName("tmCash")
    var tmReward: Double = 0.0,
    @SerializedName("tmCredit")
    var tmCredit: Double = 0.0,
    @SerializedName("payableAmt")
    var totalPayableAmount: Double = 0.0,
    @SerializedName("couponCode")
    var couponAppliedName: String = "",
    @SerializedName("couponDiscountAmt")
    var couponCodeDiscount: Double = 0.0,
    var billDetailsTitle: String = "",
    @SerializedName("savingsText")
    var saveOrderMessage: String = "",
    @SerializedName("savingValue")
    var saveOrderPrice: Double? = 0.0

) : Parcelable {

}


