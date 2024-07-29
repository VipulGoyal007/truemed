package com.intellihealth.truemeds.data.model.orderflow

import com.google.gson.annotations.SerializedName

data class CustomerOrderDetailsResponseData(
    @SerializedName("orderId") var orderId: Int? = null,
    @SerializedName("subsId") var subsId: Int? = null,
    @SerializedName("prevPaymentId") var prevPaymentId: String? = null,
    @SerializedName("addressId") var addressId: Long? = null,
    @SerializedName("patientId") var patientId: Long? = null,
    @SerializedName("cxHasActiveAddress") var cxHasActiveAddress: Boolean? = null,
    @SerializedName("cxHasActivePatient") var cxHasActivePatient: Boolean? = null,
    @SerializedName("regMobNumber") var regMobNumber: String? = null,
    @SerializedName("altMobNumber") var altMobNumber: String? = null,
    @SerializedName("drCallRequired") var drCallRequired: Boolean? = false,
    @SerializedName("pharmacistCallRequired") var pharmacistCallRequired: Boolean? = false,
    @SerializedName("orderReorder") var orderReorder: Boolean? = null,
    @SerializedName("addedPatientCount") var addedPatientCount: Int? = null,
    @SerializedName("addedAddressCount") var addedAddressCount: Int? = null,
    @SerializedName("edd") var edd: String? = null,
    @SerializedName("deliveryDays") var deliveryDays: Int? = null,
    @SerializedName("reorder") var reorder: Boolean? = false,
    @SerializedName("orderTypeId") var orderTypeId: Int? = null,
    @SerializedName("rxRequired") var rxRequired: Boolean? = false,
    @SerializedName("chronic") var chronic: Boolean? = false,
    @SerializedName("otc") var otc: Boolean? = false,
    @SerializedName("generic") var isGeneric: Boolean? = false,
    @SerializedName("orderType") var orderType: String? = null,
    @SerializedName("orderInState") var orderInState: String? = null,
)
