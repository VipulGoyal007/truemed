package com.intellihealth.truemeds.presentation.bottomsheet.login

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.FragmentLoginMobileNumberBinding
import com.intellihealth.salt.models.BottomsheetHeaderModel
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.presentation.utils.viewBinding

class LoginMobileNumberBottomSheet: BottomSheet() {
    private lateinit var binding: FragmentLoginMobileNumberBinding
    private lateinit var bottomSheetHeaderModel: BottomsheetHeaderModel
    private lateinit var dialog: BottomSheetDialog
    private var header: Boolean=true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_login_mobile_number, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //setUpData()
        //setEventListeners()

    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
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
    fun openBottomSheet(header: Boolean, height: Int, bottomsheetState: Int,) {
        this.header=header
        bottomSheetHeaderModel = BottomsheetHeaderModel(
            "", "",
            R.drawable.ic_call, false,
            R.drawable.ic_call, header, height,
            bottomsheetState
        )
    }

}