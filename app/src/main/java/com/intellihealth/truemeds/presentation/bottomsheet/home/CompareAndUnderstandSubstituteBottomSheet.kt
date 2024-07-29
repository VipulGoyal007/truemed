package com.intellihealth.truemeds.presentation.bottomsheet.home

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.intellihealth.salt.models.ProductComparisonModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.BottomsheetCompareAndUnderstandBinding
import com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel

class CompareAndUnderstandSubstituteBottomSheet () : BottomSheetDialogFragment() {
    private lateinit var dialog: BottomSheetDialog
    private lateinit var binding: BottomsheetCompareAndUnderstandBinding
    private var productComparisonModel: ProductComparisonModel?=null

    constructor(productComparisonModel: ProductComparisonModel) : this(){
        this.productComparisonModel = productComparisonModel
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.bottomsheet_compare_and_understand, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        setListener()
        setUpData()
        return binding.root
    }

    private fun setListener() {
        binding.imageClose.setOnClickListener {
            if (dialog.isShowing) dialog.dismiss()
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        dialog = BottomSheetDialog(requireContext(), theme)
        return dialog
    }

    private fun setUpData() {
        binding.productComparisonData = productComparisonModel
    }

    override fun getTheme() = R.style.BottomSheetDialog
}