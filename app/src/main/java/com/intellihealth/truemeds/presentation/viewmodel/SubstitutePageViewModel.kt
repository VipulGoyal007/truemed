package com.intellihealth.truemeds.presentation.viewmodel

import android.content.Context
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.intellihealth.truemeds.domain.enums.LoginStatus
import com.intellihealth.truemeds.domain.usecase.LoginUseCase
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SubstitutePageViewModel @Inject constructor(
    private val loginUseCase: LoginUseCase
) : BaseViewModelWithLogin(loginUseCase), DefaultLifecycleObserver {
    /*private val finishActivity = MutableLiveData<Event<Any>>()
    val eventFinishActivity: LiveData<Event<Any>> get() = finishActivity

    private val openOrderSummaryActivity = MutableLiveData<Event<Any>>()
    val eventOpenOrderSummaryActivity: LiveData<Event<Any>> get() = openOrderSummaryActivity

    private val openCartActivity = MutableLiveData<Event<Any>>()
    val eventOpenCartActivity: LiveData<Event<Any>> get() = openCartActivity

    private val initiateLogin = MutableLiveData<Event<Any>>()
    val eventInitiateLogin: LiveData<Event<Any>> get() = initiateLogin*/

    private val openLoginBottomSheet = MutableLiveData<Event<Any>>()
    val eventLoginOpenBottomSheet: LiveData<Event<Any>> get() = openLoginBottomSheet

    /*fun onViewCartClicked1() {
        if (SharedPrefManager.getInstance().loggedInUserAccessToken.isEmpty()) {
            */
    /**
     * Initialize Login
     * If TrueCaller bottomsheet can't be shown(this is returned by TrueCaller SDK), then open OTP based login bottomsheet
     *//*
            initiateLogin.value = Event(Any())

        } else {
            if (SharedPrefManager.getInstance().isReOrder) {
                openOrderSummaryActivity.value = Event(Any())
            } else {
                openCartActivity.value = Event(Any())
            }
            finishActivity.value = Event(Any())
        }
    }*/

    /*fun getTrueCallerUserDetails(
        textAuthorizationCode: String,
        clientId: String,
        authorizationCode: String,
        codeVerifier: String,
        context: Context
    ) = viewModelScope.launch(Dispatchers.IO) {
        try {
            val loginStatus = loginUseCase.getTrueCallerUserDetails(
                textAuthorizationCode,
                clientId,
                authorizationCode,
                codeVerifier,
                SharedPrefManager.getInstance().fcm,
                SharedPrefManager.getInstance().googleAdId,
                context
            )
            when (loginStatus) {
                LoginStatus.SUCCESS -> {
                    //for homepage bottom nav, to update data
                    SharedPrefManager.getInstance().isLoggedInFromBottomSheet = true
                    //postLoginSetUserSpecificData()
                    //hide loader
                    //showSearching.postValue(false)
                }

                LoginStatus.INVALID_OTP -> {
                    //showSearching.postValue(false)
                }


                LoginStatus.INVALID_ACCESS_TOKEN -> {
                    //showSearching.postValue(false)
                }

                LoginStatus.EXCEPTION_OCCURRED -> {
                    //showSearching.postValue(false)
                }

                LoginStatus.NULL -> {
                    //showSearching.postValue(false)
                    openLoginBottomSheet.postValue(Event(Any()))
                }
            }
        } catch (e: Exception) {
            openLoginBottomSheet.postValue(Event(Any()))
        }
    }*/
}