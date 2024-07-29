package com.intellihealth.truemeds.presentation.viewmodel

import android.content.Context
import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.intellihealth.salt.constants.InputFieldConstants
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.user.CustomerDetailsResponse
import com.intellihealth.truemeds.data.model.user.UpdateProfileResponse
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.domain.model.CustomerDetails
import com.intellihealth.truemeds.domain.usecase.UserDataUseCase
import com.intellihealth.truemeds.domain.usecase.analytics.CleverTapEventUseCase
import com.intellihealth.truemeds.domain.usecase.analytics.MixPanelEventUseCase
import com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxProfileDetailsAdded
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxProfileDetailsEdited
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.Validator
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class EditProfileDetailViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    private val dataUseCase: UserDataUseCase,
    private val mixPanelEventUseCase: MixPanelEventUseCase,
    private val cleverTapEventUseCase: CleverTapEventUseCase,
    //private val localDbUseCase: LocalDbUseCase
) : BaseViewModel(), DefaultLifecycleObserver {
    var firstName: MutableLiveData<String> = MutableLiveData("")
    var lastName: MutableLiveData<String> = MutableLiveData("")
    var email: MutableLiveData<String> = MutableLiveData("")
    var age: MutableLiveData<String> = MutableLiveData("")
    var mobileNo: MutableLiveData<String> = MutableLiveData("")
    var gender: MutableLiveData<String> = MutableLiveData("")
    var validator = Validator()
    var isEditProfileClick = false
    var customerProfileDetails : CustomerDetailsResponse.CustomerInfo? = null

    //    var loaderValue = MutableLiveData(false)
    var showGenderError = MutableLiveData<Boolean>(false)
    private val finishActivityEvent = MutableLiveData<Event<Boolean>>()
    val loginFinishActivityEvent: LiveData<Event<Boolean>> get() = finishActivityEvent

    private val loadCustomerDetails = MutableLiveData<Event<CustomerDetailsResponse.CustomerInfo>>()
    val loadCustomerDetailsEvent: LiveData<Event<CustomerDetailsResponse.CustomerInfo>> get() = loadCustomerDetails

    private val getGender = MutableLiveData<Event<Boolean>>()
    val getGenderEvent: LiveData<Event<Boolean>> get() = getGender

    var firstNameData: MutableLiveData<ErrorMessageData> =
        MutableLiveData(ErrorMessageData("", InputFieldConstants.STATE_DEFAULT))

    var lastNameData: MutableLiveData<ErrorMessageData> =
        MutableLiveData(ErrorMessageData("", InputFieldConstants.STATE_DEFAULT))

    var emailData: MutableLiveData<ErrorMessageData> =
        MutableLiveData(ErrorMessageData("", InputFieldConstants.STATE_DEFAULT))

    var ageData: MutableLiveData<ErrorMessageData> =
        MutableLiveData(ErrorMessageData("", InputFieldConstants.STATE_DEFAULT))

    var headerType: MutableLiveData<MobileSectionHeadersModel> = MutableLiveData(
        MobileSectionHeadersModel(
            "Patient details", "", "",
            "", 0, null
        )
    )
    var apiType: Int = 0
    var mxInternalErrorOccurred=MxInternalErrorOccurred()

    val showMessage = MutableLiveData<Event<MESSAGES>>()
    val eventMessage: LiveData<Event<MESSAGES>> get() = showMessage
    var patientExperimentEditProfile: MutableLiveData<String> = MutableLiveData("")
    val requestFocus= MutableLiveData<Int>(0)

    fun getCustomerDetailsApi() {
        apiType = 1
        if (isNetworkAvailable(context)) {
            viewModelScope.launch(IO) {
                var customerDetails =
                    dataUseCase.getCustomerDetails(
                        mxInternalErrorOccurred,SharedPrefManager.getInstance().loggedInUserId.toLong()
                    )
                customerDetails?.responseData?.customerInfo?.let {
                    loadCustomerDetails.postValue(Event(it))
                }

            }
        } else
            showMessage.postValue(
              Event(
                    MESSAGES.NO_NETWORK
                )
            )
    }

    fun onSaveButtonClicked() {
        var isAllDataValid = true
        requestFocus.value = 0
        if (!validator.isValidName(firstName.value.toString().trim())) {
            if (requestFocus.value == 0) requestFocus.value = 1
            isAllDataValid = false
            firstNameData.postValue(
                ErrorMessageData(
                    "Please enter a valid name",
                    InputFieldConstants.STATE_ERROR
                )
            )
        }

        if (!email.value.isNullOrEmpty() && !validator.isValidEmail(email.value.toString())) {
            if (requestFocus.value == 0) requestFocus.value = 2
            isAllDataValid = false
            emailData.postValue(
                ErrorMessageData(
                    context.getString(R.string.enterEmail),
                    InputFieldConstants.STATE_ERROR
                )
            )
        }
        if (!validator.isValidAgeMySelf(age.value.toString())) {
            if (requestFocus.value == 0) requestFocus.value = 3
            isAllDataValid = false
            ageData.postValue(
                ErrorMessageData(
                    "Please enter valid age",
                    InputFieldConstants.STATE_ERROR
                )
            )
        }
        if (gender.value.isNullOrEmpty()) {
            if (requestFocus.value == 0) requestFocus.value = 4
           showGenderError.value=true
        }

        else if (!firstName.value.isNullOrEmpty() && isAllDataValid) {

          //  getGender.value = Event(true)
          //  Log.e("gender::::",getGender.value.toString())

            updateProfile()

        }
    }

    private fun setGender(value: String?): Int {

        return when (value) {
            "Male" -> {
                8
            }

            "Female" -> {
                9
            }

            else -> {
                10
            }
        }
    }

    fun updateProfile() {
        apiType = 2
        if (isNetworkAvailable(context)) {
        loaderValue.value = true
        viewModelScope.launch(Dispatchers.IO) {
            val res = dataUseCase.updateProfile(
                mxInternalErrorOccurred, CustomerDetails(
                    email.value.toString().trim(),
                    setGender(gender.value),
                    firstName.value.toString().trim().replace("\\s+".toRegex(), " "),
                    lastName.value.toString().trim().replace("\\s+".toRegex(), " "),
                    mobileNo.value.toString().trim(),
                    age.value!!.toInt().toString()
                ),
                SharedPrefManager.getInstance().loggedInUserId.toLong()
            )
            res?.let { response ->
                if (response.responseData.customerId.toString().isNotEmpty()) {
                    loaderValue.postValue(false)
                    // add updated customer details to DB
                    if(!isEditProfileClick) {
                        var mxProfileDetailsAdded =  MxProfileDetailsAdded(
                            "account_page",
                            firstName.value.toString().trim(),
                            lastName.value.toString().trim(),
                            mobileNo.value?.toLong(),
                            email.value.toString().trim().ifEmpty { null },
                            age.value!!.toInt(),
                            gender.value
                        )
                        mixPanelEventUseCase.sendProfileDetailsAddedEventToMixpanel(mxProfileDetailsAdded)
                        cleverTapEventUseCase.sendPatientAddedEventToCleverTap(mxProfileDetailsAdded.toCleverTap())
                    } else {
                        var mxProfileDetailsEdited = MxProfileDetailsEdited(
                            "account_page",
                            if(customerProfileDetails?.firstName?.trim().equals(firstName.value.toString().trim(), true)) null else firstName.value.toString().trim(),
                            if(customerProfileDetails?.lastName?.trim().equals(lastName.value.toString().trim(), true)) null else lastName.value.toString().trim(),
                            if(customerProfileDetails?.mobileNo?.toLong() == mobileNo.value?.toLong()) null else mobileNo.value?.toLong(),
                            if(customerProfileDetails?.emailAddress?.trim().equals(email.value.toString().trim(), true)) null else email.value.toString().trim().ifEmpty { null },
                            if(customerProfileDetails?.age?.equals(age.value!!.toInt()) == true) null else age.value!!.toInt(),
                            if(customerProfileDetails?.genderName?.trim().equals(gender.value.toString().trim(), true)) null else gender.value
                        )
                        mixPanelEventUseCase.sendProfileDetailsEditedEventToMixpanel(mxProfileDetailsEdited)
                        cleverTapEventUseCase.sendPatientAddedEventToCleverTap(mxProfileDetailsEdited.toCleverTap())
                    }
                    updateCustomerDetailsToDb(response)
                } else {
                    loaderValue.postValue(false)
                    Log.e("data==>", response.toString())
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

    fun updateCustomerDetailsToDb(response: UpdateProfileResponse) {

        val customerDetails =
            com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerDetails(
                response.responseData.customerId?.toLong(),
                mobileNo.value.toString(),
                email.value.toString(),
                "",
                response.responseData.customerName.toString(),
                gender.value,
                age.value.toString(),
                0,
                lastName.value.toString()
            )

        viewModelScope.launch(IO) {
            customerDetails.let { it1 -> localDbUseCase.addCustomerDetails(it1) }
        }
        sdkEventUseCase.sendUpdateProfileSaveEvent(FirebaseEventModel(
         mobile=mobileNo.value, customerId = response.responseData.customerId.toString(), pageName = "UpdateProfile"
        ))

        SharedPrefManager.getInstance().setUserEmail(email.value.toString().trim())

        finishActivityEvent.postValue(Event(true))
    }

    fun getPatientExperimentCategory() {
        viewModelScope.launch(Dispatchers.IO) {
            val patientExp ="B"
                //localDbUseCase.getCustomerCategory(UserCategoryEnum.PATIENT_EXPERIMENT.apiCategoryType)
            if (patientExp.isNotEmpty()) {
                patientExperimentEditProfile.postValue(patientExp)

            } else {
                patientExperimentEditProfile.postValue("A")
            }

        }
    }
}