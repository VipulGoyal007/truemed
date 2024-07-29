package com.intellihealth.truemeds.data.model.prescription

data class ImageUploadRequest(
    var fileName: String? = null,
    var image: String? = null,
    var prevOrderId: String? = null,
    var orderId: String? = null,
    var imageId: String? = null,
    var patientId: String? = null,
)
