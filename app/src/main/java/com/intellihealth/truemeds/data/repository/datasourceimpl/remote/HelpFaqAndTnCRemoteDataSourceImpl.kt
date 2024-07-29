package com.intellihealth.truemeds.data.repository.datasourceimpl.remote

import com.intellihealth.truemeds.data.api.HelpFaqTncApi
import com.intellihealth.truemeds.data.model.helpfaqtnc.*
import com.intellihealth.truemeds.data.repository.datasource.remote.HelpFaqAndTnCRemoteDataSource
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.NamedConstants
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Named

class HelpFaqAndTnCRemoteDataSourceImpl @Inject constructor(
    private val helpFaqTncApi: HelpFaqTncApi,
    @Named(NamedConstants.CONTENT_TYPE) private val contentType: String
) : HelpFaqAndTnCRemoteDataSource {

    //private val authorization: String = SharedPrefManager.getInstance().loggedInUserAccessToken
    override suspend fun getHelpCategory(): Response<HelpCategoryResponse> {
        return helpFaqTncApi.getHelpCategory(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken.ifEmpty { null })
    }

    override suspend fun getHelpCategoryDetails(reasonId: String): Response<HelpCategoryResponse> {
        return helpFaqTncApi.getHelpCategoryDetails(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, reasonId)
    }

    override suspend fun getAllFAQCategory(): Response<FaqCategoryResponse> {
        return helpFaqTncApi.getAllFAQCategory(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken)
    }

    override suspend fun getFAQByCategory(categoryId: Int): Response<FaqCategoryResponse> {
        return helpFaqTncApi.getFAQByCategory(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, categoryId)
    }

    override suspend fun getPP(): Response<PrivacyPolicyAndTnCResponse> {
        return helpFaqTncApi.getPP(contentType)
    }

    override suspend fun getTNC(isPrimary: Boolean): Response<PrivacyPolicyAndTnCResponse> {
        return helpFaqTncApi.getTNC(contentType, isPrimary)
    }

    override suspend fun checkIfCustomerAcceptedPPAndTNC(customerId: String): Response<AcceptedPPAndTnCResponse> {
        return helpFaqTncApi.checkIfCustomerAcceptedPPAndTNC(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, customerId)
    }

    override suspend fun acceptPPOrTNC(customerId: String, type: String): Response<ResponseBody> {
        return helpFaqTncApi.acceptPPOrTNC(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, customerId, type)
    }

}