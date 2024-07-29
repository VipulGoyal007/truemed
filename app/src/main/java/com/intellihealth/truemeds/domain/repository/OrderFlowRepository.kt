package com.intellihealth.truemeds.domain.repository

import com.google.gson.JsonObject
import com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse
import com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse
import com.intellihealth.truemeds.data.model.doctordetails.DoctorDetails
import com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel
import com.intellihealth.truemeds.data.model.home.PinCodeServiceabilityResponse
import com.intellihealth.truemeds.data.model.home.ReorderResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.orderflow.AllOffersResponse
import com.intellihealth.truemeds.data.model.orderflow.AllPrescriptionByCustomerResponse
import com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse
import com.intellihealth.truemeds.data.model.orderflow.GetCustomerOrderDetails
import com.intellihealth.truemeds.data.model.orderflow.GetOrderMedicineDetails
import com.intellihealth.truemeds.data.model.orderflow.GetOrderRxResponse
import com.intellihealth.truemeds.data.model.orderflow.GetPatientDetailsResponse
import com.intellihealth.truemeds.data.model.orderflow.MedicineDto
import com.intellihealth.truemeds.data.model.orderflow.SaveAddressForOrderResponse
import com.intellihealth.truemeds.data.model.orderflow.SaveMedsCreateEditOrderResponse
import com.intellihealth.truemeds.data.model.orderflow.SaveRxImageForCustomerIdResponse
import com.intellihealth.truemeds.data.model.orderstatus.DoctorRating
import com.intellihealth.truemeds.data.model.ordersummary.AddressResponse
import com.intellihealth.truemeds.data.model.ordersummary.CustomerOrderDetailResponse
import com.intellihealth.truemeds.data.model.ordersummary.LastMinutePurchaseResponse
import com.intellihealth.truemeds.data.model.ordersummary.OTCResponse
import com.intellihealth.truemeds.data.model.prescription.ImageUploadRequest
import com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse
import com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse
import com.intellihealth.truemeds.data.model.search.TrendingSearchResponse
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.presentation.model.GetAllPatientModel
import com.intellihealth.truemeds.presentation.model.GetAllPrescriptionDataModel
import com.intellihealth.truemeds.presentation.model.MedicineDetailsResultResponse
import com.intellihealth.truemeds.presentation.model.OtcCategoriesForProductsResponse
import com.intellihealth.truemeds.presentation.model.OtcProductsForCategoriesRequest
import com.intellihealth.truemeds.presentation.model.SearchResultResponse
import okhttp3.ResponseBody
import retrofit2.Response

interface OrderFlowRepository {

    /**
     * This service will generate a new order id with medicines added in cart
     * **/
    suspend fun saveMedsAndCreateOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String,
        orderId: Long,
        medicineDto: List<MedicineDto>,
        offerId: String,
        variantID: Long?,
        checkAutoConfirmEligibility: Boolean,
        newAlgo: Boolean,
        serialId: Long?,
        pincode: String
    ): Resource<Response<SaveMedsCreateEditOrderResponse>>


    /**
     * This service triggers when a medicine added to the already created cart or before placing order or redirection from cart to order summary
     * **/
    suspend fun replaceMedicineForIncompleteOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        medicineDto: List<MedicineDto>?,
        customerId: String,
        offerId: String,
        checkAutoConfirmEligibility: Boolean,
        newAlgo: Boolean,
        serialId: Long,
        variantId: Long?,
        pincode: String
    ): Resource<Response<SaveMedsCreateEditOrderResponse>>


    /**
     * This service triggers when a medicine quantity is updated or medicine is removed from cart
     * **/
    suspend fun editMedicine(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long?,
        medicineDto: List<MedicineDto>?,
        pincode: String
    ): Resource<Response<SaveMedsCreateEditOrderResponse>>


    /**
     * This service provides medicines available in existing order
     * **/
    suspend fun getOrderMedicineDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long
    ): Resource<Response<GetOrderMedicineDetails>>

    suspend fun getCustomerOrderDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        customerId: String
    ): Resource<Response<GetCustomerOrderDetails>>

    suspend fun getPatientDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long?,
        customerId: String
    ): Resource<Response<GetPatientDetailsResponse>>

    suspend fun getOrderRx(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long
    ): Resource<Response<GetOrderRxResponse>>

    /***
     * This service ise used to set payment method for current orderId
     * */
    suspend fun setPaymentModeForAnOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long?,
        paymentId: Int,
        offerId: Long
    ): Resource<Response<ResponseBody>>


    /**
     * This service triggered when user uploads rx for selected orderId
     * **/
    suspend fun uploadImage(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        pinCode: String,
        customerId: String?,
        uploadImageModel: ImageUploadRequest,
        variantId: Long?
    ): Resource<Response<SaveRxImageForCustomerIdResponse?>>


    /**
     * This service provides uploaded prescriptions of user and display under past prescriptions
     * **/
    suspend fun getAllPrescriptionByCustomerId(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String
    ): Resource<Response<AllPrescriptionByCustomerResponse>>


    /**
     * This service provides available coupons list
     * **/
    suspend fun getAllOffers(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String,
        result: Int
    ): Resource<Response<AllOffersResponse>>


    /**
     * This service used to set coupon and payment mode details to current orderId
     * **/
    suspend fun savePaymentAndCouponForOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        paymentId: String,
        offerId: String
    ): Resource<Response<CouponSaveRemoveResponse>>


    /**
     * This service triggers when coupon code is applied on current order
     * **/
    suspend fun saveCouponCode(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        couponCode: String?,
        orderId: Long?
    ): Resource<Response<ResponseBody>>


    /**
     * This service used to apply delivery address for current orderId
     * **/
    suspend fun saveAddressForOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long?,
        addressId: Long?,
        customerId: String?
    ): Resource<Response<SaveAddressForOrderResponse>>


    /**
     * This service used to set patient details for current orderId
     * **/
    suspend fun updatePatientIdInSubOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long?,
        patientId: Long?,
        customerId: String?
    ): Resource<Response<ResponseBody>>

    /**
     *
     * **/
    suspend fun fetchIconMaster(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        iconType: String?
    ): Resource<Response<PaymentMethodResponse>>


    /**
     * This service is used to store payment method before placing order from PSP(Payment Selection Page)
     * **/
    suspend fun setPaymentSelectionMethod(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long?,
        paymentMethodId: Long?,
        paymentMethod: String?,
        paymentMode: Long
    ): Resource<Response<ResponseBody>>
    
    /**
     * This service is used to identify weather customer has visited PSP page in order flow or not
     * **/
    suspend fun setPspViewedByCustomer(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long?,
        isPspViewed: Boolean
    ): Resource<Response<ResponseBody>>
    
    /**
     * This service used to place order
     * **/
    suspend fun confirmOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        paymentId: String,
        offerId: String?,
        customerId: String,
        paymentMethod: String?,
        paymentMethodId: Long?,
        orderConfirmSrc: String?,
        sourceVersion: String,
        checkAutoConfirmEligibility: Boolean
    ): Resource<Response<ResponseBody>>

    /**
     * This service used to get all patient order details
     * **/
    /*suspend fun getAllPatientsOrderDetails(
        orderId: Long?
    ): Resource<Response<AllPatientsOrderDetailsResponse>>*/

    /**
     * This service used to get all order details
     * **/
    suspend fun fetchAllOrdersOfCustomers(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String,
        page: Int,
        result: Int,
        statusIds: Set<String?>?,
        // patientIds : Set<Long>?
        patientIds: String
    ): Resource<Response<AllCustomersOrdersResponseModel>>

    /**
     * This service used to get all order details
     * **/
    suspend fun getMyOrders(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderType: String,
        patientList: List<Long>
    ): Resource<Response<AllCustomersOrdersResponseModel>>

    /*suspend fun getOrderDetails(orderId : String?) : Resource<Response<OrderDetailsResponse>>*/


    /**
     * This service is triggered post confirm order API to increase the counter of order placed event at server
     * **/
    /*suspend fun incrementEventCounter(): Resource<Response<ResponseBody>>*/

    /**
     * This service is used for cancel order
     * **/
    suspend fun discardOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        customerId: Long
    ): Resource<Response<String>>


    /**
     * This service provides the Dr details for an order after Dr call is done.
     * **/
    suspend fun getDoctorDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long?
    ): Resource<Response<DoctorDetails>>


    /**
     * This service provides ratings after Dr call is done for particular order
     * **/
    suspend fun setDoctorRating(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        ratingData: JsonObject?
    ): Resource<Response<DoctorRating>>


    /**
     * This service provides link for returns and refunds and open the same in webview
     * **/
    suspend fun getClickPostReturnLink(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        obj: JsonObject?
    ): Resource<Response<ResponseBody>>

    /**
     * This service is used to change payment mode cod to online or vice versa
     * **/
    suspend fun changePaymentMode(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        paymentModeId: String,
    ): Resource<Response<ResponseBody>>

    /**
     * This service provides a new orderId from previously delivered or cancelled order
     * **/
    suspend fun reOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long?,
        customerId: String?,
        patientListDto: ArrayList<Long?>?,
        variant: String?,
        checkAutoConfirmEligibility: Boolean,
        newAlgo: Boolean,
        serialId: Int?,
        reOrderMedCheck: Boolean,
        variantId: Long?
    ): Resource<Response<ReorderResponse>>

    suspend fun calculateBillDetailsforApp(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        paymentSelectionInfo: Boolean
    ): Resource<Response<BillDetailResponse>>


    suspend fun getSearchResults(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        warehouseId: String,
        elasticSearchType: String,
        searchString: String,
        sizeCount: Int,
        page: Int,
        variantId: Long?,
        searchVariant: String,
        isMultiSearch: Boolean
    ): Resource<Response<SearchResultResponse>>

    suspend fun getTrendingSearches(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        warehouseId: String?,
        sessionToken: String?,
        pageNumber: Int?,
        pageSize: Int?
    ): Resource<Response<TrendingSearchResponse>>

    /*suspend fun getPrescriptionImages(orderId: Long?): Resource<Response<PrescriptionImagesResponse>>*/

    /*suspend fun getFtcCoupons(
        customerId: String?,
        categoryType: String?,
        version: String?
    ): Resource<Response<CouponExpiryDateResponse>>*/


    suspend fun fetchMedicineDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        productCd: String,
        warehouseId: String
    ): Resource<Response<MedicineDetailsResultResponse>>


    suspend fun fetchCouponData(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        result: Int,
        pincode: String,
        offerType: String,
        categoryType: String,
        variantId: Long?
    ): Resource<Response<CouponCodeResponse>>

    /*suspend fun savePaymentAndCoupon(
        orderId: Long,
        paymentId: String,
        offerId: String
    ): Resource<Unit>*/

    suspend fun getAllAddress(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String, orderId: Long
    ): Resource<Response<AddressResponse>>

    suspend fun getCustomerOrderDetail(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String, orderId: String
    ): Resource<Response<CustomerOrderDetailResponse>>

    suspend fun getLastMinuteResponse(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        sessionToken: String,
        warehouseId: String,
        pageNumber: Int,
        type: String,
        subType: Set<String>,
        pageSize: Int,
        variantId: Long
    ): Resource<Response<LastMinutePurchaseResponse>>


    suspend fun getOtcProductsForCategories(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        request: OtcProductsForCategoriesRequest
    ):
            Resource<Response<OtcCategoriesForProductsResponse>>


    suspend fun getCrossSellingRecommendedProducts(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        sessionToken: String?,
        warehouseId: String?,
        pageNumber: Int,
        pageSize: Int?,
        type: String,
        productCode: String,
        variantId: Long?
    ): Resource<Response<CrossSellingRecommendedProductResponse>>


    suspend fun fetchReOrderOTCProductV1(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        productCodes: Set<String?>?,
        customerId: String?,
        patientId: Long,
        orderId: Long
    ): Resource<Response<OTCResponse>>

    suspend fun checkPincodeServiceability(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        pincode: String?
    ): Resource<Response<PinCodeServiceabilityResponse>>

    suspend fun deleteImages(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        edit: Boolean,
        images: List<Long>,
        customerId: String
    ): Resource<Response<ResponseBody>>

    suspend fun getPrescriptionDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: Long,
        patientId: String?
    ): Resource<Response<GetAllPrescriptionDataModel>>

    suspend fun getPatientDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: Long
    ): Resource<Response<GetAllPatientModel>>

}