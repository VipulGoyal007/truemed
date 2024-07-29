package com.intellihealth.truemeds.presentation.bottomsheet

import android.app.Dialog
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.BottomSheetCloseCallback
import com.intellihealth.truemeds.databinding.FragmentReminderAlertBinding
import com.intellihealth.truemeds.presentation.utils.DateUtils
import com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel


class ReminderAlertFragment : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentReminderAlertBinding
    private lateinit var viewModel: ReminderViewModel
    private lateinit var dialog: BottomSheetDialog
    private var reminderEditFragment = ReminderEditFragment()
    private var bottomSheetCloseCallback: BottomSheetCloseCallback?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    fun setReminderViewModel(viewModel: ReminderViewModel,bottomSheetCloseCallback: BottomSheetCloseCallback?) {
        this.viewModel = viewModel
        this.bottomSheetCloseCallback = bottomSheetCloseCallback
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_reminder_alert, container, false)

        binding = DataBindingUtil.bind(view)!!
        if(::viewModel.isInitialized) {
            binding.tvUpcomingReminder.text =
                "Next reminder date: ${DateUtils.ddMMyyyyToddMMMMyyyy(viewModel.editReminderDateValue)}"
            viewModel.editReminderNameValue.postValue(viewModel.alertReminderNameValue.value)
            binding.reminderViewModel = viewModel
        }
        openEditBottomSheetListener()
        return binding.root
    }

    /*@RequiresApi(Build.VERSION_CODES.O)
    private fun changeDateFormat(date: String?): Any? {
        val inputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
        val inputDate = LocalDate.parse(date, inputFormatter)

        // Format the date to "MMMM dd, yyyy" format
        val outputFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy")
        return inputDate.format(outputFormatter)
    }*/

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.lifecycleOwner = this

//        viewModel.setOrderProcess()

//        viewModel.orderProcess.observe(viewLifecycleOwner) {
//            binding.tmOrderStatusDetailCards1.setOrderStatusDetailCard(it,object :
//                DetailedTimelineCallback {
//                override fun getTimelineData(action: String) {
//                }
//
//            })
//        }

        Glide.with(binding.tmImageStatus.context).asGif()
            .load(R.drawable.pharmacist_doctor_call)
            .into(binding.tmImageStatus)

        binding.imClose.setOnClickListener {
            bottomSheetCloseCallback?.closed()
            dismiss()
        }

    }

    private fun openEditBottomSheetListener() {
        binding.imEdit.setOnClickListener {
            dismiss()
            viewModel.previousReminderFrequency = viewModel.editReminderFrequency.value!!
            viewModel.previousReminderDateValue = viewModel.editReminderDateValue
            reminderEditFragment.setReminderViewModel(viewModel)
            reminderEditFragment.isCancelable = true
            if (!reminderEditFragment.isVisible) {
                reminderEditFragment.show(
                    requireActivity().supportFragmentManager, "EditReminderBottomSheet"
                )
                viewModel.sendReminderEditClickedEvent()
            }
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        dialog = BottomSheetDialog(requireContext(), theme)
        dialog.behavior.state = BottomSheetBehavior.STATE_EXPANDED
//        setUpBottomSheetBehaviour(
//            dialog,
//            true,
//            4,
//            45
//        )
        return dialog
    }

    override fun getTheme() = R.style.BottomSheetDialog
}