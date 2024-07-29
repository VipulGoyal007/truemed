package com.intellihealth.truemeds.data.repository

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
import com.intellihealth.truemeds.data.repository.datasource.remote.ElasticMedicineRemoteDataSource
import com.intellihealth.truemeds.data.repository.datasource.remote.OrderFlowRemoteDataSource
import com.intellihealth.truemeds.data.utils.ApiCallInitClass
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.domain.repository.OrderFlowRepository
import com.intellihealth.truemeds.presentation.model.GetAllPatientModel
import com.intellihealth.truemeds.presentation.model.GetAllPrescriptionDataModel
import com.intellihealth.truemeds.presentation.model.MedicineDetailsResultResponse
import com.intellihealth.truemeds.presentation.model.OtcCategoriesForProductsResponse
import com.intellihealth.truemeds.presentation.model.OtcProductsForCategoriesRequest
import com.intellihealth.truemeds.presentation.model.SearchResultResponse
import com.intellihealth.truemeds.presentation.utils.ApiParameterConstants
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject

class OrderFlowRepositoryImpl @Inject constructor(
    private val orderFlowRemoteDataSource: OrderFlowRemoteDataSource,
    private val elasticMedicineRemoteDataSource: ElasticMedicineRemoteDataSource,
    private val apiCallInitClass: ApiCallInitClass
) : OrderFlowRepository {
    override suspend fun saveMedsAndCreateOrder(
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
    ): Resource<Response<SaveMedsCreateEditOrderResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            orderFlowRemoteDataSource.saveMedsAndCreateOrder(
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
    }

    override suspend fun replaceMedicineForIncompleteOrder(
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
    ): Resource<Response<SaveMedsCreateEditOrderResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            orderFlowRemoteDataSource.replaceMedicineForIncompleteOrder(
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
    }

    override suspend fun editMedicine(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long?,
        medicineDto: List<MedicineDto>?,
        pincode: String
    ): Resource<Response<SaveMedsCreateEditOrderResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { orderFlowRemoteDataSource.editMedicine(orderId, medicineDto, pincode) }
    }

    override suspend fun getOrderMedicineDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred, orderId: Long
    ): Resource<Response<GetOrderMedicineDetails>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { orderFlowRemoteDataSource.getOrderMedicineDetails(orderId) }
    }

    override suspend fun getCustomerOrderDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        customerId: String
    ): Resource<Response<GetCustomerOrderDetails>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            orderFlowRemoteDataSource.getCustomerOrderDetails(
                orderId,
                customerId
            )
        }
    }


    override suspend fun getOrderRx(
        mxInternalErrorOccurred: MxInternalErrorOccurred, orderId: Long
    ): Resource<Response<GetOrderRxResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { orderFlowRemoteDataSource.getOrderRx(orderId) }
    }

    override suspend fun getPatientDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long?,
        customerId: String
    ): Resource<Response<GetPatientDetailsResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { orderFlowRemoteDataSource.getPatientDetails(orderId, customerId) }
    }

    override suspend fun setPaymentModeForAnOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long?,
        paymentId: Int,
        offerId: Long
    ): Resource<Response<ResponseBody>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            orderFlowRemoteDataSource.setPaymentModeForAnOrder(
                orderId,
                paymentId,
                offerId
            )
        }
    }

    override suspend fun uploadImage(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        pinCode: String,
        customerId: String?,
        uploadImageModel: ImageUploadRequest,
        variantId: Long?
    ): Resource<Response<SaveRxImageForCustomerIdResponse?>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            orderFlowRemoteDataSource.uploadImage(
                pinCode,
                customerId,
                uploadImageModel,
                variantId
            )
        }
    }

    override suspend fun getAllPrescriptionByCustomerId(
        mxInternalErrorOccurred: MxInternalErrorOccurred, customerId: String
    ): Resource<Response<AllPrescriptionByCustomerResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { orderFlowRemoteDataSource.getAllPrescriptionByCustomerId(customerId) }
    }

    override suspend fun getAllOffers(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String,
        result: Int
    ): Resource<Response<AllOffersResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { orderFlowRemoteDataSource.getAllOffers(customerId, result) }
    }

    override suspend fun savePaymentAndCouponForOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        paymentId: String,
        offerId: String
    ): Resource<Response<CouponSaveRemoveResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            orderFlowRemoteDataSource.savePaymentAndCouponForOrder(
                orderId,
                paymentId,
                offerId
            )
        }
    }

    override suspend fun saveCouponCode(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        couponCode: String?,
        orderId: Long?
    ): Resource<Response<ResponseBody>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { orderFlowRemoteDataSource.saveCouponCode(couponCode, orderId) }
    }

    override suspend fun saveAddressForOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long?,
        addressId: Long?,
        customerId: String?
    ): Resource<Response<SaveAddressForOrderResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            orderFlowRemoteDataSource.saveAddressForOrder(
                orderId,
                addressId,
                customerId
            )
        }
    }

    override suspend fun updatePatientIdInSubOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long?,
        patientId: Long?,
        customerId: String?
    ): Resource<Response<ResponseBody>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            orderFlowRemoteDataSource.updatePatientIdInSubOrder(
                orderId,
                patientId,
                customerId
            )
        }
    }

    override suspend fun fetchIconMaster(
        mxInternalErrorOccurred: MxInternalErrorOccurred, iconType: String?
    ): Resource<Response<PaymentMethodResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { orderFlowRemoteDataSource.fetchIconMaster(iconType) }
    }

    override suspend fun setPaymentSelectionMethod(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long?,
        paymentMethodId: Long?,
        paymentMethod: String?,
        paymentMode: Long
    ): Resource<Response<ResponseBody>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            orderFlowRemoteDataSource.setPaymentSelectionMethod(
                orderId,
                paymentMethodId,
                paymentMethod,
                paymentMode
            )
        }
    }
    
    override suspend fun setPspViewedByCustomer(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long?,
        isPspViewed: Boolean
    ): Resource<Response<ResponseBody>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            orderFlowRemoteDataSource.setPspViewedByCustomer(
                orderId,
                isPspViewed
            )
        }
    }

    override suspend fun confirmOrder(
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
    ): Resource<Response<ResponseBody>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            orderFlowRemoteDataSource.confirmOrder(
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
    }

    override suspend fun discardOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        customerId: Long
    ): Resource<Response<String>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { orderFlowRemoteDataSource.discardOrder(orderId, customerId) }
    }

    override suspend fun getDoctorDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred, orderId: Long?
    ): Resource<Response<DoctorDetails>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { orderFlowRemoteDataSource.getDoctorDetails(orderId) }
    }

    override suspend fun setDoctorRating(
        mxInternalErrorOccurred: MxInternalErrorOccurred, ratingData: JsonObject?
    ): Resource<Response<DoctorRating>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { orderFlowRemoteDataSource.setDoctorRating(ratingData) }
    }

    override suspend fun getClickPostReturnLink(
        mxInternalErrorOccurred: MxInternalErrorOccurred, obj: JsonObject?
    ): Resource<Response<ResponseBody>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { orderFlowRemoteDataSource.getClickPostReturnLink(obj) }
    }

    override suspend fun changePaymentMode(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        paymentModeId: String
    ): Resource<Response<ResponseBody>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { orderFlowRemoteDataSource.changePaymentMode(orderId, paymentModeId) }
    }

    override suspend fun calculateBillDetailsforApp(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        paymentSelectionInfo: Boolean
    ): Resource<Response<BillDetailResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            orderFlowRemoteDataSource.calculateBillDetailsforApp(
                orderId,
                paymentSelectionInfo
            )
        }
    }

    override suspend fun fetchAllOrdersOfCustomers(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String,
        page: Int,
        result: Int,
        statusIds: Set<String?>?,
        // patientIds: Set<Long>?
        patientIds: String
    ): Resource<Response<AllCustomersOrdersResponseModel>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            orderFlowRemoteDataSource.fetchAllOrdersOfCustomers(
                customerId,
                page,
                result,
                statusIds,
                patientIds
            )
        }
    }

    override suspend fun getMyOrders(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderType: String,
        patientList: List<Long>
    ): Resource<Response<AllCustomersOrdersResponseModel>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            orderFlowRemoteDataSource.getMyOrders(
                orderType,
                patientList
            )
        }
    }

    override suspend fun reOrder(
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
    ): Resource<Response<ReorderResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            orderFlowRemoteDataSource.reOrder(
                orderId,
                customerId,
                patientListDto,
                variant,
                checkAutoConfirmEligibility,
                newAlgo,
                serialId,
                reOrderMedCheck,
                variantId
            )
        }
    }

    override suspend fun getSearchResults(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        warehouseId: String,
        elasticSearchType: String,
        searchString: String,
        sizeCount: Int,
        page: Int,
        variantId: Long?,
        searchVariant: String,
        isMultiSearch: Boolean
    ): Resource<Response<SearchResultResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            elasticMedicineRemoteDataSource.fetchSearchResults(
                warehouseId,
                elasticSearchType,
                searchString,
                sizeCount,
                page,
                variantId,
                searchVariant,
                isMultiSearch
            )
        }
    }

    override suspend fun getTrendingSearches(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        warehouseId: String?,
        sessionToken: String?,
        pageNumber: Int?,
        pageSize: Int?
    ): Resource<Response<TrendingSearchResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            elasticMedicineRemoteDataSource.getTrendingSearches(
                warehouseId,
                sessionToken,
                pageNumber,
                pageSize
            )
        }

    }

    override suspend fun fetchMedicineDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        productCd: String,
        warehouseId: String
    ): Resource<Response<MedicineDetailsResultResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            elasticMedicineRemoteDataSource.fetchMedicineDetails(
                productCd,
                warehouseId
            )
        }
    }


    override suspend fun fetchCouponData(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        result: Int,
        pincode: String,
        offerType: String,
        categoryType: String,
        variantId: Long?
    ): Resource<Response<CouponCodeResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            orderFlowRemoteDataSource.fetchCouponData(
                result,
                pincode,
                offerType,
                categoryType,
                variantId
            )
        }
    }

    override suspend fun getAllAddress(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String, orderId: Long
    ): Resource<Response<AddressResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { orderFlowRemoteDataSource.getAllAddress(customerId, orderId) }
    }

    override suspend fun getCustomerOrderDetail(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String, orderId: String
    ): Resource<Response<CustomerOrderDetailResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { orderFlowRemoteDataSource.getCustomerOrderDetail(customerId, orderId) }
    }

    override suspend fun getLastMinuteResponse(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        sessionToken: String,
        warehouseId: String,
        pageNumber: Int,
        type: String,
        subType: Set<String>,
        pageSize: Int,
        variantId: Long
    ): Resource<Response<LastMinutePurchaseResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            orderFlowRemoteDataSource.getLastMinuteResponse(
                sessionToken,
                warehouseId,
                pageNumber,
                type,
                subType,
                pageSize,
                variantId
            )
        }
    }


    override suspend fun getCrossSellingRecommendedProducts(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        sessionToken: String?,
        warehouseId: String?,
        pageNumber: Int,
        pageSize: Int?,
        type: String,
        productCode: String,
        variantId: Long?
    ): Resource<Response<CrossSellingRecommendedProductResponse>> {
        val crossSellType: MutableSet<String> = HashSet()
        crossSellType.add(ApiParameterConstants.CUSTOMER_ALSO_BOUGHT)
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            elasticMedicineRemoteDataSource.getCrossSellingRecommendedProducts(
                sessionToken = sessionToken,
                warehouseId = warehouseId,
                pageNumber = pageNumber,
                pageSize = pageSize,
                type = type,
                productCode = productCode,
                variantId = variantId,
                subType = crossSellType
            )
        }
    }

    override suspend fun getOtcProductsForCategories(
        mxInternalErrorOccurred: MxInternalErrorOccurred, request: OtcProductsForCategoriesRequest
    ): Resource<Response<OtcCategoriesForProductsResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { orderFlowRemoteDataSource.getOtcProductsForCategories(request) }
    }


    override suspend fun fetchReOrderOTCProductV1(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        productCodes: Set<String?>?,
        customerId: String?,
        patientId: Long,
        orderId: Long
    ): Resource<Response<OTCResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            orderFlowRemoteDataSource.fetchReOrderOTCProductV1(
                productCodes,
                customerId,
                patientId,
                orderId
            )
        }
    }


    override suspend fun checkPincodeServiceability(
        mxInternalErrorOccurred: MxInternalErrorOccurred, pincode: String?
    ): Resource<Response<PinCodeServiceabilityResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { orderFlowRemoteDataSource.checkPincodeServiceability(pincode) }
    }

    override suspend fun deleteImages(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        edit: Boolean,
        images: List<Long>,
        customerId: String
    ): Resource<Response<ResponseBody>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            orderFlowRemoteDataSource.deleteImage(
                orderId,
                edit,
                images,
                customerId
            )
        }
    }

    override suspend fun getPrescriptionDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: Long,
        patientId: String?
    ): Resource<Response<GetAllPrescriptionDataModel>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            orderFlowRemoteDataSource.getPatientAndPrescriptionDetails(
                customerId,
                patientId
            )
        }
    }

    override suspend fun getPatientDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred, customerId: Long
    ): Resource<Response<GetAllPatientModel>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { orderFlowRemoteDataSource.getPatientDetails(customerId) }
    }
}