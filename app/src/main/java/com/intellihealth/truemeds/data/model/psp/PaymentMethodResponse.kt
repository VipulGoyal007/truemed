package com.intellihealth.truemeds.data.model.psp

import com.intellihealth.salt.models.CashHandlingInfoModel
import com.intellihealth.salt.models.PaymentOptionRadioModel

data class PaymentMethodResponse(
    var message: String? = "",
    var statusValue: String? = "",
    var statusCode: Int = 0,
    var responseData: List<ResponseData>

) {
    data class ResponseData(
        val paymentCategory: String?,
        val paymentModeUrl: String?,
        var paymentModeUrlId: Int?,
        val paymentOptions: List<PaymentOption?>?
    )

    data class PaymentOption(
        val active: Boolean?,
        val createdOn: Long?,
        val iconId: Int,
        val iconName: String?,
        val iconPath: String?,
        val iconSubType: String?,
        val iconType: String?,
        val paymentMethodId: Int?,
        var isPaymentMethodSelected: Boolean = false,
        var paymentOptionRadioModel: PaymentOptionRadioModel?
    )

}