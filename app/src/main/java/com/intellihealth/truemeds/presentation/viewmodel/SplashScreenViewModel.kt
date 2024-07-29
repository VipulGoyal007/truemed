package com.intellihealth.truemeds.presentation.viewmodel

import android.annotation.SuppressLint
import android.content.Context
import android.os.CountDownTimer
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.messaging.FirebaseMessaging
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.domain.enums.ErrorType
import com.intellihealth.truemeds.domain.enums.SplashScreenImageType
import com.intellihealth.truemeds.domain.usecase.SplashScreenUseCase
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxNotificationClicked
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashScreenViewModel @Inject constructor(
    private val splashScreenUseCase: SplashScreenUseCase
) : BaseViewModel(), DefaultLifecycleObserver {
    private var _splashScreenImageType: MutableLiveData<SplashScreenImageType> =
        MutableLiveData(SplashScreenImageType.DEFAULT)
    val splashScreenImageType: LiveData<SplashScreenImageType> get() = _splashScreenImageType

    private val _openLoginActivity = MutableLiveData<Event<Any>>()
    val openLoginActivity: LiveData<Event<Any>> get() = _openLoginActivity

    private val _openHomePageActivity = MutableLiveData<Event<Any>>()
    val openHomePageActivity: LiveData<Event<Any>> get() = _openHomePageActivity

    private val _goToPlayStore = MutableLiveData(false)
    val goToPlayStore: LiveData<Boolean> get() = _goToPlayStore

    private var _secondsRemainingForLoader = MutableLiveData(5)
    val secondsRemainingForLoader: LiveData<Int> get() = _secondsRemainingForLoader

    private var isApiCallCompleted = false
    private var isNextPageLaunched = false
    private var isLoaderCountDownCompleted = false
    var intentOrderId = ""
    var intentDestinationPage: String = ""

    /**
     * If splash Screen is visible for minimum 2 second
     * and api call to check whether the current app version is active or not is completed(either success or failure)
     * then only we need to redirect to other screen
     * If Splash Screen is visible more than or equal to 3 second, then show loader
     */
    private var loaderTimer: CountDownTimer = object : CountDownTimer(30000, 1000) {
        override fun onTick(millisUntilFinished: Long) {
            _secondsRemainingForLoader.postValue(_secondsRemainingForLoader.value!!.minus(1))

            //api call completed and splash screen shown at least for 3 seconds then
            if (isApiCallCompleted && millisUntilFinished < 27000 && !isNextPageLaunched) {
                launchNextPage()
            }
        }

        override fun onFinish() {
            _secondsRemainingForLoader.postValue(5)
            _goToPlayStore.postValue(false)
            isLoaderCountDownCompleted = true
        }
    }

    private fun launchNextPage() {
        isNextPageLaunched = true
        if (SharedPrefManager.getInstance().loggedInUserAccessToken.isEmpty()) {
            _openLoginActivity.postValue(Event(Any()))
        } else {
            if (intentDestinationPage.trim().isNotEmpty() && intentDestinationPage.equals(
                    "drCallConfirmed",
                    ignoreCase = true
                )
            ) {
                sdkEventUseCase.sendNotificationClickedEvent(MxNotificationClicked("TM", 122))
            }

            _openHomePageActivity.postValue(Event(Any()))
        }
    }

    internal fun updateSplashScreenImage() {
        _splashScreenImageType.value = splashScreenUseCase.getSplashScreenImageType()
    }


    fun updateGoogleAdId(context: Context) {
        viewModelScope.launch(IO) {
            try {
                val idInfo =
                    AdvertisingIdClient.getAdvertisingIdInfo(context)
                val advertId = idInfo.id
                SharedPrefManager.getInstance().googleAdId = advertId
            } catch (_: Exception) {
            }
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

    /*internal fun cleverTapXiaomiRegistration(context: Context) {
        viewModelScope.launch(IO) {
            try {
                //CleverTap Mi Push Notification
                //call setRegion to set the region before calling registerPush
                MiPushClient.setRegion(Region.India)
                MiPushClient.registerPush(
                    context,
                    context.getString(com.intellihealth.truemeds.R.string.xiaomi_app_id),
                    context.getString(com.intellihealth.truemeds.R.string.xiaomi_app_key)
                )
                val xiaomiToken = MiPushClient.getRegId(context)
                val xiaomiRegion = MiPushClient.getAppRegion(context)
                sdkEventUseCase.pushXiaomiRegistrationId(xiaomiToken, xiaomiRegion, true)
            } catch (_: Exception) {
            }
        }
    }*/

    fun getMobileMaster(context: Context) {
        if (isNetworkAvailable(context)) {
            viewModelScope.launch(IO) {
                val response = splashScreenUseCase.getMobileMaster(
                    MxInternalErrorOccurred(), if (SharedPrefManager.getInstance().loggedInUserAccessToken.isNullOrEmpty()) null else SharedPrefManager.getInstance().loggedInUserAccessToken,
                    CommonFunc.getAppVersionName()
                )
                if (response != null) {
                      SharedPrefManager.getInstance().setMinMedDiscountToBeHidden(response.responseData?.minMedDiscountToBeHidden?:0f)
                    //SharedPrefManager.getInstance().setMinMedDiscountToBeHidden(15)
                    try {
                        if (response.responseData == null) {
                            showInternalServerError.postValue(response.message ?: "Internal server error, please try again")
                            return@launch
                        } else if (!response.responseData?.appVersionActive!!) {
                            _goToPlayStore.postValue(true)
                            return@launch
                        }
                    } catch (_: Exception) {
                    }
                    isApiCallCompleted = true
                }else{
                    showInternalServerError.postValue("Internal server error, please try again")
                }
            }
        } else {
            openErrorDialog.postValue(Event(ErrorType.NO_NETWORK))
        }
    }

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        loaderTimer.start()
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        loaderTimer.cancel()
    }

    @SuppressLint("HardwareIds")
    fun sendAppOpenedEvent(context: Context) {
        viewModelScope.launch(IO) {
            sdkEventUseCase.sendAppOpenedEvent(context)
        }
    }

}