package com.intellihealth.truemeds.presentation.bottomsheet.cart

import android.app.Dialog
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.viewpager.widget.ViewPager
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.intellihealth.salt.models.BottomsheetHeaderModel
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo
import com.intellihealth.truemeds.databinding.BottomsheetRxPrescriptionBinding
import com.intellihealth.truemeds.databinding.BottomsheetViewPrescriptionBinding
import com.intellihealth.truemeds.presentation.adapter.ProductImageViewPagerBSAdapter
import com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback
import com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel


class RxPrescriptionBottomSheet() : BottomSheet() {
    private lateinit var dialog: BottomSheetDialog
    private lateinit var binding: BottomsheetRxPrescriptionBinding
    private lateinit var bottomSheetHeaderModel: BottomsheetHeaderModel
    private var productImageViewPagerBSAdapter: ProductImageViewPagerBSAdapter? = null
    var position: Int = 0
    private var prescriptionList: List<OrderRxInfo> = emptyList()

    constructor(position: Int, prescriptionList: List<OrderRxInfo>) : this() {
        this.position = position
        this.prescriptionList = prescriptionList
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(
                inflater,
                R.layout.bottomsheet_rx_prescription,
                container,
                false
            )
        if (prescriptionList.isNotEmpty()) {
            binding.url = prescriptionList[position].imageUrl
        } else {
            binding.url = ""
        }
        binding.position = position
        val list = arrayListOf<OrderRxInfo>()
        prescriptionList.forEach {
            if (!it.imageUrl.isNullOrEmpty()) {
                list.add(it)
            }
        }
        binding.list = list
        binding.lifecycleOwner = viewLifecycleOwner
        setListener()
        setZoomViewPager()
        return binding.root
    }

    private fun setZoomViewPager() {
        activity?.let {
            val list = arrayListOf<String>()
            prescriptionList.forEach {
                if (!it.imageUrl.isNullOrEmpty()) {
                    list.add(it.imageUrl!!)
                }
            }
            productImageViewPagerBSAdapter =
                ProductImageViewPagerBSAdapter(activity, list)
            binding.ivPrescription.adapter = productImageViewPagerBSAdapter
            binding.ivPrescription.currentItem = position
            binding.ivPrescription.setOnPageChangeListener(object : ViewPager.OnPageChangeListener {
                override fun onPageScrolled(
                    position: Int,
                    positionOffset: Float,
                    positionOffsetPixels: Int
                ) {
                }

                override fun onPageSelected(position: Int) {
                    binding.position = position
                }

                override fun onPageScrollStateChanged(state: Int) {}

            })
        }
    }

    private fun setListener() {
        val prescriptionCallback = object : ViewPrescriptionCallback {
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
        bottomSheetHeaderModel = BottomsheetHeaderModel(
            closeIcon = null,
            header = null,
            subHeader = null,
            icon = null,
            showIcon = false,
            showViewDragHandle = true,
            height = 90,
            bottomSheetState = 3
        )
        dialog = BottomSheetDialog(requireContext(), theme)
        setUpBottomSheetBehaviour(
            dialog,
            true,
            bottomSheetHeaderModel.bottomSheetState,
            bottomSheetHeaderModel.height,
            bottomSheetHeaderModel
        )
        return dialog
    }

    override fun getTheme() = R.style.BottomSheetDialog
}