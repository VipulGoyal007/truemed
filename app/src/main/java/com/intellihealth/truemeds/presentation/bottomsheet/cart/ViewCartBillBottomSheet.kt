package com.intellihealth.truemeds.presentation.bottomsheet.cart

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.intellihealth.salt.models.BottomsheetHeaderModel
import com.intellihealth.salt.models.BillDetailsModel
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.BottomsheetViewBillBinding
import com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel

class ViewCartBillBottomSheet() : BottomSheet() {
    private lateinit var dialog: BottomSheetDialog
    private lateinit var binding: BottomsheetViewBillBinding
    private lateinit var bottomSheetHeaderModel: BottomsheetHeaderModel
    var model: BillDetailsModel?= null

    constructor(model: BillDetailsModel) : this(){
        this.model = model
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.bottomsheet_view_bill, container, false)
        binding.cardData = model
        binding.lifecycleOwner = viewLifecycleOwner
        setListener()
        return binding.root
    }

    private fun setListener() {
        binding.ivClose.setOnClickListener {
            if (dialog.isShowing) dialog.dismiss()
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        bottomSheetHeaderModel = BottomsheetHeaderModel(closeIcon = null, header = null, subHeader = null, icon = null, showIcon = false, showViewDragHandle = true, height = 90, bottomSheetState = 3)
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

    override fun getTheme() = R.style.BottomSheetDialog
}