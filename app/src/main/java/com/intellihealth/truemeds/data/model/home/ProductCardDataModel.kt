package com.intellihealth.truemeds.data.model.home

import com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse

data class ProductCardDataModel(
    var id:Int=7,
    var type :String= "",
   // var productCardModel: ProductCardSectionModel?=null
    var productCardModel: CrossSellingRecommendedProductResponse? = null,
    var productCardLimitedOfferModel: CrossSellingRecommendedProductResponse? = null,
    var productCardNewArrivalModel: CrossSellingRecommendedProductResponse? = null
)
