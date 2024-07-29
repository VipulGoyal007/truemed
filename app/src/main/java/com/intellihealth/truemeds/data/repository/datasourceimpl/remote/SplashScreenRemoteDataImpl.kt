package com.intellihealth.truemeds.data.repository.datasourceimpl.remote

import android.content.Context
import com.intellihealth.truemeds.data.api.SplashScreenApi
import com.intellihealth.truemeds.data.model.splashactivity.MobileMasterResponse
import com.intellihealth.truemeds.data.repository.datasource.remote.SplashScreenRemoteData
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.NamedConstants
import dagger.hilt.android.qualifiers.ApplicationContext
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Named

class SplashScreenRemoteDataImpl @Inject constructor(
    @ApplicationContext context: Context,
    private val splashScreenApi: SplashScreenApi,
    @Named(NamedConstants.CONTENT_TYPE) private val contentType: String
) : SplashScreenRemoteData {

    //private val authorization: String = SharedPrefManager.getInstance().loggedInUserAccessToken

    override suspend fun getMobileMaster(versionName: String): Response<MobileMasterResponse> {
        return splashScreenApi.mobileMaster(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, versionName)
    }


}