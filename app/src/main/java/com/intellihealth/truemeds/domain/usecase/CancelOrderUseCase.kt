package com.intellihealth.truemeds.domain.usecase

import com.google.gson.Gson
import com.intellihealth.salt.models.RadioListModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse
import com.intellihealth.truemeds.data.model.home.ApiCoreResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.domain.repository.CancelOrderRepository
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase
import okhttp3.ResponseBody
import javax.inject.Inject

class CancelOrderUseCase @Inject constructor(
    private val cancelOrderRepository: CancelOrderRepository,
    private val sdkEventUseCase: SdkEventUseCase
) {
    suspend fun getReasonsForOrderCancellation(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
    ): CancelReasonResponse? {
        return when (val res =
            cancelOrderRepository.getReasonsForOrderCancellation(mxInternalErrorOccurred)) {
            is Resource.Success -> if (res.value?.isSuccessful == true) res.value.body() else {
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
    }

    suspend fun getL1ReasonsForOrderCancellation(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
    ): CancelReasonResponse? {
        return when (val res =
            cancelOrderRepository.getL1ReasonsForOrderCancellation(mxInternalErrorOccurred)) {
            is Resource.Success -> if (res.value?.isSuccessful == true) res.value.body() else {
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
    }

    suspend fun getSubsReasonsForOrderCancellation(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        reasonId: String
    ): CancelReasonResponse? {
        return when (val res =
            cancelOrderRepository.getSubsReasonsForOrderCancellation(
                mxInternalErrorOccurred,
                reasonId
            )) {
            is Resource.Success -> if (res.value?.isSuccessful == true) res.value.body() else {
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
    }

    suspend fun cancelOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        reasonId: String?,
        notes: String?,
        cancelledById: Int
    ): ResponseBody? {
        return when (val res =
            cancelOrderRepository.cancelOrder(
                mxInternalErrorOccurred,
                orderId,
                reasonId,
                notes,
                cancelledById
            )) {
            is Resource.Success -> if (res.value?.isSuccessful == true) res.value.body() else {
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
    }

    suspend fun discardOrderWithReason(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        reasonId: String?,
        notes: String?,
        cancelledById: Int
    ): ResponseBody? {
        return when (val res =
            cancelOrderRepository.discardOrderWithReason(
                mxInternalErrorOccurred,
                orderId,
                reasonId,
                notes,
                cancelledById
            )) {
            is Resource.Success -> if (res.value?.isSuccessful == true) res.value.body() else {
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
    }

    fun getRadioList(cancelOrderReasonResponse: CancelReasonResponse?): List<RadioListModel>? {
        return cancelOrderReasonResponse?.responseData?.map {
            RadioListModel(
                it?.reasonId!!,
                it.value.toString(),
                it.isChecked,
                R.color.light_grey_color,
                8
            )
        }
    }

}