package com.intellihealth.truemeds.presentation.bottomsheet.productdetail

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
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.intellihealth.salt.models.BottomsheetHeaderModel
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.home.CompositionBSDataModel
import com.intellihealth.truemeds.databinding.BottomsheetCompositionDetailsBinding
import com.intellihealth.truemeds.presentation.adapter.CompositionBottomsheetAdapter
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel
import kotlin.math.roundToInt


class CompositionDetailsBottomSheet: BottomSheetDialogFragment() {
    private lateinit var binding: BottomsheetCompositionDetailsBinding
    private lateinit var bottomSheetHeaderModel: BottomsheetHeaderModel
    private lateinit var dialog: BottomSheetDialog
    private var header: Boolean = true
    private lateinit var viewModel: ProductDetailViewModel
    private var compositionList:ArrayList<CompositionBSDataModel> = arrayListOf()
    private var compositionDetails:String?=""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.bottomsheet_composition_details, container, false)
        viewModel = ViewModelProvider(requireActivity())[ProductDetailViewModel::class.java]
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initArgs()
        initView()
        setEventListeners()
        addObservers()
    }

    private fun initArgs() {
        compositionDetails = arguments?.getString(BundleConstants.COMPOSITION_DETAILS)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        Log.i("dialog created","dialog created")

        dialog.setOnShowListener { dialogInterface: DialogInterface? ->
            val bottomSheetDialog = dialogInterface as BottomSheetDialog?
            setupFullHeight(bottomSheetDialog!!)
        }

        (dialog as BottomSheetDialog).behavior.addBottomSheetCallback(object :
            BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, newState: Int) {
                Log.i("onStateChanged",""+newState)
            }
            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                Log.i("onSlide",""+slideOffset)
                val drawerHeight = bottomSheet.height * slideOffset
                Log.i("drawerHeight",""+drawerHeight)
            }
        })
        return dialog
    }

    private fun setupFullHeight(bottomSheetDialog: BottomSheetDialog?) {
        val bottomSheet =
            bottomSheetDialog?.findViewById<FrameLayout>(com.google.android.material.R.id.design_bottom_sheet)

        //Retrieve bottom sheet parameters

        val bottomSheetLayoutParams = bottomSheet?.layoutParams
        bottomSheetLayoutParams?.height = getBottomSheetDialogDefaultHeight()
        Log.i("default height",""+getBottomSheetDialogDefaultHeight())

        val expandedHeight = bottomSheetLayoutParams?.height
        Log.i("expandedHeight",""+expandedHeight)
        val peekHeight =
            (expandedHeight?.div(1.4)) //Peek height to 70% of expanded height (Change based on your view)
        Log.i("expandedHeight",""+peekHeight)

        //Setup bottom sheet
        //bottomSheet.layoutParams = bottomSheetLayoutParams
        BottomSheetBehavior.from(bottomSheet!!).state = BottomSheetBehavior.STATE_COLLAPSED
        BottomSheetBehavior.from(bottomSheet).skipCollapsed = false
        BottomSheetBehavior.from(bottomSheet).peekHeight = peekHeight!!.roundToInt()
        BottomSheetBehavior.from(bottomSheet).isFitToContents = false
        BottomSheetBehavior.from(bottomSheet).isHideable = true
        BottomSheetBehavior.from(bottomSheet).expandedOffset = 100

    }

    /*private fun getWindowHeight(): Int {
        return WindowManager.LayoutParams.MATCH_PARENT
    }*/

    private fun getWindowHeight(): Int {
        val displayMetrics = DisplayMetrics()
        requireActivity().windowManager.defaultDisplay.getMetrics(displayMetrics)
        Log.i("window height",""+(displayMetrics.heightPixels).toInt())
        return (displayMetrics.heightPixels).toInt()
    }

    private fun getBottomSheetDialogDefaultHeight(): Int {
        Log.i("bottomsheetheight",""+(getWindowHeight() * (95 / 100)))
        return getWindowHeight() * 95 / 100

    }


    private fun setEventListeners() {
      binding.ivClose.setOnClickListener {
          dismiss()
      }
    }

    private fun initView() {
        compositionDetails?.let { viewModel.getPDCompositionBSData(it) }
    }

    override fun getTheme() = R.style.BottomSheetDialog

    private fun addObservers() {
        viewModel.compositionDetailsData.observe(this, Observer { compositionList ->
            if (compositionList.isNotEmpty()) {
            val adapter = CompositionBottomsheetAdapter( compositionList ?: arrayListOf())
            binding.rvCart.apply {
                this.adapter = adapter
            }
            adapter.notifyDataSetChanged()

            }
        })
    }

    fun newInstance(molecules: String?)=CompositionDetailsBottomSheet().apply {
        arguments = Bundle().apply {
            putString(BundleConstants.COMPOSITION_DETAILS, molecules)
        }
    }

}