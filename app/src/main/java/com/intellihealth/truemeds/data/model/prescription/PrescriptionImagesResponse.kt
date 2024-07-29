package com.intellihealth.truemeds.data.model.prescription

data class PrescriptionImagesResponse(
    var message: String,
    var responseData: List<ResponseData>,
    var statusCode: Int,
    var statusValue: String,
    var timeTakenInMs: Any
) {
    data class ResponseData(
        var imageId: Int,
        var imageUrl: String,
        var orderId: Int
    )
}