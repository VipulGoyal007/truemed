package com.intellihealth.truemeds.presentation.model

import com.intellihealth.salt.constants.FullWidthProductCardConstants


data class OtcCategoriesForProductsResponse(
    var message: String?,
    var responseData: ResponseData,
    var statusCode: Int,
    var statusValue: String?,
    var timeTakenInMs: Int
) {
    data class ResponseData(
        var brandNameList: List<String>,
        var collectionId: Int,
        var id: Int,
        var productElastic: List<ProductInfoModel>,
        var topDealsElastic: List<ProductInfoModel>,
        var totalCount: Int
    ) {
        data class ProductElastic(
            var product: Product,
            var suggestion: Any
        ) {
            data class Product(
                var availabilityStatus: String?,
                var available: Boolean,
                var composition: String?,
                var cxAcceptedSubs: Boolean,
                var discount: Double,
                var manufacturerName: String?,
                var maxCappedQty: Int,
                var mrp: Double,
                var packForm: String?,
                var packSize: String?,
                var preSubsProductCode: String?,
                var preSubsSkuName: String?,
                var pricePerUnitLabel: String?,
                var productCode: String?,
                var productImageUrl: String?,
                var qty: Int,
                var sellingPrice: Double,
                var skuName: String?,
                var subsAddedAsOrg: Boolean,
                var subsFound: Boolean,
                var subsSavingPercentage: String,
                var suppliedByTm: Boolean,
                var switchBackImageUrl: String?,
                var switchBackProductCode: String?,
                var switchBackSkuName: String?,
                var unit: String?,
                var usersAlsoBoughtCount: Int,
                var manufacturerAddr: String?,
                var otc: Boolean?=false,
            )
        }

        fun toSDKObject(): List<ProductInfoModel> {
            val productList = arrayListOf<ProductInfoModel>()
            productElastic?.mapNotNull { product ->
                with(product.product) {
                    productList.add(
                        ProductInfoModel(
                            cardType = FullWidthProductCardConstants.SEARCH,
                            isReplaced = false,
                            isOrgAddedToCart = false,
                            isAutoReplaced = false,
                            isSubsAddedToCart = false,

                            product = Product(
                                productCode = productCode ?: "",
                                skuName = skuName ?: "",
                                manufacturerName = manufacturerName ?: "",
                                manufacturerAddr = manufacturerAddr ?: "",
                                discount = discount ?: 0.0,
                                mrp = mrp ?: 0.0,
                                sellingPrice = sellingPrice ?: 0.0,
                                pricePerUnitLabel = pricePerUnitLabel ?: "",
                                packSize = packSize ?: "",
                                maxCappedQty = maxCappedQty ?: 0,
                                productImageUrl = productImageUrl,
                                availabilityStatus = availabilityStatus ?: "",
                                qty = qty ?: 0,
                                composition = composition ?: "",
                                isAvailable = isAvailable,//available
                                suppliedByTm = suppliedByTm ?: false,
                                unit = unit ?: "",
                                packForm = packForm ?: "",
                                cxAcceptedSubs = false,
                                switchBackSkuName = switchBackSkuName ?: "",
                                switchBackProductCode = switchBackProductCode ?: "",
                                switchBackImageUrl = switchBackImageUrl ?: "",
                                preSubsSkuName = preSubsSkuName ?: "",
                                preSubsProductCode = preSubsProductCode ?: "",
                                prevOrderId = 0L,
                                prevOrgProductId = 0L,
                                productDetailsId = 0,
                                subsSavingPercentage = subsSavingPercentage ?: "",
                                isOtc = isOtc,//otc?:false
                                motherBrand = motherBrand
                            ),
                            suggestion = null,
                        )
                    )
                }
            }
            return productList
        }

        fun toTopDealObject(): List<ProductInfoModel> {
            val productList = arrayListOf<ProductInfoModel>()
            topDealsElastic?.mapNotNull { product ->
                with(product.product) {
                    productList.add(
                        ProductInfoModel(
                            cardType = FullWidthProductCardConstants.SEARCH,
                            isReplaced = false,
                            isOrgAddedToCart = false,
                            isAutoReplaced = false,
                            isSubsAddedToCart = false,

                            product = Product(
                                productCode = productCode ?: "",
                                skuName = skuName ?: "",
                                manufacturerAddr = manufacturerAddr ?: "",
                                manufacturerName = manufacturerName ?: "",
                                discount = discount ?: 0.0,
                                mrp = mrp ?: 0.0,
                                sellingPrice = sellingPrice ?: 0.0,
                                pricePerUnitLabel = pricePerUnitLabel ?: "",
                                packSize = packSize ?: "",
                                maxCappedQty = maxCappedQty ?: 0,
                                productImageUrl = productImageUrl,
                                availabilityStatus = availabilityStatus ?: "",
                                qty = qty ?: 0,
                                composition = composition ?: "",
                                isAvailable = isAvailable,
                                suppliedByTm = suppliedByTm ?: false,
                                unit = unit ?: "",
                                packForm = packForm ?: "",
                                cxAcceptedSubs = false,
                                switchBackSkuName = switchBackSkuName ?: "",
                                switchBackProductCode = switchBackProductCode ?: "",
                                switchBackImageUrl = switchBackImageUrl ?: "",
                                preSubsSkuName = preSubsSkuName ?: "",
                                preSubsProductCode = preSubsProductCode ?: "",
                                prevOrderId = 0L,
                                prevOrgProductId = 0L,
                                productDetailsId = 0,
                                subsSavingPercentage = subsSavingPercentage ?: "",
                                isOtc = isOtc,//otc?:false
                                isChronic = isChronic,
                                motherBrand = motherBrand
                            ),
                            suggestion = null,
                        )
                    )
                }
            }
            return productList
        }
    }
}