package com.intellihealth.truemeds.presentation.activity

import android.Manifest
import android.app.Activity
import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.content.IntentSender.SendIntentException
import android.content.pm.PackageManager
import android.location.Address
import android.location.Geocoder
import android.location.Location
import android.location.LocationManager
import android.net.Uri
import android.os.Bundle
import android.os.Looper
import android.provider.Settings
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.EditorInfo
import androidx.core.app.ActivityCompat
import androidx.core.location.LocationManagerCompat.isLocationEnabled
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProvider
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.common.api.ResolvableApiException
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationAvailability
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationResult
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.LocationSettingsRequest
import com.google.android.gms.location.LocationSettingsResponse
import com.google.android.gms.location.LocationSettingsStatusCodes
import com.google.android.gms.tasks.Task
import com.google.gson.Gson
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.constants.InputFieldConstants
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.salt.views.Toast
import com.intellihealth.salt.views.edittext.InputFieldLayout
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData
import com.intellihealth.truemeds.data.model.user.GetAllAddressResponse
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.data.utils.hideKeyboard
import com.intellihealth.truemeds.databinding.ActivityAddAddressBinding
import com.intellihealth.truemeds.domain.enums.AddressType
import com.intellihealth.truemeds.domain.navigation.navigateToAddPatientActivity
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxUseLocationClicked
import com.intellihealth.truemeds.presentation.bottomsheet.EditDeleteAddressBottomSheet
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.ManageAddressViewModel
import dagger.hilt.android.AndroidEntryPoint
import java.io.IOException
import java.util.Locale

@AndroidEntryPoint
class AddAddressActivity : BaseActivity(), View.OnClickListener {

    private var addressModel: GetAllAddressResponse.ResponseObj? = null
    private val binding by viewBinding(ActivityAddAddressBinding::inflate)

    private var editDeleteAddressBottomSheet: EditDeleteAddressBottomSheet =
        EditDeleteAddressBottomSheet()
    private var isEditClick = false
    private var onTouchPin = false
    private val LOCATION_PERMISSIONS_REQUEST = 101
    private var fusedLocationProvider: FusedLocationProviderClient? = null
    private val locationRequest: LocationRequest =
        LocationRequest.create().setFastestInterval(100).setInterval(100)
            .setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY).setMaxWaitTime(10)
    private var resumeFromPermissionRequest = false
    private var fromUserLocationClick = false
    private val ENABLE_GPS_REQUEST = 103
    private lateinit var context: Context
    private var addPatient = false
    private var addPatientFrom = ""
    private var isFromCart = false
    private var redirectToCart = false
    private var fromDeliveryDelay = false
    private var isEditWithChipId = 0
    private var enterPin = ""
    private val manageAddressViewModel by lazy { ViewModelProvider(this)[ManageAddressViewModel::class.java] }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(binding.root)
        updateStatusBarColor()
        binding.lifecycleOwner = this
        // setting all input fields input digits from here
        setInputDigits()
        extractIntentData()
        getIntentData()
        lifecycle.addObserver(manageAddressViewModel)
        context = this
        manageAddressViewModel.initContext(context)
        manageAddressViewModel.getPatientExperiment()
        setEventListener()
        fusedLocationProvider = LocationServices.getFusedLocationProviderClient(this)
        addEditTextChangeListener()
        binding.txtHeader.setUpMobileSectionHeadersData(
            MobileSectionHeadersModel(
                getString(R.string.manage_address), "", "",
                "", 0
            )
        )

        val loader = Dialog(context)
        manageAddressViewModel.isLoading.observe(this) {
            if (it) enableLoadingView(loader)
            else disableLoadingView(loader)
        }

        manageAddressViewModel.requestFocus.observe(this) {
            when (it) {
                2 -> scrollToPosition(binding.edtAddress)
                3 -> scrollToPosition(binding.edtAddress2)
                4 -> scrollToPosition(binding.edtCity)
                5 -> scrollToPosition(binding.edtState)
                6 -> binding.contentScroll.post {
                    binding.contentScroll.fullScroll(View.FOCUS_DOWN)
                }
            }
        }

        binding.btnSave.setOnClickListener {
            hideKeyboard(this@AddAddressActivity)
            manageAddressViewModel.onSaveButtonClicked(context)

        }
    }

    private fun scrollToPosition(view: InputFieldLayout) {
        val scrollTo: Int = (binding.contentScroll.parent.parent as View).top + view.top
        binding.contentScroll.smoothScrollTo(0, scrollTo)
    }

    override fun extractIntentData(){
        intent.extras?.let { bundle ->

            binding.comingFromAccountFragment =
                bundle.getBoolean(BundleConstants.IS_FROM_ACCOUNT_FRAGMENT, false)

            addPatient = bundle.getBoolean("addPatient", false)
            addPatientFrom = bundle.getString("addPatientFrom").toString()
            manageAddressViewModel.callSaveAddress = bundle.getBoolean("addPatient", false)
            manageAddressViewModel.clickedOnPage = bundle.getString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE) ?: ""

            isFromCart = bundle.getBoolean("isFromCart", false)
            fromDeliveryDelay = bundle.getBoolean(BundleConstants.BUNDLE_FROM_DELIVERY_DELAY, false)

            if (bundle.containsKey(BundleConstants.BUNDLE_KEY_REDIRECT_TO_CART)) {
                redirectToCart = bundle.getBoolean(BundleConstants.BUNDLE_KEY_REDIRECT_TO_CART, false)
            }

            isEditClick = bundle.getBoolean("isEditClick", false)

            addressModel = Gson().fromJson(
                bundle.getString("editList").toString(),
                GetAllAddressResponse.ResponseObj::class.java
            )

            manageAddressViewModel.isHomeAddressAdded =
                bundle.getBoolean("isHomeAddressAdded", false)
            manageAddressViewModel.isOfficeAddressAdded =
                bundle.getBoolean("isOfficeAddressAdded", false)

        }
    }

    private fun getIntentData() {

        binding.btnSave.setTitle(
            if (fromDeliveryDelay) resources.getString(
                R.string.save_and_continue
            ) else resources.getString(R.string.save)
        )

        if (!isEditClick){
            setFieldState(InputFieldConstants.STATE_PRE_FIELD, false)
        }

        addressModel?.let {
            manageAddressViewModel.ogState = it.customerState ?: ""
            manageAddressViewModel.ogCity = it.customerCity ?: ""
            manageAddressViewModel._addressItemList.value = it

            manageAddressViewModel.isEditAddress = true

            //below pincode conditions are written disable use current location click and enter pincode field click in case of edit address
            if (!it.pincode.isNullOrEmpty()) {
                manageAddressViewModel.pincodeData.postValue(
                    ErrorMessageData(
                        "",
                        InputFieldConstants.STATE_DISABLE
                    )
                )
                binding.edtPinCode.setUpState(InputFieldConstants.STATE_DISABLE)
            }

            if (isEditClick) {
                binding.btnSave.setEnableAndClick(false)
            }

            //setting city and state value selected condition
            val city = if (!it.customerCity.isNullOrEmpty()) it.customerCity!! else it.cityName
                ?: ""
            val state =  if (!it.customerState.isNullOrEmpty()) it.customerState!! else it.stateName
                ?: ""

            binding.edtCity.setInputFieldData(city)
            binding.edtState.setInputFieldData(state)
            manageAddressViewModel.city.value = city
            manageAddressViewModel.state.value = state

            //below condition is added to select save as value is case of edit address
            if (it.addressType.equals("Office", true)) {
                isEditWithChipId = 2
                manageAddressViewModel.chipTypeSelected.postValue(2)
                manageAddressViewModel.updateAddressType(AddressType.OFFICE)
            } else if (it.addressType.equals("Home", true)) {
                isEditWithChipId = 1
                manageAddressViewModel.chipTypeSelected.postValue(1)
                manageAddressViewModel.updateAddressType(AddressType.HOME)
            }
            else if (!it.addressType.isNullOrEmpty()) // this condition is changed bcoz in case of other - the addressType parameter is returning other text value entered by user
            {
                isEditWithChipId = 3
                binding.etOther.setInputFieldData(it.addressType)
                manageAddressViewModel.other.value = it.addressType
                manageAddressViewModel.chipTypeSelected.postValue(3)
                manageAddressViewModel.updateAddressType(AddressType.OTHER)
            }
        }

        binding.manageAddressModel = manageAddressViewModel
        binding.model = manageAddressViewModel.addressItemList.value

        manageAddressViewModel.addressItemList.value?.addressType?.let {
            if (it.lowercase(Locale.ROOT) != "home" && it.lowercase(Locale.ROOT) != "office") binding.etOther.visibility =
                View.VISIBLE
        }
    }

    private fun setInputDigits() {
        val addressRegex = "^[A-Za-z0-9,/ -]+\$"
        val cityOrState = "^[a-zA-Z ]+\$"
        binding.edtAddress.setInputDigits(addressRegex)
        binding.edtAddress.setMaxCharLength(100)

        binding.edtAddress2.setInputDigits(addressRegex)
        binding.edtAddress2.setMaxCharLength(100)

        binding.edtLandmark.setInputDigits(addressRegex)
        binding.edtLandmark.setMaxCharLength(100)

        binding.edtCity.setInputDigits(cityOrState)
        binding.edtCity.setMaxCharLength(100)

        binding.edtState.setInputDigits(cityOrState)
        binding.edtState.setMaxCharLength(100)
    }

    private fun setEventListener() {
        binding.txtHeader.setBackArrowClickCallback(object :
            BackArrowClickCallback {
            override fun onBackArrowClick() {
                hideKeyboard(this@AddAddressActivity)
                if (isEditClick) {
                    if (isFieldsValueChange()) openBottomSheet()
                    else {
                        finish()
                    }
                } else {
                    if (!isEmptyFieldsValue()) openBottomSheet()
                    else {
                        finish()
                    }
                }

            }
        })

        binding.chipOffice.setOnClickListener(this)
        binding.chipHome.setOnClickListener(this)
        binding.chipOther.setOnClickListener(this)

        manageAddressViewModel.eventMessage.observe(this,
            com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver {
                if (it == null) return@EventObserver
                when {
                    it.messageEnum == MESSAGES.ADD_ADDRESS_CLICK -> {
                    }

                    it.messageEnum == MESSAGES.EDIT_ADDRESS_CLICK -> {

                    }

                    it.messageEnum == MESSAGES.NO_NETWORK -> {
                        showDialogBox(PopUpType.INTERNET_FAILURE, object : PopUpDialogCallback {
                            override fun onActionButtonClicked() {
                                // apiType=1 is for save button click api calling
                                if (manageAddressViewModel.apiType == 1)
                                    manageAddressViewModel.doSaveButtonClickApiCalling()
                                // apiType=2 is for Use current location click
                                else if (manageAddressViewModel.apiType == 2)
                                    manageAddressViewModel.onSelectLocationClicked()

                            }

                            override fun onCloseButtonClicked() {

                            }
                        }, true)
                    }

                    it.messageEnum == MESSAGES.ADD_ADDRESS_CITY_STATE_FROM_LOCATION -> {
                        binding.edtCity.setInputFieldData(manageAddressViewModel.cityTxt)
                        binding.edtState.setInputFieldData(manageAddressViewModel.stateTxt)
                    }
                    it.messageEnum == MESSAGES.EDIT_ADDRESS_FAILED -> {
                        if (it.displayMessage.isNotEmpty()) {
                            Toast().showCustomToastMessage(this, it.displayMessage)

                        } else {
                            Toast().showCustomToastMessage(this, "Edit address failed")
                        }
                    }

                    it.messageEnum == MESSAGES.ADD_ADDRESS_SUCCESSFULLY -> {
                        if (it.displayMessage.isNotEmpty()) {
                            Toast().showCustomToastMessage(this, it.displayMessage)

                        } else {
                            Toast().showCustomToastMessage(this, "Add address successfully")
                        }
                        if (addPatient) {
                            navigateToAddPatientActivity(
                                params = bundleOf(
                                    "openOrderSummary" to true,
                                    BundleConstants.BUNDLE_KEY_REDIRECT_TO_CART to
                                redirectToCart
                            ,
                                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to addPatientFrom,
                                    BundleConstants.PATIENT_EXPERIMENT to
                                            manageAddressViewModel.patientExperiment.value,
                                    "isFreshUser" to true
                                )
                            )
                            if (redirectToCart) {
                                finish()
                            }
                        }

                        if (fromDeliveryDelay) {
                            val resultIntent = Intent()
                            resultIntent.putExtra(
                                BundleConstants.BUNDLE_KEY_NEWLY_ADDED_ADDRESS_ID,
                                manageAddressViewModel.newlyCreatedAddId
                            )
                            setResult(Activity.RESULT_OK, resultIntent)
                        } else {
                            setResult(RESULT_OK)
                        }
                        finish()
                    }

                    it.messageEnum == MESSAGES.ADD_ADDRESS_FAILED -> {
                        if (it.displayMessage.isNotEmpty()) {
                            Toast().showCustomToastMessage(this, it.displayMessage)

                        } else {
                            Toast().showCustomToastMessage(this, "Add address failed")
                        }
                    }

                    it.messageEnum == MESSAGES.ADDRESS_REMOVED_SUCCESSFULLY -> {
                        if (it.displayMessage.isNotEmpty()) {
                            Toast().showCustomToastMessage(this, it.displayMessage)

                        } else {
                            Toast().showCustomToastMessage(this, "Address removed successfully")
                        }
                        manageAddressViewModel.getManageAddressData(SharedPrefManager.getInstance().loggedInUserId.toLong())
                    }

                    it.messageEnum == MESSAGES.DISCARD_EDIT_ADDRESS_CHANGES -> {
                        finish()
                    }

                    it.messageEnum == MESSAGES.USER_CURRENT_LOCATION_CLICK -> {
                        checkLocationPermission()
                    }
                }

            })


        manageAddressViewModel.pincodeData.observe(this) {
            if (isEditClick) {
                //  binding.edtPinCode.setUpState(InputFieldConstants.STATE_PRE_FIELD)
            } else {
                binding.edtPinCode.setUpState(it.errorStatus)
            }
        }

        manageAddressViewModel.isLocationPermissionGranted.observe(this) {
            if (it != null && it)
                checkLocationPermission()
        }

    }

    private fun addEditTextChangeListener() {
        with(binding) {
            edtAddress.setInputFieldCallback(
                null,

                object : TextWatcher {
                    override fun afterTextChanged(s: Editable?) {
                        if (isEditClick && !manageAddressViewModel.address.value.isNullOrBlank()) {
                            binding.btnSave.setEnableAndClick(true)
                        }
                        manageAddressViewModel.addressLine1Edited =
                            s.toString().trim() != manageAddressViewModel.address.value
                        manageAddressViewModel.address.value = s.toString().trim()
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

            edtAddress2.setInputFieldCallback(
                null,

                object : TextWatcher {
                    override fun afterTextChanged(s: Editable?) {
                        if (isEditClick && !manageAddressViewModel.address2.value.isNullOrBlank()) {
                            binding.btnSave.setEnableAndClick(true)
                        }
                        manageAddressViewModel.addressLine2Edited =
                            s.toString().trim() != manageAddressViewModel.address2.value
                        manageAddressViewModel.address2.value = s.toString().trim()
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

            edtPinCode.setInputFieldCallback(null, object : TextWatcher {
                var beforeTextChange = ""
                override fun afterTextChanged(s: Editable?) {
                    if (isEditClick && !manageAddressViewModel.pincode.value.isNullOrBlank()) {
                        binding.btnSave.setEnableAndClick(true)
                    }
                    enterPin = s.toString().trim()

                    if (beforeTextChange.length > s.toString().trim().length) {
                        manageAddressViewModel.pincodeFillType = "Pincode typed"
                    }

                    if (enterPin.length == 6) {
                        if (onTouchPin) {
                            manageAddressViewModel.pinCodeEdited =
                                !enterPin.equals(manageAddressViewModel.pincode)
                        }
                    }

                    manageAddressViewModel.pincode.value = enterPin
                    if (enterPin.isNotEmpty()) {
                        if (enterPin.length == 1) {
                            setFieldState(InputFieldConstants.STATE_ACTIVE, true)
                        } else if (enterPin.length == 6) {
                            manageAddressViewModel.fetchPincodeAvailablility(enterPin, false)
                        } else if (enterPin.length < 6) {
                            manageAddressViewModel.pincodeData.postValue(
                                ErrorMessageData(
                                    "",
                                    InputFieldConstants.STATE_ACTIVE
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
                    beforeTextChange = s.toString().trim()
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

            edtLandmark.setInputFieldCallback(null, object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {
                    if (isEditClick && !manageAddressViewModel.addressItemList.value?.landmark?.equals(
                            s.toString()
                        )!!
                    ) {
                        binding.btnSave.setEnableAndClick(true)
                    }
                    manageAddressViewModel.landmarkEdited =
                        s.toString().trim() != manageAddressViewModel.landMark.value
                    manageAddressViewModel.landMark.value = s.toString().trim()

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

            edtCity.setInputFieldCallback(null, object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {
                    if (isEditClick && !manageAddressViewModel.city.value.isNullOrBlank()) {
                        binding.btnSave.setEnableAndClick(true)
                    }
                    manageAddressViewModel.cityEdited =
                        s.toString().trim() != manageAddressViewModel.city.value
                    manageAddressViewModel.city.value = s.toString().trim()
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

            edtState.setInputFieldCallback(null, object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {
                    if (isEditClick && !manageAddressViewModel.state.value.isNullOrBlank()) {
                        binding.btnSave.setEnableAndClick(true)
                    }
                    manageAddressViewModel.stateEdited =
                        s.toString().trim() != manageAddressViewModel.state.value
                    manageAddressViewModel.state.value = s.toString().trim()
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

            etOther.setInputFieldCallback(null, object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {
                    if (isEditClick && !manageAddressViewModel.other.value.isNullOrBlank()) {
                        binding.btnSave.setEnableAndClick(true)
                    }
                    manageAddressViewModel.other.value = s.toString().trim()
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
        }

        manageAddressViewModel.pincodeData.observe(this) {
            it?.let { errorMessageData ->
                //this is by default case in case of add patient
                //manageAddressViewModel.isPinCodeGet = false
                if (manageAddressViewModel.pincode.value!!.isNotEmpty()) {
                    setFieldState(InputFieldConstants.STATE_ACTIVE, true)
                }
                if (errorMessageData.errorStatus == InputFieldConstants.STATE_ERROR
                    || errorMessageData.errorStatus == InputFieldConstants.STATE_WARNING
                ) {
                    manageAddressViewModel.isPinCodeGet = true
                } else if (errorMessageData.errorStatus == InputFieldConstants.STATE_SUCCESS) {
                    manageAddressViewModel.isPinCodeGet = true

                }

                manageAddressViewModel.isPinCodeGet =
                    !(manageAddressViewModel.isPinCodeGet && enterPin.length != 6)
            }
        }
    }

    fun setFieldState(state: InputFieldConstants, isEnabled: Boolean) {
        manageAddressViewModel.addressData.postValue(ErrorMessageData("", state))
        manageAddressViewModel.address2Data.postValue(ErrorMessageData("", state))
        manageAddressViewModel.landMarkData.postValue(ErrorMessageData("", state))
        manageAddressViewModel.cityData.postValue(ErrorMessageData("", state))
        manageAddressViewModel.stateData.postValue(ErrorMessageData("", state))

        binding.chipHome.isEnabled = isEnabled
        binding.chipOffice.isEnabled = isEnabled
        binding.chipOther.isEnabled = isEnabled
    }

    fun isFieldsValueChange(): Boolean {
        if (!manageAddressViewModel.addressItemList.value?.addressline1.equals(
                manageAddressViewModel.address.value, true
            )
        ) {
            return true
        } else if (!manageAddressViewModel.addressItemList.value?.addressline2.equals(
                manageAddressViewModel.address2.value, true
            )
        ) {
            return true
        } else if (!manageAddressViewModel.addressItemList.value?.pincode.equals(
                manageAddressViewModel.pincode.value, true
            )
        ) {
            return true
        } else if (!manageAddressViewModel.addressItemList.value?.landmark.equals(
                manageAddressViewModel.landMark.value, true
            )
        ) {
            return true
        } else if (!manageAddressViewModel.addressItemList.value?.stateName.equals(
                manageAddressViewModel.state.value, true
            )
        ) {
            return true
        } else if (!manageAddressViewModel.addressItemList.value?.cityName.equals(
                manageAddressViewModel.city.value, true
            )
        ) {
            return true
        }
        return false
    }

    fun openBottomSheet() {
        hideKeyboard(this@AddAddressActivity)
        if(editDeleteAddressBottomSheet.isAdded){
            return
        }
        editDeleteAddressBottomSheet.isCancelable = false
        if (!editDeleteAddressBottomSheet.isVisible)
            editDeleteAddressBottomSheet.setManageAddressViewModel(
                manageAddressViewModel,
                isEditClick,
                false
            )
        editDeleteAddressBottomSheet.show(supportFragmentManager, "Discard unsaved details?")
    }

    override fun onBackPressed() {
        if (isEditClick) {
            if (isFieldsValueChange()) openBottomSheet() else super.onBackPressed()
        } else {
            if (!isEmptyFieldsValue()) openBottomSheet() else super.onBackPressed()

        }
    }

    fun isEmptyFieldsValue(): Boolean {
        return manageAddressViewModel.address.value.isNullOrEmpty()
                && manageAddressViewModel.address2.value.isNullOrEmpty()
                && manageAddressViewModel.pincode.value.isNullOrEmpty()
                && manageAddressViewModel.state.value.isNullOrEmpty()
                && manageAddressViewModel.city.value.isNullOrEmpty()
    }

    override fun onClick(v: View?) {
        if (isEditClick)
            binding.btnSave.setEnableAndClick(true)
        when (v?.id) {
            R.id.chipOffice -> {
                hideChipErrorText()
                if (manageAddressViewModel.isOfficeAddressAdded && isEditWithChipId != 2) {
                    Toast().showCustomToastMessage(this, getString(R.string.address_type_msg))
                    doOtherChipItemSelection()
                } else {
                    deSelectChips()
                    binding.chipOffice.setChipType(ChipType.SELECTED.value)
                    manageAddressViewModel.chipTypeSelected.postValue(2)
                    binding.txtChipErrorMsg.text = ""
                    binding.etOther.visibility = View.GONE
                    manageAddressViewModel.other.value = ""
                    manageAddressViewModel.updateAddressType(AddressType.OFFICE)
                }
            }

            R.id.chipHome -> {
                hideChipErrorText()
                if (manageAddressViewModel.isHomeAddressAdded && isEditWithChipId != 1) {
                    Toast().showCustomToastMessage(this, getString(R.string.address_type_msg))
                    doOtherChipItemSelection()
                } else {
                    deSelectChips()
                    binding.chipHome.setChipType(ChipType.SELECTED.value)
                    manageAddressViewModel.chipTypeSelected.postValue(1)
                    binding.txtChipErrorMsg.text = ""
                    binding.etOther.visibility = View.GONE
                    manageAddressViewModel.other.value = ""
                    manageAddressViewModel.updateAddressType(AddressType.HOME)
                }
            }

            R.id.chipOther -> {
                hideChipErrorText()
                doOtherChipItemSelection()
            }
        }

    }

    private fun hideChipErrorText() {
        binding.txtChipErrorMsg.visibility = View.GONE
    }

    private fun doOtherChipItemSelection() {
        deSelectChips()
        binding.chipOther.setChipType(ChipType.SELECTED.value)
        manageAddressViewModel.chipTypeSelected.postValue(3)
        binding.txtChipErrorMsg.text = ""
        binding.etOther.visibility = View.VISIBLE
        manageAddressViewModel.updateAddressType(AddressType.OTHER)
    }

    private fun deSelectChips() {
        binding.chipOffice.setChipType(ChipType.UNSELECTED.value)
        binding.chipHome.setChipType(ChipType.UNSELECTED.value)
        binding.chipOther.setChipType(ChipType.UNSELECTED.value)
    }

    enum class ChipType(val value: Int) {
        SELECTED(0), UNSELECTED(1)
    }

    private fun checkLocationPermission() {
        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(
                    this,
                    Manifest.permission.ACCESS_FINE_LOCATION
                )
            ) {
                AlertDialog.Builder(this)
                    .setTitle("Permissions Required")
                    .setMessage("You have denied location permission which is required for this action. Please open settings, go to permissions and allow them.")
                    .setPositiveButton(android.R.string.ok) { dialog, _ ->
                        dialog.dismiss()
                        val intent = Intent(
                            Settings.ACTION_APPLICATION_DETAILS_SETTINGS,
                            Uri.fromParts("package", this.packageName, null)
                        )
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                        startActivity(intent)
                    }
                    .setCancelable(false)
                    .show()
            } else {
                requestLocationPermission()
            }
        } else {
            if (isLocationEnabled(this)) {
                //access location here
                manageAddressViewModel.showLoader()
                manageAddressViewModel.isPincodeServicable.postValue(false)
                fusedLocationProvider?.requestLocationUpdates(
                    locationRequest,
                    locationCallback,
                    Looper.getMainLooper()
                )
                getCurrentGPSLocation()
                manageAddressViewModel.isLocationPermissionGranted.postValue(false)
            } else {
                showEnableLocationPopup()
            }
        }
    }

    private fun requestLocationPermission() {
        manageAddressViewModel.showLoader()
        ActivityCompat.requestPermissions(
            this,
            arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
            LOCATION_PERMISSIONS_REQUEST
        )
    }

    private fun isLocationEnabled(context: Context): Boolean {
        val locationManager = context.getSystemService(LOCATION_SERVICE) as LocationManager
        return isLocationEnabled(locationManager)
    }

    private val locationCallback: LocationCallback = object : LocationCallback() {
        override fun onLocationResult(locationResult: LocationResult) {
            super.onLocationResult(locationResult)
            val list: List<Location> = locationResult.locations
            val location: Location? = if (list.isNotEmpty()) {
                list[list.size - 1]
            } else {
                locationResult.lastLocation
            }
            getLocalityName(location?.latitude!!, location.longitude)
            manageAddressViewModel.hideLoader()
        }

        override fun onLocationAvailability(locationAvailability: LocationAvailability) {
            super.onLocationAvailability(locationAvailability)
        }
    }

    private fun getLocalityName(lat: Double, lng: Double) {
        try {
            val gcd = Geocoder(this, Locale.getDefault())
            var addresses: List<Address>? = null
            try {
                addresses = gcd.getFromLocation(lat, lng, 1)
            } catch (e: IOException) {
                e.printStackTrace()
            }
            if (!addresses.isNullOrEmpty()) {
                fusedLocationProvider?.removeLocationUpdates(locationCallback)
                if (addresses[0].postalCode == null) {
                    manageAddressViewModel.pincodeData.postValue(
                        ErrorMessageData(
                            context.getString(R.string.unableToFetchLocation),
                            InputFieldConstants.STATE_WARNING
                        )
                    )
                    binding.edtPinCode.setETText("")
                    manageAddressViewModel.sendUseLocationClickedEvent(
                        MxUseLocationClicked(
                            addressLine2 = "",
                            city = "",
                            clickedOnPage = "AddressDetailPage",
                            pincode = "",
                            pincodeFetched = false,
                            pincodeFetchedResponse = "failed",
                            serviceable = false,
                            state = "",
                            order_id = if (SharedPrefManager.getInstance().incompleteOrderId > 0)
                                SharedPrefManager.getInstance().incompleteOrderId.toString()
                            else null
                        )
                    )
                } else {
                    fusedLocationProvider!!.removeLocationUpdates(locationCallback)
                    binding.edtPinCode.setInputFieldData(addresses[0].postalCode)
                    val streetAddressLines: String = addresses[0].getAddressLine(0)
                    val addressArray =
                        streetAddressLines.split(",".toRegex()).dropLastWhile { it.isEmpty() }
                            .toTypedArray()
                    var streetAddress = StringBuilder()
                    if (addressArray.size > 3) {
                        for (i in 1 until addressArray.size - 3) {
                            if (streetAddress.isEmpty()) {
                                streetAddress = StringBuilder(addressArray[i])
                                continue
                            }
                            streetAddress.append(", ").append(addressArray[i])
                        }
                    }

                    if (streetAddress.toString().isNotBlank()) {
                        setFieldState(InputFieldConstants.STATE_ACTIVE, true)
                        binding.edtAddress2.setInputFieldData(streetAddress.toString().trim())
                    }

                    manageAddressViewModel.userTypeAddressLine2 = streetAddress.toString()
                    fromUserLocationClick = true
                    manageAddressViewModel.fetchPincodeAvailablility(
                        addresses[0].postalCode,
                        fromUserLocationClick
                    )
                }
            } else {
                fusedLocationProvider!!.removeLocationUpdates(locationCallback)
                manageAddressViewModel.pincodeData.postValue(ErrorMessageData("Unable to fetch current location. Please enter pincode."))
                binding.edtPinCode.setETText("")
                manageAddressViewModel.sendUseLocationClickedEvent(
                    MxUseLocationClicked(
                        addressLine2 = "",
                        city = "",
                        clickedOnPage = "AddressDetailPage",
                        pincode = "",
                        pincodeFetched = false,
                        pincodeFetchedResponse = "failed",
                        serviceable = false,
                        state = "",
                        order_id = if (SharedPrefManager.getInstance().incompleteOrderId > 0)
                            SharedPrefManager.getInstance().incompleteOrderId.toString()
                        else null
                    )
                )
            }
        } catch (_: Exception) {
        }
    }

    private fun getCurrentGPSLocation() {
        fusedLocationProvider!!.lastLocation.addOnSuccessListener(this) { location: Location? ->
            if (location != null) {
                getLocalityName(location.latitude, location.longitude)
            }
            manageAddressViewModel.hideLoader()
        }.addOnFailureListener {
            manageAddressViewModel.pincodeData.postValue(ErrorMessageData("Unable to fetch current location. Please enter pincode."))
            binding.edtPinCode.setETText("")
            manageAddressViewModel.hideLoader()
            manageAddressViewModel.sendUseLocationClickedEvent(
                MxUseLocationClicked(
                    addressLine2 = "",
                    city = "",
                    clickedOnPage = "AddressDetailPage",
                    pincode = "",
                    pincodeFetched = false,
                    pincodeFetchedResponse = "failed",
                    serviceable = false,
                    state = "",
                    order_id = if (SharedPrefManager.getInstance().incompleteOrderId > 0)
                        SharedPrefManager.getInstance().incompleteOrderId.toString()
                    else null
                )
            )

        }
    }

    private fun showEnableLocationPopup() {
        val mLocationRequest = LocationRequest.create()
        mLocationRequest.setInterval(10)
        mLocationRequest.setSmallestDisplacement(10f)
        mLocationRequest.setFastestInterval(10)
        mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY)
        val builder = LocationSettingsRequest.Builder()
        builder.addLocationRequest(mLocationRequest)
        val task: Task<LocationSettingsResponse> =
            LocationServices.getSettingsClient(this).checkLocationSettings(builder.build())
        task.addOnCompleteListener { task1 ->
            try {
                val response: LocationSettingsResponse = task1.getResult(ApiException::class.java)
                // All location settings are satisfied. The client can initialize location
                // requests here.
            } catch (exception: ApiException) {
                when (exception.statusCode) {
                    LocationSettingsStatusCodes.RESOLUTION_REQUIRED ->                         // Location settings are not satisfied. But could be fixed by showing the
                        // user a dialog.
                        try {
                            // Cast to a resolvable exception.
                            val resolvable = exception as ResolvableApiException
                            // Show the dialog by calling startResolutionForResult(),
                            // and check the result in onActivityResult().
                            resolvable.startResolutionForResult(
                                this,
                                ENABLE_GPS_REQUEST
                            )
                        } catch (e: SendIntentException) {
                            // Ignore the error.
                        } catch (e: ClassCastException) {
                            // Ignore, should be an impossible error.
                        }

                    LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE -> {}
                }
            }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int, permissions: Array<String?>,
        grantResults: IntArray
    ) {
        resumeFromPermissionRequest = true
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            if (requestCode == LOCATION_PERMISSIONS_REQUEST) {
                manageAddressViewModel.isLocationPermissionGranted.postValue(true)
            }
        }
        manageAddressViewModel.hideLoader()
    }

    fun setManageAddressViewModel(viewModel: ManageAddressViewModel) {
        binding.model = manageAddressViewModel.addressItemList.value
    }

}