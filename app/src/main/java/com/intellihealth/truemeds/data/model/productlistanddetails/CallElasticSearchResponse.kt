package com.intellihealth.truemeds.data.model.productlistanddetails

import com.google.gson.annotations.SerializedName
import com.intellihealth.truemeds.presentation.model.ProductInfoModel

data class CallElasticSearchResponse(

    @SerializedName("CUSTOMER_ALSO_BOUGHT") var CUSTOMER_ALSO_BOUGHT: ArrayList<ProductInfoModel> = arrayListOf()

)