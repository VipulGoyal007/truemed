package com.intellihealth.truemeds.presentation.bottomsheet.home

import android.app.Dialog
import android.os.Bundle
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.intellihealth.salt.models.BottomsheetHeaderModel
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.home.HomeReorderBottomSheetModel
import com.intellihealth.truemeds.databinding.BottomsheetReorderBinding
import com.intellihealth.truemeds.presentation.adapter.ReorderBottomSheetAdapter
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxReorderSheetViewed
import com.intellihealth.truemeds.presentation.fragment.HomeFragment
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel

class ReorderBottomSheet() : BottomSheet() {
    private lateinit var binding: BottomsheetReorderBinding
    private lateinit var bottomSheetHeaderModel: BottomsheetHeaderModel
    private lateinit var dialog: BottomSheetDialog
    private var header: Boolean = true
    private var mLastClickTime = 0L
    private var homeReorderBottomSheetModel: HomeReorderBottomSheetModel?=null
    private var homeViewModel: HomeViewModel?=null

    constructor(homeReorderBottomSheetModel: HomeReorderBottomSheetModel?,
                homeViewModel: HomeViewModel?) : this(){
        this.homeReorderBottomSheetModel = homeReorderBottomSheetModel
        this.homeViewModel = homeViewModel
    }

    private fun isSingleClick(): Boolean {
        val lastClickTime: Long = mLastClickTime
        val now = System.currentTimeMillis()
        this@ReorderBottomSheet.mLastClickTime = now
        return now - lastClickTime >= HomeFragment.MIN_DELAY_MS
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
            DataBindingUtil.inflate(inflater, R.layout.bottomsheet_reorder, container, false)
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
        setUpBottomSheetBehaviour(
            dialog,
            true,
            bottomSheetHeaderModel.bottomSheetState,
            bottomSheetHeaderModel.height,
            bottomSheetHeaderModel
        )
        return dialog
    }

    fun openBottomSheet(header: Boolean, height: Int, bottomSheetState: Int) {
        this.header=header
        bottomSheetHeaderModel = BottomsheetHeaderModel(
            "Vijay Chopra", "Placed on 21 Jan 2023",
            R.drawable.ic_default_profile, true,
            R.drawable.ic_close, header, height,
            bottomSheetState
        )
    }

    private fun setUpData() {

        try {
            val reorderBottomSheetAdapter =
                ReorderBottomSheetAdapter(requireContext(), homeReorderBottomSheetModel)

            binding.reorderData = homeReorderBottomSheetModel

            binding.rvReorderMedicineList.apply {
                adapter = reorderBottomSheetAdapter
                layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

            }

            if (homeViewModel?.reorderResponseCustomerOrdersList?.responseData != null) {
                val allCustomerOrders = homeViewModel?.reorderResponseCustomerOrdersList?.responseData!!
                val data = allCustomerOrders.ordersList[homeViewModel?.reOrderPosition?:0]
                var mxReorderSheetViewed = MxReorderSheetViewed()
                mxReorderSheetViewed.orderId = data.orderId.toString()
                mxReorderSheetViewed.clickedOnPage = "homepage"
                mxReorderSheetViewed.noOfItem = homeReorderBottomSheetModel?.list?.size?:0
                mxReorderSheetViewed.patientName = data.orderForPatientName
                //homeViewModel.sendReorderSheetViewedEvent(mxReorderSheetViewed)
            }
        } catch (_: Exception) {
        }
    }

    private fun clickListeners(){
        binding.imageClose.setOnClickListener {
            dismiss()
        }
        binding.tvReorder.setOnClickListener {

            /*homeViewModel.getReorder(
                SharedPrefManager.getInstance().incompleteOrderId,//
                SharedPrefManager.getInstance().loggedInUserId,
                arrayListOf(0L),//
                "5",
                true,
                true,
                SharedPrefManager.getInstance().srcType.toInt(),
                true,
                if (SharedPrefManager.getInstance().algoSpecificVariantId < 0) null else SharedPrefManager.getInstance().algoSpecificVariantId
            )*/

            //below line commented bcoz this list only contains 5 items
           // homeViewModel.fetchAllOrdersOfCustomers.value?.responseData?.let {

            //below line is added as the reorderResponseCustomerOrdersList contains entire data of reorder list
                homeViewModel?.reorderResponseCustomerOrdersList?.responseData?.let {
                if (isSingleClick()) {
                    try {
                        val data = it.ordersList[ homeViewModel?.reOrderPosition?:0]

                        var patientArray = arrayListOf<Long?>()
                        data.mxEvents.patientId?.let { pId ->
                            patientArray.add(pId)
                        }
                        binding.isLoading = true
                        isCancelable = false // Disabled outside click
                        dialog.setOnKeyListener { _, keyCode, _ -> // Disabled back press event
                            keyCode == KeyEvent.KEYCODE_BACK
                        }
                        homeViewModel?.getReorder(
                            data.orderId,
                            SharedPrefManager.getInstance().loggedInUserId,
                            patientArray,
                            "",
                            true,
                            true,
                            SharedPrefManager.getInstance().srcType.toInt(),
                            true,
                            if (SharedPrefManager.getInstance().algoSpecificVariantId < 0) null else SharedPrefManager.getInstance().algoSpecificVariantId,
                            "homepage",
                            "reorder_sheet"
                        )
                    } catch (_: Exception) {
                    }
                }
            }
        }
    }
    override fun getTheme() = R.style.BottomSheetDialog


}