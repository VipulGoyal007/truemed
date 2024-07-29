package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import com.intellihealth.truemeds.data.model.clevertap.CtItemAdded
import com.intellihealth.truemeds.mvvm.data.appsflyer.AFItemAdded
import com.intellihealth.truemeds.presentation.analytics.AppsFlyerEvent


data class MxItemAdded(
    @SerializedName("brand")
    var brand: String? = null,
    @SerializedName("is_otc")
    var isOtc: Boolean = false,
    @SerializedName("is_substitute")
    var isSubstitute: Boolean = false,
    @SerializedName("org_product_discount_percentage")
    var orgProductDiscountPercentage: Double? = null,
    @SerializedName("subs_product_id")
    var subsProductId: String? = null,
    @SerializedName("subs_product_name")
    var subsProductName: String? = null,
    @SerializedName("org_product_id")
    var orgProductId: String? = null,
    @SerializedName("org_product_mrp")
    var orgProductMrp: Double? = null,
    @SerializedName("org_product_name")
    var orgProductName: String? = null,
    @SerializedName("org_product_sale_price")
    var orgProductSalePrice: Double? = null,
    @SerializedName("product_discount_percentage")
    var productDiscountPercentage: Double? = null,
    @SerializedName("product_id")
    var productId: String? = null,
    @SerializedName("product_mrp")
    var productMrp: Double? = null,
    @SerializedName("product_name")
    var productName: String? = null,
    @SerializedName("product_picture_exists")
    var productPictureExists: Boolean = false,
    @SerializedName("product_sale_price")
    var productSalePrice: Double? = null,
    @SerializedName("_qc")
    var qc: String? = null,
    @SerializedName("_rt")
    var rt: String? = null,
    @SerializedName("subs_id")
    var subsId: String? = null,
    @SerializedName("subs_product_discount_percentage")
    var subsProductDiscountPercentage: Double? = null,
    @SerializedName("subs_product_mrp")
    var subsProductMrp: Double? = null,
    @SerializedName("subs_product_sale_price")
    var subsProductSalePrice: Double? = null,
    @SerializedName("subs_savings")
    var subsSavings: Double? = null,
    @SerializedName("substitute_available")
    var substituteAvailable: Boolean = false,
    @SerializedName("is_chronic")
    var isChronic: Boolean = false,
    @SerializedName("pack_size_difference")
    var packSizeDifference: String? = null,
//    @SerializedName("wh_id")
//    var whId: String? = null
): MxCommonWithMultipleValues(){
    fun toCleverTap():CtItemAdded {
       return CtItemAdded(productId, productName, if (isSubstitute) false else substituteAvailable,
           isSubstitute,
           orgProductDiscountPercentage,
           if (isSubstitute) orgProductSalePrice else productSalePrice,
           if (isSubstitute) orgProductMrp else productMrp,
           subsSavings,
           subsProductName,
           subsProductId,
           subsProductSalePrice,
           subsProductMrp,
           packSizeDifference
       )
    }

    fun toAppsFlyer(isSubstitutable: Boolean) : Map<String, Any>{
        return AppsFlyerEvent.convertJsonToHashmap(Gson().toJson(AFItemAdded(product_name = productName,
            product_mrp = productMrp,
            is_chronic = isChronic,
            is_substitutable = isSubstitutable,
            product_sale_price = productSalePrice,
            is_otc = isOtc,
            clicked_on_page = clickedOnPage)))
    }
}