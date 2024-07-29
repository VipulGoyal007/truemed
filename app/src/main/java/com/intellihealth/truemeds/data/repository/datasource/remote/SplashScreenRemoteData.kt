package com.intellihealth.truemeds.data.repository.datasource.remote
import com.intellihealth.truemeds.data.model.splashactivity.MobileMasterResponse
import retrofit2.Response

interface SplashScreenRemoteData {
    suspend fun getMobileMaster(versionName: String):Response<MobileMasterResponse>
}