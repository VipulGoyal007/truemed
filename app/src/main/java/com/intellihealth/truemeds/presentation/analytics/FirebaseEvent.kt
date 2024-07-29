package com.intellihealth.truemeds.presentation.analytics

import android.content.Context
import android.os.Bundle
import com.google.firebase.analytics.FirebaseAnalytics
import com.intellihealth.truemeds.presentation.utils.logD
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class FirebaseEvent @Inject constructor(@ApplicationContext context: Context) {

    companion object {
        //purchase event
        const val FIREBASE_ORDER_SUMMARY_CONFIRM_ORDER="Ordersummary_Confirmorder"
        //other event
        const val FIREBASE_PD_PAGE_SUB_VIEW="Pdpage_sub_view"
        const val FIREBASE_SUBS_POPUP="Subs_popup"
        const val FIREBASE_PD_PAGE_SUB_ADDED="Pdpage_subadded"
        const val FIREBASE_SUB_ADDED="Subs_added"
        const val FIREBASE_SEARCH_SUBS_VIEW="Search_subs_view"
        const val FIREBASE_SEARCH_SUBS_ADDED="Search_subs_added"
        const val FIREBASE_REPLACE_ALL_TO_SUBSTITUTE="replace_all_to_substitute"
        const val FIREBASE_LOCATION_CHOOSE_LOCATION="Location_Chooselocation"
        const val FIREBASE_SEARCH_VIEWED="search_viewed"
        /*const val FIREBASE_ONBOARDING_HEALTH_ISSUES_SELECTED="onboarding_health_issues_selected"
        const val FIREBASE_ONBOARDING_EXIT="onboarding_exit"
        const val FIREBASE_ONBOARDING_MED_CONDITION_SKIP="onboarding_med_condition_skip"
        const val FIREBASE_ONBOARDING_MED_MONTHLY_BILL_SKIP="onboarding_med_monthly_bill_skip"
        const val FIREBASE_ONBOARDING_FINAL_SAVING_SKIP="onboarding_final_saving_skip"*/
        const val FIREBASE_REGISTRATION_MOBILE_NO_SKIP="Registration_MobilenoSkip"
        const val FIREBASE_REGISTRATION_OTP_SKIP="Registration_OTPskip"
        //no parameter
        const val FIREBASE_REGISTRATION_TERMS_AND_CONDITIONS="Registration_Terms&conditions"
        //
        const val FIREBASE_REGISTRATION_OTP_REQUESTED="Registration_OTPrequested"
        const val FIREBASE_LOGIN_OTP_REQUESTED="Login_Otprequested"
        const val FIREBASE_ONBOARDING_INITIATED="onboarding_initiated"
        //single parameter
        const val FIREBASE_REGISTRATION_SUCCESSFUL="Registration_successful"
        const val FIREBASE_LOGIN_SUCCESSFUL="Login_Successful"
        //
        const val FIREBASE_HOME_PAGE_HEALTH_ARTICLES="Homepage_Healtharticles" // details in prod
        const val FIREBASE_FAQ_BACK="FAQ_Back"
        const val FIREBASE_PRIVACY_POLICY_VIEWED="privacy_policy_viewed"
        const val FIREBASE_TNC_VIEWED="tnc_viewed"
        const val FIREBASE_BANNER_SEARCH="Banner_Search"
        const val FIREBASE_ORDER_STATUS_VIEW_MODIFICATION="Orderstatus_viewmodification"
        const val FIREBASE_PAYMENT_FAILED="Payment_Failed"
        const val FIREBASE_FLAGGED_PAYMENT="FlaggedPayment"
        const val FIREBASE_ERROR_PAYMENT="ErrorPayment"
        const val FIREBASE_PAYMENT_SUCCESSFUL="Payment_Successful"
        const val FIREBASE_HOMEPAGE_PAYMENT_CANCELLED="Homepage_Paymentcancelled"
        const val FIREBASE_ORDER_PRESCRIPTION_CAMERA="Order_prescriptionCamera"
        const val FIREBASE_TM_WALLET_TRANSACTION_DATE="Tmwallet_transactiondate"
        const val FIREBASE_TM_REWARDS_FAQS_VIEW_MORE="TMrewards_FAQsviewmore"
        const val FIREBASE_TM_CREDIT_FAQ_VIEW_MORE="TMcredit_FAQsviewmore"
        const val FIREBASE_TM_REWARDS_FAQS="TMrewards_FAQs"
        const val FIREBASE_TM_CREDIT_FAQS="TM credit_FAQs"
        const val FIREBASE_TM_REWARDS_BACK="TMrewards_back"
        const val FIREBASE_TM_CREDIT_BACK="TMcredit_back"
        const val FIREBASE_PDP_VIEWED="pdp_viewed"
        const val FIREBASE_SUBSTITUTE_DROPDOWN_CLOSED="substitute_dropdown_closed"
        const val FIREBASE_SUBSTITUTE_DROPDOWN_VIEWED="substitute_dropdown_viewed"
        const val FIREBASE_PD_PAGE_SUBS_PD="PDpage_subspd"
        const val FIREBASE_PD_PAGE_INTRODUCTION="PDpage_introduction"
        const val FIREBASE_PD_PAGE_MEDICINE_ACTIVITY="PDpage_MedicineActivity"
        const val FIREBASE_PD_PAGE_USES="PDpage_uses"
        const val FIREBASE_PD_PAGE_DIRECTIONS_FOR_USE="PDpage_directionsforuse"
        const val FIREBASE_PD_PAGE_SIDE_EFFECTS="PDpage_sideeffects"
        const val FIREBASE_PD_PAGE_ADDITIONAL_INFORMATION="PDpage_additionalinformation"
        const val FIREBASE_PD_PAGE_SEARCH="PDPage_search"
        const val FIREBASE_PD_PAGE_CART="PDPage_Cart"
        const val FIREBASE_PD_PAGE_VIEW_CART="PDpage_viewcart"
        const val FIREBASE_PD_PAGE_SUBS_ADD="PDpage_subsadd"
        const val FIREBASE_PD_PAGE_NO_SUBS="PDPage_Nosubs"
        const val FIREBASE_PD_PAGE_ORG_ADD="PDPage_orgadd"
        const val FIREBASE_PD_PAGE_DELETE="PDPage_Delete"
        const val FIREBASE_REFER_AND_EARN_VIEW="Refer&earn_view"
        const val FIREBASE_REFER_AND_EARN_ORDER_NOW="Refer&Earn_Ordernow"
        const val FIREBASE_REFER_AND_EARN_COPY="Refer&earncopy"
        const val FIREBASE_REFER_AND_EARN_FAQ="Refer&Earn_FAQ"
        const val FIREBASE_REFER_AND_EARN_REFER_A_FRIEND="Refer&earn_ReferAFriend"
        const val FIREBASE_REGISTRATION_RESEND_OTP="Registration_ResendOTP"
        const val FIREBASE_LOGIN_RESEND_OTP="Login_ResendOTP"
        const val FIREBASE_REGISTRATION_MOBILE_NO_EDIT="Registration_Mobilenoedit"
        const val FIREBASE_LOGIN_MOBILE_NO_EDIT="Login_Mobilenoedit"
        const val FIREBASE_PATIENT_AND_REMINDER_SET_BUTTON_ORDER_STATUS="Patient&Reminder_set_button_orderstatus"
        const val FIREBASE_ORDER_STATUS_ADD_ALTERNATE_CONTACT="Orderstatus_addalternatecontact"
        const val FIREBASE_ORDER_STATUS_DOCTOR_DETAILS="Orderstatus_doctordetails"
        const val FIREBASE_ORDER_PHARMACIST_CALL="Order_PharmacistCall"
        const val FIREBASE_ORDER_DOCTOR_CALL="Order_DoctorCall"
        const val FIREBASE_ORDER_DOCTOR_MISSED_CALL="Order_DoctorMissedCall"
        const val FIREBASE_ORDER_PROCESSING="Order_Processing"
        const val FIREBASE_ORDER_OUT_FOR_DELIVERY="Order_OutforDelivery"
        const val FIREBASE_ORDER_DISPATCHED="Order_Dispatched"
        const val FIREBASE_WALLET_TOP_BAR="Wallet_topbar"
        const val FIREBASE_HOMEPAGE_UPLOAD_PRESCRIPTION="Homepage_Uploadprescription"
        const val FIREBASE_HOMEPAGE_CALL_TO_ORDER="Homepage_Calltoorder"
        const val FIREBASE_HOMEPAGE_HEALTH_ARTICLES="Homepage_Heatlharticles"
        const val FIREBASE_HOMEPAGE_SEARCH="Homepage_Search"
        const val FIREBASE_HOMEPAGE_REORDER_CARD="Homepage_reorder_card"
        const val FIREBASE_HOMEPAGE_EXAMPLE="Homepage_example"
        const val FIREBASE_HOMEPAGE_LOCATION="Homepage_location"
        const val FIREBASE_CART_ADD_MEDICINES="Cart_addmedicines"
        const val FIREBASE_CART_SEARCH="Cart_search"
        const val FIREBASE_CART_REMOVE="Cart_remove"
        const val FIREBASE_CART_PD_PAGE="Cart_PDpage"
        const val FIREBASE_CART_PRESCRIPTION="Cart_prescription"
        const val FIREBASE_CART_APPLY_COUPON="Cart_applycoupon"
        const val FIREBASE_UPLOAD_PRESCRIPTION_REMOVE="Uploadprescription_remove"
        const val FIREBASE_CART_BACK="Cart_Back"
        const val FIREBASE_CART_PROCEED="Cart_Proceed"
        const val FIREBASE_HOMEPAGE_VIEWED="Homepage_viewed"
        const val FIREBASE_HOMEPAGE_NAV="Homepage_Nav"
        const val FIREBASE_REFER_AND_EARN_NAV="Referandearn_nav"
        const val FIREBASE_ORDERS_NAV="orders_nav"
        const val FIREBASE_ACCOUNT_NAV="account_nav"
        const val FIREBASE_TM_WALLET_VIEWED="Tmwallet_viewed"
        const val FIREBASE_TM_WALLET_T_AND_C="Tmwallet_t&c"
        const val FIREBASE_TM_WALLET_REWARD_TRANSACTIONS="TMwallet_rewardtransactions"
        const val FIREBASE_TM_WALLET_CREDIT_TRANSACTIONS="TMwallet_credittransactions"
        const val FIREBASE_TM_WALLET_FAQS="TMwallet_FAQs"
        const val FIREBASE_TM_WALLET_FAQS_VIEW_MORE="TMwallet_FAQsviewmore"
        const val FIREBASE_TM_WALLET_REFER_AND_EARN="TMwallet_Refer&earn"
        const val FIREBASE_TM_WALLET_BACK="TMwallet_back"
        const val FIREBASE_CART_REMOVE_COUPON="Cart_Removecoupon"
        const val FIREBASE_LOCATION_ENTER_PIN_CODE="Location_enterpincode"
        const val FIREBASE_DELAY_IN_API_RESPONSE="DelayInAPIResponse" // common fucntion delay
        const val FIREBASE_ERROR400="Error400" // common fucntion delay
        const val FIREBASE_ERROR401="Error401" // common fucntion delay
        const val FIREBASE_ERROR403="Error403" // common fucntion delay
        const val FIREBASE_ERROR500="Error500" // common fucntion delay
        const val FIREBASE_API_FAILURE="APIFailure"  // common fucntion delay
        //const val FIREBASE_REGISTRATION_SCREEN = "RegistrationScreen"
        const val FIREBASE_UPLOAD_PRESCRIPTION_CAMERA="Uploadprescription_Camera"
        const val FIREBASE_UPLOAD_PRESCRIPTION_UPLOAD="Uploadprescription_uploaded"  //doubt
        const val FIREBASE_ORDER_PRESCRIPTION_UPLOADED="Order_prescriptionuploaded"
        const val FIREBASE_UPLOAD_PRESCRIPTION_PRESCRIPTION_SELECTED="Uploadprescription_prescriptionselected"
        const val FIREBASE_REGISTRATION_MOBILE_NO="Registration_Mobileno"
        const val FIREBASE_SEARCH_VIEW_CART="Search_ViewCart"
        const val FIREBASE_UPDATE_PROFILE_SAVE="Updateprofile_save"
        const val FIREBASE_ERROR_TRACKING="error_tracking"
        const val FIREBASE_ORDER_PRESCRIPTION_GALLERY="Order_prescriptiongallery"
        const val FIREBASE_UPLOAD_PRESCRIPTION_GALLERY="Uploadprescription_gallery"
    }

    private var firebaseAnalytics: FirebaseAnalytics

    init {
        firebaseAnalytics = FirebaseAnalytics.getInstance(context)
    }

    fun logFirebaseEvent(eventName: String, bundle: Bundle) {
        firebaseAnalytics.logEvent(eventName, bundle)
        logD("FirebaseEvent", "sendFirebaseEvent: $eventName: \nOBJ: $bundle")
    }

    fun logFirebasePurchaseEvent(bundle: Bundle) {
        firebaseAnalytics.logEvent(FirebaseAnalytics.Event.PURCHASE, bundle)
        logD("FirebaseEvent", "sendFirebaseEvent: ${FirebaseAnalytics.Event.PURCHASE}: \nOBJ: $bundle")
    }
}