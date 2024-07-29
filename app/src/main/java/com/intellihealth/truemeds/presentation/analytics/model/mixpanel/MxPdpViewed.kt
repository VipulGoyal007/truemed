package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.gson.annotations.SerializedName
import com.intellihealth.truemeds.data.model.clevertap.CtPdpViewed
import com.intellihealth.truemeds.mvvm.data.appsflyer.AFPdpViewed


data class MxPdpViewed(
    @SerializedName("brand")
    var brand: String? = null,
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("clicked_suggestion_type")
    var clickedSuggestionType: String? = null,
    @SerializedName("discount_variant_id")
    var discountVariantId: Long? = null,
    @SerializedName("is_bottom_sheet")
    var isBottomSheet: Boolean = false,
    @SerializedName("is_not_in_stock")
    var isNotInStock: Boolean = false,
    @SerializedName("org_product_discount_percentage")
    var orgProductDiscountPercentage: String? = null,
    @SerializedName("org_product_id")
    var orgProductId: String? = null,
    @SerializedName("org_product_mrp")
    var orgProductMrp: Double? = null,
    @SerializedName("org_product_name")
    var orgProductName: String? = null,
    @SerializedName("org_product_picture_exists")
    var orgProductPictureExists: Boolean = false,
    @SerializedName("org_product_sale_price")
    var orgProductSalePrice: Double? = null,
    @SerializedName("page_section")
    var pageSection: String? = null,
    @SerializedName("page_type")
    var pageType: String? = null,
    @SerializedName("product_discount_percentage")
    var productDiscountPercentage: String? = null,
    @SerializedName("product_id")
    var productId: String? = null,
    @SerializedName("product_mrp")
    var productMrp: Double? = null,
    @SerializedName("product_name")
    var productName: String? = null,
    @SerializedName("subs_product_id")
    var subsProductId: String? = null,
    @SerializedName("subs_product_name")
    var subsProductName: String? = null,
    @SerializedName("product_sale_price")
    var productSalePrice: Double? = null,
    @SerializedName("_qc")
    var qc: String? = null,
    @SerializedName("result_position")
    var resultPosition: Int? = null,
    @SerializedName("_rt")
    var rt: String? = null,
    @SerializedName("section_index")
    var sectionIndex: Int? = null,
    @SerializedName("section_row")
    var sectionRow: Int? = null,
    @SerializedName("subs_product_discount_percentage")
    var subsProductDiscountPercentage: String? = null,
    @SerializedName("subs_product_mrp")
    var subsProductMrp: Double? = null,
    @SerializedName("subs_product_picture_exists")
    var subsProductPictureExists: Boolean = false,
    @SerializedName("subs_product_sale_price")
    var subsProductSalePrice: Double? = null,
    @SerializedName("subs_savings")
    var subsSavings: String? = null,
    @SerializedName("substitute_available")
    var substituteAvailable: Boolean = false,
    @SerializedName("suggestion_term_clicked")
    var suggestionTermClicked: String? = null,
    @SerializedName("suggestion_term_clicked_position")
    var suggestionTermClickedPosition: Int? = null,
    @SerializedName("term_searched")
    var termSearched: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null,
    @SerializedName("section_heading")
    var section_heading: String? = null,
    @Transient
    @SerializedName("is_otc")
    val is_otc: Boolean? = false,
    @SerializedName("is_chronic")
    val chronic: Boolean? = false,
    @SerializedName("sub_category_name") var subCategoryName: String? = null,
    @SerializedName("category_name") var categoryName: String? = null,
    @SerializedName("super_category_name") var superCategoryName: String? = null
//    var isSubs : Boolean = false
) {
    fun toCleverTap(): CtPdpViewed {
        return CtPdpViewed(
            orgProductName = orgProductName,
            orgProductMrp = orgProductMrp,
            orgProductSalePrice = orgProductSalePrice,
            orgProductDiscountPercentage = orgProductDiscountPercentage,
            productId = productId,
            productName = productName,
            subsProductId = subsProductId,
            subsProductName = subsProductName,
            subsProductMrp = subsProductMrp,
            subsProductSalePrice = subsProductSalePrice,
            subsProductDiscountPercentage = subsProductDiscountPercentage,
            subsSavings = subsSavings,
            substituteAvailable = substituteAvailable,
            productMrp = productMrp
        )
    }

    /* fun toAppsFlyer() : Map<String, Any>{
         return AppsFlyerEvent.convertJsonToHashmap(Gson().toJson(AFPdpViewed(product_name = productName, product_mrp = orgProductMrp, is_chronic = false, is_substitutable = substituteAvailable, product_sale_price = orgProductSalePrice, is_otc = false, is_not_in_stock = isNotInStock)))
     }*/

    fun toAppsFlyer(): AFPdpViewed {
//        return AppsFlyerEvent.convertJsonToHashmap(Gson().toJson(AFPdpViewed(product_name = productName, product_mrp = orgProductMrp, is_chronic = false, is_substitutable = substituteAvailable, product_sale_price = orgProductSalePrice, is_otc = false, is_not_in_stock = isNotInStock)))
        return AFPdpViewed(
            product_name = productName,
            product_mrp = productMrp,
            is_chronic = chronic,
            is_substitutable = substituteAvailable,
            product_sale_price = productSalePrice,
            is_otc = is_otc,
            is_not_in_stock = isNotInStock
        )
    }
}