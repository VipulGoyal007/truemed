package com.intellihealth.truemeds.data.model.home

import com.intellihealth.truemeds.data.model.productlistanddetails.Hits
import com.intellihealth.truemeds.data.model.productlistanddetails.Shards
import com.intellihealth.truemeds.data.model.productlistanddetails.WorkflowStatusId

data class AllPatientsOrderDetailsResponse(
    val additionalDetails: AdditionalDetails?,
    val addressDetails: String?,
    val alternateNumber: Any?,
    val averageDiscountPercent: String?,
    val deliveryCharge: Double?,
    val deliveryOnAmount: Double?,
    val edd: String?,
    val isReOrder: Boolean?,
    val medicineDetails: List<MedicineDetail?>?,
    val myMedicines: List<MyMedicine?>?,
    val offerDiscountApplied: Double?,
    val offerId: Int?,
    val orderId: Long?,
    val orderValue: Double?,
    val patientsDetails: List<PatientsDetail?>?,
    val paymentTypeId: Int?,
    val savingPercentage: Double?,
    val savingValue: Double?,
    val selectedAddress: String?,
    val selectedAddressId: Int?,
    val statusId: StatusId?,
    val subsTotal: Double?,
    val tmCash: Double?,
    val tmCredit: Double?,
    val totalMrp: String?,
    val totalMrpAfterDiscount: String?,
    val workflowStatusId: WorkflowStatusId?
) {
    data class AdditionalDetails(
        val hits: Hits?,
        val shards: Shards?,
        val timedOut: Boolean?,
        val took: Int?
    )

    data class MedicineDetail(
        val companyName: String?,
        val crossSellingProduct: Boolean?,
        val cxAcceptedSubs: Boolean?,
        val cxKeepOriginal: Boolean?,
        val cxOrgAdded: Boolean?,
        val disabled: Boolean?,
        val discount: Double?,
        val discountPercentage: Any?,
        val discountedPrice: Any?,
        val keepOriginal: Boolean?,
        val medicineId: String?,
        val medicineName: String?,
        val medicineQty: Int?,
        val mrp: Double?,
        val orgAvailable: Boolean?,
        val orgColdStorage: Boolean?,
        val originalQuantity: Any?,
        val pack: String?,
        val prevOrderId: Any?,
        val prevOrgProductId: Any?,
        val price: Any?,
        val productCode: Any?,
        val productDetailsId: Int?,
        val reOrder: Boolean?,
        val rxRequired: Boolean?,
        val saveUpto: String?,
        val subsColdStorage: Boolean?,
        val subsPitched: Boolean?,
        val subsQuantity: Any?,
        val suppliedByTm: Boolean?
    )

    data class MyMedicine(
        val composition: List<String?>?,
        val createdAt: Any?,
        val finalSubsId: Int?,
        val prescribed: Prescribed?,
        val prevRecommended: Any?,
        val recommended: Recommended?
    ) {
        data class Prescribed(
            val companyName: String?,
            val crossSellingProduct: Boolean?,
            val cxAcceptedSubs: Boolean?,
            val cxKeepOriginal: Boolean?,
            val cxOrgAdded: Boolean?,
            val disabled: Boolean?,
            val discount: Any?,
            val discountPercentage: Double?,
            val discountedPrice: Double?,
            val keepOriginal: Boolean?,
            val medicineId: Any?,
            val medicineName: String?,
            val medicineQty: Any?,
            val mrp: Any?,
            val orgAvailable: Boolean?,
            val orgColdStorage: Boolean?,
            val originalQuantity: Int?,
            val pack: String?,
            val prevOrderId: Long?,
            val prevOrgProductId: Int?,
            val price: Double?,
            val productCode: String?,
            val productDetailsId: Int?,
            val reOrder: Boolean?,
            val rxRequired: Boolean?,
            val saveUpto: String?,
            val subsColdStorage: Boolean?,
            val subsPitched: Boolean?,
            val subsQuantity: Any?,
            val suppliedByTm: Boolean?
        )

        data class Recommended(
            val companyName: String?,
            val crossSellingProduct: Boolean?,
            val cxAcceptedSubs: Boolean?,
            val cxKeepOriginal: Boolean?,
            val cxOrgAdded: Boolean?,
            val disabled: Boolean?,
            val discount: Any?,
            val discountPercentage: Double?,
            val discountedPrice: Double?,
            val keepOriginal: Boolean?,
            val medicineId: Any?,
            val medicineName: String?,
            val medicineQty: Any?,
            val mrp: Any?,
            val orgAvailable: Boolean?,
            val orgColdStorage: Boolean?,
            val originalQuantity: Any?,
            val pack: String?,
            val prevOrderId: Any?,
            val prevOrgProductId: Any?,
            val price: Double?,
            val productCode: String?,
            val productDetailsId: Any?,
            val reOrder: Boolean?,
            val rxRequired: Boolean?,
            val saveUpto: String?,
            val subsColdStorage: Boolean?,
            val subsPitched: Boolean?,
            val subsQuantity: Int?,
            val suppliedByTm: Boolean?
        )
    }

    data class PatientsDetail(
        val active: Boolean?,
        val age: String?,
        val genderName: String?,
        val images: List<Any?>?,
        val patientId: Int?,
        val patientName: String?,
        val relationId: Int?,
        val relationName: String?
    )

    data class StatusId(
        val active: Boolean?,
        val createdBy: Any?,
        val createdOn: Any?,
        val description: Any?,
        val lastModifiedBy: Any?,
        val lastModifiedOn: Any?,
        val name: String?,
        val serialId: Int?,
        val value: String?
    )


}