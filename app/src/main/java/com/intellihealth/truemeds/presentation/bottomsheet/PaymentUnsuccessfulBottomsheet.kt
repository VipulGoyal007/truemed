package com.intellihealth.truemeds.presentation.bottomsheet

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.intellihealth.salt.utils.toPx
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.BottomsheetPaymentUnsuccessfulBinding
import com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.data.model.home.RatingDetailsResponseModel
import com.intellihealth.truemeds.presentation.callbacks.FeedbackCallback
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PaymentUnsuccessfulBottomsheet() : DialogFragment() {

    lateinit var viewModel: PaymentOptionsViewModel
    private lateinit var binding: BottomsheetPaymentUnsuccessfulBinding
   // private lateinit var dialog: Dialog
   var context : Activity?=null

    constructor(context : Activity) : this(){
        this.context = context
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[PaymentOptionsViewModel::class.java]

       // setStyle(STYLE_NORMAL, R.style.BottomSheetDialog)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?, ): View {
        val view = inflater.inflate(R.layout.bottomsheet_payment_unsuccessful, container, false)
        binding = DataBindingUtil.bind(view)!!
       // dialog?.window?.attributes?.windowAnimations = R.style.DialogAnimation
        return binding.root
    }

    override fun getTheme() = R.style.RoundedCornersDialog

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
        initEvents()
    }

  /*  override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        dialog = Dialog(requireContext(), theme)

        val displayMetrics = context.resources.displayMetrics
        //contex.defaultDisplay.getMetrics(displayMetrics)
        val displayWidth = displayMetrics.widthPixels
        val displayHeight = displayMetrics.heightPixels
        val layoutParams = WindowManager.LayoutParams()
        layoutParams.copyFrom(dialog.window?.getAttributes())
        val dialogWindowWidth = (displayWidth * 0.9f).toInt()
        val dialogWindowHeight = (displayHeight * 0.75f).toInt()
        layoutParams.width = dialogWindowWidth
        //layoutParams.height = dialogWindowHeight;
        layoutParams.height = dialogWindowHeight;
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.window?.attributes = layoutParams
        return dialog
    }*/

    private fun initView() {
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        val displayMetrics = context?.resources?.displayMetrics
        //contex.defaultDisplay.getMetrics(displayMetrics)
        val displayWidth = displayMetrics?.widthPixels

      //  binding.parentPaymentModeCouponAppliedBottomSheet.layoutParams.width = 294.toPx
        if (displayWidth != null) {
            binding.parentPaymentModeCouponAppliedBottomSheet.layoutParams.width =  (displayWidth * 0.9f).toInt()
        }
    }

    private fun initEvents() {
        viewModel.eventPaymentFailed.observe(this, EventObserver {
            closeBottomSheet()
        })
    }

    private fun closeBottomSheet() {
        dialog?.dismiss()
    }
}