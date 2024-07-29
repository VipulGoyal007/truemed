package com.intellihealth.truemeds.presentation.bottomsheet.ordersummary

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.intellihealth.salt.models.BottomsheetHeaderModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse
import com.intellihealth.truemeds.data.model.home.RatingDetailsResponseModel
import com.intellihealth.truemeds.databinding.BottomsheetPaymentCarouselBinding
import com.intellihealth.truemeds.presentation.callbacks.CouponBottomSheetCallback
import com.intellihealth.truemeds.presentation.callbacks.FeedbackCallback
import com.intellihealth.truemeds.presentation.viewmodel.CartViewModel

class PaymentCarouselBottomSheet(): BottomSheetDialogFragment() {
    private lateinit var binding: BottomsheetPaymentCarouselBinding
    private lateinit var bottomSheetHeaderModel: BottomsheetHeaderModel
    private lateinit var dialog: BottomSheetDialog
    private var millis = 0L
    private var buttonLayoutParams: ConstraintLayout.LayoutParams? = null
    private var collapsedMargin = 0
    private var buttonHeight = 0
    private var expandedHeight = 0

    var applyCouponBottomSheetModel: CouponCodeResponse.Coupon?=null
    var applyCouponCallback: CouponBottomSheetCallback?=null
    var viewModel:CartViewModel?=null

    constructor(applyCouponBottomSheetModel: CouponCodeResponse.Coupon,
                 applyCouponCallback: CouponBottomSheetCallback,
                 viewModel:CartViewModel) : this(){
        this.applyCouponBottomSheetModel = applyCouponBottomSheetModel
        this.applyCouponCallback = applyCouponCallback
        this.viewModel=viewModel
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.bottomsheet_payment_carousel, container, false)
        binding.lifeCycle = viewLifecycleOwner
        binding.viewModel=viewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        clickListeners()
        setUpData()

    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        //  dialog = BottomSheetDialog(requireContext(), theme)

        //    bottomSheetHeaderModel = BottomsheetHeaderModel(closeIcon = null, header = null, subHeader = null, icon = null, showIcon = false, showViewDragHandle = true, bottomSheetState = 3, height = 70)
        /* setUpBottomSheetBehaviour(
             dialog,
             true,
             bottomSheetHeaderModel.bottomSheetState,
             bottomSheetHeaderModel.height,
             bottomSheetHeaderModel
         )*/

        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.setOnShowListener { dialogInterface: DialogInterface? ->
            val bottomSheetDialog = dialogInterface as BottomSheetDialog?
            setupFullHeight(bottomSheetDialog!!)
        }

        (dialog as BottomSheetDialog).behavior.addBottomSheetCallback(object :
            BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, newState: Int) {}
            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                if (slideOffset > 0) //Sliding happens from 0 (Collapsed) to 1 (Expanded) - if so, calculate margins
                    buttonLayoutParams!!.topMargin =
                        ((expandedHeight - buttonHeight - collapsedMargin) * slideOffset + collapsedMargin).toInt() else  //If not sliding above expanded, set initial margin
                    buttonLayoutParams!!.topMargin = collapsedMargin
                binding.clButton.setLayoutParams(buttonLayoutParams) //Set layout params to button (margin from top)
            }
        })

        // setupFullHeight(dialog)
        return dialog
    }

    private fun setupFullHeight(bottomSheetDialog: BottomSheetDialog) {

        val bottomSheet =
            bottomSheetDialog.findViewById<FrameLayout>(com.google.android.material.R.id.design_bottom_sheet)
                ?: return

        //Retrieve button parameters
        buttonLayoutParams =
            binding.clButton.getLayoutParams() as ConstraintLayout.LayoutParams

        //Retrieve bottom sheet parameters
        BottomSheetBehavior.from(bottomSheet).state = BottomSheetBehavior.STATE_COLLAPSED
        val bottomSheetLayoutParams = bottomSheet.layoutParams
        bottomSheetLayoutParams.height = getBottomSheetDialogDefaultHeight()
        expandedHeight = bottomSheetLayoutParams.height
        val peekHeight: Int =
            (expandedHeight / 1.3).toInt() //Peek height to 70% of expanded height (Change based on your view)

        //Setup bottom sheet
        bottomSheet.layoutParams = bottomSheetLayoutParams
        BottomSheetBehavior.from(bottomSheet).skipCollapsed = false
        BottomSheetBehavior.from(bottomSheet).peekHeight = peekHeight
        BottomSheetBehavior.from(bottomSheet).isHideable = true

        if (binding.textTermsAndConditions.lineCount >= 7) BottomSheetBehavior.from(bottomSheet)
            .setDraggable(true) else BottomSheetBehavior.from(bottomSheet).setDraggable(false)

        //Calculate button margin from top
        buttonHeight =
            binding.clButton.getHeight() //How tall is the button + experimental distance from bottom (Change based on your view)
        collapsedMargin = peekHeight - buttonHeight //Button margin in bottom sheet collapsed state
        buttonLayoutParams!!.topMargin = collapsedMargin
        binding.clButton.setLayoutParams(buttonLayoutParams)

        //OPTIONAL - Setting up margins
        val recyclerLayoutParams =
            binding.nestedScrollview.layoutParams as ConstraintLayout.LayoutParams
        val k: Float =
            (buttonHeight - 60) / buttonHeight.toFloat() //60 is amount that you want to be hidden behind button
        recyclerLayoutParams.bottomMargin =
            (k * buttonHeight).toInt() //Recyclerview bottom margin (from button)
        binding.nestedScrollview.layoutParams = recyclerLayoutParams
    }

    private fun getBottomSheetDialogDefaultHeight(): Int {
        return getWindowHeight() * 95 / 100
    }

    private fun getWindowHeight(): Int {
        return try {
            val displayMetrics = DisplayMetrics()
            requireActivity().windowManager.defaultDisplay.getMetrics(displayMetrics)
            displayMetrics.heightPixels
        } catch (ignore: Exception) {
            200
        }
    }

    private fun setUpData() {
        binding.applyCouponData = applyCouponBottomSheetModel
        //  binding.textTermsAndConditions.setMovementMethod(ScrollingMovementMethod())

//        initFtcTimer()
    }

    private fun clickListeners() {
        binding.imageClose.setOnClickListener {
            dismiss()

        }
        binding.btnApplyCoupon.setOnClickListener {
            applyCouponCallback?.applyCouponButtonClick(applyCouponBottomSheetModel)
            binding.btnApplyCoupon.visibility = View.GONE
            binding.btnRemoveCoupon.visibility = View.VISIBLE
            dismiss()
//            ftcViewModel.stop()
        }
        binding.btnRemoveCoupon.setOnClickListener {
            applyCouponCallback?.removeCouponButtonClick(applyCouponBottomSheetModel)
            binding.btnApplyCoupon.visibility = View.VISIBLE
            binding.btnRemoveCoupon.visibility = View.GONE
            dismiss()
//            ftcViewModel.stop()
        }

    }

    override fun getTheme() = R.style.BottomSheetDialog

    /*    private fun initFtcTimer() {
        millis = DateUtils.convertEpochTimeStampToDateMillis(
            1704808461000,
            1704794199153
        )!!
        if (millis > 0 ) {
            initFtcCountDownTimer(millis)
        }

    }*/

    /*
    private fun initFtcCountDownTimer(millis: Long) {
        if (ftcViewModel.getCountDownTimerInstance() == null) {
            ftcViewModel.ftcTimeRemainingString.observe(this, Observer<String> { str: String ->
                if(str != "") {
                    setCountDownTimerData(str)
                }

            })
            ftcViewModel.start(millis)
        }else{
            ftcViewModel.stop()
        }


    }
*/

/*
    private fun setCountDownTimerData(millis: String) {
        val data = StickyNonStickyNotificationModel(
            message = " First 25 applied",
            amount = 423.34,
            subTitle = "",
            timer = "Ends in $millis",
            buttonText = "",
            drawableLeft = ContextCompat.getDrawable(
                binding.viewStickyNonStickyNotification.context,
                R.drawable.ic_coupon_applied
            ),
            buttonIcon = null,
            drawableRight = null
        )
        binding.viewStickyNonStickyNotification.setStickyNonStickyNotificationData(data)

    }
*/
}

