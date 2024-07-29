package com.intellihealth.truemeds.data.model.orderflow

data class CouponCodeDataModel(
    val coupon_code: String? = null,
    val coupon_code_title: String? = null,
    val coupon_code_description: String? = null,
    private val couponCodeBulletDescription : String? = null,
    private var coupon_code_id: String? = null,
    private val coupon_code_validity: Long? = 0L,
    private val coupon_code_visible: Boolean? = false,
    var coupon_code_applied: Boolean? = null,
    private val discountValue: Int = 0,
    private var applicable_payment_mode: String? = null,
    private val min_cart_value : Int = 0,
    private val offer_type_id : Int = 0,
    private val image: String? = null,
    private val discountTypeName: String? = null,
    private val discountTypeValue: String? = null,
    private val max_discount : Int = 0,
    private val offerId: String? = null,
    private val tncDescription: String? = null,
    private var cashbackValue: Double = 0.0,
    var cashBackActiveAfterDeliveryDays: Int = 0,
    var cashbackValidAfterActivation: Int = 0,
    private val couponCodeRequired: Boolean = false,
    private val offersVisibleOnOrderSummary: Boolean = false,
    private val colorCode: String = "#40464D",
    private val infoPanel: String? = null,
    private val offerOrderSummaryTitle: String? = null,
    val paymentMethod: String? = null,
    val paymentMethodId: Long? = 0,
    val paymentMethodIconUrl: String? = null
   /* private val isSelected: Boolean = false,

    private val apiCall: Boolean = false,*/


)