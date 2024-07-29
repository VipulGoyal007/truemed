package com.intellihealth.truemeds.presentation.analytics

import android.content.Context
import android.util.Log
import com.appsflyer.AppsFlyerLib
import com.appsflyer.attribution.AppsFlyerRequestListener
import com.google.gson.Gson
import com.intellihealth.truemeds.BuildConfig
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.logD
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject


class AppsFlyerEvent @Inject constructor(@ApplicationContext private val context: Context) {
    private val LOG_TAG = "AppsFlyerEvent"

    companion object AppsFlyerEvent {
        const val APPS_FLYER_EVENT_APP_OPEN = "Open"
        const val APPS_FLYER_EVENT_HOMEPAGE_VIEWED = "homepage_viewed"
        const val APPS_FLYER_EVENT_HOMEPAGE_SUBS_LEARN_MORE = "subs_learn_more_clicked"
        //const val APPS_FLYER_EVENT_REORDER_BUTTON_CLICKED = "reorder_button_clicked"
        const val APPS_FLYER_EVENT_REFER_A_FRIEND_CLICKED = "refer_a_friend_clicked"
        const val APPS_FLYER_EVENT_LOGIN_SUCCESSFUL = "login_successful"
        const val APPS_FLYER_EVENT_SIGNUP_SUCCESSFUL = "signup_successful"
        const val APPS_FLYER_EVENT_USER_DETAILS_ADD_ADDRESS = "address_added"
        const val APPS_FLYER_EVENT_USER_DETAILS_ADD_PATIENT = "patient_added"
        const val APPS_FLYER_EVENT_SEARCH_VIEWED = "search_viewed"
        const val APPS_FLYER_EVENT_ITEM_SEARCHED = "item_searched"
        const val APPS_FLYER_EVENT_ITEM_ADDED = "item_added"
        const val APPS_FLYER_EVENT_SUBS_ITEM_ADDED = "subs_item_added"
        const val APPS_FLYER_EVENT_SRP_VIEWED = "srp_viewed"
        const val APPS_FLYER_EVENT_CANCEL_ORDER = "app_order_cancelled"
        const val APPS_FLYER_EVENT_LOGIN_PAGE_VIEWED = "login_page_viewed"
        const val APPS_FLYER_EVENT_PDP_VIEWED = "pdp_viewed"
        const val APPS_FLYER_EVENT_CART_VIEWED = "cart_viewed"
        const val APPS_FLYER_EVENT_ORDER_SUMMARY_VIEWED = "order_summary_viewed"
        const val APPS_FLYER_EVENT_APP_ORDER_PLACED = "app_order_placed"
        const val APPS_FLYER_EVENT_CHRONIC_ITEM_ADDED = "chronic_item_added"

        fun convertJsonToHashmap(jsonObj: String?): Map<String, Any> {
            var hashMap: Map<String, Any> = HashMap()
            try {
                hashMap = Gson().fromJson<Map<String, Any>>(jsonObj, MutableMap::class.java)
            } catch (ex: java.lang.Exception) {
            }
            return hashMap
        }
    }

    init {
        try {
            val appsFlyerToken = BuildConfig.APPS_FLYER_TOKEN
            AppsFlyerLib.getInstance().setDebugLog(BuildConfig.FLAVOR != "prod")
            AppsFlyerLib.getInstance().init(appsFlyerToken, null, context)
            AppsFlyerLib.getInstance().sdkVersion
            AppsFlyerLib.getInstance().getAppsFlyerUID(context)
            AppsFlyerLib.getInstance().waitForCustomerUserId(false)
            AppsFlyerLib.getInstance().start(context)
        } catch (_: Exception) {
        }
    }

    fun setCustomerIdAndLogSession() {
        try {
            AppsFlyerLib.getInstance().setCustomerIdAndLogSession(
                SharedPrefManager.getInstance().loggedInUserId.toString(),
                context
            )
            AppsFlyerLib.getInstance().waitForCustomerUserId(false)
        } catch (_: Exception) {
        }
    }

    fun logAppsFlyerEvent(eventName: String, map: Map<String, Any>) {
        try {
           /* val filteredMap: Map<String, Any> =
                map.let { _map ->
                    _map.filterValues { _v -> _v != "" && _v != 0 && _v != 0.0 }
                }

            AppsFlyerLib.getInstance().logEvent(
                context, eventName, map, CustomAppsFlyerRequestListener(eventName, filteredMap)
            )*/



            val filteredMap =
                map.filterValues { it != "" && it != 0 && it != 0.0 }
            AppsFlyerLib.getInstance().logEvent(
                context,
                eventName,
                filteredMap,
                CustomAppsFlyerRequestListener(
                    eventName, filteredMap
                )
            )
            logD("AppsFlyerEvent", "sendAppsFlyerEvent: $eventName: \nOBJ: $map")
        } catch (_: Exception) {
        }
    }

    private inner class CustomAppsFlyerRequestListener(
        private val eventName: String,
        private val map: Map<String, Any>
    ) : AppsFlyerRequestListener {
        override fun onSuccess() {
           // Log.d(LOG_TAG, "AppsFlyer Event $eventName sent successfully")
          //  Log.d(LOG_TAG, "Properties $map sent successfully")
            logD(LOG_TAG,"AppsFlyer Event $eventName sent successfully")
            logD(LOG_TAG,"Properties $map sent successfully")
        }

        override fun onError(i: Int, s: String) {
           // Log.d(LOG_TAG, """Event $eventName failed to be sent:Error code: $i Error description: $s""")
            logD(LOG_TAG,"""Event $eventName failed to be sent:Error code: $i Error description: $s""")
        }
    }


}