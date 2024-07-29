package com.intellihealth.truemeds.domain.usecase

import com.google.gson.Gson
import com.intellihealth.truemeds.data.model.home.ApiCoreResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.data.utils.ResponseData
import com.intellihealth.truemeds.domain.repository.ProductListAndDetailsRepository
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase
import okhttp3.ResponseBody
import javax.inject.Inject

class ProductListAndDetailsUseCase @Inject constructor(
    private val productListAndDetailsRepository: ProductListAndDetailsRepository,
    private val sdkEventUseCase: SdkEventUseCase
) {

    suspend fun getCrossSellingRecommendedProducts(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        warehouseId: String?,
        sessionToken: String?,
        pageNumber: Int?,
        type: String?,
        subType: Set<String>?,
        pageSize: Int?,
        variantId: Long?
    ): CrossSellingRecommendedProductResponse? {

        var response: CrossSellingRecommendedProductResponse? = null
        when (val res = productListAndDetailsRepository.getCrossSellingRecommendedProducts(
            mxInternalErrorOccurred,
            sessionToken,
            warehouseId,
            pageNumber, pageSize, type, "", variantId, subType
        )) {
            is Resource.Success -> {
                res.value?.let {
                    if (it.isSuccessful) {
                        response = it.body()
                    } else {
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
                res.errorCode?.let {
                    res.errorBody?.let { resErrorBody ->
                        setErrorResponseBody(
                            res.errorCode,
                            resErrorBody, res.isNetworkError
                        )
                    }
                }

            }

            else -> {}
        }
        return response ?: CrossSellingRecommendedProductResponse()
    }

    private suspend fun setErrorResponseBody(
        errorCode: Int,
        errorBody: ResponseBody,
        isNetworkError: Boolean
    ): ResponseData {
        return ResponseData(errorCode, errorBody, isNetworkError)
    }
}