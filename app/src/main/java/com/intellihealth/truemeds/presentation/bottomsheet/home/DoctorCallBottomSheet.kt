package com.intellihealth.truemeds.presentation.bottomsheet.home

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.home.DoctorCallBottomSheetModel
import com.intellihealth.truemeds.databinding.BottomsheetDoctorCallBinding
import com.intellihealth.salt.models.BottomsheetHeaderModel
import com.intellihealth.salt.utils.loadImageUrl
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel

class DoctorCallBottomSheet(): BottomSheet() {
    private lateinit var binding: BottomsheetDoctorCallBinding
    private lateinit var bottomSheetHeaderModel: BottomsheetHeaderModel
    private lateinit var dialog: BottomSheetDialog
    private var header: Boolean=true
    private var doctorCallBottomSheetModel: DoctorCallBottomSheetModel?=null

    constructor(doctorCallBottomSheetModel: DoctorCallBottomSheetModel) : this(){
        this.doctorCallBottomSheetModel = doctorCallBottomSheetModel
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.bottomsheet_doctor_call, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        clickListeners()
        setUpData()
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        dialog = BottomSheetDialog(requireContext(), theme)
        bottomSheetHeaderModel = BottomsheetHeaderModel(closeIcon = null, header = null, subHeader = null, icon = null, showIcon = false, showViewDragHandle = false, height = 50, bottomSheetState = 3)
        setUpBottomSheetBehaviour(
            dialog,
            true,
            bottomSheetHeaderModel.bottomSheetState,
            bottomSheetHeaderModel.height,
            bottomSheetHeaderModel
        )
        return dialog
    }

    private fun setUpData() {

        binding.doctorCallData = doctorCallBottomSheetModel
        doctorCallBottomSheetModel?.doctorImage?.let {
            binding.imageDoctorCall.loadImageUrl(it)
        }
    }

    private fun clickListeners(){
        binding.imageClose.setOnClickListener {
            dismiss()
        }
    }
    override fun getTheme() = R.style.BottomSheetDialog

}