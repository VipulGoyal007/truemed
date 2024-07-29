package com.intellihealth.truemeds.presentation.fragment

import android.app.Dialog
import android.content.BroadcastReceiver
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.google.android.gms.auth.api.phone.SmsRetriever
import com.intellihealth.salt.callbacks.OtpCardCallBack
import com.intellihealth.salt.callbacks.OtpViewCallBack
import com.intellihealth.salt.constants.OtpConstants
import com.intellihealth.salt.models.OtpCardModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxOtpTyped
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.databinding.FragmentLoginOtpBinding
import com.intellihealth.truemeds.domain.navigation.navigateToHomePageActivity
import com.intellihealth.truemeds.domain.navigation.navigateToPolicyDetailActivity
import com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase
import com.intellihealth.truemeds.presentation.activity.BaseActivity
import com.intellihealth.truemeds.presentation.activity.LoginActivity
import com.intellihealth.truemeds.presentation.activity.PolicyDetailActivity
import com.intellihealth.truemeds.presentation.analytics.FirebaseEvent
import com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel
import com.intellihealth.truemeds.presentation.broadcastreceiver.SmsReceiver
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.callbacks.SmsListener
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.LoginViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.regex.Pattern
import javax.inject.Inject


@AndroidEntryPoint
class LoginOtpFragment(type: String = "login") : Fragment(R.layout.fragment_login_otp) {
    private val binding by viewBinding(FragmentLoginOtpBinding::bind)
    private lateinit var viewModel: LoginViewModel
    private lateinit var otpCardData: OtpCardModel
    private var job: Job? = null
    private var isFromBottomsheet = false
    private var broadcastReceiver: BroadcastReceiver? = null
    private var isOtpSetFromClipboard = false
    private var sheetType: String = ""
    private var mContext: Context? = null
    var editClick = false
    private var intentData: Uri?=null
    init {
        sheetType = type
    }

    @Inject
    lateinit var firebaseEventUseCase: FirebaseEventUseCase


    override fun onResume() {
        super.onResume()

        if (editClick) {
            resetOtp()
            setupData()
            editClick = false
        }
        addSmsBroadcast()
    }

    fun resetOtp(){
        binding.loginOTPView.resetOtp()
        binding.loginOTPView.updateHyperText(
            "",
            OtpConstants.STATE_SELECTED
        )
    }

    override fun onPause() {
        /**
         * Cancel any ongoing flow job from viewModel to save memory
         */
//        job?.cancel()

        /*binding.loginOTPView.resetOtp()
        binding.loginOTPView.updateHyperText(
            "",
            OtpConstants.STATE_SELECTED
        )*/

        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        removeSmsBroadcast()
    }

    private fun initView() {
        viewModel = ViewModelProvider(requireActivity())[LoginViewModel::class.java]
        binding.viewModel = viewModel
        setupData()
        updateOtpCopyPasteListener()
        lifecycleScope.launch {
            delay(100)
            binding.loginOTPView.getFocus()
        }
    }

    private fun setupData() {
        otpCardData = OtpCardModel(
            "Verify your OTP",
            "Enter one time password sent on",
            viewModel.mobileNumber,
            "Resend your OTP in secs", "Edit", ""
        )
        binding.otpCardData = otpCardData
        startTimer()
    }

    private fun startTimer() {
        job = lifecycleScope.launch {
            viewModel.startCountDownTimer(60, 1000).collect { time ->
                if (time.toInt() == 0) {
                    binding.otpCardData = otpCardData.copy(
                        hyperTextValue = "Didn’t receive OTP?",
                        btnEndText = "Resend OTP"
                    )
                } else {
                    binding.otpCardData = otpCardData.copy(hyperTextValue = "Resend your OTP in $time secs")
                }
            }
/*
            viewModel.startCountDownTimer(60, 1000).collect { time ->
                binding.otpCardData = if (time.toInt() == 0) {
                    otpCardData.copy(
                        hyperTextValue = if ((viewModel?.mobileNumberErrorMessage ?: "") == "You have exceeded per day OTP limit") "" else "Didn’t receive OTP?",
                        btnEndText = if ((viewModel?.mobileNumberErrorMessage ?: "") == "You have exceeded per day OTP limit") "" else "Resend OTP"
                    )
                } else {
                    otpCardData.copy(hyperTextValue = if ((viewModel?.mobileNumberErrorMessage ?: "") == "You have exceeded per day OTP limit") "" else "Resend your OTP in $time secs")
                }
            }
*/
        }
    }


    private fun setEventListener() {

        viewModel?.updateButtonText?.observe(requireActivity()) {
            if (it) {
                job?.cancel()
                binding.otpCardData = otpCardData.copy(hyperTextValue = "")
                binding.loginOTPView.updateHyperText(
                    viewModel?.mobileNumberErrorMessage ?: "",
                    OtpConstants.STATE_ERROR
                )
//                binding.otpCardData = otpCardData.copy(
//                    btnEndText = ""
//                )
            }
        }

        with(binding) {
            viewModel?.otpObserver?.observe(requireActivity()) {
                isProgressLoaderVisible(false)
                if (null != viewModel?.mobileNumberErrorMessage && viewModel?.mobileNumberErrorMessage!!.isNotEmpty()) {
                    loginOTPView.updateOtpState(OtpConstants.STATE_ERROR)
                    loginOTPView.updateHyperText(
                        viewModel?.mobileNumberErrorMessage ?: "",
                        OtpConstants.STATE_ERROR
                    )
                } else {
                    if (viewModel?.isOTPVerified == true) {
                        loginOTPView.updateOtpState(OtpConstants.STATE_SELECTED)
                        loginOTPView.updateHyperText(
                            "OTP verified successfully",
                            OtpConstants.STATE_SELECTED
                        )
                        viewModel?.isOTPVerified = false
                        if (!isFromBottomsheet) {
                            navigateToHomePageActivity(
                                flags = listOf( Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK),
                                uri = intentData
                            )
                        }
                    }
                }
            }

            /**
             * When user click on Edit number, this will be invoke
             */
            loginOTPView.setCallBack(object : OtpCardCallBack {
                override fun onClick() {
                  /*  var pageName =""
                    pageName = if (isFromBottomsheet) {
                        "MobileOtpFragment"
                    } else {
                        "Login"
                    }*/
                    var pageName ="MobileOtpFragment"

                    if (viewModel!!.isNewCustomer) {
                        firebaseEventUseCase.registrationMobileNoEdit(FirebaseEventModel(mobile = viewModel?.mobileNumber,
                            pageName = pageName))

                    } else {
                        firebaseEventUseCase.loginMobileNoEdit(FirebaseEventModel(mobile = viewModel?.mobileNumber,
                            pageName = pageName))
                    }
                    if (job?.isActive == true) {
                        job?.cancel()
                    }

                    editClick = true
                    viewModel?.loginOTPEditClicked("")
                }

                override fun onOtpComplete(otp: String) {
                    viewModel?.enteredOTP = otp

                    if (isAdded)
                        if (isNetworkAvailable(requireContext())) {
                            isProgressLoaderVisible(true)
                            viewModel?.setCurrentPage(sheetType)
                            viewModel?.performOTPVerification(requireContext())
                            viewModel?.sendOTPTypeEvent(MxOtpTyped(viewModel?.fillType?:"", viewModel?.mobileNumber ?: ""))
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


            })

            /**
             * Here OTP will be re-sent on the entered device
             * Timer will start counting
             */
            loginOTPView.setViewCallBack(object : OtpViewCallBack {
                override fun onEditCTAClick() {
                    viewModel?.mobileNumber?.let { number ->
                        isOtpSetFromClipboard = false
                        if (isNetworkAvailable(requireContext())) {
                            viewModel?.performSendOTP(number, true)
                            var pageName ="MobileOtpFragment"

                            if (viewModel!!.isNewCustomer) {
                                firebaseEventUseCase.registrationResendOtp(FirebaseEventModel(mobile = number,
                                    pageName = pageName))
                            } else {
                                firebaseEventUseCase.loginResendOtp(FirebaseEventModel(mobile = number,
                                    pageName = pageName))
                            }
                            resetOtp()
                            setupData()
                        } else {
                            (activity as LoginActivity).showDialogBox(
                                popUpType = PopUpType.INTERNET_FAILURE,
                                object : PopUpDialogCallback {
                                    override fun onActionButtonClicked() {}
                                    override fun onCloseButtonClicked() {

                                    }
                                }, true
                            )
                        }

                    }
                }


            })


        }

        binding.tvTermsConditions.setOnClickListener {
           /* val intent = Intent(requireActivity(), PolicyDetailActivity::class.java)
            intent.putExtra("key", "Terms & Condition")
            startActivity(intent)*/

            navigateToPolicyDetailActivity(
                params = bundleOf(
                    "key" to "Terms & Condition"
                ),
            )

            firebaseEventUseCase.logFirebaseEvent(FirebaseEvent.FIREBASE_REGISTRATION_TERMS_AND_CONDITIONS,"")
        }
        /*val loader = Dialog(requireContext())
        viewModel.isLoading.observe(viewLifecycleOwner){
            if (it) enableLoadingView(loader)
            else disableLoadingView(loader)
        }*/
    }

    private fun isProgressLoaderVisible(isShow: Boolean) {
        if (!sheetType.equals("login", true)) {
            if (isShow)
                binding.progressBar.visibility = View.VISIBLE
            else
                binding.progressBar.visibility = View.GONE
        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Inflate the layout for this fragment
        isFromBottomsheet = arguments?.getBoolean(BundleConstants.isFromBottomsheet, false) == true
        initView()
        intentData=requireActivity().intent.data
        setEventListener()
        viewModel.fillType = "keyboard_typed"

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

    private fun updateOtpCopyPasteListener() {
        try {
            val clipBoard =
                activity?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            clipBoard.addPrimaryClipChangedListener {
                val clipData = clipBoard.primaryClip ?: return@addPrimaryClipChangedListener
                if (clipData.itemCount == 0) {
                    return@addPrimaryClipChangedListener
                }
                val item = clipData.getItemAt(0)
                val charSequence = item.text
                if (TextUtils.isEmpty(charSequence)) {
                    return@addPrimaryClipChangedListener
                }
                val text = charSequence.toString()
                val pattern =
                    Pattern.compile("(?<![-.])\\b[0-9]+\\b(?!\\.[0-9])")
                if (!TextUtils.isEmpty(text)) {
                    val matcher = pattern.matcher(text)
                    val otp: String
                    if (matcher.find()) {
                        otp = matcher.group(0) ?: ""
                        if (!TextUtils.isEmpty(otp) && TextUtils.isDigitsOnly(otp) && otp.length == 4 && !isOtpSetFromClipboard) {
                            isOtpSetFromClipboard = true
                            viewModel.fillType = "autofilled"
                            binding.loginOTPView.setOtp(otp)
                        }
                    }
                }
            }
        } catch (_: Exception) {
        }
    }

    private fun addSmsBroadcast() {
        viewModel.fillType = "keyboard_typed"
        val client = SmsRetriever.getClient(requireContext() /* context */)
        val task = client.startSmsRetriever()
        task.addOnSuccessListener {
            // SMS retrieval started
            broadcastReceiver = SmsReceiver()
            val intentFilter = IntentFilter("android.provider.Telephony.SMS_RECEIVED")
            requireContext().registerReceiver(broadcastReceiver, intentFilter)
            SmsReceiver.setListener(
                object : SmsListener {
                    override fun messageReceived(messageText: String?) {
                        if (!TextUtils.isEmpty(messageText) && TextUtils.isDigitsOnly(messageText) && messageText?.length == 4) {
                            viewModel.fillType = "autofilled"
                            binding.loginOTPView.setOtp(messageText)
                        }
                    }

                    override fun onSmsTimeOut() {
                    }
                }
            )
        }
        task.addOnFailureListener {
        }
    }

    private fun removeSmsBroadcast() {
        broadcastReceiver?.let {
            requireContext().unregisterReceiver(broadcastReceiver)
        }

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        this.mContext = context
    }
}