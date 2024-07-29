package com.intellihealth.truemeds.presentation.bottomsheet.cart

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.FragmentBottomSheetBinding
import com.intellihealth.truemeds.databinding.FragmentRemoveProductBottomSheetBinding
import com.intellihealth.truemeds.presentation.viewmodel.CartViewModel
import com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.Event

class RemoveProductBottomSheet : BottomSheet() {
    private lateinit var binding: FragmentRemoveProductBottomSheetBinding
    private lateinit var viewModel: CartViewModel
    private lateinit var dialog: BottomSheetDialog

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_remove_product_bottom_sheet, container, false)
        binding = DataBindingUtil.bind(view)!!
        return binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.deleteProduct.setOnClickListener {
            if(::viewModel.isInitialized) {
                viewModel.isDelete.value = Event(true)
            }
            dismiss()
        }
        binding.ivClose.setOnClickListener {
            if(::viewModel.isInitialized) {
                viewModel.isDelete.value = Event(false)
            }
        }

        binding.notDeleteProduct.setOnClickListener {
            if(::viewModel.isInitialized) {
                viewModel.isDelete.value = Event(false)
            }
        }
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

    fun setBottomSheet(viewModel: CartViewModel) {
        this.viewModel = viewModel
    }

    override fun getTheme() = R.style.BottomSheetDialog
}