package com.intellihealth.truemeds.presentation.bottomsheet.wallet

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.DisplayMetrics
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.intellihealth.salt.models.BottomsheetHeaderModel
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.TimeIntervalCallback
import com.intellihealth.truemeds.data.model.home.RatingDetailsResponseModel
import com.intellihealth.truemeds.data.model.wallet.TimeIntervalBottomSheetModel
import com.intellihealth.truemeds.databinding.BottomsheetChooseTimeIntervalBinding
import com.intellihealth.truemeds.presentation.adapter.TimeIntervalAdapter
import com.intellihealth.truemeds.presentation.callbacks.FeedbackCallback
import java.util.Date
import kotlin.math.log

class ChooseTimeIntervalBottomSheet():  BottomSheetDialogFragment()  {
    private lateinit var binding:BottomsheetChooseTimeIntervalBinding
    private lateinit var bottomSheetHeaderModel: BottomsheetHeaderModel
    private lateinit var dialog: BottomSheetDialog
//    private var selectedTimeIntervalFromBottomSheet: String ? = "Custom Dates"
    var selectedDateFromBottomSheet: Date?=null
    var selectedDateToBottomSheet: Date?=null
    var selectedCustomDate: String=""
    var timeIntervalList: MutableList<TimeIntervalBottomSheetModel> = emptyList<TimeIntervalBottomSheetModel>().toMutableList()
    var customDateCallback: TimeIntervalCallback?=null
    var selectedTimeIntervalFromBottomSheet: String?=""

    constructor( selectedDateFromBottomSheet: Date?,
                 selectedDateToBottomSheet: Date?,
                 selectedCustomDate: String,
                 timeIntervalList: MutableList<TimeIntervalBottomSheetModel>,
                 customDateCallback: TimeIntervalCallback?,
                 selectedTimeIntervalFromBottomSheet: String?) : this(){
        this.selectedDateFromBottomSheet = selectedDateFromBottomSheet
        this.selectedDateToBottomSheet = selectedDateToBottomSheet
        this.selectedCustomDate=selectedCustomDate
        this.timeIntervalList=timeIntervalList
        this.customDateCallback=customDateCallback
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
            DataBindingUtil.inflate(inflater, R.layout.bottomsheet_choose_time_interval, container, false)
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
        bottomSheetHeaderModel = BottomsheetHeaderModel(closeIcon = null, header = null, subHeader = null, icon = null, showIcon = false, showViewDragHandle = true, height = 55, bottomSheetState = 3)
        /*setUpBottomSheetBehaviour(
            dialog,
            true,
            bottomSheetHeaderModel.bottomSheetState,
            bottomSheetHeaderModel.height,
            bottomSheetHeaderModel
        )*/
        dialog.setOnShowListener { dialogInterface: DialogInterface? ->
            val bottomSheetDialog = dialogInterface as BottomSheetDialog?
            setupFullHeight(bottomSheetDialog!!)
        }
        return dialog
    }
    private fun clickListeners(){
        binding.imageClose.setOnClickListener {
            dismiss()
        }
        binding.tvApplyTimeInterval.setOnClickListener {
            dismiss()
            if(selectedTimeIntervalFromBottomSheet.equals("Custom Dates",true) && selectedCustomDate.isEmpty()){
                val bottomSheet = ChooseCustomDatesBottomSheet(selectedDateFromBottomSheet,selectedDateToBottomSheet,selectedCustomDate,customDateCallback, selectedTimeIntervalFromBottomSheet)
                bottomSheet.isCancelable = true
                if (!bottomSheet.isVisible)
                    bottomSheet.show(requireActivity().supportFragmentManager, "ChooseCustomDatesBottomSheet")
            }else {
                customDateCallback?.selectedTimeIntervalCallback(selectedTimeIntervalFromBottomSheet)
            }
        }

    }

    fun setupFullHeight(bottomSheetDialog: BottomSheetDialog) {

        //this condition is commented for now
        val bottomSheet =
            bottomSheetDialog.findViewById<FrameLayout>(com.google.android.material.R.id.design_bottom_sheet)
        if (bottomSheet != null) {
            BottomSheetBehavior.from(bottomSheet).apply {
                peekHeight = getBottomSheetDialogDefaultHeight()
                state = BottomSheetBehavior.STATE_COLLAPSED
            }


        }
    }

    private fun getBottomSheetDialogDefaultHeight(): Int {
        return getWindowHeight() * 60 / 100

    }

    private fun getWindowHeight(): Int {
        val displayMetrics = DisplayMetrics()
        requireActivity().windowManager.defaultDisplay.getMetrics(displayMetrics)
        return (displayMetrics.heightPixels).toInt()
    }

    private fun setUpData() {

        val customDateCallbackAdapter = object:TimeIntervalCallback {
            override fun selectedCustomTimeIntervalCallback(
                selectedFromDate: Date,
                selectedToDate: Date
            ) {

            }

            override fun selectedTimeIntervalCallback(selectedTimeInterval: String?) {
                selectedTimeIntervalFromBottomSheet = selectedTimeInterval
                Log.d("TAG", "selectedTimeIntervalCallback: $selectedTimeInterval")

            }

            override fun onEditCustomDatesClicked() {
                val bottomSheet = ChooseCustomDatesBottomSheet(selectedDateFromBottomSheet,selectedDateToBottomSheet,selectedCustomDate,customDateCallback, selectedTimeIntervalFromBottomSheet)
                bottomSheet.isCancelable = true
                if (!bottomSheet.isVisible)
                    bottomSheet.show(requireActivity().supportFragmentManager, "ChooseCustomDatesBottomSheet")
            }
        }
        val timeIntervalAdapter =
            TimeIntervalAdapter(selectedCustomDate,timeIntervalList,requireContext(),customDateCallbackAdapter)
        //maintain last transaction apply selection
        for (item in timeIntervalList){
            item.isSelected = item.header.equals(selectedTimeIntervalFromBottomSheet, true)
        }
        timeIntervalAdapter.notifyDataSetChanged()

        binding.rvTimeIntervalList.apply {
            adapter = timeIntervalAdapter
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        }


    }



    override fun getTheme() = R.style.BottomSheetDialog

}