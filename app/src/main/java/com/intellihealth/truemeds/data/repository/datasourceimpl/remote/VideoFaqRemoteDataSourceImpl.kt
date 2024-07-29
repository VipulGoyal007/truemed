package com.intellihealth.truemeds.data.repository.datasourceimpl.remote

import com.intellihealth.truemeds.data.api.CancelOrderApi
import com.intellihealth.truemeds.data.api.VideoApi
import com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse
import com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse
import com.intellihealth.truemeds.data.repository.datasource.remote.CancelOrderRemoteDataSource
import com.intellihealth.truemeds.data.repository.datasource.remote.VideoFaqRemoteDataSource
import com.intellihealth.truemeds.presentation.utils.NamedConstants
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Named

class VideoFaqRemoteDataSourceImpl @Inject constructor(
    private val videoApi: VideoApi,
    @Named(NamedConstants.CONTENT_TYPE) private val contentType: String,
) : VideoFaqRemoteDataSource {
    override suspend fun getVideos(
        page: String,
        limit: String,
        source: String
    ): Response<VideoFaqAllResponse> = videoApi.getVideos(contentType, page, limit, source)

}