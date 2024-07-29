package com.intellihealth.truemeds.domain.repository

import com.intellihealth.truemeds.data.model.helpfaqtnc.AcceptedPPAndTnCResponse
import com.intellihealth.truemeds.data.model.helpfaqtnc.FaqCategoryResponse
import com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse
import com.intellihealth.truemeds.data.model.helpfaqtnc.PrivacyPolicyAndTnCResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.utils.Resource
import okhttp3.ResponseBody
import retrofit2.Response

interface HelpFaqAndTnCRepository {
    /**
     * This service provides help category list
     * Show help list that contains medicine orders related help,delivery related help etc..
     * **/
    suspend fun getHelpCategory(mxInternalErrorOccurred: MxInternalErrorOccurred): Resource<Response<HelpCategoryResponse>>

    /**
     * This service provides particular help category details eg medicine order related in details, cancel order something
     * Pass particular reason id that fetch details of category
     * **/
    suspend fun getHelpCategoryDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        reasonId: String
    ):
            Resource<Response<HelpCategoryResponse>>

    /**
     * This service provides all FAQ category
     * Fetch Customer related question that customer ask frequently
     * **/
    suspend fun getAllFAQCategory(mxInternalErrorOccurred: MxInternalErrorOccurred): Resource<Response<FaqCategoryResponse>>

    /**
     * This service provides FAQ by category ex TM cash wallet related question
     * Pass particular categoryId that returns FAQ of that category
     * **/
    suspend fun getFAQByCategory(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        categoryId: Int
    ): Resource<Response<FaqCategoryResponse>>

    /**
     * This service provides application privacy policy data
     * **/
    suspend fun getPP(mxInternalErrorOccurred: MxInternalErrorOccurred): Resource<Response<PrivacyPolicyAndTnCResponse>>

    /**
     * This service provides application terms and condition data
     * **/
    suspend fun getTNC(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        isPrimary: Boolean
    ): Resource<Response<PrivacyPolicyAndTnCResponse>>

    /**
     * This service checks whether new privacy policy is accepted or not
     * independent api call, not dependent on any other api response
     */
    suspend fun checkIfCustomerAcceptedPPAndTNC(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String
    ):
            Resource<Response<AcceptedPPAndTnCResponse>>

    /**
     * This service checks customer pp or tnc accepted
     * **/
    suspend fun acceptPPOrTNC(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String,
        type: String
    ): Resource<Response<ResponseBody>>

}