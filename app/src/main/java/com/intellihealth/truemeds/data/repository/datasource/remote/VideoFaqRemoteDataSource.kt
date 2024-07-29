package com.intellihealth.truemeds.data.repository.datasource.remote

import com.intellihealth.truemeds.data.model.helpfaqtnc.*
import com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse
import okhttp3.ResponseBody
import retrofit2.Response

interface VideoFaqRemoteDataSource {

    suspend fun getVideos(page: String, limit: String, source: String): Response<VideoFaqAllResponse>

}