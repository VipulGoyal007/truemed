package com.intellihealth.truemeds.presentation.bottomsheet.myorder

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.DisplayMetrics
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.intellihealth.salt.models.BottomsheetHeaderModel
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.BottomsheetMyorderBinding
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel
import com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel
import javax.inject.Inject


class MyOrderBottomSheet() : BottomSheetDialogFragment() {
    private lateinit var binding: BottomsheetMyorderBinding
    private lateinit var bottomSheetHeaderModel: BottomsheetHeaderModel
    private lateinit var dialog: BottomSheetDialog
    private var header: Boolean = true
    private lateinit var viewModel: OrdersTabViewModel
    private var previousView: com.intellihealth.salt.views.TextView ?=null
    var type:String=""
    var showDropDownPatient:Boolean=false

    @Inject
    lateinit var factory: ViewModelProvider.Factory

    constructor(type:String,showDropDownPatient:Boolean) : this(){
        this.type = type
        this.showDropDownPatient = showDropDownPatient
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.bottomsheet_myorder, container, false)
        viewModel = ViewModelProvider(requireActivity())[OrdersTabViewModel::class.java]

        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        if(!showDropDownPatient)
            binding.tvPatients.visibility=View.GONE
        setEventListeners()

    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        bottomSheetHeaderModel = BottomsheetHeaderModel(closeIcon = null, header = null, subHeader = null, icon = null, showIcon = false, showViewDragHandle = false, bottomSheetState = 6, height = 45)
        dialog = BottomSheetDialog(requireContext(), theme)
        /*setUpBottomSheetBehaviour(
            bottomSheetDialog = dialog,
            isDraggable = false,
            bottomSheetState = bottomSheetHeaderModel.bottomSheetState,
            height = 50
        )*/
        dialog.setOnShowListener { dialogInterface: DialogInterface? ->
            val bottomSheetDialog = dialogInterface as BottomSheetDialog?
            setupFullHeight(bottomSheetDialog!!)
        }
        return dialog
    }

    fun setupFullHeight(bottomSheetDialog: BottomSheetDialog) {

        //this condition is commented for now
        val bottomSheet =
            bottomSheetDialog.findViewById<FrameLayout>(com.google.android.material.R.id.design_bottom_sheet)
        if (bottomSheet != null) {
            BottomSheetBehavior.from(bottomSheet).apply {
                //peekHeight = getBottomSheetDialogDefaultHeight()
                peekHeight = getWindowHeight()
                isDraggable=false
                //state = BottomSheetBehavior.STATE_COLLAPSED
            }


        }
    }

    override fun onCancel(dialog: DialogInterface) {
        super.onCancel(dialog)
        viewModel.isBottomSheetClickable=true
    }

    private fun getWindowHeight(): Int {
       /* val displayMetrics = DisplayMetrics()
        requireActivity().windowManager.defaultDisplay.getMetrics(displayMetrics)
        return (displayMetrics.heightPixels).toInt()*/
        return (binding.parentLayout.height)
    }

    private fun getBottomSheetDialogDefaultHeight(): Int {
        return getWindowHeight() * 55 / 100
    }

    private fun setEventListeners() {

        binding.ivClose.setOnClickListener {
            viewModel.isBottomSheetClickable=true
            if (dialog.isShowing) {
                dialog.dismiss()
            }
        }
        binding.tvOrderStatus.setOnClickListener {
            type="orders"
            initView()
        }
        binding.tvPatients.setOnClickListener {

            type="patients"
            initView()
        }

    }

    private fun initView() {

        previousView?.setBackgroundColor(resources.getColor(R.color.white))
        when {
            type.equals("orders") -> {
                binding.tvOrderStatus.setBackgroundColor(resources.getColor(R.color.tm_core_color_light_blue_200))
                previousView= binding.tvOrderStatus
                binding.rvOrderList.visibility=View.VISIBLE
                binding.rvPatientList.visibility=View.GONE
            }
            type.equals("patients") -> {
                binding.tvPatients.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.tm_core_color_light_blue_200))
                previousView= binding.tvPatients
                binding.rvOrderList.visibility=View.GONE
                binding.rvPatientList.visibility=View.VISIBLE
            }
        }

    }

   /* fun setUpdatedList()
    {

    }*/

    override fun getTheme() = R.style.BottomSheetDialog

}