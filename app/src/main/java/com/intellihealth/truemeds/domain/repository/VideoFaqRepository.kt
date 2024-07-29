package com.intellihealth.truemeds.domain.repository

import com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.utils.Resource
import retrofit2.Response

interface VideoFaqRepository {
    suspend fun getVideos(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        page: String,
        limit: String,
        source: String
    ): Resource<Response<VideoFaqAllResponse>>

}