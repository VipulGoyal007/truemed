package com.intellihealth.truemeds.presentation.viewmodel

import android.content.Context
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.intellihealth.truemeds.data.model.helpfaqtnc.PrivacyPolicyAndTnCResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.domain.usecase.HelpFaqTncUseCase
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PolicyTncViewModel @Inject constructor(
    private val helpFaqTncUseCase: HelpFaqTncUseCase,
) : BaseViewModel(), DefaultLifecycleObserver {

//    var loaderValue = MutableLiveData(false)
    private lateinit var context: Context
    var apiType: Int = 0

    private var privacyTncResponseM =
        MutableLiveData<Event<List<PrivacyPolicyAndTnCResponse.Legal>>>()
    val privacyTncResponse: LiveData<Event<List<PrivacyPolicyAndTnCResponse.Legal>>> get() = privacyTncResponseM
    private val showMessage = MutableLiveData<Event<MESSAGES>>()
    val eventMessage: LiveData<Event<MESSAGES>> get() = showMessage
    var mxInternalErrorOccurred=MxInternalErrorOccurred()

    //var loaderValue = MutableLiveData<Boolean>()

    fun getPrivacyPolicyDescription(mContext: Context) {
        context = mContext
        apiType = 1
        if (isNetworkAvailable(context)) {
            loaderValue.value = true
            viewModelScope.launch(Dispatchers.IO) {
                val res = helpFaqTncUseCase.getPP(mxInternalErrorOccurred)
                res?.responseData?.Legals?.let { response ->
                    if (response.isEmpty()) {
                        loaderValue.postValue(true)
                    } else {
                        loaderValue.postValue(false)
                        privacyTncResponseM.postValue(Event(response))
                    }
                }
            }
        } else
            showMessage.postValue(
                Event(
                    MESSAGES.NO_NETWORK
                )
            )
    }

    fun getTermsConditionDescription(mContext: Context, isPrimary: Boolean) {
        context = mContext
        apiType = 2
        if (isNetworkAvailable(context)) {
            loaderValue.value = true
            viewModelScope.launch(Dispatchers.IO) {
                val res = helpFaqTncUseCase.getTNC(mxInternalErrorOccurred,isPrimary)
                res?.responseData?.Legals?.let { response ->
                    if (response.isEmpty()) {
                        loaderValue.postValue(true)
                    } else {
                        loaderValue.postValue(false)
                        privacyTncResponseM.postValue(Event(response))
                    }
                }
            }
        } else
            showMessage.postValue(
                Event(
                    MESSAGES.NO_NETWORK
                )
            )
    }

}
