package com.intellihealth.truemeds.presentation.analytics.model.firebase

import com.google.gson.annotations.SerializedName

//todo this is same use for Pdpage_sub_view,Pdpage_subadded,Subs_added,Subs_popup,Search_subs_added

data class FbSubsView(
    @SerializedName("product_selling_price")
    var productSellingPrice: Double? = null,

    @SerializedName("product_mrp")
    var productMrp: Double? = null,

)
