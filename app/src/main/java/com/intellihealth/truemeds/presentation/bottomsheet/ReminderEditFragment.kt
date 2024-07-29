package com.intellihealth.truemeds.presentation.bottomsheet

import android.app.DatePickerDialog
import android.app.DatePickerDialog.OnDateSetListener
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.intellihealth.salt.views.Toast
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.BottomSheetCloseCallback
import com.intellihealth.truemeds.data.model.mixpanel.MxReminderSuccessfullySet
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.databinding.FragmentEditReminderBinding
import com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class ReminderEditFragment : BottomSheetDialogFragment() {


    private lateinit var binding: FragmentEditReminderBinding
    private lateinit var viewModel: ReminderViewModel
    private lateinit var dialog: BottomSheetDialog
    private val selectedCalendar: Calendar = Calendar.getInstance()
    private val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.US)
    private var formattedDate: String = ""
    private var bottomSheetCloseCallback: BottomSheetCloseCallback?=null
    private var reminderDeleteFragment = ReminderDeleteFragment()
    
    /*private var reminderDate:String?=""
    private var patientId:Long?=0*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun setReminderViewModel(viewModel: ReminderViewModel) {
        this.viewModel = viewModel
    }
    fun setReminderViewModelForOrderStatus(viewModel: ReminderViewModel,
                                           bottomSheetCloseCallback: BottomSheetCloseCallback,
                                           mxReminderSuccessfullySet: MxReminderSuccessfullySet) {
        this.viewModel = viewModel
        /*this.reminderDate=reminderDate
        this.patientId=patientId*/
        this.bottomSheetCloseCallback = bottomSheetCloseCallback
        viewModel.mxReminderSuccessfullySet = mxReminderSuccessfullySet

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_edit_reminder, container, false)

        binding = DataBindingUtil.bind(view)!!

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.lifecycleOwner = this

        binding.reminderViewModel = viewModel
        setEventListener()
//        viewModel.setChipsData()
        formattedDate = sdf.format(selectedCalendar.getTime())
        binding.inputLabel.setText(changeDateFormat(viewModel.editReminderDateValue))

        setChipTitle()
        binding.deleteReminder.setOnClickListener {
            reminderDeleteFragment.isCancelable = true
            if (!reminderDeleteFragment.isVisible)
                reminderDeleteFragment.setReminderViewModel(viewModel, (viewModel.editReminderId.value!!.toLong()))
            reminderDeleteFragment.show(
                requireActivity().supportFragmentManager, "DeleteReminderBottomSheet"
            )

        }


        binding.goBack.setOnClickListener {

            viewModel.editReminderDateValue = changeDateFormatInApiFormat(binding.inputLabel.text.toString())!!
//            Log.d("setvaluedata", "${changeDateFormatInApiFormat(viewModel.editReminderDateValue)} ${viewModel.editReminderFrequency.value} ${viewModel.editReminderPatientId.value}")
            viewModel.setReminder()
            viewModel.sendReminderUpdatedClickedEvent()
            dismiss()
        }

        binding.ivClose.setOnClickListener{
            dismiss()
        }

    }

    override fun onResume() {
        super.onResume()
        viewModel.eventSpecialShatabdiToDismissPopup.observe(this){
            if (it){
                viewModel.specialShatabdiToDismissPopup.postValue(false)
                dismiss()
            }

        }

    }


    private fun setChipTitle() {

        binding.chip1.setChipTitle("Every 15 days")
        binding.chip2.setChipTitle("Every 30 days")
        binding.chip3.setChipTitle("Every 45 days")
        binding.chip4.setChipTitle("Every 60 days")
        binding.chip5.setChipTitle("Every 75 days")
        binding.chip6.setChipTitle("Every 90 days")

        when (viewModel.editReminderFrequency.value) {
            15 -> {
                binding.chip1.setChipType(0)
            }
            30 -> {
                binding.chip2.setChipType(0)
            }
            45 -> {
                binding.chip3.setChipType(0)
            }
            60 -> {
                binding.chip4.setChipType(0)
            }
            75 -> {
                binding.chip5.setChipType(0)
            }
            90 -> {
                binding.chip6.setChipType(0)
            }
        }


        binding.chip1.setOnClickListener {
            binding.chip1.setChipType(0)
            binding.chip2.setChipType(1)
            binding.chip3.setChipType(1)
            binding.chip4.setChipType(1)
            binding.chip5.setChipType(1)
            binding.chip6.setChipType(1)
            viewModel.editReminderFrequency.value = 15
        }

        binding.chip2.setOnClickListener {
            binding.chip1.setChipType(1)
            binding.chip2.setChipType(0)
            binding.chip3.setChipType(1)
            binding.chip4.setChipType(1)
            binding.chip5.setChipType(1)
            binding.chip6.setChipType(1)
            viewModel.editReminderFrequency.value = 30
        }

        binding.chip3.setOnClickListener {
            binding.chip1.setChipType(1)
            binding.chip2.setChipType(1)
            binding.chip3.setChipType(0)
            binding.chip4.setChipType(1)
            binding.chip5.setChipType(1)
            binding.chip6.setChipType(1)
            viewModel.editReminderFrequency.value = 45
        }

        binding.chip4.setOnClickListener {
            binding.chip1.setChipType(1)
            binding.chip2.setChipType(1)
            binding.chip3.setChipType(1)
            binding.chip4.setChipType(0)
            binding.chip5.setChipType(1)
            binding.chip6.setChipType(1)
            viewModel.editReminderFrequency.value = 60
        }

        binding.chip5.setOnClickListener {
            binding.chip1.setChipType(1)
            binding.chip2.setChipType(1)
            binding.chip3.setChipType(1)
            binding.chip4.setChipType(1)
            binding.chip5.setChipType(0)
            binding.chip6.setChipType(1)
            viewModel.editReminderFrequency.value = 75
        }

        binding.chip6.setOnClickListener {
            binding.chip1.setChipType(1)
            binding.chip2.setChipType(1)
            binding.chip3.setChipType(1)
            binding.chip4.setChipType(1)
            binding.chip5.setChipType(1)
            binding.chip6.setChipType(0)
            viewModel.editReminderFrequency.value = 90
        }

    }

    private fun setEventListener() {
        viewModel.eventMessage.observe(this,EventObserver{
            if (it != null) {
                if (it.equals(MESSAGES.SET_REMINDER_SUCCESSFULLY)) {
                    Toast().showCustomToastMessage(context, "Set Reminder Successfully")
                    dismiss()
                } else if (it.equals(MESSAGES.EDIT_PATIENT_DETAILS_CLICK)) {
                    Toast().showCustomToastMessage(context, "Set Reminder Failed")
                    dismiss()
                }
            }
        })

        binding.inputLabel.setOnClickListener{

            showDatePickerDialog()
        }

    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        dialog = BottomSheetDialog(requireContext(), theme)
        dialog.behavior.state = BottomSheetBehavior.STATE_EXPANDED
//        setUpBottomSheetBehaviour(
//            dialog,
//            true,
//            4,
//            75
//        )
        return dialog
    }

    private fun showDatePickerDialog() {
        try {
            val date = sdf.parse(binding.inputLabel.text.toString())
            selectedCalendar.time = date!!


            // Get year, month, and day from Calendar
            val year: Int = selectedCalendar.get(Calendar.YEAR)
            val month: Int = selectedCalendar.get(Calendar.MONTH)
            val dayOfMonth: Int = selectedCalendar.get(Calendar.DAY_OF_MONTH)

            // Create a DatePickerDialog with the specified date
            val datePickerDialog = DatePickerDialog(
                requireActivity(),
                R.style.DatePickerDialogStyle,
                OnDateSetListener { _: DatePicker?, selectedYear: Int, selectedMonth: Int, selectedDay: Int ->
                    // Update the Calendar with the selected date
//                    Log.d("datetarun", sdf.format(selectedCalendar.time))
                    selectedCalendar.set(selectedYear, selectedMonth, selectedDay)
                    // Update the EditText with the selected date
                    binding.inputLabel.setText(sdf.format(selectedCalendar.time))
//                    viewModel.editReminderDateValue.postValue(sdf.format(selectedCalendar.time))
                },
                year, month, dayOfMonth
            )


            // Set the maximum date to current date plus 90 days
            // Set the minimum date to tomorrow
            val minDate = Calendar.getInstance()
            minDate.add(Calendar.DAY_OF_MONTH, 1)
            datePickerDialog.datePicker.minDate = minDate.timeInMillis

            // Set the maximum date to 90 days from today
            val maxDate = Calendar.getInstance()
            maxDate.add(Calendar.DAY_OF_MONTH, 91)
            datePickerDialog.datePicker.maxDate = maxDate.timeInMillis
            // Show the DatePickerDialog
            datePickerDialog.show()
        } catch (e: ParseException) {
            e.printStackTrace()
        }
    }

    //from dd-MM-yyyy to dd/MM/yyyy
    fun changeDateFormat(inputDate: String?): String? {
            // Input format is "dd-MM-yyyy"
            val inputFormat = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault())
            val date = inputFormat.parse(inputDate)

            // Output format is "dd/MM/yyyy"
            val outputFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
            return outputFormat.format(date)
    }

    //from dd/MM/yyyy to dd-MM-yyyy
    fun changeDateFormatInApiFormat(inputDate: String?): String? {
            // Input format is "dd/MM/yyyy"
            val inputFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
            val date = inputFormat.parse(inputDate)

            // Output format is "dd-MM-yyyy"
            val outputFormat = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault())
            return outputFormat.format(date)
    }

    override fun getTheme() = com.intellihealth.truemeds.R.style.BottomSheetDialog
}