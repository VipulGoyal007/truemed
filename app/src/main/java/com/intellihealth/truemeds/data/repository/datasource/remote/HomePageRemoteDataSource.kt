package com.intellihealth.truemeds.data.repository.datasource.remote

import com.intellihealth.truemeds.data.model.home.CouponExpiryDateResponse
import com.intellihealth.truemeds.data.model.home.HomePageBannersResponse
import com.intellihealth.truemeds.data.model.home.HomePageOtcResponse
import com.intellihealth.truemeds.data.model.home.IncreaseDigitizedOrderRankModel
import com.intellihealth.truemeds.data.model.home.PinCodeServiceabilityResponse
import com.intellihealth.truemeds.data.model.home.RatingDetailsResponseModel
import com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse
import com.intellihealth.truemeds.data.model.orderflow.SaveRatingDetailsRequestDataModel
import okhttp3.ResponseBody
import retrofit2.Response

interface HomePageRemoteDataSource {

    suspend fun getBannersForHomePage(
        type: String,
        subType: Set<String>
    ): Response<HomePageBannersResponse>

    /*suspend fun getFtcCoupons(
        customerId: String?,
        categoryType: String?,
        version: String?
    ): Response<CouponExpiryDateResponse>*/

    suspend fun getWordpressArticle(
        userAgent: String,
        urlParam: String?
    ): Response<ResponseBody>

    suspend fun getRatingDetails(): Response<RatingDetailsResponseModel>

    suspend fun getVideoFaq(
        page: String,
        limit: String,
        source: String
    ): Response<VideoFaqAllResponse>

    suspend fun saveRatingDetails(
        customerId: String,
        orderId: Long,
        saveRatingDetailsRequestDataModel: SaveRatingDetailsRequestDataModel?
    ): Response<ResponseBody>

    suspend fun savePopUpReasons(
        orderId: Long,
        optionReasonId: Long,
        optionType: String
    ): Response<ResponseBody>

    suspend fun checkPincodeServiceability(pincode: String?): Response<PinCodeServiceabilityResponse>

    suspend fun increaseDigitizedOrderRank(
        orderId: Long?,
        transactionId: String?
    ): Response<IncreaseDigitizedOrderRankModel>

    suspend fun fetchHomePageCategory(
        sessionToken: String,
        wareHouseId: String
    ): Response<HomePageOtcResponse>

    suspend fun fetchTruemedsContactByName(
        name: String
    ): Response<ResponseBody>

    suspend fun saveContactMappingInfo(
        version: String
    ): Response<ResponseBody>
}