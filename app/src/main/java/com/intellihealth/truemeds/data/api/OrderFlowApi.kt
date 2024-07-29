package com.intellihealth.truemeds.data.api

import com.google.gson.JsonObject
import com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse
import com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse
import com.intellihealth.truemeds.data.model.doctordetails.DoctorDetails
import com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel
import com.intellihealth.truemeds.data.model.home.PinCodeServiceabilityResponse
import com.intellihealth.truemeds.data.model.home.ReorderResponse
import com.intellihealth.truemeds.data.model.orderflow.*
import com.intellihealth.truemeds.data.model.orderstatus.DoctorRating
import com.intellihealth.truemeds.data.model.ordersummary.AddressResponse
import com.intellihealth.truemeds.data.model.ordersummary.CustomerOrderDetailResponse
import com.intellihealth.truemeds.data.model.ordersummary.LastMinutePurchaseResponse
import com.intellihealth.truemeds.data.model.ordersummary.OTCResponse
import com.intellihealth.truemeds.data.model.prescription.ImageUploadRequest
import com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse
import com.intellihealth.truemeds.data.utils.ApiEndpointConstants
import com.intellihealth.truemeds.presentation.model.GetAllPatientModel
import com.intellihealth.truemeds.presentation.model.GetAllPrescriptionDataModel
import com.intellihealth.truemeds.presentation.model.OtcCategoriesForProductsResponse
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.*

interface OrderFlowApi {
    @POST(ApiEndpointConstants.SAVE_MEDS_AND_CREATE_ORDER)
    suspend fun saveMedsAndCreateOrder(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("customerId") customerId: String,
        @Query("orderId") orderId: Long,
        @Body medicineDto: List<MedicineDto>,
        @Query("offerId") offerId: String?,
        @Query("variantId") variantID: Long?,
        @Query("checkAutoConfirmEligibility") checkAutoConfirmEligibility: Boolean,
        @Query("newAlgo") newAlgo: Boolean,
        @Query("srcTypeId") serialId: Long?,
        @Query("pincode") pincode: String
    ): Response<SaveMedsCreateEditOrderResponse>

    @POST(ApiEndpointConstants.REPLACE_MEDICINES_FOR_INCOMPLETE_ORDER)
    suspend fun replaceMedicineForIncompleteOrder(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("orderId") orderId: Long,
        @Body medicineDto: List<MedicineDto>?,
        @Query("customerId") customerId: String,
        @Query("offerId") offerId: String,
        @Query("checkAutoConfirmEligibility") checkAutoConfirmEligibility: Boolean,
        @Query("newAlgo") newAlgo: Boolean,
        @Query("srcTypeId") serialId: Long,
        @Query("variantId") variantId: Long?,
        @Query("pincode") pincode: String
    ): Response<SaveMedsCreateEditOrderResponse>

    @POST(ApiEndpointConstants.EDIT_MEDICINE)
    suspend fun editMedicine(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("orderId") orderId: Long?,
        @Body medicineDto: List<MedicineDto>?,
        @Query("pincode") pincode: String,
    ): Response<SaveMedsCreateEditOrderResponse>


    @GET(ApiEndpointConstants.GET_ORDER_MEDICINE_DETAILS)
    suspend fun getOrderMedicineDetails(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("orderId") orderId: Long?
    ): Response<GetOrderMedicineDetails>

    @GET(ApiEndpointConstants.FETCH_ORDER_RX)
    suspend fun getOrderRx(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("orderId") orderId: Long
    ): Response<GetOrderRxResponse>

    @GET(ApiEndpointConstants.GET_CUSTOMER_ORDER_DETAILS)
    suspend fun getCustomerOrderDetails(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("orderId") orderId: Long?,
        @Query("customerId") customerId: String?
    ): Response<GetCustomerOrderDetails>

    @GET(ApiEndpointConstants.GET_PATIENT_DETAILS)
    suspend fun getPatientDetails(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("orderId") orderId: Long?,
        @Query("customerId") customerId: String
    ): Response<GetPatientDetailsResponse>

    @GET(ApiEndpointConstants.GET_PATIENT_DETAILS)
    suspend fun getPatientDetails(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("customerId") customerId: String
    ): Response<GetPatientDetailsResponse>


    @POST(ApiEndpointConstants.SET_PAYMENT_MODE_FOR_ORDER)
    suspend fun setPaymentModeForAnOrder(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String,
        @Query("orderId") orderId: Long?,
        @Query("paymentId") paymentId: Int,
        @Query("offerId") offerId : Long
    ): Response<ResponseBody>

    @POST(ApiEndpointConstants.UPLOAD_IMAGE)
    suspend fun uploadImage(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String,
        @Query("pincode") pincode: String,
        @Query("customerId") customerId: String?,
        @Body uploadImageModel: ImageUploadRequest,
        @Query("variantId") variantId: Long?,
    ): Response<SaveRxImageForCustomerIdResponse?>

    @GET(ApiEndpointConstants.GET_ALL_PRESCRIPTION_BY_CUSTOMER_ID)
    suspend fun getAllPrescriptionByCustomerId(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("customerId") customerId: String,
    ): Response<AllPrescriptionByCustomerResponse>

    @POST(ApiEndpointConstants.GET_ALL_OFFERS)
    suspend fun getAllOffers(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("customerId") customerId: String,
        @Query("result") result: Int,
    ): Response<AllOffersResponse>

    @POST(ApiEndpointConstants.SAVE_PAYMENT_AND_COUPON_FOR_ORDER)
    suspend fun savePaymentAndCouponForOrder(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("orderId") orderId: Long,
        @Query("paymentId") paymentId: String,
        @Query("offerId") offerId: String
    ): Response<CouponSaveRemoveResponse>

    @POST(ApiEndpointConstants.SAVE_COUPON_CODE)
    suspend fun saveCouponCode(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("couponCode") couponCode: String?,
        @Query("orderId") orderId: Long?
    ): Response<ResponseBody>

    @POST(ApiEndpointConstants.SAVE_ADDRESS_FOR_ORDER)
    suspend fun saveAddressForOrder(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String,
        @Query("orderId") orderId: Long?,
        @Query("addressId") addressId: Long?,
        @Query("customerId") customerId: String?,
        @Query("newDeliveryCharge") newDeliveryCharge: Boolean
    ): Response<SaveAddressForOrderResponse>

    @GET(ApiEndpointConstants.UPDATE_PATIENT_ID_IN_SUB_ORDER)
    suspend fun updatePatientIdInSubOrder(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("orderId") orderId: Long?,
        @Query("patientId") patientId: Long?,
        @Query("customerId") customerId: String?,
    ): Response<ResponseBody>

    @GET(ApiEndpointConstants.FETCH_ICON_MASTER)
    suspend fun fetchIconMaster(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("iconType") iconType: String?
    ): Response<PaymentMethodResponse>

    @POST(ApiEndpointConstants.SET_PAYMENT_SELECTION_METHOD)
    suspend fun setPaymentSelectionMethod(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("orderId") orderId: Long?,
        @Query("paymentMethodId") paymentMethodId: Long?,
        @Query("paymentMethod") paymentMethod: String?,
        @Query("paymentId") paymentMode : Long
    ): Response<ResponseBody>
    
    @POST(ApiEndpointConstants.SET_PSP_VIEWED_BY_CUSTOMER)
    suspend fun setPspViewedByCustomer(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("orderId") orderId: Long?,
        @Query("isPspViewed") isPspViewed : Boolean
    ): Response<ResponseBody>
    
    @POST(ApiEndpointConstants.CONFIRM_ORDER)
    suspend fun confirmOrder(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("orderId") orderId: Long,
        @Query("paymentId") paymentId: String,
        @Query("offerId") offerId: String?,
        @Query("customerId") customerId: String,
        @Query("paymentMethod") paymentMethod: String?,
        @Query("paymentMethodId") paymentMethodId: Long?,
        @Query("orderConfirmSrc") orderConfirmSrc: String?,
        @Query("sourceVersion") sourceVersion: String,
        @Query("checkAutoConfirmEligibility") checkAutoConfirmEligibility: Boolean,
    ): Response<ResponseBody>

    /*@GET(ApiEndpointConstants.INCREMENT_EVENT_COUNTER)
    suspend fun incrementEventCounter(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String
    ): Response<ResponseBody>*/

    @POST(ApiEndpointConstants.DISCARD_ORDER)
    suspend fun discardOrder(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("orderId") orderId: Long,
        @Query("customerId") customerId: Long
    ): Response<String>

    @GET(ApiEndpointConstants.GET_DOCTOR_DETAILS)
    suspend fun getDoctorDetails(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("orderId") orderId: Long?,
    ): Response<DoctorDetails>

    @POST(ApiEndpointConstants.DOCTOR_RATING)
    suspend fun setDoctorRating(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Body ratingData: JsonObject?,
    ): Response<DoctorRating>

    @POST(ApiEndpointConstants.CLICKPOST_GENERATE_RETURN_URL)
    suspend fun getClickPostReturnLink(
        @Header("Content-Type") contentType: String?,
        @Body obj: JsonObject?,
    ): Response<ResponseBody>

    @POST(ApiEndpointConstants.FETCH_ALL_ORDERS_OF_CUSTOMERS)
    suspend fun fetchAllOrdersOfCustomers(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String?,
        @Query("customerId") customerId: String,
        @Query("page") page: Int,
        @Query("result") result: Int,
        @Query("patientIds") patientIds:String,
        @Body statusIds: Set<String?>?,
    ): Response<AllCustomersOrdersResponseModel>

    @POST(ApiEndpointConstants.FETCH_ALL_ORDERS_OF_CUSTOMERS)
    suspend fun getMyOrders(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String?,
        @Query("orderType")orderType: String,
        @Body patientList: List<Long>
    ): Response<AllCustomersOrdersResponseModel>

    /*@GET(ApiEndpointConstants.GET_ALL_PATIENTS_ORDER_DETAILS)
    suspend fun getAllPatientsOrderDetails(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("orderId") orderId: Long?,
    ): Response<AllPatientsOrderDetailsResponse>

    @GET(ApiEndpointConstants.GET_ORDER_DETAILS)
    suspend fun getOrderDetails(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("orderId") orderId: Long?,
    ): Response<OrderDetailsResponse>*/

    /*@GET(ApiEndpointConstants.GET_FTC_COUPON_EXPIRY_DATE)
    suspend fun getFtcCoupons(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("customerId") customerId: String?,
        @Query("categoryType") categoryType: String?,
        @Query("version") version: String?,
    ): Response<CouponExpiryDateResponse>*/

    @POST(ApiEndpointConstants.RE_ORDER)
    suspend fun reOrder(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("orderId") orderId: Long?,
        @Query("customerId") customerId: String?,
        @Body patientListDto: ArrayList<Long?>?,
        @Query("variant") variant: String?,
        @Query("checkAutoConfirmEligibility") checkAutoConfirmEligibility: Boolean,
        @Query("newAlgo") newAlgo: Boolean,
        @Query("srcTypeId") serialId: Int?,
        @Query("reOrderMedCheck") reOrderMedCheck: Boolean,
        @Query("variantId") variantId: Long?
    ): Response<ReorderResponse>

    @GET(ApiEndpointConstants.CHANGE_PAYMENT_MODE)
    suspend fun changePaymentMode(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("orderId") orderId: Long,
        @Query("paymentModeId") paymentModeId: String,
    ): Response<ResponseBody>

    @GET(ApiEndpointConstants.CALCULATE_BILL_DETAILS_FOR_APP)
    suspend fun calculateBillDetailsforApp(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("orderId") orderId: Long,
        @Query("paymentSelectionInfo") paymentSelectionInfo: Boolean,
    ): Response<BillDetailResponse>

    /*@GET(ApiEndpointConstants.GET_PRESCRIPTION_LIST)
    suspend fun getPrescriptionImages(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("orderId") orderId: Long?,
    ): Response<PrescriptionImagesResponse>*/


    @GET(ApiEndpointConstants.FETCH_ALL_OFFERS)
    suspend fun fetchCouponData(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("result") result: Int,
        @Query("pincode") pincode: String,
        @Query("offerType") offerType: String,
        @Query("categoryType") categoryType: String,
        @Query("variantId") variant: Long?,
        @Query("version") version:String,
        @Query("source") source :String

    ): Response<CouponCodeResponse>
    
    @POST(ApiEndpointConstants.DELETE_IMAGES_API)
    suspend fun deleteImages(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("orderId") orderId: Long?,
        @Query("edit") edit: Boolean,
        @Body medicineIds: List<Long>?,
        @Query("customerId") customerId: String?
    ): Response<ResponseBody>

    @GET(ApiEndpointConstants.PATIENT_AND_PRESCRIPTION_DETAILS_API)
    suspend fun getPatientAndPrescriptionDetails(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("customerId") customerId: Long,
        @Query("patientId") patientId: String?

    ): Response<GetAllPrescriptionDataModel>

    @GET(ApiEndpointConstants.PATIENT_AND_PRESCRIPTION_DETAILS_API)
    suspend fun getPatientAndPrescriptionDetails(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("customerId") customerId: Long
    ): Response<GetAllPatientModel>


    /*@POST(ApiEndpointConstants.SAVE_PAYMENT_AND_COUPON_FOR_ORDER)
    suspend fun savePaymentAndCoupon(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("orderId") orderId: Long,
        @Query("paymentId") paymentId: String,
        @Query("offerId") offerId: String,
    )*/


    @GET(ApiEndpointConstants.FETCH_ALL_ADDRESS)
    suspend fun getAllAddress(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("customerId") customerId: String,
        @Query("orderId") orderId: Long
    ): Response<AddressResponse>

    @GET(ApiEndpointConstants.GET_CUSTOMER_ORDER_DETAILS_V1)
    suspend fun getCustomerOrderDetail(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("customerId") customerId: String,
        @Query("orderId") orderId: String
    ): Response<CustomerOrderDetailResponse>

    @POST(ApiEndpointConstants.FETCH_PRODUCTS_FOR_CATEGORIES)
    suspend fun getOtcProductsForCategories(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("isApp") isApp: Boolean,
        @Query("id") id: Int,
        @Query("type") type: String,
        @Query("collectionId") collectionId: Int,
        @Query("page") page: Int,
        @Query("result") result: Int,
        @Body body: List<String>,
        @Query("isBrandOnly") isBrandOnly: Boolean,
        @Query("sessionToken") sessionToken: String,
        @Query("variantId") variantId: Int?,
        @Query("warehouseId") warehouseId: Int,
    ): Response<OtcCategoriesForProductsResponse>

    @POST(ApiEndpointConstants.GET_CROSS_LAST_MINUTE_BUY)
    suspend fun getLastMinuteResponse(
        @Header("Content-Type") contentType: String?,
        @Query("sessionToken") sessionToken: String?,
        @Query("warehouseId") warehouseId: String?,
        @Query("pageNumber") pageNumber: Int?,
        @Query("type") type: String?,
        @Body subType: Set<String>?,
        @Query("pageSize") pageSize: Int?,
        @Query("variantId") variantId: Long?): Response<LastMinutePurchaseResponse>

    @POST(ApiEndpointConstants.FETCH_REORDER_OTC_PRODUCT_V1)
    suspend fun fetchReOrderOTCProductV1(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String?,
        @Body productCodes: Set<String?>?,
        @Query("customerId") customerId: String?,
        @Query("patientId") patientId: Long,
        @Query("orderId") orderId: Long
    ): Response<OTCResponse>

    @GET(ApiEndpointConstants.CHECK_PINCODE_SERVICEABILITY)
    suspend fun checkPinCodeServiceability(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("pincode") pincode: String?,
    ): Response<PinCodeServiceabilityResponse>

}