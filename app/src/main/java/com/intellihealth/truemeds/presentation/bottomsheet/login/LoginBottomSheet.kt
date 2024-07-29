package com.intellihealth.truemeds.presentation.bottomsheet.login

import android.app.Activity
import android.app.Dialog
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.intellihealth.salt.models.BottomsheetHeaderModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.BottomsheetLoginBinding
import com.intellihealth.truemeds.presentation.fragment.LoginMobileNumberFragment
import com.intellihealth.truemeds.presentation.fragment.LoginOtpFragment
import com.intellihealth.truemeds.presentation.viewmodel.LoginViewModel
import com.intellihealth.truemeds.presentation.viewpager.LoginBottomSheetPager
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.data.model.home.RatingDetailsResponseModel
import com.intellihealth.truemeds.presentation.callbacks.FeedbackCallback
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel

class LoginBottomSheet() : BottomSheetDialogFragment() {
    private lateinit var binding: BottomsheetLoginBinding
    private lateinit var bottomSheetHeaderModel: BottomsheetHeaderModel
    private lateinit var dialog: BottomSheetDialog
    private var header: Boolean = true
    private lateinit var viewModel: LoginViewModel
    private var sheetType: String = ""
    private var pageSection: String = ""

    constructor(type: String = "homepage", _pageSection: String) : this(){
        this.sheetType = type
        this.pageSection = _pageSection
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.bottomsheet_login, container, false)
        viewModel = ViewModelProvider(requireActivity())[LoginViewModel::class.java]
        resetFlags()
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        setEventListeners()
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        dialog = BottomSheetDialog(requireContext(), theme)
        bottomSheetHeaderModel = BottomsheetHeaderModel(
            closeIcon = null,
            header = null,
            subHeader = null,
            icon = null,
            showIcon = false,
            showViewDragHandle = false,
            height = 40,
            bottomSheetState = 6
        )
//        setUpBottomSheetBehaviour(
//            bottomSheetDialog = dialog,
//            isDraggable = false,
//            bottomSheetState = bottomSheetHeaderModel.bottomSheetState,
//            height = 40//bottomSheetHeaderModel.height
//        )
        return dialog
    }

    fun openBottomSheet(showViewDragHandle: Boolean, height: Int, bottomSheetState: Int) {
        this.header = header
        bottomSheetHeaderModel = BottomsheetHeaderModel(
            null, null,
            R.drawable.ic_call, true,
            R.drawable.ic_call, header, height,
            bottomSheetState
        )
    }


    private fun setEventListeners() {
        viewModel?.otpObserver?.observe(requireActivity()) {
            if (null == viewModel?.mobileNumberErrorMessage) {
                if (dialog.isShowing) {
                    dialog.dismiss()
                    resetFlags()
                    HomeViewModel.postLoginAction.postValue(true)
                }
            }

        }

        viewModel.bottomSheetPageSwitch.observe(requireActivity()) { index ->
            binding.loginBottomSheet.currentItem = index
        }
        binding.ivClose.setOnClickListener {
            if (dialog.isShowing) {
                dialog.dismiss()
                resetFlags()
            }
        }

        viewModel.processSkipFlow.observe(this) {
            if (it) {
                viewModel.processSkipFlow.postValue(false)
                dismiss()
            }
        }
    }

    /**
     * When bottom sheet is closed, this method will reset the flags
     * so that when opened again it should not remain in last state in which it was
     */
    private fun resetFlags() {
        viewModel.bottomSheetPageSwitch.postValue(0)
        viewModel.mobileNumberErrorMessage = null
    }

    private fun initView() {

        val otpFragment = LoginOtpFragment(sheetType)
        val bundle = Bundle()
        bundle.putBoolean(BundleConstants.isFromBottomsheet, true)
        otpFragment.arguments = bundle

        val loginMobileNumberFragment = LoginMobileNumberFragment(sheetType,pageSection)
        val bundleNew = Bundle()
        bundleNew.putBoolean(BundleConstants.isFromBottomsheet, true)
        loginMobileNumberFragment.arguments = bundle

        val fragments = listOf(
            loginMobileNumberFragment,
            otpFragment
        )
        val adapter =
            activity?.let {
                LoginBottomSheetPager(
                    fragments,
                    it.lifecycle,
                    it.supportFragmentManager
                )
            }
        binding.loginBottomSheet.adapter = adapter
        binding.loginBottomSheet.isUserInputEnabled = false
    }

    override fun getTheme() = R.style.BottomSheetDialog

}