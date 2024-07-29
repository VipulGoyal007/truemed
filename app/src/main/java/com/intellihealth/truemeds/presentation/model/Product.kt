package com.intellihealth.truemeds.presentation.model

import com.google.gson.annotations.SerializedName
import com.intellihealth.salt.constants.FWPCWarningConstants
import com.intellihealth.salt.models.PriceInfo
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine
import com.intellihealth.truemeds.data.utils.removeExtraZeros

data class Product(
    var productDetailsId: Long? = null,
    var prevOrderId: Long?,
    val prevOrgProductId: Long?,
    @SerializedName("productCode") var productCode: String = "",
    @SerializedName("skuName") var skuName: String? = "",
    @SerializedName("availabilityStatus") var availabilityStatus: String? = "",
    @SerializedName("availabilityMessage") var availabilityMessage: String? = "",
    @SerializedName("available") var isAvailable: Boolean = true,
    @SerializedName("suppliedByTm") var suppliedByTm: Boolean = false,
    @SerializedName("manufacturerName") var manufacturerName: String? = "",
    @SerializedName("maxCappedQty") var maxCappedQty: Int = 0,
    @SerializedName("mrp") var mrp: Double = 0.0,
    @SerializedName("sellingPrice") var sellingPrice: Double = 0.0,
    @SerializedName("discount") var discount: Double = 0.0,
    @SerializedName("packSize") var packSize: String? = "",
    @SerializedName("unit") var unit: String? = "",
    @SerializedName("packForm") var packForm: String? = "",
    @SerializedName("pricePerUnitLabel") var pricePerUnitLabel: String? = "",
    @SerializedName("productImageUrl") var productImageUrl: String? = "",
    @SerializedName("qty") var qty: Int? = 0,
    @SerializedName("composition") var composition: String? = "",
    @SerializedName("subsSavingPercentage") var subsSavingPercentage: String?,
    @SerializedName("coldStorage") var coldStorage: Boolean = false,
    @SerializedName("drugType") var drugType: String? = "",// TODO missing from response
    @SerializedName("cxAcceptedSubs") var cxAcceptedSubs: Boolean = false,// TODO missing from response
    @SerializedName("cxKeepOriginal") var cxKeepOriginal: Boolean = false,// TODO missing from response
    @SerializedName("switchBackSkuName") var switchBackSkuName: String? = "",
    @SerializedName("switchBackProductCode") var switchBackProductCode: String? = "",
    @SerializedName("switchBackImageUrl") var switchBackImageUrl: String? = "",
    @SerializedName("preSubsSkuName") var preSubsSkuName: String? = "",
    @SerializedName("preSubsProductCode") var preSubsProductCode: String? = "",
    @SerializedName("prevSubsAvailabilityMessage") var prevSubsAvailabilityMessage: String? = "",
    @SerializedName("highlightedInfo") var highlightedInfo: List<String>? = null,// TODO missing from response
    @SerializedName("usersAlsoBoughtMessage") var usersAlsoBoughtMessage: String? = "",// TODO missing from response
    @SerializedName("subsFound") var subsFound: Boolean = false,
    @SerializedName("usersAlsoBoughtCount") var usersAlsoBoughtCount: Int = 0,
    @SerializedName("replacedSavingPercentage") var replacedSavingPercentage: Double? = 0.0,
    @SerializedName("manufacturerAddr") var manufacturerAddr:String?="",
    @SerializedName("recommendedQty") var recommendedQty:Int? = 1,
    @SerializedName("switchBackAvailability") var switchBackAvailability: Boolean = false,
    @SerializedName("switchBackAvailabilityStatus") var switchBackAvailabilityStatus: String? = "Out Of Stock",
    @SerializedName("chronic") var isChronic: Boolean = false,
    @SerializedName("otc") var isOtc: Boolean = false,
    var orgSubsSkuName:String?="",
    var orgProductCode:String?="",
    var customerAlsoBoughtMsg:String?="",
    var priceInfoDto: List<PriceInfo>? = emptyList(),
    var showRemove:Boolean?=false,
    var showRemoved:Boolean?=false,
    var availabilityStatusWarning:FWPCWarningConstants?=FWPCWarningConstants.WARNING_SAVIOUR,
    var motherBrand:String?="",
) {
    fun toSdkObject(): com.intellihealth.salt.models.ProductInfoModel.Product {
        return com.intellihealth.salt.models.ProductInfoModel.Product(
            productCode = productCode,
            skuName = skuName ?: "",
            availabilityStatus = availabilityStatus,
            availabilityMessage = availabilityMessage,
            isAvailable = isAvailable,
            suppliedByTm = suppliedByTm,
            manufacturerName = manufacturerName ?: "",
            maxCappedQty = maxCappedQty,
            mrp = removeExtraZeros(mrp),
            sellingPrice = removeExtraZeros(sellingPrice),
            discount = discount,
            packSize = packSize ?: "",
            unit = unit ?: "",
            packForm = packForm ?: "",
            pricePerUnitLabel = pricePerUnitLabel ?: "",
            productImageUrl = productImageUrl ?: "",
            qty = qty,
            composition = composition ?: "",
            subsSavingsPercentage = subsSavingPercentage,
            cxAcceptedSubs = cxAcceptedSubs,
            switchBackSkuName = switchBackSkuName ?: null,
            switchBackProductCode = switchBackProductCode ?: null,
            switchBackImageUrl = switchBackImageUrl ?: "",
            switchBackAvailability = switchBackAvailability,
            preSubsSkuName = preSubsSkuName ?: "",
            preSubsProductCode = preSubsProductCode ?: "",
            prevSubsAvailabilityMessage = prevSubsAvailabilityMessage ?: "",
            usersAlsoBoughtMessage = customerAlsoBoughtMsg,
            subsFound = subsFound,
            priceInfo = priceInfoDto,
            showRemove = showRemove,//availabilityStatus.isNullOrEmpty() && ,
            showRemoved = showRemoved,//!availabilityStatus.isNullOrEmpty() && (qty ?: 0) > 0))
            availabilityStatusWarning = availabilityStatusWarning,
            manufacturerAddress = manufacturerAddr,
            // availabilityStatusWarning = if (coldStorage && !SharedPrefManager.getInstance().coldChainDeliverable) FWPCWarningConstants.WARNING_MODERATE else  FWPCWarningConstants.WARNING_SAVIOUR
            prevOrderId = prevOrderId,
            prevOrgProductId = prevOrgProductId,
            replacedSavingPercentage=replacedSavingPercentage,
            motherBrand = motherBrand,
            recommendedQty=recommendedQty,
            isOtc = isOtc,
            isChronic = isChronic,
            drugType = drugType
                        // availabilityStatusWarning = if (coldStorage && !SharedPrefManager.getInstance().coldChainDeliverable) FWPCWarningConstants.WARNING_MODERATE else  FWPCWarningConstants.WARNING_SAVIOUR
        )
    }


    fun productAsCartItem(isFromAPI: Boolean, addedQty: Int): CartMedicine {
        return CartMedicine(
            null,
            productCode,
            skuName,
            manufacturerName,
            discount,
            mrp.toString().toDouble(), addedQty,
            composition,
            subsSavingPercentage.toString(),
            /*suggestion?.sellingPrice ?: */0.0,//todo ask if suggestion for otc exist
            /*suggestion != null*/false,//todo ask if suggestion for otc exist
            isFromAPI,
            /*suggestion?.productCode ?: */"",//todo ask if suggestion for otc exist
            /*suggestion?.mrp ?: */0.0,//todo ask if suggestion for otc exist
            /*suggestion?.skuName ?: */"",//todo ask if suggestion for otc exist
            /*suggestion?.manufacturerName ?: */"",//todo ask if suggestion for otc exist
            false,
            drugType,
            packSize?.toDoubleOrNull() ?: 0.0,
            packSize?.toDoubleOrNull() ?: 0.0,
            false,
            maxCappedQty,
            1,
            "IN",
            "IN",
            unit,
            /*suggestion?.unit ?: */"Unit",//todo ask if suggestion for otc exist
            productImageUrl,
            manufacturerAddr,
            isAvailable,
            productDetailsId ?: 0,
            prevOrderId ?: 0,
            prevOrgProductId ?: 0,
//            product.sellingPrice
        )
    }


}