package com.intellihealth.truemeds.presentation.viewmodel

import android.content.Context
import android.util.Log
import android.view.View
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.intellihealth.salt.models.BillDetailsModel
import com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.orderflow.OrderTypeResponse
import com.intellihealth.truemeds.data.model.orderflow.ReorderStatusData
import com.intellihealth.truemeds.data.model.user.GetAllPatientResponse
import com.intellihealth.truemeds.data.utils.ERRORS
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.OrderFragmentData
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.domain.usecase.HomePageUseCase
import com.intellihealth.truemeds.domain.usecase.ManagePatientUseCase
import com.intellihealth.truemeds.domain.usecase.ReorderUseCase
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OrdersTabViewModel @Inject constructor(
    private val homePageUseCase: HomePageUseCase,
//    private val orderFlowUseCase: OrderFlowUseCase,
    private val managePatientUseCase: ManagePatientUseCase,
//    private val localDbUseCase: LocalDbUseCase,
    private val reorderUseCase: ReorderUseCase
) :
    BaseViewModel(),
    DefaultLifecycleObserver {

    private var errorType: MutableLiveData<ERRORS> = MutableLiveData(ERRORS.NO_ERROR)

    var isLoggedIn = MutableLiveData(false)
    // var patientListResponse: MutableLiveData<GetAllPatientResponse?> = MutableLiveData()

    private val showError = MutableLiveData<Event<ERRORS>>()
    val eventShowError: LiveData<Event<ERRORS>> get() = showError
    val myOrdersList: MutableLiveData<MutableList<AllCustomersOrdersResponseModel.ResponseData.Orders?>> =
        MutableLiveData(
            mutableListOf()
        )
    var showNoOrdersView = MutableLiveData<Boolean>(false)
    var showMyOrdersListView = MutableLiveData<Boolean>(false)
    var showDropDownPatient = MutableLiveData<Boolean>(false)
    var showShimmer = MutableLiveData<Boolean>(false)
    val showShimmerLiveData: LiveData<Boolean> get() = showShimmer
    var listType = MutableLiveData<String>("orders")

    var orderTypePreviousPos = 0
    var orderTypeActualSelectedPos = 0

    var ordersBottomSheetListTemp: MutableLiveData<MutableList<OrderTypeResponse.OrderType?>> =
        MutableLiveData(mutableListOf())

    var patientsBottomSheetListTemp: MutableLiveData<MutableList<GetAllPatientResponse.Patient?>> =
        MutableLiveData(mutableListOf())
    //  var patientsBottomSheetListPullToRefresh: MutableList<GetAllPatientResponse.Patient?> = mutableListOf()

    var patientsSelectedListTemp: MutableList<Int> = mutableListOf()
    var orderTypeValue: String = ""
    var orderTypeValueDisplay: String = "All Orders"
    var patientTypeValue: String = ""
    var patientTypePullRefreshValue: MutableLiveData<String> = MutableLiveData("")
    val showMessage = MutableLiveData(OrderFragmentData(MESSAGES.NO_MESSAGE))

    var selectedOrderIdsSentToApi: String = "0"
    var maxPageCount: Int = 1
    var orderListCurrentItemClickedPos: Int = -1
    var selectedPatientListSentToApi: MutableList<Long> = mutableListOf()
    var customerOrderPageCount = 1

    //private lateinit var context: Context
    var apiType: Int = 0
    var hasMoreData = true
    var isClearPreviousList = true
    var billDetails = BillDetailsModel()

    /*private val launchOrderSummary = MutableLiveData<Event<Any>>()
    val eventLaunchOrderSummary: LiveData<Event<Any>> get() = launchOrderSummary
    private fun launchOrderSummary() = launchOrderSummary.postValue(Event(Any()))*/
//    val _isLoading = MutableLiveData(false)
    val isLoading: LiveData<Boolean> get() = loaderValue
    var isBottomSheetClickable: Boolean = true
    var isPatientListAllselected = true
    var isSentAllPatientIdToApi: Boolean = true
    var mxInternalErrorOccurred = MxInternalErrorOccurred()
    fun searchForMedicinesButtonClick() {

        showMessage.postValue(OrderFragmentData(MESSAGES.SEARCH_FOR_MEDICINES_CLICK))
    }

    fun reOrder(): ReorderStatusData {
        return orderFlowUseCase.getReorderData()
    }

    fun setRadioOrderClicked(position: Int) {
        ordersBottomSheetListTemp.value!!.get(orderTypePreviousPos)!!.isSelected = false
        ordersBottomSheetListTemp.value!!.get(position)!!.isSelected = true
        orderTypePreviousPos = position
        ordersBottomSheetListTemp.postValue(ordersBottomSheetListTemp.value!!)
    }

    fun getReorder(
        orderId: Long?,
        customerId: String?,
        patientListDto: ArrayList<Long?>?,
        variant: String?,
        checkAutoConfirmEligibility: Boolean,//true
        newAlgo: Boolean,
        serialId: Int?,
        reOrderMedCheck: Boolean,
        variantId: Long?
    ) = viewModelScope.launch(Dispatchers.IO) {
        reorderUseCase.reOrder(
            mxInternalErrorOccurred, orderId,
            customerId,
            patientListDto,
            variant,
            checkAutoConfirmEligibility,
            newAlgo,
            serialId,
            reOrderMedCheck,
            variantId
        )?.let { bannerResponse ->
            SharedPrefManager.getInstance()
                .setIsReOder(bannerResponse?.responseData?.isReOrder ?: false)
            if (bannerResponse?.responseData?.orderId != null) {
                /*if (SharedPrefManager.getInstance().incompleteOrderId > 0) {
                    orderFlowUseCase.discardOrder(
                        SharedPrefManager.getInstance().incompleteOrderId,
                        SharedPrefManager.getInstance().loggedInUserId.toLong()
                    )
                }*/
                localDbUseCase.clearCart()
                localDbUseCase.clearCrossSellingProducts()
                SharedPrefManager.getInstance().incompleteOrderId =
                    bannerResponse?.responseData?.orderId!!

                getMedicineOrderDetailsList(
                    mxInternalErrorOccurred,
                    bannerResponse?.responseData?.orderId!!,
                    true
                )

//                launchOrderSummary()
//                _isLoading.postValue(false)
            }
        }.run { /*loaderValue.postValue(false)*/ }
    }


    fun setCheckboxPatientClicked(position: Int) {
        if (position == 0) {
            var tempValue: Int = 0
            if (patientsBottomSheetListTemp.value!!.get(position)!!.isSelected == 1 || patientsBottomSheetListTemp.value!!.get(
                    position
                )!!.isSelected == 2
            ) {
                isPatientListAllselected = false
                tempValue = 0
            } else {
                isPatientListAllselected = true
                tempValue = 2
            }

            patientsBottomSheetListTemp.value!!.forEach { it!!.isSelected = tempValue }

        } else {
            if (patientsBottomSheetListTemp.value!!.get(position)!!.isSelected == 0) {
                patientsBottomSheetListTemp.value!!.get(position)!!.isSelected = 2
                settingAllLogic()

            } else {
                patientsBottomSheetListTemp.value!!.get(position)!!.isSelected = 0
                settingAllLogic()
            }
        }
        patientsBottomSheetListTemp.postValue(patientsBottomSheetListTemp.value!!)
    }

    fun settingAllLogic() {
        var tempValue = 0
        var atleastOne = false
        isPatientListAllselected = false

        for (i in 1..patientsBottomSheetListTemp.value!!.size - 1) {
            if (i == 1)
                tempValue = patientsBottomSheetListTemp.value!!.get(i)!!.isSelected

            patientsBottomSheetListTemp.value!!.get(i).let {
                if (it!!.isSelected == 0 && tempValue != 1) {
                    tempValue = 0

                } else if (it!!.isSelected == 2 && tempValue != 2) {
                    isPatientListAllselected = true
                    tempValue = 1
                } else if (it!!.isSelected == 2) {
                    isPatientListAllselected = true
                    atleastOne = true
                }
            }
        }

        if (atleastOne && tempValue == 0)
            tempValue = 1



        patientsBottomSheetListTemp.value!!.get(0)!!.isSelected = tempValue
    }

    fun orderListClick() {

        //this code is commented bcoz it disables the click if bottomsheet is dismissed before 1 sec
        if (isBottomSheetClickable) {
            //disable bottom sheet click for 1 second
            isBottomSheetClickable = false
            setListData()
            listType.value = "orders"
            showMessage.postValue(OrderFragmentData(MESSAGES.ORDER_LIST_CLICK))
            //  isBottomSheetClickable = true

        }
    }

    fun patientListClick() {

        //this code is commented bcoz it disables the click if bottomsheet is dismissed before 1 sec
        if (isBottomSheetClickable) {
            //disable bottom sheet click for 1 second
            isBottomSheetClickable = false
            setListData()
            listType.value = "patients"
            showMessage.postValue(OrderFragmentData(MESSAGES.PATIENT_LIST_CLICK))
            //   isBottomSheetClickable = true


        }
    }

    fun setListData() {
        for (i in 0..ordersBottomSheetListTemp.value!!.size - 1) {
            if (i == orderTypeActualSelectedPos) {
                ordersBottomSheetListTemp.value!!.get(i)!!.isSelected = true
                orderTypePreviousPos = orderTypeActualSelectedPos
            } else {
                ordersBottomSheetListTemp.value!!.get(i)!!.isSelected = false
            }
        }
        ordersBottomSheetListTemp.postValue(ordersBottomSheetListTemp.value)
        for (i in 0..patientsBottomSheetListTemp.value!!.size - 1) {

            patientsBottomSheetListTemp.value!!.get(i)!!.isSelected =
                patientsSelectedListTemp.get(i)!!
        }

    }

    fun orderListItemClick(position: Int) {
        orderListCurrentItemClickedPos = position
        showMessage.postValue(OrderFragmentData(MESSAGES.ORDER_LIST_ITEM_CLICK))
    }

    fun orderListItemButtonClick(position: Int) {
        orderListCurrentItemClickedPos = position
        showMessage.postValue(OrderFragmentData(MESSAGES.ORDER_LIST_ITEM_BUTTON_CLICK))
    }


    fun orderListItemMoreClick(position: Int) {
        orderListCurrentItemClickedPos = position
        showMessage.postValue(OrderFragmentData(MESSAGES.ORDER_LIST_ITEM_MORE_CLICK))
    }

    fun bottomSheetClearClick() {
        try {
            patientsBottomSheetListTemp.value!!.forEach { it!!.isSelected = 2 }
            ordersBottomSheetListTemp.value!!.forEach { it!!.isSelected = false }
            if (!ordersBottomSheetListTemp.value.isNullOrEmpty()) {
                ordersBottomSheetListTemp.value!![0]?.isSelected = true
            }
            orderTypePreviousPos = 0

            patientsBottomSheetListTemp.postValue(patientsBottomSheetListTemp.value!!)
            ordersBottomSheetListTemp.postValue(ordersBottomSheetListTemp.value!!)
            patientTypeValue = "All Patients"
            isPatientListAllselected = true
        } catch (_: Exception) {
        }
    }

    fun bottomSheetApplyClick(view: View) {
        isBottomSheetClickable = true
        if (isPatientListAllselected) {
            orderTypeActualSelectedPos = orderTypePreviousPos

            patientsSelectedListTemp.clear()
            var tempPatientSelectedCount = 0
            patientTypeValue = ""

            selectedPatientListSentToApi.clear()
            for (i in 0..patientsBottomSheetListTemp.value!!.size - 1) {

                patientsBottomSheetListTemp.value!!.get(i).let {
                    if (i == 0 && (it!!.isSelected == 2)) {
                        isSentAllPatientIdToApi = true
                        patientTypeValue = "All Patients"
                    } else if (!patientTypeValue.equals("All Patients") && i > 0 && (it!!.isSelected == 2)) {
                        isSentAllPatientIdToApi = false
                        tempPatientSelectedCount = tempPatientSelectedCount + 1
                        patientTypeValue = "Patients(" + tempPatientSelectedCount + ")"
                        //   selectedPatientListSentToApi.add(it!!.patientId)

                    }

                    if (i > 0 && (it!!.isSelected == 2)) {
                        selectedPatientListSentToApi.add(it!!.patientId)
                    }

                    patientsSelectedListTemp.add(it!!.isSelected)


                }

            }

            try {
                if (!ordersBottomSheetListTemp.value.isNullOrEmpty()) {
                    orderTypeValue =
                        ordersBottomSheetListTemp.value!![orderTypeActualSelectedPos]?.statusName!!
                    orderTypeValueDisplay =
                        ordersBottomSheetListTemp.value!![orderTypeActualSelectedPos]?.displayName!!
                    selectedOrderIdsSentToApi =
                        ordersBottomSheetListTemp.value!![orderTypeActualSelectedPos]?.statusIds!!
                }
            } catch (_: Exception) {
            }

            showMessage.postValue(OrderFragmentData(MESSAGES.BOTTOM_SHEET_APPLY_CLICK2))

            if (patientTypeValue.equals("All Patients") || (!selectedPatientListSentToApi.isNullOrEmpty() && selectedPatientListSentToApi.size > 0)) {
                myOrdersList.value = mutableListOf()
                showShimmer.value = true
                showMyOrdersListView.value = false
                showNoOrdersView.value = false
                customerOrderPageCount = 1
                isClearPreviousList = true
                apiType = 2
                hasMoreData = true

                getOrdersListingData(view.context)
            }
        } else {
            showMessage.postValue(OrderFragmentData(MESSAGES.SHOW_ATLEAST_ONE_PATIENT_SELECT_ERROR))
        }

    }

    fun getPatientDetails(
        context: Context,
        isConsiderExistingPatientListSelected: Boolean = false
    ) {
        if (isNetworkAvailable(context)) {
            if (isConsiderExistingPatientListSelected) {
                patientsBottomSheetListTemp.value!!.clear()
                showShimmer.postValue(true)
                myOrdersList.postValue(mutableListOf())
                showMyOrdersListView.postValue(false)

                showNoOrdersView.postValue(false)

                // patientsBottomSheetListTemp.postValue(patientsBottomSheetListTemp.value!!)
            }
            viewModelScope.launch(IO) {
                val response = managePatientUseCase.getAllPatients(
                    true,

                    SharedPrefManager.getInstance().loggedInUserId.toLong()
                )
                response?.PatientList?.let { patientList ->


                    patientsBottomSheetListTemp.value!!.add(
                        GetAllPatientResponse.Patient(
                            0, "All",
                            "", "", "", 0, "",
                            0, "", false, "", "", "",2
                        )
                    )
                    patientList.forEach {
                        it.run {
                            patientsBottomSheetListTemp.value!!.add(
                                GetAllPatientResponse.Patient(
                                    patientId, patientName, "", "", "", gender, genderName,
                                    relationId, relationName, false, "", "", "",2
                                )
                            )
                        }

                    }


                    //implement pull to refresh case  here
                    if (isConsiderExistingPatientListSelected) {


                        var isAllDataSelected: Int = 2
                        var isAtleastOnceSelected = false
                        var isAtleastOnceUnSelected = false
                        var tempPatientSelectedCount = 0
                        for (i in 0..patientsBottomSheetListTemp.value!!.size - 1) {
                            if (i > 0) {

                                if (selectedPatientListSentToApi.contains(
                                        patientsBottomSheetListTemp.value!!.get(
                                            i
                                        )?.patientId
                                    )
                                ) {
                                    tempPatientSelectedCount = tempPatientSelectedCount + 1
                                    isAtleastOnceSelected = true
                                    patientsBottomSheetListTemp.value!!.get(i)?.isSelected = 2
                                    if (isAllDataSelected != 2)
                                        isAllDataSelected = 1
                                } else {
                                    isAtleastOnceUnSelected = true
                                    patientsBottomSheetListTemp.value!!.get(i)?.isSelected = 0
                                    if (isAllDataSelected != 1)
                                        isAllDataSelected = 0

                                }
                            }
                        }

                        if (isAtleastOnceSelected && isAtleastOnceUnSelected)
                            isAllDataSelected = 1


                        // patientTypePullRefreshValue.value = ""
                        patientTypePullRefreshValue.postValue("")

                        //this case is added for single item in patient list
                        if (patientList.size == 1) {
                            isAllDataSelected = 2
                            isSentAllPatientIdToApi = true
                            isPatientListAllselected = true
                            for (i in 0..patientsBottomSheetListTemp.value!!.size - 1) {
                                patientsBottomSheetListTemp.value!!.get(i)?.isSelected = 2
                            }
                        } else if (isAllDataSelected == 2) {
                            isSentAllPatientIdToApi = true
                            // patientTypePullRefreshValue.value = "All Patients"
                            patientTypePullRefreshValue.postValue("All Patients")
                        } else if (isAllDataSelected == 1) {
                            isSentAllPatientIdToApi = false
                            // patientTypePullRefreshValue.value = "Patients(" + tempPatientSelectedCount + ")"
                            patientTypePullRefreshValue.postValue("Patients(" + tempPatientSelectedCount + ")")
                        }
                        patientsBottomSheetListTemp.value!!.get(0)?.isSelected = isAllDataSelected
                        val updatedPatientList = patientsBottomSheetListTemp.value

                        updatedPatientList?.let {
                            //commented for now
                            //   patientsBottomSheetListTemp.value = updatedPatientList!!
                            patientsBottomSheetListTemp.postValue(updatedPatientList!!)
                        }

                        showMessage.postValue(OrderFragmentData(MESSAGES.PULL_TO_REFRESH_CALLED))

                        // showMessage.postValue(OrderFragmentData(MESSAGES.SET_PULL_TO_REFRESH_CALLBACK))
                        patientsSelectedListTemp.clear()
                        selectedPatientListSentToApi.clear()


                    }



                    patientsBottomSheetListTemp.value!!.forEach {

                        patientsSelectedListTemp.add(it!!.isSelected)
                        if (it!!.patientId != 0L && it!!.isSelected == 2)
                            selectedPatientListSentToApi.add(it!!.patientId)
                    }

                    //implement pull to refresh case and call my orders listing api again
                    if (isConsiderExistingPatientListSelected) {

                        //calling my orders listing api again in pull to refresh case
                        apiType = 2
                        customerOrderPageCount = 1
                        isClearPreviousList = true
                        hasMoreData = true
                        getOrdersListingData(context)
                    }

                    when {
                        !patientsBottomSheetListTemp.value.isNullOrEmpty() -> {
                            //  showDropDownPatient.value = patientList.size > 1
                            showDropDownPatient.postValue(patientList.size > 1)

                            patientTypeValue = "All Patients"
                            //  showMessage.postValue(OrderFragmentData(MESSAGES.SET_ORDER_TYPE_PATIENT_TYPE_VALUE))


                        }


                    }


                }
                //this line is not required here bcoz this line hide the shimmer after patient list api call
                //   showShimmer.postValue(false)
            }
        } else {
            showError.postValue(Event(ERRORS.NO_NETWORK))
        }
    }

    fun initViewModelData(mContext: Context) {
        //context = mContext
        apiType = 1
        if (isNetworkAvailable(mContext)) {
            //clearing all lists
            ordersBottomSheetListTemp.value?.clear()
            patientsBottomSheetListTemp.value?.clear()


            //setting orders bottom sheet listing from database
            viewModelScope.launch(Dispatchers.IO) {
                var dbResponseData = localDbUseCase.getOrderFilterList()


                for (i in 0..dbResponseData.size - 1) {
                    dbResponseData.get(i).let {
                        ordersBottomSheetListTemp.value!!.add(
                            OrderTypeResponse.OrderType(
                                it.displayName ?: "",
                                it.name ?: "",
                                if (i == 0) true else false,
                                it.id.toString()
                            )
                        )
                    }

                }
            }


            if (!ordersBottomSheetListTemp.value.isNullOrEmpty()) {
                selectedOrderIdsSentToApi = ordersBottomSheetListTemp.value!!.get(0)?.statusIds!!
                orderTypeValue = ordersBottomSheetListTemp.value!!.get(0)?.statusName!!
                orderTypeValueDisplay = ordersBottomSheetListTemp.value!!.get(0)?.displayName!!
            }


            //setting patients bottom sheet listing
            getPatientDetails(mContext)
            apiType = 2
            getOrdersListingData(mContext)

        } else
            showError.postValue(Event(ERRORS.NO_NETWORK))
    }

    fun getOrdersListingData(context: Context) {

        if (isNetworkAvailable(context)) {
            if (isClearPreviousList)
                myOrdersList.value!!.clear()
            else {
                hasMoreData = false
                if (!myOrdersList.value!!.contains(null))
                    myOrdersList.value!!.add(null)
                myOrdersList.postValue(myOrdersList.value!!)
            }


            //setting my orders main listing
            viewModelScope.launch(IO) {
                var patientIds: String = ""
                if (!isSentAllPatientIdToApi) {
                    for (i in 0..selectedPatientListSentToApi.size - 1) {
                        if (patientIds.equals(""))
                            patientIds = selectedPatientListSentToApi.get(i).toString()
                        else
                            patientIds =
                                patientIds + "," + selectedPatientListSentToApi.get(i).toString()
                    }
                }

                if (customerOrderPageCount == 1) {
                    myOrdersList.postValue(mutableListOf())
                    showShimmer.postValue(true)
                }
                if (orderTypeValue.isEmpty()) {
                    localDbUseCase.getOrderFilterList().let {
                        orderTypeValue = it[0].name.toString()
                    }
                }

                val response1 = homePageUseCase.getAllCustomerOrders(
                    mxInternalErrorOccurred, SharedPrefManager.getInstance().loggedInUserId,
                    customerOrderPageCount,
                    10,
                    setOf(orderTypeValue),
                    //selectedPatientListSentToApi.toSet()
                    patientIds
                )
                maxPageCount = response1?.responseData?.pageCount ?: 1


                when {

                    response1?.responseData?.ordersList != null && !response1?.responseData?.ordersList?.isNullOrEmpty()!! -> {

                        if (isClearPreviousList) {
                            response1?.responseData?.ordersList?.forEach {
                                myOrdersList.value!!.add(it!!)
                            }
                            /*  showShimmer.value = false
                              showMyOrdersListView.value = true
                              showNoOrdersView.value = false*/

                            showShimmer.postValue(false)
                            showMyOrdersListView.postValue(true)
                            showNoOrdersView.postValue(false)

                            myOrdersList.postValue(myOrdersList.value)
                            showMessage.postValue(OrderFragmentData(MESSAGES.REQUEST_MY_ORDER_LIST_FOCUS_TO_TOP))
                            setHasLoadMore(response1?.responseData?.ordersList?.size ?: 0)
                        } else if (!isClearPreviousList) {
                            delay(1500)
                            myOrdersList.value!!.remove(null)
                            response1?.responseData?.ordersList?.forEach {
                                myOrdersList.value!!.add(it!!)
                            }

                            myOrdersList.postValue(myOrdersList.value)
                            setHasLoadMore(response1?.responseData?.ordersList?.size ?: 0)
                        }


                    }

                    else -> {
                        hasMoreData = false
                        if (isClearPreviousList) {
                            /* showShimmer.value = false
                             showMyOrdersListView.value = false
                             showNoOrdersView.value = true*/

                            showShimmer.postValue(false)
                            showMyOrdersListView.postValue(false)
                            showNoOrdersView.postValue(true)
                        } else if (!isClearPreviousList) {
                            myOrdersList.value!!.remove(null)
                            myOrdersList.postValue(myOrdersList.value)
                        }

                        showError.postValue(Event(ERRORS.NO_ORDERS_FOUND))
                    }
                }


            }


        } else
            showError.postValue(Event(ERRORS.NO_NETWORK))

    }

    fun setHasLoadMore(size: Int) {
        if (size < 10)
            hasMoreData = false
        else
            hasMoreData = true
    }

    override fun onCleared() {
        super.onCleared()

    }

}