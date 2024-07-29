package com.intellihealth.truemeds.presentation.activity

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.EditorInfo
import androidx.activity.OnBackPressedCallback
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.google.gson.Gson
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.constants.InputFieldConstants
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.salt.views.Toast
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData
import com.intellihealth.truemeds.data.model.user.GetAllPatientResponse
import com.intellihealth.truemeds.data.utils.ERRORS
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.data.utils.hideKeyboard
import com.intellihealth.truemeds.databinding.ActivityAddPatientBinding
import com.intellihealth.truemeds.domain.navigation.navigateToOrderSummaryActivity
import com.intellihealth.truemeds.presentation.bottomsheet.EditDeletePatientBottomSheet
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@AndroidEntryPoint
class AddPatientActivity : BaseActivity() {
    private var patientJson: String? = null
    private val viewModel by lazy { ViewModelProvider(this)[ManagePatientViewModel::class.java] }
    private val binding by viewBinding(ActivityAddPatientBinding::inflate)

    private lateinit var context: Context
    private var isEditPatient: Boolean = false
    private var isMySelf: Boolean = false
    private var openOrderSummary: Boolean = false
    private var fromDeliveryDelay = false
    private var patientExperimentValue = ""
    private var editDeletePatientBottomSheet: EditDeletePatientBottomSheet =
        EditDeletePatientBottomSheet()
    private var redirectToCart = false
    private var isFirstTime = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        updateStatusBarColor()
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        viewModel.getUserData()
        //Set view model as lifecycle observer of the activity
        lifecycle.addObserver(viewModel)
        extractIntentData()
        context = this
        init()

        viewModel.requestFocus.observe(this) {
            when (it) {
                1 -> scrollToPosition(binding.tvInputFirstNameMySelf)
                2 -> scrollToPosition(binding.tvInputLastNameMySelf)
                3 -> scrollToPosition(binding.tvInputEmailIdMySelf)
                4 -> scrollToPosition(binding.tvInputAgeMySelf)
                5 -> scrollToPosition(binding.tvSelectGenderMySelf)
                6 -> scrollToPosition(binding.tvInputFirstName)
                7 -> scrollToPosition(binding.tvInputLastName)
                8 -> scrollToPosition(binding.tvInputAge)
                9 -> scrollToPosition(binding.tvSelectGender)
            }
        }

        viewModel.radioType.observe(this) {
            if (isEditPatient)
                if (isFirstTime) {
                    isFirstTime = false
                } else {
                    if (!getGender(viewModel.patientItemList.value?.gender!!).equals(
                            viewModel.radioType.value,
                            true
                        )
                    )
                        binding.btnSave.setEnableAndClick(true)
                }
        }
    }

    override fun extractIntentData(){
        intent.extras?.let { bundle ->
            viewModel._isFreshUser = bundle.getBoolean(BundleConstants.BUNDLE_KEY_FRESH_USER, false)
            if (bundle.containsKey(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE)) {
                viewModel.clickedOnPage = bundle.getString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE).toString()
            }
            openOrderSummary = bundle.getBoolean("openOrderSummary", false)
            if (bundle.containsKey(BundleConstants.BUNDLE_KEY_REDIRECT_TO_CART)) {
                redirectToCart = bundle.getBoolean(BundleConstants.BUNDLE_KEY_REDIRECT_TO_CART, false)
            }
            fromDeliveryDelay = bundle.getBoolean(BundleConstants.BUNDLE_FROM_DELIVERY_DELAY, false)
            viewModel.callSavePatientForOrder = bundle.getBoolean("openOrderSummary", false)

            binding.comingFromAccountFragment =
                bundle.getBoolean(BundleConstants.IS_FROM_ACCOUNT_FRAGMENT, false)


            patientJson = bundle.getString(BundleConstants.BUNDLE_KEY_PATIENT_DETAILS)
            viewModel.patientExperiment.postValue(bundle.getString(BundleConstants.PATIENT_EXPERIMENT))
            patientExperimentValue = bundle.getString(BundleConstants.PATIENT_EXPERIMENT) ?: ""
        }
    }

    private fun scrollToPosition(view: View) {
        hideKeyboard(this@AddPatientActivity)
        val scrollTo: Int = (binding.contentScroll.parent.parent as View).top + view.top
        binding.contentScroll.smoothScrollTo(0, scrollTo)
    }

    fun init() {
        // setting all input fields input digits from here
        setInputDigits()
        binding.btnSave.setTitle(
            if (openOrderSummary) resources.getString(R.string.save_and_continue) else resources.getString(
                R.string.save
            )
        )
        getBundleData()

            if (viewModel._isFreshUser) {
            if (patientExperimentValue.equals("A", true)){
                viewModel.firstNameHint.value = getString(R.string.your_name)
                viewModel.ageHint.value = getString(R.string.your_age)
                viewModel.emailHint.value = getString(R.string.your_email_id)
            } else {
                viewModel.firstNameHint.value = getString(R.string.your_first_name)
                viewModel.lastNameHint.value = getString(R.string.your_last_name)
                viewModel.ageHint.value = getString(R.string.your_age)
                viewModel.emailHint.value = getString(R.string.your_email_id)
            }
            binding.tmTopHeader.setUpMobileSectionHeadersData(
                MobileSectionHeadersModel(
                    getString(R.string.your_details), "", "",
                    "", 0
                )
            )
        } else {
            if (isEditPatient) {
                if (patientExperimentValue.equals("A", true)) {
                    if (isMySelf) {
                        viewModel.firstNameHint.value = getString(R.string.your_name)
                        viewModel.ageHint.value = getString(R.string.your_age)
                        viewModel.emailHint.value = getString(R.string.your_email_id)
                    } else {
                        viewModel.firstNameHint.value = getString(R.string.patientName_label)
                        viewModel.ageHint.value = getString(R.string.patient_age)
                    }
                } else {
                    if (isMySelf) {
                        viewModel.firstNameHint.value = getString(R.string.your_first_name)
                        viewModel.lastNameHint.value = getString(R.string.your_last_name)
                        viewModel.ageHint.value = getString(R.string.your_age)
                        viewModel.emailHint.value = getString(R.string.your_email_id)
                    } else {
                        viewModel.firstNameHint.value = getString(R.string.patient_first_name)
                        viewModel.lastNameHint.value = getString(R.string.patient_last_name)
                        viewModel.ageHint.value = getString(R.string.patient_your_age)
                    }
                }
            } else {
                if (patientExperimentValue.equals("A", true)) {
                    viewModel.firstNameHint.value = getString(R.string.patientName_label)
                    viewModel.ageHint.value = getString(R.string.patient_age)
                } else {
                    viewModel.firstNameHint.value = getString(R.string.patient_first_name)
                    viewModel.lastNameHint.value = getString(R.string.patient_last_name)
                    viewModel.ageHint.value = getString(R.string.patient_your_age)
                }
            }
            binding.tmTopHeader.setUpMobileSectionHeadersData(
                MobileSectionHeadersModel(
                    getString(R.string.patient_details), "", "",
                    "", 0
                )
            )
        }
        binding.tvInputFirstNameMySelf.setHintText(viewModel.firstNameHint.value ?: "")
        binding.tvInputLastNameMySelf.setHintText(viewModel.lastNameHint.value ?: "")
        binding.tvInputEmailIdMySelf.setHintText(viewModel.emailHint.value ?: "")
        binding.tvInputAgeMySelf.setHintText(viewModel.ageHint.value ?: "")
        binding.tmTopHeader.setBackArrowClickCallback(object : BackArrowClickCallback {
            override fun onBackArrowClick() {
                if (isEditPatient) {
                    if (isFieldsValueChange()) openBottomSheet() else finish()
                } else {
                    if (!isEmptyFieldsValue()) openBottomSheet() else finish()
                }
                //  finish()
            }
        })
        binding.chipMyself.setOnClickListener {
            binding.chipMyself.setChipType(0)
            binding.chipSomeoneElse.setChipType(1)
            //viewModel._isMySelf.postValue(true)
            viewModel.isSomeOneElse.postValue(false)
        }
        binding.chipSomeoneElse.setOnClickListener {
            binding.chipMyself.setChipType(1)
            binding.chipSomeoneElse.setChipType(0)
            //viewModel._isMySelf.postValue(false)
            viewModel.isSomeOneElse.postValue(true)
        }
        binding.btnSave.setOnClickListener {
            if (CommonFunc.isSingleClickParam()) {
                viewModel.saveButtonClick(context)
            }
        }

        setEventListener()
        addEditTextChangeListener()
        setupOnBackPresses()

    }

    private fun setInputDigits() {
        val nameRegex = "^[a-zA-Z ]+\$"

        binding.tvInputFirstNameMySelf.setInputDigits(nameRegex)
        binding.tvInputFirstNameMySelf.setMaxCharLength(20)

        binding.tvInputFirstName.setInputDigits(nameRegex)
        binding.tvInputFirstName.setMaxCharLength(20)

        binding.tvInputLastNameMySelf.setInputDigits(nameRegex)
        binding.tvInputLastNameMySelf.setMaxCharLength(20)

        binding.tvInputLastName.setInputDigits(nameRegex)
        binding.tvInputLastName.setMaxCharLength(20)


    }

    private fun setupOnBackPresses() {
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                //setResult(RESULT_CANCELED)

                if (isEditPatient) {
                    if (isFieldsValueChange()) openBottomSheet() else finish()
                } else {
                    if (!isEmptyFieldsValue()) openBottomSheet() else finish()

                }

                //  finish()
            }
        })
    }

    fun openBottomSheet() {
        hideKeyboard(this@AddPatientActivity)
        editDeletePatientBottomSheet.isCancelable = false
        if (!editDeletePatientBottomSheet.isVisible)
            editDeletePatientBottomSheet.setManagePatientViewModel(
                viewModel,
                isEditPatient,
                false
            )
        editDeletePatientBottomSheet.show(supportFragmentManager, "Discard unsaved details?")
    }

    fun isEmptyFieldsValue(): Boolean {
        return viewModel.yourFirstName.value.isNullOrEmpty() && viewModel.yourLastName.value.isNullOrEmpty() && viewModel.yourAge.value.isNullOrEmpty() && viewModel.radioType.value.isNullOrEmpty()
    }

    fun isFieldsValueChange(): Boolean {
        val pageLoadFirstName = if (viewModel.patientExperiment.value.equals("A")) {
            viewModel.patientItemList.value?.patientName ?: ""
        } else {
            viewModel.patientItemList.value?.firstName ?: ""
        }
        val pageLoadLastName = viewModel.patientItemList.value?.lastName ?: ""
        val pageLoadEmailId = viewModel.patientItemList.value?.emailId ?: ""
        val pageLoadGenderName = getGender(viewModel.patientItemList.value?.gender!!)
        if (!pageLoadFirstName.equals(viewModel.yourFirstName.value, true)) {
            return true
        } else if (!pageLoadLastName.equals(viewModel.yourLastName.value, true)) {
            return true
        } else if (!pageLoadEmailId.equals(viewModel.yourEmailId.value, true)) {
            return true
        } else if (!viewModel.patientItemList.value?.age.equals(viewModel.yourAge.value, true)) {
            return true
        } else if (!pageLoadGenderName.equals(viewModel.radioType.value, true)) {
            return true
        }
        return false
    }

    private fun getGender(gender: Int): String {
        return when (gender) {
            8 -> "Male"
            9 -> "Female"
            else -> "Other"
        }
    }

    private fun setEventListener() {
        viewModel.eventMessage.observe(this, EventObserver {
            if (it.messageEnum == MESSAGES.ADD_PATIENT_CLICK) {

                //Toast().showCustomToastMessage(context, "Add Patient clicked")


            } else if (it.messageEnum == MESSAGES.DISCARD_EDIT_PATIENT_CHANGES) {
                //Toast().showCustomToastMessage(this, "Edit Patient changes not reflected")
                finish()
//                        manageAddressViewModel.getManageAddressData(1650)
            } else if (it.messageEnum == MESSAGES.EDIT_PATIENT_DETAILS_CLICK) {

                //Toast().showCustomToastMessage(context, "Edit patient redirection coming soon")


            } else if (it.messageEnum == MESSAGES.EDIT_PATIENT_SUCCESSFULLY) {
                Toast().showCustomToastMessage(context, "Patient details updated successfully")
                val resultIntent = Intent()
                resultIntent.putExtra(
                    BundleConstants.BUNDLE_KEY_NEWLY_ADDED_PATIENT_ID,
                    viewModel.newlyCreatedPatientId
                )
                setResult(Activity.RESULT_OK, resultIntent)
                finish()

            } else if (it.messageEnum == MESSAGES.EDIT_PATIENT_FAILED) {
                if (it.displayMessage.isNotEmpty()) {
                    Toast().showCustomToastMessage(context, it.displayMessage)
                } else {
                    Toast().showCustomToastMessage(context, "Edit patient failed")
                }


            } else if (it.messageEnum == MESSAGES.ADD_PATIENT_SUCCESSFULLY) {
                if (it.displayMessage.isNotEmpty()) {
//                    Toast().showCustomToastMessage(context, it.displayMessage)
                } else {
                    Toast().showCustomToastMessage(context, "Add patient successfully")
                }
                if (redirectToCart) {
                    finish()
                } else {
                    if (openOrderSummary && !viewModel.isOrderSummaryActivityOpened) {
                        navigateToOrderSummaryActivity(
                                params = bundleOf(
                                BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to viewModel.clickedOnPage
                            ),
                            flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                        )
                        viewModel.isOrderSummaryActivityOpened = true
                    }
                }
                if (fromDeliveryDelay) {
                    val resultIntent = Intent()
                    resultIntent.putExtra(
                        BundleConstants.BUNDLE_KEY_NEWLY_ADDED_PATIENT_ID,
                        viewModel.newlyCreatedPatientId
                    )
                    setResult(Activity.RESULT_OK, resultIntent)
                } else {
                    setResult(RESULT_OK)
                }
//                setResult(Activity.RESULT_OK)
                finish()


            } else if (it.messageEnum == MESSAGES.ADD_PATIENT_FAILED) {

                if (it.displayMessage.isNotEmpty()) {
                    Toast().showCustomToastMessage(context, it.displayMessage)
                } else {
                    Toast().showCustomToastMessage(context, "Add patient failed")
                }

            } else if (it.messageEnum == MESSAGES.DELETE_PATIENT_SUCCESSFULLY) {

                Toast().showCustomToastMessage(context, "Delete patient successfully")


            } else if (it.messageEnum == MESSAGES.DELETE_PATIENT_FAILED) {

                Toast().showCustomToastMessage(context, "Delete patient failed")


            } else if (it.messageEnum == MESSAGES.PATIENT_REMOVED_SUCCESSFULLY) {

                viewModel.patientsList.postValue(viewModel.patientsList.value)
                Toast().showCustomToastMessage(context, "Patient Removed")

            }

        })

        viewModel.eventShowError.observe(this, EventObserver {
            if (it.equals(ERRORS.NO_NETWORK)) {
                showDialogBox(PopUpType.INTERNET_FAILURE, object : PopUpDialogCallback {
                    override fun onActionButtonClicked() {
                        // apiType=1 is for edit patient api calling
                        if (viewModel.apiType == 1)
                            viewModel.editPatient()
// apiType=2 is for fresh user api calling when is patient with user is true
                        else if (viewModel.apiType == 2)
                            viewModel.addFreshUser(true)
// apiType=3 is for fresh user api calling when is patient with user is false
                        else if (viewModel.apiType == 3)
                            viewModel.addFreshUser(false)
// apiType=4 is for validate myself add patient api calling
                        else if (viewModel.apiType == 4)
                            viewModel.addPatient()
                    }

                    override fun onCloseButtonClicked() {

                    }
                }, true)
            }

        })

    }

    private fun getBundleData() {
        // Check if the patientJson is not null
        if (patientJson != null) {

            isEditPatient =
                intent.extras?.getBoolean(BundleConstants.BUNDLE_KEY_IS_EDIT_PATIENT, false) == true
            if (isEditPatient)
                binding.btnSave.setEnableAndClick(false)
            viewModel._isEditPatient.postValue(isEditPatient)
            //viewModel._isMySelf.postValue(false)
            viewModel.isSomeOneElse.postValue(false)
            // Convert the JSON string back to the Patient object
            val patient: GetAllPatientResponse.Patient? =
                Gson().fromJson(patientJson, GetAllPatientResponse.Patient::class.java)

            viewModel._patientItemList.value = patient

            if (!patient?.relationName.equals("MYSELF", true)) {
                isMySelf = false

                viewModel.disableFirstName.postValue(true)
                viewModel.disableLastName.postValue(true)
                viewModel.yourFirstNameData.postValue(
                    ErrorMessageData(
                        "",
                        InputFieldConstants.STATE_PRE_FIELD
                    )
                )
                viewModel.yourLastNameData.postValue(
                    ErrorMessageData(
                        "",
                        InputFieldConstants.STATE_PRE_FIELD
                    )
                )
            } else {
                isMySelf = true
                viewModel.disableFirstName.postValue(false)
                viewModel.disableLastName.postValue(false)
            }

            viewModel.selectedPatient.postValue(patient)
            patient?.let {
                if (patient.relationName.equals("MYSELF")) {
                    viewModel._isMySelf.value = true
                } else {
                    viewModel._isMySelf.value = false
                }
                if (patientExperimentValue.equals("A")) {
                    patient.patientName.let {
                        binding.tvInputFirstNameMySelf.setInputFieldData(it)
                        viewModel.yourFirstName.value = it
                        if (patient.relationId == 8) {
                            binding.tvInputFirstNameMySelf.isClickable = false
                            binding.tvInputFirstNameMySelf.isEnabled = false
                        }
                    }
                } else {
                    patient.firstName?.let {
                        binding.tvInputFirstNameMySelf.setInputFieldData(it)
                        viewModel.yourFirstName.value = it
                    }
                }

                patient.lastName?.let {
                    if (it.isNotEmpty()) {
                        binding.tvInputLastNameMySelf.setInputFieldData(it)
                        viewModel.yourLastName.value = it
                        if (patient.relationId == 8) {
                            binding.tvInputLastNameMySelf.isClickable = false
                            binding.tvInputLastNameMySelf.isEnabled = false
                        }
                    }
                }

                patient.emailId?.let {
                    if (it.isNotEmpty()) {
                        binding.tvInputEmailIdMySelf.setInputFieldData(it)
                        viewModel.yourEmailId.value = it
                    }
                }

                patient.age.let {
                    binding.tvInputAgeMySelf.setInputFieldData(it)
                    viewModel.yourAge.value = it
                }

                patient.gender.let {

                    if (it.equals(9)) viewModel.setRadioType("female") else if (it.equals(8)) viewModel.setRadioType(
                        "male"
                    ) else viewModel.setRadioType("other")

                }
            }

        }

        //managing conditions in case of variant A
        if (patientExperimentValue.equals("A", true)) {
            if (!viewModel._isFreshUser) {
                if (isEditPatient && isMySelf) {
                    binding.tvInputFirstNameMySelf.setLabel(getString(R.string.your_name))
                    binding.tvInputAgeMySelf.setLabel(getString(R.string.age))
                } else {
                    binding.tvInputFirstNameMySelf.setLabel(getString(R.string.patientName_label))
                    binding.tvInputAgeMySelf.setLabel(getString(R.string.patient_age))
                }
            } else {
                binding.tvInputFirstNameMySelf.setLabel(getString(R.string.full_name))
                binding.tvInputAgeMySelf.setLabel(getString(R.string.age_label))
            }
            binding.tvInputFirstName.setLabel(getString(R.string.patientName_label))
            binding.tvInputFirstName.setHintText(getString(R.string.patientName_label))
            binding.tvInputAge.setLabel(getString(R.string.patient_age))
            binding.tvInputAge.setHintText(getString(R.string.patient_age))
        }
    }

    private fun addEditTextChangeListener() {
        with(binding) {
            tvInputFirstName.setInputFieldCallback(
                null,

                object : TextWatcher {
                    override fun afterTextChanged(s: Editable?) {
                        viewModel?.firstName?.value = s.toString()
                        viewModel?.viewModelScope?.launch(Dispatchers.IO) {
                            var checkExistCount = 0
                            checkExistCount = viewModel?.checkNameExist(s.toString().trim())!!
                            if (s.toString().length >= 2 && checkExistCount > 0) {
                                viewModel?.yourFirstNameData?.postValue(
                                    ErrorMessageData(
                                        context.getString(R.string.please_enter_a_valid_name),
                                        InputFieldConstants.STATE_ERROR
                                    )
                                )
                            }
                        }

                    }

                    override fun beforeTextChanged(
                        s: CharSequence?,
                        start: Int,
                        count: Int,
                        after: Int
                    ) {
                    }

                    override fun onTextChanged(
                        s: CharSequence?,
                        start: Int,
                        before: Int,
                        count: Int
                    ) {

                    }
                }
            ) { v, actionId, event ->
                actionId == EditorInfo.IME_ACTION_DONE || actionId == EditorInfo.IME_NULL
                false
            }

            tvInputLastName.setInputFieldCallback(
                null,

                object : TextWatcher {
                    override fun afterTextChanged(s: Editable?) {
                        viewModel?.lastName?.value = s.toString()

                    }

                    override fun beforeTextChanged(
                        s: CharSequence?,
                        start: Int,
                        count: Int,
                        after: Int
                    ) {
                    }

                    override fun onTextChanged(
                        s: CharSequence?,
                        start: Int,
                        before: Int,
                        count: Int
                    ) {

                    }
                }) { v, actionId, event ->
                actionId == EditorInfo.IME_ACTION_DONE || actionId == EditorInfo.IME_NULL
                false
            }

            tvInputAge.setInputFieldCallback(
                null,

                object : TextWatcher {
                    override fun afterTextChanged(s: Editable?) {
                        viewModel?.age?.value = s.toString()

                    }

                    override fun beforeTextChanged(
                        s: CharSequence?,
                        start: Int,
                        count: Int,
                        after: Int
                    ) {
                    }

                    override fun onTextChanged(
                        s: CharSequence?,
                        start: Int,
                        before: Int,
                        count: Int
                    ) {

                    }
                }) { v, actionId, event ->
                actionId == EditorInfo.IME_ACTION_DONE || actionId == EditorInfo.IME_NULL
                false
            }

            //viewModel?.gender?.value =
            //     customRadioFemale.getIsChecked() || customRadioMale.getIsChecked() || customRadioOther.getIsChecked()

            tvInputFirstNameMySelf.setInputFieldCallback(
                null,

                object : TextWatcher {
                    override fun afterTextChanged(s: Editable?) {
                        if (isEditPatient && !viewModel?.patientItemList?.value?.firstName.equals(s.toString())) {
                            binding.btnSave.setEnableAndClick(true)
                        }
                        viewModel?.yourFirstName?.value = s.toString()
                        viewModel?.viewModelScope?.launch(Dispatchers.IO) {
                            var checkExistCount = 0
                            checkExistCount = viewModel?.checkNameExist(s.toString().trim())!!
                            if (s.toString().length >= 2 && checkExistCount > 0) {
                                viewModel?.yourFirstNameData?.postValue(
                                    ErrorMessageData(
                                        context.getString(R.string.please_enter_a_valid_name),
                                        InputFieldConstants.STATE_ERROR
                                    )
                                )
                            }
                        }

                    }

                    override fun beforeTextChanged(
                        s: CharSequence?,
                        start: Int,
                        count: Int,
                        after: Int
                    ) {
                    }

                    override fun onTextChanged(
                        s: CharSequence?,
                        start: Int,
                        before: Int,
                        count: Int
                    ) {

                    }
                }
            ) { v, actionId, event ->
                actionId == EditorInfo.IME_ACTION_DONE || actionId == EditorInfo.IME_NULL
                false
            }

            tvInputLastNameMySelf.setInputFieldCallback(
                null,

                object : TextWatcher {
                    override fun afterTextChanged(s: Editable?) {
                        if (isEditPatient && !viewModel?.patientItemList?.value?.lastName.equals(s.toString())) {
                            binding.btnSave.setEnableAndClick(true)
                        }
                        viewModel?.yourLastName?.value = s.toString()

                    }

                    override fun beforeTextChanged(
                        s: CharSequence?,
                        start: Int,
                        count: Int,
                        after: Int
                    ) {
                    }

                    override fun onTextChanged(
                        s: CharSequence?,
                        start: Int,
                        before: Int,
                        count: Int
                    ) {

                    }
                }
            ) { v, actionId, event ->
                actionId == EditorInfo.IME_ACTION_DONE || actionId == EditorInfo.IME_NULL
                false
            }

            tvInputEmailIdMySelf.setInputFieldCallback(
                null,

                object : TextWatcher {
                    override fun afterTextChanged(s: Editable?) {
                        if (isEditPatient && !viewModel?.patientItemList?.value?.emailId.equals(s.toString())) {
                            binding.btnSave.setEnableAndClick(true)
                        }
                        viewModel?.yourEmailId?.value = s.toString()

                    }

                    override fun beforeTextChanged(
                        s: CharSequence?,
                        start: Int,
                        count: Int,
                        after: Int
                    ) {
                    }

                    override fun onTextChanged(
                        s: CharSequence?,
                        start: Int,
                        before: Int,
                        count: Int
                    ) {

                    }
                }
            ) { v, actionId, event ->
                actionId == EditorInfo.IME_ACTION_DONE || actionId == EditorInfo.IME_NULL
                false
            }

            tvInputAgeMySelf.setInputFieldCallback(
                null,

                object : TextWatcher {
                    override fun afterTextChanged(s: Editable?) {
                        if (isEditPatient && !viewModel?.patientItemList?.value?.age.equals(s.toString())) {
                            binding.btnSave.setEnableAndClick(true)
                        }
                        viewModel?.yourAge?.value = s.toString()

                    }

                    override fun beforeTextChanged(
                        s: CharSequence?,
                        start: Int,
                        count: Int,
                        after: Int
                    ) {
                    }

                    override fun onTextChanged(
                        s: CharSequence?,
                        start: Int,
                        before: Int,
                        count: Int
                    ) {

                    }
                }
            ) { v, actionId, event ->
                actionId == EditorInfo.IME_ACTION_DONE || actionId == EditorInfo.IME_NULL
                false
            }

        }
    }

}