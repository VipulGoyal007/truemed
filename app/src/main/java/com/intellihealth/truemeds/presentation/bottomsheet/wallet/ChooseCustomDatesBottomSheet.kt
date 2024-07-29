package com.intellihealth.truemeds.presentation.bottomsheet.wallet

import android.app.DatePickerDialog
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.intellihealth.salt.models.BottomsheetHeaderModel
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.TimeIntervalCallback
import com.intellihealth.truemeds.data.model.home.RatingDetailsResponseModel
import com.intellihealth.truemeds.databinding.BottomsheetChooseCustomDatesBinding
import com.intellihealth.truemeds.presentation.callbacks.FeedbackCallback
import com.intellihealth.truemeds.presentation.viewmodel.WalletTransactionsViewModel
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date

class ChooseCustomDatesBottomSheet() :BottomSheet() {
    private lateinit var binding: BottomsheetChooseCustomDatesBinding
    private lateinit var bottomSheetHeaderModel: BottomsheetHeaderModel
    private lateinit var dialog: BottomSheetDialog
    private lateinit var viewModel: WalletTransactionsViewModel
    private var selectedDateFrom: Date? = null
    private var selectedDateTo: Date? = null
    private var selectedDateFromBottomSheet: Date?=null
    private var selectedDateToBottomSheet: Date?=null
    private var selectedCustomDate:String=""
    private var customDateCallback: TimeIntervalCallback?=null
    private var selectedTimeIntervalFromBottomSheet: String? =""

    constructor(selectedDateFromBottomSheet: Date?, selectedDateToBottomSheet: Date?,
                selectedCustomDate:String,customDateCallback: TimeIntervalCallback?,
                selectedTimeIntervalFromBottomSheet: String?) : this(){
        this.selectedDateFromBottomSheet = selectedDateFromBottomSheet
        this.selectedDateToBottomSheet = selectedDateToBottomSheet
        this.customDateCallback=customDateCallback
        this.selectedCustomDate=selectedCustomDate
        this.selectedTimeIntervalFromBottomSheet=selectedTimeIntervalFromBottomSheet
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
            DataBindingUtil.inflate(inflater, R.layout.bottomsheet_choose_custom_dates, container, false)
        viewModel = ViewModelProvider(this)[WalletTransactionsViewModel::class.java]
        binding.viewModel = viewModel
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
        bottomSheetHeaderModel = BottomsheetHeaderModel(closeIcon = null, header = null, subHeader = null, icon = null, showIcon = false, showViewDragHandle = true, height = 40, bottomSheetState = 3)
        setUpBottomSheetBehaviour(
            dialog,
            true,
            bottomSheetHeaderModel.bottomSheetState,
            bottomSheetHeaderModel.height,
            bottomSheetHeaderModel
        )
        return dialog
    }

    private fun clickListeners(){
        binding.imageClose.setOnClickListener {
            dismiss()
        }
        binding.tvApplyChooseDates.setOnClickListener {
            if(selectedDateFrom !=null && selectedDateTo != null){
                dismiss()
                customDateCallback?.selectedCustomTimeIntervalCallback(selectedDateFrom!!,selectedDateTo!!)
                customDateCallback?.selectedTimeIntervalCallback("Custom Dates")
            }
        }
        binding.imageBack.setOnClickListener {
            dismiss()
            if(selectedCustomDate.isEmpty()) {
                val bottomSheet = ChooseTimeIntervalBottomSheet(
                    selectedDateFromBottomSheet,
                    selectedDateToBottomSheet,
                    selectedCustomDate,
                    viewModel.timeIntervalBottomSheetData,
                    customDateCallback, selectedTimeIntervalFromBottomSheet
                )
                bottomSheet.isCancelable = true
                if (!bottomSheet.isVisible)
                    bottomSheet.show(
                        requireActivity().supportFragmentManager,
                        "ChooseTimeIntervalBottomSheet"
                    )
            }
        }
        binding.dropDownCustomDatesFrom.setOnClickListener {
            openFromDatePicker()
            if (binding.dropDownCustomDatesFrom.isVisible) {
                binding.dropDownCustomDatesFrom.setStateOpen(0)

            } else {
                binding.dropDownCustomDatesFrom.setStateOpen(1)
            }
        }
        binding.dropDownCustomDatesTo.setOnClickListener {
            openToDatePicker()
            if (binding.dropDownCustomDatesTo.isVisible) {
                binding.dropDownCustomDatesTo.setStateOpen(0)

            } else {
                binding.dropDownCustomDatesTo.setStateOpen(1)
            }
        }
    }

    private fun setUpData() {
        if(selectedDateFromBottomSheet !=null && selectedDateToBottomSheet !=null){
            val format = SimpleDateFormat("MMM dd,yyyy")
            val strFromDate: String = format.format(selectedDateFromBottomSheet)
            binding.dropDownCustomDatesFrom.setLabel(strFromDate)
            val strToDate: String = format.format(selectedDateToBottomSheet)
            binding.dropDownCustomDatesTo.setLabel(strToDate)
            binding.tvApplyChooseDates.setEnable(true)
            selectedDateFrom = selectedDateFromBottomSheet
            selectedDateTo = selectedDateFromBottomSheet
        }else {
            binding.dropDownCustomDatesFrom.setLabel("Select date")
            binding.dropDownCustomDatesTo.setLabel("Select date")
            binding.tvApplyChooseDates.setEnable(false)
        }
    }

    private fun openFromDatePicker(){
        // on below line we are getting
        // the instance of our calendar.
        val c = Calendar.getInstance()

        selectedDateFrom?.let {
            c.time = it
        }

        // on below line we are getting
        // our day, month and year.
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        // on below line we are creating a
        // variable for date picker dialog.
        val datePickerDialog = DatePickerDialog(
            // on below line we are passing context.
            requireContext(),R.style.DatePickerDialogStyle,
            { view, year, monthOfYear, dayOfMonth ->
                // on below line we are setting
                // date to our edit text.
                val calendar = Calendar.getInstance()
                calendar.set(year,monthOfYear,dayOfMonth)

                val format = SimpleDateFormat("MMM dd,yyyy")
                val strFromDate: String = format.format(calendar.time)
                binding.dropDownCustomDatesFrom.setLabel(strFromDate)

                selectedDateFrom = calendar.time
                if(selectedDateFrom != null && selectedDateTo != null){
                    binding.tvApplyChooseDates.setEnable(true)
                }
            },
            // on below line we are passing year, month
            // and day for the selected date in our date picker.
            year,
            month,
            day
        )
        // to display our date picker dialog.
        datePickerDialog.datePicker.maxDate = System.currentTimeMillis()

        selectedDateTo?.let {
            datePickerDialog.datePicker.maxDate = it.time
        }
        datePickerDialog.show()
        datePickerDialog.getButton(DatePickerDialog.BUTTON_NEGATIVE).setTextColor(ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark))
        datePickerDialog.getButton(DatePickerDialog.BUTTON_POSITIVE).setTextColor(ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark))

    }

    private fun openToDatePicker(){
        // on below line we are getting
        // the instance of our calendar.
        val c = Calendar.getInstance()

        selectedDateTo?.let {
            c.time = it
        }

        // on below line we are getting
        // our day, month and year.
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        // on below line we are creating a
        // variable for date picker dialog.
        val datePickerDialog = DatePickerDialog(
            // on below line we are passing context.
            requireContext(),R.style.DatePickerDialogStyle,
            { view, year, monthOfYear, dayOfMonth ->
                // on below line we are setting
                // date to our edit text.
                val calendar = Calendar.getInstance()
                calendar.set(year,monthOfYear,dayOfMonth)

                val format = SimpleDateFormat("MMM dd,yyyy")
                val strToDate: String = format.format(calendar.time)
                binding.dropDownCustomDatesTo.setLabel(strToDate)

                selectedDateTo = calendar.time
                if(selectedDateFrom != null && selectedDateTo != null){
                    binding.tvApplyChooseDates.setEnable(true)
                }
            },
            // on below line we are passing year, month
            // and day for the selected date in our date picker.
            year,
            month,
            day
        )
        datePickerDialog.datePicker.maxDate = System.currentTimeMillis()
        // to display our date picker dialog.
        selectedDateFrom?.let {
            datePickerDialog.datePicker.minDate = it.time
        }
        datePickerDialog.show()
        datePickerDialog.getButton(DatePickerDialog.BUTTON_NEGATIVE).setTextColor(ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark))
        datePickerDialog.getButton(DatePickerDialog.BUTTON_POSITIVE).setTextColor(ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark))
    }

    override fun getTheme() = R.style.BottomSheetDialog

}