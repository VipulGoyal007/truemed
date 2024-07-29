package com.intellihealth.truemeds.data.model.orderflow

import com.google.gson.annotations.SerializedName

data class GetCustomerOrderDetails(
    @SerializedName("message") var message: String? = null,
    @SerializedName("statusValue") var statusValue: String? = null,
    @SerializedName("statusCode") var statusCode: Int? = null,
    @SerializedName("timeTakenInMs") var timeTakenInMs: String? = null,
    @SerializedName("responseData") var responseData: CustomerOrderDetailsResponseData? = CustomerOrderDetailsResponseData()
)
