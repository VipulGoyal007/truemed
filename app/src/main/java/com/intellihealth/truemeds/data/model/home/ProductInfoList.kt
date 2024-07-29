package com.example.example

import com.google.gson.annotations.SerializedName


data class ProductInfoList(

    @SerializedName("sequence") var sequence: Int? = null,
    @SerializedName("header") var header: String? = null,
    @SerializedName("description") var description: String? = null

)