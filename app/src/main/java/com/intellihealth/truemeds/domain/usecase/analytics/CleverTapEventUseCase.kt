package com.intellihealth.truemeds.domain.usecase.analytics

import android.util.Log
import com.google.gson.Gson
import com.intellihealth.truemeds.data.model.clevertap.CtAppOrderCancelled
import com.intellihealth.truemeds.data.model.clevertap.CtAppOrderPlaced
import com.intellihealth.truemeds.data.model.clevertap.CtCartViewed
import com.intellihealth.truemeds.data.model.clevertap.CtItemAdded
import com.intellihealth.truemeds.data.model.clevertap.CtItemSearched
import com.intellihealth.truemeds.data.model.clevertap.CtOrderStatusViewed
import com.intellihealth.truemeds.data.model.clevertap.CtPdpViewed
import com.intellihealth.truemeds.data.model.clevertap.CtReorderClicked
import com.intellihealth.truemeds.data.model.mixpanel.MxSrpViewed
import com.intellihealth.truemeds.presentation.analytics.CleverTapEvent
import com.intellihealth.truemeds.presentation.analytics.MixPanelEvent
import com.intellihealth.truemeds.presentation.analytics.model.clevertap.CtPatientAdded
import com.intellihealth.truemeds.presentation.analytics.model.clevertap.CtSrpViewed
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxProfileDetailsAdded
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxProfileDetailsEdited
import org.json.JSONObject
import javax.inject.Inject


class CleverTapEventUseCase @Inject constructor(private val cleverTapEvent: CleverTapEvent) {


    fun sendLoginSuccessFullEventToClevertap(isNewUser: Boolean) {
        val hashMap = HashMap<String, Any>()
        hashMap["is_new_user"] = isNewUser
        cleverTapEvent.pushEvent(CleverTapEvent.CLEVER_TAP_EVENT_LOGIN_SUCCESSFUL, hashMap)
    }

    fun sendLoggedOutEventToClevertap(customerId: Int) {
        val hashMap = HashMap<String, Any>()
        hashMap["customer_id"] = customerId.toString()
        cleverTapEvent.pushEvent(CleverTapEvent.CLEVER_TAP_EVENT_LOGGED_OUT, hashMap)
    }

    fun sendSearchViewedEventToClevertap(clickedOnPage: String) {
        val hashMap = HashMap<String, Any>()
        hashMap["clicked_on_page"] = clickedOnPage
        cleverTapEvent.pushEvent(CleverTapEvent.CLEVER_TAP_EVENT_SEARCH_VIEWED, hashMap)
    }

    fun sendItemSearchedEventToClevertap(ctItemSearched: CtItemSearched) {
        cleverTapEvent.pushEvent(
            CleverTapEvent.CLEVER_TAP_EVENT_ITEM_SEARCHED,
            toHashMap(ctItemSearched)
        )
    }

    fun sendSRPViewedEventToClevertap(ctSrpViewed: CtSrpViewed) {
        cleverTapEvent.pushEvent(CleverTapEvent.CLEVER_TAP_EVENT_SRP_VIEWED, toHashMap(ctSrpViewed))
    }

    fun sendItemAddedEventToClevertap(ctItemAdded: CtItemAdded) {
        cleverTapEvent.pushEvent(CleverTapEvent.CLEVER_TAP_EVENT_ITEM_ADDED, toHashMap(ctItemAdded))
    }

    fun sendPdpViewedEventToCleverTap(ctPdpViewed: CtPdpViewed) {
        cleverTapEvent.pushEvent(CleverTapEvent.CLEVER_TAP_EVENT_PDP_VIEWED, toHashMap(ctPdpViewed))
    }

    fun sendCartViewedEventToCleverTap(ctCartViewed: CtCartViewed) {
        cleverTapEvent.pushEvent(
            CleverTapEvent.CLEVER_TAP_EVENT_CART_VIEWED,
            toHashMap(ctCartViewed)
        )
    }

    fun sendAppOrderPlacedEventToCleverTap(ctAppOrderPlaced: CtAppOrderPlaced) {
        Log.d("TAG", "sendAppOrderPlacedEventToCleverTap: $ctAppOrderPlaced")
        Log.d("TAG", "sendAppOrderPlacedEventToCleverTap: toHashMap ${toHashMap(ctAppOrderPlaced)}")
        cleverTapEvent.pushEvent(
            CleverTapEvent.CLEVER_TAP_EVENT_APP_ORDER_PLACED,
            toHashMap(ctAppOrderPlaced)
        )

    }

    fun sendOrderStatusViewedEventToCleverTap(ctOrderStatusViewed: CtOrderStatusViewed) {
        cleverTapEvent.pushEvent(
            CleverTapEvent.CLEVER_TAP_EVENT_ORDER_STATUS_VIEWED,
            toHashMap(ctOrderStatusViewed)
        )
    }

    fun sendOrderCancelledEventToCleverTap(ctOrderCancelled: CtAppOrderCancelled) {
        cleverTapEvent.pushEvent(
            CleverTapEvent.CLEVER_TAP_EVENT_ORDER_CANCELLED,
            toHashMap(ctOrderCancelled)
        )
    }

    fun sendReorderClickedEventToCleverTap(ctReorderClicked: CtReorderClicked) {
        cleverTapEvent.pushEvent(
            CleverTapEvent.CLEVER_TAP_EVENT_REORDER_CLICKED,
            toHashMap(ctReorderClicked)
        )
    }


    fun pushFcmRegistrationId(fcmId: String, register: Boolean) {
        cleverTapEvent.pushFcmRegistrationId(fcmId, register)
    }

    /*fun pushXiaomiRegistrationId(xiaomiToken: String, xiaomiRegion: String, register: Boolean) {
        cleverTapEvent.pushXiaomiRegistrationId(xiaomiToken, xiaomiRegion, register)
    }*/

    fun toHashMap(obj: Any): Map<String, Any> {
        var hashMap: Map<String, Any> = HashMap()
        try {
            hashMap = Gson().fromJson<Map<String, Any>>(Gson().toJson(obj), MutableMap::class.java)
        } catch (ex: java.lang.Exception) {
        }
        return hashMap
    }

    fun pushProfileCleverTap() {
        cleverTapEvent.pushProfileCleverTap()
    }

    fun onUserLoginCleverTap() {
        cleverTapEvent.onUserLoginCleverTap()
    }

    fun sendPatientAddedEventToCleverTap(ctPatientAdded: CtPatientAdded) {
        cleverTapEvent.pushEvent(
            CleverTapEvent.CLEVER_TAP_EVENT_PATIENT_ADDED,
            toHashMap(ctPatientAdded)
        )
    }

}