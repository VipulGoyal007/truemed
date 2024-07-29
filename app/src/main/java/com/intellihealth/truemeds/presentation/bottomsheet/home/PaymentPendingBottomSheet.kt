package com.intellihealth.truemeds.presentation.bottomsheet.home

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.BottomsheetPaymentPendingBinding
import com.intellihealth.salt.models.BottomsheetHeaderModel
import com.intellihealth.salt.utils.loadImageUrl
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.data.model.home.BottomSheetDefaultModel
import com.intellihealth.truemeds.presentation.callbacks.PaymentPendingCallback
import com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel

class PaymentPendingBottomSheet() : BottomSheet() {
    private lateinit var binding: BottomsheetPaymentPendingBinding
    private lateinit var bottomSheetHeaderModel: BottomsheetHeaderModel
    private lateinit var dialog: BottomSheetDialog
    private var header: Boolean = true

    var callback: PaymentPendingCallback?=null
    var model: BottomSheetDefaultModel?=null

    constructor( callback: PaymentPendingCallback,
                 model: BottomSheetDefaultModel) : this(){
        this.callback = callback
        this.model = model
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    private fun setListener() {
        binding.imageClose.setOnClickListener {
            callback?.onClosedActionClicked()
            if (dialog.isShowing) dialog.dismiss()
        }
        binding.tvPay.setOnClickListener {
            callback?.onPositiveActionClicked(model)
            if (dialog.isShowing) dialog.dismiss()
        }
        binding.tvChange.setOnClickListener {
            callback?.onChangedActionClicked(model)
            if (dialog.isShowing) dialog.dismiss()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(
                inflater,
                R.layout.bottomsheet_payment_pending,
                container,
                false
            )
        binding.callback = callback
        binding.sellingPrice = model?.sellingPrice
        binding.lifecycleOwner = viewLifecycleOwner
        setListener()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //clickListeners()
        setUpData()
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        bottomSheetHeaderModel = BottomsheetHeaderModel(
            closeIcon = null,
            header = null,
            subHeader = null,
            icon = null,
            showIcon = false,
            showViewDragHandle = false,
            height = 30,
            bottomSheetState = 6
        )
        dialog = BottomSheetDialog(requireContext(), theme)
        setUpBottomSheetBehaviour(
            dialog,
            true,
            bottomSheetHeaderModel.bottomSheetState,
            bottomSheetHeaderModel.height,
            bottomSheetHeaderModel
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

    private fun setUpData() {
        model?.paymentType?.let {
            binding.tvUPIPayment.text = it
        }
        model?.paymentTypeLogoUrl?.let {
            binding.ivUpiLogo.loadImageUrl(it)
        }
        model?.payableAmount?.let {
            binding.tvPay.setTitle(it)
        }
    }

    private fun clickListeners() {
        binding.imageClose.setOnClickListener {
            dismiss()
        }
    }

    override fun getTheme() = R.style.BottomSheetDialog
}