package com.intellihealth.truemeds.data.api

import com.intellihealth.truemeds.data.model.home.*
import com.intellihealth.truemeds.data.model.orderflow.SaveRatingDetailsRequestDataModel
import com.intellihealth.truemeds.data.utils.ApiEndpointConstants
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*


interface HomePageApi {
    @POST(ApiEndpointConstants.GET_BANNERS_FOR_HOMEPAGE)
    suspend fun getBannersForHomePage(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("type") type: String,
        @Body subType: Set<String>
    ): Response<HomePageBannersResponse>

    /*@GET(ApiEndpointConstants.GET_FTC_COUPON_EXPIRY_DATE)
    suspend fun getFtcCoupons(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("customerId") customerId: String?,
        @Query("categoryType") categoryType: String?,
        @Query("version") version: String?,
    ): Response<CouponExpiryDateResponse>*/

    @GET(ApiEndpointConstants.GET_WORDPRESS_ARTICLE)
    suspend fun getWordpressArticle(
        @Header("Content-Type") contentType: String?,
        //@Header("user-agent") userAgent: String,
        @Header("Authorization") authorization: String?,
        @Query("urlParams") urlParam: String?
    ): Response<ResponseBody>

    @GET(ApiEndpointConstants.GET_RATING_DETAILS)
    suspend fun getRatingDetails(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?
    ): Response<RatingDetailsResponseModel>

    @GET(ApiEndpointConstants.VIDEO_FAQ_ALL)
    suspend fun getVideoFaq(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("page") page: String,
        @Query("limit") limit: String,
        @Query("source") source: String
    ): Response<VideoFaqAllResponse>

    @POST(ApiEndpointConstants.SAVE_RATING_DETAILS)
    suspend fun saveRatingDetails(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("customerId") customerId: String,
        @Query("orderId") orderId: Long,
        @Body saveRatingDetailsRequestDataModel: SaveRatingDetailsRequestDataModel?,
    ): Response<ResponseBody>

    @GET(ApiEndpointConstants.SAVE_POP_UP_REASONS)
    suspend fun savePopUpReasons(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("orderId") orderId: Long,
        @Query("optionReasonId") optionReasonId: Long,
        @Query("optionType") optionType: String
    ): Response<ResponseBody>

    @GET(ApiEndpointConstants.CHECK_PINCODE_SERVICEABILITY)
    suspend fun checkPincodeServiceability(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("pincode") pincode: String?,
    ): Response<PinCodeServiceabilityResponse>

    @GET(ApiEndpointConstants.INCREASE_DIGITIZED_ORDER_RANK)
    suspend fun increaseDigitizedOrderRank(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("orderId") orderId: Long?,
        @Query("transactionId") transactionId: String?
    ): Response<IncreaseDigitizedOrderRankModel>

    /*@POST(ApiEndpointConstants.FETCH_ALL_ORDERS_OF_CUSTOMERS)
    suspend fun fetchAllOrdersOfCustomers(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("customerId") customerId: String,
        @Query("page") page: Int,
        @Query("result") result: Int,
        @Body statusIds: Set<String?>?,
    ): Response<AllCustomersOrdersResponseModel>*/

    /*@GET(ApiEndpointConstants.GET_ALL_PATIENTS_ORDER_DETAILS)
    suspend fun getAllPatientsOrderDetails(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("orderId") orderId: Long?,
    ): Response<AllPatientsOrderDetailsResponse>

    @GET(ApiEndpointConstants.GET_ORDER_DETAILS)
    suspend fun getOrderDetails(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("orderId") orderId: Long?,
    ): Response<OrderDetailsResponse>*/

    /*@POST(ApiEndpointConstants.RE_ORDER)
    suspend fun reOrder(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("orderId") orderId: Long?,
        @Query("customerId") customerId: String?,
        @Body patientListDto: Array<Long?>?,
        @Query("variant") variant: String?,
        @Query("checkAutoConfirmEligibility") checkAutoConfirmEligibility: Boolean,
        @Query("newAlgo") newAlgo: Boolean,
        @Query("srcTypeId") serialId: Int?,
        @Query("reOrderMedCheck") reOrderMedCheck: Boolean,
        @Query("variantId") variantId: Long?
    ): Response<ReorderResponse>*/

    @GET(ApiEndpointConstants.FETCH_HOME_PAGE_CATEGORIES)
   suspend fun fetchHomePageCategories(
        @Header("Content-Type") contentType: String?,
        @Query("isApp") isApp: Boolean,
        @Query("sessionToken") sessionToken: String?,
        @Query("warehouseId") wareHouseId: String?
    ): Response<HomePageOtcResponse>



    @GET(ApiEndpointConstants.FETCH_TRUEMEDS_CONTACT_BY_NAME)
    suspend fun fetchTruemedsContactByName(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("name") name: String,
    ): Response<ResponseBody>

    @POST(ApiEndpointConstants.SAVE_CONTACT_MAPPING)
    suspend fun saveContactMappingInfo(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("version") name: String,
    ): Response<ResponseBody>
}