package com.intellihealth.truemeds.presentation.analytics

import android.content.Context
import android.text.TextUtils
import com.intellihealth.truemeds.BuildConfig
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.logD
import com.mixpanel.android.mpmetrics.MixpanelAPI
import dagger.hilt.android.qualifiers.ApplicationContext
import org.json.JSONException
import org.json.JSONObject
import java.util.Locale
import javax.inject.Inject

class MixPanelEvent @Inject constructor(@ApplicationContext context: Context) {

    companion object {
        private var mInstance: MixPanelEvent? = null

        //login  and splash
        const val MIX_EVENT_EXPERIMENT_STARTED = "\$experiment_started"
        const val MIX_EVENT_LOGIN_SKIPPED = "login_skipped"
        const val MIX_EVENT_LOG_IN_SUCCESS = "login_successful"
        const val MIX_EVENT_SIGNUP_SUCCESSFUL = "signup_successful"
        const val MIX_EVENT_LOGIN_PAGE_VIEWED = "login_page_viewed"
        const val MIX_EVENT_OTP_TYPED = "otp_typed"
        const val MIX_EVENT_OTP_CLICKED = "get_otp_clicked"
        const val MIX_EVENT_APP_OPENED = "app_opened"

        //home page
        const val MIX_EVENT_HOMEPAGE_VIEWED = "homepage_viewed"//
        const val MIX_EVENT_HOMEPAGE_BANNER_IMPRESSION = "homepage_banner_impression"//
        const val MIX_EVENT_HOMEPAGE_BANNER_CLICKED = "homepage_banner_click"//
        const val MIX_EVENT_HOMEPAGE_SKINNY_BANNER_IMPRESSION = "homepage_skinny_banner_impression"//
        const val MIX_EVENT_BANNER_CLICKED = "banner_clicked"//


        //address
        const val MIX_EVENT_ADDRESS_ADDED = "address_added"//
        const val MIX_EVENT_ADD_ADDRESS_CLICKED = "add_address_clicked"//done 19 march
        const val MIX_EVENT_ADDRESS_CHANGED = "address_changed" //done 19 march
        const val MIX_EVENT_ADDRESS_EDITED = "address_edited"


        //patient
        const val MIX_EVENT_PATIENT_ADDED = "patient_added"//done 19 march
        const val MIX_EVENT_ADD_PATIENT_CLICKED = "add_patient_clicked"//done 19 march
        const val MIX_EVENT_PATIENT_DETAILS_EDITED = "patient_details_edited"

        //delivery details
        const val MIX_EVENT_DELIVERY_DETAILS_VIEWED = "delivery_details_viewed"//done 19 march

        //prescription
        const val MIX_EVENT_PRESCRIPTION_CLICKED = "upload_prescription_clicked"
        const val MIX_EVENT_PRESCRIPTION_UPLOAD_PAGE_VIEWED = "prescription_upload_page_viewed"

        //cart
        const val MIX_EVENT_CART_VIEWED = "cart_viewed"
        const val MIX_EVENT_OFFER_SHEET_VIEWED = "offer_sheet_viewed"
        /*const val MIX_EVENT_SUB_RECOMMENDATION_SCREEN_VIEWED = "substitute_recommendation_screen_viewed"
        const val MIX_EVENT_SUB_QTY_SCREEN_VIEWED = "substitute_quantity_screen_viewed"*/
        const val MIX_EVENT_SUBS_REPLACE_CLICKED = "substitute_replace_clicked"
        const val MIX_EVENT_UNDO_CLICKED = "undo_clicked"
        const val MIX_EVENT_SWITCH_BACK_CLICKED = "switch_back_clicked"
        const val MIX_EVENT_ONE_CLICK_SUBSTITUTION_POPUP_VIEWED = "one_click_substitution_popup_viewed"


        //coupon
        const val MIX_EVENT_APPLY_COUPON_CLICKED = "apply_coupon_clicked"
        const val MIX_EVENT_COUPON_LIST_OPENED = "coupon_list_opened"
        const val MIX_EVENT_COUPON_APPLIED = "coupon_applied"
        const val MIX_EVENT_COUPON_REMOVED = "coupon_removed"

        //OTC
        const val OTC_PRODUCT_LIST_PAGE_VIEWED = "otc_product_list_page_viewed"

        //search------------
        const val MIX_EVENT_SEARCH_VIEWED = "search_viewed"
        const val MIX_EVENT_ITEM_SEARCHED = "item_searched"
        const val MIX_EVENT_SUGGESTION_ITEM_IMPRESSION = "search_suggestion_impression"

        //srp
        const val MIX_EVENT_SRP_VIEWED = "srp_viewed"
        const val MIX_EVENT_SRP_ADD_SUBS_BOTTOM_SHEET_VIEWED = "srp_add_subs_bottom_sheet_viewed"
        const val MIX_EVENT_SRP_VIEW_SUBS_BOTTOM_SHEET_VIEWED = "srp_view_subs_bottom_sheet_viewed"

        //cancel order
        const val MIX_EVENT_ORDER_CANCELLED_CLICKED = "app_order_cancelled"
        const val MIX_EVENT_ORDER_DETAILS_CANCEL_ORDER_CLICKED = "order_detail_cancelled_clicked"
        const val MIX_EVENT_FIRST_CANCEL_PAGE_VIEWED = "first_cancel_page_viewed"
        const val MIX_EVENT_SECOND_CANCEL_PAGE_VIEWED = "second_cancel_page_viewed"
        const val MIX_EVENT_THIRD_CANCEL_PAGE_VIEWED = "third_cancel_sheet_viewed"

        //reminder
        const val MIX_EVENT_REMINDER_POPUP_VIEWED = "reminder_bottomsheet_viewed"
        const val MIX_EVENT_REMINDER_SUCCESSFULLY_SET = "reminder_successfully_Set"
        const val MIX_EVENT_REMINDER_EDIT_CLICKED = "reminder_edit_clicked"
        const val MIX_EVENT_REMINDER_UPDATED = "reminder_updated"
        const val MIX_EVENT_REMINDER_DELETED = "reminder_deleted"

        //order status
        const val MIX_EVENT_ORDER_STATUS_VIEWED = "order_status_viewed"
        //const val MIX_EVENT_ORDER_STATUS_ORDER_DETAILS_VIEWED = "order_status_viewed_order_details"
        const val MIX_EVENT_ORDER_STATUS_ADD_ALTERNATE_CONTACT_CLICKED = "add_alternate_contact_clicked"
        const val MIX_EVENT_ORDER_STATUS_ALTERNATE_CONTACT_SAVED = "alternate_contact_saved"
        const val MIX_EVENT_VIDEO_FLOATER_CLICKED = "video_floater_clicked"
        const val MIX_EVENT_VIDEO_FLOATER_IMPRESSION = "video_floater_impression"

        //video page
        const val MIX_EVENT_VIDEO_PLAYED = "video_played"
        const val MIX_EVENT_VIDEO_CONTINUED = "video_continued"
        const val MIX_EVENT_VIDEO_COMPLETED = "video_completed"
        const val MIX_EVENT_VIDEO_PLAYER_CLOSED = "video_player_closed"
        const val MIX_EVENT_VIDEO_PAUSED = "video_paused"
        const val MIX_EVENT_SUBS_VIDEO_PLAYED = "subs_video_played"

        //quantity stepper
        const val MIX_EVENT_ITEM_ADDED = "item_added"

        //order summary and cart
        const val MIX_EVENT_CALL_PHARMACIST_CLICKED = "call_pharmacist_clicked"
        const val MIX_EVENT_PRESCRIPTION_REMOVED = "prescription_removed"
        const val MIX_EVENT_PRESCRIPTION_UPLOADED = "prescription_uploaded"
        const val MIX_EVENT_ORDER_SUMMARY_VIEWED = "order_summary_viewed"
        const val MIX_EVENT_PATIENT_CHANGED = "Patient_changed"
        const val MIX_EVENT_DOCTOR_CONFIRMATION_CARD_VIEWED = "doctor_confirmation_card_viewed"

        //location bottomsheet
        const val MIX_EVENT_LOCATION_BOTTOMSHEET_OPENED = "location_bottomsheet_opened"
        const val MIX_EVENT_LOCATION_SELECTED = "location_selected"

        //pd page
        const val MIX_EVENT_PDP_VIEWED = "pdp_viewed"
        const val MIX_EVENT_MEDICINE_DETAILS_VIEWED = "pdp_medicine_details_viewed"
        const val MIX_EVENT_PDP_IMAGE_VIEWED = "pdp_image_viewed"
        const val MIX_EVENT_CHANGE_TO_COD_CLICKED = "change_to_cod_clicked"


        //pincode api use case
        const val MIX_EVENT_PINCODE_UNSERVICEABLE = "pincode_not_servicable"

        //refer and earn
        const val MIX_EVENT_REFERRAL_SCREEN_VIEWED = "referral_screen_viewed"

        //account
        const val MIX_EVENT_LOGGED_OUT = "logged_out"

        //psp
        const val MIX_EVENT_PSP_VIEWED = "psp_viewed"
        const val MIX_EVENT_PAYMENT_POPUP_VIEWED = "payment_popup_viewed"
        const val MIX_EVENT_PAYMENT_UNSUCCESSFUL = "payment_unsuccessful"
        const val MIX_EVENT_PAYMENT_FAILED = "payment_failed"
        const val MIX_EVENT_PAYMENT_SUCCESSFUL = "payment_successful"
        const val MIX_EVENT_APP_ORDER_PLACED = "app_order_placed"



        //article
        const val MIX_EVENT_ARTICLE_SECTION_VIEWED = "articles_section_viewed"
        const val MIX_EVENT_ARTICLE_VIEWED = "article_viewed"
        const val MIX_EVENT_ARTICLE_CATEGORY_SECTION_VIEWED = "articles_category_section_viewed"
        const val MIX_EVENT_ARTICLE_SHARED = "article_shared"

        const val MIX_EVENT_PAYMENT_PAGE_VISITED = "payment_page_visited"
        const val MIX_EVENT_PAYMENT_PENDING_VIEWED = "payment_pending_viewed"

        const val MIX_EVENT_ITEM_IMPRESSION = "item_impression"
        const val MIX_EVENT_VIEW_BILL_CLICKED = "view_bill_clicked"
        const val MIX_EVENT_NOTIFICATION_RECEIVED = "notification_received"
        const val MIX_EVENT_NOTIFICATION_CLICKED = "notification_clicked"
        const val MIX_EVENT_URGENCY_TIMER_STARTED = "urgency_timer_started"
        const val MIX_EVENT_URGENCY_STICKY_STRIP_VIEWED = "sticky_strip_viewed"
        const val MIX_EVENT_URGENCY_STICKY_STRIP_CLICKED = "sticky_strip_clicked"
        const val MIX_EVENT_PRODUCT_LIST_PAGE_VIEWED = "product_list_page_viewed"
        const val MIX_EVENT_REORDER_SHEET_VIEWED = "reorder_sheet_viewed"//not use
        const val MIX_EVENT_ITEM_APP_ORDER_PLACED = "item_app_order_placed"
        const val MIX_EVENT_USE_LOCATION_CLICKED = "use_location_clicked"

        //save contact bottomsheet
        const val MIX_EVENT_CONTACT_BOTTOM_SHEET_VIEWED = "tm_contact_bottomsheet_viewed"
        const val MIX_EVENT_CONTACT_SAVED = "tm_contact_saved"
        const val MIX_EVENT_CONTACT_SAVE_CLICKED = "tm_contact_save_clicked"
        const val MIX_EVENT_FILTER_CLICKED = "filter_clicked"

        const val MIX_EVENT_CATEGORY_IMPRESSION = "category_impression"
        const val MIX_EVENT_SUPER_CATEGORY_SECTION_IMPRESSION = "super_category_section_impression"
        const val MIX_EVENT_ERROR_OCCURED = "internal_error_occured"
        const val MIX_EVENT_VIEW_DETAILS_CLICKED = "view_details_clicked"

        //new event added for profile added and edited
        const val MIX_EVENT_PROFILE_DETAILS_ADDED = "profile_details_added"
        const val MIX_EVENT_PROFILE_DETAILS_EDITED = "profile_details_edited"

        @Synchronized
        fun getInstance(ctx: Context?): MixPanelEvent? {
            if (mInstance == null) {
                mInstance = MixPanelEvent(ctx!!)
            }
            return mInstance
        }

    }

   private var mixpanelApi: MixpanelAPI
  //  private var mixpanelAPI: MixpanelAPI? = null

    init {
        mixpanelApi = MixpanelAPI.getInstance(context, BuildConfig.MIX_PANEL_TOKEN, true)
    }

    fun setUserProperty(propertyName: String, propertyValue: Double) {
        mixpanelApi.people.set(propertyName, propertyValue)
    }

    fun customerIdentity(customerId: String) {
        mixpanelApi.identify(customerId)
    }

    fun logMixPanelEvent(
        lowercaseEventProperty: Boolean = true,
        eventName: String,
        ipJsonObject: JSONObject
    ) {
        try {
            var jsonObject = ipJsonObject
            if (!BuildConfig.ENABLE_MIX_PANEL) return

            if (!jsonObject.has("wh_id")
                && SharedPrefManager.getInstance().selectedWarehouseID.isNotBlank()
            ) {
                jsonObject.put("wh_id", SharedPrefManager.getInstance().selectedWarehouseID)
            }

            if (lowercaseEventProperty)
                jsonObject = JSONObject(jsonObject.toString().lowercase(Locale.getDefault()))

            mixpanelApi.track(eventName, jsonObject)
            logD("MixPanelEvent", "sendMixPanelEvent: $eventName: \nOBJ: $jsonObject")
        } catch (_: Exception) {
        }
    }

    fun sendSuperEventToMixpanel() {
        if (!BuildConfig.ENABLE_MIX_PANEL) return

        if (SharedPrefManager.getInstance().loggedInUserAccessToken != null) {
            val mob = SharedPrefManager.getInstance().loggedInUserMobile
            val whId = SharedPrefManager.getInstance().selectedWarehouseID
            val custId = SharedPrefManager.getInstance().loggedInUserId

            val props = JSONObject()
            if (whId != null && !TextUtils.isEmpty(whId)) {
                props.put("wh_id", whId)
            }

            mixpanelApi.identify(custId)
            mixpanelApi.people["mobile_number"] = mob
        }
    }

    //---------------------------------------------------------------------------------------------//

    @Throws(JSONException::class)
    fun sendMixPanelEvent(eventName: String, jsonObject: JSONObject) {
        var jsonObject = jsonObject
        if (!BuildConfig.ENABLE_MIX_PANEL) return
        if (mixpanelApi == null) {
            logD("MixPanelEvent", "sendMixPanelEvent: MixPanelEvent init: NULL")
            return
        }
        if (!jsonObject.has("wh_id") && !SharedPrefManager.getInstance().selectedWarehouseID.equals(
                ""
            )
        ) {
            jsonObject.put("wh_id", SharedPrefManager.getInstance().selectedWarehouseID)
        }

        //used to convert json request into lowercase.
        jsonObject = JSONObject(jsonObject.toString().lowercase(Locale.getDefault()))

        //Api call for mixPanel.
        mixpanelApi.track(eventName, jsonObject)
        logD("MixPanelEvent", "sendMixPanelEvent: $eventName: \nOBJ: $jsonObject")
    }

}