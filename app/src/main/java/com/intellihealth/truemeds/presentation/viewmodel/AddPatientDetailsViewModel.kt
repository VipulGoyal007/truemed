package com.intellihealth.truemeds.presentation.viewmodel

import android.content.Context
import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.intellihealth.salt.constants.InputFieldConstants
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.domain.model.PatientDetails
import com.intellihealth.truemeds.domain.usecase.UserDataUseCase
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.Validator
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class AddPatientDetailsViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    private val dataUseCase: UserDataUseCase
) : BaseViewModel(), DefaultLifecycleObserver {
    var firstName: MutableLiveData<String> = MutableLiveData("")
    var patientExperiment: MutableLiveData<String> = MutableLiveData("")
    var lastName: MutableLiveData<String> = MutableLiveData("")
    var age: MutableLiveData<String> = MutableLiveData("")
    var gender: MutableLiveData<Boolean> = MutableLiveData(false)
    
    var radioType = MutableLiveData<String>()
    var validator = Validator()
    var firstNameData: MutableLiveData<ErrorMessageData> =
        MutableLiveData(ErrorMessageData("", InputFieldConstants.STATE_DEFAULT))

    var lastNameData: MutableLiveData<ErrorMessageData> =
        MutableLiveData(ErrorMessageData("", InputFieldConstants.STATE_DEFAULT))

    var ageData: MutableLiveData<ErrorMessageData> =
        MutableLiveData(ErrorMessageData("", InputFieldConstants.STATE_DEFAULT))

    var headerType: MutableLiveData<MobileSectionHeadersModel> = MutableLiveData(
        MobileSectionHeadersModel("Your details","","",
            "",0, null)
    )
//    var loaderValue = MutableLiveData(false)
    var hideKeyboard = MutableLiveData(false)

    fun onSaveButtonClicked() {
        if (!validator.isValidName(firstName.value.toString().trim())) {
            firstNameData.postValue(
                ErrorMessageData(
                    context.getString(R.string.enterName),
                    InputFieldConstants.STATE_ERROR
                )
            )
        } else if (!lastName.value.toString().trim().isNullOrEmpty()&&!validator.isValidLastName(lastName.value.toString().trim())) {
            lastNameData.postValue(
                ErrorMessageData(
                    context.getString(R.string.enterLastName),
                    InputFieldConstants.STATE_ERROR
                )
            )
        } else if (!validator.isValidAge(age.value.toString())) {
            ageData.postValue(
                ErrorMessageData(
                    context.getString(R.string.enterYourAge),
                    InputFieldConstants.STATE_ERROR
                )
            )
        }
        else if (!firstName.value.isNullOrEmpty()) {
            addPatient()
        }
    }
    
    fun setRadioType(type: String) {
        radioType.postValue(type)
    }

    fun addPatient() {
        loaderValue.value = true
        hideKeyboard.value = true
        viewModelScope.launch(Dispatchers.IO) {
    
            val patient = PatientDetails(
                gender = if (radioType.value === "female") "9" else if (radioType.value === "male") "8" else "10",
                patientName = firstName.value.toString(),
                firstName = firstName.value.toString(),
                lastName = lastName.value.toString(),
                patientId = null,
                age = age.value.toString(),
                relationId = "8",
                emailAddress = null
            )
            
            
            val res = dataUseCase.addPatient(
                MxInternalErrorOccurred(),
                patient,
                SharedPrefManager.getInstance().loggedInUserId.toLong()
            )
            res?.let { response ->
                if (response.statusCode != 200 || response.statusCode != 201) {
                    loaderValue.postValue(true)
                } else {
                    loaderValue.postValue(false)
                    
                    Log.e("data==>", response.toString())
                }
            }
        }

    }
    /*fun getPatientExperiment(){
        viewModelScope.launch {
           var patientExp =  localDbUseCase.getCustomerCategory(UserCategoryEnum.PATIENT_EXPERIMENT.apiCategoryType)
            patientExperiment.postValue(patientExp)

        }
    }*/


//    fun getPatientNameList() {
//        viewModelScope.launch {
//            dataUseCase.getPatientNameList()
//        }
//
//    }

    fun checkNameExist(namString: String):Int{
        var count=0
        viewModelScope.launch(Dispatchers.IO){
           count= dataUseCase.checkNameExist(namString)
        }
        return count
    }


}