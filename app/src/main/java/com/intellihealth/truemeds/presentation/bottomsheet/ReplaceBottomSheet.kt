package com.intellihealth.truemeds.presentation.bottomsheet

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.gson.Gson
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.OrgSubCompareBottomSheetCallback
import com.intellihealth.truemeds.databinding.FragmentReplaceBottomSheetBinding
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.viewmodel.CartViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver

class ReplaceBottomSheet: BottomSheet() {
    private lateinit var binding: FragmentReplaceBottomSheetBinding
    private lateinit var dialog: BottomSheetDialog
    private lateinit var viewModel: CartViewModel
    private lateinit var orgSubCompareBottomSheetCallback: OrgSubCompareBottomSheetCallback
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    
    override fun onCancel(dialog: DialogInterface) {
        super.onCancel(dialog)
        if (::orgSubCompareBottomSheetCallback.isInitialized){
        orgSubCompareBottomSheetCallback.closeClick()
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_replace_bottom_sheet, container, false)
        
        viewModel = ViewModelProvider(requireActivity())[CartViewModel::class.java]
        
        binding = DataBindingUtil.bind(view)!!
        
        return binding.root
    }
    
    
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel
        binding.lifecycleOwner = requireActivity()
        dismissBottomSheet()
        initArgs()
        eventListeners()
        
    }
    
    private fun initArgs() {
        
        val bundle = arguments?:
        return
        
        val title = bundle.getString(BundleConstants.PRODUCT_SUBS_TITLE)
        binding.title = title
        val model = Gson().fromJson(
            bundle.getString(BundleConstants.PRODUCT_SUBS_DETAIL),
            ProductInfoModel::class.java
        )
        if(!bundle.getString(BundleConstants.SUBS_SAVING_PERCENTAGE).isNullOrEmpty()){
            val subsSavingPercentage =bundle.getString(BundleConstants.SUBS_SAVING_PERCENTAGE)
            if(!subsSavingPercentage.isNullOrEmpty()){
                model.product.subsSavingPercentage = subsSavingPercentage
            }
        }
        model?.let {
            viewModel.getSubsBottomSheet(it)
//            viewModel.selectedMedicineForReplace.postValue(it)
        }
    }
    
    private fun dismissBottomSheet() {
        binding.ivClose.setOnClickListener {
            dismiss()
            if (::orgSubCompareBottomSheetCallback.isInitialized)

            orgSubCompareBottomSheetCallback.closeClick()
        }
        
        
    }
    
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        dialog = BottomSheetDialog(requireContext(), theme)
        setUpBottomSheetBehaviour(
            dialog,
            true,
            4,
            45
        )
        return dialog
    }
    private fun eventListeners() {

        viewModel.eventLaunchPDPageForSub.observe(requireActivity(), EventObserver {
            if (it == null) return@EventObserver
            if (::orgSubCompareBottomSheetCallback.isInitialized)
                orgSubCompareBottomSheetCallback.openPDPageCart(it.suggestion?.productCode, true, productInfoModel = it)
        })
    }

    override fun getTheme() = R.style.BottomSheetDialog
    
    fun newInstance(): ReplaceBottomSheet {
        return ReplaceBottomSheet()
    }
    
    fun setCallback(orgSubCompareBottomSheetCallback: OrgSubCompareBottomSheetCallback) {
        this.orgSubCompareBottomSheetCallback = orgSubCompareBottomSheetCallback
    }

}