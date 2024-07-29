package com.intellihealth.truemeds.data.repository.datasourceimpl.remote

import com.google.gson.JsonObject
import com.intellihealth.truemeds.BuildConfig
import com.intellihealth.truemeds.data.api.OrderFlowApi
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
import com.intellihealth.truemeds.data.repository.datasource.remote.OrderFlowRemoteDataSource
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPspViewed
import com.intellihealth.truemeds.presentation.model.GetAllPatientModel
import com.intellihealth.truemeds.presentation.model.GetAllPrescriptionDataModel
import com.intellihealth.truemeds.presentation.model.OtcCategoriesForProductsResponse
import com.intellihealth.truemeds.presentation.model.OtcProductsForCategoriesRequest
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.NamedConstants
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Named

class OrderFlowRemoteDataSourceImpl @Inject constructor(
    private val orderFlowApi: OrderFlowApi,
    @Named(NamedConstants.CONTENT_TYPE) private val contentType: String
) : OrderFlowRemoteDataSource {

    //private val authorization: String = SharedPrefManager.getInstance().loggedInUserAccessToken

    /*var authorization = ""
    init {
        authorization = SharedPrefManager.getInstance().loggedInUserAccessToken
    }*/


    override suspend fun saveMedsAndCreateOrder(
        customerId: String,
        orderId: Long,
        medicineDto: List<MedicineDto>,
        offerId: String?,
        variantID: Long?,
        checkAutoConfirmEligibility: Boolean,
        newAlgo: Boolean,
        serialId: Long?,
        pincode: String
    ): Response<SaveMedsCreateEditOrderResponse> {
        return orderFlowApi.saveMedsAndCreateOrder(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            customerId,
            orderId,
            medicineDto,
            offerId,
            variantID,
            checkAutoConfirmEligibility,
            newAlgo,
            serialId,
            pincode
        )
    }

    override suspend fun replaceMedicineForIncompleteOrder(
        orderId: Long,
        medicineDto: List<MedicineDto>?,
        customerId: String,
        offerId: String,
        checkAutoConfirmEligibility: Boolean,
        newAlgo: Boolean,
        serialId: Long,
        variantId: Long?,
        pincode: String
    ): Response<SaveMedsCreateEditOrderResponse> {
        return orderFlowApi.replaceMedicineForIncompleteOrder(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            orderId,
            medicineDto,
            customerId,
            offerId,
            checkAutoConfirmEligibility,
            newAlgo,
            serialId,
            variantId,
            pincode
        )
    }

    override suspend fun editMedicine(
        orderId: Long?,
        medicineDto: List<MedicineDto>?,
        pincode: String
    ): Response<SaveMedsCreateEditOrderResponse> {
        return orderFlowApi.editMedicine(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            orderId,
            medicineDto,
            pincode
        )
    }

    override suspend fun getOrderMedicineDetails(orderId: Long): Response<GetOrderMedicineDetails> {
        return orderFlowApi.getOrderMedicineDetails(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            orderId
        )
    }

    override suspend fun getCustomerOrderDetails(
        orderId: Long,
        customerId: String
    ): Response<GetCustomerOrderDetails> {
        return orderFlowApi.getCustomerOrderDetails(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            orderId,
            customerId
        )
    }


    override suspend fun getPatientDetails(
        orderId: Long?,
        customerId: String
    ): Response<GetPatientDetailsResponse> {
//        return if (orderId == 0L) orderFlowApi.getPatientDetails(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, customerId)
        return orderFlowApi.getPatientDetails(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            orderId,
            customerId
        )
//        if (orderId == 0L) orderFlowApi.getPatientDetails(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, customerId)
    }

    override suspend fun getOrderRx(orderId: Long): Response<GetOrderRxResponse> {
        return orderFlowApi.getOrderRx(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            orderId
        )
    }

    override suspend fun setPaymentModeForAnOrder(
        orderId: Long?,
        paymentId: Int,
        offerId: Long
    ): Response<ResponseBody> {
        return orderFlowApi.setPaymentModeForAnOrder(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            orderId,
            paymentId,
            offerId
        )
    }

    override suspend fun uploadImage(
        pinCode: String,
        customerId: String?,
        uploadImageModel: ImageUploadRequest,
        variantId: Long?
    ): Response<SaveRxImageForCustomerIdResponse?> {
        return orderFlowApi.uploadImage(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            pinCode,
            customerId,
            uploadImageModel,
            if (SharedPrefManager.getInstance().algoSpecificVariantId < 0) null else SharedPrefManager.getInstance().algoSpecificVariantId
        )
    }

    override suspend fun getAllPrescriptionByCustomerId(customerId: String): Response<AllPrescriptionByCustomerResponse> {
        return orderFlowApi.getAllPrescriptionByCustomerId(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            customerId
        )
    }

    override suspend fun getAllOffers(
        customerId: String,
        result: Int
    ): Response<AllOffersResponse> {
        return orderFlowApi.getAllOffers(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            customerId,
            result
        )
    }

    override suspend fun savePaymentAndCouponForOrder(
        orderId: Long,
        paymentId: String,
        offerId: String
    ): Response<CouponSaveRemoveResponse> {
        return orderFlowApi.savePaymentAndCouponForOrder(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            orderId,
            paymentId,
            offerId
        )
    }

    override suspend fun saveCouponCode(
        couponCode: String?,
        orderId: Long?
    ): Response<ResponseBody> {
        return orderFlowApi.saveCouponCode(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            couponCode,
            orderId
        )
    }

    override suspend fun saveAddressForOrder(
        orderId: Long?,
        addressId: Long?,
        customerId: String?
    ): Response<SaveAddressForOrderResponse> {
        return orderFlowApi.saveAddressForOrder(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            orderId,
            addressId,
            customerId,
            true
        )
    }

    override suspend fun updatePatientIdInSubOrder(
        orderId: Long?,
        patientId: Long?,
        customerId: String?
    ): Response<ResponseBody> {
        return orderFlowApi.updatePatientIdInSubOrder(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            orderId,
            patientId,
            customerId
        )
    }

    override suspend fun fetchIconMaster(iconType: String?): Response<PaymentMethodResponse> {
        return orderFlowApi.fetchIconMaster(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            iconType
        )
    }

    override suspend fun setPaymentSelectionMethod(
        orderId: Long?,
        paymentMethodId: Long?,
        paymentMethod: String?,
        paymentMode : Long
    ): Response<ResponseBody> {
        return orderFlowApi.setPaymentSelectionMethod(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            orderId,
            paymentMethodId,
            paymentMethod,
            paymentMode
        )
    }
    
    override suspend fun setPspViewedByCustomer(
        orderId: Long?,
        isPspViewed: Boolean
    ): Response<ResponseBody> {
        return orderFlowApi.setPspViewedByCustomer(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            orderId,
            isPspViewed
        )
    }

    override suspend fun confirmOrder(
        orderId: Long,
        paymentId: String,
        offerId: String?,
        customerId: String,
        paymentMethod: String?,
        paymentMethodId: Long?,
        orderConfirmSrc: String?,
        sourceVersion: String,
        checkAutoConfirmEligibility: Boolean
    ): Response<ResponseBody> {
        return orderFlowApi.confirmOrder(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            orderId,
            paymentId,
            offerId,
            customerId,
            paymentMethod,
            paymentMethodId,
            orderConfirmSrc,
            sourceVersion,
            checkAutoConfirmEligibility
        )
    }

    /*override suspend fun incrementEventCounter(): Response<ResponseBody> {
        return orderFlowApi.incrementEventCounter(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken,)
    }*/

    override suspend fun discardOrder(orderId: Long, customerId: Long): Response<String> {
        return orderFlowApi.discardOrder(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            orderId,
            customerId
        )
    }

    override suspend fun getDoctorDetails(orderId: Long?): Response<DoctorDetails> {
        return orderFlowApi.getDoctorDetails(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            orderId
        )
    }

    override suspend fun setDoctorRating(ratingData: JsonObject?): Response<DoctorRating> {
        return orderFlowApi.setDoctorRating(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            ratingData
        )
    }

    override suspend fun getClickPostReturnLink(obj: JsonObject?): Response<ResponseBody> {
        return orderFlowApi.getClickPostReturnLink(contentType, obj)
    }

    override suspend fun changePaymentMode(
        orderId: Long,
        paymentModeId: String
    ): Response<ResponseBody> {
        return orderFlowApi.changePaymentMode(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            orderId,
            paymentModeId
        )
    }

    override suspend fun calculateBillDetailsforApp(
        orderId: Long,
        paymentSelectionInfo: Boolean
    ): Response<BillDetailResponse> {
        return orderFlowApi.calculateBillDetailsforApp(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            orderId,
            paymentSelectionInfo
        )
    }

    override suspend fun fetchAllOrdersOfCustomers(
        customerId: String,
        page: Int,
        result: Int,
        statusIds: Set<String?>?,
       // patientIds: Set<Long>?
        patientIds: String
    ): Response<AllCustomersOrdersResponseModel> {
        return orderFlowApi.fetchAllOrdersOfCustomers(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            customerId,
            page,
            result,
            patientIds,
            statusIds,

            )
    }

    override suspend fun getMyOrders(
        orderType: String,
        patientList: List<Long>
    ): Response<AllCustomersOrdersResponseModel> {
        return orderFlowApi.getMyOrders(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            orderType,
            patientList
        )
    }

    /*override suspend fun getAllPatientsOrderDetails(orderId: String?): Response<AllPatientsOrderDetailsResponse> {
        return orderFlowApi.getAllPatientsOrderDetails(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, orderId)
    }

    override suspend fun getOrderDetails(orderId: String?): Response<OrderDetailsResponse> {
        return orderFlowApi.getOrderDetails(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, orderId)
    }*/

    override suspend fun reOrder(
        orderId: Long?,
        customerId: String?,
        patientListDto: ArrayList<Long?>?,
        variant: String?,
        checkAutoConfirmEligibility: Boolean,
        newAlgo: Boolean,
        serialId: Int?,
        reOrderMedCheck: Boolean,
        variantId: Long?
    ): Response<ReorderResponse> {
        return orderFlowApi.reOrder(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            orderId,
            customerId,
            patientListDto,
            variant,
            checkAutoConfirmEligibility,
            newAlgo,
            serialId,
            false,
            variantId
        )
    }

    /*override suspend fun getPrescriptionImages(orderId: Long?): Response<PrescriptionImagesResponse> {
        return orderFlowApi.getPrescriptionImages(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            orderId
        )
    }*/

    /*override suspend fun getFtcCoupons(
        customerId: String?,
        categoryType: String?,
        version: String?
    ): Response<CouponExpiryDateResponse> {
        return orderFlowApi.getFtcCoupons(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            customerId,
            categoryType,
            version
        )
    }*/


    override suspend fun fetchCouponData(
        result: Int,
        pincode: String,
        offerType: String,
        categoryType: String,
        variantId: Long?
    ): Response<CouponCodeResponse> =
        orderFlowApi.fetchCouponData(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            result,
            pincode,
            offerType,
            categoryType,
            variantId,
            BuildConfig.VERSION_NAME,
            "APP"
        )

    /*    override suspend fun savePaymentAndCoupon(orderId: Long, paymentId: String, offerId:String)=
            orderFlowApi.savePaymentAndCoupon(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken,  orderId, paymentId, offerId)*/


    override suspend fun getAllAddress(
        customerId: String,
        orderId: Long
    ): Response<AddressResponse> =
        orderFlowApi.getAllAddress(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            customerId,
            orderId
        )

    override suspend fun getCustomerOrderDetail(
        customerId: String,
        orderId: String
    ): Response<CustomerOrderDetailResponse> =
        orderFlowApi.getCustomerOrderDetail(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            customerId,
            orderId
        )


    override suspend fun getLastMinuteResponse(
        sessionToken: String,
        warehouseId: String,
        pageNumber: Int,
        type: String,
        subType: Set<String>,
        pageSize: Int,
        variantId: Long
    ): Response<LastMinutePurchaseResponse> =
        orderFlowApi.getLastMinuteResponse(
            contentType,
            sessionToken,
            warehouseId,
            pageNumber,
            type,
            subType,
            pageSize,
            if (variantId < 0) null else variantId
        )

    override suspend fun getOtcProductsForCategories(request: OtcProductsForCategoriesRequest):
            Response<OtcCategoriesForProductsResponse> = orderFlowApi.getOtcProductsForCategories(
        contentType = contentType,
        authorization = SharedPrefManager.getInstance().loggedInUserAccessToken,
        isApp = request.isApp,
        id = request.id,
        type = request.type,
        collectionId = request.collectionId,
        page = request.page,
        result = request.result,
        body = request.brands,
        isBrandOnly = request.isBrandOnly,
        sessionToken = request.sessionToken,
        variantId = request.variantId?.toInt(),
        warehouseId = request.warehouseId,
    )

    override suspend fun fetchReOrderOTCProductV1(
        productCodes: Set<String?>?,
        customerId: String?,
        patientId: Long,
        orderId: Long
    ): Response<OTCResponse> {
        return orderFlowApi.fetchReOrderOTCProductV1(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            productCodes,
            customerId,
            patientId,
            orderId
        )
    }


    override suspend fun checkPincodeServiceability(pincode: String?): Response<PinCodeServiceabilityResponse> {
        return orderFlowApi.checkPinCodeServiceability(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            pincode
        )
    }

    override suspend fun deleteImage(
        orderId: Long,
        edit: Boolean,
        images: List<Long>,
        customerId: String
    ): Response<ResponseBody> {
        return orderFlowApi.deleteImages(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            orderId,
            edit,
            images,
            customerId
        )
    }

    override suspend fun getPatientAndPrescriptionDetails(
        customerId: Long,
        patientId: String?
    ): Response<GetAllPrescriptionDataModel> {
        return orderFlowApi.getPatientAndPrescriptionDetails(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            customerId,
            patientId
        )
    }

    override suspend fun getPatientDetails(customerId: Long): Response<GetAllPatientModel> {
        return orderFlowApi.getPatientAndPrescriptionDetails(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            customerId
        )
    }
}