package com.intellihealth.truemeds.presentation.viewmodel

import android.content.Context
import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.google.gson.Gson
import com.intellihealth.salt.constants.InputFieldConstants
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.user.GetAllPatientResponse
import com.intellihealth.truemeds.data.model.user.SavePatientResponse
import com.intellihealth.truemeds.data.utils.ERRORS
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.MessageConstant
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.domain.enums.NetworkResponseType
import com.intellihealth.truemeds.domain.model.PatientDetails
import com.intellihealth.truemeds.domain.usecase.AddPatientUseCase
import com.intellihealth.truemeds.domain.usecase.EditPatientUseCase
import com.intellihealth.truemeds.domain.usecase.ManagePatientUseCase
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MXPatientDetailsEditedImpression
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPatientAdded
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.Validator
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class ManagePatientViewModel @Inject constructor(
    private val userDataUseCase: ManagePatientUseCase,
    private val editPatientUseCase: EditPatientUseCase,
    private val addPatientUseCase: AddPatientUseCase
    //private val orderFlowUseCase: OrderFlowUseCase
) : BaseViewModel(),
    DefaultLifecycleObserver {

    private var errorType: MutableLiveData<ERRORS> =
        MutableLiveData(ERRORS.NO_ERROR)
    var selectedPatient: MutableLiveData<GetAllPatientResponse.Patient> = MutableLiveData()
    val getSelectedPatientLiveDate: LiveData<GetAllPatientResponse.Patient> get() = selectedPatient
    var _launchEditPatient = MutableLiveData<Event<GetAllPatientResponse.Patient>>()
    val patientDetails: LiveData<Event<GetAllPatientResponse.Patient>> get() = _launchEditPatient
    var _isEditPatient = MutableLiveData<Boolean>()

    //val getIsEditPatient: LiveData<Boolean> get() = _isEditPatient
    var _isMySelf = MutableLiveData<Boolean>(false)
    //val getIsMySelf: LiveData<Boolean> get() = _isMySelf

    var _isFreshUser = false
    var disableFirstName = MutableLiveData(false)
    var disableLastName = MutableLiveData(false)

    //val getIsFreshUser: LiveData<Boolean> get() = _isFreshUser
    var isSomeOneElse = MutableLiveData<Boolean>(false)

    val deletePatientEventListener: MutableLiveData<Event<Boolean>> = MutableLiveData()
    val isDelete: MutableLiveData<Event<Boolean>> = MutableLiveData()
    val updateDbAccountFragment = MutableLiveData<Boolean>()
    val eventUpdateDbAccountFragment: LiveData<Boolean> get() = updateDbAccountFragment
    var itemPosition = 0
    private val showError = MutableLiveData<Event<ERRORS>>()
    val eventShowError: LiveData<Event<ERRORS>> get() = showError
    var newlyCreatedPatientId: Long = -1

    val patientsList: MutableLiveData<List<GetAllPatientResponse.Patient>> =
        MutableLiveData(
            mutableListOf()
        )

    val showMessage = MutableLiveData<Event<MessageConstant>>()
    val eventMessage: LiveData<Event<MessageConstant>> get() = showMessage
    var showAddPatientView = MutableLiveData<Boolean>(false)
    var showPatientListView = MutableLiveData<Boolean>(false)
    var showShimmer = MutableLiveData<Boolean>(true)
    val showShimmerLiveData: LiveData<Boolean> get() = showShimmer
    var firstName: MutableLiveData<String> = MutableLiveData("")
    var firstNameHint: MutableLiveData<String> = MutableLiveData("")
    var lastName: MutableLiveData<String> = MutableLiveData("")
    var lastNameHint: MutableLiveData<String> = MutableLiveData("")
    var age: MutableLiveData<String> = MutableLiveData("")
    var ageHint: MutableLiveData<String> = MutableLiveData("")
    var emailHint: MutableLiveData<String> = MutableLiveData("")
    var yourFirstName: MutableLiveData<String> = MutableLiveData("")
    var yourLastName: MutableLiveData<String> = MutableLiveData("")
    var yourEmailId: MutableLiveData<String> = MutableLiveData("")
    var yourAge: MutableLiveData<String> = MutableLiveData("")
    var patientAge: MutableLiveData<String> = MutableLiveData("")
    var gender: MutableLiveData<Boolean> = MutableLiveData(true)
    var yourGender: MutableLiveData<Boolean> = MutableLiveData(true)
    var genderValidationStr: MutableLiveData<String> = MutableLiveData("")
    var validator = Validator()
    var firstNameData: MutableLiveData<ErrorMessageData> =
        MutableLiveData(ErrorMessageData("", InputFieldConstants.STATE_DEFAULT))

    var lastNameData: MutableLiveData<ErrorMessageData> =
        MutableLiveData(ErrorMessageData("", InputFieldConstants.STATE_DEFAULT))

    var patientAgeData: MutableLiveData<ErrorMessageData> =
        MutableLiveData(ErrorMessageData("", InputFieldConstants.STATE_DEFAULT))

    var yourFirstNameData: MutableLiveData<ErrorMessageData> =
        MutableLiveData(ErrorMessageData("", InputFieldConstants.STATE_DEFAULT))

    var yourLastNameData: MutableLiveData<ErrorMessageData> =
        MutableLiveData(ErrorMessageData("", InputFieldConstants.STATE_DEFAULT))

    var yourAgeData: MutableLiveData<ErrorMessageData> =
        MutableLiveData(ErrorMessageData("", InputFieldConstants.STATE_DEFAULT))

    var yourEmailData: MutableLiveData<ErrorMessageData> =
        MutableLiveData(ErrorMessageData("", InputFieldConstants.STATE_DEFAULT))


    var headerType: MutableLiveData<MobileSectionHeadersModel> = MutableLiveData(
        MobileSectionHeadersModel(
            "Your details", "", "",
            "", 0, null
        )
    )
    var patientExperiment: MutableLiveData<String> = MutableLiveData("A")
//    var loaderValue = MutableLiveData(false)

    var radioType = MutableLiveData<String>()
    var someOneElseRadioType = MutableLiveData<String>()
    private lateinit var context: Context

    var callSavePatientForOrder = false
    var apiType: Int = 0
    var patientIdFromUpdateProfile = 0L

    private val launchAddPatient = MutableLiveData<Event<String>>()
    val eventLaunchAddPatient: MutableLiveData<Event<String>> get() = launchAddPatient

    var _patientItemList = MutableLiveData<GetAllPatientResponse.Patient?>()
    val patientItemList: LiveData<GetAllPatientResponse.Patient?> get() = _patientItemList
    val requestFocus= MutableLiveData<Int>(0)
    var clickedOnPage = "Manage Patient"
    var mxInternalErrorOccurred=MxInternalErrorOccurred()
    var isOrderSummaryActivityOpened: Boolean = false

    fun setRadioType(type: String) {
        radioType.postValue(type)
        yourGender.postValue(true)
    }

    fun setSomeOneElseRadioType(type: String) {
        someOneElseRadioType.postValue(type)
        gender.postValue(true)
    }

    fun saveButtonClick(mContext: Context) {
        context = mContext
        onSaveButtonClicked()
        showMessage.postValue(Event(MessageConstant(MESSAGES.ADD_PATIENT_CLICK)))
    }


    fun addNewPatientsButtonClick() {
        showMessage.postValue(Event(MessageConstant(MESSAGES.ADD_PATIENT_CLICK)))
    }


    fun managePatientListItemClick(position: Int, type: String) {
        Log.e("item_click", type + ":::" + position)
        when {
            type == "edit" -> {
                viewModelScope.launch(IO) {
                    var patientExp ="B"
                        //localDbUseCase.getCustomerCategory(UserCategoryEnum.PATIENT_EXPERIMENT.apiCategoryType)
                    if (patientExp.isEmpty())
                        patientExp = "A"

                    patientExperiment.postValue(patientExp)
                    selectedPatient.postValue(patientsList.value?.get(position))
                    showMessage.postValue(Event(MessageConstant(MESSAGES.EDIT_PATIENT_DETAILS_CLICK)))
                    _launchEditPatient.postValue(Event(patientsList.value?.get(position)))
                }

            }

            type == "delete" -> {
                itemPosition = position
                deletePatientEventListener.postValue(Event(true))
            }
        }
    }

    fun deletePatientApiCalling() {
        /*showMessage.postValue(
            Event(MessageConstant(
                MESSAGES.DELETE_ADDRESS_API_CALLING
            ))
        )*/
    }

    fun deletePatient() {
        loaderValue.postValue(true)
        viewModelScope.launch {
            val response = userDataUseCase.deletePatient(
                //patientsListApiResponse[position]?.patientId.toString(),
                patientsList.value?.get(itemPosition)?.patientId.toString(),
                SharedPrefManager.getInstance().loggedInUserId.toLong()

            )
            if (response != null) {
                if (!response.isSuccess) {
                    loaderValue.postValue(false)
                    showMessage.postValue(
                        Event(
                            MessageConstant(
                                MESSAGES.DELETE_PATIENT_FAILED,
                                response.message.toString()
                            )
                        )
                    )
                } else {
                    loaderValue.postValue(false)
                    getPatientDetails()
                    isDelete.postValue(Event(false))
                    deletePatientEventListener.postValue(Event(false))
                    showMessage.postValue(
                        Event(
                            MessageConstant(
                                MESSAGES.DELETE_PATIENT_SUCCESSFULLY,
                                response.message.toString()
                            )
                        )
                    )

                }
            }
        }
    }

    fun removeSelectedItem(selectedItem: Int) {
        val currentList = patientsList.value?.toMutableList() ?: mutableListOf()
        currentList.removeAt(selectedItem)
        patientsList.postValue(currentList)
    }


    fun getPatientList() {
        viewModelScope.launch(IO) {
            var patientExp ="B"
                //localDbUseCase.getCustomerCategory(UserCategoryEnum.PATIENT_EXPERIMENT.apiCategoryType)
            if (patientExp.isEmpty())
                patientExp = "A"
            patientExperiment.postValue(patientExp)
        }
        getPatientDetails()

    }

    fun onSaveButtonClicked() {
        if (_isEditPatient.value == true) {
            gender.postValue(true)
            yourGender.postValue(true)
            validateEditPatient()


            val patient_type = if (_patientItemList.value?.relationId === 5) "Myself" else "Someone else"
            val name_edited: Boolean = if(patientExperiment.value.equals("A",true)) (!yourFirstName.value?.trim().equals(_patientItemList.value?.patientName?.trim(), true))
            else (!yourFirstName.value?.trim().equals(_patientItemList.value?.firstName?.trim(), true) || !yourLastName.value?.trim().equals(_patientItemList.value?.lastName?.trim(), true))
            val age_edited: Boolean = (yourAge.value != (_patientItemList.value?.age))
            var gender_edited = false

             if(radioType.value != null && (radioType.value.equals("Other",true))
                && (_patientItemList.value?.genderName.equals("Others",true)))
                gender_edited=false
            else if(radioType.value != null && ((radioType.value)?.uppercase() != (_patientItemList.value?.genderName)))
                    gender_edited=true


            sdkEventUseCase.sendPatientDetailsEditedEvent(
                        MXPatientDetailsEditedImpression(
                            patientType = if(_patientItemList.value?.relationName.equals(patient_type, true)) null else patient_type,
                            nameEdited = if(name_edited) name_edited else null,
                            ageEdited = if(age_edited) age_edited else null,
                            genderEdited  = if(gender_edited) gender_edited else null,
                            emailId = if(_patientItemList.value?.emailId?.trim().equals(yourEmailId.value.toString().trim(), true)) null else yourEmailId.value.toString().trim().ifEmpty { null }
                        )
            )


        } /*else if (_isFreshUser.value == true) {
            validatePatient()
        }*/
        else if (_isFreshUser) {
            validateFreshUser()
        } else {
            validateMySelf()
        }
    }

    private fun validateEditPatient() {
        requestFocus.value = 0
        var isAllDataValid = true
        if (yourFirstName.value?.length == 1) {
            if (requestFocus.value == 0) requestFocus.value = 1
            isAllDataValid = false
            val errMsg = if (patientExperiment.value.equals("A", true)) {
                context.getString(R.string.please_enter_a_valid_name)
            } else {
                context.getString(R.string.please_enter_a_valid_name)
            }
            yourFirstNameData.postValue(
                ErrorMessageData(
                    errMsg,
                    InputFieldConstants.STATE_ERROR
                )
            )
        } else if (!validator.isValidName(yourFirstName.value.toString().trim())) {
            if (requestFocus.value == 0) requestFocus.value = 1
            isAllDataValid = false

            var errMsg = if (patientExperiment.value.equals("A", true)) {
                context.getString(R.string.please_enter_a_valid_name)
            } else {
                context.getString(R.string.please_enter_a_valid_name)
            }
            yourFirstNameData.postValue(
                ErrorMessageData(
                    errMsg,
                    InputFieldConstants.STATE_ERROR
                )
            )
        }
        if (!yourLastName.value.toString().trim().isNullOrEmpty() && !validator.isValidLastName(
                yourLastName.value.toString().trim()
            )
        ) {
            if (requestFocus.value == 0) requestFocus.value = 2
            isAllDataValid = false

            var errMsg = context.getString(R.string.enterValidLastName)

            yourLastNameData.postValue(
                ErrorMessageData(
                    errMsg,
                    InputFieldConstants.STATE_ERROR
                )
            )
        }
        if (!yourEmailId.value.toString().trim().isNullOrEmpty() && !validator.isValidEmail(
                yourEmailId.value.toString().trim()
            )
        ) {
            if (requestFocus.value == 0) requestFocus.value = 3
            isAllDataValid = false

            var errMsg = context.getString(R.string.enterEmail)

            yourEmailData.postValue(
                ErrorMessageData(
                    errMsg,
                    InputFieldConstants.STATE_ERROR
                )
            )
        }
        if (yourAge.value.isNullOrEmpty()) {
            if (requestFocus.value == 0) requestFocus.value = 4
            isAllDataValid = false
            val errMsg = if (patientExperiment.value.equals("A", true)) {
                context.getString(R.string.enterValidAge)
            } else {
                context.getString(R.string.enterValidAge)
            }
            yourAgeData.postValue(
                ErrorMessageData(
                    errMsg,
                    InputFieldConstants.STATE_ERROR
                )
            )
        }
        if (_isMySelf.value == true) {
            if (!validator.isValidAgeMySelf(yourAge.value.toString())) {
                if (requestFocus.value == 0) requestFocus.value = 5
                isAllDataValid = false
                yourAgeData.postValue(
                    ErrorMessageData(
                        context.getString(R.string.enterValidAge),
                        InputFieldConstants.STATE_ERROR
                    )
                )
            } else if (isAllDataValid) {
                editPatient()
            }
        } else if (_isMySelf.value == false) {
            if (!validator.isValidAge(yourAge.value.toString())) {
                if (requestFocus.value == 0) requestFocus.value = 5
                isAllDataValid = false
                yourAgeData.postValue(
                    ErrorMessageData(
                        context.getString(R.string.enterValidAge),
                        InputFieldConstants.STATE_ERROR
                    )
                )
            } else if (isAllDataValid) {
                editPatient()
            }
        } else if (isAllDataValid) {
            editPatient()
        }
    }

    private fun validateFreshUser() {
        requestFocus.value = 0
        if (isSomeOneElse.value == true) {
            var isAllDataValid = true
            if (yourFirstName.value?.length == 1) {
                if (requestFocus.value == 0) requestFocus.value = 1
                isAllDataValid = false
                val errMsg = if (patientExperiment.value.equals("A", true)) {
                    context.getString(R.string.please_enter_a_valid_name)
                } else {
                    context.getString(R.string.please_enter_a_valid_name)
                }
                yourFirstNameData.postValue(
                    ErrorMessageData(
                        errMsg,
                        InputFieldConstants.STATE_ERROR
                    )
                )
            } else if (!validator.isValidName(yourFirstName.value.toString().trim())) {
                if (requestFocus.value == 0) requestFocus.value = 1
                isAllDataValid = false

                val errMsg = if (patientExperiment.value.equals("A", true)) {
                    context.getString(R.string.please_enter_a_valid_name)
                } else {
                    context.getString(R.string.please_enter_a_valid_name)
                }
                yourFirstNameData.postValue(
                    ErrorMessageData(
                        errMsg,
                        InputFieldConstants.STATE_ERROR
                    )
                )
            }
            if (!lastName.value.toString().trim().isNullOrEmpty() && !validator.isValidLastName(
                    lastName.value.toString().trim()
                )
            ) {
                if (requestFocus.value == 0) requestFocus.value = 2
                isAllDataValid = false

                var errMsg = context.getString(R.string.enterValidLastName)

                lastNameData.postValue(
                    ErrorMessageData(
                        errMsg,
                        InputFieldConstants.STATE_ERROR
                    )
                )

            }
            if (yourAge.value.isNullOrEmpty()) {
                if (requestFocus.value == 0) requestFocus.value = 4
                isAllDataValid = false
                var errMsg = if (patientExperiment.value.equals("A", true)) {
                    context.getString(R.string.enterValidAge)
                } else {
                    context.getString(R.string.enterValidAge)
                }

                yourAgeData.postValue(
                    ErrorMessageData(
                        errMsg,
                        InputFieldConstants.STATE_ERROR
                    )
                )
            } else if (!validator.isValidAgeMySelf(yourAge.value.toString())) {
                if (requestFocus.value == 0) requestFocus.value = 4
                isAllDataValid = false
                yourAgeData.postValue(
                    ErrorMessageData(
                        context.getString(R.string.enterValidAge),
                        InputFieldConstants.STATE_ERROR
                    )
                )
            }
            if (radioType.value.isNullOrEmpty()) {
                if (requestFocus.value == 0) requestFocus.value = 5
                isAllDataValid = false
                genderValidationStr.value = context.getString(R.string.gender_validation)

                yourGender.postValue(false)
            }
            if (yourGender.value == false) {
                if (requestFocus.value == 0) requestFocus.value = 5
                isAllDataValid = false

            }
            if (firstName.value?.length == 1) {
                if (requestFocus.value == 0) requestFocus.value = 6
                isAllDataValid = false
                val errMsg = if (patientExperiment.value.equals("A", true)) {
                    context.getString(R.string.please_enter_a_valid_name)
                } else {
                    context.getString(R.string.please_enter_a_valid_name)
                }
                firstNameData.postValue(
                    ErrorMessageData(
                        errMsg,
                        InputFieldConstants.STATE_ERROR
                    )
                )
            } else if (!validator.isValidName(firstName.value.toString().trim())) {
                if (requestFocus.value == 0) requestFocus.value = 6
                isAllDataValid = false

                var errMsg = if (patientExperiment.value.equals("A", true)) {
                    context.getString(R.string.please_enter_a_valid_name)
                } else {
                    context.getString(R.string.please_enter_a_valid_name)
                }

                firstNameData.postValue(
                    ErrorMessageData(
                        errMsg,
                        InputFieldConstants.STATE_ERROR
                    )
                )
            }
            if (!yourLastName.value.toString().trim().isNullOrEmpty() && !validator.isValidLastName(
                    yourLastName.value.toString().trim()
                )
            ) {
                if (requestFocus.value == 0) requestFocus.value = 7
                isAllDataValid = false

                var errMsg = context.getString(R.string.enterValidLastName)

                yourLastNameData.postValue(
                    ErrorMessageData(
                        errMsg,
                        InputFieldConstants.STATE_ERROR
                    )
                )
            }
            if (age.value.isNullOrEmpty()) {
                if (requestFocus.value == 0) requestFocus.value = 8
                isAllDataValid = false
                var errMsg = if (patientExperiment.value.equals("A", true)) {
                    context.getString(R.string.enterValidAge)
                } else {
                    context.getString(R.string.enterValidAge)
                }
                patientAgeData.postValue(
                    ErrorMessageData(
                        errMsg,
                        InputFieldConstants.STATE_ERROR
                    )
                )
            }
            if (!yourEmailId.value.toString().trim().isNullOrEmpty() && !validator.isValidEmail(
                    yourEmailId.value.toString().trim()
                )
            ) {
                if (requestFocus.value == 0) requestFocus.value = 3
                isAllDataValid = false

                var errMsg = context.getString(R.string.enterEmail)

                yourEmailData.postValue(
                    ErrorMessageData(
                        errMsg,
                        InputFieldConstants.STATE_ERROR
                    )
                )
            }
            else if (!validator.isValidAge(age.value.toString())) {
                if (requestFocus.value == 0) requestFocus.value = 8
                isAllDataValid = false
                patientAgeData.postValue(
                    ErrorMessageData(
                        context.getString(R.string.enterValidAge),
                        InputFieldConstants.STATE_ERROR
                    )
                )
            }
            if (someOneElseRadioType.value.isNullOrEmpty()) {
                if (requestFocus.value == 0) requestFocus.value = 9
                isAllDataValid = false
                genderValidationStr.value = context.getString(R.string.gender_validation)
                gender.postValue(false)
            }
            if (gender.value == false) {
                isAllDataValid = false
            } else if (isAllDataValid) {
                apiType = 2
                if (gender.value == false) {
                    isAllDataValid = false
                } else if (isAllDataValid) {
                    addFreshUser(true)
                }
            }

        }
        // this is myself case validation checking and calling api
        else if (isSomeOneElse.value == false) {
            var isAllDataValid = true
            if (yourFirstName.value?.length == 1) {
                if (requestFocus.value == 0) requestFocus.value = 1
                isAllDataValid = false
                var errMsg = if (patientExperiment.value.equals("A", true)) {
                    context.getString(R.string.please_enter_a_valid_name)
                } else {
                    context.getString(R.string.please_enter_a_valid_name)
                }
                yourFirstNameData.postValue(
                    ErrorMessageData(
                        errMsg,
                        InputFieldConstants.STATE_ERROR
                    )
                )
            } else if (!validator.isValidName(yourFirstName.value.toString().trim())) {
                if (requestFocus.value == 0) requestFocus.value = 1
                isAllDataValid = false
                var errMsg = if (patientExperiment.value.equals("A", true)) {
                    context.getString(R.string.please_enter_a_valid_name)
                } else {
                    context.getString(R.string.please_enter_a_valid_name)
                }
                yourFirstNameData.postValue(
                    ErrorMessageData(
                        errMsg,
                        InputFieldConstants.STATE_ERROR
                    )
                )
            }
            if (!yourLastName.value.toString().trim().isNullOrEmpty() && !validator.isValidLastName(
                    yourLastName.value.toString().trim()
                )
            ) {
                if (requestFocus.value == 0) requestFocus.value = 2
                isAllDataValid = false

                var errMsg = context.getString(R.string.enterValidLastName)

                yourLastNameData.postValue(
                    ErrorMessageData(
                        errMsg,
                        InputFieldConstants.STATE_ERROR
                    )
                )
            }
            if (!yourEmailId.value.toString().trim().isNullOrEmpty() && !validator.isValidEmail(
                    yourEmailId.value.toString().trim()
                )
            ) {
                if (requestFocus.value == 0) requestFocus.value = 3
                isAllDataValid = false

                var errMsg = context.getString(R.string.enterEmail)

                yourEmailData.postValue(
                    ErrorMessageData(
                        errMsg,
                        InputFieldConstants.STATE_ERROR
                    )
                )

            }
            if (yourAge.value.isNullOrEmpty()) {
                if (requestFocus.value == 0) requestFocus.value = 4
                isAllDataValid = false
                val errMsg = if (patientExperiment.value.equals("A", true)) {
                    context.getString(R.string.enterValidAge)
                } else {
                    context.getString(R.string.enterValidAge)
                }
                yourAgeData.postValue(
                    ErrorMessageData(
                        errMsg,
                        InputFieldConstants.STATE_ERROR
                    )
                )
            } else if (!validator.isValidAgeMySelf(yourAge.value.toString())) {
                if (requestFocus.value == 0) requestFocus.value = 4
                isAllDataValid = false
                yourAgeData.postValue(
                    ErrorMessageData(
                        context.getString(R.string.enterValidAge),
                        InputFieldConstants.STATE_ERROR
                    )
                )
            }

            if (radioType.value.isNullOrEmpty()) {
                if (requestFocus.value == 0) requestFocus.value = 5
                isAllDataValid = false
                genderValidationStr.value = context.getString(R.string.gender_validation)
                yourGender.postValue(false)
            } else if (yourGender.value == false) {
                isAllDataValid = false
                // apiType = 3
                //  addFreshUser(false)

            } else if (isAllDataValid) {
                apiType = 3
                addFreshUser(false)
            }
        }
    }

    private fun validateMySelf() {
        requestFocus.value = 0
        var isAllDataValid = true
        if (yourFirstName.value?.length == 1) {
            if (requestFocus.value == 0) requestFocus.value = 1
            isAllDataValid = false
            val errMsg = if (patientExperiment.value.equals("A", true)) {
                context.getString(R.string.please_enter_a_valid_name)
            } else {
                context.getString(R.string.please_enter_a_valid_name)
            }
            yourFirstNameData.postValue(
                ErrorMessageData(
                    errMsg,
                    InputFieldConstants.STATE_ERROR
                )
            )
        } else if (!validator.isValidName(yourFirstName.value.toString().trim())) {
            if (requestFocus.value == 0) requestFocus.value = 1
            isAllDataValid = false
            var errMsg = if (patientExperiment.value.equals("A", true)) {
                context.getString(R.string.please_enter_a_valid_name)
            } else {
                context.getString(R.string.please_enter_a_valid_name)
            }
            yourFirstNameData.postValue(
                ErrorMessageData(
                    errMsg,
                    InputFieldConstants.STATE_ERROR
                )
            )
        }
        if (!yourLastName.value.toString().trim().isNullOrEmpty() && !validator.isValidLastName(
                yourLastName.value.toString().trim()
            )
        ) {
            if (requestFocus.value == 0) requestFocus.value = 2
            isAllDataValid = false

            var errMsg = context.getString(R.string.enterValidLastName)

            yourLastNameData.postValue(
                ErrorMessageData(
                    errMsg,
                    InputFieldConstants.STATE_ERROR
                )
            )
        }
        if (!yourEmailId.value.toString().trim().isNullOrEmpty() && !validator.isValidEmail(
                yourEmailId.value.toString().trim()
            )
        ) {
            if (requestFocus.value == 0) requestFocus.value = 3
            isAllDataValid = false

            var errMsg = context.getString(R.string.enterEmail)

            yourEmailData.postValue(
                ErrorMessageData(
                    errMsg,
                    InputFieldConstants.STATE_ERROR
                )
            )
        }
        if (yourAge.value.isNullOrEmpty()) {
            if (requestFocus.value == 0) requestFocus.value = 4
            isAllDataValid = false
            val errMsg = if (patientExperiment.value.equals("A", true)) {
                context.getString(R.string.enterValidAge)
            } else {
                context.getString(R.string.enterValidAge)
            }
            yourAgeData.postValue(
                ErrorMessageData(
                    errMsg,
                    InputFieldConstants.STATE_ERROR
                )
            )
        } else if (!validator.isValidAge(yourAge.value.toString())) {
            if (requestFocus.value == 0) requestFocus.value = 4
            isAllDataValid = false
            yourAgeData.postValue(
                ErrorMessageData(
                    context.getString(R.string.enterValidAge),
                    InputFieldConstants.STATE_ERROR
                )
            )
        }
        if (radioType.value.isNullOrEmpty()) {
            if (requestFocus.value == 0) requestFocus.value = 5
            isAllDataValid = false
            genderValidationStr.value = context.getString(R.string.gender_validation)
            yourGender.postValue(false)
        } else if (yourGender.value == false) {
            if (requestFocus.value == 0) requestFocus.value = 5
            isAllDataValid = false
        } else if (isAllDataValid) {
            addPatient()

        }
    }

    fun getPatientDetails() {
        viewModelScope.launch {
            val response = userDataUseCase.getAllPatients(
                true,
                SharedPrefManager.getInstance().loggedInUserId.toLong()
                //SharedPrefManager.getInstance().loggedInUserId.toLong()
            )

            Log.e("response::::", response.toString())

            if (response != null) {
                response.PatientList?.let { patientList ->
                    patientsList.postValue(patientList)
                    Log.e("data5==>", patientList.toString())


                    when {
                        !patientList.isNullOrEmpty() -> {
                            showShimmer.postValue(false)
                            showPatientListView.postValue(true)
                            showAddPatientView.postValue(false)
                            _isFreshUser = false
                        }

                        else -> {
                            _isFreshUser = true
                            showShimmer.postValue(false)
                            showPatientListView.postValue(false)
                            showAddPatientView.postValue(true)
                            showError.postValue(Event(ERRORS.NO_PATIENT_FOUND))
                        }
                    }
                }
            } else {
                _isFreshUser = true
                showShimmer.postValue(false)
                showPatientListView.postValue(false)
                showAddPatientView.postValue(true)
                showError.postValue(Event(ERRORS.NO_PATIENT_FOUND))
            }
        }
    }

    fun editPatient() {
        apiType = 1
        if (isNetworkAvailable(context)) {
            loaderValue.postValue(true)
            viewModelScope.launch(IO) {
                val patientJson = Gson().toJson(getSelectedPatientLiveDate.value)
                val patient: GetAllPatientResponse.Patient? =
                    Gson().fromJson(patientJson, GetAllPatientResponse.Patient::class.java)
                /*val editDetails = PatientDetails(
                    gender = patient?.gender.toString(),
                    patientName = patient?.patientName.toString(),
                    lastName = patient?.patientLastName.toString(),
                    firstName = patient?.patientName.toString(),
                    patientId = patient?.patientId.toString(),
                    relationId = patient?.relationId.toString(),
                    //patientId = getSelectedPatientLiveDate.value?.patientId!!.toString(),
                    age = yourAge.value.toString(),
                    //relationId = getSelectedPatientLiveDate.value?.relationId.toString(),
                    emailAddress = null
                )*/
                var yourLastNameStr = if (patientExperiment.value.equals("A")) {
                    ""
                } else {
                    yourLastName.value.toString()
                }
                val editDetails = PatientDetails(
                    gender = if (radioType.value === "female") "9" else if (radioType.value === "male") "8" else "10",
                    patientName = yourFirstName.value.toString().trim().replace("\\s+".toRegex(), " "),
                    lastName = yourLastNameStr.trim().replace("\\s+".toRegex(), " "),
                    firstName = yourFirstName.value.toString().trim().replace("\\s+".toRegex(), " "),
                    patientId = patient?.patientId.toString(),
                    relationId = patient?.relationId.toString(),
                    //patientId = getSelectedPatientLiveDate.value?.patientId!!.toString(),
                    age = yourAge.value!!.toInt().toString(),
                    //relationId = getSelectedPatientLiveDate.value?.relationId.toString(),
                    emailAddress = yourEmailId.value.toString().trim().replace("\\s+".toRegex(), " ")
                )
                if (patient?.relationId.toString().equals("5")) {
                    loaderValue.postValue(true)
                    viewModelScope.launch(IO) {
                        //val mySelfDetails = PatientDetails(gender = "8", patientName = yourFirstName.value.toString(), firstName = yourFirstName.value.toString(),lastName = yourLastName.value.toString(), patientId = "", age = yourAge.value.toString(), relationId = "", emailAddress = null)

                        //addPatientUseCase.updateProfileForFreshUser(mySelfDetails,1784)

                        val resSelfDetails = addPatientUseCase.updateProfileForFreshUser(
                            mxInternalErrorOccurred,editDetails, SharedPrefManager.getInstance().loggedInUserId.toLong()
                        )
                        resSelfDetails?.let { response ->
                            if (response.toString().isNullOrEmpty()) {
                                loaderValue.postValue(false)
                                showMessage.postValue(Event(MessageConstant(MESSAGES.EDIT_PATIENT_FAILED)))
                            } else {
                                loaderValue.postValue(false)
                                newlyCreatedPatientId = response.responseData.patientId ?: 0
                                Log.i("newlyCreatedPatientId",""+newlyCreatedPatientId)
                                SharedPrefManager.getInstance().setUserEmail(editDetails.emailAddress)
                                showMessage.postValue(Event(MessageConstant(MESSAGES.EDIT_PATIENT_SUCCESSFULLY)))
                                updateCustomerDetailsToDb(
                                    editDetails,
                                    SharedPrefManager.getInstance().loggedInUserId.toLong()
                                )
                            }

                        }
                    }
                } else {
                    val res = editPatientUseCase.editPatient(
                        mxInternalErrorOccurred,editDetails,
                        SharedPrefManager.getInstance().loggedInUserId.toLong(),
                        getSelectedPatientLiveDate.value?.patientId!!.toLong()
                    )
                    Log.e("data3==>", editDetails.toString())
                    res?.let { response ->
                        if (!response.isSuccess) {
                            loaderValue.postValue(false)
                            showMessage.postValue(
                                Event(
                                    MessageConstant(
                                        MESSAGES.EDIT_PATIENT_FAILED,
                                        response.message.toString()
                                    )
                                )
                            )
                        } else {
                            loaderValue.postValue(false)
                            newlyCreatedPatientId = response.responseData.patientId ?: 0
                            Log.i("newlyCreatedPatientId",""+newlyCreatedPatientId)
                            showMessage.postValue(Event(MessageConstant(MESSAGES.EDIT_PATIENT_SUCCESSFULLY)))
                        }
                    }
                }

            }

        } else
            showError.postValue(Event(ERRORS.NO_NETWORK))

    }

    private fun updateProfileForFreshUser(mySelfDetails: PatientDetails) {
        loaderValue.postValue(true)
        viewModelScope.launch(IO) {
            //val mySelfDetails = PatientDetails(gender = "8", patientName = yourFirstName.value.toString(), firstName = yourFirstName.value.toString(),lastName = yourLastName.value.toString(), patientId = "", age = yourAge.value.toString(), relationId = "", emailAddress = null)

            //addPatientUseCase.updateProfileForFreshUser(mySelfDetails,1784)

            updateProfileUseCase(mySelfDetails)
        }
    }

    private suspend fun updateProfileUseCase(mySelfDetails: PatientDetails) {
        val resSelfDetails = addPatientUseCase.updateProfileForFreshUser(
            mxInternalErrorOccurred,mySelfDetails, SharedPrefManager.getInstance().loggedInUserId.toLong()
        )
        if (resSelfDetails == null) {
            loaderValue.postValue(false)
        }
        resSelfDetails?.let { response ->
            patientIdFromUpdateProfile = response.responseData.patientId ?: 0L
            newlyCreatedPatientId = response.responseData.patientId ?: 0
            if (response.toString().isNullOrEmpty()) {
                loaderValue.postValue(false)
            } else {
                loaderValue.postValue(false)
                Log.e("data9==>", response.toString())
                //freshPatient(mySelfDetails)
                addMyself(mySelfDetails)
            }
        }
    }
    /*
        private fun freshPatient(mySelfDetails: PatientDetails) {
            loaderValue.postValuetrue
            viewModelScope.launch(Dispatchers.IO) {
                val patientJson = Gson().toJson(getSelectedPatientLiveDate.value)
                val patient: GetAllPatientResponse.Patient? =
                    Gson().fromJson(patientJson, GetAllPatientResponse.Patient::class.java)
                val editDetails = PatientDetails(
                    gender = patient?.gender.toString(),
                    patientName = patient?.patientName.toString(),
                    lastName = patient?.patientLastName.toString(),
                    firstName = patient?.patientName.toString(),
                    patientId = patient?.patientId.toString(),
                    relationId = patient?.relationId.toString(),
                    //patientId = getSelectedPatientLiveDate.value?.patientId!!.toString(),
                    age = yourAge.value.toString(),
                    //relationId = getSelectedPatientLiveDate.value?.relationId.toString(),
                    emailAddress = null
                )
                val res = addPatientUseCase.updateProfile(
                    mySelfDetails,
                    SharedPrefManager.getInstance().loggedInUserId.toLong())
                Log.e("data3==>", editDetails.toString());
                res?.let { response ->
                    if (response.toString().isNullOrEmpty()) {
                        loaderValue.postValue(false)
                        showMessage.postValue(Event(MESSAGES.EDIT_PATIENT_FAILED))
                    } else {
                        loaderValue.postValue(false)
                        showMessage.postValue(Event(MESSAGES.EDIT_PATIENT_SUCCESSFULLY))

                    }
                }
            }

        }
    */

    fun addFreshUser(isPatientWithUser: Boolean) {

        if (isNetworkAvailable(context)) {
            loaderValue.postValue(true)
            viewModelScope.launch(IO) {


                var patientLastNameStr = if (patientExperiment.value.equals("A")) {
                    ""
                } else {
                    lastName.value.toString()
                }
                val patientDetails = PatientDetails(
                    gender = if (someOneElseRadioType.value === "female") "9" else if (someOneElseRadioType.value === "male") "8" else "10",
                    patientName = firstName.value.toString().trim().replace("\\s+".toRegex(), " "),
                    firstName = firstName.value.toString().trim().replace("\\s+".toRegex(), " "),
                    lastName = patientLastNameStr.trim().replace("\\s+".toRegex(), " "),
                    patientId = null,
                    age = if (age.value == "") "18" else age.value?.toInt().toString(),
                    relationId = "8",
                    emailAddress = customerEmail.value
                )

                var yourLastNameStr = if (patientExperiment.value.equals("A")) {
                    ""
                } else {
                    yourLastName.value.toString()
                }
                val mySelfDetails = PatientDetails(
                    gender = if (radioType.value === "female") "9" else if (radioType.value === "male") "8" else "10",
                    patientName = yourFirstName.value.toString().trim().replace("\\s+".toRegex(), " "),
                    firstName = yourFirstName.value.toString().trim().replace("\\s+".toRegex(), " "),
                    lastName = yourLastNameStr.trim().replace("\\s+".toRegex(), " "),
                    patientId = null,
                    age = yourAge.value!!.toInt().toString(),
                    relationId = "5",
                    emailAddress = yourEmailId.value.toString().trim().replace("\\s+".toRegex(), " ")
                )

                Log.e("MySelfDTO", patientDetails.toString())
                Log.e("data2==>", mySelfDetails.toString())

                if (isPatientWithUser) {
                    //updateProfileForFreshUser(mySelfDetails)
                    updateProfileUseCase(mySelfDetails)

                    val resPatientDetails = addPatientUseCase.addPatient(
                        mxInternalErrorOccurred,patientDetails, SharedPrefManager.getInstance().loggedInUserId.toLong()
                    )
                    resPatientDetails?.let { response ->
                        if (response.statusCode == 200) {
                            newlyCreatedPatientId = response.responseData.patientId ?: 0
                            Log.d("TAG", "addFreshUser: $newlyCreatedPatientId")

                            if (callSavePatientForOrder && SharedPrefManager.getInstance().incompleteOrderId > 0) {
                                savePatientForOrder(
                                    SharedPrefManager.getInstance().incompleteOrderId,
                                    response.responseData.patientId ?: 0,
                                    SharedPrefManager.getInstance().loggedInUserId
                                )
                            } else {
                                showMessage.postValue(
                                    Event(
                                        MessageConstant(
                                            MESSAGES.ADD_PATIENT_SUCCESSFULLY,
                                            response.message.toString()
                                        )
                                    )
                                )
                            }


                            //event for myself
                          /*  sendPatientAddedEvent(
                                MxPatientAdded(yourAge.value?.toInt(), clickedOnPage,
                                if (radioType.value === "female") "Female" else if (radioType.value === "male") "Male" else "Other"
                                ,yourFirstName.value, "5", if(patientExperiment.value.equals("B",true)) yourLastName.value?.isNotEmpty() else null, SharedPrefManager.getInstance().selectedWarehouseID)
                            )*/

                            //event for someoneelse
                            sendPatientAddedEvent(
                                MxPatientAdded(age.value?.toInt(), clickedOnPage,
                                    if (someOneElseRadioType.value === "female") "Female" else if (someOneElseRadioType.value === "male") "Male" else "Other"
                                    ,firstName.value, "8", if(patientExperiment.value.equals("B",true)) patientLastNameStr.isNotEmpty() else null, SharedPrefManager.getInstance().selectedWarehouseID, emailAdded = yourEmailId.value.toString().trim().ifEmpty { null })
                            )

                        } else {
                            loaderValue.postValue(false)
                            showMessage.postValue(
                                Event(
                                    MessageConstant(
                                        MESSAGES.ADD_PATIENT_FAILED,
                                        response.message.toString()
                                    )
                                )
                            )

//                            loaderValue.postValue(false)
                            Log.e("data10==>", response.toString())

                        }
                    }
                } else {
                    updateProfileForFreshUser(mySelfDetails)
                }

            }


        } else
            showError.postValue(Event(ERRORS.NO_NETWORK))

    }

    fun addPatient() {
        apiType = 4
        if (isNetworkAvailable(context)) {
            loaderValue.postValue(true)
            viewModelScope.launch(IO) {
                val mySelfDetails = PatientDetails(
                    gender = if (radioType.value === "female") "9" else if (radioType.value === "male") "8" else "10",
                    patientName = yourFirstName.value.toString().trim().replace("\\s+".toRegex(), " "),
                    firstName = yourFirstName.value.toString().trim().replace("\\s+".toRegex(), " "),
                    lastName = yourLastName.value.toString().trim().replace("\\s+".toRegex(), " "),
                    patientId = null,
                    age = yourAge.value!!.toInt().toString(),
                    relationId = "8",
                    emailAddress = yourEmailId.value.toString().trim().replace("\\s+".toRegex(), " ")
                )

                Log.e("data2==>", mySelfDetails.toString())

                val resPatientDetails = addPatientUseCase.addPatient(
                    mxInternalErrorOccurred,mySelfDetails, SharedPrefManager.getInstance().loggedInUserId.toLong()
                )
                resPatientDetails?.let { response ->
                    if (response.statusCode == 200) {
                        newlyCreatedPatientId = response.responseData.patientId ?: 0
                        if (callSavePatientForOrder && SharedPrefManager.getInstance().incompleteOrderId > 0) {
                            savePatientForOrder(
                                SharedPrefManager.getInstance().incompleteOrderId,
                                response.responseData.patientId ?: 0,
                                SharedPrefManager.getInstance().loggedInUserId
                            )
                        } else {
                            showMessage.postValue(
                                Event(
                                    MessageConstant(
                                        MESSAGES.ADD_PATIENT_SUCCESSFULLY,
                                        response.message.toString()
                                    )
                                )
                            )
                        }

                        //event for someone else
                        sendPatientAddedEvent(
                            MxPatientAdded(yourAge.value?.toInt(), clickedOnPage,
                                if (radioType.value === "female") "Female" else if (radioType.value === "male") "Male" else "Other"
                                ,yourFirstName.value, "8", if(patientExperiment.value.equals("B",true)) yourLastName.value?.isNotEmpty() else null, SharedPrefManager.getInstance().selectedWarehouseID, emailAdded = yourEmailId.value.toString().trim().ifEmpty { null })
                        )

                    } else {
                        loaderValue.postValue(false)
                        showMessage.postValue(
                            Event(
                                MessageConstant(
                                    MESSAGES.ADD_PATIENT_FAILED,
                                    response.message.toString()
                                )
                            )
                        )
//                        loaderValue.postValue(false)
                        Log.e("data1==>", response.toString())
//                        showMessage.postValue(Event(MessageConstant(MESSAGES.ADD_PATIENT_SUCCESSFULLY,response.message.toString())))

                    }
                }

            }

        } else
            showError.postValue(Event(ERRORS.NO_NETWORK))

    }

    suspend fun addMyself(mySelfDetails: PatientDetails) {
        viewModelScope.launch(IO) {
            var resPatientDetails: SavePatientResponse? = null

            resPatientDetails = if (SharedPrefManager.getInstance().incompleteOrderId == 0L)
                addPatientUseCase.addPatient(
                    mxInternalErrorOccurred,mySelfDetails, SharedPrefManager.getInstance().loggedInUserId.toLong()
                )
            else {
                // if order id is already created then myself by default gets created at server side
                // hence don't need to call addPatient in that scenario
                SavePatientResponse(
                    statusCode = 200,
                    responseData = SavePatientResponse.ResponseData()
                )
            }
            resPatientDetails?.let { response ->
                if (response.statusCode == 200 || response.statusCode == 400) {
                    updateCustomerDetailsToDb(
                        mySelfDetails,
                        SharedPrefManager.getInstance().loggedInUserId.toLong()
                    )
                    SharedPrefManager.getInstance().setUserEmail(mySelfDetails.emailAddress)
                    if (callSavePatientForOrder && SharedPrefManager.getInstance().incompleteOrderId > 0) {
                        savePatientForOrder(
                            SharedPrefManager.getInstance().incompleteOrderId,
                            if (patientIdFromUpdateProfile > 0L) patientIdFromUpdateProfile else (response.responseData.patientId
                                ?: 0),
                            SharedPrefManager.getInstance().loggedInUserId
                        )
                    } else {
                        showMessage.postValue(
                            Event(
                                MessageConstant(
                                    MESSAGES.ADD_PATIENT_SUCCESSFULLY,
                                    response.message.toString()
                                )
                            )
                        )
                    }
                    loaderValue.postValue(false)
                    _isFreshUser = false
                } else {
                    loaderValue.postValue(false)
                    showMessage.postValue(
                        Event(
                            MessageConstant(
                                MESSAGES.ADD_PATIENT_FAILED,
                                response.message.toString()
                            )
                        )
                    )
                    _isFreshUser = true
                    Log.e("data1==>", response.toString())
//                    showMessage.postValue(Event(MessageConstant(MESSAGES.ADD_PATIENT_SUCCESSFULLY,response.message.toString())))
                }

                sendPatientAddedEvent(
                    MxPatientAdded(mySelfDetails.age?.toInt(), clickedOnPage,
                        if (radioType.value === "female") "Female" else if (radioType.value === "male") "Male" else "Other"
                        ,mySelfDetails.firstName, "5", if(patientExperiment.value.equals("B",true)) yourLastName.value?.isNotEmpty() else null, SharedPrefManager.getInstance().selectedWarehouseID, emailAdded = yourEmailId.value.toString().trim().ifEmpty { null })
                )
            }
        }
    }


    private fun savePatientForOrder(orderId: Long, patientId: Long, customerId: String) {
//        loaderValue.postValue(true)
        viewModelScope.launch(IO) {
            val saveAddressResponse =
                async {
                    orderFlowUseCase.tagPatientIdWithOrder(
                        mxInternalErrorOccurred,orderId,
                        patientId,
                        customerId
                    )
                }.await()
            saveAddressResponse?.let {
                if (it == NetworkResponseType.SUCCESS.ordinal) {
                    SharedPrefManager.getInstance().patientId = patientId
                    showMessage.postValue(
                        Event(
                            MessageConstant(
                                MESSAGES.ADD_PATIENT_SUCCESSFULLY,
                                "Patient updated successfully"
                            )
                        )
                    )
                } else {
                    showMessage.postValue(
                        Event(
                            MessageConstant(
                                MESSAGES.ADD_PATIENT_FAILED,
                                "Patient update failed"
                            )
                        )
                    )
                }
            }
            loaderValue.postValue(false)
        }
    }

    fun updateCustomerDetailsToDb(userDetails: PatientDetails, customerId: Long?) {

        val customerDetails =
            com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerDetails(
                customerId,
                SharedPrefManager.getInstance().loggedInUserMobile,
                userDetails.emailAddress ?: "",
                "",
                userDetails.firstName + " " + userDetails.lastName,
                userDetails.gender,
                userDetails.age,
                0,
                userDetails.lastName
            )

        viewModelScope.launch(IO) {
            customerDetails.let { it1 -> localDbUseCase.addCustomerDetails(it1) }
        }
        updateDbAccountFragment.postValue(true)
    }

    fun getPatientExperimentCategory() {
        viewModelScope.launch(IO) {
            val patientExp ="B"
                //localDbUseCase.getCustomerCategory(UserCategoryEnum.PATIENT_EXPERIMENT.apiCategoryType)
            if (patientExp.isNotEmpty()) {
                loaderValue.postValue(false)
                launchAddPatient.postValue(Event((patientExp)))
            } else {
                launchAddPatient.postValue(Event(("A")))
                loaderValue.postValue(false)
            }

        }
    }

    suspend fun checkNameExist(namString: String): Int {
        /*viewModelScope.launch {
            count = withContext(IO) { localDbUseCase.checkNameExist(namString) }
        }*/
        return localDbUseCase.checkNameExist(namString)

    }

    fun sendPatientAddedEvent(mxPatientAdded: MxPatientAdded){
        mxPatientAdded.patientType =  if (mxPatientAdded.patientType.equals("5")) "Myself" else "Someone else"
        sdkEventUseCase.sendPatientAddedEvent(mxPatientAdded)
    }

    fun sendAddPatientClickedEvent(clickedPage: String){
        sdkEventUseCase.sendAddPatientClickedEvent(clickedPage)
    }

}

