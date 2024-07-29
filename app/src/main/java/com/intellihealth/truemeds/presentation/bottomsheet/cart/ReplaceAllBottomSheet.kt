package com.intellihealth.truemeds.presentation.bottomsheet.cart

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
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.intellihealth.salt.models.BottomsheetHeaderModel
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.mixpanel.MxOneClickSubstitutionPopupViewed
import com.intellihealth.truemeds.data.model.orderflow.ReplaceAllBottomSheetModel
import com.intellihealth.truemeds.databinding.BottomsheetReplaceAllRecocommendedBinding
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.viewmodel.CartViewModel
import com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel
import kotlin.math.roundToInt

class ReplaceAllBottomSheet() : BottomSheetDialogFragment() {
    private lateinit var binding: BottomsheetReplaceAllRecocommendedBinding
    private lateinit var bottomSheetHeaderModel: BottomsheetHeaderModel
    private lateinit var viewModel: CartViewModel
    var replaceAllBottomSheetModel: ReplaceAllBottomSheetModel?=null

    constructor(replaceAllBottomSheetModel: ReplaceAllBottomSheetModel) : this(){
        this.replaceAllBottomSheetModel = replaceAllBottomSheetModel
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.bottomsheet_replace_all_recocommended, container, false)
        viewModel = ViewModelProvider(requireActivity())[CartViewModel::class.java]

        binding.viewmodel = viewModel

        binding.replaceAllBottomSheetModel = replaceAllBottomSheetModel

        binding.lifecycleOwner = viewLifecycleOwner

        Glide.with(this).load(R.drawable.switch_medicine).into(binding.ivLoader)

        setListener()
        viewModel.sendOneClickSubstitutionPopupViewedEvent(MxOneClickSubstitutionPopupViewed(viewModel.replaceAllModel.productSellingPrice, viewModel.replaceAllModel.suggestionSellingPrice, SharedPrefManager.getInstance().incompleteOrderId.toString(), viewModel.savingPercentageWithSubs))
        return binding.root
    }

    private fun setListener() {
        binding.ivClose.setOnClickListener {
            dismiss()
        }

        binding.btnWithoutSaving.setOnClickListener {
//            if (dialog.isShowing) dialog.dismiss()
            dismiss()
            viewModel.onContinueClicked()
        }
        binding.btnReplaceSave.setOnClickListener {
//            if (dialog.isShowing) dialog.dismiss()
            dismiss()
            viewModel.onReplaceAllClicked()
        }
        binding.btnMainReplaceSave.setOnClickListener {
//            if (dialog.isShowing) dialog.dismiss()
            dismiss()
            viewModel.onReplaceAllClicked()
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
         val dialog = super.onCreateDialog(savedInstanceState)
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
            (expandedHeight?.div(1.5)) //Peek height to 70% of expanded height (Change based on your view)
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

    private fun getWindowHeight(): Int {
        val displayMetrics = DisplayMetrics()
        requireActivity().windowManager.defaultDisplay.getMetrics(displayMetrics)
        Log.i("window height",""+(displayMetrics.heightPixels).toInt())
        return (displayMetrics.heightPixels).toInt()
    }

    private fun getBottomSheetDialogDefaultHeight(): Int {
        return getWindowHeight() * 99 / 100

    }

    override fun getTheme() = R.style.BottomSheetDialog
}