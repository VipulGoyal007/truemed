package com.intellihealth.truemeds.presentation.bottomsheet.home

import android.app.Dialog
import android.graphics.Typeface
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.BottomsheetRatingsBinding
import com.intellihealth.truemeds.presentation.callbacks.FeedbackCallback
import com.intellihealth.salt.models.BottomsheetHeaderModel
import com.intellihealth.salt.views.chip.Chip
import com.intellihealth.truemeds.data.model.home.RatingDetailsResponseModel
import com.intellihealth.truemeds.data.model.orderflow.SaveRatingDetailsRequestDataModel
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class RatingsBottomSheet() : BottomSheetDialogFragment(), View.OnClickListener {
    private lateinit var dialog: BottomSheetDialog
    private lateinit var binding: BottomsheetRatingsBinding
    private lateinit var bottomSheetHeaderModel: BottomsheetHeaderModel
    private var userRating: Float = 0f
    private var feedbackCategory: String? = null
    private var userInput: String? = null
    private var ratingName: String = ""
    private var ratingReasonHeader: String = ""
    private lateinit var viewModel: HomeViewModel
    var currentRatingReasonList: MutableList<RatingDetailsResponseModel.ResponseData.RatingDetail.RatingReasons> =
        mutableListOf()
    var currentRatingReasonListSentToApi: MutableList<RatingDetailsResponseModel.ResponseData.RatingDetail.RatingReasons> =
        mutableListOf()
    var orderID: String=""
    var callback: FeedbackCallback?=null
    var ordersList: MutableList<RatingDetailsResponseModel.ResponseData.RatingDetail> = emptyList<RatingDetailsResponseModel.ResponseData.RatingDetail>().toMutableList()

    constructor(orderID: String,callback: FeedbackCallback,ordersList: MutableList<RatingDetailsResponseModel.ResponseData.RatingDetail>) : this(){
        this.orderID = orderID
        this.callback = callback
        this.ordersList=ordersList
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.bottomsheet_ratings, container, false)
        viewModel = ViewModelProvider(requireActivity())[HomeViewModel::class.java]

       // binding.isRatingsClicked = false
        binding.orderID = orderID
        binding.lifecycleOwner = viewLifecycleOwner

        setListener()
        // setting all input fields input digits from here
        setInputDigits()
        return binding.root
    }
    private fun  setInputDigits(){
        val nameRegex="[a-zA-Z ]+"

        //binding.tmFeedbackInput.setInputDigits(nameRegex)


    }


    fun setChipData() {
        if (!ordersList.isNullOrEmpty() && userRating.toInt() > 0) {
            currentRatingReasonList.clear()
            currentRatingReasonListSentToApi.clear()
            var categoryData = ordersList.get(userRating.toInt() - 1)
            ratingName = categoryData.ratingName
            ratingReasonHeader = categoryData.ratingReasonHeader

            categoryData.ratingReasonsList.let { data ->
                currentRatingReasonList.addAll(data)
                setChipTitleAndSelection(data.get(0).reasonName, binding.chipCustomer)
                setChipTitleAndSelection(data.get(1).reasonName, binding.chipDiscount)
                setChipTitleAndSelection(data.get(2).reasonName, binding.chipDeliveryTime)
                setChipTitleAndSelection(data.get(3).reasonName, binding.chipMedicineQuality)
                setChipTitleAndSelection(data.get(4).reasonName, binding.chipOrderExperience)

            }
        }
    }

    fun setChipTitleAndSelection(reasonName: String, chipItem: Chip) {
        chipItem.setChipTitle(reasonName)
        chipItem.tag = (reasonName)
        chipItem.setChipType(ChipType.UNSELECTED.value)
    }


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        dialog = BottomSheetDialog(requireContext(), theme)
        (dialog as BottomSheetDialog).behavior.state= BottomSheetBehavior.STATE_EXPANDED
        return dialog
    }

    override fun getTheme() = R.style.BottomSheetDialog2

    private fun setListener() {
        binding.chipCustomer.setOnClickListener(this)
        binding.chipDiscount.setOnClickListener(this)
        binding.chipDeliveryTime.setOnClickListener(this)
        binding.chipMedicineQuality.setOnClickListener(this)
        binding.chipOrderExperience.setOnClickListener(this)

        binding.btnSkip.setOnClickListener(this)
        binding.btnSubmit.setOnClickListener(this)
        binding.ratingFeedback.onRatingBarChangeListener =
            RatingBar.OnRatingBarChangeListener { ratingBar, rating, fromUser ->
              //  binding.isRatingsClicked = true
                if (CommonFunc.isSingleClickParam()) {
                    binding.clDetailedFeedback.visibility=View.VISIBLE
                }
                userRating = rating
                setChipData()
            }



       /* binding.tmFeedbackInput.setInputFieldCallback(null, object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {

                if(   binding.tmFeedbackInputError.visibility==View.VISIBLE)
                binding.tmFeedbackInputError.visibility = View.GONE

                userInput = s.toString()
            }

        })*/

        val fontRegular: Typeface =
            Typeface.createFromAsset(context?.assets, "plus_jakarta_sans_regular.ttf")
        binding.tmFeedbackInput.typeface = fontRegular

        binding.tmFeedbackInput.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {
                if(   binding.tmFeedbackInputError.visibility==View.VISIBLE)
                    binding.tmFeedbackInputError.visibility = View.GONE

                userInput = s.toString()
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        })


    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.chipCustomer -> {
                // deSelectChips(v)
                // binding.chipCustomer.setChipType(ChipType.SELECTED.value)
                performSelectionLogic(0, binding.chipCustomer)
            }

            R.id.chipDiscount -> {
                //  deSelectChips(v)
                //  binding.chipDiscount.setChipType(ChipType.SELECTED.value)
                performSelectionLogic(1, binding.chipDiscount)
            }

            R.id.chipDeliveryTime -> {
                //    deSelectChips(v)
                //  binding.chipDeliveryTime.setChipType(ChipType.SELECTED.value)
                performSelectionLogic(2, binding.chipDeliveryTime)
            }

            R.id.chipMedicineQuality -> {
                //   deSelectChips(v)
                //   binding.chipMedicineQuality.setChipType(ChipType.SELECTED.value)
                performSelectionLogic(3, binding.chipMedicineQuality)
            }

            R.id.chipOrderExperience -> {
                //  deSelectChips(v)
                //  binding.chipOrderExperience.setChipType(ChipType.SELECTED.value)
                performSelectionLogic(4, binding.chipOrderExperience)
            }

            R.id.btnSubmit -> {
                var tempSelectedList: MutableList<SaveRatingDetailsRequestDataModel.RatingReasonDataModel> =
                    mutableListOf()

                for (i in 0..currentRatingReasonListSentToApi.size - 1) {
                    currentRatingReasonListSentToApi.get(i).let { data ->
                        tempSelectedList.add(
                            SaveRatingDetailsRequestDataModel.RatingReasonDataModel(
                                data.reasonName, data.activeUrl,
                                data.inActiveUrl, data.reasonPlacementPosition, data.reasonId
                            )
                        )
                    }

                }

                //commented out validations for now
             /*   if (userInput.isNullOrEmpty() || tempSelectedList.isNullOrEmpty()) {
                    // check validations here
                    if (userInput?.trim().isNullOrEmpty()) {
                        binding.tmFeedbackInput.setUpState(InputFieldConstants.STATE_ERROR)
                        binding.tmFeedbackInputError.visibility = View.VISIBLE
                    }
                    if (tempSelectedList.isNullOrEmpty()) {
                        binding.tvFeedbackError.visibility = View.VISIBLE
                    }
                }
                else {*/
//do api calling here

                    Log.e(
                        "feedback_data::",
                        "111::" + userRating.toString() + "::" + feedbackCategory + ":::" + userInput
                    )
                    callback?.onFeedbackSubmitted(
                        ratings = userRating,
                        feedbackCategory = feedbackCategory,
                        userInput = userInput,
                        ratingName = ratingName,
                        ratingReasonHeader = ratingReasonHeader,
                        ratingReasonsList = tempSelectedList
                    )
                    if (dialog.isShowing) dialog.dismiss()
              //  }
            }

            R.id.btnSkip -> {
                if (dialog.isShowing) dialog.dismiss()
                SharedPrefManager.getInstance().ratingOrderIdSkipFlag = if(!orderID.isNullOrEmpty()) orderID.toLong() else 0L
            }
        }
    }

    fun performSelectionLogic(pos: Int, chipItem: Chip) {
        if(   binding.tvFeedbackError.visibility==View.VISIBLE)
            binding.tvFeedbackError.visibility = View.GONE

        if (currentRatingReasonList.isNotEmpty()) {
            currentRatingReasonList.get(pos).let {
                if (it.isSelected) {
                    it.isSelected = false
                    chipItem.setChipType(ChipType.UNSELECTED.value)
                    if (currentRatingReasonListSentToApi.contains(it))
                        currentRatingReasonListSentToApi.remove(it)
                } else {
                    it.isSelected = true
                    chipItem.setChipType(ChipType.SELECTED.value)
                    if (!currentRatingReasonListSentToApi.contains(it))
                        currentRatingReasonListSentToApi.add(it)
                }
            }
        }


        //   currentRatingReasonListSentToApi.clear()
        // currentRatingReasonListSentToApi.add(currentRatingReasonList.get(pos))
    }

    private fun deSelectChips(view: View) {
        feedbackCategory = view.tag.toString()
        binding.chipCustomer.setChipType(ChipType.UNSELECTED.value)
        binding.chipDiscount.setChipType(ChipType.UNSELECTED.value)
        binding.chipDeliveryTime.setChipType(ChipType.UNSELECTED.value)
        binding.chipMedicineQuality.setChipType(ChipType.UNSELECTED.value)
        binding.chipOrderExperience.setChipType(ChipType.UNSELECTED.value)
    }
}

enum class ChipType(val value: Int) {
    SELECTED(0), UNSELECTED(1)
}