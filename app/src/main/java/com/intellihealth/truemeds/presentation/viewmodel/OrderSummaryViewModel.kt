package com.intellihealth.truemeds.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.intellihealth.salt.models.ProductInfoModel
import com.intellihealth.truemeds.data.model.orderflow.CouponCodeDataModel
import com.intellihealth.truemeds.data.model.search.ProductList
import com.intellihealth.truemeds.data.utils.ERRORS
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.domain.usecase.PaymentOptionsUseCase
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import java.util.Collections.emptyList
import javax.inject.Inject


@HiltViewModel
class OrderSummaryViewModel @Inject constructor() :
    BaseViewModel(),
    DefaultLifecycleObserver {
    private val showError = MutableLiveData<Event<ERRORS>>()
    val eventShowError: LiveData<Event<ERRORS>> get() = showError
    private val showMessage = MutableLiveData<Event<MESSAGES>>()
    val eventMessage: LiveData<Event<MESSAGES>> get() = showMessage


    var productList: MutableList<ProductInfoModel> = mutableListOf()
    val productListUsed: MutableLiveData<MutableList<ProductInfoModel>> =
        MutableLiveData(mutableListOf())
    var prescriptionList = listOf<String>()

    //var paymentCarouselList :  List<PaymentCarouselModel> = listOf()
    //var medList :  ArrayList<ProductInfoModel?> = arrayListOf()
    //lateinit var billDetails : BillDetailsModel
    //lateinit var cartBillDetails: MutableLiveData<CartBillDetails>
    var isExpanded: Boolean = true

    var patientID = MutableLiveData("")
    var patientName = MutableLiveData("")
    var orderAddress = MutableLiveData("")
    var isOrderAddressServiceable = MutableLiveData(true)
    var mrpValue = MutableLiveData(0f)
    var paymentMode = MutableLiveData(0)

    val launchPDPage = MutableLiveData<Event<ProductInfoModel?>>()
    val eventLaunchPDPage: LiveData<Event<ProductInfoModel?>> get() = launchPDPage

    val launchOrderStatus = MutableLiveData<Event<Boolean>>()
    val eventLaunchOrderStatus: LiveData<Event<Boolean>> get() = launchOrderStatus

    var orderIsBeingPlacedView = MutableLiveData<Boolean>(false)
    var orderPlacedView = MutableLiveData<Boolean>(false)
    var setMainDataView = MutableLiveData<Boolean>(true)

    /**
     * Below variable values are needed for PSP activity / MixPanel / AppsFlyer Events
     * **/
    var isOtcAdded: Boolean? = null
    var isChronicAdded: Boolean? = null
    var totalOutOfStockCount: Int = 0
    var notDeliverableCount: Int = 0
    var isGenericAdded = false
    var addMoreForCod = MutableLiveData(0.0)
    var restrictCod = MutableLiveData(false)
    var paymentRestrictedType = MutableLiveData(0)
    var cartCount = MutableLiveData(0)
    var productIds = arrayOfNulls<String>(0)
    var productNames: Array<String>? = null
    var selectedPaymentMethod = ""
    var selectedPaymentMethodId = -1L
    var selectedPaymentMethodIconUrl = ""
    var isAppliedCoupon = MutableLiveData(false)
    var couponCodeDataModel = MutableLiveData<CouponCodeDataModel>()
    val rxRequired = false
    var visibleMedicineList = MutableLiveData<List<ProductList>>(emptyList())
    var prescriptionUploadedImgList = MutableLiveData<List<ProductList>>(emptyList())

    init {
        //paymentCarouselList = orderSummaryUseCase.getPaymentCarouselList()
        //medList = orderSummaryUseCase.getMedicineList()
        //prescriptionList = orderSummaryUseCase.getPrescriptionList()
        /*SharedPrefManager.getInstance().updateCouponDetails(
            "27", "FIRST25", "5.0",
            999, "16", 27, 1000, "DISCOUNT BY PERCENTAGE UPTO",
            "27", "50", 50, 20, 1000L, "test",
            "", 0L, ""
        )*/
        //billDetails = orderSummaryUseCase.getBillDetails()
        /*cartBillDetails = MutableLiveData(CartBillDetails(0,
        0.0, 0.0, 0.0, 0.0,
        0.0, 0.0, 0.0, 0.0, 0.0,
        "","",0,""
        ))*/
        /*viewModelScope.launch(IO) {
            val cartBillDetailsModel = getCartBillDetails()
            cartBillDetailsModel?.let {
                billDetails = orderFlowUseCase.showBillDetails(it, ClassNameConstants.ORDER_SUMMARY_ACTIVITY)
                cartBillDetails = MutableLiveData(it)
            }
        }*/
    }

    /*private fun getCartBillDetails() : CartBillDetails?{
        var cartBillDetailsModel : CartBillDetails?=null
        viewModelScope.launch(IO) {
//             cartBillDetailsModel = orderFlowUseCase.calculateBillDetailsforApp("25029",false)
        }
        return cartBillDetailsModel
    }*/

    /*fun getCartProductList() {
        val response = orderSummaryUseCase.getCartProducts()
        productList.addAll(response)
        productListUsed.value!!.addAll(response)

    }

    fun viewChangesClick() {
        showMessage.postValue(Event(MESSAGES.VIEW_CHANGES_CLICK))
    }
    fun addMorePrescriptionClick() {
        showMessage.postValue(Event(MESSAGES.ADD_MORE_PRESCRIPTION_CLICK))
    }
    fun uploadPrescriptionClick() {
        showMessage.postValue(Event(MESSAGES.UPLOAD_PRESCRIPTION_CLICK))
    }*/
    fun applyCouponClick() {
        showMessage.postValue(Event(MESSAGES.APPLY_COUPON_CLICK))
    }

    fun viewMoreClick() {
        Log.e("isexpanded", ":::" + isExpanded.toString() + ":::::" + productList.toString())
        if (isExpanded) {
            var productListTemp: MutableList<ProductInfoModel> = mutableListOf()
            productListTemp.add(productList.get(0))
            productListUsed.postValue(productListTemp)
        } else if (!isExpanded)
            productListUsed.postValue(productList)

        showMessage.postValue(Event(MESSAGES.VIEW_MORE_CLICK))
    }

    /*var stickyPaymentDataPlaceOrder: MutableLiveData<PaymentContainerModel> = MutableLiveData(
        PaymentContainerModel(
            "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/UPI-Logo-vector.svg/1200px-UPI-Logo-vector.svg.png",
            "Pay using",
            "UPI",
            "",
            1200.52,
            "https://picsum.photos/20/20",
            SpannableStringBuilder("UPI5 Applied on your bill"),
            "Delivery to",
            "Akshay Pujari",
            "address address, address address, address address, address address",
            "Home",
            "400000",
            "Delivery by",
            "12th Dec",
            "Place order",
            paymentContainerType = PaymentContainerType.PLACE_ORDER
        )
    )



    fun processValidationForPSP(): Pair<Boolean,String> {
        val paymentTypeId = SharedPrefManager.getInstance().getLastSelectedPaymentModeId(0)
        val (isValid,message) = orderSummaryUseCase.processValidationForPsp(patientID.value!!,
            patientName.value!!,orderAddress.value!!,
            isOrderAddressServiceable.value!!,mrpValue.getValue()!!,
            prescriptionUploadedImgList.value!!,
            totalOutOfStockCount,notDeliverableCount)
        return Pair(isValid,message)
    }

    fun prepareBillDetailModel() : CartBillDetailsModel?{
        var billDetailsModel : CartBillDetailsModel? = null
        viewModelScope.launch(IO) {
            try {
                var finalCalcAmount = orderFlowUseCase.getBillDetailsFromOrderDetails(OrderDetailsResponse.FinalCalcAmt())
                billDetailsModel = CartBillDetailsModel(finalCalcAmount.orderId,
                    finalCalcAmount.mrp!!,finalCalcAmount.discount!!,
                    finalCalcAmount.packagingCharge!!,finalCalcAmount.deliveryCharge!!,
                    finalCalcAmount.tmCash!!,finalCalcAmount.tmCredit!!,finalCalcAmount.payableAmt!!,
                    finalCalcAmount.couponCode.toString(),finalCalcAmount.couponDiscountPrice!!,
                    "Bill Details",finalCalcAmount.savingsText.toString(),
                    finalCalcAmount.savingValue)
            }catch (ex:Exception){
                ex.printStackTrace()
            }
        }
        return billDetailsModel
    }*/


    /*fun confirmOrder() {
        var mLastClickTime = 0L
        if (SystemClock.elapsedRealtime() - mLastClickTime < 1000){
            Log.i("placeOrder","return")
            return
        }
        mLastClickTime = SystemClock.elapsedRealtime()
        viewModelScope.launch(IO) {
            val response = orderFlowUseCase.confirmOrder(
                SharedPrefManager.getInstance().incompleteOrderId,
                paymentMode.value!!,
                SharedPrefManager.getInstance().loggedInUserId,
                selectedPaymentMethod,
                selectedPaymentMethodId,
                BundleConstants.ORDER_SUMMARY,
                selectedPaymentMethodIconUrl
            )
            if (response) {
                launchOrderStatus.postValue(Event(response))
            }
        }
    }*/
}