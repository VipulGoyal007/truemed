package com.intellihealth.truemeds.domain.usecase.analytics

import android.annotation.SuppressLint
import android.content.Context
import android.provider.Settings
import com.google.gson.Gson
import com.intellihealth.truemeds.data.model.clevertap.CtReorderClicked
import com.intellihealth.truemeds.data.model.login.LoginVerificationResponse
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
import com.intellihealth.truemeds.mvvm.data.appsflyer.AFChronicItemAdded
import com.intellihealth.truemeds.mvvm.data.appsflyer.AFLoginPageViewed
import com.intellihealth.truemeds.mvvm.data.appsflyer.AFLoginSuccess
import com.intellihealth.truemeds.mvvm.data.appsflyer.AFSignupSuccess
import com.intellihealth.truemeds.mvvm.data.appsflyer.AFSubsItemAdded
import com.intellihealth.truemeds.mvvm.data.mixpanel.MXFilterClicked
import com.intellihealth.truemeds.mvvm.data.mixpanel.MxCouponApplied
import com.intellihealth.truemeds.presentation.analytics.AppsFlyerEvent
import com.intellihealth.truemeds.presentation.analytics.FacebookEvent
import com.intellihealth.truemeds.presentation.analytics.FirebaseEvent
import com.intellihealth.truemeds.presentation.analytics.model.firebase.FbSubsView
import com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel
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
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPspViewed
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxReorderSheetViewed
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxSearchSuggestionImpression
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxUseLocationClicked
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxVideoContinued
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxVideoPaused
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxViewDetailsClicked
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.applyTryCatch
import javax.inject.Inject

class SdkEventUseCase @Inject constructor(
    private val mixPanelEventUseCase: MixPanelEventUseCase,
    private val appsFlyerEventUseCase: AppsFlyerEventUseCase,
    private val cleverTapEventUseCase: CleverTapEventUseCase,
    private val firebaseEventUseCase: FirebaseEventUseCase,
    private val facebookEventUseCase: FacebookEventUseCase
) {


    @SuppressLint("HardwareIds")
    fun sendAppOpenedEvent(context: Context) {
        try {
            if (!SharedPrefManager.getInstance().loggedInUserAccessToken.isNullOrEmpty()) {
                val customerId = SharedPrefManager.getInstance().loggedInUserId
                mixPanelEventUseCase.customerIdentity(customerId)
            }
            val deviceId =
                Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID)
            mixPanelEventUseCase.sendAppOpenEvent(
                MxAppOpen(
                    deviceId = deviceId,
                    customerId = SharedPrefManager.getInstance().loggedInUserId
                )
            )
            appsFlyerEventUseCase.sendAppOpen()
        } catch (_: Exception) {
        }
    }

    fun pushFcmRegistrationId(fcmId: String, register: Boolean) = applyTryCatch {
        cleverTapEventUseCase.pushFcmRegistrationId(fcmId, register)
    }

    /*fun pushXiaomiRegistrationId(xiaomiToken: String, xiaomiRegion: String, register: Boolean) {
        cleverTapEventUseCase.pushXiaomiRegistrationId(xiaomiToken, xiaomiRegion, register)
    }*/

    fun sendNotificationClickedEvent(mxNotificationClicked: MxNotificationClicked) = applyTryCatch {
        mixPanelEventUseCase.sendNotificationClickedEvent(mxNotificationClicked)
    }

    fun sendSignUporLoginSuccessfulEvent(
        response: LoginVerificationResponse,
        clickedOnPage: String,
        fillType: String
    ) {
        //Mix pannel event added
        val isNewlyCreatedUser = response?.responseData?.isNewCustomer ?: false
        val mobileNo: String = response?.responseData?.mobileNo ?: ""
        //val autoFillOtp = fillType //value will be "autofilled" or "keyboard_typed"
        val otpAttempt = response?.responseData?.totalOtpAttempts

        try {
            if (isNewlyCreatedUser) {
                //setting mix pannel event
                mixPanelEventUseCase.sendSignUpSuccessfulEvent(
                    MxLoginSuccess(
                        clickedOnPage,
                        fillType,
                        mobileNo.trim { it <= ' ' }.toLong(),
                        otpAttempt
                    )
                )

                /***
                 * setting AppsFlyer event for signup_successful
                 */
                //val jsonString = Gson().toJson(AFSignupSuccess(response.responseData?.customerId))
                appsFlyerEventUseCase.sendSignupSuccessful(
                    AppsFlyerEvent.convertJsonToHashmap(
                        Gson().toJson(
                            AFSignupSuccess(response.responseData?.customerId)
                        )
                    )
                )
                /***
                 * setting Firebase event for signup_successful
                 */
                val firebaseEventModel = FirebaseEventModel()
                firebaseEventModel.pageName = clickedOnPage
                firebaseEventModel.mobile = response.responseData?.mobileNo ?: ""
                firebaseEventUseCase.registrationSuccessful(firebaseEventModel)

                /***
                 * setting Facebook event for signup_successful
                 */
                facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_REGISTRATION_SUCCESSFUL)


            } else {
                //setting mix pannel event
                mixPanelEventUseCase
                    .sendLoginSuccessfulEvent(
                        MxLoginSuccess(
                            clickedOnPage,
                            fillType,
                            mobileNo.trim { it <= ' ' }.toLong(),
                            otpAttempt
                        )
                    )
            }
            /***
             * setting CleverTap event for login_successful
             */
            cleverTapEventUseCase.sendLoginSuccessFullEventToClevertap(isNewlyCreatedUser)

            /***
             * setting AppsFlyer event for login_successful
             */
            var jsonString: String? =
                Gson().toJson(AFLoginSuccess(fillType, response.responseData?.customerId))
            appsFlyerEventUseCase.sendLoginSuccessful(
                AppsFlyerEvent.convertJsonToHashmap(
                    Gson().toJson(
                        AFLoginSuccess(fillType, response.responseData?.customerId)
                    )
                )
            )

            /***
             * setting Firebase event for login_successful
             */
            val firebaseEventModel = FirebaseEventModel()
            firebaseEventModel.pageName = clickedOnPage
            firebaseEventModel.mobile = response.responseData?.mobileNo ?: ""
            firebaseEventUseCase.loginSuccessful(firebaseEventModel)

            /***
             * setting Facebook event for login_successful
             */
            facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_LOGIN_SUCCESSFUL)

        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
    }

    fun sendLoginSkippedEvent(clickedOnPage: String, isNewCustomer: Boolean) = applyTryCatch {
        mixPanelEventUseCase.sendLoginSkippedEvent(clickedOnPage)

        if (clickedOnPage == "login_page") {
            facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_REGISTRATION_MOBILE_NO_SKIP)

            val firebaseEventModel = FirebaseEventModel()
            firebaseEventModel.pageName = "login"
            firebaseEventUseCase.registrationMobileNoSkip(firebaseEventModel)
        } else {
            if (isNewCustomer)
                facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_REGISTRATION_OTP_SKIP)
            else
                facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_LOGIN_OTP_SKIP)

            val firebaseEventModel = FirebaseEventModel()
            firebaseEventModel.pageName = "login"
            firebaseEventUseCase.registrationOtpSkip(firebaseEventModel)
        }
    }

    fun sendLoginPageViewedEvent(
        mxLoginPageViewed: MxLoginPageViewed,
        afLoginPageViewed: AFLoginPageViewed
    ) = applyTryCatch {
        mixPanelEventUseCase.sendLoginPageViewed(mxLoginPageViewed)
        appsFlyerEventUseCase.sendLoginPageViewed(
            AppsFlyerEvent.convertJsonToHashmap(
                Gson().toJson(
                    afLoginPageViewed
                )
            )
        )
    }

    fun sendOTPClickedEvent(
        mxOtpClicked: MxOtpClicked,
        currentPageNameForSignup: String
    ) = applyTryCatch {
        val firebaseEventModel = FirebaseEventModel()
        firebaseEventModel.mobile = mxOtpClicked.mobileNumber
        firebaseEventModel.customerId = "0"
        firebaseEventModel.pageName = currentPageNameForSignup

        mixPanelEventUseCase.sendOtpClickedEvent(mxOtpClicked)

        firebaseEventUseCase.registrationMobileNo(firebaseEventModel)

        if (mxOtpClicked.isNewUser == true) {
            facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_REGISTRATION_OTP_REQUESTED)
            firebaseEventUseCase.logFirebaseEvent(
                FirebaseEvent.FIREBASE_REGISTRATION_OTP_REQUESTED,
                currentPageNameForSignup
            )
        } else {
            facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_LOGIN_OTP_REQUESTED)
            firebaseEventUseCase.logFirebaseEvent(
                FirebaseEvent.FIREBASE_LOGIN_OTP_REQUESTED,
                currentPageNameForSignup
            )
        }
    }

    fun sendOtpTypedEvent(mxOtpTyped: MxOtpTyped) = applyTryCatch {
        mixPanelEventUseCase.sendOtpTypedEvent(mxOtpTyped)
    }

    fun sendTnCEvent() = applyTryCatch {
        firebaseEventUseCase.registrationTermsAndConditions()
    }

    fun sendEditNumberEvent(mobile: String) = applyTryCatch {
        val firebaseEventModel = FirebaseEventModel()
        firebaseEventModel.pageName = "login"
        firebaseEventModel.mobile = mobile
        firebaseEventUseCase.loginMobileNoEdit(firebaseEventModel)
    }


    fun sendAppOrderCancelledEvent(
        from: String,
        mxAppOrderCancelled: MxAppOrderCancelled,
        sellingPrice: Double?
    ) = applyTryCatch {
        when (from) {
            "FirstPage" -> {
                mxAppOrderCancelled.isCodDefaulter = null
                mxAppOrderCancelled.codOrderValueDifference = null
                mxAppOrderCancelled.codDefaulterType = null
                mixPanelEventUseCase.sendFirstCancelPageViewedEvent(mxAppOrderCancelled)
            }

            "SecondPage" -> {
                mxAppOrderCancelled.isCodDefaulter = null
                mxAppOrderCancelled.codOrderValueDifference = null
                mxAppOrderCancelled.codDefaulterType = null
                mixPanelEventUseCase.sendSecondCancelPageViewedEvent(mxAppOrderCancelled)
            }

            "ThirdPage" -> {
                mxAppOrderCancelled.isCodDefaulter = null
                mxAppOrderCancelled.codOrderValueDifference = null
                mxAppOrderCancelled.codDefaulterType = null
                mixPanelEventUseCase.sendThirdCancelPageViewedEvent(mxAppOrderCancelled)
            }

            "OrderStatusCancelBtn" -> {
                mxAppOrderCancelled.isCodDefaulter = null
                mxAppOrderCancelled.codOrderValueDifference = null
                mxAppOrderCancelled.codDefaulterType = null
                mixPanelEventUseCase.sendOrderDetailsCancelOrderEvent(mxAppOrderCancelled)
            }

            else -> {
                mixPanelEventUseCase.sendOrderCancelledClickEvent(mxAppOrderCancelled)
                cleverTapEventUseCase.sendOrderCancelledEventToCleverTap(mxAppOrderCancelled.toCleverTap())
                var appsFlyerAppOrderCancelled = mxAppOrderCancelled.toAppsFlyer()
                appsFlyerAppOrderCancelled.sellingPriceTotalAmount = sellingPrice
                appsFlyerEventUseCase.sendAppCancelOrder(
                    AppsFlyerEvent.convertJsonToHashmap(
                        Gson().toJson(
                            appsFlyerAppOrderCancelled
                        )
                    )
                )
            }
        }

    }

    fun sendOrderStatusViewed(mxOrderStatusViewed: MxOrderStatusViewed) = applyTryCatch {
        mixPanelEventUseCase.sendOrderStatusViewedEvent(mxOrderStatusViewed)
        cleverTapEventUseCase.sendOrderStatusViewedEventToCleverTap(mxOrderStatusViewed.toCleverTap())
    }

    fun sendHomePageViewedEvent(mxHomePageViewed: MxHomePageViewed) = applyTryCatch {
        mixPanelEventUseCase.sendHomePageViewedEvent(mxHomePageViewed)
        appsFlyerEventUseCase.sendHomePageViewed(mxHomePageViewed.toAppsFlyer())
        firebaseEventUseCase.homePageViewed(mxHomePageViewed.toFireBase())
    }

    fun sendAddAddressClickedEvent(mxAddAddressClicked: MxAddAddressClicked) = applyTryCatch {
        mixPanelEventUseCase.sendAddAddressClickedEvent(mxAddAddressClicked)
    }

    fun sendAddPatientClickedEvent(clickedPage: String) = applyTryCatch {
        mixPanelEventUseCase.sendAddPatientClickedEvent(clickedPage)
    }

    fun sendDeliveryDetailViewedEvent() = applyTryCatch {
        mixPanelEventUseCase.sendDeliveryDetailViewedEvent()
    }

    fun sendPatientAddedEvent(mxPatientAdded: MxPatientAdded) = applyTryCatch {
        mixPanelEventUseCase.sendPatientAddedEvent(mxPatientAdded)
        appsFlyerEventUseCase.sendUserDetailsAddPatient(mxPatientAdded.toAppsFlyer())
    }

    fun sendAddressChangedEvent() = applyTryCatch {
        mixPanelEventUseCase.sendAddressChangedEvent()
    }

    fun sendAddressEditedEvent(mxAddressEdited: MxAddressEdited) = applyTryCatch {
        mixPanelEventUseCase.sendAddressEditedEvent(mxAddressEdited)
    }

    fun sendHomePageBannerImpressionEvent(mxHomePageBannerImpression: MxHomePageBannerImpression) =
        applyTryCatch {
            mixPanelEventUseCase.sendHomePageBannerImpressionEvent(mxHomePageBannerImpression)
        }

    fun sendHomePageBannerClickedEvent(mxHomePageBannerClick: MxHomePageBannerClick) =
        applyTryCatch {
            mixPanelEventUseCase.sendHomePageBannerClickedEvent(mxHomePageBannerClick)
            facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_HOMEPAGE_BANNER + " ${mxHomePageBannerClick.bannerIndex}")
        }

    fun sendBannerClicked(mxBannerClicked: MxBannerClicked) = applyTryCatch {
        mixPanelEventUseCase.sendBannerClicked(mxBannerClicked)
    }

    fun sendSkinnyBannerImpressionToMixPanel() = applyTryCatch {
        mixPanelEventUseCase.sendHomePageSkinnyBannerImpressionEvent()
    }

    fun sendAddressAddedEvent(mxAddressAdded: MxAddressAdded) = applyTryCatch {
        mixPanelEventUseCase.sendAddressAddedEvent(mxAddressAdded)
        appsFlyerEventUseCase.sendUserDetailsAddressAdded(mxAddressAdded.toAppsFlyer())
    }

    fun sendPrescriptionUploadPageViewedEvent(mixPannelData: MxPrescriptionUploadPageViewed) =
        applyTryCatch {
            mixPanelEventUseCase.sendPrescriptionUploadPageViewEvent(mixPannelData)
            if (mixPannelData.clickedOnPage.equals("homepage"))
                facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_HOMEPAGE_UPLOAD_PRESCRIPTION)
        }

    fun sendUploadPrescriptionClickEvent(
        mixPannelData: MxUploadPrescriptionClicked,
        pageName: String
    ) {
        try {
            mixPanelEventUseCase.sendPrescriptionClickedEvent(mixPannelData)
            if (mixPannelData.uploadMethod == "gallery") {
                /**
                 * setting firebase event for upload prescriptions from gallery
                 */
                if (pageName != "upload") {
                    val firebaseEventModel = FirebaseEventModel()
                    firebaseEventModel.pageName = pageName
                    firebaseEventModel.mobile = SharedPrefManager.getInstance().loggedInUserMobile
                    firebaseEventModel.customerId = SharedPrefManager.getInstance().loggedInUserId
                    firebaseEventUseCase.uploadPrescriptionGalleryFromOrder(firebaseEventModel)
                } else {
                    val firebaseEventModel = FirebaseEventModel()
                    firebaseEventModel.pageName = pageName
                    firebaseEventModel.mobile = SharedPrefManager.getInstance().loggedInUserMobile
                    firebaseEventModel.customerId = SharedPrefManager.getInstance().loggedInUserId
                    firebaseEventUseCase.uploadPrescriptionGallery(firebaseEventModel)
                }
            } else if (mixPannelData.uploadMethod == "camera") {
                if (pageName == "upload") {
                    val firebaseEventModel = FirebaseEventModel()
                    firebaseEventModel.pageName = pageName
                    firebaseEventModel.mobile = SharedPrefManager.getInstance().loggedInUserMobile
                    firebaseEventModel.customerId = SharedPrefManager.getInstance().loggedInUserId
                    firebaseEventUseCase.uploadPrescriptionCamera(firebaseEventModel)
                    facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_UPLOAD_PRESCRIPTION_CAMERA)
                }
            }
        } catch (ex: Exception) {
            ex.printStackTrace()
        }

        //Mix pannel event calling


    }

    fun sendPrescriptionUploadedClickEvent() = applyTryCatch {

        //Mix pannel event calling
        mixPanelEventUseCase.sendPrescriptionUploadedEvent()


    }

    fun sendApplyCouponClickedEvent(mxApplyCouponClick: MxApplyCouponClick) = applyTryCatch {

        //Mix pannel event calling
        mixPanelEventUseCase.sendApplyCouponClickedEvent(mxApplyCouponClick)


    }

    fun sendCouponListOpenedEvent(mxCouponListOpened: MxCouponListOpened) = applyTryCatch {

        //Mix pannel event calling
        mixPanelEventUseCase.sendCouponListOpenedEvent(mxCouponListOpened)


    }

    fun sendCouponAppliedEvent(mxCouponApplied: MxCouponApplied) = applyTryCatch {

        //Mix pannel event calling
        mixPanelEventUseCase.sendCouponAppliedEvent(mxCouponApplied)
        if (mxCouponApplied.clickedOnPage == "cartsummary")
            firebaseEventUseCase.logFirebaseEvent(FirebaseEvent.FIREBASE_CART_APPLY_COUPON, "")

    }

    fun sendCouponRemovedEvent(mxCouponRemoved: MxCouponRemoved) = applyTryCatch {

        //Mix pannel event calling
        mixPanelEventUseCase.sendCouponRemovedEvent(mxCouponRemoved)

        if (mxCouponRemoved.clickedOnPage == "cartsummary")
            firebaseEventUseCase.cartRemoveCoupon(
                FirebaseEventModel(
                    mobile = SharedPrefManager.getInstance().loggedInUserMobile,
                    customerId = SharedPrefManager.getInstance().loggedInUserId
                )
            )

    }

    fun sendOfferSheetViewedEvent(mxOfferSheetViewed: MxOfferSheetViewed) = applyTryCatch {

        //Mix pannel event calling
        mixPanelEventUseCase.sendOfferSheetViewedEvent(mxOfferSheetViewed)


    }

    fun sendPincodeUnserviceableEvent(pincode: Int) = applyTryCatch {

        //Mix pannel event calling
        mixPanelEventUseCase.sendPinCodeUnserviceableEvent(pincode)


    }

    fun sendReferralScreenViewedEvent(mxReferralScreenViewed: MxReferralScreenViewed) =
        applyTryCatch {

            //Mix pannel event calling
            mixPanelEventUseCase.sendReferralScreenViewedEvent(mxReferralScreenViewed)


        }

    fun sendFtcTimerStartedEvent(mxUrgencyTimerStarted: MxUrgencyTimerStarted) = applyTryCatch {

        if (!SharedPrefManager.getInstance()
                .containsKey(SharedPrefManager.PREF_IS_FTC_Coupon_Timer_Mixpanel_Event_Called)
            || !SharedPrefManager.getInstance().isFtcCouponTimerMixpanelEventCalled
        ) {

            mixPanelEventUseCase.sendUrgencyTimerStartedEvent(mxUrgencyTimerStarted)
            SharedPrefManager.getInstance().isFtcCouponTimerMixpanelEventCalled = true
        }

    }

    fun sendFtcStickyStripViewedEvent(mxStickyStripViewed: MxStickyStripViewed) = applyTryCatch {

        mixPanelEventUseCase.sendStickyStripViewedEvent(mxStickyStripViewed)


    }

    fun sendFtcStickyStripClickedEvent(mxStickyStripViewed: MxStickyStripViewed) = applyTryCatch {
        mixPanelEventUseCase.sendStickyStripClickedEvent(mxStickyStripViewed)
    }

    fun sendVideoPlayedEvent(mxVideoPlayed: MxVideoPlayed) =
        applyTryCatch { mixPanelEventUseCase.sendVideoPlayedEvent(mxVideoPlayed) }

    fun sendVideoContinuedEvent(mxVideoPlayed: MxVideoContinued) = applyTryCatch {
        mixPanelEventUseCase.sendVideoContinuedEvent(mxVideoPlayed)
    }

    fun sendVideoCompletedEvent(mxVideoPlayed: MxVideoContinued) = applyTryCatch {
        mixPanelEventUseCase.sendVideoCompletedEvent(mxVideoPlayed)
    }

    fun sendVideoPlayerClosedEvent(mxVideoPlayed: MxVideoContinued) = applyTryCatch {
        mixPanelEventUseCase.sendVideoPlayerClosedEvent(mxVideoPlayed)
    }

    fun sendVideoPausedEvent(mxVideoPaused: MxVideoPaused) = applyTryCatch {
        mixPanelEventUseCase.sendVideoPausedEvent(mxVideoPaused)
    }

    fun sendSubsVideoPlayedEvent(mxCommonProperty: MxCommonProperty, source: String) =
        applyTryCatch {
            mixPanelEventUseCase.sendSubsVideoPlayedEvent(mxCommonProperty, source)
        }

    fun sendItemAddedEvent(baseItemAdded: MxItemAdded, isSubstitutable: Boolean) = applyTryCatch {
        mixPanelEventUseCase.sendItemAddedEvent(baseItemAdded)
        cleverTapEventUseCase.sendItemAddedEventToClevertap(baseItemAdded.toCleverTap())
        appsFlyerEventUseCase.sendItemAdded(baseItemAdded.toAppsFlyer(isSubstitutable))
        facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_CART_ADD)

        if (baseItemAdded.isChronic) {
            appsFlyerEventUseCase.sendChronicItemAdded(
                AppsFlyerEvent.convertJsonToHashmap(
                    Gson().toJson(
                        AFChronicItemAdded(
                            product_name = baseItemAdded.orgProductName,
                            product_mrp = baseItemAdded.productMrp,
                            is_substitutable = !baseItemAdded.isSubstitute,
                            product_sale_price = baseItemAdded.productSalePrice,
                            clicked_on_page = baseItemAdded.clickedOnPage
                        )
                    )
                )
            )
        }
    }

    fun sendSubstituteItemAddedEvent(afSubsItemAdded: AFSubsItemAdded) = applyTryCatch {
        appsFlyerEventUseCase.sendSubsItemAdded(
            AppsFlyerEvent.convertJsonToHashmap(
                Gson().toJson(
                    afSubsItemAdded
                )
            )
        )
    }

    fun sendUseLocationClickedEvent(mxUseLocationClicked: MxUseLocationClicked) = applyTryCatch {
        mixPanelEventUseCase.sendUseLocationClickedEvent(mxUseLocationClicked)
    }

    fun sendProductListPageViewedEvent(mxProductListPageViewed: MxProductListPageViewed) =
        applyTryCatch {
            mixPanelEventUseCase.sendProductListPageViewedEvent(mxProductListPageViewed)
        }

    fun sendViewBillClickedEvent(mxViewBillClicked: MxViewBillClicked) = applyTryCatch {
        mixPanelEventUseCase.sendViewBillClickedEvent(mxViewBillClicked)
    }

    fun sendPspViewedEvent(mxPspViewed: MxPspViewed) = applyTryCatch {
        mixPanelEventUseCase.sendPspViewedEvent(mxPspViewed)
    }

    fun sendPaymentPopupViewedEvent(mxPaymentPopupViewed: MxPaymentPopupViewed) = applyTryCatch {
        mixPanelEventUseCase.sendPaymentPopupViewedEvent(mxPaymentPopupViewed)
    }

    fun sendPaymentFailedEvent(mxPaymentSuccessAndFailed: MxPaymentSuccessAndFailed) =
        applyTryCatch {
            mixPanelEventUseCase.sendPaymentFailedEvent(mxPaymentSuccessAndFailed)
            facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_PAYMENT_FAILED)
        }

    fun sendPaymentSuccessfulEvent(mxPaymentSuccessAndFailed: MxPaymentSuccessAndFailed) =
        applyTryCatch {
            mixPanelEventUseCase.sendPaymentSuccessfulEvent(mxPaymentSuccessAndFailed)
            facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_PAYMENT_SUCCESSFUL)
        }

    fun sendAppOrderPlacedEvent(mxAppOrderPlaced: MxAppOrderPlaced) = applyTryCatch {
        mixPanelEventUseCase.sendAppOrderPlacedEvent(mxAppOrderPlaced)
        cleverTapEventUseCase.sendAppOrderPlacedEventToCleverTap(mxAppOrderPlaced.toCleverTap())
        appsFlyerEventUseCase.sendAppOrderPlaced(mxAppOrderPlaced.toAppsFlyer())

        firebaseEventUseCase.orderSummaryConfirmOrder(mxAppOrderPlaced.toFireBase())

        facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_ORDER_SUMMARY_CONFIRM_ORDER)
        facebookEventUseCase.sendPurchaseEvent(mxAppOrderPlaced.estimatedPayableAmount ?: 0.0)
    }


    fun sendLocationSelectedEvent(mxLocationSelected: MxLocationSelected) = applyTryCatch {
        mixPanelEventUseCase.sendLocationSelectedEvent(mxLocationSelected)
    }

    fun sendPatientChangedEvent() = applyTryCatch { mixPanelEventUseCase.sendPatientChangedEvent() }
    fun sendDoctorConfirmationCardViewedEvent() = applyTryCatch {
        mixPanelEventUseCase.sendDoctorConfirmationCardViewedEvent()
    }

    fun sendPdpImageViewedEvent(mxPdpImageViewed: MxPdpImageViewed) = applyTryCatch {
        mixPanelEventUseCase.sendPdpImageViewedEvent(mxPdpImageViewed)
    }

    fun sendMedicineDetailsViewedViewedEvent(
        mxPdpMedicineDetailsViewed: MxPdpMedicineDetailsViewed,
        productCode: String?
    ) = applyTryCatch {
        mixPanelEventUseCase.sendMedicineDetailsViewedViewedEvent(mxPdpMedicineDetailsViewed)
        when (mxPdpMedicineDetailsViewed.productDetailsSection) {
            "Introduction" -> {
                facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_PD_PAGE_INTRODUCTION)
                firebaseEventUseCase.pdPageIntroduction(
                    FirebaseEventModel(
                        mobile = SharedPrefManager.getInstance().loggedInUserMobile,
                        customerId = SharedPrefManager.getInstance().loggedInUserId,
                        productCode = productCode,
                        productName = mxPdpMedicineDetailsViewed.product_name
                    )
                )
            }

            "Medicine activity" -> {
                facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_PD_PAGE_MEDICINE_ACTIVITY)
                firebaseEventUseCase.pdPageMedicineActivity(
                    FirebaseEventModel(
                        mobile = SharedPrefManager.getInstance().loggedInUserMobile,
                        customerId = SharedPrefManager.getInstance().loggedInUserId,
                        productCode = productCode,
                        productName = mxPdpMedicineDetailsViewed.product_name
                    )
                )
            }

            "Uses" -> {
                facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_PD_PAGE_USES)
                firebaseEventUseCase.pdPageUese(
                    FirebaseEventModel(
                        mobile = SharedPrefManager.getInstance().loggedInUserMobile,
                        customerId = SharedPrefManager.getInstance().loggedInUserId,
                        productCode = productCode,
                        productName = mxPdpMedicineDetailsViewed.product_name
                    )
                )
            }

            "Direction for use" -> {
                facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_PD_PAGE_DIRECTIONS_FOR_USE)
                firebaseEventUseCase.pdPageDirectionsForUse(
                    FirebaseEventModel(
                        mobile = SharedPrefManager.getInstance().loggedInUserMobile,
                        customerId = SharedPrefManager.getInstance().loggedInUserId,
                        productCode = productCode,
                        productName = mxPdpMedicineDetailsViewed.product_name
                    )
                )
            }

            "Side effects" -> {
                facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_PD_PAGE_SIDE_EFFECTS)
                firebaseEventUseCase.pdPageSideEffects(
                    FirebaseEventModel(
                        mobile = SharedPrefManager.getInstance().loggedInUserMobile,
                        customerId = SharedPrefManager.getInstance().loggedInUserId,
                        productCode = productCode,
                        productName = mxPdpMedicineDetailsViewed.product_name
                    )
                )
            }

            "Manufacturer Details" -> {
                facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_PD_PAGE_ADDITIONAL_INFORMATION)
                firebaseEventUseCase.pdPageAdditionalInformation(
                    FirebaseEventModel(
                        mobile = SharedPrefManager.getInstance().loggedInUserMobile,
                        customerId = SharedPrefManager.getInstance().loggedInUserId,
                        productCode = productCode,
                        productName = mxPdpMedicineDetailsViewed.product_name
                    )
                )
            }

            else -> {
                // Handle the case when productDetailsSection doesn't match any of the cases
            }
        }

    }

    fun sendItemAppOrderPlacedEvent(mxItemAppOrderPlaced: MxItemAppOrderPlaced) = applyTryCatch {
        mixPanelEventUseCase.sendItemAppOrderPlacedEvent(mxItemAppOrderPlaced)
    }

    fun sendPaymentPageVisitedEvent(mxPaymentPageVisited: MxPaymentPageVisited) = applyTryCatch {
        mixPanelEventUseCase.sendPaymentPageVisitedEvent(mxPaymentPageVisited)
    }

    fun sendPaymentPendingViewedEvent(mxPaymentPendingViewed: MxPaymentPendingViewed) =
        applyTryCatch {
            mixPanelEventUseCase.sendPaymentPendingViewedEvent(mxPaymentPendingViewed)
        }


    fun sendAddAlternateNumberEvent(orderId: String) = applyTryCatch {
        mixPanelEventUseCase.sendAddAlternateNumberEvent(orderId)
    }

    fun sendAlternateContactSavedEvent(mxAlternateContactSaved: MxAlternateContactSaved) =
        applyTryCatch {
            mixPanelEventUseCase.sendAlternateContactSavedEvent(mxAlternateContactSaved)
        }

    fun sendVideoFloaterClickedEvent(mxVideoFloaterClicked: MxVideoFloaterClicked) = applyTryCatch {
        mixPanelEventUseCase.sendVideoFloaterClickedEvent(mxVideoFloaterClicked)
    }

    fun sendVideoFloaterImpressionEvent(mxVideoFloaterClicked: MxVideoFloaterClicked) =
        applyTryCatch {
            mixPanelEventUseCase.sendVideoFloaterImpressionEvent(mxVideoFloaterClicked)
        }

    fun sendCartViewedEvent(mxCartViewed: MxCartViewed) = applyTryCatch {
        mixPanelEventUseCase.sendCartViewedEvent(mxCartViewed)
        cleverTapEventUseCase.sendCartViewedEventToCleverTap(mxCartViewed.toCleverTap())
        appsFlyerEventUseCase.sendCartViewed(mxCartViewed.toAppsFlyer())
    }

    fun sendCallPharmacistClickedEvent() = applyTryCatch {
        mixPanelEventUseCase.sendCallPharmacistClickedEvent()
    }

    fun sendSearchViewedEvent(mxSearchViewed: MxSearchViewed) = applyTryCatch {
        mixPanelEventUseCase.sendSearchViewedEvent(mxSearchViewed)
        cleverTapEventUseCase.sendSearchViewedEventToClevertap(mxSearchViewed.clickedOnPage ?: "")
        appsFlyerEventUseCase.sendSearchViewed(mxSearchViewed.toAppsFlyer())

        if (mxSearchViewed.clickedOnPage.equals("home_page")) {
            facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_HOMEPAGE_SEARCH)
            firebaseEventUseCase.logFirebaseEvent(FirebaseEvent.FIREBASE_HOMEPAGE_SEARCH, "Home")
        }
    }

    fun sendArticleSectionViewedEvent(clickedOnPage: String) = applyTryCatch {
        mixPanelEventUseCase.sendArticleSectionViewedEvent(clickedOnPage)
        if (clickedOnPage.equals("homepage")) {
            facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_HOMEPAGE_HEALTH_ARTICLES)
            firebaseEventUseCase.logFirebaseEvent(
                FirebaseEvent.FIREBASE_HOMEPAGE_HEALTH_ARTICLES,
                "Home"
            )
        }

    }

    fun sendArticleViewedEvent(mxArticleViewed: MxArticleViewed) = applyTryCatch {
        mixPanelEventUseCase.sendArticleViewedEvent(mxArticleViewed)
    }

    fun sendArticlesCategorySectionViewedEvent(mxArticlesCategorySectionViewed: MxArticlesCategorySectionViewed) =
        applyTryCatch {
            mixPanelEventUseCase.sendArticlesCategorySectionViewedEvent(
                mxArticlesCategorySectionViewed
            )
        }

    fun sendArticleSharedEvent(mxArticleShared: MxArticleShared) = applyTryCatch {
        mixPanelEventUseCase.sendArticleSharedEvent(mxArticleShared)
    }

    fun sendSrpAddSubsBottomSheetViewedEvent(mxSrpAddSubBottomSheetViewed: MxSrpAddSubBottomSheetViewed) =
        applyTryCatch {
            mixPanelEventUseCase.sendSrpAddSubsBottomSheetViewedEvent(mxSrpAddSubBottomSheetViewed)
        }

    fun sendSrpViewSubsBottomSheetViewedEvent(mxSrpAddSubBottomSheetViewed: MxSrpAddSubBottomSheetViewed) =
        applyTryCatch {
            mixPanelEventUseCase.sendSrpViewSubsBottomSheetViewedEvent(mxSrpAddSubBottomSheetViewed)
        }

    fun sendSrpViewedEvent(mxSrpViewed: MxSrpViewed) = applyTryCatch {
        mixPanelEventUseCase.sendSrpViewedEvent(mxSrpViewed)
        cleverTapEventUseCase.sendSRPViewedEventToClevertap(mxSrpViewed.toCleverTap())
        appsFlyerEventUseCase.sendSRPViewed(mxSrpViewed.toAppsFlyer())
    }

    fun sendLogOutEvent(customerId: Int) = applyTryCatch {
        mixPanelEventUseCase.sendLoggedOutEvent(customerId)
        cleverTapEventUseCase.sendLoggedOutEventToClevertap(customerId)
    }

    fun sendReminderBottomSheetViewedEvent(mxReminderBottomSheetViewed: MxReminderBottomSheetViewed) =
        applyTryCatch {
            mixPanelEventUseCase.sendReminderBottomSheetViewedEvent(mxReminderBottomSheetViewed)
        }

    fun sendReminderSuccessfullySetEvent(mxReminderSuccessfullySet: MxReminderSuccessfullySet) =
        applyTryCatch {
            mixPanelEventUseCase.sendReminderSuccessfullySetEvent(mxReminderSuccessfullySet)
        }

    fun sendReminderEditClickedEvent(mxReminderSuccessfullySet: MxReminderSuccessfullySet) =
        applyTryCatch {
            mixPanelEventUseCase.sendReminderEditClickedEvent(mxReminderSuccessfullySet)
        }

    fun sendReminderUpdatedClickedEvent(mxReminderUpdate: MxReminderUpdate) = applyTryCatch {
        mixPanelEventUseCase.sendReminderUpdatedClickedEvent(mxReminderUpdate)
    }

    fun sendReminderDeletedEvent(mxReminderDeleted: MxReminderDeleted) = applyTryCatch {
        mixPanelEventUseCase.sendReminderDeletedEvent(mxReminderDeleted)
    }

    fun sendPatientAndReminderSetButtonOrderStatus() = applyTryCatch {
        val firebaseEventModel = FirebaseEventModel()
        firebaseEventModel.mobile = SharedPrefManager.getInstance().loggedInUserMobile
        firebaseEventModel.customerId = SharedPrefManager.getInstance().loggedInUserId
        firebaseEventUseCase.patientAndReminderSetButtonOrderStatus(firebaseEventModel)
    }

    fun sendPrescriptionRemovedEvent(clickedPage: String) = applyTryCatch {
        mixPanelEventUseCase.sendPrescriptionRemovedEvent(clickedPage)
    }

    fun sendOrderSummaryViewedEvent(mxOrderSummaryViewed: MxOrderSummaryViewed) = applyTryCatch {
        mixPanelEventUseCase.sendOrderSummaryViewedEvent(mxOrderSummaryViewed)
        appsFlyerEventUseCase.sendOrderSummaryViewed(mxOrderSummaryViewed.toAppsFlyer())
    }

    fun sendContactBottomSheetSaved() = applyTryCatch {
        mixPanelEventUseCase.sendContactBottomSheetSaved()
    }

    fun sendContactBottomSheetSavedClicked() = applyTryCatch {
        mixPanelEventUseCase.sendContactBottomSheetSavedClicked()
    }

    fun sendContactBottomSheetViewed() = applyTryCatch {
        mixPanelEventUseCase.sendContactBottomSheetViewed()
    }

    fun sendOneClickSubstitutionPopupViewedEvent(mxOneClickSubstitutionPopupViewed: MxOneClickSubstitutionPopupViewed) =
        applyTryCatch {
            mixPanelEventUseCase.sendOneClickSubstitutionPopupViewedEvent(
                mxOneClickSubstitutionPopupViewed
            )
        }

    fun sendSwitchBackClickedEvent(mxSwitchBackClicked: MxSwitchBackClicked) = applyTryCatch {
        mixPanelEventUseCase.sendSwitchBackClickedEvent(mxSwitchBackClicked)
    }

    fun sendLocationBottomSheetViewedEvent() = applyTryCatch {
        mixPanelEventUseCase.sendLocationBottomSheetViewedEvent()
    }

    fun sendUndoClickedEvent(orderId: Long) = applyTryCatch {
        mixPanelEventUseCase.sendUndoClickedEvent(orderId)
    }

    fun sendSubstituteReplaceClickedEvent(mxSubstituteReplaceClicked: MxSubstituteReplaceClicked) =
        applyTryCatch {
            mixPanelEventUseCase.sendSubstituteReplaceClickedEvent(mxSubstituteReplaceClicked)
        }

    fun sendSearchSuggestionImpressionEvent(mxEventSuggestionImpression: MxSearchSuggestionImpression) =
        applyTryCatch {
            mixPanelEventUseCase.sendSearchSuggestionImpressionEvent(mxEventSuggestionImpression)
        }

    fun sendPdpViewedEvent(mxPdpViewed: MxPdpViewed) = applyTryCatch {
        mixPanelEventUseCase.sendPdpViewedEvent(mxPdpViewed)
        cleverTapEventUseCase.sendPdpViewedEventToCleverTap(mxPdpViewed.toCleverTap())
//        appsFlyerEventUseCase.sendPDPViewed(mxPdpViewed.toAppsFlyer())
    }

    fun sendUpdateProfileSaveEvent(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        firebaseEventUseCase.updateProfileSave(firebaseEventModel)
        facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_UPDATE_PROFILE_SAVE)
    }

    fun searchViewCart(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        firebaseEventUseCase.searchViewCart(firebaseEventModel)
        facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_SEARCH_VIEW_CART)

    }

    fun orderPrescriptionUploaded(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        firebaseEventUseCase.orderPrescriptionUploaded(firebaseEventModel)
        facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_ORDER_PRESCRIPTION_UPLOADED)
        firebaseEventUseCase.uploadPrescriptionUpload(firebaseEventModel)

    }

    fun uploadPrescriptionPrescriptionSelected(firebaseEventModel: FirebaseEventModel) =
        applyTryCatch {
            firebaseEventUseCase.uploadPrescriptionPrescriptionSelected(firebaseEventModel)
            facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_UPLOAD_PRESCRIPTION_PRESCRIPTION_SELECTED)
        }

    fun sendItemSearchedEvent(mxItemSearched: MxItemSearched) = applyTryCatch {
//        if (!mxItemSearched.termSearched.isNullOrEmpty()) {
        mixPanelEventUseCase.sendItemSearchedEvent(mxItemSearched)
        cleverTapEventUseCase.sendItemSearchedEventToClevertap(mxItemSearched.toCleverTap())
        appsFlyerEventUseCase.sendItemSearched(mxItemSearched.toAppsFlyer())
//        }

    }

    fun sendSubsLearnMoreClickedEvent() = applyTryCatch {
        appsFlyerEventUseCase.sendSubsLearnMore()
    }

    fun sendReferAFriendClickedEvent() = applyTryCatch {
        appsFlyerEventUseCase.sendReferAFriendClicked()
    }

    fun sendTmWalletCreditTransactions() = applyTryCatch {
        facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_TM_WALLET_CREDIT_TRANSACTIONS)
    }

    fun sendTmWalletRewardTransactions() = applyTryCatch {
        facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_TM_WALLET_REWARD_TRANSACTIONS)
    }

    fun sendTmWalletViewed() = applyTryCatch {
        facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_TM_WALLET_VIEWED)
        firebaseEventUseCase.tmWalletViewed(
            FirebaseEventModel(
                mobile = SharedPrefManager.getInstance().loggedInUserMobile,
                customerId = SharedPrefManager.getInstance().loggedInUserId,
                pageName = "TmWallet"
            )
        )
    }

    fun sendEventChangeToCod(mxChangeToCodClicked: MxChangeToCodClicked) = applyTryCatch {
        mixPanelEventUseCase.sendChangeToCodClickedEvent(mxChangeToCodClicked)
    }


    fun sendFilterClicked(mxFilterClicked: MXFilterClicked) = applyTryCatch {
        mixPanelEventUseCase.sendFilterClicked(mxFilterClicked)
    }


    fun sendCategoryImpression(mxCategoryImpression: MxCategoryImpression) = applyTryCatch {
        mixPanelEventUseCase.sendCategoryImpression(mxCategoryImpression)
    }

    fun sendSuperCategorySectionImpression(mXSuperCategorySectionImpression: MXSuperCategorySectionImpression) =
        applyTryCatch {
            mixPanelEventUseCase.sendSuperCategorySectionImpression(mXSuperCategorySectionImpression)
        }


    fun sendReorderClickedEventToCleverTap(ctReorderClicked: CtReorderClicked) = applyTryCatch {
        cleverTapEventUseCase.sendReorderClickedEventToCleverTap(ctReorderClicked)
    }

    fun sendReorderSheetViewedEvent(mxReorderSheetViewed: MxReorderSheetViewed) = applyTryCatch {
        mixPanelEventUseCase.sendReorderSheetEvent(mxReorderSheetViewed)
    }

    fun sendPatientDetailsEditedEvent(mxPatientDetailsEdited: MXPatientDetailsEditedImpression) =
        applyTryCatch {
            mixPanelEventUseCase.sendPatientDetailsEditedImpression(mxPatientDetailsEdited)
        }

    fun sendItemImpressionEvent(mxItemImpression: MxItemImpression) = applyTryCatch {
        mixPanelEventUseCase.sendItemImpressionEvent(mxItemImpression)
    }


    fun sendOtcProductListPageViewed(mxReorderSheetViewed: MxOtcProductListPageViewed) =
        applyTryCatch {
            mixPanelEventUseCase.sendOtcProductListPageViewed(mxReorderSheetViewed)
        }

    fun sendExperimentStartedEvent(mxExperimentStarted: MxExperimentStarted) = applyTryCatch {
        mixPanelEventUseCase.sendExperimentStartedEvent(mxExperimentStarted)
    }

    fun sendInternalErrorOccurred(mxInternalErrorOccurred: MxInternalErrorOccurred) =
        applyTryCatch {
            mixPanelEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
        }

    fun sendPdpViewedEvent(afPdpViewed: Map<String, Any>) = applyTryCatch {
        appsFlyerEventUseCase.sendPDPViewed(afPdpViewed)
    }

    fun pdPageSubView(fbSubsView: FbSubsView) = applyTryCatch {
        firebaseEventUseCase.pdPageSubView(fbSubsView)
    }

    fun subsPopup(fbSubsView: FbSubsView) = applyTryCatch {
        firebaseEventUseCase.subsPopup(fbSubsView)
    }

    fun substituteDropdownViewed(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        firebaseEventUseCase.substituteDropdownViewed(firebaseEventModel)
    }

    fun substituteDropdownClosed(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        firebaseEventUseCase.substituteDropdownClosed(firebaseEventModel)
    }

    fun pushProfileCleverTap() = applyTryCatch {
        cleverTapEventUseCase.pushProfileCleverTap()
    }

    fun onUserLoginCleverTap() = applyTryCatch {
        cleverTapEventUseCase.onUserLoginCleverTap()
    }

    fun sendSuperEventToMixpanel() = applyTryCatch {
        mixPanelEventUseCase.sendSuperEventToMixpanel()
    }

    fun sendCallToOrderToFacebookEvent() = applyTryCatch {
        facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_HOMEPAGE_CALL_TO_ORDER)
    }

    fun sendPdPageDeleteToFacebookEvent() {
        facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_PD_PAGE_DELETE)
    }

    fun sendPdPageViewCartToFacebookEvent() {
        facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_PD_PAGE_VIEW_CART)
    }

    fun sendPdPageCartToFacebookEvent() {
        facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_PD_PAGE_CART)
    }

    fun sendPdPageSearchToFacebookEvent() {
        facebookEventUseCase.sendEvent(FacebookEvent.FACEBOOK_PD_PAGE_SEARCH)
    }

    fun sendocationClickToFirebaseEvent(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        firebaseEventUseCase.locationEnterPinCode(firebaseEventModel)
    }

    fun sendTmWalletBackFirebaseEvent(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        firebaseEventUseCase.tmWalletBack(firebaseEventModel)
    }

    fun sendTmWalletFaqFirebaseEvent(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        firebaseEventUseCase.tmWalletFaqs(firebaseEventModel)
    }

    fun sendTmWalletTransactionFirebaseEvent(
        isRewardTransaction: Boolean,
        firebaseEventModel: FirebaseEventModel
    ) = applyTryCatch {
        if (isRewardTransaction)
            firebaseEventUseCase.tmWalletRewardTransactions(firebaseEventModel)
        else
            firebaseEventUseCase.tmWalletCreditTransactions(firebaseEventModel)
    }

    fun sendTmWalletTermAndConditionFirebaseEvent(firebaseEventModel: FirebaseEventModel) =
        applyTryCatch {
            firebaseEventUseCase.tmWalletTAndC(firebaseEventModel)
        }

    fun sendNavClickToFirebaseEvent(nav: String) {
        try {
            when (nav) {
                "home_nav" -> firebaseEventUseCase.homePageNav(
                    FirebaseEventModel(
                        mobile = SharedPrefManager.getInstance().loggedInUserMobile,
                        customerId = SharedPrefManager.getInstance().loggedInUserId
                    )
                )

                "nav_refer_and_earn" -> firebaseEventUseCase.referAndEarnNav(
                    FirebaseEventModel(
                        mobile = SharedPrefManager.getInstance().loggedInUserMobile,
                        customerId = SharedPrefManager.getInstance().loggedInUserId
                    )
                )

                "nav_orders" -> firebaseEventUseCase.ordersNav(
                    FirebaseEventModel(
                        mobile = SharedPrefManager.getInstance().loggedInUserMobile,
                        customerId = SharedPrefManager.getInstance().loggedInUserId
                    )
                )

                "nav_account" -> firebaseEventUseCase.accountNav(
                    FirebaseEventModel(
                        mobile = SharedPrefManager.getInstance().loggedInUserMobile,
                        customerId = SharedPrefManager.getInstance().loggedInUserId
                    )
                )

            }
        } catch (ex: Exception) {
            ex.printStackTrace()
        }


    }

    fun sendProceedToCartToFirebaseEvent() = applyTryCatch {
        firebaseEventUseCase.cartProceed(
            FirebaseEventModel(
                mobile = SharedPrefManager.getInstance().loggedInUserMobile,
                customerId = SharedPrefManager.getInstance().loggedInUserId
            )
        )
    }

    fun sendViewDetailsClickedEventToMixpanel(mxViewDetailsClicked: MxViewDetailsClicked) {
        mixPanelEventUseCase.sendViewDetailsClickedEvent(mxViewDetailsClicked)
    }
}