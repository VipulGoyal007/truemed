package com.intellihealth.truemeds.presentation.fragment

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.intellihealth.salt.callbacks.EdittextCallback
import com.intellihealth.salt.constants.InputFieldConstants
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.mixpanel.MxLoginPageViewed
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.data.utils.applyRegex
import com.intellihealth.truemeds.data.utils.getClipboardText
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.databinding.FragmentLoginMobileNumberBinding
import com.intellihealth.truemeds.domain.navigation.navigateToPolicyDetailActivity
import com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase
import com.intellihealth.truemeds.mvvm.data.appsflyer.AFLoginPageViewed
import com.intellihealth.truemeds.presentation.activity.BaseActivity
import com.intellihealth.truemeds.presentation.activity.BaseActivityWithLogin
import com.intellihealth.truemeds.presentation.activity.PolicyDetailActivity
import com.intellihealth.truemeds.presentation.analytics.FirebaseEvent
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel
import com.intellihealth.truemeds.presentation.viewmodel.LoginViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class LoginMobileNumberFragment() : Fragment(R.layout.fragment_login_mobile_number), View.OnClickListener {
    private val binding by viewBinding(FragmentLoginMobileNumberBinding::bind)
    private lateinit var viewModel: LoginViewModel
    private var enteredMobileNo: String? = null
    private var sheetType: String = ""
    private var pageSection: String = ""

    constructor(type: String = "login", _pageSection: String) : this(){
        sheetType = type
        pageSection = _pageSection
    }

    @Inject
    lateinit var firebaseEventUseCase: FirebaseEventUseCase

    private var isFromBottomsheet = false

    override fun onPause() {
        super.onPause()

        isProgressLoaderVisible(false)
    }

    private fun initView() {

        viewModel = ViewModelProvider(requireActivity())[LoginViewModel::class.java]
        isFromBottomsheet = arguments?.getBoolean(BundleConstants.isFromBottomsheet, false) == true

        sendLoginPageViewedEvent()
        binding.viewModel = viewModel
        binding.btnGetOtp.setOnClickListener {
            getOTPClicked()
        }

        binding.btnGetOtp.setEnable(false)
        binding.btnGetOtp.setEnableAndClick(false)

        binding.btnTrueCallerLogin.setOnClickListener(this@LoginMobileNumberFragment)

        if(isFromBottomsheet){
            with(binding.scrollView){
                post {
                    fling(0)
                    smoothScrollTo(0, 0)
                }
            }
        }

    }

    private fun isProgressLoaderVisible(isShow: Boolean) {
        if (!sheetType.equals("login", true)) {
            if (isShow)
                binding.progressBar.visibility = View.VISIBLE
            else
                binding.progressBar.visibility = View.GONE
        }
    }

    private fun setEventListener() {
        with(binding) {
            viewModel?.showLoginError?.observe(requireActivity()) {
                viewModel?.mobileNumberErrorMessage?.let { error ->
                    isProgressLoaderVisible(false)
                    tvLoginMobileNumber.setUpState(InputFieldConstants.STATE_ERROR)
                    tvLoginMobileNumber.setHelperText(error, InputFieldConstants.STATE_ERROR)
                }
            }
//            tvLoginMobileNumber.setInputDigits("[0-9]")
            tvLoginMobileNumber.setCallback(object: EdittextCallback{
                override fun pasteButtonClick() {
                    val clipboardText = getClipboardText(requireActivity()) ?: ""
                    val formattedString = applyRegex(clipboardText) ?: ""
                    if (formattedString.matches(Regex("^[\\\\+0-9]+\$"))) {
                        tvLoginMobileNumber.setETText(formattedString ?: "")
                    }
                }

            })
            tvLoginMobileNumber.setInputFieldCallback(
                { etData ->
                    isProgressLoaderVisible(false)
                    when (etData) {
                        "error" -> {
                            tvLoginMobileNumber.setUpState(InputFieldConstants.STATE_ERROR)
                            tvLoginMobileNumber.setHelperText(
                                "wrong credentials",
                                InputFieldConstants.STATE_ERROR
                            )

                        }

                        "success" -> {
                            tvLoginMobileNumber.setUpState(InputFieldConstants.STATE_SUCCESS)
                            tvLoginMobileNumber.setHelperText(
                                "email verified successfully",
                                InputFieldConstants.STATE_SUCCESS
                            )
                        }

                        "warning" -> {
                            tvLoginMobileNumber.setUpState(InputFieldConstants.STATE_WARNING)
                            tvLoginMobileNumber.setHelperText(
                                "last try",
                                InputFieldConstants.STATE_WARNING
                            )
                        }
                    }
                },

                object : TextWatcher {
                    override fun afterTextChanged(s: Editable?) {
                        enteredMobileNo = s.toString()
                        s?.let {
                            if (it.isEmpty()) {
                                tvLoginMobileNumber.setHintText("Enter your 10-digit number")
                            }

                            if (it.length == 10) {
                                binding.btnGetOtp.setEnable(true)
                                binding.btnGetOtp.setEnableAndClick(true)
                            } else {
                                binding.btnGetOtp.setEnable(false)
                                binding.btnGetOtp.setEnableAndClick(false)
                            }

                            if (it.length > 5) tvLoginMobileNumber.setActionButtonEnabled(true)
                            viewModel?._updateButtonText?.postValue(false)


                        }
                        when (s.toString()) {
                            "error" -> {
                                tvLoginMobileNumber.setUpState(InputFieldConstants.STATE_ERROR)
                                tvLoginMobileNumber.setHelperText(
                                    "wrong credentials",
                                    InputFieldConstants.STATE_ERROR
                                )
                            }

                                "success" -> {
                                    tvLoginMobileNumber.setUpState(InputFieldConstants.STATE_SUCCESS)
                                    tvLoginMobileNumber.setHelperText(
                                        "email verified successfully",
                                        InputFieldConstants.STATE_SUCCESS
                                    )
                                }

                                "warning" -> {
                                    tvLoginMobileNumber.setUpState(InputFieldConstants.STATE_WARNING)
                                    tvLoginMobileNumber.setHelperText(
                                        "last try",
                                        InputFieldConstants.STATE_WARNING
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
                if (actionId == EditorInfo.IME_ACTION_DONE || actionId == EditorInfo.IME_NULL) {
                    // Handle "Done" or "Enter" button click
                    getOTPClicked()
                    true
                } else {
                    false
                }
                false
            }
            tvTermsConditions.setOnClickListener {
                /*val intent = Intent(requireActivity(), PolicyDetailActivity::class.java)
                intent.putExtra("key", "Terms & Condition")
                startActivity(intent)*/

                navigateToPolicyDetailActivity(
                    params = bundleOf(
                        "key" to "Terms & Condition"
                    ),
                )

                firebaseEventUseCase.logFirebaseEvent(FirebaseEvent.FIREBASE_REGISTRATION_TERMS_AND_CONDITIONS,"")
            }

            viewModel?.updateButtonText?.observe(requireActivity()) {
                if (it) {
                    viewModel?.continueExploringFlowEnabled = true
                    binding.btnGetOtp.setTitle(getString(R.string.continue_exploring))
                } else {
                    viewModel?.continueExploringFlowEnabled = false
                    binding.btnGetOtp.setTitle(getString(R.string.get_otp))
                }
            }

            lifecycleScope.launch {
                delay(100)
                tvLoginMobileNumber.getFocus()
            }
        }
        viewModel.notificationPermissionCallBackLivedata?.observe(requireActivity(), EventObserver {
            if(it != null && it){
                lifecycleScope.launch {
                    delay(50)
                    binding.tvLoginMobileNumber.getFocus()
                }
            }
        })

    }

    private fun checkNumberStartsWith(clipboardText: String) =
        ((clipboardText.startsWith("+91") || clipboardText.startsWith("0") || clipboardText.startsWith(
            "(+91)"
        )))

    private fun sendLoginPageViewedEvent() {
        val mxLoginPageViewed = MxLoginPageViewed(
            if (sheetType == "login") "app_open" else sheetType,
            pageSection,
            viewModel.isTruecaller
        )
        val afLoginPageViewed = AFLoginPageViewed(viewModel.isTruecaller)
        viewModel.loginPageViewedEvent(mxLoginPageViewed, afLoginPageViewed)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //container?.removeAllViews()
        initView()
        setEventListener()

        val type: BaseViewModel.DeepLinkTypes? = viewModel.getDeepLinkType(
            (requireActivity().intent.data ?: "").toString()
        )
        if (isAdded)
            binding.tvLoginMobileNumber.setLabel(
                if (type == BaseViewModel.DeepLinkTypes.PAYMENT_LINK) "Enter your mobile number to make the payment"
                else "Enter your mobile number to get started"
            )
    }

    private fun disableLoadingView(dialog: Dialog) {
        dialog.dismiss()
    }

    private fun enableLoadingView(dialog: Dialog) {
        dialog.setContentView(R.layout.dialog_progressbar)
        dialog.setCancelable(false)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.window?.setDimAmount(0f)
        dialog.show()
    }

    private fun getOTPClicked() {
        if (viewModel.continueExploringFlowEnabled) {
            viewModel._updateButtonText.postValue(true)
            viewModel.processSkipFlow.postValue(true)
        } else {


            viewModel.continueExploringFlowEnabled = false
            binding.tvLoginMobileNumber.setUpState(InputFieldConstants.STATE_TYPING)
            binding.tvLoginMobileNumber.setHelperText(
                "", InputFieldConstants.STATE_TYPING
            )
            viewModel.mobileNumberErrorMessage = ""
            viewModel.otpObserver.postValue(Event(""))

            if (!enteredMobileNo.isNullOrEmpty()) {
                enteredMobileNo?.let {
                    if (isNetworkAvailable(requireContext())) {
                        isProgressLoaderVisible(true)
                        viewModel.performSendOTP(it, false)
//                        viewModel.sendOTPClickedEvent(MxOtpClicked(isNewUser = false, mobileNumber = it))
                    } else {


                        (activity as BaseActivity).showDialogBox(
                            popUpType = PopUpType.INTERNET_FAILURE,
                            object : PopUpDialogCallback {
                                override fun onActionButtonClicked() {}
                                override fun onCloseButtonClicked() {
                                }
                            }, true
                        )

                    }

                }
            } else {
                binding.tvLoginMobileNumber.setUpState(InputFieldConstants.STATE_ERROR)
                binding.tvLoginMobileNumber.setHelperText(
                    if (viewModel.mobileNumberErrorMessage.isNullOrEmpty()) "Enter a valid mobile number" else viewModel.mobileNumberErrorMessage!!,
                    InputFieldConstants.STATE_ERROR
                )
                binding.tvLoginMobileNumber.setHintText()
            }
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            binding.btnTrueCallerLogin.id ->{
                (requireActivity() as BaseActivityWithLogin).initializationTrueCallerOAuth()
            }
        }
    }

}