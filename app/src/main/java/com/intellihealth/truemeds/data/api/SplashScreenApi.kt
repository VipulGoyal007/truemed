package com.intellihealth.truemeds.data.api

import com.intellihealth.truemeds.data.model.splashactivity.MobileMasterResponse
import com.intellihealth.truemeds.data.utils.ApiEndpointConstants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface SplashScreenApi {
    @GET(ApiEndpointConstants.MOBILE_MASTER)
    suspend fun mobileMaster(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String?,
        @Query("versionName") versionName: String
    ): Response<MobileMasterResponse>


}