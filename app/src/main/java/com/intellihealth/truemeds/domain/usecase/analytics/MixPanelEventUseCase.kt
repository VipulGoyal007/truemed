package com.intellihealth.truemeds.domain.usecase.analytics

import com.google.gson.Gson
import com.intellihealth.truemeds.data.model.mixpanel.MxAddressAdded
import com.intellihealth.truemeds.data.model.mixpanel.MxAddressEdited
import com.intellihealth.truemeds.data.model.mixpanel.MxAlternateContactSaved
import com.intellihealth.truemeds.data.model.mixpanel.MxAppOpen
import com.intellihealth.truemeds.data.model.mixpanel.MxAppOrderCancelled
import com.intellihealth.truemeds.data.model.mixpanel.MxApplyCouponClick
import com.intellihealth.truemeds.data.model.mixpanel.MxArticleViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxCartViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxChangeToCodClicked
import com.intellihealth.truemeds.data.model.mixpanel.MxCouponListOpened
import com.intellihealth.truemeds.data.model.mixpanel.MxCouponRemoved
import com.intellihealth.truemeds.data.model.mixpanel.MxExperimentStarted
import com.intellihealth.truemeds.data.model.mixpanel.MxHomePageBannerClick
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.mixpanel.MxItemSearched
import com.intellihealth.truemeds.data.model.mixpanel.MxLoginPageViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxOfferSheetViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxOneClickSubstitutionPopupViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxOrderStatusViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxOtpClicked
import com.intellihealth.truemeds.data.model.mixpanel.MxPaymentPendingViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxPrescriptionUploadPageViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxProductListPageViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxReferralScreenViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxReminderBottomSheetViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxReminderDeleted
import com.intellihealth.truemeds.data.model.mixpanel.MxReminderSuccessfullySet
import com.intellihealth.truemeds.data.model.mixpanel.MxReminderUpdate
import com.intellihealth.truemeds.data.model.mixpanel.MxSearchViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxSrpAddSubBottomSheetViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxSrpViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxStickyStripViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxSubstituteReplaceClicked
import com.intellihealth.truemeds.data.model.mixpanel.MxSwitchBackClicked
import com.intellihealth.truemeds.data.model.mixpanel.MxUploadPrescriptionClicked
import com.intellihealth.truemeds.data.model.mixpanel.MxUrgencyTimerStarted
import com.intellihealth.truemeds.data.model.mixpanel.MxVideoFloaterClicked
import com.intellihealth.truemeds.data.model.mixpanel.MxVideoPlayed
import com.intellihealth.truemeds.data.model.mixpanel.MxViewBillClicked
import com.intellihealth.truemeds.mvvm.data.mixpanel.MXFilterClicked
import com.intellihealth.truemeds.mvvm.data.mixpanel.MxCouponApplied
import com.intellihealth.truemeds.presentation.analytics.MixPanelEvent
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MXPatientDetailsEditedImpression
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MXSuperCategorySectionImpression
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxAddAddressClicked
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxAppOrderPlaced
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxArticleShared
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxArticlesCategorySectionViewed
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxBannerClicked
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxCategoryImpression
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxCommonProperty
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxHomePageBannerImpression
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxHomePageViewed
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemAdded
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemAppOrderPlaced
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemImpression
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxLocationSelected
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxLoginSuccess
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxNotificationClicked
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxOrderSummaryViewed
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxOtcProductListPageViewed
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxOtpTyped
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPatientAdded
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPaymentPageVisited
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPaymentPopupViewed
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPaymentSuccessAndFailed
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPdpImageViewed
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPdpMedicineDetailsViewed
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPdpViewed
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxProfileDetailsAdded
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxProfileDetailsEdited
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPspViewed
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxReorderSheetViewed
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxSearchSuggestionImpression
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxUseLocationClicked
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxVideoContinued
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxVideoPaused
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxViewDetailsClicked
import com.intellihealth.truemeds.presentation.utils.applyTryCatch
import org.json.JSONObject
import javax.inject.Inject

class MixPanelEventUseCase @Inject constructor(private val mixPanelEvent: MixPanelEvent) {

    fun sendExperimentStartedEvent(mxExperimentStarted: MxExperimentStarted) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_EXPERIMENT_STARTED,
            ipJsonObject = JSONObject(Gson().toJson(mxExperimentStarted))
        )
    }

    fun customerIdentity(customerId: String) {
        mixPanelEvent.customerIdentity(customerId)
    }

    fun sendLoginSkippedEvent(clickedOnPage: String) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_LOGIN_SKIPPED,
            ipJsonObject = JSONObject().put("clicked_on_page", clickedOnPage)
        )
    }

    fun sendLoginSuccessfulEvent(mxLoginSuccess: MxLoginSuccess) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_LOG_IN_SUCCESS,
            ipJsonObject = JSONObject(Gson().toJson(mxLoginSuccess))
        )
    }

    fun sendSignUpSuccessfulEvent(mxLoginSuccess: MxLoginSuccess) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_SIGNUP_SUCCESSFUL,
            ipJsonObject = JSONObject(Gson().toJson(mxLoginSuccess))
        )
    }

    /**
     * This method will initiate all SDK events for mobile number
     */
    fun sendLoginPageViewed(mxLoginPageViewed: MxLoginPageViewed) {

        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_LOGIN_PAGE_VIEWED,
            ipJsonObject = JSONObject(Gson().toJson(mxLoginPageViewed))
        )
    }


    fun sendOtpTypedEvent(mxOtpTyped: MxOtpTyped) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_OTP_TYPED,
            ipJsonObject = JSONObject(Gson().toJson(mxOtpTyped))
        )
    }

    fun sendOtpClickedEvent(mxOtpClicked: MxOtpClicked) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_OTP_CLICKED,
            ipJsonObject = JSONObject(Gson().toJson(mxOtpClicked))
        )
    }

    fun sendHomePageViewedEvent(mxHomePageViewed: MxHomePageViewed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_HOMEPAGE_VIEWED,
            ipJsonObject = JSONObject(Gson().toJson(mxHomePageViewed))
        )
    }

    fun sendHomePageBannerImpressionEvent(mxHomePageBannerImpression: MxHomePageBannerImpression) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_HOMEPAGE_BANNER_IMPRESSION,
            ipJsonObject = JSONObject(Gson().toJson(mxHomePageBannerImpression))
        )
    }

    fun sendHomePageBannerClickedEvent(mxHomePageBannerClick: MxHomePageBannerClick) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_HOMEPAGE_BANNER_CLICKED,
            ipJsonObject = JSONObject(Gson().toJson(mxHomePageBannerClick))
        )
    }

    fun sendBannerClicked(mxBannerClicked: MxBannerClicked) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_BANNER_CLICKED,
            ipJsonObject = JSONObject(Gson().toJson(mxBannerClicked))
        )
    }

    fun sendHomePageSkinnyBannerImpressionEvent() {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_HOMEPAGE_SKINNY_BANNER_IMPRESSION,
            ipJsonObject = JSONObject()
        )
    }

    fun sendAddressAddedEvent(mxAddressAdded: MxAddressAdded) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_ADDRESS_ADDED,
            ipJsonObject = JSONObject(Gson().toJson(mxAddressAdded))
        )
    }

    fun sendDeliveryDetailViewedEvent() {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_DELIVERY_DETAILS_VIEWED,
            ipJsonObject = JSONObject()
        )
    }

    fun sendPatientAddedEvent(mxPatientAdded: MxPatientAdded) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_PATIENT_ADDED,
            ipJsonObject = JSONObject(Gson().toJson(mxPatientAdded))
        )
    }

    fun sendAddAddressClickedEvent(mxAddAddressClicked: MxAddAddressClicked) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_ADD_ADDRESS_CLICKED,
            ipJsonObject = JSONObject(Gson().toJson(mxAddAddressClicked))
        )
    }

    fun sendAddPatientClickedEvent(clickedPage: String) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_ADD_PATIENT_CLICKED,
            ipJsonObject = JSONObject().put("clicked_on_page", clickedPage)
        )
    }

    fun sendPrescriptionClickedEvent(mxUploadPrescriptionClicked: MxUploadPrescriptionClicked) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_PRESCRIPTION_CLICKED,
            ipJsonObject = JSONObject(Gson().toJson(mxUploadPrescriptionClicked))
        )
    }

    fun sendPrescriptionUploadPageViewEvent(mxPrescriptionUploadPageViewed: MxPrescriptionUploadPageViewed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_PRESCRIPTION_UPLOAD_PAGE_VIEWED,
            ipJsonObject = JSONObject(Gson().toJson(mxPrescriptionUploadPageViewed))
        )
    }

    fun sendCartViewedEvent(mxCartViewed: MxCartViewed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_CART_VIEWED,
            ipJsonObject = JSONObject(Gson().toJson(mxCartViewed))
        )
    }

    fun sendApplyCouponClickedEvent(mxApplyCouponClick: MxApplyCouponClick) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_APPLY_COUPON_CLICKED,
            ipJsonObject = JSONObject(Gson().toJson(mxApplyCouponClick))
        )
    }

    fun sendSubsVideoPlayedEvent(mxCommonProperty: MxCommonProperty, source: String) {
        if (source == "home_page") {
            try {
                val props = JSONObject()
                props.put("clicked_on_page", "home_page")
                props.put("page_section", "main")
                mixPanelEvent.logMixPanelEvent(
                    eventName = MixPanelEvent.MIX_EVENT_SUBS_VIDEO_PLAYED,
                    ipJsonObject = props
                )
            } catch (ex: Exception) {
            
            }
        } else {
            mixPanelEvent.logMixPanelEvent(
                eventName = MixPanelEvent.MIX_EVENT_SUBS_VIDEO_PLAYED,
                ipJsonObject = JSONObject(Gson().toJson(mxCommonProperty))
            )
        }
    }

    fun sendItemAddedEvent(/*product: ElasticItem,*/ baseItemAdded: MxItemAdded) {
        //product.let {
        var mpItemAdded = baseItemAdded
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_ITEM_ADDED,
            ipJsonObject = JSONObject(Gson().toJson(mpItemAdded))
        )

        //}

    }

    fun sendSearchViewedEvent(mxSearchViewed: MxSearchViewed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_SEARCH_VIEWED,
            ipJsonObject = JSONObject(Gson().toJson(mxSearchViewed))
        )
    }

    fun sendItemSearchedEvent(mxItemSearched: MxItemSearched) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_ITEM_SEARCHED,
            ipJsonObject = JSONObject(Gson().toJson(mxItemSearched))
        )
    }

    fun sendCallPharmacistClickedEvent() {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_CALL_PHARMACIST_CLICKED,
            ipJsonObject = JSONObject()
        )
    }

    fun sendSrpViewedEvent(mxSrpViewed: MxSrpViewed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_SRP_VIEWED,
            ipJsonObject = JSONObject(Gson().toJson(mxSrpViewed))
        )
    }

    fun sendSrpAddSubsBottomSheetViewedEvent(mxSrpAddSubBottomSheetViewed: MxSrpAddSubBottomSheetViewed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_SRP_ADD_SUBS_BOTTOM_SHEET_VIEWED,
            ipJsonObject = JSONObject(Gson().toJson(mxSrpAddSubBottomSheetViewed))
        )
    }

    fun sendSrpViewSubsBottomSheetViewedEvent(mxSrpAddSubBottomSheetViewed: MxSrpAddSubBottomSheetViewed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_SRP_VIEW_SUBS_BOTTOM_SHEET_VIEWED,
            ipJsonObject = JSONObject(Gson().toJson(mxSrpAddSubBottomSheetViewed))
        )
    }

    fun sendOrderCancelledClickEvent(mxAppOrderCancelled: MxAppOrderCancelled) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_ORDER_CANCELLED_CLICKED,
            ipJsonObject = JSONObject(Gson().toJson(mxAppOrderCancelled))
        )
    }

    fun sendReminderBottomSheetViewedEvent(mxReminderBottomSheetViewed: MxReminderBottomSheetViewed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_REMINDER_POPUP_VIEWED,
            ipJsonObject = JSONObject(Gson().toJson(mxReminderBottomSheetViewed))
        )
    }

    fun sendReminderSuccessfullySetEvent(mxReminderSuccessfullySet: MxReminderSuccessfullySet) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_REMINDER_SUCCESSFULLY_SET,
            ipJsonObject = JSONObject(Gson().toJson(mxReminderSuccessfullySet))
        )
    }

    fun sendReminderEditClickedEvent(mxReminderSuccessfullySet: MxReminderSuccessfullySet) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_REMINDER_EDIT_CLICKED,
            ipJsonObject = JSONObject(Gson().toJson(mxReminderSuccessfullySet))
        )
    }

    fun sendReminderUpdatedClickedEvent(mxReminderUpdate: MxReminderUpdate) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_REMINDER_UPDATED,
            ipJsonObject = JSONObject(Gson().toJson(mxReminderUpdate))
        )
    }

    fun sendReminderDeletedEvent(mxReminderDeleted: MxReminderDeleted) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_REMINDER_DELETED,
            ipJsonObject = JSONObject(Gson().toJson(mxReminderDeleted))
        )
    }

    fun sendOrderDetailsCancelOrderEvent(mxAppOrderCancelled: MxAppOrderCancelled) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_ORDER_DETAILS_CANCEL_ORDER_CLICKED,
            ipJsonObject = JSONObject(Gson().toJson(mxAppOrderCancelled))
        )
    }

    fun sendFirstCancelPageViewedEvent(mxAppOrderCancelled: MxAppOrderCancelled) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_FIRST_CANCEL_PAGE_VIEWED,
            ipJsonObject = JSONObject(Gson().toJson(mxAppOrderCancelled))
        )
    }

    fun sendSecondCancelPageViewedEvent(mxAppOrderCancelled: MxAppOrderCancelled) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_SECOND_CANCEL_PAGE_VIEWED,
            ipJsonObject = JSONObject(Gson().toJson(mxAppOrderCancelled))
        )
    }

    fun sendThirdCancelPageViewedEvent(mxAppOrderCancelled: MxAppOrderCancelled) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_THIRD_CANCEL_PAGE_VIEWED,
            ipJsonObject = JSONObject(Gson().toJson(mxAppOrderCancelled))
        )
    }

    fun sendPrescriptionRemovedEvent(clickedPage: String) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_PRESCRIPTION_REMOVED,
            ipJsonObject = JSONObject().put("clicked_on_page", clickedPage)
        )
    }

    fun sendPrescriptionUploadedEvent() {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_PRESCRIPTION_UPLOADED,
            ipJsonObject = JSONObject()
        )
    }

    fun sendAppOpenEvent(mxAppOpen: MxAppOpen) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_APP_OPENED,
            ipJsonObject = JSONObject(Gson().toJson(mxAppOpen))
        )
    }

    fun sendLocationBottomSheetViewedEvent() {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_LOCATION_BOTTOMSHEET_OPENED,
            ipJsonObject = JSONObject()
        )
    }

    fun sendPdpViewedEvent(mxPdpViewed: MxPdpViewed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_PDP_VIEWED,
            ipJsonObject = JSONObject(Gson().toJson(mxPdpViewed))
        )
    }

    fun sendMedicineDetailsViewedViewedEvent(mxPdpMedicineDetailsViewed: MxPdpMedicineDetailsViewed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_MEDICINE_DETAILS_VIEWED,
            ipJsonObject = JSONObject(Gson().toJson(mxPdpMedicineDetailsViewed))
        )
    }

    fun sendPdpImageViewedEvent(mxPdpImageViewed: MxPdpImageViewed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_PDP_IMAGE_VIEWED,
            ipJsonObject = JSONObject(Gson().toJson(mxPdpImageViewed))
        )
    }

    fun sendLocationSelectedEvent(mxLocationSelected: MxLocationSelected) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_LOCATION_SELECTED,
            ipJsonObject = JSONObject(Gson().toJson(mxLocationSelected))
        )
    }

    fun sendPinCodeUnserviceableEvent(pincode: Int) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_PINCODE_UNSERVICEABLE,
            ipJsonObject = JSONObject().put("pincode_collected", pincode)
        )
    }

    fun sendReferralScreenViewedEvent(mxReferralScreenViewed: MxReferralScreenViewed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_REFERRAL_SCREEN_VIEWED,
            ipJsonObject = JSONObject(Gson().toJson(mxReferralScreenViewed))
        )
    }

    fun sendLoggedOutEvent(customerId: Int) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_LOGGED_OUT,
            ipJsonObject = JSONObject().put("customer_id", customerId)
        )
    }

    fun sendOrderSummaryViewedEvent(mxOrderSummaryViewed: MxOrderSummaryViewed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_ORDER_SUMMARY_VIEWED,
            ipJsonObject = JSONObject(Gson().toJson(mxOrderSummaryViewed))
        )
    }

    fun sendAppOrderPlacedEvent(mxAppOrderPlaced: MxAppOrderPlaced) = applyTryCatch {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_APP_ORDER_PLACED,
            ipJsonObject = JSONObject(Gson().toJson(mxAppOrderPlaced))
        )
    }

    fun sendPspViewedEvent(mxPspViewed: MxPspViewed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_PSP_VIEWED,
            ipJsonObject = JSONObject(Gson().toJson(mxPspViewed))
        )
    }

    fun sendPaymentPopupViewedEvent(mxPaymentPopupViewed: MxPaymentPopupViewed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_PAYMENT_POPUP_VIEWED,
            ipJsonObject = JSONObject(Gson().toJson(mxPaymentPopupViewed))
        )
    }

    fun sendPaymentUnSuccessfulEvent(mxPaymentFailed: MxPaymentSuccessAndFailed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_PAYMENT_UNSUCCESSFUL,
            ipJsonObject = JSONObject(Gson().toJson(mxPaymentFailed))
        )
    }

    fun sendAddressChangedEvent() {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_ADDRESS_CHANGED,
            ipJsonObject = JSONObject()
        )
    }

    fun sendAddressEditedEvent(mxAddressEdited: MxAddressEdited) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_ADDRESS_EDITED,
            ipJsonObject = JSONObject(Gson().toJson(mxAddressEdited))
        )
    }

    fun sendPatientChangedEvent() {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_PATIENT_CHANGED,
            ipJsonObject = JSONObject()
        )
    }

    fun sendArticleSectionViewedEvent(clickedPage: String) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_ARTICLE_SECTION_VIEWED,
            ipJsonObject = JSONObject().put("clicked_on_page", clickedPage)
        )
    }

    fun sendArticleViewedEvent(mxArticleViewed: MxArticleViewed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_ARTICLE_VIEWED,
            ipJsonObject = JSONObject(Gson().toJson(mxArticleViewed))
        )
    }

    fun sendArticlesCategorySectionViewedEvent(mxArticlesCategorySectionViewed: MxArticlesCategorySectionViewed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_ARTICLE_CATEGORY_SECTION_VIEWED,
            ipJsonObject = JSONObject(Gson().toJson(mxArticlesCategorySectionViewed))
        )
    }

    fun sendArticleSharedEvent(mxArticleShared: MxArticleShared) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_ARTICLE_SHARED,
            ipJsonObject = JSONObject(Gson().toJson(mxArticleShared))
        )
    }

    fun sendVideoFloaterClickedEvent(mxVideoFloaterClicked: MxVideoFloaterClicked) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_VIDEO_FLOATER_CLICKED,
            ipJsonObject = JSONObject(Gson().toJson(mxVideoFloaterClicked))
        )
    }

    fun sendVideoFloaterImpressionEvent(mxVideoFloaterClicked: MxVideoFloaterClicked) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_VIDEO_FLOATER_IMPRESSION,
            ipJsonObject = JSONObject(Gson().toJson(mxVideoFloaterClicked))
        )
    }

    //todo in mixpanel no data but previous code added
    fun sendDoctorConfirmationCardViewedEvent() {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_DOCTOR_CONFIRMATION_CARD_VIEWED,
            ipJsonObject = JSONObject()
        )
    }

    fun sendPaymentPageVisitedEvent(mxPaymentPageVisited: MxPaymentPageVisited) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_PAYMENT_PAGE_VISITED,
            ipJsonObject = JSONObject(Gson().toJson(mxPaymentPageVisited))
        )
    }

    fun sendPaymentPendingViewedEvent(mxPaymentPendingViewed: MxPaymentPendingViewed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_PAYMENT_PENDING_VIEWED,
            ipJsonObject = JSONObject(Gson().toJson(mxPaymentPendingViewed))
        )
    }

    fun sendChangeToCodClickedEvent(mxChangeToCodClicked: MxChangeToCodClicked) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_CHANGE_TO_COD_CLICKED,
            ipJsonObject = JSONObject(Gson().toJson(mxChangeToCodClicked))
        )
    }

    fun sendPaymentFailedEvent(mxPaymentSuccessAndFailed: MxPaymentSuccessAndFailed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_PAYMENT_FAILED,
            ipJsonObject = JSONObject(Gson().toJson(mxPaymentSuccessAndFailed))
        )
    }

    fun sendPaymentSuccessfulEvent(mxPaymentSuccessAndFailed: MxPaymentSuccessAndFailed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_PAYMENT_SUCCESSFUL,
            ipJsonObject = JSONObject(Gson().toJson(mxPaymentSuccessAndFailed))
        )
    }

    fun sendOfferSheetViewedEvent(mxOfferSheetViewed: MxOfferSheetViewed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_OFFER_SHEET_VIEWED,
            ipJsonObject = JSONObject(Gson().toJson(mxOfferSheetViewed))
        )
    }

    fun sendCouponListOpenedEvent(mxCouponListOpened: MxCouponListOpened) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_COUPON_LIST_OPENED,
            ipJsonObject = JSONObject(Gson().toJson(mxCouponListOpened))
        )
    }

    fun sendCouponAppliedEvent(mxCouponApplied: MxCouponApplied) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_COUPON_APPLIED,
            ipJsonObject = JSONObject(Gson().toJson(mxCouponApplied))
        )
    }

    fun sendCouponRemovedEvent(mxCouponRemoved: MxCouponRemoved) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_COUPON_REMOVED,
            ipJsonObject = JSONObject(Gson().toJson(mxCouponRemoved))
        )
    }

    fun sendOrderStatusViewedEvent(mxOrderStatusViewed: MxOrderStatusViewed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_ORDER_STATUS_VIEWED,
            ipJsonObject = JSONObject(Gson().toJson(mxOrderStatusViewed))
        )
    }

    fun sendAddAlternateNumberEvent(orderId: String) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_ORDER_STATUS_ADD_ALTERNATE_CONTACT_CLICKED,
            ipJsonObject = JSONObject().put("order_id", orderId)
        )
    }

    fun sendAlternateContactSavedEvent(mxAlternateContactSaved: MxAlternateContactSaved) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_ORDER_STATUS_ALTERNATE_CONTACT_SAVED,
            ipJsonObject = JSONObject(Gson().toJson(mxAlternateContactSaved))
        )
    }

    fun sendSubstituteReplaceClickedEvent(mxSubstituteReplaceClicked: MxSubstituteReplaceClicked) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_SUBS_REPLACE_CLICKED,
            ipJsonObject = JSONObject(Gson().toJson(mxSubstituteReplaceClicked))
        )
    }

    fun sendUndoClickedEvent(orderId: Long) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_UNDO_CLICKED,
            ipJsonObject = JSONObject().put("order_id", "$orderId")
        )
    }

    fun sendSwitchBackClickedEvent(mxSwitchBackClicked: MxSwitchBackClicked) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_SWITCH_BACK_CLICKED,
            ipJsonObject = JSONObject(Gson().toJson(mxSwitchBackClicked))
        )
    }

    fun sendOneClickSubstitutionPopupViewedEvent(mxOneClickSubstitutionPopupViewed: MxOneClickSubstitutionPopupViewed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_ONE_CLICK_SUBSTITUTION_POPUP_VIEWED,
            ipJsonObject = JSONObject(Gson().toJson(mxOneClickSubstitutionPopupViewed))
        )
    }

    fun sendItemImpressionEvent(mxItemImpression: MxItemImpression) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_ITEM_IMPRESSION,
            ipJsonObject = JSONObject(Gson().toJson(mxItemImpression))
        )
    }

    fun sendSearchSuggestionImpressionEvent(mxEventSuggestionImpression: MxSearchSuggestionImpression) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_SUGGESTION_ITEM_IMPRESSION,
            ipJsonObject = JSONObject(Gson().toJson(mxEventSuggestionImpression))
        )
    }

    fun sendViewBillClickedEvent(mxViewBillClicked: MxViewBillClicked) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_VIEW_BILL_CLICKED,
            ipJsonObject = JSONObject(Gson().toJson(mxViewBillClicked))
        )
    }

    fun sendVideoPlayedEvent(mxVideoPlayed: MxVideoPlayed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_VIDEO_PLAYED,
            ipJsonObject = JSONObject(Gson().toJson(mxVideoPlayed))
        )
    }

    fun sendVideoContinuedEvent(mxVideoContinued: MxVideoContinued) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_VIDEO_CONTINUED,
            ipJsonObject = JSONObject(Gson().toJson(mxVideoContinued))
        )
    }

    fun sendVideoCompletedEvent(mxVideoContinued: MxVideoContinued) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_VIDEO_COMPLETED,
            ipJsonObject = JSONObject(Gson().toJson(mxVideoContinued))
        )
    }

    fun sendVideoPlayerClosedEvent(mxVideoContinued: MxVideoContinued) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_VIDEO_PLAYER_CLOSED,
            ipJsonObject = JSONObject(Gson().toJson(mxVideoContinued))
        )
    }

    fun sendVideoPausedEvent(mxVideoPaused: MxVideoPaused) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_VIDEO_PAUSED,
            ipJsonObject = JSONObject(Gson().toJson(mxVideoPaused))
        )
    }

    fun sendNotificationReceivedEvent(mxNotificationClicked: MxNotificationClicked) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_NOTIFICATION_RECEIVED,
            ipJsonObject = JSONObject(Gson().toJson(mxNotificationClicked))
        )
    }

    fun sendNotificationClickedEvent(mxNotificationClicked: MxNotificationClicked) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_NOTIFICATION_CLICKED,
            ipJsonObject = JSONObject(Gson().toJson(mxNotificationClicked))
        )
    }

    fun sendUrgencyTimerStartedEvent(mxUrgencyTimerStarted: MxUrgencyTimerStarted) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_URGENCY_TIMER_STARTED,
            ipJsonObject = JSONObject(Gson().toJson(mxUrgencyTimerStarted))
        )
    }

    fun sendStickyStripViewedEvent(mxStickyStripViewed: MxStickyStripViewed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_URGENCY_STICKY_STRIP_VIEWED,
            ipJsonObject = JSONObject(Gson().toJson(mxStickyStripViewed))
        )
    }

    fun sendStickyStripClickedEvent(mxStickyStripViewed: MxStickyStripViewed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_URGENCY_STICKY_STRIP_CLICKED,
            ipJsonObject = JSONObject(Gson().toJson(mxStickyStripViewed))
        )
    }

    fun sendProductListPageViewedEvent(mxProductListPageViewed: MxProductListPageViewed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_PRODUCT_LIST_PAGE_VIEWED,
            ipJsonObject = JSONObject(Gson().toJson(mxProductListPageViewed))
        )
    }

    fun sendItemAppOrderPlacedEvent(mxItemAppOrderPlaced: MxItemAppOrderPlaced) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_ITEM_APP_ORDER_PLACED,
            ipJsonObject = JSONObject(Gson().toJson(mxItemAppOrderPlaced))
        )
    }

    fun sendUseLocationClickedEvent(mxUseLocationClicked: MxUseLocationClicked) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_USE_LOCATION_CLICKED,
            ipJsonObject = JSONObject(Gson().toJson(mxUseLocationClicked))
        )
    }

    fun sendReorderSheetEvent(mxReorderSheetViewed: MxReorderSheetViewed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_REORDER_SHEET_VIEWED,
            ipJsonObject = JSONObject(Gson().toJson(mxReorderSheetViewed))
        )
    }

    fun sendContactBottomSheetSaved() {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_CONTACT_SAVED,
            ipJsonObject = JSONObject()
        )
    }

    fun sendContactBottomSheetViewed() {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_CONTACT_BOTTOM_SHEET_VIEWED,
            ipJsonObject = JSONObject()
        )
    }

    fun sendContactBottomSheetSavedClicked() {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_CONTACT_SAVE_CLICKED,
            ipJsonObject = JSONObject()
        )
    }

    fun sendFilterClicked(mxFilterClicked: MXFilterClicked) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_FILTER_CLICKED,
            ipJsonObject = JSONObject(Gson().toJson(mxFilterClicked))
        )
    }

    fun sendCategoryImpression(mxCategoryImpression: MxCategoryImpression) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_CATEGORY_IMPRESSION,
            ipJsonObject = JSONObject(Gson().toJson(mxCategoryImpression))
        )
    }

    fun sendSuperCategorySectionImpression(mXSuperCategorySectionImpression: MXSuperCategorySectionImpression) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_SUPER_CATEGORY_SECTION_IMPRESSION,
            ipJsonObject = JSONObject(Gson().toJson(mXSuperCategorySectionImpression))
        )
    }

    fun sendOtcProductListPageViewed(mxOtcProductListPageViewed: MxOtcProductListPageViewed) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.OTC_PRODUCT_LIST_PAGE_VIEWED,
            ipJsonObject = JSONObject(Gson().toJson(mxOtcProductListPageViewed))
        )
    }

    fun sendPatientDetailsEditedImpression(mXPatientDetailsEditedImpression: MXPatientDetailsEditedImpression) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_PATIENT_DETAILS_EDITED,
            ipJsonObject = JSONObject(Gson().toJson(mXPatientDetailsEditedImpression))
        )
    }

    fun sendInternalErrorOccurred(mxInternalErrorOccurred: MxInternalErrorOccurred) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_ERROR_OCCURED,
            ipJsonObject = JSONObject(Gson().toJson(mxInternalErrorOccurred))
        )
    }

    fun sendSuperEventToMixpanel() {
        mixPanelEvent.sendSuperEventToMixpanel()
    }
    
    fun sendViewDetailsClickedEvent(mxViewDetailsClicked: MxViewDetailsClicked) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_VIEW_DETAILS_CLICKED,
            ipJsonObject = JSONObject(Gson().toJson(mxViewDetailsClicked))
        )
    }

    fun sendProfileDetailsAddedEventToMixpanel(mxProfileDetailsAdded: MxProfileDetailsAdded) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_PROFILE_DETAILS_ADDED,
            ipJsonObject = JSONObject(Gson().toJson(mxProfileDetailsAdded))
        )
    }

    fun sendProfileDetailsEditedEventToMixpanel(mxProfileDetailsEdited: MxProfileDetailsEdited) {
        mixPanelEvent.logMixPanelEvent(
            eventName = MixPanelEvent.MIX_EVENT_PROFILE_DETAILS_EDITED,
            ipJsonObject = JSONObject(Gson().toJson(mxProfileDetailsEdited))
        )
    }
}