package com.intellihealth.truemeds.presentation.bottomsheet.home

import android.app.Dialog
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.home.PrivacyPolicyBottomSheetModel
import com.intellihealth.truemeds.databinding.BottomsheetPrivacyPolicyBinding
import com.intellihealth.salt.models.BottomsheetHeaderModel
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.presentation.model.BottomSheetType
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel
import com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class PrivacyPolicyBottomSheet() :
    BottomSheet() {
    private lateinit var binding: BottomsheetPrivacyPolicyBinding
    private lateinit var bottomSheetHeaderModel: BottomsheetHeaderModel
    private lateinit var dialog: BottomSheetDialog
    private var header: Boolean = true
    private val homeViewModel by lazy { ViewModelProvider(requireActivity())[HomeViewModel::class.java] }
    private var privacyPolicyModel: PrivacyPolicyBottomSheetModel?=null

    constructor(privacyPolicyModel: PrivacyPolicyBottomSheetModel) : this(){
        this.privacyPolicyModel = privacyPolicyModel
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.bottomsheet_privacy_policy, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = homeViewModel
        return binding.root
    }

    private fun setObserver() {
        getPolicyTnCData()
        isCancelable = false
        setUpBottomSheetBehaviour(dialog, false, 4, 90)
    }

    private fun initView() {
        if (!homeViewModel.acceptedPP) {
            homeViewModel.getPrivacyPolicyDescription()
        } else if (!homeViewModel.acceptedTnC) {
            homeViewModel.getTermsConditionDescription()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        setObserver()
        clickListeners()
//        setUpData()
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        dialog = BottomSheetDialog(requireContext(), theme)
        setUpBottomSheetBehaviour(
            dialog,
            true,
            5,
            95
        )
        return dialog
    }

    fun openBottomSheet(header: Boolean, height: Int, bottomSheetState: Int) {
        this.header = header
        bottomSheetHeaderModel = BottomsheetHeaderModel(
            "Vijay Chopra", "Placed on 21 Jan 2023",
            R.drawable.ic_default_profile, true,
            R.drawable.ic_close, header, height,
            bottomSheetState
        )
    }

    /*   private fun setUpData() {
           binding.privacyPolicyData = privacyPolicyModel
       }*/

    private fun clickListeners() {
        var header: String = ""
        binding.tvAcceptPrivacy.setOnClickListener {
            if (!homeViewModel.tncApiCalled && !homeViewModel.acceptedTnC && privacyPolicyModel?.header.equals(
                    "Privacy Policy",
                    true
                )
            ) {
                homeViewModel.resetPreviousAndShowThisBottomSheet(BottomSheetType.TERMS_AND_CONDITION)
                homeViewModel.tncApiCalled = true
            }
            header = if (privacyPolicyModel?.header.equals(
                    "Terms & Conditions",
                    true
                )
            ) "TERMS_AND_CONDITIONS" else if (privacyPolicyModel?.header.equals(
                    "Privacy policy",
                    true
                )
            ) "PRIVACY_AND_POLICY" else ""
            Log.d(
                "TAG",
                "clickListeners: header = $header and tnc ${homeViewModel.acceptedTnC}  header value = ${privacyPolicyModel?.header}"
            )
            /*if((!homeViewModel.acceptedTnC && privacyPolicyModel.header.equals("Terms & Conditions", true)) || (!homeViewModel.acceptedPP  && homeViewModel.acceptedTnC && privacyPolicyModel.header.equals("Privacy policy", true))){
                homeViewModel.acceptPpAndTnc(SharedPrefManager.getInstance().loggedInUserId, header)//privacyPolicyModel.header.toString()
                homeViewModel.showAcceptPpTncResult.observe(this, Observer {
                    dismiss()
                })
            }*/
            homeViewModel.acceptPpAndTnc(
                SharedPrefManager.getInstance().loggedInUserId,
                header
            )//privacyPolicyModel.header.toString()
            homeViewModel.showAcceptPpTncResult.observe(this, Observer {
                dismiss()
            })
        }
    }

    override fun getTheme() = R.style.BottomSheetDialog

    private fun getPolicyTnCData() {
        homeViewModel.privacyTncResponse.observe(this, EventObserver {
            if (!it.isNullOrEmpty()) {
                binding.privacyPolicyData = PrivacyPolicyBottomSheetModel(
                    privacyPolicyModel?.header,
                    it[0].header,
                    it[0].description
                )
            }
        })
    }
}