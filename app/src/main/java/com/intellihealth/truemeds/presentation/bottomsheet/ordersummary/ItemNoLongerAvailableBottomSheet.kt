package com.intellihealth.truemeds.presentation.bottomsheet.ordersummary

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.intellihealth.salt.models.BottomsheetHeaderModel
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.ProductBottomSheetCallback
import com.intellihealth.truemeds.databinding.BottomsheetItemNoLongerAvailableBinding
import com.intellihealth.truemeds.presentation.viewmodel.CartViewModel
import com.intellihealth.truemeds.presentation.viewmodel.OrderSummaryViewModel


class ItemNoLongerAvailableBottomSheet() : BottomSheet() {
    private lateinit var binding: BottomsheetItemNoLongerAvailableBinding
    private lateinit var bottomSheetHeaderModel: BottomsheetHeaderModel
    private lateinit var dialog: BottomSheetDialog
    private var header: Boolean = true
    private lateinit var viewModel: CartViewModel
    private lateinit var pdBottomSheetCallback: ProductBottomSheetCallback

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.bottomsheet_item_no_longer_available, container, false)
        viewModel = ViewModelProvider(requireActivity())[CartViewModel::class.java]
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        setEventListeners()
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
         bottomSheetHeaderModel = BottomsheetHeaderModel(
            getString(R.string.items_are_no_longer_available), null,
          null, true,
            com.intellihealth.salt.R.drawable.ic_search_close, header, 75,
            6
        )

        dialog = BottomSheetDialog(requireContext(), theme)
        setUpBottomSheetBehaviour(
            bottomSheetDialog = dialog,
            isDraggable = true,
            bottomSheetState = bottomSheetHeaderModel.bottomSheetState,
            height = bottomSheetHeaderModel.height
        )
        return dialog
    }

    private fun setEventListeners() {

        binding.ivClose.setOnClickListener {
            if (dialog.isShowing) {
                dialog.dismiss()
                if (::pdBottomSheetCallback.isInitialized) {
                    pdBottomSheetCallback.closeClick()
                }
            }
        }


    }

    private fun initView() {


    }
    
    
    override fun onDismiss(dialog: DialogInterface) {
        super.onDismiss(dialog)
        if (::pdBottomSheetCallback.isInitialized) {
            pdBottomSheetCallback.closeClick()}
    }
    
    override fun onCancel(dialog: DialogInterface) {
        super.onCancel(dialog)
        if (::pdBottomSheetCallback.isInitialized) {
            pdBottomSheetCallback.closeClick()
        }
    }

    override fun getTheme() = R.style.BottomSheetDialog
    
    fun setCallback(pdBottomSheetCallback: ProductBottomSheetCallback) {
        this.pdBottomSheetCallback = pdBottomSheetCallback
    }
}