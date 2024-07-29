package com.intellihealth.truemeds.data.repository.datasourceimpl.remote

import android.content.Context
import com.intellihealth.truemeds.data.api.HomePageApi
import com.intellihealth.truemeds.data.model.home.CouponExpiryDateResponse
import com.intellihealth.truemeds.data.model.home.HomePageBannersResponse
import com.intellihealth.truemeds.data.model.home.HomePageOtcResponse
import com.intellihealth.truemeds.data.model.home.IncreaseDigitizedOrderRankModel
import com.intellihealth.truemeds.data.model.home.PinCodeServiceabilityResponse
import com.intellihealth.truemeds.data.model.home.RatingDetailsResponseModel
import com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse
import com.intellihealth.truemeds.data.model.orderflow.SaveRatingDetailsRequestDataModel
import com.intellihealth.truemeds.data.repository.datasource.remote.HomePageRemoteDataSource
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.NamedConstants
import dagger.hilt.android.qualifiers.ApplicationContext
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Named

class HomePageRemoteDataSourceImpl @Inject constructor(
    @ApplicationContext context: Context,
    private val homePageApi: HomePageApi,
    @Named(NamedConstants.CONTENT_TYPE) private val contentType: String
) : HomePageRemoteDataSource {

    //private val authorization: String = SharedPrefManager.getInstance().loggedInUserAccessToken
    override suspend fun getBannersForHomePage(
        type: String,
        subType: Set<String>
    ): Response<HomePageBannersResponse> {
        return homePageApi.getBannersForHomePage(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, type, subType)
    }

    /*override suspend fun getFtcCoupons(
        customerId: String?,
        categoryType: String?,
        version: String?
    ): Response<CouponExpiryDateResponse> {
        return homePageApi.getFtcCoupons(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            customerId,
            categoryType,
            version
        )
    }*/

    override suspend fun getWordpressArticle(
        userAgent: String,
        urlParam: String?
    ): Response<ResponseBody> {
        return homePageApi.getWordpressArticle(contentType, /*userAgent,*/ SharedPrefManager.getInstance().loggedInUserAccessToken.ifEmpty { null }, urlParam)
    }

    override suspend fun getRatingDetails(): Response<RatingDetailsResponseModel> {
        return homePageApi.getRatingDetails(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken)
    }

    override suspend fun getVideoFaq(
        page: String,
        limit: String,
        source: String
    ): Response<VideoFaqAllResponse> {
        return homePageApi.getVideoFaq(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            page,
            limit,
            source
        )
    }

    override suspend fun saveRatingDetails(
        customerId: String,
        orderId: Long,
        saveRatingDetailsRequestDataModel: SaveRatingDetailsRequestDataModel?
    ): Response<ResponseBody> {
        return homePageApi.saveRatingDetails(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            customerId,
            orderId,
            saveRatingDetailsRequestDataModel
        )
    }

    override suspend fun savePopUpReasons(
        orderId: Long,
        optionReasonId: Long,
        optionType: String
    ): Response<ResponseBody> {
        return homePageApi.savePopUpReasons(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            orderId,
            optionReasonId,
            optionType
        )
    }

    override suspend fun checkPincodeServiceability(pincode: String?): Response<PinCodeServiceabilityResponse> {
        return homePageApi.checkPincodeServiceability(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, pincode)
    }

    override suspend fun increaseDigitizedOrderRank(
        orderId: Long?,
        transactionId: String?
    ): Response<IncreaseDigitizedOrderRankModel> {
        return homePageApi.increaseDigitizedOrderRank(
            contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, orderId,
            transactionId
        )
    }

    override suspend fun fetchHomePageCategory(
        sessionToken: String,
        wareHouseId: String
    ): Response<HomePageOtcResponse> {
        return homePageApi.fetchHomePageCategories(contentType, true, sessionToken, wareHouseId)
    }


    override suspend fun fetchTruemedsContactByName(
        name: String,
    ): Response<ResponseBody> {
        return homePageApi.fetchTruemedsContactByName(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, name)
    }

    override suspend fun saveContactMappingInfo(
        version: String,
    ): Response<ResponseBody> {
        return homePageApi.saveContactMappingInfo(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, version)
    }


}