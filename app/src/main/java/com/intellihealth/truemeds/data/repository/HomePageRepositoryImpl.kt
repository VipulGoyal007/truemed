package com.intellihealth.truemeds.data.repository

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
import com.intellihealth.truemeds.data.repository.datasource.remote.HomePageRemoteDataSource
import com.intellihealth.truemeds.data.utils.ApiCallInitClass
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.domain.repository.HomePageRepository
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject

class HomePageRepositoryImpl @Inject constructor(
    private val homePageRemoteDataSource: HomePageRemoteDataSource,
    private val apiCallInitClass: ApiCallInitClass
) :
    HomePageRepository {
    override suspend fun getHomePageBanners(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        type: String,
        subType: Set<String>
    ): Resource<Response<HomePageBannersResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { homePageRemoteDataSource.getBannersForHomePage(type, subType) }
    }

    override suspend fun getWordpressArticle(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        userAgent: String,
        urlParam: String?
    ): Resource<Response<ResponseBody>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { homePageRemoteDataSource.getWordpressArticle(userAgent, urlParam) }
    }

    override suspend fun getRatingDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
    ): Resource<Response<RatingDetailsResponseModel>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { homePageRemoteDataSource.getRatingDetails() }
    }

    override suspend fun getVideoFaq(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        page: String,
        limit: String,
        source: String
    ): Resource<Response<VideoFaqAllResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { homePageRemoteDataSource.getVideoFaq(page, limit, source) }
    }

    override suspend fun saveRatingDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String,
        orderId: Long,
        saveRatingDetailsRequestDataModel: SaveRatingDetailsRequestDataModel?
    ): Resource<Response<ResponseBody>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            homePageRemoteDataSource.saveRatingDetails(
                customerId,
                orderId,
                saveRatingDetailsRequestDataModel
            )
        }
    }

    override suspend fun savePopUpReasons(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        optionReasonId: Long,
        optionType: String
    ): Resource<Response<ResponseBody>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            homePageRemoteDataSource.savePopUpReasons(
                orderId,
                optionReasonId,
                optionType
            )
        }
    }

    override suspend fun checkPincodeServiceability(
        mxInternalErrorOccurred: MxInternalErrorOccurred,pincode: String?): Resource<Response<PinCodeServiceabilityResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { homePageRemoteDataSource.checkPincodeServiceability(pincode) }
    }

    override suspend fun increaseDigitizedOrderRank(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long?,
        transactionId: String?
    ): Resource<Response<IncreaseDigitizedOrderRankModel>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            homePageRemoteDataSource.increaseDigitizedOrderRank(
                orderId,
                transactionId
            )
        }
    }

    override suspend fun fetchHomePageCategory(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        sessionToken: String,
        wareHouseId: String
    ): Resource<Response<HomePageOtcResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            homePageRemoteDataSource.fetchHomePageCategory(
                sessionToken,
                wareHouseId
            )
        }
    }


    override suspend fun fetchTruemedsContactByName(
        mxInternalErrorOccurred: MxInternalErrorOccurred,name: String): Resource<Response<ResponseBody>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { homePageRemoteDataSource.fetchTruemedsContactByName(name) }
    }

    override suspend fun saveContactMappingInfo(
        mxInternalErrorOccurred: MxInternalErrorOccurred,version: String): Resource<Response<ResponseBody>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { homePageRemoteDataSource.saveContactMappingInfo(version) }
    }
}