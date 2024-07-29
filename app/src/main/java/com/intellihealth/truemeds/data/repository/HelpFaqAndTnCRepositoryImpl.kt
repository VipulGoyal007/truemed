package com.intellihealth.truemeds.data.repository

import com.intellihealth.truemeds.data.model.helpfaqtnc.AcceptedPPAndTnCResponse
import com.intellihealth.truemeds.data.model.helpfaqtnc.FaqCategoryResponse
import com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse
import com.intellihealth.truemeds.data.model.helpfaqtnc.PrivacyPolicyAndTnCResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.repository.datasource.remote.HelpFaqAndTnCRemoteDataSource
import com.intellihealth.truemeds.data.utils.ApiCallInitClass
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.domain.repository.HelpFaqAndTnCRepository
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject

class HelpFaqAndTnCRepositoryImpl @Inject constructor(
    private val helpFaqAndTnCRemoteDataSource: HelpFaqAndTnCRemoteDataSource,
    private val apiCallInitClass: ApiCallInitClass
) : HelpFaqAndTnCRepository {
    override suspend fun getHelpCategory(
        mxInternalErrorOccurred: MxInternalErrorOccurred
    ): Resource<Response<HelpCategoryResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { helpFaqAndTnCRemoteDataSource.getHelpCategory() }
    }

    override suspend fun getHelpCategoryDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        reasonId: String
    ): Resource<Response<HelpCategoryResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { helpFaqAndTnCRemoteDataSource.getHelpCategoryDetails(reasonId) }
    }

    override suspend fun getAllFAQCategory(
        mxInternalErrorOccurred: MxInternalErrorOccurred
    ): Resource<Response<FaqCategoryResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { helpFaqAndTnCRemoteDataSource.getAllFAQCategory() }
    }

    override suspend fun getFAQByCategory(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        categoryId: Int
    ): Resource<Response<FaqCategoryResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { helpFaqAndTnCRemoteDataSource.getFAQByCategory(categoryId) }
    }

    override suspend fun getPP(
        mxInternalErrorOccurred: MxInternalErrorOccurred
    ): Resource<Response<PrivacyPolicyAndTnCResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { helpFaqAndTnCRemoteDataSource.getPP() }
    }

    override suspend fun getTNC(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        isPrimary: Boolean
    ): Resource<Response<PrivacyPolicyAndTnCResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { helpFaqAndTnCRemoteDataSource.getTNC(isPrimary) }
    }

    override suspend fun checkIfCustomerAcceptedPPAndTNC(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String
    ): Resource<Response<AcceptedPPAndTnCResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            helpFaqAndTnCRemoteDataSource.checkIfCustomerAcceptedPPAndTNC(
                customerId
            )
        }
    }

    override suspend fun acceptPPOrTNC(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String,
        type: String
    ): Resource<Response<ResponseBody>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { helpFaqAndTnCRemoteDataSource.acceptPPOrTNC(customerId, type) }
    }
}