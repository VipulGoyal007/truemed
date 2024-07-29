package com.intellihealth.truemeds.data.utils

import com.intellihealth.truemeds.BuildConfig

object ApiEndpointConstants {
    fun baseUrl(): String {
        return BuildConfig.baseUrl
    }

    /**
     * SplashActivityApi Interface
     */
    const val MOBILE_MASTER = "/CustomerService/v1/mobileMaster"

    /**
     * LoginApi Interface
     */
    const val FETCH_DEFAULT_TOKEN = "/CustomerService/v1/fetchDefaultToken"
    const val FETCH_SESSION_TOKEN = "/CustomerService/v1/fetchSessionToken"
    /**
     * New One to be used once issue solved by backend
     * **/
    const val SEND_MOBILE_OTP = "/CustomerService/v1/sendMobileOtp"
    const val VERIFY_OTP = "/CustomerService/v1/verifyOtp"
    const val GET_TRUECALLER_TOKEN = "https://oauth-account-noneu.truecaller.com/v1/token"
    const val VERIFY_TRUECALLER_TOKEN = "/CustomerService/v1/verifyTruecallerToken"


    /**
     * HomePageApi Interface
     */
    const val GET_BANNERS_FOR_HOMEPAGE = "/CustomerService/v1/getBannersForHomePage"
    const val GET_FTC_COUPON_EXPIRY_DATE = "/CustomerService/getFtcCouponExpiryDate"//to use 1 api for coupon, response to come based on request type
    const val GET_WORDPRESS_ARTICLE = "https://articleservice.tmmumbai.in/ArticleService/getWordpressArticleNew?"//need to update this end point
    const val VIDEO_FAQ_ALL = "/CustomerService/v1/videoFaq/all"
    const val SAVE_RATING_DETAILS = "/CustomerService/v1/saveRatingDetails"
    const val GET_RATING_DETAILS = "/CustomerService/v1/getRatingDetails"
    const val SAVE_POP_UP_REASONS = "/CustomerService/v1/savePopUpReasons"
//    const val CHECK_PINCODE_SERVICEABILITY = "/ThirdPartyService/checkPincodeServiceability"
    const val CHECK_PINCODE_SERVICEABILITY = "/CustomerService/v1/checkPincodeServiceability"

    const val FETCH_TRUEMEDS_CONTACT_BY_NAME = "/CustomerService/fetchTruemedsContactByName"
    const val SAVE_CONTACT_MAPPING = "/CustomerService/saveCxContactMapping"

    //order details: this is kept here so that OrderFlow related resources doesn't get initialized on homepage
    //request doctor consultation
    const val INCREASE_DIGITIZED_ORDER_RANK = "/CustomerService/v1/increaseDigitizedOrderRank"
    const val FETCH_ALL_ORDERS_OF_CUSTOMERS = "/CustomerService/v1/getAllCustomerOrders"
    const val RE_ORDER = "/CustomerService/v1/reOrder" //"/OrderManagementService/reOrder"
    const val CALCULATE_BILL_DETAILS_FOR_APP = "/CustomerService/calculateBillDetailsforApp"
    const val FETCH_ALL_OFFERS = "/CustomerService/fetchAllCxOffers"
    const val FETCH_HOME_PAGE_CATEGORIES = "/CustomerService/fetchHomePageCategories"
    const val DELETE_IMAGES_API = "/CustomerService/v1/deleteImage"
    const val PATIENT_AND_PRESCRIPTION_DETAILS_API = "/CustomerService/getPatientAndPrescriptionDetails"
    const val NAME_VALIDATION_LIST = "/CustomerService/v1/getNameValidationMasterList"

    /**
     * ProductListAndDetailsApi Interface
     */
    //const val FETCH_FROM_ELASTIC_SEARCH = "/CustomerService/plc/fetchFromElasticSearch"
    const val SEARCH_SUGGESTION_RESULTS = "/CustomerService/getSearchSuggestion"
    const val SEARCH_RESULTS = "/CustomerService/getSearchResult"
    //const val CALL_ELASTIC_SEARCH = "/CustomerService/callElasticSearch"
    const val FETCH_MEDICINE_DETAILS = "/CustomerService/v1/fetchMedicineDetails"
    const val FETCH_REORDER_OTC_PRODUCT = "/CustomerService/fetchReOrderOTCProduct"
    const val GET_CROSS_SELLING_RECOMMENDED_PRODUCTS = "/CustomerService/v1/getCrossSellingRecommendedProducts"
    const val GET_TRENDING_SEARCH_PRODUCTS = "/CustomerService/getTrendingSearches"
    const val SAVE_PRODUCT_SEARCH_DATA = "/CustomerService/v1/saveProductSearchdata"
    const val SAVE_CROSS_PRODUCT_ADDED_DATA = "/CustomerService/v1/saveCrossProductAddedData"
    const val FETCH_MEDICINE_DETAILS_OF_PATIENT = "/CustomerService/v1/getMedicinesOfCustomer"
    const val FETCH_ALL_ADDRESS = "/CustomerService/v1/fetchAllAddress"
    /**
     * OrderFlowApi Interface
     */
    const val GET_ORDER_MEDICINE_DETAILS = "/CustomerService/getOrderMedicineDetails"
    const val SAVE_MEDS_AND_CREATE_ORDER = "/OrderManagementService/v1/saveMedsAndCreateOrder"
    const val REPLACE_MEDICINES_FOR_INCOMPLETE_ORDER =
        "/OrderManagementService/v1/replaceMedForIncompleteOrder"
    const val EDIT_MEDICINE = "/OrderManagementService/v1/editMedicine"
    const val GET_CUSTOMER_ORDER_DETAILS = "/CustomerService/getCustomerOrderDetails"
    const val SET_PAYMENT_MODE_FOR_ORDER = "/CustomerService/setPaymentModeForAnOrder"
    const val UPLOAD_IMAGE = "CustomerService/v1/saveRxImageForCustomerId"
    const val GET_PATIENT_DETAILS = "/CustomerService/getPatientDetails"
    const val GET_ALL_PRESCRIPTION_BY_CUSTOMER_ID =
        "/OrderManagementService/getAllPescriptionByCustomerId"
    const val GET_ALL_OFFERS = "/CustomerService/offers/all"
    const val SAVE_PAYMENT_AND_COUPON_FOR_ORDER = "/CustomerService/v1/savePaymentAndCouponForOrder"
    const val SAVE_COUPON_CODE = "/CustomerService/saveCouponCode"
    const val SAVE_ADDRESS_FOR_ORDER = "/CustomerService/saveAddressForOrder"
    const val UPDATE_PATIENT_ID_IN_SUB_ORDER = "/CustomerService/updatePatientIdInSubOrder"
    const val FETCH_ORDER_RX = "/CustomerService/v1/fetchRxForOrder"

    //PSP
    const val FETCH_ICON_MASTER = "/CustomerService/v1/fetchPaymentMethods"
    const val SET_PAYMENT_SELECTION_METHOD = "/CustomerService/v1/setPaymentSelectionMethod"
    const val SET_PSP_VIEWED_BY_CUSTOMER = "/CustomerService/v1/setPspViewedByCustomer"

    const val CONFIRM_ORDER = "/CustomerService/v1/confirmOrder"
    //const val INCREMENT_EVENT_COUNTER = "/CustomerService/incrementEventCounter"
    const val DISCARD_ORDER = "/CustomerService/discardOrder"

    //doctor details and save ratings
    const val GET_DOCTOR_DETAILS = "/CustomerService/doctor/getDoctorDetails"
    const val DOCTOR_RATING = "/CustomerService/v1/rating/doctor"

    //ClickPost
    const val CLICKPOST_GENERATE_RETURN_URL =
        "https://internal.clickpost.in/api/v1/fetch_return_info/"

    /**
     * OrderStatusApi Interface
     */
    const val GET_ORDER_STATUS = "/CustomerService/fetchOrderStatusDetails"
    const val FETCH_DOCTOR_ORDER_CONFIRMED_AND_BOX_VERIFIED_DETAILS =
        "/CustomerService/fetchDoctorOrderConfirmdAndBoxVerifiedDetails"
    const val ORDER_STATUS_VIDEO = "/CustomerService/videoOrderStatus"
    const val SAVE_ALTERNATE_NUMBER_FOR_ORDER = "/CustomerService/v1/saveAlternateNumberForOrder"
    const val DELETE_ALTERNATE_NUMBER_FOR_ORDER = "/CustomerService/deleteAlternateNumberForOrderId"
    //const val CHANGE_PAYMENT_MODE = "/ThirdPartyService/v1/changePaymentMode"
    const val GENERATE_RETURN_URL = "/CustomerService/v1/generateReturnUrl"
    const val CHANGE_PAYMENT_MODE = "/CustomerService/v1/changePaymentMode"

    /**
     * CashFreeApi Interface
     */
    const val SAVE_CASHFREE_RESPONSE = "/ThirdPartyService/saveCashFreeResponse"
    const val CREATE_ORDER_TOKEN_IN_CASHFREE = "/ThirdPartyService/createOrderTokenInCashFree"


    /**
     * OrderReminderApi Interface
     */
    const val GET_REMINDERS = "/CustomerService/v1/getReminders"
    const val SET_REMINDER = "/CustomerService/v1/setReminder"
    const val CANCEL_REMINDER = "/CustomerService/v1/cancleReminder"


    /**
     * CancelOrderApi Interface
     */
    const val GET_REASONS_FOR_ORDER_CANCELLATION =
        "/OrderManagementService/getReasonsForOrderCancellation"
    const val GET_L1_REASONS_FOR_ORDER_CANCELLATION =
        "/OrderManagementService/getL1ReasonsForOrderCancellation"
    const val GET_SUBS_REASONS_FOR_ORDER_CANCELLATION =
        "/OrderManagementService/getSubReasonsForOrderCancellation"
    const val CANCEL_ORDER = "/OrderManagementService/cancelOrder"

    /**
     * WalletAndReferralApi Interface
     */
    const val WALLET = "/CustomerService/v1/getWalletInfo"
    //const val GET_WALLET_INFO = "/CustomerService/walletInfo"
    const val GET_WALLET_INFO = "/CustomerService/v1/walletTransactionInfo"
    const val REDEEM_REFERRAL_CODE = "/CustomerService/v1/redeem"
    const val REFERRAL_STATUS = "/CustomerService/v1/getReferralStatus"

    /**
     * OrderIssueApi Interface
     */
    //TODO data class pending
    const val GET_ALL_ISSUE_MEDICINES = "/CustomerService/getAllIssueMedicines"
    const val RAISE_ORDER_ISSUES = "/CustomerService/raiseOrderIssues"
    const val GET_TICKET_ISSUE_DETAILS = "/CustomerService/getTicketIssueDetails"

    /**
     * HelpFaqAndTnCApi Interface
     */

    const val GET_HELP_CATEGORY = "/CustomerService/v1/getHelpCategory"
    const val GET_HELP_CATEGORY_DETAILS = "/CustomerService/v1/getHelpCategoryDetails"

    const val GET_FAQ_CATEGORY = "/CustomerService/faq/category"
    const val GET_FAQ_BY_CATEGORY = "/CustomerService/faq/id/category"
    const val GET_FAQ = "/CustomerService/v1/fetchFaq"


    const val GET_PP_API = "/CustomerService/v1/getPP"
    const val GET_TNC_API = "/CustomerService/v1/getTNC"
    const val CHECK_IF_CUSTOMER_ACCEPTED_PP_AND_TNC =
        "/CustomerService/checkIfCustomerAcceptedPPAndTNC"
    const val ACCEPT_PP_OR_TNC = "/CustomerService/v1/acceptPPOrTNC"

    /**
     * UserDataApi Interface
     */
    const val SAVE_CUSTOMER_DEVICE_INFO = "/CustomerService/v1/saveCustomerDeviceInfo"
    const val SET_EVENT_ID_FOR_CUSTOMER = "/CustomerService/v1/setEventIdforCustomer"
    const val SAVE_AAID_OF_CUSTOMER = "/CustomerService/v1/saveAaidOfCustomer"

    const val UPDATE_PROFILE_API = "/CustomerService/v1/updateProfile"

    const val SAVE_ADDRESS = "/CustomerService/v1/saveAddress"
    const val DELETE_ADDRESS = "/CustomerService/v1/deleteAddress"
    const val GET_ALL_ADDRESSES = "/CustomerService/v1/fetchAllAddress"

    const val ADD_PATIENT = "/CustomerService/v1/addPatient"
    const val DELETE_PATIENT = "/CustomerService/v1/deletePatient"
    const val GET_ALL_PATIENT = "/CustomerService/getAllPatient"
    const val GET_PATIENT_BY_ID = "/CustomerService/getPatientById"
    const val GET_CUSTOMER_DETAILS = "/CustomerService/v1/getCustomerDetails"

    const val GET_CUSTOMER_AND_ORDER_DETAILS_FOR_HOME = "/CustomerService/v1/getCustomerDetailsForHome"
    //const val GET_ORDER_TRACK_ON_HOME = "/CustomerService/getOrderTrackOnHome"
    const val GET_CUSTOMER_DELIVERY_CHARGE_DATA = "/CustomerService/v1/getCustomerDeliveryChargeData"
    const val GENERATE_NEW_TOKEN = "/CustomerService/generateNewToken"

    const val SET_CUSTOMER_CATEGORY = "/CustomerService/setCustomerCategory"
    const val DEACTIVATE_CUSTOMER_CATEGORY = "/CustomerService/markCustomerCategoryAsInactive"
    //const val GET_PRESCRIPTION_LIST = "/CustomerService/v1/fetchRxForOrder"
    const val FETCH_PRODUCTS_FOR_CATEGORIES = "/CustomerService/v1/fetchProductsForCategories"
    const val FETCH_REORDER_OTC_PRODUCT_V1 = "/CustomerService/v1/fetchReOrderOTCProduct"
    const val GET_CUSTOMER_ORDER_DETAILS_V1 = "/CustomerService/getCustomerOrderDetails"
    const val GET_CROSS_LAST_MINUTE_BUY = "/CustomerService/v1/getCrossSellingRecommendedProducts"
//    const val REORDER = "/OrderManagementService/reOrder"
    const val SAVE_VARIANT_INFO = "/CustomerService/v1/saveVariantInfo"
    const val UPDATE_VARIANT_INFO = "/CustomerService/v1/updateVariantInfo"

    const val MY_PERMISSIONS_REQUEST_CONTACT = 1010

    const val SAVE_CUSTOMER_EMAIL_ADDRESS = "CustomerService/v1/saveCustomerEmailAddress"

}