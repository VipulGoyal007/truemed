package com.intellihealth.truemeds.presentation.bottomsheet.filter

import android.app.Dialog
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.BottomsheetFilterBinding
import com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel
import com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel


class FilterBottomSheet() : BottomSheetDialogFragment() {
    private lateinit var binding: BottomsheetFilterBinding
    private lateinit var dialog: BottomSheetDialog
    private var header: Boolean = true
    private lateinit var viewModel: MyOrderViewModel
    private var previousView: com.intellihealth.salt.views.TextView ?=null
    private var type = ""
    private var childCategoryType: String=""

    constructor(childCategoryType: String) : this(){
        this.childCategoryType = childCategoryType
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.bottomsheet_filter, container, false)
        viewModel = ViewModelProvider(requireActivity())[MyOrderViewModel::class.java]
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        type = if (childCategoryType == "All") "category" else if (viewModel.subCategoryBottomSheetListTemp.value?.isNotEmpty() == true) "subcategory" else "brands"
        initView()
        setEventListeners()
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val metrics = DisplayMetrics()
        requireActivity().windowManager?.defaultDisplay?.getMetrics(metrics)
        dialog = BottomSheetDialog(requireContext(), theme)
        (dialog as BottomSheetDialog).behavior.state= BottomSheetBehavior.STATE_EXPANDED
        (dialog as BottomSheetDialog).behavior.isDraggable= false
        dialog.behavior.peekHeight = metrics.heightPixels
        dialog.behavior.isFitToContents = false
        return dialog
    }
    private fun setEventListeners() {

        binding.ivClose.setOnClickListener {
            if (dialog.isShowing) {
                if (viewModel.appliedFilterCount.value == 0) {
                    /** On close filter click, selected filter will be cleared here only if filter is not applied */
                    viewModel.categoryBottomSheetListTemp.value?.map { it?.selectedCategory = false }
                    viewModel.subCategoryBottomSheetListTemp.value?.map { it?.isSelected = false }
                    viewModel.brandBottomSheetListTemp.value?.map { it?.isSelected = 0 }
                }
                dialog.dismiss()
            }
        }

        binding.tvCategory.setOnClickListener {
            type="category"
            initView()
        }
        binding.tvSubCategory.setOnClickListener {

            type="subcategory"
            initView()
        }
        binding.tvBrands.setOnClickListener {
            type="brands"
            initView()

        }


    }

    private fun initView() {
        previousView?.setBackgroundColor(resources.getColor(R.color.white))
        when {
            type.equals("category") -> {
                binding.tvCategory.setBackgroundColor(resources.getColor(R.color.tm_core_color_light_blue_200))
                previousView= binding.tvCategory
                binding.rvCategoryList.visibility=View.VISIBLE
                binding.rvSubCategoryList.visibility=View.GONE
                binding.rvBrandsList.visibility=View.GONE
            }
            type.equals("subcategory") -> {
                binding.tvSubCategory.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.tm_core_color_light_blue_200))
                previousView= binding.tvSubCategory
                binding.rvCategoryList.visibility=View.GONE
                binding.rvSubCategoryList.visibility=View.VISIBLE
                binding.rvBrandsList.visibility=View.GONE
            }
            type.equals("brands") -> {
                binding.tvBrands.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.tm_core_color_light_blue_200))
                previousView= binding.tvBrands
                binding.rvCategoryList.visibility=View.GONE
                binding.rvSubCategoryList.visibility=View.GONE
                binding.rvBrandsList.visibility=View.VISIBLE
            }
        }

    }

    override fun getTheme() = R.style.BottomSheetDialog

}