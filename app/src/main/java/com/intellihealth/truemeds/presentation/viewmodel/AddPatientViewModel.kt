package com.intellihealth.truemeds.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse
import com.intellihealth.truemeds.data.model.user.GetAllPatientResponse
import com.intellihealth.truemeds.data.utils.ERRORS
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.domain.usecase.UserDataUseCase
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import com.intellihealth.salt.constants.AddressPatientDetailsConstants
import com.intellihealth.salt.models.HelpCategoriesItemModel
import com.intellihealth.salt.models.AddressPatientDetailsCardModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AddPatientViewModel @Inject constructor(private val userDataUseCase: UserDataUseCase) :
    ViewModel(),
    DefaultLifecycleObserver {

    private var errorType: MutableLiveData<ERRORS> =
        MutableLiveData(ERRORS.NO_ERROR)

    var patientListResponse: MutableLiveData<GetAllPatientResponse?> =
        MutableLiveData()

    private val showError = MutableLiveData<Event<ERRORS>>()
    val eventShowError: LiveData<Event<ERRORS>> get() = showError
    val patientsList: MutableLiveData<MutableList<AddressPatientDetailsCardModel>> = MutableLiveData(
        mutableListOf()
    )
    var patientsListApiResponse: MutableList<GetAllPatientResponse.Patient?> = mutableListOf()

    private val showMessage = MutableLiveData<Event<MESSAGES>>()
    val eventMessage: LiveData<Event<MESSAGES>> get() = showMessage
    var radioType= MutableLiveData<String>("male")

    fun saveButtonClick() {

        showMessage.postValue(Event(MESSAGES.ADD_PATIENT_CLICK))
    }

    fun setRadioType(type:String) {
        radioType.value=type
       // showMessage.postValue(Event(MESSAGES.ADD_PATIENT_CLICK))
    }


}