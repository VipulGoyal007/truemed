package com.intellihealth.truemeds.presentation.viewmodel

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxOtpTyped
import com.intellihealth.truemeds.domain.usecase.LoginUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import com.intellihealth.truemeds.presentation.viewmodel.events.Event

@HiltViewModel
class LoginViewModel @Inject constructor(
    loginUseCase: LoginUseCase
) : BaseViewModelWithLogin(loginUseCase),
    DefaultLifecycleObserver {
    var currentPageName = "login_page"
    var clickedOnPage = "app_open"
    var pageSection = ""
    var notificationPermissionCallBack = MutableLiveData<Event<Boolean>>()
    var notificationPermissionCallBackLivedata:LiveData<Event<Boolean>> = notificationPermissionCallBack


    fun sendLoginSkippedEvent(currentPageName:String, isNewCustomer: Boolean = false) {
        sdkEventUseCase.sendLoginSkippedEvent(currentPageName, isNewCustomer)
    }

    fun sendOTPTypeEvent(mxOtpTyped: MxOtpTyped) {
        sdkEventUseCase.sendOtpTypedEvent(mxOtpTyped)
    }
}