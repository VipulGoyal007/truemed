package com.intellihealth.truemeds.data.repository.datasource.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "reorder_alternate_subs")
class ReorderAlternateSubs(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Long?,
    @ColumnInfo(name = "medicineId") val medicineId: String,
    @ColumnInfo(name = "patientID") val patientId: Int,
    @ColumnInfo(name = "patientName") val patientName: String?,
    @ColumnInfo(name = "orderAddress") val orderAddress: String?,
    @ColumnInfo(name = "addressID") val addressId: Int,
    @ColumnInfo(name = "orderID") val orderId: Long,
    @ColumnInfo(name = "SubsMedProductCode") val subsMedProductCode: String?,
    @ColumnInfo(name = "isSubAvailable") val subAvailable: Boolean?,
    @ColumnInfo(name = "subImageUrl") val productImageUrls: String?,
    @ColumnInfo(name = "orgAddedQuantity") val addedQty: Int,
    @ColumnInfo(name = "altSubsMedProductCode") val altSubsMedProductCode: String?,
    @ColumnInfo(name = "altSubsDiscountPercentage") val altSubsDiscountPercentage: Double,
    @ColumnInfo(name = "altSubsSellingPrice") val altSubsSellingPrice: Double,
    @ColumnInfo(name = "altSubsMrp") val altSubsMrp: Double,
    @ColumnInfo(name = "altSubsMedName") val altSubsMedName: String?,
    @ColumnInfo(name = "altSubsCompanyName") val altSubsCompanyName: String?,
    @ColumnInfo(name = "isAltSubsColdStorage") val altSubsColdStorage: Boolean,
    @ColumnInfo(name = "altSubsDrugType") val altSubsDrugType: String?,
    @ColumnInfo(name = "altSubsRecommendedQty") val altSubsRecommendedQty: Int,
    @ColumnInfo(name = "altSubsCountryName") val altSubsCountryName: String?,
    @ColumnInfo(name = "altSubsUnit") val altSubsUnit: String?,
    @ColumnInfo(name = "altSubsImageUrl") val altSubsImageUrl: String?,
    @ColumnInfo(name = "altSubsCompanyAddress") val altSubsCompanyAddress: String?,
    @ColumnInfo(name = "isReplace") val replace: Boolean,
    @ColumnInfo(name = "subsPitched") val subsPitched: Boolean,
    @ColumnInfo(name = "altSubsPackSize") val altSubsPackSize: Double,
    @ColumnInfo(name = "altSubsSavingPercentage") val altSubsSavingPercentage: String?,
    @ColumnInfo(name = "coldChainDisabled") val coldChainDisabled: Boolean,
    @ColumnInfo(name = "isAltSubAvailable") val altSubAvailable: Boolean,
    @ColumnInfo(name = "isOrgDisabled") val orgDisabled: Boolean,
    @ColumnInfo(name = "cxAcceptedSubs") val cxAcceptedSubs: Boolean,
    @ColumnInfo(name = "cxKeepOriginal") val cxKeepOriginal: Boolean,
    @ColumnInfo(name = "showOnlyOrg") val showOnlyOrg: Boolean

)