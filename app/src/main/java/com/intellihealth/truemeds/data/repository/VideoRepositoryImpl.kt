package com.intellihealth.truemeds.data.repository

import com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.repository.datasource.remote.VideoFaqRemoteDataSource
import com.intellihealth.truemeds.data.utils.ApiCallInitClass
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.domain.repository.VideoFaqRepository
import retrofit2.Response
import javax.inject.Inject

class VideoRepositoryImpl @Inject constructor(
    private val videoFaqRemoteDataSource: VideoFaqRemoteDataSource,
    private val apiCallInitClass: ApiCallInitClass
) : VideoFaqRepository {

    override suspend fun getVideos(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        page: String,
        limit: String,
        source: String
    ): Resource<Response<VideoFaqAllResponse>> =
        apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            videoFaqRemoteDataSource.getVideos(
                page,
                limit,
                source
            )
        }


}