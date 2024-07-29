package com.intellihealth.truemeds.data.api

import com.intellihealth.truemeds.data.model.helpfaqtnc.*
import com.intellihealth.truemeds.data.utils.ApiEndpointConstants
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query

interface HelpFaqTncApi {
    @GET(ApiEndpointConstants.GET_HELP_CATEGORY)
    suspend fun getHelpCategory(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String?
    ): Response<HelpCategoryResponse>

    @GET(ApiEndpointConstants.GET_HELP_CATEGORY_DETAILS)
    suspend fun getHelpCategoryDetails(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String?,
        @Query("id") id: String?
    ): Response<HelpCategoryResponse>

    @POST(ApiEndpointConstants.GET_FAQ_CATEGORY)
    suspend fun getAllFAQCategory(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String?,
    ): Response<FaqCategoryResponse>

    @POST(ApiEndpointConstants.GET_FAQ_BY_CATEGORY)
    suspend fun getFAQByCategory(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String?,
        @Query("categoryId") categoryId: Int?
    ): Response<FaqCategoryResponse>

    @GET(ApiEndpointConstants.GET_PP_API)
    suspend fun getPP(
        @Header("Content-Type") contentType: String?
    ): Response<PrivacyPolicyAndTnCResponse>

    @GET(ApiEndpointConstants.GET_TNC_API)
    suspend fun getTNC(
        @Header("Content-Type") contentType: String?,
        @Query("isPrimary") isPrimary: Boolean
    ): Response<PrivacyPolicyAndTnCResponse>

    @GET(ApiEndpointConstants.CHECK_IF_CUSTOMER_ACCEPTED_PP_AND_TNC)
    suspend fun checkIfCustomerAcceptedPPAndTNC(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String?,
        @Query("customerId") customerId: String?
    ): Response<AcceptedPPAndTnCResponse>

    @POST(ApiEndpointConstants.ACCEPT_PP_OR_TNC)
    suspend fun acceptPPOrTNC(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String?,
        @Query("customerId") customerId: String?,
        @Query("type") type: String?
    ): Response<ResponseBody>
}