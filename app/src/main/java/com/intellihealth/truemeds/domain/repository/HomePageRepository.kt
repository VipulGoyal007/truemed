package com.intellihealth.truemeds.domain.repository

import com.intellihealth.truemeds.data.model.home.AllOrdersOfCustomersResponse
import com.intellihealth.truemeds.data.model.home.AllPatientsOrderDetailsResponse
import com.intellihealth.truemeds.data.model.home.CouponExpiryDateResponse
import com.intellihealth.truemeds.data.model.home.HomePageBannersResponse
import com.intellihealth.truemeds.data.model.home.HomePageOtcResponse
import com.intellihealth.truemeds.data.model.home.IncreaseDigitizedOrderRankModel
import com.intellihealth.truemeds.data.model.home.OrderDetailsResponse
import com.intellihealth.truemeds.data.model.home.PinCodeServiceabilityResponse
import com.intellihealth.truemeds.data.model.home.RatingDetailsResponseModel
import com.intellihealth.truemeds.data.model.home.ReorderResponse
import com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.orderflow.SaveRatingDetailsRequestDataModel
import com.intellihealth.truemeds.data.utils.Resource
import okhttp3.ResponseBody
import retrofit2.Response

interface HomePageRepository {

    /**
     * This service provides banners, alert image, 3S banner for homepage
     * **/
    suspend fun getHomePageBanners(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        type: String,
        subType: Set<String>
    ): Resource<Response<HomePageBannersResponse>>


    /**
     * This service provides coupons available fot First time customer (New user with no orders placed)
     * **/
    /*suspend fun getFtcCoupons(
        customerId: String?,
        categoryType: String?,
        version: String?
    ): Resource<Response<CouponExpiryDateResponse>>*/

    /**
     * This service provides list of active health articles
     * **/
    suspend fun getWordpressArticle(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        userAgent: String,
        urlParam: String?
    ): Resource<Response<ResponseBody>>

    suspend fun getRatingDetails(mxInternalErrorOccurred: MxInternalErrorOccurred): Resource<Response<RatingDetailsResponseModel>>

    /**
     * This service provides Video FAQ url
     * **/
    suspend fun getVideoFaq(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        page: String,
        limit: String,
        source: String
    ): Resource<Response<VideoFaqAllResponse>>

    /**
     * This service used to save app rating
     * **/
    suspend fun saveRatingDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String,
        orderId: Long,
        saveRatingDetailsRequestDataModel: SaveRatingDetailsRequestDataModel?
    ): Resource<Response<ResponseBody>>

    /**
     *
     * **/
    suspend fun savePopUpReasons(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        optionReasonId: Long,
        optionType: String
    ): Resource<Response<ResponseBody>>

    /**
     * This service used to check if given pincode is serviceable/deliverable
     * **/
    suspend fun checkPincodeServiceability(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        pincode: String?
    ): Resource<Response<PinCodeServiceabilityResponse>>

    suspend fun increaseDigitizedOrderRank(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long?,
        transactionId: String?
    ): Resource<Response<IncreaseDigitizedOrderRankModel>>

    suspend fun fetchHomePageCategory(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        sessionToken: String,
        wareHouseId: String,
    ): Resource<Response<HomePageOtcResponse>>

    suspend fun fetchTruemedsContactByName(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        name: String
    ): Resource<Response<ResponseBody>>

    suspend fun saveContactMappingInfo(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        version: String
    ): Resource<Response<ResponseBody>>
}