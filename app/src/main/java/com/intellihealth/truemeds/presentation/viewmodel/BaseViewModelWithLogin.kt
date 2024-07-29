package com.intellihealth.truemeds.presentation.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.messaging.FirebaseMessaging
import com.intellihealth.truemeds.BuildConfig
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.mixpanel.MxLoginPageViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxOtpClicked
import com.intellihealth.truemeds.domain.enums.LoginStatus
import com.intellihealth.truemeds.domain.usecase.LoginUseCase
import com.intellihealth.truemeds.mvvm.data.appsflyer.AFLoginPageViewed
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import com.truecaller.android.sdk.oAuth.TcSdk
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

open class BaseViewModelWithLogin(
    private val loginUseCase: LoginUseCase
) : BaseViewModel() {
    val _isLoading = MutableLiveData(false)
    val isLoading: LiveData<Boolean> get() = _isLoading


    private val _showLoginError = MutableLiveData<Event<String>>()
    val showLoginError: LiveData<Event<String>> get() = _showLoginError

    val _updateButtonText = MutableLiveData(false)
    val updateButtonText: LiveData<Boolean> get() = _updateButtonText

    var continueExploringFlowEnabled = false

    private val otpEvent = MutableLiveData<Event<Any>>()
    val otpPageSwitchObserver: LiveData<Event<Any>> get() = otpEvent

    private val _eventTrueCallerLoginFailed = MutableLiveData<Event<Boolean>>()
    val eventTrueCallerLoginFailed: LiveData<Event<Boolean>> get() = _eventTrueCallerLoginFailed

    private val loginEvent = MutableLiveData<Event<Boolean>>()
    val loginPageSwitchObserver: LiveData<Event<Boolean>> get() = loginEvent
    val otpObserver = MutableLiveData<Event<String>>()
    val tcObserver = MutableLiveData<Event<String>>()
    val processSkipFlow = MutableLiveData(false)

    var mobileNumberErrorMessage: String? = ""
    var isOTPVerified = false
    /*val baseLoginSuccessResponse = MutableLiveData(false)*/

    //var userDetailsResponse: LoginVerificationResponse? = null

    val bottomSheetPageSwitch = MutableLiveData(0)

    //  val bottomSheetShowProgressBar = MutableLiveData(false)
    var mobileNumber: String = ""
    var fillType = "keyboard_typed"
    var isTruecaller = false
    var isNewCustomer = false
    var enteredOTP: String = ""
    var currentPageNameForSignup: String = "app_open"
    var isLoadingViewForLoginBottomSheet: MutableLiveData<Boolean> = MutableLiveData(false)

    fun checkTrueCallerAvailability() = TcSdk.getInstance().isOAuthFlowUsable

    fun setCurrentPage(currentPage : String) {
        this.currentPageNameForSignup = currentPage
    }
    /**
     * 1) Validate input mobile number
     * If input is invalid, notify to view,
     * If input is valid, make API call to generate OTP
     */
    fun performSendOTP(enteredMobileNo: String, isResendClicked: Boolean) {
        mobileNumber = enteredMobileNo
        val checkValidationResponse = loginUseCase.checkPhoneNumber(mobileNumber)
        when {
            checkValidationResponse.isValid -> {
                showLoader()
                //perform api calling
                viewModelScope.launch(IO) {
                    val response = loginUseCase.sendMobileOtp(
                        MxInternalErrorOccurred(),SharedPrefManager.getInstance().fcm,
                        mobileNumber
                    )
                    if (response != null) {
                        if (response.isSuccess) {
                            isNewCustomer = response.responseData?.isNewCustomer ?: false
                            isLoadingViewForLoginBottomSheet.postValue(false)
                            _updateButtonText.postValue(false)
                            showOtpInputPage(isResendClicked)
                            sendOTPClickedEvent(MxOtpClicked(isNewCustomer,mobileNumber), currentPageNameForSignup)
                        } else {
                            mobileNumberErrorMessage = response.message
                            _showLoginError.postValue(Event(mobileNumberErrorMessage))
                            otpObserver.postValue(Event(mobileNumberErrorMessage))
                            //limit exceed
                            if (response.statusCode == 429) {
                                _updateButtonText.postValue(true)
                            }
                        }
                    } else {
                        mobileNumberErrorMessage = "Enter a valid mobile number"
                        _showLoginError.postValue(Event(mobileNumberErrorMessage))
                    }
                    hideLoader()
                }
            }

            else -> {
                //show error msg to user
                mobileNumberErrorMessage = "Enter a valid mobile number"
                _showLoginError.postValue(Event(mobileNumberErrorMessage))
            }
        }

    }

    fun loginOTPEditClicked(mobile: String) {
//        sdkEventUseCase.sendEditNumberEvent(mobile)
        backToLoginMobileNumberPage()
    }

    private fun showOtpInputPage(isResendClicked: Boolean) {
        //Notify view to load Otp page
        if (!isResendClicked) {
            otpEvent.postValue(Event(Any()))
            bottomSheetPageSwitch.postValue(1)
        }
    }

    private fun backToLoginMobileNumberPage() {
        loginEvent.postValue(Event(true))
        bottomSheetPageSwitch.postValue(0)
    }

    fun sendOTPClickedEvent(mxOtpClicked: MxOtpClicked, currentPageNameForSignup: String) {
        sdkEventUseCase.sendOTPClickedEvent(mxOtpClicked, currentPageNameForSignup)
    }


    /**
     * Performing the otp check along with validation
     * */
    fun performOTPVerification(context: Context) {
        val checkValidationResponse = loginUseCase.otpInputValidation(enteredOTP)
        when {
            checkValidationResponse.isValid -> {
                showLoader()
                //perform api calling
                viewModelScope.launch(IO) {
                    val processUserLoginResult = loginUseCase.verifyMobileOtp(
                        MxInternalErrorOccurred(),mobileNo = mobileNumber,
                        otp = enteredOTP,
                        deviceKey = SharedPrefManager.getInstance().fcm,
                        isIos = false,
                        aaid = SharedPrefManager.getInstance().googleAdId,
                        source = "TM_ANDROID_V" + BuildConfig.VERSION_NAME,
                        context = context,
                        fillType = fillType,
                        clickedOnPage = currentPageNameForSignup
                    )
                    when (processUserLoginResult.loginStatus) {
                        LoginStatus.SUCCESS -> showNextScreen(true)

                        LoginStatus.INVALID_OTP -> {
                            mobileNumberErrorMessage = processUserLoginResult.message
                            otpObserver.postValue(Event(mobileNumberErrorMessage))
                        }

                        LoginStatus.INVALID_ACCESS_TOKEN -> {
                            mobileNumberErrorMessage = "Invalid OTP! Please try again"
                            otpObserver.postValue(Event(mobileNumberErrorMessage))
                        }

                        LoginStatus.EXCEPTION_OCCURRED -> {
                            mobileNumberErrorMessage = "Exception occurred"
                            otpObserver.postValue(Event(mobileNumberErrorMessage))
                        }

                        LoginStatus.NULL -> {
                            mobileNumberErrorMessage = "Invalid OTP! Please try again"
                            otpObserver.postValue(Event(mobileNumberErrorMessage))
                        }
                    }
                    hideLoader()
                    fillType = "keyboard_typed"
                }
            }

            else -> {
                //show error msg to user
                mobileNumberErrorMessage = "Invalid OTP! Please try again"
                otpObserver.postValue(Event(mobileNumberErrorMessage))
                fillType = "keyboard_typed"
            }
        }

    }

    private fun showLoader() {
        _isLoading.postValue(true)
    }

    private fun hideLoader() {
        _isLoading.postValue(false)
    }

    private fun showNextScreen(isOtpFlow: Boolean) {
        hideLoader()
        mobileNumberErrorMessage = null
        isOTPVerified = true
        //baseLoginSuccessResponse.postValue(true)
        if (isOtpFlow)
            otpObserver.postValue(Event(""))
        else {
            tcObserver.postValue(Event(""))
            if(currentPageNameForSignup != "app_open")
                HomeViewModel.postLoginAction.postValue(true)
        }

        //Notify view to load next screen
        /*val userDetailsResponse = loginUseCase.getUserDetailResponse()
        val isNewCustomer = userDetailsResponse.responseData?.isNewCustomer*/

        //sendEventLoginSignUpSuccess(isOtpFlow)
    }


    fun getTrueCallerUserDetails(
        textAuthorizationCode: String,
        clientId: String,
        authorizationCode: String,
        codeVerifier: String,
        context: Context
    ) {
        viewModelScope.launch(IO) {
            showLoader()
            val loginStatus = loginUseCase.getTrueCallerUserDetails(
                MxInternalErrorOccurred(),textAuthorizationCode,
                clientId,
                authorizationCode,
                codeVerifier,
                SharedPrefManager.getInstance().fcm,
                SharedPrefManager.getInstance().googleAdId ?: "",
                context,
                currentPageNameForSignup,
                "truecaller"
            )
            when (loginStatus) {
                LoginStatus.SUCCESS -> showNextScreen(false)
                LoginStatus.INVALID_OTP -> _eventTrueCallerLoginFailed.postValue(Event(true))
                LoginStatus.INVALID_ACCESS_TOKEN -> _eventTrueCallerLoginFailed.postValue(Event(true))
                LoginStatus.EXCEPTION_OCCURRED -> _eventTrueCallerLoginFailed.postValue(Event(true))
                LoginStatus.NULL -> _eventTrueCallerLoginFailed.postValue(Event(true))
            }
            hideLoader()
        }
    }

    /**
     * This method will initiate all SDK events for mobile number
     */
    fun loginPageViewedEvent(
        mxLoginPageViewed: MxLoginPageViewed,
        afLoginPageViewed: AFLoginPageViewed
    ) {
        sdkEventUseCase.sendLoginPageViewedEvent(mxLoginPageViewed, afLoginPageViewed)
    }

    /**
     * This will start count down timer in which start value is the time in seconds
     */
    fun startCountDownTimer(
        start: Long,
        delayInSeconds: Long = 1_000L,
    ) = flow {
        var count = start
        while (count >= 0L) {
            emit(count--)
            delay(delayInSeconds)
        }
    }

    internal fun updateFirebaseId(context: Context) {
        viewModelScope.launch(IO) {
            try {
                FirebaseMessaging.getInstance().token.addOnSuccessListener { task: String? ->
                    if (task.isNullOrEmpty()) {
                        return@addOnSuccessListener
                    }
                    try {
                        SharedPrefManager.getInstance().saveFcm(task)
                        sdkEventUseCase.pushFcmRegistrationId(task, true)
                    } catch (_: Exception) {
                    }
                }
                FirebaseAnalytics.getInstance(context).appInstanceId.addOnSuccessListener { task: String? ->
                    if (!task.isNullOrEmpty()) {
                        SharedPrefManager.getInstance().firebaseAppInstanceId = task
                    }
                }
            } catch (_: Exception) {
            }
        }
    }


    /*fun sendLoginSkippedEvent() {
        val fbCommonProperties = FbCommonProperties(
            SharedPrefManager.getInstance().loggedInUserMobile,
            "Login",
            SharedPrefManager.getInstance().loggedInUserId
        )
        if (bottomSheetPageSwitch.value == 0) {
            mixPanelEventUseCase.sendLoginSkippedEvent("login_page")
//            firebaseEventUseCase.registrationMobileNoSkip(fbCommonProperties)
//            facebookEventUseCase.sendFaceBookEvent(FacebookEvent.FACEBOOK_REGISTRATION_MOBILE_NO_SKIP)
        } else {
            mixPanelEventUseCase.sendLoginSkippedEvent("otp_page")
            if (userDetailsResponse?.responseData?.isNewCustomer == true) {
                firebaseEventUseCase.registrationOtpSkip(fbCommonProperties)
                facebookEventUseCase.sendFaceBookEvent(FacebookEvent.FACEBOOK_REGISTRATION_OTP_SKIP)
            } else {
                firebaseEventUseCase.loginMobileNoEdit(fbCommonProperties)
                facebookEventUseCase.sendFaceBookEvent(FacebookEvent.FACEBOOK_LOGIN_OTP_SKIP)
            }

        }

    }*/

    /*private fun sendEventLoginSignUpSuccess(isOtpFlow: Boolean) {
        //todo need autofill otp here temp added
        var autoFillOtp = false
        var fillType: String
        if (isOtpFlow) {
            fillType = if (autoFillOtp) "autofilled" else "keyboard_typed"
        } else {
            fillType = "truecaller"
        }
        var mxLoginSuccess = MxLoginSuccess(
            "app_open",
            fillType,
            SharedPrefManager.getInstance().loggedInUserMobile.toLong(),
            userDetailsResponse?.responseData?.totalOtpAttempts
        )
        if (userDetailsResponse?.responseData?.isNewCustomer == true) {
            mixPanelEventUseCase.sendSignUpSuccessfulEvent(mxLoginSuccess)
        } else {
            mixPanelEventUseCase.sendLoginSuccessfulEvent(mxLoginSuccess)
        }

    }*/

    /*fun sendOtpTypeEvent() {
        //todo need autofill otp here temp added
        var autoFillOtp = false
        var fillType = if (autoFillOtp) "autofilled" else "keyboard_typed"
        val mxOtpTyped = MxOtpTyped(fillType, mobileNumber.toLong())
        mixPanelEventUseCase.sendOtpTypedEvent(mxOtpTyped)
    }*/

    /*fun sendGetOtpClickedEvent() {
        var mxOtpClicked = MxOtpClicked(isNewCustomer, mobileNumber.toLong())
        mixPanelEventUseCase.sendOtpClickedEvent(mxOtpClicked)

        val fbCommonProperties = FbCommonProperties(mobileNumber, "MobileNumberFragment")

        *//*facebookEventUseCase.sendFaceBookEvent(if(isNewCustomer == true)
            FacebookEvent.FACEBOOK_REGISTRATION_OTP_REQUESTED else
            FacebookEvent.FACEBOOK_LOGIN_OTP_REQUESTED
        )*//*
        if (isNewCustomer == true) {
            //   firebaseEventUseCase.registrationOtpRequested(fbCommonProperties)
        } else {
            // firebaseEventUseCase.loginOtpRequested(fbCommonProperties)
        }
    }*/


}