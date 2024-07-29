package com.intellihealth.truemeds.data.model.ordersummary

import com.intellihealth.truemeds.presentation.model.ProductInfoModel

data class OTCResponse(
    var message: String,
    var responseData: ResponseData?,
    var statusCode: Int,
    var statusValue: String,
    var timeTakenInMs: Int
) {
    data class ResponseData(
        var reOrderCrossSellingProduct: List<ProductInfoModel>,
        var productCodeList: List<String>?
    ) {
//        data class Products(
//            var product: Product,
//            var suggestion: Product
//        ) {
//            data class Product(
//                var availabilityStatus: String,
//                var available: Boolean,
//                var composition: String,
//                var cxAcceptedSubs: Boolean,
//                var discount: Double,
//                var manufacturerName: String,
//                var maxCappedQty: Int,
//                var mrp: Double,
//                var packForm: String,
//                var packSize: String,
//                var preSubsProductCode: String,
//                var preSubsSkuName: String,
//                var pricePerUnitLabel: String,
//                var productCode: String,
//                var productImageUrl: String,
//                var qty: Int,
//                var sellingPrice: Double,
//                var skuName: String,
//                var subsAddedAsOrg: Boolean,
//                var subsFound: Boolean,
//                var subsSavingPercentage: String,
//                var suppliedByTm: Boolean,
//                var switchBackImageUrl: String,
//                var switchBackProductCode: String,
//                var switchBackSkuName: String,
//                var unit: String,
//                var usersAlsoBoughtCount: Int
//            )
//        }
    }
}