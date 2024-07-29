package com.intellihealth.truemeds.presentation.bottomsheet.logout

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.FragmentLogoutBottomSheetBinding
import com.intellihealth.salt.models.BottomsheetHeaderModel
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.domain.enums.LoginFromScreen
import com.intellihealth.truemeds.presentation.activity.LoginActivity
import com.intellihealth.truemeds.presentation.activity.SplashScreen
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.viewmodel.AccountTabViewModel

class LogoutBottomSheet : BottomSheet() {
    private lateinit var binding: FragmentLogoutBottomSheetBinding
    private lateinit var bottomSheetHeaderModel: BottomsheetHeaderModel
    private lateinit var dialog: BottomSheetDialog
    private var header: Boolean = true
    lateinit var viewmodel: AccountTabViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_logout_bottom_sheet,
                container,
                false
            )
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setEventListeners()

    }

    private fun setEventListeners() {
        binding.imClose.setOnClickListener {
            dismiss()
        }
        binding.btnDoNotLogout.setOnClickListener {
            dismiss()
        }

        binding.btnLogout.setOnClickListener {
            viewmodel.logoutEvent()
            SharedPrefManager.getInstance().clearPrefs()
            viewmodel.clearCustomerData()
            startActivity(Intent(context, SplashScreen::class.java))
            BundleConstants.INITIATED_LOGIN_FROM_SCREEN = LoginFromScreen.HOME
            dismiss()
            requireActivity().finish()
        }
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

    fun openBottomSheet(header: Boolean, height: Int, bottomsheetState: Int) {
        this.header = header
        bottomSheetHeaderModel = BottomsheetHeaderModel(
            "", "",
            R.drawable.ic_call, false,
            R.drawable.ic_call, header, height,
            bottomsheetState
        )
    }

    fun setViewModel(viewModel : AccountTabViewModel){
        this.viewmodel = viewModel
    }
    override fun getTheme() = R.style.BottomSheetDialog
}