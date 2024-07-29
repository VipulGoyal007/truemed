package com.intellihealth.truemeds.domain.usecase.analytics

import com.intellihealth.truemeds.presentation.analytics.AppsFlyerEvent
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import javax.inject.Inject

class AppsFlyerEventUseCase @Inject constructor(private val appsFlyerEvent: AppsFlyerEvent) {
    fun sendAppOpen() {
        val map: MutableMap<String, Any> = HashMap()
        map["app_open"] = "app_open"
        appsFlyerEvent.logAppsFlyerEvent(AppsFlyerEvent.APPS_FLYER_EVENT_APP_OPEN, map)
    }

    fun sendHomePageViewed(map: Map<String, Any>) {
        if (SharedPrefManager.getInstance().loggedInUserId != null) {
            appsFlyerEvent.setCustomerIdAndLogSession()
        }

        appsFlyerEvent.logAppsFlyerEvent(
            AppsFlyerEvent.APPS_FLYER_EVENT_HOMEPAGE_VIEWED,
            map
        )
    }

    fun sendSubsLearnMore() {
        val map: MutableMap<String, Any> = HashMap()
        appsFlyerEvent.logAppsFlyerEvent(

            AppsFlyerEvent.APPS_FLYER_EVENT_HOMEPAGE_SUBS_LEARN_MORE,
            map
        )
    }

    fun sendReferAFriendClicked() {
        val map: MutableMap<String, Any> = HashMap()
        appsFlyerEvent.logAppsFlyerEvent(

            AppsFlyerEvent.APPS_FLYER_EVENT_REFER_A_FRIEND_CLICKED,
            map
        )
    }

    fun sendLoginPageViewed(map: Map<String, Any>) {
        appsFlyerEvent.logAppsFlyerEvent(
            AppsFlyerEvent.APPS_FLYER_EVENT_LOGIN_PAGE_VIEWED,
            map
        )
    }

    fun sendItemSearched(map: Map<String, Any>) {
        appsFlyerEvent.logAppsFlyerEvent(

            AppsFlyerEvent.APPS_FLYER_EVENT_ITEM_SEARCHED,
            map
        )
    }

    fun sendItemAdded(map: Map<String, Any>) {
        appsFlyerEvent.logAppsFlyerEvent(
            AppsFlyerEvent.APPS_FLYER_EVENT_ITEM_ADDED, map
        )
    }

    fun sendSubsItemAdded(map: Map<String, Any>) {
        appsFlyerEvent.logAppsFlyerEvent(
            AppsFlyerEvent.APPS_FLYER_EVENT_SUBS_ITEM_ADDED,
            map
        )
    }

    fun sendSearchViewed(map: Map<String, Any>) {
        appsFlyerEvent.logAppsFlyerEvent(
            AppsFlyerEvent.APPS_FLYER_EVENT_SEARCH_VIEWED,
            map
        )
    }

    fun sendLoginSuccessful(map: Map<String, Any>) {
        appsFlyerEvent.logAppsFlyerEvent(
            AppsFlyerEvent.APPS_FLYER_EVENT_LOGIN_SUCCESSFUL,
            map
        )
    }

    fun sendSignupSuccessful(map: Map<String, Any>) {
        appsFlyerEvent.logAppsFlyerEvent(
            AppsFlyerEvent.APPS_FLYER_EVENT_SIGNUP_SUCCESSFUL,
            map
        )
    }

    fun sendCartViewed(map: Map<String, Any>) {
        appsFlyerEvent.logAppsFlyerEvent(
            AppsFlyerEvent.APPS_FLYER_EVENT_CART_VIEWED,
            map
        )
    }

    fun sendUserDetailsAddressAdded(map: Map<String, Any>) {
        appsFlyerEvent.logAppsFlyerEvent(
            AppsFlyerEvent.APPS_FLYER_EVENT_USER_DETAILS_ADD_ADDRESS,
            map
        )
    }

    fun sendUserDetailsAddPatient(map: Map<String, Any>) {
        appsFlyerEvent.logAppsFlyerEvent(
            AppsFlyerEvent.APPS_FLYER_EVENT_USER_DETAILS_ADD_PATIENT,
            map
        )
    }

    fun sendSRPViewed(map: Map<String, Any>) {
        appsFlyerEvent.logAppsFlyerEvent(
            AppsFlyerEvent.APPS_FLYER_EVENT_SRP_VIEWED, map
        )
    }

    fun sendPDPViewed(map: Map<String, Any>) {
        appsFlyerEvent.logAppsFlyerEvent(
            AppsFlyerEvent.APPS_FLYER_EVENT_PDP_VIEWED,
            map
        )
    }

    fun sendOrderSummaryViewed(map: Map<String, Any>) {
        appsFlyerEvent.logAppsFlyerEvent(
            AppsFlyerEvent.APPS_FLYER_EVENT_ORDER_SUMMARY_VIEWED,
            map
        )
    }

    fun sendAppOrderPlaced(map: Map<String, Any>) {
        appsFlyerEvent.logAppsFlyerEvent(
            AppsFlyerEvent.APPS_FLYER_EVENT_APP_ORDER_PLACED,
            map
        )
    }

    fun sendAppCancelOrder(map: Map<String, Any>) {
        appsFlyerEvent.logAppsFlyerEvent(
            AppsFlyerEvent.APPS_FLYER_EVENT_CANCEL_ORDER,
            map
        )
    }

    fun sendChronicItemAdded(map: Map<String, Any>) {
        appsFlyerEvent.logAppsFlyerEvent(
            AppsFlyerEvent.APPS_FLYER_EVENT_CHRONIC_ITEM_ADDED,
            map
        )
    }
}