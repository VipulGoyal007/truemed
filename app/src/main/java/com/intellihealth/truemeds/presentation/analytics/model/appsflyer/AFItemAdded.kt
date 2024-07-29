package com.intellihealth.truemeds.mvvm.data.appsflyer

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
//import com.intellihealth.truemeds.utils.Constants

@Keep
data class AFItemAdded(
    @SerializedName("product_name") val product_name: String? = "",
    @SerializedName("product_mrp") val product_mrp: Double? = 0.0,
    @SerializedName("is_chronic") val is_chronic: Boolean? = null,
    @SerializedName("is_substitutable") val is_substitutable: Boolean? = false,
    @SerializedName("product_sale_price") val product_sale_price: Double? = 0.0,
    @SerializedName("is_otc") val is_otc: Boolean? = null,
    @SerializedName("clicked_on_page") val clicked_on_page: String? = "",
    @SerializedName("af_currency") val afCurrency: String = /*Constants.AF_CURRENCY*/ "INR"
)