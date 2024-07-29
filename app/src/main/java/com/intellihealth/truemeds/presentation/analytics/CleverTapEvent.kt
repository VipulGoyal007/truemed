package com.intellihealth.truemeds.presentation.analytics

import android.app.NotificationManager
import android.content.Context
import android.util.Log
import com.clevertap.android.pushtemplates.PushTemplateNotificationHandler
import com.clevertap.android.sdk.CleverTapAPI
import com.clevertap.android.sdk.interfaces.NotificationHandler
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.logD
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class   CleverTapEvent @Inject constructor(@ApplicationContext context: Context) {
    private lateinit var cleverTapApi: CleverTapAPI

    companion object {
        //single params
        const val CLEVER_TAP_EVENT_LOGIN_SUCCESSFUL = "login_successful"

        const val CLEVER_TAP_EVENT_LOGGED_OUT = "logged_out"//not in use

        //single params
        const val CLEVER_TAP_EVENT_SEARCH_VIEWED = "search_viewed"

        const val CLEVER_TAP_EVENT_ITEM_SEARCHED = "item_searched"
        //no parameter
        const val CLEVER_TAP_EVENT_SRP_VIEWED = "srp_viewed"

        const val CLEVER_TAP_EVENT_ITEM_ADDED = "item_added"
        const val CLEVER_TAP_EVENT_PDP_VIEWED = "pdp_viewed"
        const val CLEVER_TAP_EVENT_CART_VIEWED = "cart_viewed"

        const val CLEVER_TAP_EVENT_APP_ORDER_PLACED = "app_order_placed"
        const val CLEVER_TAP_EVENT_ORDER_STATUS_VIEWED = "order_status_viewed"
        const val CLEVER_TAP_EVENT_ORDER_CANCELLED = "app_order_cancelled"
        const val CLEVER_TAP_EVENT_REORDER_CLICKED = "reorder_button_clicked"
        //patient added event triggered to cleverTap
        const val CLEVER_TAP_EVENT_PATIENT_ADDED = "patient_added"
    }

    init {
        try {
            /*CleverTapAPI.changeXiaomiCredentials(
                context.resources.getString(R.string.xiaomi_app_id),
                context.resources.getString(R.string.xiaomi_app_key)
            )*/
            //if (BuildConfig.DEBUG)
                CleverTapAPI.setDebugLevel(CleverTapAPI.LogLevel.VERBOSE)

            CleverTapAPI.createNotificationChannel(
                context, "tm_notification", "Truemeds",
                "Truemeds", NotificationManager.IMPORTANCE_HIGH, true
            )
            CleverTapAPI.setNotificationHandler(PushTemplateNotificationHandler() as NotificationHandler)
            //CleverTapAPI.enableXiaomiPushOn(PushConstants.XIAOMI_MIUI_DEVICES)
            cleverTapApi = CleverTapAPI.getDefaultInstance(context)!!
        } catch (_: Exception) {
        }
    }

    fun pushFcmRegistrationId(fcmId: String, register: Boolean) {
        cleverTapApi.pushFcmRegistrationId(fcmId, register)
    }

    /*fun pushXiaomiRegistrationId(xiaomiToken: String, xiaomiRegion: String, register: Boolean) {
        cleverTapApi.pushXiaomiRegistrationId(xiaomiToken, xiaomiRegion, register)
    }*/
    fun pushEvent(eventName:String,hashMap: Map<String, Any>){
        logD("CleverTapEvent", "sendCleverTapEvent: $eventName: \nOBJ: $hashMap")
        cleverTapApi.pushEvent(eventName,hashMap)
    }

    fun onUserLoginCleverTap() {
        try {
            if (SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty()) {
                val profileUpdate = HashMap<String, Any>()
                profileUpdate["Name"] = SharedPrefManager.getInstance().getLoggedInUserName()
                profileUpdate["Identity"] = SharedPrefManager.getInstance().loggedInUserId
                profileUpdate["Email"] = SharedPrefManager.getInstance().getLoggedInUserEmail()
                // Phone (with the country code, starting with +)
                profileUpdate["Phone"] ="+91" + SharedPrefManager.getInstance().loggedInUserMobile
                // Can be either M or F
                if (!SharedPrefManager.getInstance().currentUserGender.equals(""))
                    profileUpdate["Gender"] = SharedPrefManager.getInstance().getCurrentUserGender()

                // optional fields. controls whether the user will be sent email, push etc.
                profileUpdate["MSG-email"] = true // Disable email notifications
                profileUpdate["MSG-push"] = true // Enable push notifications
                profileUpdate["MSG-sms"] = true // Disable SMS notifications
                profileUpdate["MSG-whatsapp"] = true // Enable WhatsApp notifications
                cleverTapApi.onUserLogin(profileUpdate)
                //Log.d("CleverTap", "onUserLogin")
            }
        } catch (_:Exception) {
        }
    }

    /*-------------------------------------- Events ------------------------------------------------*/
    /**
     * cleverTapApi.pushProfile should not get called after cleverTapApi.onUserLogin
     */

    fun pushProfileCleverTap() {
        try {
            if (SharedPrefManager.getInstance().loggedInUserAccessToken != null) {
                val profileUpdate = java.util.HashMap<String, Any>()
                profileUpdate["Name"] = SharedPrefManager.getInstance().getLoggedInUserName()
                profileUpdate["Identity"] =SharedPrefManager.getInstance().loggedInUserId
                profileUpdate["Email"] = SharedPrefManager.getInstance().getLoggedInUserEmail()
                // Phone (with the country code, starting with +)
                profileUpdate["Phone"] ="+91" + SharedPrefManager.getInstance().loggedInUserMobile
                // Phone (with the country code, starting with +)
                profileUpdate["ct_mobile"] = "91" + SharedPrefManager.getInstance().loggedInUserMobile
                // Can be either M or F
                if (!SharedPrefManager.getInstance().currentUserGender.equals(""))
                    profileUpdate["Gender"] = SharedPrefManager.getInstance().currentUserGender

                // optional fields. controls whether the user will be sent email, push etc.
                profileUpdate["MSG-email"] = true // Disable email notifications
                profileUpdate["MSG-push"] = true // Enable push notifications
                profileUpdate["MSG-sms"] = true // Disable SMS notifications
                profileUpdate["MSG-whatsapp"] = true // Enable WhatsApp notifications
                cleverTapApi.pushProfile(profileUpdate)
                //Log.d("CleverTap", "pushProfile")
            }
        } catch (_: Exception) {
        }
    }
}