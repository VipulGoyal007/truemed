package com.intellihealth.truemeds.data.repository.datasource.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "addedSubsOrgInfo")
class OrgSubsInfo(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Long?,
    @ColumnInfo(name = "medicineId") val medicineId: String,
    @ColumnInfo(name = "medicineName") val medicineName: String?,
    @ColumnInfo(name = "companyName") val companyName: String?,
    @ColumnInfo(name = "discount") val discount: Double,
    @ColumnInfo(name = "mrp") val mrp: Double,
    @ColumnInfo(name = "addedQty") val addedQty: Int,
    @ColumnInfo(name = "composition") val composition: String?,
    @ColumnInfo(name = "subDiscountPercentage") val subsDiscountPercentage: String?,
    @ColumnInfo(name = "subsSellingPrice") val subsSellingPrice: Double,
    @ColumnInfo(name = "isSubFound") val subsFound: Boolean,
    @ColumnInfo(name = "isFromApi") val fromApi: Boolean,
    @ColumnInfo(name = "subsMedProductCode") var subsMedProductCode: String?,
    @ColumnInfo(name = "subsMrp") val subsMrp: Double,
    @ColumnInfo(name = "subsMedName") var subsMedName: String?,
    @ColumnInfo(name = "subCompanyName") val subCompanyName: String?,
    @ColumnInfo(name = "isColdStorage") val coldStorage: Boolean,
    @ColumnInfo(name = "drugType") val drugType: String?,
    @ColumnInfo(name = "originalPackSize") val originalPackSize: Double,
    @ColumnInfo(name = "substitutePackSize") val substitutePackSize: Double,
    @ColumnInfo(name = "prescriptionRequired") val rxRequired: Boolean,
    @ColumnInfo(name = "maxCapped") val maxCapped: Int,
    @ColumnInfo(name = "subsReccommendedQty") val subsRecommendedQty: Int,
    @ColumnInfo(name = "originalCountryNm") val originalCountryNm: String?,
    @ColumnInfo(name = "subs_country_nm") val subsCountryNm: String?,
    @ColumnInfo(name = "subs_unit") val subsUnit: String?,
    @ColumnInfo(name = "original_unit") val originalUnit: String?,
    @ColumnInfo(name = "product_image_urls") val productImageUrls: String?,
    @ColumnInfo(name = "original_company_addr") val originalCompanyAddress: String?,
    @ColumnInfo(name = "orgAvailable") val orgAvailable: Boolean
//    @ColumnInfo(name = "orgSellingPrice") var orgSellingPrice: Double
)

