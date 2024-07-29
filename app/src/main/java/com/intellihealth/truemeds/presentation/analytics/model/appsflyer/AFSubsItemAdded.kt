package com.intellihealth.truemeds.mvvm.data.appsflyer

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
//import com.intellihealth.truemeds.utils.Constants

@Keep
data class AFSubsItemAdded(
    @SerializedName("product_name") var product_name: String? = "",
    @SerializedName("product_mrp") var product_mrp: Double? = 0.0,
    @SerializedName("is_chronic") var is_chronic: Boolean? = false,
    @SerializedName("product_sale_price") var product_sale_price: Double? = 0.0,
    @SerializedName("is_otc") var is_otc: Boolean? = false,
    @SerializedName("clicked_on_page") var clicked_on_page: String? = "",
    @SerializedName("af_currency") var afCurrency: String = /*Constants.AF_CURRENCY*/ "INR"

)