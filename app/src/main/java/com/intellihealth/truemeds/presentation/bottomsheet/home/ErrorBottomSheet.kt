package com.intellihealth.truemeds.presentation.bottomsheet.home

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.BottomsheetErrorBinding
import com.intellihealth.salt.models.BottomsheetHeaderModel
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.data.model.home.BottomSheetDefaultModel
import com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel

class ErrorBottomSheet() : BottomSheet() {
    private lateinit var dialog: BottomSheetDialog
    private lateinit var binding: BottomsheetErrorBinding
    private lateinit var bottomSheetHeaderModel: BottomsheetHeaderModel
    var model: BottomSheetDefaultModel?=null

    constructor(model: BottomSheetDefaultModel) : this(){
        this.model = model
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.bottomsheet_error, container, false)
        binding.title = model?.title
        binding.message = model?.message
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
        bottomSheetHeaderModel = BottomsheetHeaderModel(closeIcon = null, header = null, subHeader = null, icon = null, showIcon = false, showViewDragHandle = false, bottomSheetState = 6)
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