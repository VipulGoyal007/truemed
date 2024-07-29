package com.intellihealth.truemeds.domain.usecase

import com.google.gson.Gson
import com.intellihealth.truemeds.data.model.home.ApiCoreResponse
import android.util.Log
import com.intellihealth.truemeds.data.model.home.PinCodeServiceabilityResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.ordersummary.AddressResponse
import com.intellihealth.truemeds.data.model.ordersummary.CustomerOrderDetailResponse
import com.intellihealth.truemeds.data.model.ordersummary.LastMinutePurchaseResponse
import com.intellihealth.truemeds.data.model.ordersummary.OTCResponse
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.domain.repository.OrderFlowRepository
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import javax.inject.Inject

class CartUseCase @Inject constructor(
    private val orderFlowRepository: OrderFlowRepository,
    private val sdkEventUseCase: SdkEventUseCase

) {

    suspend fun getAllAddress(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String, orderId: Long
    ): AddressResponse? =
        when (val res = orderFlowRepository.getAllAddress(mxInternalErrorOccurred,customerId, orderId)) {
            is Resource.Success -> if(res.value?.isSuccessful==true) {
                if((res.value.body()?.responseData?.size ?: 0) > 0) {
                    SharedPrefManager.getInstance().selectedState =
                        res.value?.body()?.responseData?.get(0)?.stateName ?: ""
                }
                res.value.body()
            } else {
                try {
                    mxInternalErrorOccurred.errorCode = res.value?.code()
                    mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                        res.value?.errorBody()?.string(),
                        ApiCoreResponse::class.java
                    ).message
                    sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                } catch (_: Exception) {
                }
                null
            }
            is Resource.Failure -> null
            else -> null
        }


    suspend fun getCustomerOrderDetail(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String, orderId: String
    ): CustomerOrderDetailResponse? =
        when (val res = orderFlowRepository.getCustomerOrderDetail(mxInternalErrorOccurred,customerId, orderId)) {
            is Resource.Success -> if(res.value?.isSuccessful==true) res.value.body() else {
                try {
                    mxInternalErrorOccurred.errorCode = res.value?.code()
                    mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                        res.value?.errorBody()?.string(),
                        ApiCoreResponse::class.java
                    ).message
                    sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                } catch (_: Exception) {
                }
                null
            }
            is Resource.Failure -> null
            else -> null
        }


    suspend fun getCrossSellingRecommendedProducts(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        sessionToken: String,
        warehouseId: String,
        pageNumber: Int,
        type: String,
        subType: Set<String>,
        pageSize: Int,
        variantId: Long
    ): LastMinutePurchaseResponse? =
        when (val res = orderFlowRepository.getLastMinuteResponse(mxInternalErrorOccurred,
            sessionToken,
            warehouseId,
            pageNumber,
            type,
            subType,
            pageSize,
            variantId
        )) {
            is Resource.Success -> if(res.value?.isSuccessful==true) res.value.body() else {
                try {
                    mxInternalErrorOccurred.errorCode = res.value?.code()
                    mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                        res.value?.errorBody()?.string(),
                        ApiCoreResponse::class.java
                    ).message
                    sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                } catch (_: Exception) {
                }
                null
            }
            is Resource.Failure -> null
            else -> null
        }


    suspend fun fetchReOrderOTCProductV1(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        productCodes: Set<String?>?,
        customerId: String?,
        patientId: Long,
        orderId: Long
    ): OTCResponse? =
        when (val res = orderFlowRepository.fetchReOrderOTCProductV1(mxInternalErrorOccurred,
            productCodes,
            customerId,
            patientId,
            orderId
        )) {
            is Resource.Success -> if(res.value?.isSuccessful==true) res.value.body() else {
                try {
                    mxInternalErrorOccurred.errorCode = res.value?.code()
                    mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                        res.value?.errorBody()?.string(),
                        ApiCoreResponse::class.java
                    ).message
                    sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                } catch (_: Exception) {
                }
                null
            }
            is Resource.Failure -> null
            else -> null
        }


    suspend fun checkPinCodeServiceability(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        pincode: String?
    ): PinCodeServiceabilityResponse? {
        var response: PinCodeServiceabilityResponse? = null
        when (val pinCodeServiceabilityResponse =
            orderFlowRepository.checkPincodeServiceability(mxInternalErrorOccurred,pincode)) {
            is Resource.Success -> {
                pinCodeServiceabilityResponse.value?.let {
                    response = it.body()
                    if(!it.isSuccessful){
                        try {
                            mxInternalErrorOccurred.errorCode = it.code()
                            mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                                it.errorBody()?.string(),
                                ApiCoreResponse::class.java
                            ).message
                            sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                        } catch (_: Exception) {
                        }
                    }
                }
            }

            is Resource.Failure -> {
                pinCodeServiceabilityResponse.errorCode?.let {
                    response = PinCodeServiceabilityResponse(
                        "Failure",
                        "Sorry! We currently do not deliver to this location",
                        pinCodeServiceabilityResponse.errorCode,
                        PinCodeServiceabilityResponse.ResponseData(
                            null,
                            isServicable = false,
                            pincodeData = null)
                    )
                }
            }

            else -> {
                response = PinCodeServiceabilityResponse(
                    "Failure",
                    "Sorry! We currently do not deliver to this location",
                    500,
                    PinCodeServiceabilityResponse.ResponseData(
                        null,
                        isServicable = false,
                        pincodeData = null)
                )
            }
        }
        return response
    }
}