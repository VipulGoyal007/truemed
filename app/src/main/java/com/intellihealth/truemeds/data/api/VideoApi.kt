package com.intellihealth.truemeds.data.api

import com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse
import com.intellihealth.truemeds.data.utils.ApiEndpointConstants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface VideoApi {
    @GET(ApiEndpointConstants.VIDEO_FAQ_ALL)
    suspend fun getVideos(
        @Header("Content-Type")  contentType:String,
        @Query("page")  page:String,
        @Query("limit") limit:String,
        @Query("source") source:String
    ): Response<VideoFaqAllResponse>


}