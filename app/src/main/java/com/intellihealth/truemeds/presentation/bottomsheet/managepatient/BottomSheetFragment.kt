package com.intellihealth.truemeds.presentation.bottomsheet.managepatient

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
import com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.Event

class BottomSheetFragment : BottomSheet() {

    private lateinit var binding: FragmentBottomSheetBinding
    private lateinit var viewModel: ManagePatientViewModel
    private lateinit var dialog: BottomSheetDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //var binding = inflater.inflate(R.layout.fragment_bottom_sheet, container, false)
        val view = inflater.inflate(R.layout.fragment_bottom_sheet, container, false)
        binding = DataBindingUtil.bind(view)!!
        return binding.root
    }
    fun setBottomSheet(viewModel: ManagePatientViewModel) {
        this.viewModel = viewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.deletePatient.setOnClickListener {
            viewModel.isDelete.value = Event(true)
        }

        binding.ivClose.setOnClickListener {
            viewModel.isDelete.value = Event(false)
        }

        binding.notDelete.setOnClickListener {
            viewModel.isDelete.value = Event(false)
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

    override fun getTheme() = R.style.BottomSheetDialog
}