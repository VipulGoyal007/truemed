package com.intellihealth.truemeds.mvvm.data.appsflyer

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
//import com.intellihealth.truemeds.utils.Constants

@Keep
data class AFPdpViewed(
    @SerializedName("product_name") val product_name: String? = "",
    @SerializedName("product_mrp") val product_mrp: Double? = 0.0,
    @SerializedName("is_chronic") var is_chronic: Boolean? = false,
    @SerializedName("is_substitutable") val is_substitutable: Boolean? = false,
    @SerializedName("product_sale_price") val product_sale_price: Double? = 0.0,
    @SerializedName("is_otc") var is_otc: Boolean? = false,
    @SerializedName("is_not_in_stock") val is_not_in_stock: Boolean? = false,
    @SerializedName("af_currency") val afCurrency: String = /*Constants.AF_CURRENCY*/ "INR"
)