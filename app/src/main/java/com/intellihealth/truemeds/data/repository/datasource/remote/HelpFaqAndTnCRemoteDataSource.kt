package com.intellihealth.truemeds.data.repository.datasource.remote

import com.intellihealth.truemeds.data.model.helpfaqtnc.*
import okhttp3.ResponseBody
import retrofit2.Response

interface HelpFaqAndTnCRemoteDataSource {
    suspend fun getHelpCategory(
    ): Response<HelpCategoryResponse>

    suspend fun getHelpCategoryDetails(
        reasonId: String
    ): Response<HelpCategoryResponse>

    suspend fun getAllFAQCategory(
    ): Response<FaqCategoryResponse>

    suspend fun getFAQByCategory(
        categoryId: Int
    ): Response<FaqCategoryResponse>

    suspend fun getPP(
    ): Response<PrivacyPolicyAndTnCResponse>

    suspend fun getTNC(isPrimary:Boolean
    ): Response<PrivacyPolicyAndTnCResponse>


    suspend fun checkIfCustomerAcceptedPPAndTNC(customerId:String
    ): Response<AcceptedPPAndTnCResponse>

    suspend fun acceptPPOrTNC(
        customerId:String,
        type:String
    ): Response<ResponseBody>


}