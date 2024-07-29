package com.intellihealth.truemeds.presentation.bottomsheet

import android.app.Dialog
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.gson.Gson
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.BottomsheetViewBillDetailsBinding
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel
import com.intellihealth.salt.models.BottomsheetHeaderModel
import com.intellihealth.salt.models.BillDetailsModel
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class ViewBillDetailsBottomSheet : BottomSheet() {

    lateinit var viewModel: PaymentOptionsViewModel
    private lateinit var binding: BottomsheetViewBillDetailsBinding
    private lateinit var model: BillDetailsModel
    private lateinit var dialog: BottomSheetDialog

    fun newInstance(): ViewBillDetailsBottomSheet {
        return ViewBillDetailsBottomSheet()
    }

    /**
     * Set the style for bottomsheet
     * **/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[PaymentOptionsViewModel::class.java]
    }

    /**
     * Inflate the bottomsheet view
     * **/
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.bottomsheet_view_bill_details, container, false)
        binding = DataBindingUtil.bind(view)!!
        return binding.root
    }

    /**
     * 1) Bind the viewmodel to the view inside initView()
     * 2) Setup event listeners
     * **/
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 1) Bind the viewmodel to the view inside initView()
        initView()
        // 3) Setup event listeners
        setEventListeners()
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        dialog = BottomSheetDialog(requireContext(), theme)

        setUpBottomSheetBehaviour(
            dialog,
            true,
            6,
            55
        )
        return dialog
    }

    private fun initView(){



        binding.let {
            it.viewModel = viewModel
            it.lifecycleOwner = activity
        }

        val bundle = arguments?:
            return

        model = Gson().fromJson(bundle.getString(BundleConstants.BUNDLE_TM_BILL_DETAILS_MODEL),BillDetailsModel::class.java)
        binding.cardData = model

    }

    /**
     * observe eventPaymentChange whenever change mode button is clicked,
     * observe eventPaymentChangeCloseBS whenever dont remove button is clicked and call dismiss to close the bottomsheet
     * **/
    private fun setEventListeners(){
        binding.imgClose.setOnClickListener { closeBottomSheet() }
    }

    override fun getTheme(): Int {
        return R.style.BottomSheetDialog
    }

    private fun closeBottomSheet() {
        dialog.dismiss()
    }
}