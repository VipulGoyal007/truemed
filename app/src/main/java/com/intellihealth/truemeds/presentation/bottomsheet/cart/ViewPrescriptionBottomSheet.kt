package com.intellihealth.truemeds.presentation.bottomsheet.cart

import android.app.Dialog
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.viewpager.widget.ViewPager
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.intellihealth.salt.models.BottomsheetHeaderModel
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.BottomsheetViewPrescriptionBinding
import com.intellihealth.truemeds.presentation.adapter.ProductImageViewPagerBSAdapter
import com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback


class ViewPrescriptionBottomSheet() : BottomSheet() {
    private lateinit var dialog: BottomSheetDialog
    private lateinit var binding: BottomsheetViewPrescriptionBinding
    private lateinit var bottomSheetHeaderModel: BottomsheetHeaderModel
    private var productImageViewPagerBSAdapter: ProductImageViewPagerBSAdapter? = null
    var position: Int=0
    var prescriptionList: List<String> = emptyList()
    var title:String=""
    var isFromPDPage:Boolean = false

    constructor(position: Int,prescriptionList: List<String>,title:String,isFromPDPage:Boolean = false): this() {
        this.position=position
        this.prescriptionList=prescriptionList
        this.title=title
        this.isFromPDPage=isFromPDPage
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.bottomsheet_view_prescription, container, false)
        if(prescriptionList.isNotEmpty()) {
            if (position > 0)
                binding.url = prescriptionList[position - 1]
            else
                binding.url = prescriptionList[position]
        }
        binding.position = position
        binding.list = prescriptionList
        binding.title = title
        binding.lifecycleOwner = viewLifecycleOwner
        binding.isFromPDPage = isFromPDPage
        setListener()
        setZoomViewPager()
        return binding.root
    }

    private fun setZoomViewPager() {
        activity?.let {
            productImageViewPagerBSAdapter =
                ProductImageViewPagerBSAdapter(activity, prescriptionList)
            binding.ivPrescription.adapter = productImageViewPagerBSAdapter
            binding.ivPrescription.currentItem = position
            binding.ivPrescription.setOnPageChangeListener(object : ViewPager.OnPageChangeListener {
                override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
                }

                override fun onPageSelected(position: Int) {
                    binding.position = position
                }

                override fun onPageScrollStateChanged(state: Int) {}

            })
        }
    }

    private fun setListener() {
        val prescriptionCallback = object: ViewPrescriptionCallback {
            override fun onDeleteImage(imageId: Long) {
                TODO("Not yet implemented")
            }

            override fun onViewPrescriptionClicked(position: Int, imageURL: String) {
                binding.url = imageURL
                binding.ivPrescription.currentItem = position
            }

            override fun onAddMoreClicked() {
            }

        }
        binding.callback = prescriptionCallback
        binding.ivClose.setOnClickListener {
            if (dialog.isShowing) dialog.dismiss()
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
      //  bottomSheetHeaderModel = BottomsheetHeaderModel(closeIcon = null, header = null, subHeader = null, icon = null, showIcon = false, showViewDragHandle = false, height = 90, bottomSheetState = 3)
        dialog = BottomSheetDialog(requireContext(), theme)
        (dialog).behavior.state= BottomSheetBehavior.STATE_EXPANDED
      /*  setUpBottomSheetBehaviour(
            dialog,
            true,
            bottomSheetHeaderModel.bottomSheetState,
            bottomSheetHeaderModel.height,
            bottomSheetHeaderModel
        )*/
        return dialog
    }

    override fun getTheme() = R.style.BottomSheetDialog
}