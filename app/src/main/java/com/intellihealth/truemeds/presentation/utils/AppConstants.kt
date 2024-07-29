package com.intellihealth.truemeds.presentation.utils

import com.intellihealth.truemeds.domain.enums.LoginFromScreen
import okhttp3.ResponseBody
import org.json.JSONArray
import org.json.JSONObject
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

object NamedConstants {
    const val CONTENT_TYPE = "content_type"
    const val ACCESS_TOKEN = "access_token"
}

object ClassNameConstants {
    const val PAYMENT_OPTION_ACTIVITY = "payment_option"
    const val CART_ACTIVITY = "cart"
    const val ORDER_SUMMARY_ACTIVITY = "order_summary"
    const val ORDER_STATUS_ACTIVITY = "order_status"
}

object BundleConstants {
    const val BUNDLE_KEY_DESTINATION_PAGE = "destination_page"
    const val BUNDLE_KEY_ORDER_ID = "order_id"
    const val BUNDLE_KEY_CLICKED_ON_PAGE = "clickedOnPage"
    const val BUNDLE_PATIENT_ID = "patient_id"
    const val BUNDLE_YOUR_MEDICINES_PATIENT_LIST = "your_medicines_patient_list"
    const val BUNDLE_YOUR_MEDICINES_SELECTED_POS = "your_medicines_selected_pos"
    const val BUNDLE_KEY_ORDER_PAGE_SECTION = "pageStatus"
    const val BUNDLE_KEY_ORDER_IS_DELIVERED_OR_CANCELLED = "orderStatusPlace"
    const val BUNDLE_KEY_PAGE_SECTION = "page_section"
    const val BUNDLE_KEY_SCREEN_NAME = "screen_name"
    const val FTC_DYNAMIC_DISCOUNT = "FTC_DynamicDiscount"
    const val NFTC_DYNAMIC_DISCOUNT = "NFTC_DynamicDiscount"
    const val TRADITIONAL_BASE_DISCOUNT = "Traditional_BaseDiscount"
    const val ORDER_SUMMARY = "OrderSummary"
    const val ORDER_STATUS = "OrderStatus"
    const val REORDER = "ReOrder"
    const val HOMEPAGE = "HomePage"
    const val BUNDLE_KEY_IS_CHRONIC_ADDED = "isChronicAdded"
    const val BUNDLE_KEY_IS_OTC_ADDED = "isOtcAdded"
    const val BUNDLE_KEY_IS_GENERIC_ADDED = "isGenericAdded"
    const val BUNDLE_KEY_ADDED_CART = "added_cart"
    const val BUNDLE_KEY_ADDED_CART_RESPONSE = "added_cart_response"
    const val BUNDLE_KEY_ADDED_RX = "added_rx"
    const val DISPLAY_PAYMENT_UNSUCCESSFUL = "display_payment_unsuccessful"
    const val BUNDLE_KEY_INCLUDE_COD = "include_cod"
    const val BUNDLE_KEY_PATIENT_ID = "patientId"
    const val BUNDLE_KEY_PATIENT_AGE = "patientAge"
    const val BUNDLE_KEY_PATIENT_TYPE = "patientType"
    const val BUNDLE_KEY_PATIENT_GENDER = "patientGender"
    const val BUNDLE_KEY_SHIPPING_CITY = "shippingCity"
    const val BUNDLE_KEY_SHIPPING_STATE = "shippingState"
    const val BUNDLE_KEY_SHIPPING_PINCODE = "shippingPinCode"
    const val BUNDLE_KEY_ADDRESS_TYPE = "addressType"
    const val BUNDLE_KEY_SELLING_PRICE = "bundle_key_selling_price"
    const val BUNDLE_KEY_SUBS_ID = "subs_id"
    const val BUNDLE_KEY_ITEM_NAMES = "itemNames"
    const val BUNDLE_KEY_NO_OF_ITEMS = "noOfItems"
    const val BUNDLE_KEY_RX_REQUIRED = "rxRequired"
    const val BUNDLE_KEY_CURRENT_ORDER_STATUS = "currentOrderStatus"
    const val BUNDLE_KEY_CURRENT_ORDER_STATUS_ID = "currentOrderStatusId"
    const val BUNDLE_KEY_PRODUCT_IDS = "productIds"
    const val BUNDLE_KEY_TOTAL_OUT_OF_STOCK_COUNT = "totalOutOfStockCount"
    const val BUNDLE_KEY_ONLY_PRESCRIPTION_UPLOADED_COUNT = "only_prescription_uploaded_count"
    const val BUNDLE_KEY_TRACK_PURCHASE_EVENTS = "track_purchase_events"
    const val BUNDLE_KEY_LAST_SELECTED_PAYMENT_METHOD = "last_selected_payment_method"
    const val BUNDLE_KEY_LAST_SELECTED_PAYMENT_METHOD_ID = "last_selected_payment_method_id"
    const val BUNDLE_KEY_LAST_SELECTED_PAYMENT_METHOD_URL = "last_selected_payment_method_url"
    const val BUNDLE_KEY_ITEM_ADDED = "item_order_added"
    const val BUNDLE_KEY_CURRENT_PAYMENT_METHOD = "payment_method"
    const val BUNDLE_KEY_PAYMENT_RESTRICTED_TYPE = "payment_restricted_type"
    const val BUNDLE_KEY_BILL_DETAILS = "bill_details"
    const val BUNDLE_KEY_PAYABLE_AMOUNT_TEXT = "payable_amount_text"
    const val BUNDLE_KEY_RESTRICT_COD = "restrictCod"
    const val BUNDLE_KEY_ADD_MORE_FOR_COD = "addMoreForCod"
    const val BUNDLE_KEY_IS_PAYMENT_SPECIFIC_COUPON = "isPaymentSpecificCoupon"
    const val BUNDLE_KEY_ONLY_PRESCRIPTION = "only_prescription"
    const val BUNDLE_KEY_IS_REORDER = "is_reorder"
    const val BUNDLE_KEY_COUPON_APPLIED_NAME = "couponAppliedName"
    const val BUNDLE_KEY_BILL_DETAIL = "bill_details"
    const val PAYMENT_DEFAULT_OPTION = "UPI"
    const val BUNDLE_TM_BILL_DETAILS_MODEL = "tm_bill_details_model"
    const val BUNDLE_KEY_ADDRESS_COUNT = "address_count"
    const val BUNDLE_KEY_PATIENT_COUNT = "patient_count"
    const val BUNDLE_KEY_FRESH_USER = "isFreshUser"
    const val BUNDLE_KEY_REDIRECT_TO_CART = "redirect_to_cart"
    const val BUNDLE_KEY_NEWLY_ADDED_ADDRESS_ID = "new_added_address"
    const val BUNDLE_KEY_NEWLY_ADDED_PATIENT_ID = "new_patient_address"
    const val BUNDLE_FROM_DELIVERY_DELAY = "from_delivery_delay"
    const val REQUEST_CODE_PAYMENT_CHANGE = 124
    var MX_FTC_COUNTDOWN_TIME_IN_SEC = 0L
    const val FTC_COUPON_FIRST25 = "FIRST25"
    const val FTC_COUPON_FIRST23 = "FIRST23"
    const val PAY_USING = "pay_using"
    const val SELECT_PAYMENT_MODE = "select_payment_mode"
    var FTC_COUPON_CODE = ""
    var FTC_COUPON_CODE_1 = ""
    var IS_REWARD_TRANSACTION = "IS_REWARD_TRANSACTION"
    var COMPOSITION_DETAILS = "COMPOSITION_DETAILS"
    var PRODUCT_ORD_SUBS_DETAIL = "PRODUCT_ORD_SUBS_DETAIL"
    var PRODUCT_SUBS_DETAIL = "PRODUCT_SUBS_DETAIL"
    var PRODUCT_SUBS_TITLE = "PRODUCT_SUBS_TITLE"
    var BUNDLE_KEY_IS_EDIT_PATIENT = "IS_EDIT_PATIENT"
    var BUNDLE_KEY_PATIENT_DETAILS = "PATIENT_DETAILS"
    var IS_SUBS = "IS_SUBS"
    var IS_FROM_ORDER_STATUS = "IS_FROM_ORDER_STATUS"
    var IS_FROM_OTC = "IS_FROM_OTC"
    var ORG_PRODUCT_OF_SUBS = "ORG_PRODUCT_OF_SUBS"
    var ORG_PRODUCT_FOR_THIS_PAGE = "ORG_PRODUCT_FOR_THIS_PAGE"
    var EVENT_ORG_PRODUCT_FOR_THIS_PAGE = "EVENT_ORG_PRODUCT_FOR_THIS_PAGE"
    var SWITCH_BACK_SKUNAME_IS_SUBS = "SWITCH_BACK_SKUNAME_IS_SUBS"
    var SEARCH_TEXT = "SEARCH_TEXT"
    var SEARCH_TYPE = "SEARCH_TYPE"
    var SEARCH_IS_MULTI_SEARCH = "SEARCH_IS_MULTI_BRAND"
    var PRODUCT_CODE = "PRODUCT_CODE"
    var IS_PRODUCT_DETAIL_BS = "IS_PRODUCT_DETAIL_BS"
    var IS_HIDE_TOOLBAR = "IS_HIDE_TOOLBAR"
    var IS_HIDE_CART = "IS_HIDE_CART"
    var FAQ_LIST = "FAQ_LIST"
    const val isFromBottomsheet = "isFromBottomsheet"
    var FAQ_LIST_HEADER = "FAQ_LIST_HEADER"
    var FAQ_LIST_CHILD = "FAQ_LIST_CHILD"
    const val USER_PROFILE_DATA = "USER_PROFILE_DATA"
    const val isClearTaskRequired = "isClearTaskRequired"
    const val CATEGORY_ID = "categoryID"
    const val CATEGORY_TYPE = "categoryType"
    var IS_FROM_CROSS_SELLING = "IS_FROM_CROSS_SELLING"
    var ORDER_ID = "order_status_order_id"
    var CURRENT_CART_VALUE = "currentCartValue"
    var PRESCRIPTION_COUNT = "prescriptionCount"
    var RELOAD_BILL_DETAILS = "reload_bill_details"
    var HAS_RX_ORDER = "has_rx_order"
    var DISCARD_API_CALLED = "discardApiCalled"
    var INITIATED_LOGIN_FROM_SCREEN = LoginFromScreen.HOME

    const val CATEGORY_LIST = "categoryList"
    const val POSITION = "position"
    const val TYPE = "type"
    const val COUPON_REMOVED = "Success"
    const val SUPER_CAT_ID = "superCategoryID"
    const val OTC_BANNERS = "otcBanners"
    const val TOTAL_SAVING_AMOUNT = "totalSavingAmount"
    const val CURRENT_ORDER_STATUS="current_order_status"
    const val PATIENT_EXPERIMENT = "patientExperiment"
    const val BUNDLE_KEY_SLUG = "slug"
    const val BUNDLE_KEY_DEEP_LINK_SEARCH_QUERY = "deep_link_search_query"
    const val IS_ORG_ADDED_TO_CART = "IS_ORG_ADDED_TO_CART"
    const val IS_FROM_ACCOUNT_FRAGMENT = "IS_FROM_ACCOUNT_FRAGMENT"
    const val IS_FROM_PRESCRIPTION = "IS_FROM_PRESCRIPTION"
    const val IS_FROM_CANCEL_ORDER = "IS_FROM_CANCEL_ORDER"
    const val IS_FROM_SEARCH = "IS_FROM_SEARCH"
    const val SUBS_SAVING_PERCENTAGE = "SUBS_SAVING_PERCENTAGE"
    const val IS_DIVIDE_MRP_CROSSSELLING_WITH_QTY = "IS_DIVIDE_MRP_CROSSSELLING_WITH_QTY"
    const val CANCEL_ORDER_EVENT_DATA = "CANCEL_ORDER_EVENT_DATA"
    const val CANCEL_REASON = "CANCEL_REASON"
    const val BUNDLE_KEY_ITEM_QC="item_qc"
    const val BUNDLE_KEY_ITEM_RT="item_rt"
    const val BUNDLE_KEY_TERM_SEARCHED="term_searched"
    const val BUNDLE_KEY_SUGGESTION_TERM_CLICKED_POSITION="suggestion_term_clicked_position"
    const val BUNDLE_KEY_SUGGESTION_TERM_CLICKED="suggestion_term_clicked"
    const val BUNDLE_KEY_ELASTIC_SEARCH_TYPE="elastic_search_type"
    const val BUNDLE_KEY_SECTION_HEADING = "section_heading"
    const val BUNDLE_KEY_SECTION_INDEX = "section_index"
    const val BUNDLE_KEY_SECTION_ROW = "section_row"
    const val BUNDLE_KEY_IS_FROM_SUMMARY = "isFromNewSummaryPage"
    const val BUNDLE_KEY_IS_MED_EDITED = "isEditMed"
    const val BUNDLE_KEY_ADDED_MEDICINE_IDS = "addedMedicineIds"
    const val BUNDLE_KEY_MED_QUERY = "med_query"
    const val BUNDLE_KEY_IS_RECENTLY_SEARCHED = "isFromRecentlySearched"
    const val BUNDLE_KEY_REORDER_BUTTON_CLICKED = "reorder_button_click"
    const val BUNDLE_KEY_CLICKED_SUGGESTION_TYPE = "clicked_suggestion_type"
    const val OS_PLACE_ORDER_FLOW = "os_place_order_flow"
    const val OS_SELECT_PAYMENT_MODE_FLOW = "os_select_payment_mode_flow"

    const val BUNDLE_KEY_EVENT_SUBS_FOUND_OS = "key_event_subs_found_os"
    const val OTC_SUPER_CATEGORY_NAME = "otc_super_category_name"
    const val OTC_CATEGORY_NAME = "otc_category_name"
    const val OTC_SUB_CATEGORY_NAME = "otc_sub_category_name"
    const val ACTION_TYPE = "actionType"
    const val DEEPLINK_OG_SUBS_BS = "og_subs_bs"
    const val IS_EDIT_PROFILE_CLICK = "is_edit_profile_click"

}

object VariantAssignments {
    const val DEFAULT_PAYMENT_MODE_SELECTION_VARIANT_B = "B"
    const val FTC_COUPON_URGENCY_VARIANT_A = "A"
    const val FTC_COUPON_URGENCY_VARIANT_B = "B"
    const val FTC_COUPON_URGENCY_VARIANT_C = "C"
    const val PSP_EXPERIMENT_VARIANT_A = "A"
    const val PSP_EXPERIMENT_VARIANT_B = "B"
    const val PSP_EXPERIMENT_VARIANT_C = "C"
    const val PAYMENT_DEFAULT_OPTION = "isFromRecentlySearched"
    const val IS_REWARD_TRANSACTION = "isRewardTransaction"
    const val PATIENT_EXPERIMENT_VARIANT_A = "A"
    const val PATIENT_EXPERIMENT_VARIANT_B = "B"
}

object BillDetailsConstants {
    const val BUNDLE_KEY_MRP = "TotalMRP"
    const val BUNDLE_KEY_DELIVERY_CHARGE = "TotalDeliveryCharge"
    const val BUNDLE_KEY_TOTAL_AMOUNT = "TotalAmount"
    const val BUNDLE_KEY_COUPON_DISCOUNT = "TotalCouponDiscount"
    const val BUNDLE_KEY_COUPON_APPLIED_NAME = "couponAppliedName"
    const val BUNDLE_KEY_DISCOUNT = "TotalDiscount"
    const val BUNDLE_KEY_DELIVERY_CHARGE_ON_AMOUNT = "bundle_key_delivery_charge_on_amount"
    const val BUNDLE_KEY_SELLER_PACKAGING_CHARGES = "SellerPackagingCharges"
    const val BUNDLE_KEY_TOTAL_SELLING_AMOUNT = "TotalSellingAmount"
    const val BUNDLE_KEY_TM_CREDIT = "TmCredit"
    const val BUNDLE_KEY_TM_REWARD = "TmReward"
    const val BUNDLE_KEY_TOTAL_PRICE_TO_PAY = "TotalPayableAmount"
}


object ApiParameterConstants {
    const val BUNDLE_KEY_ICON_TYPE = "payment"
    const val SUBS_OPT_REASONS = "SUBS_OPT_REASONS"
    const val CONST_LIST_TRENDING = "TRENDING_IN_CITY"
    const val CONST_LIST_YOUR_MEDICINE = "YOUR_MEDICINE"
    const val CONST_LIST_NEW_ARRIVALS = "NEW_ARRIVAL"
    const val CONST_LIST_LIMITED_TIME_OFFER = "LIMITED_OFFER"
    const val CUSTOMER_ALSO_BOUGHT = "CUSTOMER_ALSO_BOUGHT"
}

object RequestCodeConstants {
    const val APP_UPDATE_REQUEST_CODE = 1001
    const val PRESCRIPTION_UPLOAD_OK = 1002
}

object DateFormats {
    const val YYYY_MM_DD_HH_MM_SS = "yyyy/MM/dd HH:mm:ss"
}

object HomeSectionConstants {
    const val BANNER = "Banner"
    const val ALERT = "Alert"
    const val REORDER = "ReOrder"
    const val OTC_CATEGORY = "otcCategory"
    const val PRESCRIPTION = "Prescription"
    const val PATIENTANDMEDICINELIST = "patientAndMedicineList"
    const val SUBS = "Subs"
    const val DEFAULT_PRODUCT_CARD = "defaultProductCard"
    const val CALL_TO_ORDER = "Call and Order"
    const val STACKED_PRODUCT_CARD = "stackedProductCard"
    const val BLOG_SECTION_CARD = "blogSection"
    const val TESTIMONIAL_SECTION_CARD = "testimonialSection"
    const val FOOTER_SECTION = "footerSection"
    const val CURRENT_HOUR_9_AM = 9.00
    const val CURRENT_HOUR_1_PM = 13.00
    const val CURRENT_HOUR_11_PM = 23.00
    const val REQUEST_CHECK_SETTINGS = 103
    const val LOCATION_PERMISSIONS_REQUEST = 101
    const val VIEW_PRESCRIPTION = "View prescription"
}

object AppConstants {
    const val OTC_CATEGORY_PAGE_COUNT = 16
    const val PRODUCT_SECTION_PER_PAGE_COUNT = 5
    const val PRODUCT_SECTION_MAX_PAGE_COUNT = 20
    const val REQUEST_CHECK_SETTINGS = 103
    const val LOCATION_PERMISSIONS_REQUEST = 101
}

object ProductDiffUtilConstants{
    const val PRODUCT_CODE = "productCode"
    const val PRODUCT_SELLING_PRICE = "productSellingPrice"

}

object NotificationConstants {
    const val NOTIFICATION_KEY_TITLE = "title"
    const val NOTIFICATION_KEY_BODY = "body"
    const val NOTIFICATION_KEY_ORDER_ID = "orderId"
    const val NOTIFICATION_KEY_DESTINATION_PAGE = "destination_page"
}

fun jsonArray(jsonObject: JSONObject, jsonArrayName: String?): JSONArray? {
    var jsonArray: JSONArray? = null
    jsonArray = try {
        jsonObject.getJSONArray(jsonArrayName)
    } catch (e: Exception) {
        null
    }
    return jsonArray
}


fun getJsonResponseFromRawData(response: ResponseBody): JSONObject? {
    return try {
        JSONObject(getStringResponseFromRawData(response))
    } catch (ex: java.lang.Exception) {
        null
    }
}

fun getStringResponseFromRawData(response: ResponseBody): String? {
    var reader: BufferedReader? = null
    val sb = StringBuilder()
    try {
        reader = BufferedReader(InputStreamReader(response.byteStream()))
        var line: String?
        try {
            while (reader.readLine().also { line = it } != null) {
                sb.append(line)
            }
        } catch (e: IOException) {
            //e.printStackTrace();
        }
    } catch (e: java.lang.Exception) {
        //e.printStackTrace();
    }
    var finalText = sb.toString()
    val char1 = finalText.substring(0, 1)
    if (char1.equals("[", ignoreCase = true)) {
        finalText = "{\"array\": $finalText}"
    }
    //Constants.printText("finalText: " + finalText);
    return finalText
}

