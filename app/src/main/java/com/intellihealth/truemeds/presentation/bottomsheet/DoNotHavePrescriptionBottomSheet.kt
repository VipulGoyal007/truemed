package com.intellihealth.truemeds.presentation.bottomsheet

import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.home.RatingDetailsResponseModel
import com.intellihealth.truemeds.databinding.DoNotHaveBottomsheetBinding
import com.intellihealth.truemeds.domain.navigation.navigateToCartActivity
import com.intellihealth.truemeds.domain.navigation.navigateToOrderStatusActivity
import com.intellihealth.truemeds.domain.navigation.navigateToOrderSummaryActivity
import com.intellihealth.truemeds.presentation.activity.CartActivity
import com.intellihealth.truemeds.presentation.activity.OrderSummaryActivity
import com.intellihealth.truemeds.presentation.callbacks.FeedbackCallback
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel

class DoNotHavePrescriptionBottomSheet() : BottomSheet() {
    private lateinit var binding: DoNotHaveBottomsheetBinding
    private lateinit var viewModel: PrescriptionViewModel
    private lateinit var dialog: BottomSheetDialog
    var fromPage: String=""

    constructor(fromPage: String) : this(){
        this.fromPage = fromPage
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    fun setViewModel(prescriptionViewModel: PrescriptionViewModel) {
        this.viewModel = prescriptionViewModel
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.do_not_have_bottomsheet, container, false)
        initUIButton()
        setOnClickListener()
        return binding.root

    }
    
    private fun initUIButton() {
        if(fromPage != null) {
            if (fromPage == "summary") {
                binding.goBack.text = this.getString(R.string.go_back_to_summary)
            } else {
                binding.goBack.text = this.getString(R.string.go_back_to_cart)
            }
        } else {
            binding.goBack.text = this.getString(R.string.go_back_to_cart)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        dialog = BottomSheetDialog(requireContext(), theme)
        setUpBottomSheetBehaviour(
            dialog,
            true,
            6,
            40
        )
        return dialog

    }

    override fun getTheme() = R.style.BottomSheetDialog

    override fun onCancel(dialog: DialogInterface) {
        super.onCancel(dialog)
    }

    fun setOnClickListener(){
        binding.goBack.setOnClickListener {
            dismiss()
            if (fromPage == "summary") {
//                launchOrderSummary()
            } else if (fromPage == "cart") {
//                launchCartPage()
            } else {
                if (viewModel.cartItemCount.value!! != 0 || !viewModel.prescriptions.value.isNullOrEmpty()) {
                    if (viewModel.cartItemCount.value!! > 0 && !SharedPrefManager.getInstance().isReOrder) {
                        launchCartPage()
                    } else {
                        launchOrderSummary()
                    }
                }
            }
        }

        binding.imageClose.setOnClickListener {
            dismiss()
        }


    }
    
    private fun launchOrderSummary() {
        navigateToOrderSummaryActivity(
            flags = listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
        )
        requireActivity().finish()
    }
    
    private fun launchCartPage() {
        navigateToCartActivity(
            flags = listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
        )
        requireActivity().finish()
    }
}