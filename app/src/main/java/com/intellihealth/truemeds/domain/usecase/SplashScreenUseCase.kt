package com.intellihealth.truemeds.domain.usecase

import com.google.gson.Gson
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.splashactivity.MobileMasterResponse
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.domain.enums.SplashScreenImageType
import com.intellihealth.truemeds.domain.repository.SplashScreenRepository
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale
import javax.inject.Inject


class SplashScreenUseCase @Inject constructor(
    private val splashScreenRepository: SplashScreenRepository,
    private val localDbUseCase: LocalDbUseCase,
    private val sdkEventUseCase: SdkEventUseCase
) {
    fun getSplashScreenImageType(): SplashScreenImageType {
        try {
            val strFromDate = Calendar.getInstance()[Calendar.YEAR].toString() + "-12-17"
            val strToDate = (Calendar.getInstance()[Calendar.YEAR] + 1).toString() + "-01-01"
            val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.US)
            val c = Calendar.getInstance().time
            val strCurrentDate = dateFormat.format(c)
            val fromDate = dateFormat.parse(strFromDate)
            val toDate = dateFormat.parse(strToDate)
            val currentDate = dateFormat.parse(strCurrentDate)
            return if (currentDate != null
                && CommonFunc.isDateInBetweenIncludingEndPoints(fromDate, toDate, currentDate)
            ) {
                SplashScreenImageType.CHRISTMAS
            } else {
                SplashScreenImageType.DEFAULT
            }
        } catch (_: Exception) {
            return SplashScreenImageType.DEFAULT
        }
    }

    suspend fun getMobileMaster(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        authorization: String?,
        versionName: String
    ): MobileMasterResponse? {

        return when (val res = splashScreenRepository.getMobileMaster(mxInternalErrorOccurred, authorization, versionName)) {
            is Resource.Success -> {
                res.value?.let { response ->
                    if (response.isSuccessful) {
                        response.body().let { mobileMasterResponse ->
                            mobileMasterResponse?.responseData.let {
                                if ((it?.orderFilterList?.size ?: 0) > 0) {
                                    localDbUseCase.insertOrderFilterDetails(it?.orderFilterList!!)
                                }
                                if ((it?.searchTypeMaster?.size ?: 0) > 0) {
                                    localDbUseCase.insertSearchType(it?.searchTypeMaster!!)
                                }
                                /**
                                 * commented because in app_order_placed event for FTC it is triggered as true for is_contact_saved
                                 * QA-4866 resolved.
                                 * **/
                                /*if ((it?.tmContacts?.size ?: 0) > 0) {
                                    localDbUseCase.insertTmContactDetails(it?.tmContacts!!)
                                }*/
                                if ((it?.subOptReasons?.size ?: 0) > 0) {
                                    localDbUseCase.insertSubOptReasons(it?.subOptReasons!!)
                                }

                                it?.srcTypeId?.let { srcTypeId ->
                                    SharedPrefManager.getInstance().srcType = srcTypeId
                                }
                            }
                            mobileMasterResponse
                        }
                    } else {
                        try {
                            val errorResponse = response.errorBody()?.string()
                            try {
                                mxInternalErrorOccurred.errorCode = response.code()
                                mxInternalErrorOccurred.errorStatement = errorResponse
                                sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                            } catch (_: Exception) {
                            }
                            return Gson().fromJson(errorResponse, MobileMasterResponse::class.java)
                        } catch (_: Exception) {
                            return null
                        }
                    }
                }

            }

            is Resource.Failure -> null
            else -> null
        }
    }
}