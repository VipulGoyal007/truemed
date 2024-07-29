package com.intellihealth.truemeds.data.utils

import android.util.Log
import com.google.gson.Gson
import com.intellihealth.truemeds.data.model.home.ApiCoreResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import retrofit2.Response
import javax.inject.Inject

class ApiCallInitClass @Inject constructor(private val sdkEventUseCase: SdkEventUseCase) {
    suspend fun <T> safeApiCall(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        apiCall: suspend () -> T
    ): Resource<T> {
        return withContext(Dispatchers.IO) {
            try {
                val response: T = apiCall.invoke()
                /*try {
                    val apiResponse = response as Response<T>
                    if (!apiResponse.isSuccessful) {
                        mxInternalErrorOccurred.errorCode = apiResponse.code()
                        mxInternalErrorOccurred.errorStatement = Gson().fromJson(apiResponse.errorBody()?.string(), ApiCoreResponse::class.java).message
                        sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                    }
                } catch (_: Exception) {
                }*/
                Resource.Success(response)
            } catch (throwable: Throwable) {
                when (throwable) {
                    is HttpException -> {
                        mxInternalErrorOccurred.errorCode = throwable.code()
                        mxInternalErrorOccurred.errorStatement =
                            throwable.response()!!.errorBody()?.string()
                        sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                        Resource.Failure(false, throwable.code(), throwable.response()?.errorBody())
                    }

                    else -> {
                        Log.d("apiresponse333", throwable.toString())
                        Resource.Failure(true, null, null)
                    }
                }
            }
        }
    }
}