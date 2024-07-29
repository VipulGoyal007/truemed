package com.intellihealth.truemeds.data.repository.datasource.remote

import com.google.gson.JsonObject
import com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse
import com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse
import com.intellihealth.truemeds.data.model.doctordetails.DoctorDetails
import com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel
import com.intellihealth.truemeds.data.model.home.PinCodeServiceabilityResponse
import com.intellihealth.truemeds.data.model.home.ReorderResponse
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
import com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse
import com.intellihealth.truemeds.presentation.model.GetAllPatientModel
import com.intellihealth.truemeds.presentation.model.GetAllPrescriptionDataModel
import com.intellihealth.truemeds.presentation.model.OtcCategoriesForProductsResponse
import com.intellihealth.truemeds.presentation.model.OtcProductsForCategoriesRequest
import okhttp3.ResponseBody
import retrofit2.Response

interface OrderFlowRemoteDataSource {

    suspend fun saveMedsAndCreateOrder(
        customerId: String,
        orderId: Long,
        medicineDto: List<MedicineDto>,
        offerId: String?,
        variantID: Long?,
        checkAutoConfirmEligibility: Boolean,
        newAlgo: Boolean,
        serialId: Long?,
        pincode: String
    ): Response<SaveMedsCreateEditOrderResponse>


    suspend fun replaceMedicineForIncompleteOrder(
        orderId: Long,
        medicineDto: List<MedicineDto>?,
        customerId: String,
        offerId: String,
        checkAutoConfirmEligibility: Boolean,
        newAlgo: Boolean,
        serialId: Long,
        variantId: Long?,
        pincode: String
    ): Response<SaveMedsCreateEditOrderResponse>


    suspend fun editMedicine(
        orderId: Long?,
        medicineDto: List<MedicineDto>?,
        pincode: String
    ): Response<SaveMedsCreateEditOrderResponse>


    suspend fun getOrderMedicineDetails(orderId: Long): Response<GetOrderMedicineDetails>

    suspend fun getCustomerOrderDetails(
        orderId: Long,
        customerId: String
    ): Response<GetCustomerOrderDetails>

    suspend fun getPatientDetails(
        orderId: Long?,
        customerId: String
    ): Response<GetPatientDetailsResponse>

    suspend fun getOrderRx(orderId: Long): Response<GetOrderRxResponse>

    suspend fun setPaymentModeForAnOrder(
        orderId: Long?,
        paymentId: Int,
        offerId: Long
    ): Response<ResponseBody>


    suspend fun uploadImage(
        pinCode: String,
        customerId: String?,
        uploadImageModel: ImageUploadRequest,
        variantId: Long?
    ): Response<SaveRxImageForCustomerIdResponse?>


    suspend fun getAllPrescriptionByCustomerId(customerId: String): Response<AllPrescriptionByCustomerResponse>

    suspend fun getAllOffers(
        customerId: String,
        result: Int
    ): Response<AllOffersResponse>


    suspend fun savePaymentAndCouponForOrder(
        orderId: Long,
        paymentId: String,
        offerId: String
    ): Response<CouponSaveRemoveResponse>


    suspend fun saveCouponCode(
        couponCode: String?,
        orderId: Long?
    ): Response<ResponseBody>


    suspend fun saveAddressForOrder(
        orderId: Long?,
        addressId: Long?,
        customerId: String?
    ): Response<SaveAddressForOrderResponse>


    suspend fun updatePatientIdInSubOrder(
        orderId: Long?,
        patientId: Long?,
        customerId: String?
    ): Response<ResponseBody>

    suspend fun fetchIconMaster(
        iconType: String?
    ): Response<PaymentMethodResponse>


    suspend fun setPaymentSelectionMethod(
        orderId: Long?,
        paymentMethodId: Long?,
        paymentMethod: String?,
        paymentMode : Long
    ): Response<ResponseBody>
    
    
    suspend fun setPspViewedByCustomer(
        orderId: Long?,
        isPspViewed: Boolean
    ): Response<ResponseBody>
    
    suspend fun confirmOrder(
        orderId: Long,
        paymentId: String,
        offerId: String?,
        customerId: String,
        paymentMethod: String?,
        paymentMethodId: Long?,
        orderConfirmSrc: String?,
        sourceVersion: String,
        checkAutoConfirmEligibility: Boolean
    ): Response<ResponseBody>


    /*suspend fun incrementEventCounter(): Response<ResponseBody>*/

    suspend fun discardOrder(orderId: Long, customerId: Long): Response<String>


    suspend fun getDoctorDetails(orderId: Long?): Response<DoctorDetails>


    suspend fun setDoctorRating(ratingData: JsonObject?): Response<DoctorRating>


    suspend fun getClickPostReturnLink(obj: JsonObject?): Response<ResponseBody>

    suspend fun changePaymentMode(
        orderId: Long,
        paymentModeId: String,
    ): Response<ResponseBody>

    suspend fun fetchAllOrdersOfCustomers(
        customerId: String,
        page: Int,
        result: Int,
        statusIds: Set<String?>?,
        //patientIds: Set<Long>?
        patientIds: String
    ): Response<AllCustomersOrdersResponseModel>

    suspend fun getMyOrders(
        orderType: String,
        patientList: List<Long>
    ): Response<AllCustomersOrdersResponseModel>

    /*suspend fun getAllPatientsOrderDetails(orderId: Long?): Response<AllPatientsOrderDetailsResponse>
    suspend fun getOrderDetails(orderId: Long?): Response<OrderDetailsResponse>*/
    suspend fun reOrder(
        orderId: Long?,
        customerId: String?,
        patientListDto: ArrayList<Long?>?,
        variant: String?,
        checkAutoConfirmEligibility: Boolean,
        newAlgo: Boolean,
        serialId: Int?,
        reOrderMedCheck: Boolean,
        variantId: Long?
    ): Response<ReorderResponse>

    suspend fun calculateBillDetailsforApp(
        orderId: Long,
        paymentSelectionInfo: Boolean
    ): Response<BillDetailResponse>

    /*suspend fun getPrescriptionImages(orderId: Long?): Response<PrescriptionImagesResponse>*/

    /*suspend fun getFtcCoupons(
        customerId: String?,
        categoryType: String?,
        version: String?
    ): Response<CouponExpiryDateResponse>*/

    suspend fun fetchCouponData(
        result: Int,
        pincode: String,
        offerType: String,
        categoryType: String,
        variantId: Long?
    ): Response<CouponCodeResponse>

    /*suspend fun savePaymentAndCoupon(
        orderId: Long,
        paymentId: String,
        offerId: String
    )*/

    suspend fun getAllAddress(customerId: String, orderId: Long): Response<AddressResponse>
    suspend fun getCustomerOrderDetail(
        customerId: String,
        orderId: String
    ): Response<CustomerOrderDetailResponse>

    suspend fun getLastMinuteResponse(
        sessionToken: String,
        warehouseId: String,
        pageNumber: Int,
        type: String,
        subType: Set<String>,
        pageSize: Int,
        variantId: Long
    ): Response<LastMinutePurchaseResponse>


    suspend fun getOtcProductsForCategories(request: OtcProductsForCategoriesRequest):
            Response<OtcCategoriesForProductsResponse>

    suspend fun fetchReOrderOTCProductV1(
        productCodes: Set<String?>?,
        customerId: String?,
        patientId: Long,
        orderId: Long
    ): Response<OTCResponse>

    suspend fun checkPincodeServiceability(pincode: String?): Response<PinCodeServiceabilityResponse>

    suspend fun deleteImage(
        orderId: Long,
        edit: Boolean,
        images: List<Long>,
        customerId: String
    ): Response<ResponseBody>

    suspend fun getPatientAndPrescriptionDetails(
        customerId: Long,
        patientId: String?
    ): Response<GetAllPrescriptionDataModel>

    suspend fun getPatientDetails(customerId: Long): Response<GetAllPatientModel>
}