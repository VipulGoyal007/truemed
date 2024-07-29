package com.intellihealth.truemeds.presentation.fragment


import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.constants.DropDownState
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.salt.views.Toast
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.utils.ERRORS
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.databinding.FragmentOrdersBinding
import com.intellihealth.truemeds.domain.navigation.navigateToNonActiveOrderStatusActivity
import com.intellihealth.truemeds.domain.navigation.navigateToOrderStatusActivity
import com.intellihealth.truemeds.domain.navigation.navigateToOrderSummaryActivity
import com.intellihealth.truemeds.domain.navigation.navigateToSearchSuggestionActivity
import com.intellihealth.truemeds.presentation.activity.BaseActivity
import com.intellihealth.truemeds.presentation.bottomsheet.myorder.MyOrderBottomSheet
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel
import com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@AndroidEntryPoint
class MyOrdersFragment : Fragment(R.layout.fragment_orders) {

    private val binding by viewBinding(FragmentOrdersBinding::bind)
    private lateinit var context: Context
    private lateinit var myOrdersBottomSheet: MyOrderBottomSheet
    private lateinit var viewModel: OrdersTabViewModel
    var lastClickApplyCTA = 0L

    private var mLastClickTime = 0L
    private var mLocationLastClickTime = 0L

    private fun isSingleClick(): Boolean {
        val lastClickTime: Long = mLastClickTime
        val now = System.currentTimeMillis()
        this@MyOrdersFragment.mLastClickTime = now
        return now - lastClickTime >= HomeFragment.MIN_DELAY_MS
    }

    //  private lateinit var viewModelActivity: HomeViewModel

    // private lateinit var filterBottomSheet: FilterBottomSheet
    // private val viewModel by lazy { ViewModelProvider(this)[OrdersTabViewModel::class.java] }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        setupMobileSectionHeader()
        val argument1 = arguments?.getString("showHeaderMyOrder")
        if (argument1 == "hide") {
            binding.header.visibility = View.GONE
        } else {
            binding.header.visibility = View.VISIBLE
        }
        context = requireContext()
        binding.tmDropDownOrders.setLabel("All Orders")
        binding.tmDropDownPatient.setLabel("All Patients")


        setObservers()
        viewModel.isSentAllPatientIdToApi = true
        //viewModel.initViewModelData(context)

    }

    override fun onHiddenChanged(hidden: Boolean) {
        super.onHiddenChanged(hidden)
        Log.e("fragment_shown", "my_orders_fragment:::" + hidden.toString())
        if (!hidden) {
            viewModel.isBottomSheetClickable = true

            //perform patient list api calling here along with order listing api
            binding.swipeToRefresh.isRefreshing = false
            viewModel.getPatientDetails(context, true)

            //commented bcoz this is only calling orders listing api
            // viewModel.getOrdersListingData(context)
        }
    }


    fun initView() {
        viewModel = ViewModelProvider(requireActivity())[OrdersTabViewModel::class.java]
        // viewModelActivity = ViewModelProvider(requireActivity())[HomeViewModel::class.java]

        binding.viewModel = viewModel
        binding.lifecycleOwner = this


        //note:- Paging Logic
        binding.rvOrderList.also { rv ->

            rv.addOnScrollListener(object : RecyclerView.OnScrollListener() {
                override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                    super.onScrolled(recyclerView, dx, dy)

                    //this condition is added to stop pagination is case when api max page count is equal to current page count
                    if (viewModel.customerOrderPageCount >= viewModel.maxPageCount)
                        viewModel.hasMoreData = false


                    with(viewModel) {
                        if (myOrdersList.value.isNullOrEmpty()) return
                        if (!hasMoreData) return

                    }
                    val linearLayoutManager = recyclerView.layoutManager as LinearLayoutManager?

                    if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() == viewModel.myOrdersList.value?.size!! - 1) {
                        //  viewModel.showProgressBar.postValue(true)
                        viewModel.hasMoreData = false
                        viewModel.customerOrderPageCount += 1
                        viewModel.isClearPreviousList = false
                        viewModel.apiType = 3

                        viewModel.getOrdersListingData(context)

                    }

                }
            })

        }

        //initialising swipe refresh code
        binding.swipeToRefresh.setColorSchemeResources(
            R.color.colorPrimary,
            android.R.color.holo_green_dark,
            android.R.color.holo_orange_dark,
            android.R.color.holo_blue_dark
        )
        binding.swipeToRefresh.setOnRefreshListener {
            onSwipeRefresh()
        }
    }

    private fun onSwipeRefresh() {
        viewModel.getPatientDetails(context, true)
        lifecycleScope.launch {
            delay(1000)
            binding.swipeToRefresh.isRefreshing = false
        }


    }

    fun setObservers() {
        val loader = Dialog(requireActivity())
        HomeViewModel.reloadMyOrders.observe(viewLifecycleOwner) {
            if (it) {
                viewModel.initViewModelData(context)
            }
        }

        viewModel.isLoading.observe(viewLifecycleOwner) {
            if (it) enableLoadingView(loader)
            else disableLoadingView(loader)
        }
        Log.e("event_observer::", "runningbasic")
        viewModel.showMessage.observe(viewLifecycleOwner) {
//            val lastRecordedData =
//                com.intellihealth.truemeds.data.utils.isSingleClick(lastClickApplyCTA)
//            lastClickApplyCTA = lastRecordedData.second
//            if (!lastRecordedData.first) {
//                return@observe
//            }

            try {
                Log.e("event_observer::", "running")
                if (it.type.equals(MESSAGES.SEARCH_FOR_MEDICINES_CLICK)) {

                    /*startActivity(
                        Intent(context, SearchSuggestionActivity::class.java)
                            .putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "my_orders")
                            .putExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION, "add_medicine")
                                .addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                    )*/

                    navigateToSearchSuggestionActivity(
                        params = bundleOf(
                            BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "my_orders",
                            BundleConstants.BUNDLE_KEY_PAGE_SECTION to "add_medicine",
                        ),
                        flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                    )

                } else if (it.type.equals(MESSAGES.BOTTOM_SHEET_APPLY_CLICK2)) {
                    Log.e("apply_clicked", "yessss222activity")
                    Log.i("orderTypeValueDisplay", "" + viewModel.orderTypeValueDisplay)
                    if (viewModel.orderTypeValueDisplay == "All") {
                        binding.tmDropDownOrders.setLabel("All Orders")
                    } else {
                        binding.tmDropDownOrders.setLabel(viewModel.orderTypeValueDisplay)
                    }

                    binding.tmDropDownPatient.setLabel(viewModel.patientTypeValue)
                    if (!viewModel.patientTypeValue.equals("All Patients") && viewModel.selectedPatientListSentToApi.isNullOrEmpty()) {
                        Log.e("error_msg", "case2")
                        Toast().showCustomToastMessage(
                            context,
                            context.resources.getString(R.string.please_select_atleast_one_patient)
                        )
                    } else {

                        if (viewModel.orderTypeValue.equals("All Orders", true))
                            binding.tmDropDownOrders.setStateOpen(
                                DropDownState.CLOSED,
                                false
                            )
                        else
                            binding.tmDropDownOrders.setStateOpen(DropDownState.SELECTED)

                        if (viewModel.patientTypeValue.equals("All Patients", true))
                            binding.tmDropDownPatient.setStateOpen(
                                DropDownState.CLOSED,
                                false
                            )
                        else
                            binding.tmDropDownPatient.setStateOpen(DropDownState.SELECTED)

                        myOrdersBottomSheet.dismiss()
                    }

                } else if (it.type.equals(MESSAGES.SHOW_ATLEAST_ONE_PATIENT_SELECT_ERROR)) {
                    Log.e("error_msg", "case1")
                    Toast().showCustomToastMessage(
                        context,
                        context.resources.getString(R.string.please_select_atleast_one_patient)
                    )
                } else if (it.type.equals(MESSAGES.PULL_TO_REFRESH_CALLED)) {
                    viewModel.showShimmer.postValue(true)
                    viewModel.myOrdersList.postValue(mutableListOf())
                    //fragmentOrdersBinding.tmDropDownOrders.setStateOpen(DropDownState.CLOSED)
                    binding.tmDropDownPatient.setLabel(
                        viewModel.patientTypePullRefreshValue.value ?: ""
                    )

                    if (viewModel.patientTypePullRefreshValue.value.equals("All Patients", true))
                        binding.tmDropDownPatient.setStateOpen(
                            DropDownState.CLOSED,
                            false
                        )
                    else
                        binding.tmDropDownPatient.setStateOpen(DropDownState.SELECTED)

                } else if (it.type.equals(MESSAGES.SET_ORDER_TYPE_PATIENT_TYPE_VALUE)) {
                    //  fragmentOrdersBinding.tmDropDownOrders.setLabel(viewModel.orderTypeValue)
                    //   fragmentOrdersBinding.tmDropDownPatient.setLabel(viewModel.patientTypeValue)

                } else if (it.type.equals(MESSAGES.SET_PULL_TO_REFRESH_CALLBACK)) {
                    Log.e("pull_to_refresh", ":::called")
                    // myOrdersBottomSheet.setUpdatedList()

                } else if (it.type.equals(MESSAGES.ORDER_LIST_CLICK)) {
                    initializeBottomSheet()
                    myOrdersBottomSheet.isCancelable = true
                    if (!myOrdersBottomSheet.isVisible) {
                        myOrdersBottomSheet.show(
                            requireActivity().supportFragmentManager,
                            "SearchReOrderBottomsheet"
                        )

                    }

                } else if (it.type.equals(MESSAGES.PATIENT_LIST_CLICK)) {
                    initializeBottomSheet()
                    myOrdersBottomSheet.isCancelable = true
                    if (!myOrdersBottomSheet.isVisible) {
                        myOrdersBottomSheet.show(
                            requireActivity().supportFragmentManager,
                            "SearchReOrderBottomsheet"
                        )
                        //   viewModel.isBottomSheetClickable=true
                    }

                } else if (it.type.equals(MESSAGES.ORDER_LIST_ITEM_CLICK)) {
                    when {
                        viewModel.myOrdersList.value?.get(viewModel.orderListCurrentItemClickedPos)?.cartActionType.equals(
                            "ORDER_SUMMARY",
                            true
                        ) -> {
                            navigateToNonActiveOrderStatusActivity(
                                params = bundleOf(
                                    BundleConstants.ORDER_ID to
                                            viewModel.myOrdersList.value?.get(viewModel.orderListCurrentItemClickedPos)?.orderId,
                                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "my_orders"
                                )
                            )
                        }

                        viewModel.myOrdersList.value?.get(viewModel.orderListCurrentItemClickedPos)?.cartActionType.equals(
                            "TRACKORDER",
                            true
                        ) -> {
                            navigateToOrderStatusActivity(
                                params = bundleOf(
                                    BundleConstants.ORDER_ID to viewModel.myOrdersList.value?.get(viewModel.orderListCurrentItemClickedPos)?.orderId,
                                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "my_orders"
                                )
                            )
                        }
                    }
                } else if (it.type.equals(MESSAGES.ORDER_LIST_ITEM_BUTTON_CLICK)) {

                    when {
                        viewModel.myOrdersList.value?.get(viewModel.orderListCurrentItemClickedPos)?.actionButtonType.equals(
                            "REORDER",
                            true
                        ) -> {
                            if (isSingleClick()) {
                                viewModel.loaderValue.postValue(true)
                                val patientArray = arrayListOf<Long?>()
                                patientArray.add(viewModel.myOrdersList.value?.get(viewModel.orderListCurrentItemClickedPos)?.mxEvents?.patientId)
                                val orderId =
                                    viewModel.myOrdersList.value?.get(viewModel.orderListCurrentItemClickedPos)?.orderId
                                viewModel.getReorder(
                                    orderId,
                                    SharedPrefManager.getInstance().loggedInUserId,
                                    patientArray,
                                    "A",
                                    true,
                                    true,
                                    SharedPrefManager.getInstance().srcType.toInt(),
                                    true,
                                    if (SharedPrefManager.getInstance().algoSpecificVariantId < 0) null else SharedPrefManager.getInstance().algoSpecificVariantId
                                )
                            }
                        }

                        viewModel.myOrdersList.value?.get(viewModel.orderListCurrentItemClickedPos)?.actionButtonType.equals(
                            "TRACKORDER",
                            true
                        ) ||
                                viewModel.myOrdersList.value?.get(viewModel.orderListCurrentItemClickedPos)?.actionButtonType.equals(
                                    "PAYNOW",
                                    true
                                )
                        -> {
                            navigateToOrderStatusActivity(
                                params = bundleOf(
                                    BundleConstants.ORDER_ID to viewModel.myOrdersList.value?.get(viewModel.orderListCurrentItemClickedPos)?.orderId,
                                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "my_orders"
                                )
                            )
                        }

                    }
                } else if (it.type.equals(MESSAGES.ORDER_LIST_ITEM_MORE_CLICK)) {
                    if (viewModel.myOrdersList.value?.get(viewModel.orderListCurrentItemClickedPos)?.cartActionType.equals(
                            "ORDER_SUMMARY",
                            true
                        )
                    ) {
                        navigateToNonActiveOrderStatusActivity(
                            params = bundleOf(
                                BundleConstants.ORDER_ID to
                                viewModel.myOrdersList.value?.get(viewModel.orderListCurrentItemClickedPos)?.orderId,
                                BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "my_orders"
                            )
                        )

                    } else {
                        navigateToOrderStatusActivity(
                            params = bundleOf(
                                BundleConstants.ORDER_ID to viewModel.myOrdersList.value?.get(viewModel.orderListCurrentItemClickedPos)?.orderId,
                                BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "my_orders"
                            )
                        )
                    }


                } else if (it.type.equals(MESSAGES.REQUEST_MY_ORDER_LIST_FOCUS_TO_TOP)) {
                    binding.rvOrderList.scrollToPosition(0)

                }
            } catch (_: Exception) {
            }

        }

        viewModel.eventShowError.observe(viewLifecycleOwner, EventObserver {
            if (it != null) {
                if (it.equals(ERRORS.NO_ORDERS_FOUND)) {
                } else if (it != null && it.equals(ERRORS.NO_NETWORK)) {
                    if (viewModel.apiType == 3) {
                        //  viewModel.showProgressBar.postValue(false)
                        viewModel.customerOrderPageCount -= 1
                    }

                    (activity as BaseActivity).showDialogBox(
                        PopUpType.INTERNET_FAILURE,
                        object : PopUpDialogCallback {
                            override fun onActionButtonClicked() {
                                // apiType=1 is for initial api calling which is done in the beginning
                                if (viewModel.apiType == 1)
                                    viewModel.initViewModelData(context)
                                // apiType=2 is for apply filter click api calling
                                else if (viewModel.apiType == 2)
                                    viewModel.getOrdersListingData(context)
                                // apiType=3 is for pagination api calling
                                else if (viewModel.apiType == 3) {
                                    //  viewModel.showProgressBar.postValue(true)
                                    viewModel.customerOrderPageCount += 1
                                    viewModel.getOrdersListingData(context)
                                }

                            }

                            override fun onCloseButtonClicked() {

                            }
                        },
                        true
                    )
                }
            }
        })
        viewModel.showShimmerLiveData.observe(viewLifecycleOwner) {
            if (it) {
                binding.shimmerViewContainer.startShimmerAnimation()
            } else {
                binding.shimmerViewContainer.stopShimmerAnimation()
            }
        }
        viewModel.eventLaunchOrderSummary.observe(viewLifecycleOwner) {
            viewModel.loaderValue.postValue(false)
            navigateToOrderSummaryActivity(
                params = bundleOf(
                    "isOrderSummary" to true,
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "my_orders",
                    BundleConstants.BUNDLE_KEY_ORDER_PAGE_SECTION to "my_orders",
                    BundleConstants.BUNDLE_KEY_REORDER_BUTTON_CLICKED to
                            BundleConstants.BUNDLE_KEY_REORDER_BUTTON_CLICKED,
                    BundleConstants.BUNDLE_KEY_ORDER_IS_DELIVERED_OR_CANCELLED to
                            if (viewModel.myOrdersList.value?.get(viewModel.orderListCurrentItemClickedPos)?.statuses?.first()?.statusName?.contains(
                                    "cancelled",
                                    true
                                ) == true
                            ) "cancelled" else "delivered"
                ),
                flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            )
        }

    }

    private fun initializeBottomSheet() {
        myOrdersBottomSheet =
            MyOrderBottomSheet(viewModel.listType.value!!, viewModel.showDropDownPatient.value!!)
    }

    fun disableLoadingView(dialog: Dialog) {
        dialog.dismiss()
    }

    fun enableLoadingView(dialog: Dialog?) {
        dialog?.let {
            with(it) {
                setContentView(R.layout.dialog_progressbar)
                setCancelable(false)
                window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                window?.setDimAmount(0f)
                show()
            }
        }
    }

    /* private fun initializeFilterBottomSheet() {
         filterBottomSheet = FilterBottomSheet(viewModel.filterlistType.value!!)
     }
 */
    private fun setupMobileSectionHeader() {
        binding.header.setUpMobileSectionHeadersData(
            MobileSectionHeadersModel(
                "My Order", "", "", "", 0,
                null, null
            )
        )
    }
}