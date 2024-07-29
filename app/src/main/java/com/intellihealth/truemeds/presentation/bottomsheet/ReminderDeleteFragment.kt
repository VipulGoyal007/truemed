package com.intellihealth.truemeds.presentation.bottomsheet

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.intellihealth.salt.views.Toast
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.databinding.FragmentReminderDeleteBinding
import com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver

class ReminderDeleteFragment : BottomSheet(){


    private lateinit var binding: FragmentReminderDeleteBinding
    private lateinit var viewModel: ReminderViewModel
    private lateinit var dialog: BottomSheetDialog
    private var id:Long=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun setReminderViewModel(viewModel: ReminderViewModel, id:Long) {
        this.viewModel = viewModel
        this.id = id
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_reminder_delete, container, false)

        binding = DataBindingUtil.bind(view)!!


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.deleteReminder.setOnClickListener {
            viewModel.deleteSetReminder(id)
            dismiss()

        }

        binding.ivClose.setOnClickListener {
            dismiss()
        }

        binding.goBack.setOnClickListener {
            dismiss()
        }
        setEventListener()
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

    private fun setEventListener() {
        viewModel.eventMessage.observe(this, EventObserver {
            if (it != null) {
                if (it.equals(MESSAGES.DELETE_REMINDER_SUCCESSFULLY)) {
                    Toast().showCustomToastMessage(context, "Delete Reminder Successfully")
                    dismiss()
                } else if (it.equals(MESSAGES.DELETE_REMINDER_FAILED)) {
                    Toast().showCustomToastMessage(context, "Delete Reminder Failed")
                    dismiss()
                }
            }
        })
    }

    override fun getTheme() = R.style.BottomSheetDialog

}