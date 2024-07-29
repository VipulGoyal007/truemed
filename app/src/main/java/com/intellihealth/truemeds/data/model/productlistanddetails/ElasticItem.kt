package com.intellihealth.truemeds.data.model.productlistanddetails
import com.google.gson.annotations.SerializedName
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine

data class ElasticItem(
    val branded_tag: Any?,
    val category1: String?,
    val category1_score: Int?,
    val category2: String?,
    val category2_score: Int?,
    val category3: String?,
    val category3_score: Int?,
    val company_nm_score: Int?,
    val composition_search: String?,
    val created_on: String?,
    val disease1: Any?,
    val disease1_score: Int?,
    val disease2: Any?,
    val disease2_score: Int?,
    val disease3: Any?,
    val disease3_score: Int?,
    val dispatched_order_count: Int?,
    val doctor_substituted_count: Int?,
    val experiment_id: Int?,
    val generic_branded_for_procurement: Any?,
    val id: Int?,
    val is_chronic: Boolean?,
    val is_org_product_info_present: Int?,
    val is_otc: Boolean?,
    val is_special_product: Boolean?,
    val is_subs_product_info_present: Int?,
    val max_capped_qty: Int?,
    val max_capped_weight: Int?,
    val med_type: String?,
    val modified_on: String?,
    val molecule_code_score: Int?,
    val mother_brand_score: Int?,
    val org_cold_storage: Boolean?,
    val original_available: Boolean?,
    val original_base_discount: Double?,
    val original_company_addr: String?,
    val original_company_nm: String?,
    val original_composition: String?,
    val original_country_nm: String?,
    val original_drug_type: String?,
    val original_generic_branded: String?,
    val original_is_searchable: Boolean?,
    val original_mother_brand: String?,
    val original_mrp: Double?,
    val original_pack: String?,
    
    val original_product_code: String?,
    
    val original_product_url_suffix: String?,
    
    val original_pts: Double?,
    
    val original_rx_required: Boolean?,
    
    val original_sku_name: String?,
    
    val original_super_group: String?,
    
    val original_supplied_bytm: Boolean?,
    
    val original_unit: String?,
    
    val otc_disease: String?,
    
    val otc_disease_score: Int?,
    
    val otc_sub_category: Any?,
    
    val patient_taken_count: Int?,
    
    val prod_searched_count: Int?,
    
    val product_image_urls: String?,
    
    val salt_url_suffix: Any?,
    
    val savings_percentage: String?,
    
    val savings_value: String?,
    
    val sub_recommended_qty: Int?,
    
    val subs_base_discount: Double?,
    
    val subs_company_addr: String?,
    
    val subs_company_nm: String?,
    
    val subs_country_nm: String?,
    
    val subs_found: Boolean?,
    
    val subs_generic_branded: String?,
    
    val subs_margin: Double?,
    
    val subs_mother_brand: String?,
    
    val subs_mrp: Double?,
    
    val subs_pack: String?,
    
    val subs_product_code: String?,
    
    val subs_pts: Double?,
    
    val subs_rx_required: Boolean?,
    
    val subs_selling_price: Double?,
    
    val subs_sku_name: String?,
    
    val subs_taken_count: Int?,
    
    val subs_unit: String?,
    
    val substitute_order_count: Int?,
    
    val super_category: String?,
    
    val super_category_score: Int?,
    @SerializedName("@timestamp")
    val timestamp: String?,
    
    val top_product_rank: Any?,
    
    val ts: Any?,
    
    val type: String?,
    
    val type_score: Int?,
    
    val variant_id: Int?,
    @SerializedName("@version")
    val version: String?
)

fun ElasticItem.getSellingPrice() : Double {
    var sellingPrice: Double = 0.0
    original_mrp?.let { mrp ->
        original_base_discount?.let { baseDiscount ->
            sellingPrice = mrp - (mrp.times((baseDiscount.times(0.01))))
        }
    }
    return sellingPrice
}
fun ElasticItem.createCartItem(isFromAPI: Boolean, addedQty: Int): CartMedicine? {
    return CartMedicine(
            null,
            original_product_code ?: "",
            original_sku_name,
            original_company_nm,
            original_base_discount ?: 0.0,
            original_mrp.toString().toDouble(), addedQty,
            original_composition,
            savings_percentage,
            subs_selling_price.toString().toDouble(),
            subs_found ?: false,
            isFromAPI,
            subs_product_code,
            subs_mrp.toString().toDouble(),
            subs_sku_name ?: "",
            subs_company_nm ?: "",
            org_cold_storage ?: false,
            original_drug_type,
            original_pack?.toDouble() ?: 0.0,
            if (subs_pack.isNullOrEmpty()) 0.0 else subs_pack.toDouble(),
            original_rx_required ?: false,
            max_capped_qty ?: 1,
            sub_recommended_qty ?: 1,
            original_country_nm,
            subs_country_nm,
            subs_unit,
            original_unit,
            product_image_urls,
            original_company_addr,
            original_available ?: true, 0, 0, 0
        )
    
}
