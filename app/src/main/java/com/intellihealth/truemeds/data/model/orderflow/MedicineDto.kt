package com.intellihealth.truemeds.data.model.orderflow

import com.google.gson.annotations.SerializedName

data class MedicineDto(
    @SerializedName("isKeepOrg") var isKeepOrg: Boolean? = null,
    @SerializedName("medicineName") var medicineName: String? = null,
    @SerializedName("productCode") var productCode: String? = null,
//    @SerializedName("medicineId") var medicineId: String? = null,
    @SerializedName("cxAcceptedSubs") var cxAcceptedSubs: Boolean? = null,
    @SerializedName("cxOrgAdded") var cxOrgAdded: Boolean? = null,
    @SerializedName("productDetailsId") var productDetailsId: Long? = null,
    @SerializedName("quantity") var quantity: Int? = null,
    @SerializedName("medicineQty") var medicineQty: Int? = null,
    @SerializedName("isCrossSellingProduct") var isCrossSellingProduct: Boolean? = null,
    @SerializedName("prevOrderId") var prevOrderId: Long? = null,
    @SerializedName("prevOrgProductId") var prevOrgProductId: Long? = null,
    @SerializedName("ogPdId") var ogPdId: Long? = null
)
