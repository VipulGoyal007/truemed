package com.intellihealth.truemeds.domain.enums

import androidx.annotation.StringDef

enum class LoginStatus {
    INVALID_ACCESS_TOKEN,
    SUCCESS,
    INVALID_OTP,
    EXCEPTION_OCCURRED,
    NULL
}

enum class ElasticSearchType {
    SKU_BRAND_SEARCH,
    SEARCH_SUGGESTION,
    ORIGINAL_SKU_NAME,
    ORIGINAL_MOTHER_BRAND,
    FETCH_PRODUCT_DETAILS
}

enum class SplashScreenImageType {
    DEFAULT,
    CHRISTMAS
}

enum class DynamicDiscount {
    FTC_DynamicDiscount,
    NFTC_DynamicDiscount,
    Traditional_BaseDiscount
}

enum class UserCategoryServerEnum(
    var firebaseParameterKey: String,
    var apiCategoryType: String,
    var createVariantPostLogin: Boolean,
    var isExperimentConcluded: Boolean
) {
    GENERIC_CAP_DISCOUNT("GENERIC_CAP_DISCOUNT", "GENERIC_CAP_DISCOUNT", true, false),
}

enum class UserCategoryEnum(
    var firebaseParameterKey: String,
    var apiCategoryType: String,
    var createVariantPostLogin: Boolean,
    var isExperimentConcluded: Boolean
) {
    SUBS_ADD_TO_CART("Subs_Add_To_Cart", "SUBS_ADD_TO_CART", true, false),
    PD_SEARCH_BLUE_GREEN("PDSearch_BlueGreenVariant", "PDSearch_BlueGreenVariant", true, true),
    PILL_REMINDER("Pill_Reminder_Variant", "Pill_Reminder_Variant", true, true),
    PACKAGING_CHARGE("PACKAGING_CHARGE", "PACKAGING_CHARGE", true, false),
    CANCELLATION_FLOW("CancellationFlow", "CancellationFlow", true, true),
    CREDIT_REWARD("Credit_Reward", "Credit_Reward", true, false),
    ONLINE_PRE_SELECTION("Online_Pre_Selection", "Online_Pre_Selection", true, false),
    FTC_COUPON_URGENCY("FTC_Coupon_Urgency", "FTC_Coupon_Urgency", true, false),
    VIDEO_ON_ORDER_STATUS(
        "Video_On_Order_Status",
        "Video_On_Order_Status",
        false, true
    ),//order summary, cart summary
    ONE_CLICK_SUBSTITUTION(
        "one_click_substitution_experiment",
        "one_click_substitution_experiment",
        false, true
    ),//cart
    REORDER_DESIGN_EXPERIMENT("reorder_design_experiment", "reorder_design_experiment", false, true),
    PSP("psp_experiment", "psp_experiment", false, true),
    FTC_DYNAMIC_DISCOUNT("FTC_DynamicDiscount", "FTC_DynamicDiscount", true, false),
    NFTC_DYNAMIC_DISCOUNT("NFTC_DynamicDiscount", "NFTC_DynamicDiscount", true, false),
    TRADITIONAL_BASE_DISCOUNT("Traditional_BaseDiscount", "Traditional_BaseDiscount", true, false),
    SEARCH_EXPERIMENT_1("search_experiment_1", "search_experiment_1", true, false),
    GENERIC_CAP_DISCOUNT("GENERIC_CAP_DISCOUNT", "GENERIC_CAP_DISCOUNT", true, false),
    CASH_HANDLING_CHARGE("CASH_HANDLING_CHARGE", "CASH_HANDLING_CHARGE", true, false)
}

enum class ErrorType() {
    NO_NETWORK,
    NO_DATA,
    SERVICE_ERROR

}

enum class EmptyStates {
    DEFAULT,
    SOMETHING_NOT_RIGHT,
    INTERNET_CONNECTION,
    NO_RESULTS_FOUND,
    UPDATE_APP
}


enum class PinCodeServiceability {
    SERVICEABLE,
    NOT_SERVICEABLE
}

enum class NetworkResponseType(val code: Int) {
    SUCCESS(200),
    FAILURE(199),
    EXCEPTION(299),
    UNEXPECTED(499),
    BADREQUEST(400)
}

enum class PaymentMode(val mode: Int) {
    ONLINE(16),
    COD(17)
}


enum class PaymentModeName {
    ONLINE,
    COD
}

enum class Coupon(val prefix: String) {
    ENDS_IN("Ends in")
}

enum class Banner {
    HOME, OTC
}

enum class LoginFromScreen {
    HOME, ACCOUNT
}
enum class ProductCardSectionType {
    TOP, STACKED, BOTH
}


enum class ClickedOnPage {
    App_OPEN,
    LOGIN_PAGE,
    OTP_PAGE,
    HOMEPAGE,
    UPLOAD_PRESCRIPTION,
    PRODUCT_DETAIL_PAGE,
    SEARCH_SUGGESTION,
    SRP,
    OTC_CATEGORY,
    ORDER_SUMMARY,
    DELIVERY_DETAILS,
    MANAGE_ADDRESS,
    ADD_ADDRESS,
    MANAGE_PATIENT,
    ADD_PATIENT,
    PILL_REMINDER,
    PSP,
    VIDEO_FAQ,
    ORDER_STATUS,
    CART,
    PRIVACY_POLICY,
    TERMS_AND_CONDITION,
    HELP,
    REFER_N_EARN,
    CASHFREE,
    CANCEL_ORDER,
    REORDER,
    REPLACE_ORG,
    COUPON,
    ORDER_TICKET
}

enum class AddressEdited(val type: String) {
    Cart("cart"), // When address is added from Cart
    DeliveryDetails("delivery_details"), // when from order summary page
    ManageAddress("manage address"), // when from account screen
    OrderSummary("order_summary"),
    UploadPrescription("upload prescription") //When address is added from Upload Prescription
}

enum class AddressType {
    OFFICE, HOME, OTHER
}

sealed class ShimmersStates<Boolean> {
    data class Trending(val state: Boolean) : ShimmersStates<Boolean>()
    data class NewArrival(val state: Boolean) : ShimmersStates<Boolean>()
    data class LimitedOffer(val state: Boolean) : ShimmersStates<Boolean>()
    data class Stacked(val state: Boolean) : ShimmersStates<Boolean>()
}


@Retention(AnnotationRetention.SOURCE)
@StringDef(
    OrderInState.ACTIVE,
    OrderInState.NON_ACTIVE,
    OrderInState.IN_COMPLETE
)
annotation class OrderInState{
    companion object{
        const val ACTIVE = "Active"
        const val NON_ACTIVE = "NonActive"
        const val IN_COMPLETE = "InComplete"
    }
}
