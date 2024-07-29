package com.intellihealth.truemeds.data.repository

import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.splashactivity.MobileMasterResponse
import com.intellihealth.truemeds.data.repository.datasource.remote.SplashScreenRemoteData
import com.intellihealth.truemeds.data.utils.ApiCallInitClass
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.domain.repository.SplashScreenRepository
import retrofit2.Response
import javax.inject.Inject

class SplashScreenRepositoryImpl @Inject constructor(private val splashScreenRemoteData: SplashScreenRemoteData,
                                                     private val apiCallInitClass: ApiCallInitClass
) :
    SplashScreenRepository {

    override suspend fun getMobileMaster(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        authorization: String?,
        versionName: String
    ): Resource<Response<MobileMasterResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { splashScreenRemoteData.getMobileMaster(versionName) }
    }


}