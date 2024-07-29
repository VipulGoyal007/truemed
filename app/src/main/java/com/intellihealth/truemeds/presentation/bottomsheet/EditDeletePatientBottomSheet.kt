package com.intellihealth.truemeds.presentation.bottomsheet

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.MessageConstant
import com.intellihealth.truemeds.databinding.EditDeleteBottomsheetBinding
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.viewmodel.ManageAddressViewModel
import com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.Event

class EditDeletePatientBottomSheet  : BottomSheetDialogFragment(){
    private lateinit var binding: EditDeleteBottomsheetBinding
    private lateinit var viewModel: ManagePatientViewModel
    private lateinit var dialog: BottomSheetDialog
    private var isEditClick = false
    private var isDeleteClick = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun setManagePatientViewModel(viewModel:ManagePatientViewModel, isEditClick:Boolean, isDeleteClick:Boolean) {
        this.viewModel = viewModel
        this.isEditClick = isEditClick
        this.isDeleteClick = isDeleteClick
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.edit_delete_bottomsheet, container, false)
        setData()
        setOnClickListener()
        return binding.root

    }

    private fun setData() {
        if(!isEditClick && isDeleteClick){
            binding.tvTitle.text = getString(R.string.delete_address)
            binding.tvSubTitle.text = getString(R.string.selected_address_will_be_deleted)
            binding.goBack.text = getString(R.string.don_t_delete)
            binding.deleteReminder.text = getString(R.string.delete)
        } else {
            binding.tvTitle.text = getString(R.string.discard_unsaved_details)
            binding.tvSubTitle.text = getString(R.string.going_back_will_discard_all_changes)
            binding.goBack.text = getString(R.string.continue_editing)
            binding.deleteReminder.text = getString(R.string.discard)
        }
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
//            35
//        )
       /* val mDialog = super.onCreateDialog(savedInstanceState)
        mDialog.setOnKeyListener { dialog: DialogInterface?, keyCode: Int, event: KeyEvent ->
            if (keyCode == KeyEvent.KEYCODE_BACK && event.action == KeyEvent.ACTION_UP) {

                // <-- Your onBackPressed logic here -->
                requireActivity().onBackPressed()
                return@setOnKeyListener true
            }
            false
        }*/
        return dialog

    }

    override fun getTheme() = R.style.BottomSheetDialog

    override fun onCancel(dialog: DialogInterface) {
        super.onCancel(dialog)
    }

    fun setOnClickListener(){
        binding.deleteReminder.setOnClickListener {
            if(isDeleteClick) {

                viewModel.deletePatientApiCalling()
              //  viewModel.deleteAddress(viewModel.addressItemList.value?.addressId.toString(),    SharedPrefManager.getInstance().loggedInUserId.toLong())
            } else{
                viewModel.showMessage.postValue(Event(MessageConstant(MESSAGES.DISCARD_EDIT_PATIENT_CHANGES)))
            }
            dismiss()
        }

        binding.ivClose.setOnClickListener {
            dismiss()
        }

        binding.goBack.setOnClickListener {
            dismiss()
        }
    }

}