package com.intellihealth.truemeds.presentation.model

/**
 * Use this class to fetch intent attributes
 * **/
data class BundlePassthroughData(
    /**
     * common attributes which are used across the app
     * **/
    var clickedOnPage: String?,
    var itemNames: List<String>?,
    var productIds: List<String>?,
    var isRxRequired: Boolean?,
    var isOtcAdded: Boolean?,
    var isChronicAdded: Boolean?,
    var isGenericAdded: Boolean?,
    var totalOutOfStockCount: Int?,
    
    /**
     * PSP attributes
     * **/
    var paymentUnsuccessful: Boolean?,
    var addCOD: Boolean?,
    var patientId: Long?,
    var patientType: String?,
    var patientAge: Int?,
    var patientGender: String?,
    var cityName: String?,
    var stateName: String?,
    var pinCode: Int?,
    var addressType: String?,
    var currentOrderStatus: String?,
    var currentOrderStatusId: Int?,
    var prescriptionUploadedCount: Int?,
    var trackPurchaseEvents: String?,
    var lastSelectedPaymentMethod: String?,
    var lastSelectedPaymentMethodId: Long?,
    var pageSection: String?,
    var addMoreForCod: Double?,
    var paymentRestrictedType: Int?,
    var restrictCod: Boolean?,
    var isReorder: Boolean?,
    var payableAmountButtonText: Boolean?,
    var onlyPrescription: Boolean?,
    var orderId: Long?,
    var isPaymentSpecificCoupon: Boolean?,
    var appliedCouponCode: String?

) {
    constructor() : this(null,
        emptyList(),
        emptyList(),
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null
    )
}
