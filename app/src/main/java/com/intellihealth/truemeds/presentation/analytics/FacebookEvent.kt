package com.intellihealth.truemeds.presentation.analytics

import android.content.Context
import android.os.Bundle
import com.facebook.appevents.AppEventsLogger
import dagger.hilt.android.qualifiers.ApplicationContext
import java.math.BigDecimal
import java.util.Currency
import javax.inject.Inject

class FacebookEvent @Inject constructor(@ApplicationContext context: Context) {

    companion object {
        const val FACEBOOK_ORDER_SUMMARY_CONFIRM_ORDER = "Ordersummary_Confirmorder"//not use
        const val FACEBOOK_REGISTRATION_MOBILE_NO_SKIP = "Registration_MobilenoSkip"//
        const val FACEBOOK_LOGIN_OTP_SKIP = "Login_OTPSkip"//
        const val FACEBOOK_REGISTRATION_OTP_SKIP = "Registration_OTPskip"//
        const val FACEBOOK_REGISTRATION_OTP_REQUESTED = "Registration_OTPrequested"//
        const val FACEBOOK_LOGIN_OTP_REQUESTED = "Login_Otprequested"//
        const val FACEBOOK_REGISTRATION_SUCCESSFUL = "Registration_successful"//
        const val FACEBOOK_LOGIN_SUCCESSFUL = "Login_Successful"//
        const val FACEBOOK_PAYMENT_FAILED = "Payment_Failed"//
        const val FACEBOOK_PAYMENT_SUCCESSFUL = "Payment_Successful"//
        const val FACEBOOK_ORDER_PRESCRIPTION_CAMERA = "Order_prescriptionCamera"// doubt
        const val FACEBOOK_PD_PAGE_INTRODUCTION = "PDpage_introduction"//
        const val FACEBOOK_PD_PAGE_MEDICINE_ACTIVITY = "PDpage_MedicineActivity"//
        const val FACEBOOK_PD_PAGE_USES = "PDpage_uses"//
        const val FACEBOOK_PD_PAGE_DIRECTIONS_FOR_USE = "PDpage_directionsforuse"//
        const val FACEBOOK_PD_PAGE_SIDE_EFFECTS = "PDpage_sideeffects"//
        const val FACEBOOK_PD_PAGE_ADDITIONAL_INFORMATION = "PDpage_additionalinformation"//
        const val FACEBOOK_PD_PAGE_SEARCH = "PDPage_search"// doubt
        const val FACEBOOK_PD_PAGE_CART = "PDPage_Cart"//  doubt
        const val FACEBOOK_PD_PAGE_VIEW_CART = "PDpage_viewcart"// doubt
        const val FACEBOOK_PD_PAGE_DELETE = "PDPage_Delete"//
        const val FACEBOOK_HOMEPAGE_BANNER = "Homepage_Banner"//+ranking
        const val FACEBOOK_HOMEPAGE_UPLOAD_PRESCRIPTION = "Homepage_Uploadprescription"//
        const val FACEBOOK_HOMEPAGE_CALL_TO_ORDER = "Homepage_Calltoorder"//
        const val FACEBOOK_HOMEPAGE_HEALTH_ARTICLES = "Homepage_Heatlharticles"//
        const val FACEBOOK_HOMEPAGE_SEARCH = "Homepage_Search"//
        const val FACEBOOK_TM_WALLET_VIEWED = "Tmwallet_viewed"//
        const val FACEBOOK_TM_WALLET_REWARD_TRANSACTIONS = "TMwallet_rewardtransactions"//
        const val FACEBOOK_TM_WALLET_CREDIT_TRANSACTIONS = "TMwallet_credittransactions"//
        const val FACEBOOK_PD_PAGE_ADD_TO_CART = "PDpage_addtocart"//
        const val FACEBOOK_UPLOAD_PRESCRIPTION_CAMERA = "Uploadprescription_Camera"//
        const val FACEBOOK_ORDER_PRESCRIPTION_UPLOADED = "Order_prescriptionuploaded"//
        const val FACEBOOK_UPLOAD_PRESCRIPTION_PRESCRIPTION_SELECTED =
            "Uploadprescription_prescriptionselected"//
        const val FACEBOOK_REGISTRATION_MOBILE_NO = "Registration_Mobileno"//
        const val FACEBOOK_SEARCH_VIEW_CART = "Search_ViewCart"//
        const val FACEBOOK_CART_ADD = "Cart_add"//
        const val FACEBOOK_UPDATE_PROFILE_SAVE = "Updateprofile_save"//
        const val FACEBOOK_CART_RECOMMENDATIONS = "Cart_recommendationsadd"//
    }

    private var fbAppEventsLogger: AppEventsLogger

    init {
        fbAppEventsLogger = AppEventsLogger.newLogger(context)
    }

    fun logFacebookEvent(eventName: String) {
        fbAppEventsLogger.logEvent(eventName)
    }

    fun logFacebookEvent(eventName: String, bundle: Bundle) {
        fbAppEventsLogger.logEvent(eventName, bundle)
    }

    fun logPurchase(payableAmount: BigDecimal, bundle: Bundle) {
        fbAppEventsLogger.logPurchase(payableAmount, Currency.getInstance("INR"), bundle)
    }
}