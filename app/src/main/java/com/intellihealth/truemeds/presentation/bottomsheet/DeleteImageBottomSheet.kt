package com.intellihealth.truemeds.presentation.bottomsheet

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.databinding.DeleteImageBottomSheetBinding
import com.intellihealth.truemeds.presentation.viewmodel.CartViewModel
import com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.Event

class DeleteImageBottomSheet  : BottomSheet() {
    private lateinit var binding: DeleteImageBottomSheetBinding
    private lateinit var prescriptionViewModel: PrescriptionViewModel
    private lateinit var dialog: BottomSheetDialog

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.delete_image_bottom_sheet, container, false)
        binding = DataBindingUtil.bind(view)!!
        setListener()
        return binding.root
    }

    private fun setListener() {
        binding.btnDeletePrescription.setOnClickListener {
            prescriptionViewModel.showMessageForPrescription.postValue(Event(MESSAGES.DELETE_PRESCRIPTION_CLICK))
            dismiss()
        }

        binding.ivClose.setOnClickListener {
            dismiss()
        }

        binding.btnCancel.setOnClickListener {
            dismiss()
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

    fun setViewModel(viewModel: PrescriptionViewModel) {
        this.prescriptionViewModel = viewModel
    }

    override fun getTheme() = R.style.BottomSheetDialog
}