package com.intellihealth.truemeds.domain.usecase

import android.content.Context
import com.google.gson.Gson
import com.intellihealth.truemeds.data.model.helpfaqtnc.FaqCategoryResponse
import com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse
import com.intellihealth.truemeds.data.model.helpfaqtnc.PrivacyPolicyAndTnCResponse
import com.intellihealth.truemeds.data.model.home.ApiCoreResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.refernearn.FaqModel
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.data.utils.ResponseData
import com.intellihealth.truemeds.domain.repository.HelpFaqAndTnCRepository
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase
import dagger.hilt.android.qualifiers.ApplicationContext
import okhttp3.ResponseBody
import org.json.JSONObject
import javax.inject.Inject

class HelpFaqTncUseCase @Inject constructor(
    @ApplicationContext
    private val appContext: Context,
    private val helpFaqAndTnCRepository: HelpFaqAndTnCRepository,
    private val sdkEventUseCase: SdkEventUseCase
) {

    suspend fun getAllFAQCategory(
        mxInternalErrorOccurred: MxInternalErrorOccurred
    ): FaqCategoryResponse? {
        var faqCategoryResponse: FaqCategoryResponse? = null
        when (val res = helpFaqAndTnCRepository.getAllFAQCategory(mxInternalErrorOccurred)) {
            is Resource.Success -> {
                res.value?.let {
                    faqCategoryResponse = it.body() ?: FaqCategoryResponse(payload = emptyList())
                    if (!it.isSuccessful) {
                        try {
                            mxInternalErrorOccurred.errorCode = it.code()
                            mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                                it.errorBody()?.string(),
                                ApiCoreResponse::class.java
                            ).message
                            sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                        } catch (_: Exception) {
                        }
                    }
                }
            }

            is Resource.Failure -> {
                res.errorCode?.let {
                    res.errorBody?.let { resErrorBody ->
                        setErrorResponseBody(
                            res.errorCode,
                            resErrorBody, res.isNetworkError
                        )
                    }
                }
            }

            else -> {

            }
        }
        return faqCategoryResponse
    }

    suspend fun getFAQByCategory(
        mxInternalErrorOccurred: MxInternalErrorOccurred, categoryId: Int
    ): Pair<MutableList<String>, HashMap<String, List<String>>> {
        var faqCategoryResponse: FaqCategoryResponse? = null
        val listDataHeader: MutableList<String> = ArrayList()
        val listDataChild: HashMap<String, List<String>> = HashMap()
        when (val res =
            helpFaqAndTnCRepository.getFAQByCategory(mxInternalErrorOccurred, categoryId)) {
            is Resource.Success -> {
                res.value?.let {
                    faqCategoryResponse = it.body()!!


                    faqCategoryResponse?.let { response ->
                        for (faqPayloadItem in response.payload!!) {
                            val question = faqPayloadItem?.question
                            val answer = faqPayloadItem?.answer
                            listDataHeader.add(question!!)
                            val listAnswer: MutableList<String> = ArrayList()
                            listAnswer.add(answer!!)
                            listDataChild[question] = listAnswer
                        }
                    }

                    if (!it.isSuccessful) {
                        try {
                            mxInternalErrorOccurred.errorCode = it.code()
                            mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                                it.errorBody()?.string(),
                                ApiCoreResponse::class.java
                            ).message
                            sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                        } catch (_: Exception) {
                        }
                    }
                }
            }

            is Resource.Failure -> {
                res.errorCode?.let {
                    res.errorBody?.let { resErrorBody ->
                        setErrorResponseBody(
                            res.errorCode,
                            resErrorBody, res.isNetworkError
                        )
                    }
                }
            }

            else -> {

            }
        }
        return Pair(listDataHeader, listDataChild)
    }

    suspend fun setErrorResponseBody(
        errorCode: Int,
        errorBody: ResponseBody,
        isNetworkError: Boolean
    ): ResponseData {
        return ResponseData(errorCode, errorBody, isNetworkError)
    }

    suspend fun getAllHelpCategory(
        mxInternalErrorOccurred: MxInternalErrorOccurred
    ): HelpCategoryResponse? =
        when (val res = helpFaqAndTnCRepository.getHelpCategory(mxInternalErrorOccurred)) {
            is Resource.Success -> if(res.value?.isSuccessful==true) res.value.body() else {
                try {
                    mxInternalErrorOccurred.errorCode = res.value?.code()
                    mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                        res.value?.errorBody()?.string(),
                        ApiCoreResponse::class.java
                    ).message
                    sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                } catch (_: Exception) {
                }
                null
            }
            is Resource.Failure -> null
            else -> null
        }

    suspend fun getAllHelpSubCategory(
        mxInternalErrorOccurred: MxInternalErrorOccurred, reasonId: String
    ): HelpCategoryResponse? =
        when (val res =
            helpFaqAndTnCRepository.getHelpCategoryDetails(mxInternalErrorOccurred, reasonId)) {
            is Resource.Success -> if(res.value?.isSuccessful==true) res.value.body() else {
                try {
                    mxInternalErrorOccurred.errorCode = res.value?.code()
                    mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                        res.value?.errorBody()?.string(),
                        ApiCoreResponse::class.java
                    ).message
                    sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                } catch (_: Exception) {
                }
                null
            }
            is Resource.Failure -> null
            else -> null
        }


    suspend fun getPP(
        mxInternalErrorOccurred: MxInternalErrorOccurred
    ): PrivacyPolicyAndTnCResponse? {
        return when (val res =
            helpFaqAndTnCRepository.getPP(mxInternalErrorOccurred)) {
            is Resource.Success -> if(res.value?.isSuccessful==true) res.value.body() else {
                try {
                    mxInternalErrorOccurred.errorCode = res.value?.code()
                    mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                        res.value?.errorBody()?.string(),
                        ApiCoreResponse::class.java
                    ).message
                    sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                } catch (_: Exception) {
                }
                null
            }
            is Resource.Failure -> null
            else -> null
        }
    }

    suspend fun getTNC(
        mxInternalErrorOccurred: MxInternalErrorOccurred, isPrimary: Boolean
    ): PrivacyPolicyAndTnCResponse? {
        return when (val res =
            helpFaqAndTnCRepository.getTNC(mxInternalErrorOccurred, isPrimary)) {
            is Resource.Success -> if(res.value?.isSuccessful==true) res.value.body() else {
                try {
                    mxInternalErrorOccurred.errorCode = res.value?.code()
                    mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                        res.value?.errorBody()?.string(),
                        ApiCoreResponse::class.java
                    ).message
                    sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                } catch (_: Exception) {
                }
                null
            }
            is Resource.Failure -> null
            else -> null
        }
    }

    suspend fun getCategoryById(
        mxInternalErrorOccurred: MxInternalErrorOccurred, id: Int
    ): List<FaqCategoryResponse.Payload>? {
        var faqCategoryResponse: FaqCategoryResponse? = null
        var listOfFaq: ArrayList<FaqCategoryResponse.Payload>? = arrayListOf()
        when (val res = helpFaqAndTnCRepository.getFAQByCategory(mxInternalErrorOccurred, id)) {
            is Resource.Success -> {
                res.value?.let {
                    faqCategoryResponse = it.body()
                    faqCategoryResponse?.let { response ->
                        for (faqPayloadItem in response.payload!!) {
                            if (faqPayloadItem != null) {
                                listOfFaq?.add(faqPayloadItem)
                            }
                        }
                    }

                    if (!it.isSuccessful) {
                        try {
                            mxInternalErrorOccurred.errorCode = it.code()
                            mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                                it.errorBody()?.string(),
                                ApiCoreResponse::class.java
                            ).message
                            sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                        } catch (_: Exception) {
                        }
                    }
                }
            }

            is Resource.Failure -> {
                res.errorCode?.let {
                    res.errorBody?.let { resErrorBody ->
                        setErrorResponseBody(
                            res.errorCode,
                            resErrorBody, res.isNetworkError
                        )
                    }
                }
            }

            else -> {

            }
        }
        return listOfFaq
    }

}