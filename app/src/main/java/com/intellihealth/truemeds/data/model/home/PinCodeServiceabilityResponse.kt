package com.intellihealth.truemeds.data.model.home

import com.google.gson.annotations.SerializedName


data class PinCodeServiceabilityResponse(
    var message: String? = "",
    var statusValue: String? = "",
    var statusCode: Int = 0,
    var responseData: ResponseData,
) {
    data class ResponseData(
        val clickpostPincodeData: ClickpostPincodeData?,
        @SerializedName("servicable")
        val isServicable: Boolean?,
        val pincode: String? ="",
        val pincodeData: List<PincodeData?>?
    )
    data class ClickpostPincodeData(
        val meta: Meta?, val result: List<Result?>?
    ) {
        data class Meta(
            val message: String?, val status: Int?, val success: Boolean?
        )

        data class Result(
            val accountCode: String?,
            val account_id: Int?,
            val comitted_sla: Any?,
            val cp_id: Int?,
            val service_type: String?,
            val serviceable: Serviceable?,
            val shipping_charge: ShippingCharge?
        ) {
            data class Serviceable(
                val COD: Boolean?,
                val EXCHANGE: Boolean?,
                val PICKUP: Boolean?,
                val PREPAID: Boolean?
            )

            class ShippingCharge
        }
    }

    data class PincodeData(
        val city: String?,
        val country: String?,
        val isColdChainDeliverable: Boolean?,
        val pincode: String?,
        val region: Any?,
        val shipping_partner_id: Int?,
        val state: String?,
        val surface_delivery_days: Int?,
        val warehouseId: Int?
    )
}