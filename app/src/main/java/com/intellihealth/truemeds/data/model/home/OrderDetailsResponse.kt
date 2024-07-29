package com.intellihealth.truemeds.data.model.home

import com.google.gson.annotations.SerializedName
import com.intellihealth.truemeds.data.model.productlistanddetails.WorkflowStatusId

data class OrderDetailsResponse(
    val message: String?,
    val statusValue: String?,
    val statusCode: String?,
    val addressDetails: AddressDetails?,
    val alternateNumber: Any?,
    val cancelledReason: Any?,
    val checkerDesk: Any?,
    val deliveryDate: String?,
    val finalCalcAmt: FinalCalcAmt?,
    val imageMasterDto: List<Any?>?,
    val isChronicAdded: Boolean?,
    val isOtcAdded: Boolean?,
    val orderDate: Long?,
    val orderId: Long?,
    val orderStatus: OrderStatus?,
    val orgSubsId: Int?,
    val otcOrder: Boolean?,
    val patientId: Int?,
    val paymentMode: PaymentMode?,
    val paymentSelectionInfo: PaymentSelectionInfo?,
    val paymentStatus: String?,
    val paymentTypeRestriction: Any?,
    val productSubsMappingList: List<ProductSubsMapping?>?,
    val savings: Double?,
    val workflowStatusId: WorkflowStatusId?
) {
    data class AddressDetails(
        val active: Boolean?,
        val addressId: Int?,
        val addressType: String?,
        val addressline1: String?,
        val addressline2: String?,
        val addressline3: String?,
        val cityId: Int?,
        val cityName: String?,
        val countryId: Int?,
        val countryName: String?,
        val landmark: String?,
        val pincode: String?,
        val pincodeId: Int?,
        val selected: Boolean?,
        val stateId: Int?,
        val stateName: String?
    )

    data class FinalCalcAmt(

        @SerializedName("couponDiscountAmt")
        val couponDiscountPrice: Double? = 0.0,
        @SerializedName("deliveryCharge")
        val deliveryCharge: Double? = 0.0,
        @SerializedName("discount")
        val discount: Double? = 0.0,
        @SerializedName("payableAmt")
        val payableAmt: Double? = 0.0,
        @SerializedName("orderId")
        val orderId: Long? = 0,
        @SerializedName("mrp")
        val mrp: Double? = 0.0,
        @SerializedName("packagingCharge")
        val packagingCharge: Double? = 0.0,
        @SerializedName("savingValue")
        val savingValue: Double? = 0.0,
        @SerializedName("tmCash")
        val tmCash: Double? = 0.0,
        @SerializedName("tmCredit")
        val tmCredit: Double? = 0.0,
        @SerializedName("couponCode")
        val couponCode: String? = "",
        @SerializedName("addMoreForFreeDelivery")
        val addMoreForFreeDelivery: Double? = 0.0,
        @SerializedName("savingsText")
        val savingsText : String?=""

    )

    data class OrderStatus(
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

    data class PaymentMode(
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

    data class PaymentSelectionInfo(
        val lastPaymentMethod: String?,
        val lastPaymentMethodIconUrl: String?,
        val lastPaymentMethodId: Any?,
        val paymentMethod: Any?,
        val paymentMethodIconUrl: Any?,
        val paymentMethodId: Any?,
        val paymentNote: String?,
        val paymentSpecificCouponApplied: Boolean?
    )

    data class ProductSubsMapping(
        val coldChainDisabled: Boolean?,
        val crossSellingProduct: Boolean?,
        val cxAcceptedSubs: Boolean?,
        val cxKeepOriginal: Boolean?,
        val cxOrgAdded: Boolean?,
        val disabled: Boolean?,
        val finalSubsId: Int?,
        val medActive: Boolean?,
        val medReOrder: Boolean?,
        val orgAvailable: Boolean?,
        val orgColdStorage: Boolean?,
        val orgCompanyName: String?,
        val orgDiscount: Double?,
        val orgGenericBranded: String?,
        val orgMaxCappedQty: Int?,
        val orgMaxCappedWeight: Int?,
        val orgMedName: String?,
        val orgMrp: Double?,
        val orgPackSize: String?,
        val orgProductCd: String?,
        val orgQuantity: Int?,
        val orgRxRequired: Boolean?,
        val orgStrength: String?,
        val orgSubGroup: String?,
        val orgUnit: String?,
        val productDetailsId: Int?,
        val statusId: Int?,
        val subsColdStorage: Boolean?,
        val subsCompanyName: String?,
        val subsGenericBranded: String?,
        val subsMaxCappedQty: Int?,
        val subsMaxCappedWeight: Int?,
        val subsMedList: Any?,
        val subsMedName: String?,
        val subsMrp: Double?,
        val subsPackSize: String?,
        val subsProductCd: String?,
        val subsQuantity: Int?,
        val subsSellingPrice: Double?,
        val subsStrength: String?,
        val subsSubGroup: String?,
        val subsUnit: String?
    )


}