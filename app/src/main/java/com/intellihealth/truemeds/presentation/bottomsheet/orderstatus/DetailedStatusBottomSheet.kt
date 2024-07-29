package com.intellihealth.truemeds.presentation.bottomsheet.orderstatus

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.intellihealth.salt.callbacks.DetailedTimelineCallback
import com.intellihealth.salt.models.BottomsheetHeaderModel
import com.intellihealth.salt.models.DetailedTimelineModel
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.BottomSheetCloseCallback
import com.intellihealth.truemeds.databinding.BottomsheetDetailedStatusBinding
import com.intellihealth.truemeds.presentation.callbacks.DetailTimeLineActionBtnBack

class DetailedStatusBottomSheet() : BottomSheetDialogFragment() {
    private lateinit var binding:BottomsheetDetailedStatusBinding
    private lateinit var bottomSheetHeaderModel: BottomsheetHeaderModel
    private lateinit var dialog: BottomSheetDialog
    private var detailedTimeLineDataList: List<DetailedTimelineModel>?=null
    private var detailTimeLineCallback: DetailTimeLineActionBtnBack?=null
    constructor(_detailedTimeLineDataList: List<DetailedTimelineModel>,_detailTimeLineCallback: DetailTimeLineActionBtnBack):this()
    {
        this.detailedTimeLineDataList = _detailedTimeLineDataList
        this.detailTimeLineCallback = _detailTimeLineCallback

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
            DataBindingUtil.inflate(inflater, R.layout.bottomsheet_detailed_status, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        clickEvent()
        super.onViewCreated(view, savedInstanceState)

    }

    private fun clickEvent() {
        binding.imageClose.setOnClickListener {
            dialog?.dismiss()
        }


        if(detailedTimeLineDataList!=null) {
            binding.detailedTimeLine.setDetailedTimelineData(detailedTimeLineDataList!!,
                object : DetailedTimelineCallback {
                    override fun getTimelineData(action: String) {
                        detailTimeLineCallback?.actionButtonClick(action)
                    }

                }
            )
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        dialog = BottomSheetDialog(requireContext(), theme)
        (dialog as BottomSheetDialog).behavior.state= BottomSheetBehavior.STATE_EXPANDED
        return dialog
    }

    override fun getTheme() = R.style.BottomSheetDialog




}