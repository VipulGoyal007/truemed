package com.intellihealth.truemeds.domain.repository

import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.splashactivity.MobileMasterResponse
import com.intellihealth.truemeds.data.utils.Resource
import retrofit2.Response

interface
SplashScreenRepository {
    /**
     * Constants attributes info is fetched from this API
     * 1. Minimum order value for free Delivery Amount
     * 2. Delivery Charge
     * 3. Search Masters(In Salt, In Brands, In disease)
     * 4. Subs opt reason
     * 5. SRC type master
     * etc
     * **/
    suspend fun getMobileMaster(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        authorization: String?,
        versionName: String
    ): Resource<Response<MobileMasterResponse>>
}