package com.intellihealth.truemeds.data.utils

enum class ERRORS(val state :String) {
    NO_ERROR("NO_ERROR"),
    INVALID_PHONE_NUMBER("INVALID_PHONE_NUMBER"),
    INVALID_EMAIL_ID("INVALID_EMAIL_ID"),
    INVALID_OTP("INVALID_OTP"),
    NO_PATIENT_FOUND("NO_PATIENT_FOUND"),
    NO_HELP_CATEGORY_FOUND("NO_HELP_CATEGORY_FOUND"),
    NO_HELP_SUB_CATEGORY_FOUND("NO_HELP_SUB_CATEGORY_FOUND"),
    NO_ORDERS_FOUND("NO_ORDERS_FOUND"),
    NO_ADDRESS_FOUND("NO_ADDRESS_FOUND"),
    NO_PRODUCT_DETAIL_FOUND("NO_PRODUCT_DETAIL_FOUND"),
    NO_NETWORK("NO_NETWORK"),

}