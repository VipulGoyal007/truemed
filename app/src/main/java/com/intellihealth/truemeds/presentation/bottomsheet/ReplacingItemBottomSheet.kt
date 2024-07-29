package com.intellihealth.truemeds.presentation.bottomsheet

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.intellihealth.salt.models.BottomsheetHeaderModel
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.orderflow.ReplaceAllBottomSheetModel
import com.intellihealth.truemeds.databinding.BottomsheetReplacingBinding
import com.intellihealth.truemeds.presentation.viewmodel.CartViewModel

class ReplacingItemBottomSheet : BottomSheet() {
    private lateinit var dialog: BottomSheetDialog
    private lateinit var binding: BottomsheetReplacingBinding
    private lateinit var bottomSheetHeaderModel: BottomsheetHeaderModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.bottomsheet_replacing, container, false)

        binding.lifecycleOwner = viewLifecycleOwner

        Glide.with(this).load(R.drawable.switch_medicine).into(binding.ivLoader)

        return binding.root
    }


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        bottomSheetHeaderModel = BottomsheetHeaderModel(closeIcon = null, header = null, subHeader = null, icon = null, showIcon = false, showViewDragHandle = true, height = 49, bottomSheetState = 3)
        dialog = BottomSheetDialog(requireContext(), theme)
        setUpBottomSheetBehaviour(
            dialog,
            false,
            bottomSheetHeaderModel.bottomSheetState,
            bottomSheetHeaderModel.height,
            bottomSheetHeaderModel
        )
        return dialog
    }

    override fun getTheme() = R.style.BottomSheetDialog
}