package com.intellihealth.truemeds.presentation.activity

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.EditorInfo
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.callbacks.RadioListCallback
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.salt.models.RadioListModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.user.CustomerDetailsResponse
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.data.utils.hideKeyboard
import com.intellihealth.truemeds.databinding.ActivityDeliveryDetailsBinding
import com.intellihealth.truemeds.databinding.ActivityEditProfileBinding
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.viewmodel.EditProfileDetailViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class EditProfileActivity : BaseActivity() {
    private val binding by viewBinding(ActivityEditProfileBinding::inflate)
    private val viewModel by lazy { ViewModelProvider(this)[EditProfileDetailViewModel::class.java] }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        lifecycle.addObserver(viewModel)
        getIntentData()
        initView()
        viewModel.getCustomerDetailsApi()
        updateStatusBarColor()
        addEditTextChangeListener()
        setEventListener()
        getBundleData()
        viewModel.requestFocus.observe(this) {
            when (it) {
                1 -> scrollToPosition(binding.edtFirstName)
                2 -> scrollToPosition(binding.edtEmail)
                3 -> scrollToPosition(binding.edtAge)
                4 -> scrollToPosition(binding.txtGender)
            }
        }
    }

    override fun extractIntentData(){

    }

    private fun scrollToPosition(view: View) {
        hideKeyboard(this@EditProfileActivity)
        val scrollTo: Int = (binding.scrollView.parent.parent as View).top + view.top
        binding.scrollView.smoothScrollTo(0, scrollTo)
    }

    private fun getBundleData() {
        viewModel.getPatientExperimentCategory()
    }

    private fun setUserData(customerDetails: CustomerDetailsResponse.CustomerInfo?) =
        with(binding) {
            viewModel?.customerProfileDetails = customerDetails
            customerDetails?.firstName?.takeIf { it.isNotBlank() }?.let {
                edtFirstName.setInputFieldData(it)
                viewModel?.firstName?.value = it
            }
            customerDetails?.lastName?.takeIf { it.isNotBlank() }?.let {
                edtLastName.setInputFieldData(it)
                viewModel?.lastName?.value = it
            }
            customerDetails?.emailAddress?.takeIf { it.isNotBlank() }?.let {
                edtEmail.setInputFieldData(it.trim())
                viewModel?.email?.value = it
            }
            customerDetails?.mobileNo?.takeIf { it.isNotBlank() }?.let {
                edtMobileNumber.setInputFieldData(it)
                with(binding.edtMobileNumber) {
                    setUpState(com.intellihealth.salt.constants.InputFieldConstants.STATE_PRE_FIELD)
                }

                viewModel?.mobileNo?.value = it
            }
            customerDetails?.age?.let {
                edtAge.setInputFieldData(it.toString())
                viewModel?.age?.value = it.toString()
            }

            val radioList = arrayListOf(
                RadioListModel(
                    id = 0,
                    "Male",
                    selected = customerDetails?.genderName.equals("Male", true),
                    R.color.upload_prescription_text_color,
                    10
                ),
                RadioListModel(
                    id = 1,
                    "Female",
                    selected = customerDetails?.genderName.equals("Female", true),
                    R.color.upload_prescription_text_color,
                    10
                ),
                RadioListModel(
                    id = 2,
                    "Other",
                    selected = customerDetails?.genderName.equals("Others", true),
                    R.color.upload_prescription_text_color,
                    10
                )
            )

            var currentPosSelected = 0
            if (customerDetails?.genderName.equals("Female", true))
                currentPosSelected = 1
            else if (customerDetails?.genderName.equals("Others", true))
                currentPosSelected = 2

            binding.rvListHorizontal.setAdapter(radioList, currentPosSelected,
                object : RadioListCallback {
                    override fun getItem(id: Int, title: String) {

                        viewModel?.showGenderError?.value = false
                        viewModel?.gender?.value = title
                    }

                })
            viewModel?.gender?.value = binding?.rvListHorizontal?.getSelectedData()?.second!!
        }

    private fun setEventListener() {


        viewModel.eventMessage.observe(this,
            EventObserver {
                when {

                    it.equals(MESSAGES.NO_NETWORK) -> {
                        showDialogBox(PopUpType.INTERNET_FAILURE, object : PopUpDialogCallback {
                            override fun onActionButtonClicked() {
                                // apiType=1 is for get customer details api calling
                                if (viewModel.apiType == 1)
                                    viewModel.getCustomerDetailsApi()
                                // apiType=2 is for update profile api calling
                                else if (viewModel.apiType == 2)
                                    viewModel.updateProfile()

                            }

                            override fun onCloseButtonClicked() {

                            }
                        }, true)
                    }


                }

            })

    }


    private fun initView() {
        // setting all input fields input digits from here
        setInputDigits()
        binding.txtHeaderEditProfile.setUpMobileSectionHeadersData(
            MobileSectionHeadersModel(
                getString(R.string.editProfile), "", "",
                "", 0
            )
        )
        binding.txtHeaderEditProfile.setBackArrowClickCallback(object :
            BackArrowClickCallback {
            override fun onBackArrowClick() {
                overridePendingTransition(0, R.anim.slide_out)
                finish()
            }
        })

        viewModel.loginFinishActivityEvent.observe(this, EventObserver {
            if (it)
                finish()
        })

        viewModel.loadCustomerDetailsEvent.observe(this, EventObserver {

            it?.let { customerDetails ->
                setUserData(customerDetails)
            }
        })

        viewModel.getGenderEvent.observe(this, EventObserver {
            if (it) {
                viewModel.gender.value = binding.rvListHorizontal.getSelectedData().second
            }
        })
    }

    // setting all input fields input digits from here
    private fun setInputDigits() {
        val nameRegex = "^[a-zA-Z ]+\$"
        binding.edtFirstName.setInputDigits(nameRegex)
        binding.edtFirstName.setMaxCharLength(20)
        binding.edtLastName.setInputDigits(nameRegex)
        binding.edtLastName.setMaxCharLength(20)

        // binding.edtEmail.set


    }

    private fun addEditTextChangeListener() {
        with(binding) {
            edtFirstName.setInputFieldCallback(
                null,

                object : TextWatcher {
                    override fun afterTextChanged(s: Editable?) {
                        viewModel?.firstName?.value = s.toString()

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

            edtLastName.setInputFieldCallback(
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

            edtEmail.setInputFieldCallback(
                null,

                object : TextWatcher {
                    override fun afterTextChanged(s: Editable?) {
                        viewModel?.email?.value = s.toString()
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

            edtAge.setInputFieldCallback(
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

            edtMobileNumber.setInputFieldCallback(
                null,

                object : TextWatcher {
                    override fun afterTextChanged(s: Editable?) {
                        viewModel?.mobileNo?.value = s.toString()

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

            /*viewModel?.gender?.value =
                radioMale.getIsChecked() || radiFemale.getIsChecked() || radioOther.getIsChecked()*/

        }
    }

    override fun onResume() {
        super.onResume()
    }

    private fun getIntentData() {
    viewModel.isEditProfileClick = intent.getBooleanExtra(BundleConstants.IS_EDIT_PROFILE_CLICK, false)
    }
}