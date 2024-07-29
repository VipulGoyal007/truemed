package com.intellihealth.truemeds.data.model.orderflow

import com.google.gson.annotations.SerializedName
import com.intellihealth.salt.constants.FullWidthProductCardConstants
import com.intellihealth.salt.models.OrderedItemCardModel
import com.intellihealth.truemeds.presentation.model.ProductInfoModel

data class GetOrderMedicineDetailsResponse(

    @SerializedName("elasticProductDetails")
    var elasticProductDetails: List<ProductInfoModel>? = listOf(),
    @SerializedName("logoUrlList")
    var logoUrlList: List<String>? = listOf()
) {
    var index: Int = 1
    fun toSDKObject(): List<OrderedItemCardModel> {
        val orderedItemList = arrayListOf<OrderedItemCardModel>()
        elasticProductDetails?.map {
            val item = it.toSdkObject()
            var existSwitchBack=false

            if (item.product.subsFound) {
                item.cardType = FullWidthProductCardConstants.SEARCH
            }
            var subDiscount: String? = null
            subDiscount = if (item.product.subsFound) {
                item.suggestion?.discount.toString() + "% Cheaper"
            } else {
                null
            }

            var substitutedProduct: String? = null
            if (!it.product.cxAcceptedSubs || it.product.switchBackProductCode.isNullOrEmpty()) {
                substitutedProduct = null
            }

            if (!it.product.cxAcceptedSubs && !it.product.switchBackProductCode.isNullOrEmpty()) {
                existSwitchBack = true
                substitutedProduct = it.product.switchBackSkuName
            }else{
                existSwitchBack = false
            }

            var labelText: String? = null
            if (it.product.replacedSavingPercentage ?: 0.0 > 0.0) {
                labelText = " Save " + it.product.replacedSavingPercentage
            } else {
                null
            }

            orderedItemList.add(
                OrderedItemCardModel(
                    substitude = subDiscount,
                    label = if (existSwitchBack) labelText else null,
                    substitutedProduct = substitutedProduct,
                    productDetailModel = item,
                    isLastRecord = isLastItemTrue(elasticProductDetails)
                )
            )
        }
        return orderedItemList
    }


    /**
     * This logic is for hide or show the bottom
     * */

    fun isLastItemTrue(responseData: List<ProductInfoModel>?): Boolean {

        return when {
            responseData?.size == 1 -> {
                true
            }

            else -> {
                if (index == responseData?.size) {
                    // Case: Last item in the list
//                        ind += 1
                    return true
                } else {
                    index += 1
                    return false
                }

            }
        }
    }
}
