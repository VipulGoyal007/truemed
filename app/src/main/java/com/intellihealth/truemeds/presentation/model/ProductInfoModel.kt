package com.intellihealth.truemeds.presentation.model

import com.intellihealth.salt.constants.FullWidthProductCardConstants
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine
import com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager

data class ProductInfoModel(
    var cardType: FullWidthProductCardConstants? = null,
    var isReplaced: Boolean = false,
    var isDisplayAddIcon: Boolean = false,
    var isOrgAddedToCart: Boolean = false,
    var isAutoReplaced: Boolean = false,
    var isSubsAddedToCart: Boolean = false,
    var subsAddedAsOrg: Boolean = false,
    var showRemoveButton: Boolean = false,
    var product: Product,
    var suggestion: Product?,
    var sequenceNo: Int? = 1000,
    var sameCompositionProduct: String = "",
    var sectionHeading:String?="",
    var sectionStackedHeading:String?="",
    var crossSellingItemClickPosition:Int?=null,
    var isAvailableSubsAddedInCart: Boolean = false
) {
    fun toSdkObject(): com.intellihealth.salt.models.ProductInfoModel {
        return com.intellihealth.salt.models.ProductInfoModel(
            cardType = cardType,
            isReplaced = false,
            isOrgAddedToCart = isOrgAddedToCart,
            isAutoReplaced = isAutoReplaced,
            isSubsAddedToCart = isSubsAddedToCart,
//            isDisplayAddIcon = suggestion != null && product.subsFound && suggestion?.qty == 0,
//            showRemoveButton = showRemoveButton,
            product = product.toSdkObject(),
            suggestion = suggestion?.toSdkObject(),
            sectionHeading= sectionHeading,
            itemClickPosition = crossSellingItemClickPosition?:0,
            minDiscountValue =   SharedPrefManager.getInstance().minMedDiscountToBeHidden
        )
    }

    fun productAsCartItem(isFromAPI: Boolean, addedQty: Int): CartMedicine {
        return CartMedicine(
            null,
            product.productCode,
            product.skuName,
            product.manufacturerName,
            product.discount,
            if (isFromAPI) product.mrp.toString().toDouble() / addedQty else product.mrp.toString().toDouble(),
            addedQty,
            product.composition,
            product.subsSavingPercentage.toString(),
            suggestion?.sellingPrice ?: 0.0,
            suggestion != null,
            isFromAPI,
            suggestion?.productCode ?: "",
            suggestion?.mrp ?: 0.0,
            suggestion?.skuName ?: "",
            suggestion?.manufacturerName ?: "",
            false,
            product.drugType,
            product.packSize?.toDoubleOrNull() ?: 0.0,
            suggestion?.packSize?.toDoubleOrNull() ?: 0.0,
            false,
            product.maxCappedQty,
            1,
            "IN",
            "IN",
            product.unit,
            suggestion?.unit ?: "Unit",
            product.productImageUrl,
            product.manufacturerAddr,
            product.isAvailable,
            product.productDetailsId ?: 0,
            0,
            0,
//            product.sellingPrice
        )
    }

    fun suggestionAsCartItem(isFromAPI: Boolean, addedQty: Int): CartMedicine {
        return CartMedicine(
            null,
            suggestion?.productCode ?: "",
            suggestion?.skuName,
            suggestion?.manufacturerName,
            suggestion?.discount ?: 0.0,
            (suggestion?.mrp.toString().toDouble() / addedQty), addedQty,
            suggestion?.composition,
            suggestion?.subsSavingPercentage.toString(),
            suggestion?.sellingPrice ?: 0.0,
            suggestion != null,
            isFromAPI,
            suggestion?.productCode ?: "",
            suggestion?.mrp ?: 0.0,
            suggestion?.skuName ?: "",
            suggestion?.manufacturerName ?: "",
            false,
            suggestion?.drugType,
            suggestion?.packSize?.toDoubleOrNull() ?: 0.0,
            suggestion?.packSize?.toDoubleOrNull() ?: 0.0,
            false,
            suggestion?.maxCappedQty ?: 0,
            1,
            "IN",
            "IN",
            suggestion?.unit,
            suggestion?.unit ?: "Unit",
            suggestion?.productImageUrl,
            suggestion?.manufacturerAddr,
            suggestion?.isAvailable ?: false,
            0,
            0,
            0
//            suggestion.sellingPrice
        )
    }

    fun getOrgSubsInfo(isFromAPI: Boolean, addedQty: Int): OrgSubsInfo {
        return OrgSubsInfo(
            null,
            product.productCode,
            product.skuName,
            product.manufacturerName,
            product.discount,
            product.mrp, addedQty,
            product.composition,
            product.subsSavingPercentage,
            suggestion?.sellingPrice ?: 0.0,
            product.subsFound,
            isFromAPI,
            suggestion?.productCode,
            suggestion?.mrp ?: 0.0,
            suggestion?.skuName ?: "",
            suggestion?.manufacturerName ?: "",
            product.coldStorage,
            product.drugType,
            product.packSize?.toDouble() ?: 1.0,
            suggestion?.packSize?.toDouble() ?: 1.0,
            false,
            product.maxCappedQty,
            1,
            "IN",
            "IN",
            suggestion?.unit,
            product.unit,
            product.productImageUrl,
            product.manufacturerAddr,
            product.isAvailable
        )
    }
}