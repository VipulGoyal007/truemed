package com.intellihealth.truemeds.presentation.bottomsheet

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.text.isDigitsOnly
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.databinding.CancelOrderBottomsheetBinding
import com.intellihealth.truemeds.databinding.EditDeleteBottomsheetBinding
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.viewmodel.CancelOrderViewModel
import com.intellihealth.truemeds.presentation.viewmodel.ManageAddressViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.Event

class CancelOrderBottomSheet : BottomSheetDialogFragment(){
    private lateinit var binding: CancelOrderBottomsheetBinding
    private lateinit var viewModel: CancelOrderViewModel
    private lateinit var dialog: BottomSheetDialog
    private var totalSaveAmount = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun setCancelOrderViewMode(viewModel: CancelOrderViewModel) {
        this.viewModel = viewModel
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.cancel_order_bottomsheet, container, false)
        getIntentData()
        setData()
        setOnClickListener()
        viewModel.eventAppOrderCancelled("ThirdPage")
        return binding.root

    }

    @SuppressLint("SetTextI18n")
    private fun setData() {
        if(totalSaveAmount.isDigitsOnly()&&totalSaveAmount.toDouble().toInt() > 0){
            binding.tvSubTitle.visibility = View.VISIBLE
            binding.tvSubTitle.text =
                "${getString(R.string.by_cancelling_this_order_you_will_miss_saving)}$totalSaveAmount"
        } else {
            binding.tvSubTitle.visibility = View.GONE
        }
        binding.goBack.text = if(totalSaveAmount.isDigitsOnly()&&!totalSaveAmount.isNullOrEmpty() && totalSaveAmount.toDouble().toInt() > 0)"${getString(R.string.no_save)}$totalSaveAmount"
        else getString(R.string.no_don_t_cancel)

    }

    private fun getIntentData() {
        totalSaveAmount =
            requireActivity().intent.getStringExtra(BundleConstants.TOTAL_SAVING_AMOUNT).toString()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        dialog = BottomSheetDialog(requireContext(), theme)
//        setUpBottomSheetBehaviour(
//            dialog,
//            true,
//            6,
//            40
//        )
        return dialog

    }

    override fun getTheme() = R.style.BottomSheetDialog

    override fun onCancel(dialog: DialogInterface) {
        super.onCancel(dialog)
        //Toast.makeText(context, "Break Point Here", Toast.LENGTH_SHORT).show()
    }

    fun setOnClickListener(){
        binding.deleteBtn.setOnClickListener {
            viewModel.showMessage.postValue(Event(MESSAGES.CANCEL_ORDER_BOTTOM_SHEET_CLICK))
            dismiss()
        }

        binding.ivClose.setOnClickListener {
            dismiss()
        }

        binding.goBack.setOnClickListener {
            viewModel.showMessage.postValue(Event(MESSAGES.CANCEL_ORDER_BOTTOM_SHEET_CLICK_FOR_BACK))
            dismiss()
        }
    }

}