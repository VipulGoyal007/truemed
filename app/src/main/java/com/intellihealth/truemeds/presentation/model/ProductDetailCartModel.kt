package com.intellihealth.truemeds.presentation.model

import com.example.example.PaymentSelectionInfo
import com.google.gson.annotations.SerializedName
import com.intellihealth.salt.models.CartModel

/**
 * Use this class to fetch intent attributes
 * **/
data class ProductDetailCartModel(

    @SerializedName("mrp") var mrp : Double? = null,
    @SerializedName("discount") var discount: Double?= null,
    @SerializedName("couponDiscount") var couponDiscount: Double? = null,
    @SerializedName("couponCode" ) var couponCode: String?= null,
    @SerializedName("savingAmount" ) var savingAmount : Double? = null,
    @SerializedName("savingsText") var savingsText : String? = null,
    @SerializedName("packagingCharge" ) var packagingCharge : Int? = null,
    @SerializedName("deliveryCharge" ) var deliveryCharge: Int?  = null,
    @SerializedName("addMoreForFreeDelivery" ) var addMoreForFreeDelivery : Double?= null,
    @SerializedName("tmCash"  ) var tmCash: Double? = null,
    @SerializedName("tmCredit" ) var tmCredit: Double?= null,
    @SerializedName("payableAmount") var payableAmount: Double?= null,
    @SerializedName("paymentMode") var paymentMode: String? = null,
    @SerializedName("paymentSelectionInfo") var paymentSelectionInfo: PaymentSelectionInfo? = PaymentSelectionInfo()

){
    fun toCartModel(): CartModel {
        return CartModel(
            "View cart",
            0,
            payableAmount?:0.0
        )}
}

