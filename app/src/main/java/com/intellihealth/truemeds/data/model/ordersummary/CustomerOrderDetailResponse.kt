package com.intellihealth.truemeds.data.model.ordersummary

data class CustomerOrderDetailResponse(
    var message: String,
    var responseData: ResponseData,
    var statusCode: Int,
    var statusValue: String,
    var timeTakenInMs: Int
) {
    data class ResponseData(
        var addressId: Long,
        var altMobNumber: String,
        var cxHasActiveAddress: Boolean,
        var cxHasActivePatient: Boolean,
        var drCallRequired: Boolean,
        var orderId: Long,
        var orderReorder: Boolean,
        var patientId: Long,
        var pharmacistCallRequired: Boolean,
        var prevPaymentId: Any,
        var regMobNumber: String
    )
}