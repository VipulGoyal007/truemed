package com.intellihealth.truemeds.domain.usecase

import com.google.gson.Gson
import com.intellihealth.truemeds.data.model.home.ApiCoreResponse
import com.intellihealth.truemeds.data.model.home.ReorderResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.domain.repository.OrderFlowRepository
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import javax.inject.Inject


//@HiltViewModel
class ReorderUseCase @Inject constructor(private val orderFlowRepository: OrderFlowRepository,
    private val sdkEventUseCase: SdkEventUseCase) {

    suspend fun reOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long?,//
        customerId: String?,//
        patientListDto: ArrayList<Long?>?,
        variant: String?,//SP - algo spe
        checkAutoConfirmEligibility: Boolean,//true
        newAlgo: Boolean,//true
        serialId: Int?,//SP src type
        reOrderMedCheck: Boolean,
        variantId: Long?
    ): ReorderResponse? {

        var response: ReorderResponse? = null
        SharedPrefManager.getInstance().couponModel = null

        when (val reorderResponse = orderFlowRepository.reOrder(mxInternalErrorOccurred,
            orderId,
            customerId,
            patientListDto,
            variant,
            checkAutoConfirmEligibility,
            newAlgo,
            serialId,
            reOrderMedCheck,
            variantId
        )) {
            is Resource.Success -> {
                reorderResponse.value?.let {
                    response = it.body()
                    if (!it.isSuccessful) {
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

            is Resource.Failure -> reorderResponse.errorCode
            else -> {}
        }
        return response
    }



}