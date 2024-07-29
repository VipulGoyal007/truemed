package com.intellihealth.truemeds.domain.usecase

import android.R.attr.width
import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.text.Html
import android.text.TextUtils
import android.util.Log
import androidx.core.content.ContextCompat
import com.google.gson.Gson
import com.intellihealth.salt.callbacks.FullWidthProductCardCallback
import com.intellihealth.salt.callbacks.StepperCallback
import com.intellihealth.salt.models.BlogCardModel
import com.intellihealth.salt.models.HealthArticleChipCategoryData
import com.intellihealth.salt.models.ProductComparisonModel
import com.intellihealth.salt.models.ProductInfoModel
import com.intellihealth.salt.models.TestimonialModel
import com.intellihealth.salt.models.TestimonialSectionModel
import com.intellihealth.salt.utils.formatDecimal
import com.intellihealth.salt.utils.removeExtraZerosWithValidation
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.bottomnav.AccountTabModel
import com.intellihealth.truemeds.data.model.healtharticles.HealthArticlesDataModel
import com.intellihealth.truemeds.data.model.helpfaqtnc.PrivacyPolicyAndTnCResponse
import com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel
import com.intellihealth.truemeds.data.model.home.ApiCoreResponse
import com.intellihealth.truemeds.data.model.home.BottomSheetDefaultModel
import com.intellihealth.truemeds.data.model.home.CategoryListModel
import com.intellihealth.truemeds.data.model.home.CustomerMedicinesResponseModel
import com.intellihealth.truemeds.data.model.home.DeliveryDelayModel
import com.intellihealth.truemeds.data.model.home.DoctorCallBottomSheetModel
import com.intellihealth.truemeds.data.model.home.HomePageBannersResponse
import com.intellihealth.truemeds.data.model.home.HomePageOtcResponse
import com.intellihealth.truemeds.data.model.home.HomeReorderBottomSheetModel
import com.intellihealth.truemeds.data.model.home.IncreaseDigitizedOrderRankModel
import com.intellihealth.truemeds.data.model.home.PinCodeServiceabilityResponse
import com.intellihealth.truemeds.data.model.home.PrivacyPolicyBottomSheetModel
import com.intellihealth.truemeds.data.model.home.RatingDetailsResponseModel
import com.intellihealth.truemeds.data.model.home.ReorderResponse
import com.intellihealth.truemeds.data.model.home.TestimonialSectionDataModel
import com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.orderflow.CouponCodeDataModel
import com.intellihealth.truemeds.data.model.orderflow.SaveRatingDetailsRequestDataModel
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.data.utils.ResponseData
import com.intellihealth.truemeds.data.utils.getJsonResponseFromRaw
import com.intellihealth.truemeds.data.utils.strDateTimeToDate
import com.intellihealth.truemeds.domain.enums.Banner
import com.intellihealth.truemeds.domain.repository.HelpFaqAndTnCRepository
import com.intellihealth.truemeds.domain.repository.HomePageRepository
import com.intellihealth.truemeds.domain.repository.OrderFlowRepository
import com.intellihealth.truemeds.domain.repository.ProductListAndDetailsRepository
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase
import com.intellihealth.truemeds.presentation.fragment.HomePageFeatureName
import com.intellihealth.truemeds.presentation.model.BottomSheetType
import com.intellihealth.truemeds.presentation.model.FtcCouponResponseList
import com.intellihealth.truemeds.presentation.model.HomeBanner
import com.intellihealth.truemeds.presentation.model.HomePageBottomSheetInfo
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.HomeSectionConstants
import dagger.hilt.android.qualifiers.ApplicationContext
import okhttp3.ResponseBody
import org.json.JSONArray
import org.json.JSONObject
import retrofit2.Response
import java.text.SimpleDateFormat
import javax.inject.Inject


//@HiltViewModel
class HomePageUseCase @Inject constructor(
    private val homePageRepository: HomePageRepository,
    private val orderFlowRepository: OrderFlowRepository,
    private val productListAndDetailsRepository: ProductListAndDetailsRepository,
    private val dbUseCase: LocalDbUseCase,
    private val helpFaqAndTnCRepository: HelpFaqAndTnCRepository,
    private val sdkEventUseCase: SdkEventUseCase,
    @ApplicationContext private val context: Context
) {

    var isColdStoragePincode: Boolean = true

    /**
     * Api call for all banners in home
     * **/
    suspend fun getBannersForHomePage(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        type: String, subType: Set<String>, page: Banner,
    ): HomePageBannersResponse? {
        var response: HomePageBannersResponse? = null
        when (val homePageBannerResponse =
            homePageRepository.getHomePageBanners(mxInternalErrorOccurred, type, subType)) {
            is Resource.Success -> {
                homePageBannerResponse.value?.let {
                    response = it.body()
                    val upiInfoUrl: List<HomeBanner.Banner>? = if (page == Banner.HOME) {
                        response?.responseData?.upiInfoUrl
                    } else {
                        response?.responseData?.otc
                    }
                    if (!upiInfoUrl.isNullOrEmpty()) {
                        if ((upiInfoUrl[0].image != null) && !upiInfoUrl[0].image
                                .equals("")
                        ) {
                            SharedPrefManager.getInstance().upiInfoUrl = upiInfoUrl[0].image
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
                homePageBannerResponse.errorCode?.let {
                    homePageBannerResponse.errorBody?.let {
                    }
                }

            }

            else -> {}
        }
        return response

    }

    fun getAccountTabMenus(): List<AccountTabModel> {
        val userNavigationMenus = ArrayList<AccountTabModel>()
        userNavigationMenus.add(
            AccountTabModel(
                1,
                "My Orders",
                "MyOrdersActivity",
                ContextCompat.getDrawable(context, R.drawable.ic_archive),
                false,
                "Tarun Bhola",
                "+91 9350688977",
                "tarunbhola@truemed.in"
            )
        )
        userNavigationMenus.add(
            AccountTabModel(
                2,
                "TM Wallet",
                "TmWalletActivity",
                ContextCompat.getDrawable(context, R.drawable.ic_wallet),
                true,
                "Tarun Bhola",
                "+91 9350688977",
                "tarunbhola@truemed.in"
            )
        )
        userNavigationMenus.add(
            AccountTabModel(
                3,
                "Manage Patients",
                "ManagePatientActivity",
                ContextCompat.getDrawable(context, R.drawable.ic_user),
                false,
                "Tarun Bhola",
                "+91 9350688977",
                "tarunbhola@truemed.in"
            )
        )
        userNavigationMenus.add(
            AccountTabModel(
                4,
                "Manage Addresses",
                "ManageAddressActivity",
                ContextCompat.getDrawable(context, R.drawable.ic_map_pin),
                false,
                "Tarun Bhola",
                "+91 9350688977",
                "tarunbhola@truemed.in"
            )
        )
        userNavigationMenus.add(
            AccountTabModel(
                5,
                "Refer and Earn",
                "ReferNEarnActivity",
                ContextCompat.getDrawable(context, R.drawable.ic_currency_rupee),
                false,
                "Tarun Bhola",
                "+91 9350688977",
                "tarunbhola@truemed.in"
            )
        )
        userNavigationMenus.add(
            AccountTabModel(
                6,
                "Reminder",
                "Reminder",
                ContextCompat.getDrawable(context, R.drawable.ic_bell),
                false,
                "Tarun Bhola",
                "+91 9350688977",
                "tarunbhola@truemed.in"
            )
        )
        userNavigationMenus.add(
            AccountTabModel(
                7,
                "Health Articles",
                "Articles",
                ContextCompat.getDrawable(context, R.drawable.ic_article),
                false,
                "Tarun Bhola",
                "+91 9350688977",
                "tarunbhola@truemed.in"
            )
        )
        userNavigationMenus.add(
            AccountTabModel(
                8,
                "Help",
                "Help",
                ContextCompat.getDrawable(context, R.drawable.ic_help),
                false,
                "Tarun Bhola",
                "+91 9350688977",
                "tarunbhola@truemed.in"
            )
        )

        return userNavigationMenus
    }

    fun getFeatureList(
        isFtc: Boolean,
        shouldAddReOrderSection: Boolean
    ): List<HomePageFeatureName> {
        val homepageFeatureList = ArrayList<HomePageFeatureName>()
        if (isFtc) {
            homepageFeatureList.add(
                HomePageFeatureName(
                    1,
                    HomeSectionConstants.BANNER, 1
                )
            )
            homepageFeatureList.add(
                HomePageFeatureName(
                    2,
                    HomeSectionConstants.ALERT, 2
                )
            )

            homepageFeatureList.add(
                HomePageFeatureName(
                    3,
                    HomeSectionConstants.OTC_CATEGORY, 3))


            homepageFeatureList.add(
                HomePageFeatureName(
                    4,
                    HomeSectionConstants.PRESCRIPTION, 4
                )
            )

            homepageFeatureList.add(
                HomePageFeatureName(
                    5,
                    HomeSectionConstants.SUBS, 5
                )
            )


            homepageFeatureList.add(
                HomePageFeatureName(
                    6,
                    HomeSectionConstants.DEFAULT_PRODUCT_CARD, 6
                )
            )
            homepageFeatureList.add(
                HomePageFeatureName(
                    8,
                    HomeSectionConstants.CALL_TO_ORDER, 7
                )
            )
            homepageFeatureList.add(
                HomePageFeatureName(
                    7,
                    HomeSectionConstants.STACKED_PRODUCT_CARD, 8
                )
            )

            homepageFeatureList.add(
                HomePageFeatureName(
                    9,
                    HomeSectionConstants.BLOG_SECTION_CARD,
                    9
                )
            )
            homepageFeatureList.add(
                HomePageFeatureName(
                    10,
                    HomeSectionConstants.TESTIMONIAL_SECTION_CARD, 10
                )
            )
            homepageFeatureList.add(
                HomePageFeatureName(
                    11,
                    HomeSectionConstants.FOOTER_SECTION,
                    11
                )
            )
        } else {
            homepageFeatureList.add(
                HomePageFeatureName(
                    1,
                    HomeSectionConstants.BANNER, 1
                )
            )
//            if (shouldAddReOrderSection)
            homepageFeatureList.add(
                HomePageFeatureName(
                    2,
                    HomeSectionConstants.REORDER, 2
                )
            )
            homepageFeatureList.add(
                HomePageFeatureName(
                    3,
                    HomeSectionConstants.ALERT, 3
                )
            )

            homepageFeatureList.add(HomePageFeatureName(4, HomeSectionConstants.OTC_CATEGORY, 4))


            homepageFeatureList.add(
                HomePageFeatureName(
                    5,
                    HomeSectionConstants.PRESCRIPTION, 5
                )
            )

            homepageFeatureList.add(
                HomePageFeatureName(
                    6,
                    HomeSectionConstants.PATIENTANDMEDICINELIST, 6
                )
            )

            homepageFeatureList.add(
                HomePageFeatureName(
                    7,
                    HomeSectionConstants.SUBS, 7
                )
            )

            homepageFeatureList.add(
                HomePageFeatureName(
                    8,
                    HomeSectionConstants.DEFAULT_PRODUCT_CARD, 8
                )
            )
            homepageFeatureList.add(
                HomePageFeatureName(
                    9,
                    HomeSectionConstants.CALL_TO_ORDER, 9
                )
            )
            homepageFeatureList.add(
                HomePageFeatureName(
                    10,
                    HomeSectionConstants.STACKED_PRODUCT_CARD, 10
                )
            )
            homepageFeatureList.add(
                HomePageFeatureName(
                    11,
                    HomeSectionConstants.BLOG_SECTION_CARD,
                    11
                )
            )
            homepageFeatureList.add(
                HomePageFeatureName(
                    12,
                    HomeSectionConstants.TESTIMONIAL_SECTION_CARD, 12
                )
            )
            homepageFeatureList.add(
                HomePageFeatureName(
                    13,
                    HomeSectionConstants.FOOTER_SECTION,
                    13
                )
            )
        }
        return homepageFeatureList
    }

    suspend fun getRatingDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred
    ): RatingDetailsResponseModel? {
        var ratingDetailsResponseModel: RatingDetailsResponseModel? = null
        when (val response =
            homePageRepository.getRatingDetails(mxInternalErrorOccurred)) {

            is Resource.Success -> {
                response.value?.let {
                    if (it.isSuccessful) {
                        ratingDetailsResponseModel = it.body()
                    } else {
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

            }

            else -> {}
        }
        return ratingDetailsResponseModel
    }

    /**
     * Show article data from this api
     * **/
    suspend fun getWordpressArticle(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        userAgent: String,
        urlParam: String?
    ): List<HealthArticlesDataModel> {
        val homeActivityArticlesDataModels = ArrayList<HealthArticlesDataModel>()
        when (val wordpressArticleResponse =
            homePageRepository.getWordpressArticle(mxInternalErrorOccurred, userAgent, urlParam)) {
            is Resource.Success -> {
                wordpressArticleResponse.value?.let {
                    if (it.isSuccessful) {
                        var sourceUrl = ""
                        val jsonObject = getJsonResponseFromRaw(it)
                        if (jsonObject != null) {
                            try {
                                if (jsonObject.has("array")) {
                                    val array = jsonObject.getJSONArray("array")

                                    var rend: String? = ""
                                    var slug: String
                                    var content: String? = ""
                                    var category: String? = ""
                                    for (i in 0 until array.length()) {
                                        val jsonObject1 = array.getJSONObject(i)
                                        slug = jsonObject1.getString("slug")
                                        val type = jsonObject1.getString("type")
                                        val createddate = jsonObject1.getString("date")
                                        val createdOnN =
                                            createddate.substring(0, createddate.length - 9)
                                        val date2 = strDateTimeToDate(createdOnN)
                                        val formatter5 = SimpleDateFormat("dd MMM yyyy")
                                        val createdOn = formatter5.format(date2)
                                        if (jsonObject1.has("title")) {
                                            val titleObject = jsonObject1.getJSONObject("title")
                                            rend = titleObject.getString("rendered")
                                        }
                                        if (jsonObject1.has("content")) {
                                            val jsoncontent = jsonObject1.getJSONObject("content")
                                            content = jsoncontent.getString("rendered")
                                        }
                                        if (jsonObject1.has("_embedded")) {
                                            val embeddedObjec =
                                                jsonObject1.getJSONObject("_embedded")
                                            val arrayAuthor = embeddedObjec.getJSONArray("author")
                                            val wpTerm = embeddedObjec.getJSONArray("wp:term")
                                            if (embeddedObjec.has("wp:featuredmedia")) {
                                                val featuremedia =
                                                    embeddedObjec.getJSONArray("wp:featuredmedia")
                                                val jsomedia = featuremedia.getJSONObject(0)
                                                sourceUrl = jsomedia.getString("source_url")
                                                if (sourceUrl != null) sourceUrl =
                                                    sourceUrl + "?tr=cm-pad_resize,bg-FFFFFF,lo-true,w-" + (width * 0.7).toInt()
                                            }

                                            var categoryNameChipList: ArrayList<HealthArticleChipCategoryData> =
                                                arrayListOf()
                                            if (embeddedObjec.has("wp:term")) {
                                                val jsonArray =
                                                    embeddedObjec.getJSONArray("wp:term")
                                                val wparray = jsonArray.getJSONArray(0)
                                                val wparray_lent = wparray.length()
                                                categoryNameChipList = ArrayList()
                                                for (k in 0 until wparray_lent) {
                                                    val wptermobject = wparray.getJSONObject(k)
                                                    val categoryName = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                                                        Html.fromHtml(
                                                            wptermobject.getString("name"),
                                                            Html.FROM_HTML_MODE_LEGACY
                                                        ).toString()
                                                    } else {
                                                        Html.fromHtml(wptermobject.getString("name"))
                                                            .toString()
                                                    }
                                                    categoryNameChipList.add(
                                                        HealthArticleChipCategoryData(
                                                            wptermobject.getString("id"),
                                                            categoryName
                                                        )
                                                    )
                                                }
                                            }

                                            try {
                                                category = wpTerm.getJSONArray(0).getJSONObject(0)
                                                    .getString("name")
                                            } catch (ignore: java.lang.Exception) {
                                            }
                                            for (j in 0 until arrayAuthor.length()) {
                                                val athoritem = arrayAuthor.getJSONObject(j)
                                                homeActivityArticlesDataModels.add(
                                                    HealthArticlesDataModel(
                                                        athoritem.getInt("id"),
                                                        rend!!,
                                                        athoritem.getString("name"),
                                                        sourceUrl,
                                                        slug,
                                                        category!!,
                                                        type,
                                                        createdOn,
                                                        content,
                                                        true,
                                                        "",
                                                        categoryNameChipList
                                                    )
                                                )
                                            }
                                        }
                                    }
                                }
                            } catch (ignore: java.lang.Exception) {
                                return emptyList<HealthArticlesDataModel>()
                            }
                        }

                    } else {
                        var response = Gson().fromJson(
                            it.errorBody()?.string(),
                            ApiCoreResponse::class.java
                        )
                        response.isSuccess = false
                        var errorResponse = ApiCoreResponse()
                        var obj = HealthArticlesDataModel(
                            isSuccess = false,
                            message = errorResponse.message!!
                        )
                        homeActivityArticlesDataModels.add(obj)

                        try {
                            mxInternalErrorOccurred.errorCode = it.code()
                            mxInternalErrorOccurred.errorStatement = response.message
                            sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                        } catch (_: Exception) {
                        }

                        return homeActivityArticlesDataModels
                    }
                }
            }

            is Resource.Failure -> {
                wordpressArticleResponse.errorCode?.let {
                    wordpressArticleResponse.errorBody?.let {
                        return homeActivityArticlesDataModels
                    }
                }

            }

            else -> {}
        }
        return homeActivityArticlesDataModels
    }

    /**
     * Fetch video faq data
     * **/
    suspend fun getVideoFaq(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        page: String,
        limit: String,
        source: String
    ): VideoFaqAllResponse? {
        var response: VideoFaqAllResponse? = null
        when (val videoFaqAllResponse =
            homePageRepository.getVideoFaq(mxInternalErrorOccurred, page, limit, source)) {
            is Resource.Success -> {
                videoFaqAllResponse.value?.let {
                    response = it.body()
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
                videoFaqAllResponse.errorCode?.let {
                    videoFaqAllResponse.errorBody?.let {

                    }
                }

            }

            else -> {}
        }
        return response

    }

    /**
     * Save order rating deatils
     * **/

    suspend fun saveRatingDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String,
        orderId: Long,
        saveRatingDetailsRequestDataModel: SaveRatingDetailsRequestDataModel?
    ): ResponseBody? {
        var response: ResponseBody? = null
        when (val responseBody = homePageRepository.saveRatingDetails(
            mxInternalErrorOccurred, customerId,
            orderId,
            saveRatingDetailsRequestDataModel
        )) {
            is Resource.Success -> {
                responseBody.value?.let {
                    response = it.body()
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
                responseBody.errorCode?.let {
                    responseBody.errorBody?.let {

                    }
                }

            }

            else -> {}
        }
        return response
    }

    /**
     *
     * **/
    suspend fun savePopUpReasons(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        optionReasonId: Long,
        optionType: String
    ): ResponseBody? {
        var response: ResponseBody? = null
        when (val responseBody =
            homePageRepository.savePopUpReasons(
                mxInternalErrorOccurred,
                orderId,
                optionReasonId,
                optionType
            )) {
            is Resource.Success -> {
                responseBody.value?.let {
                    response = it.body()
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
                responseBody.errorCode?.let {
                    responseBody.errorBody?.let {

                    }
                }

            }

            else -> {}
        }
        return response
    }

    /**
     * Check pin code is serviceable or not
     * **/
    suspend fun checkPinCodeServiceability(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        pincode: String?
    ): PinCodeServiceabilityResponse? {
        var response: PinCodeServiceabilityResponse? = null
        when (val pinCodeServiceabilityResponse =
            homePageRepository.checkPincodeServiceability(mxInternalErrorOccurred, pincode)) {
            is Resource.Success -> {
                pinCodeServiceabilityResponse.value?.let {
                    if (it.isSuccessful) {
                        response = it.body()
                        isColdStoragePincode =
                            response?.responseData?.pincodeData?.get(0)?.isColdChainDeliverable//
                                ?: true
                        Log.i("pincoderesp", "" + response)
                    } else {
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
                sdkEventUseCase.sendPincodeUnserviceableEvent(pincode?.toInt() ?: 0)

                pinCodeServiceabilityResponse.errorCode?.let {
                    response = PinCodeServiceabilityResponse(
                        "Failure",
                        "Sorry! We currently do not deliver to this location",
                        pinCodeServiceabilityResponse.errorCode,
                        PinCodeServiceabilityResponse.ResponseData(
                            null,
                            isServicable = false,
                            pincodeData = null
                        )
                    )

                }

            }

            else -> {
                sdkEventUseCase.sendPincodeUnserviceableEvent(pincode?.toInt() ?: 0)
                response = PinCodeServiceabilityResponse(
                    "Failure",
                    "Sorry! We currently do not deliver to this location",
                    500,
                    PinCodeServiceabilityResponse.ResponseData(
                        null,
                        isServicable = false,
                        pincodeData = null
                    )
                )
            }
        }
        if (response == null)
            sdkEventUseCase.sendPincodeUnserviceableEvent(pincode?.toInt() ?: 0)

        return response
    }

    /**
     * API call for Doctor Call me
     * **/
    suspend fun increaseDigitizedOrderRank(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long?,
        transactionId: String?
    ): IncreaseDigitizedOrderRankModel? {
        var response: IncreaseDigitizedOrderRankModel? = null
        when (val doctorCallMeResponse =
            homePageRepository.increaseDigitizedOrderRank(
                mxInternalErrorOccurred,
                orderId,
                transactionId
            )) {
            is Resource.Success -> {
                Log.d(
                    "TAG",
                    "increaseDigitizedOrderRank: doctorCallResponse ${doctorCallMeResponse.value}"
                )
                doctorCallMeResponse.value?.let {
                    if (it.isSuccessful) {
                        response = it.body()
                    } else {
                        try {
                            mxInternalErrorOccurred.errorCode = it.code()
                            mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                                it.errorBody()?.string(),
                                ApiCoreResponse::class.java
                            ).message
                            sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                        } catch (_: Exception) {
                        }
                        response = null
                    }
                    Log.d("TAG", "increaseDigitizedOrderRank: ${it.body()}")
                }
            }

            is Resource.Failure -> {
                doctorCallMeResponse.errorCode?.let {
                    doctorCallMeResponse.errorBody?.let {

                    }
                }

            }

            else -> {}
        }
        return response
    }

    /**
     * Fetch all order of customer
     *
     * **/
    suspend fun getAllCustomerOrders(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String,
        page: Int,
        result: Int,
        statusIds: Set<String?>?,
        //patientIds: Set<Long>?
        patientIds: String
    ): AllCustomersOrdersResponseModel? {
        var response: AllCustomersOrdersResponseModel? = null
        when (val allOrdersOfCustomersResponse =
            orderFlowRepository.fetchAllOrdersOfCustomers(
                mxInternalErrorOccurred, customerId,
                page,
                result,
                statusIds,
                patientIds
            )) {
            is Resource.Success -> {
                allOrdersOfCustomersResponse.value?.let {
                    response = it.body()
                    Log.d("TAG", "fetchAllOrdersOfCustomers: success " + response)
                }
            }

            is Resource.Failure -> {
                allOrdersOfCustomersResponse.errorCode?.let {
                    allOrdersOfCustomersResponse.errorBody?.let {

                    }
                }

            }

            else -> {}
        }
        Log.d("TAG", "fetchAllOrdersOfCustomers: outer" + response)
        return response
    }

    suspend fun reOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long?,
        customerId: String?,
        patientListDto: ArrayList<Long?>?,
        variant: String?,
        checkAutoConfirmEligibility: Boolean,
        newAlgo: Boolean,
        serialId: Int?,
        reOrderMedCheck: Boolean,
        variantId: Long?
    ): ReorderResponse? {
        var response: ReorderResponse? = null
        SharedPrefManager.getInstance().couponModel = null

        when (val reorderResponse = orderFlowRepository.reOrder(
            mxInternalErrorOccurred, orderId,
            customerId,
            patientListDto,
            variant,
            checkAutoConfirmEligibility,
            newAlgo,
            serialId,
            reOrderMedCheck,
            variantId
        )) {
            is Resource.Success -> {
                reorderResponse.value?.let {
                    response = it.body()
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
                reorderResponse.errorCode?.let {
                    reorderResponse.errorBody?.let {

                    }
                }

            }

            else -> {}
        }
        return response
    }

    suspend fun fetchMedicineDetailsOfPatient(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String?,
        page: Int,
        result: Int,
        patientId: String?
    ): CustomerMedicinesResponseModel? {

        var response: CustomerMedicinesResponseModel? = null
        when (val reorderResponse = productListAndDetailsRepository.fetchMedicineDetailsOfPatient(
            mxInternalErrorOccurred, customerId,
            page,
            result,
            patientId
        )) {
            is Resource.Success -> {
                reorderResponse.value?.let {
                    response = it.body()
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
                reorderResponse.errorCode?.let {
                    reorderResponse.errorBody?.let {

                    }
                }

            }

            else -> {}
        }
        return response

    }

    suspend fun setErrorResponseBody(
        errorCode: Int,
        errorBody: ResponseBody,
        isNetworkError: Boolean
    ): ResponseData {
        return ResponseData(errorCode, errorBody, isNetworkError)
    }

    suspend fun getHealthArticlesResult(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        userAgent: String,
        urlParam: String?
    ): Response<ResponseBody>? =
        when (val res =
            homePageRepository.getWordpressArticle(mxInternalErrorOccurred, userAgent, urlParam)) {
            is Resource.Success -> {
                if (res.value?.isSuccessful == false) {
                    try {
                        mxInternalErrorOccurred.errorCode = res.value.code()
                        mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                            res.value.errorBody()?.string(),
                            ApiCoreResponse::class.java
                        ).message
                        sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                    } catch (_: Exception) {
                    }
                }
                res.value
            }

            is Resource.Failure -> null
            else -> null
        }

    suspend fun getHealthArticlesFilterCategoryList(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        userAgent: String,
        urlParam: String?
    ): ArrayList<CategoryListModel>? =
        when (val res =
            homePageRepository.getWordpressArticle(mxInternalErrorOccurred, userAgent, urlParam)) {
            is Resource.Success -> {
                val categorylist: ArrayList<CategoryListModel> = ArrayList()
                res.value?.let {
                    val jsonObject = getJsonResponseFromRaw(res.value)
                    if (jsonObject != null) {
                        try {
                            if (jsonObject.has("array")) {
                                val array = jsonObject.getJSONArray("array")

                                for (i in 0 until array.length()) {
                                    val jsonObject1 = array.getJSONObject(i)
                                    val categoryId = jsonObject1.getString("id")
                                    val category =
                                        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                                            Html.fromHtml(
                                                jsonObject1.getString("name"),
                                                Html.FROM_HTML_MODE_LEGACY
                                            ).toString()
                                        } else {
                                            Html.fromHtml(jsonObject1.getString("name"))
                                                .toString()
                                        }
                                    //val category = jsonObject1.getString("name")
                                    categorylist.add(CategoryListModel(category, categoryId))
                                }
                            }
                        } catch (e: Exception) {
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

                    categorylist

                }
            }

            is Resource.Failure -> null
            else -> null
        }


    fun getTestimonials(): TestimonialSectionDataModel {
        val testimonialModels = arrayListOf<TestimonialModel>()

        testimonialModels.add(
            TestimonialModel(
                "Best medicine app to order medicines",
                "I have been ordering medicine from this app for 2 years. I don't have any better medicine than this app in the world. I have saved more than Rs 12500 in these days. Delivery is also much better than before.",
                "", "Ramesh Agrawal"
            )
        )
        testimonialModels.add(
            TestimonialModel(
                "Substitution saves money",
                "I have saved more money by subsituting medicine by the help of Truemeds. Thanks to Truemeds.",
                "https://lh3.googleusercontent.com/a-/ALV-UjXYQYKTE-I6w-e9RfaV4iZQcwhrIxE8RwEGohYQQ836Wys",
                "Dhirendra Prasad"
            )
        )
        testimonialModels.add(
            TestimonialModel(
                "Great app",
                "This app is really worth it for purchasing medicines I am really happy to get huge discount on medicines.",
                "https://lh3.googleusercontent.com/a-/ALV-UjVerltTM7gxqkcNyAPMCMqUbTKfmj0O74C16hav8RWn4sM",
                "Neha Sharma"
            )
        )

        testimonialModels.add(
            TestimonialModel(
                "Nice app with good discounts",
                "Nice app, fast delivery. I had very good experience and everytime I get 50% discount on my substitute medicine recommended by truemeds top doctors.",
                "https://lh3.googleusercontent.com/a-/ALV-UjWSdw0H1hqNkXuw0IOdgeBoOmd2oQzsWGgrMlFloFQNSg",
                "ALEX YT"
            )
        )
        testimonialModels.add(
            TestimonialModel(
                "Best platform to save money",
                "Truly appreciable App, doctors always connect with me asap, recommend cheapest substitute available, best platform to save money on expensive meds",
                "https://lh3.googleusercontent.com/a-/ALV-UjXkKLp7MiqCJATBkRxgtNYBF_znJQVkc6GL1TZchecMXfE",
                "Sajid Khan"
            )
        )
        testimonialModels.add(
            TestimonialModel(
                "Superb delivery, great service",
                "I have been using the app from last 2 years. No worries about medicine orders. The team at Truemeds calls you every month at scheduled time to remind you. Delivery is superb and on time & all medicines are as per order and safely packed. Thanks team Truemeds.",
                "https://lh3.googleusercontent.com/a-/ALV-UjVei00yxqloW0VoXzViz_f989CpqIbIEDJkxBzVLKQmAXs",
                "Sandeep Malik"
            )
        )

        testimonialModels.add(
            TestimonialModel(
                "All in one Health app",
                "Order your medicines online, get virtual consultations with doctors, access authentic medicine information, receive monthly medicine reminders, and read health tips and articles. All at affordable prices.",
                "https://lh3.googleusercontent.com/a/ACg8ocIc-r-904rT2DA7MkEAooJQ10PXUOVy-Qjx4Jhhecy1NJY=mo",
                "Srinivas B"
            )
        )

        testimonialModels.add(
            TestimonialModel(
                "Excellent app for Medicines",
                "Excellent app.1.the medicine are always available 2.heavy discount are always available 3.indirect savings as they recommend you FDA approved substitute medicine 4.far better than any other similar app in discount, delivery and availability",
                "https://lh3.googleusercontent.com/a-/ALV-UjX7PqL2FyFnU2NQ8UmgJxKpNUVSJM-YNizj0qbQY9wX0eE",
                "Aayush Gaurav"
            )
        )

        testimonialModels.add(
            TestimonialModel(
                "Trustworthy and authentic",
                "I am using this app since past 6 months and I am really very happy to see the low price of medicine and supplements here with their good and genuine quality. This app is really very trustworthy and authentic. Thanks for Truemeds",
                "https://lh3.googleusercontent.com/a-/ALV-UjULuEC8f7X3HnNuYeM9JhHrV6-mQzDUCvvN_IYArI_iWQ",
                "Anand Kumar"
            )
        )

        testimonialModels.add(
            TestimonialModel(
                "Highly Recommended",
                "Such a amazing and useful app for ordering medicine and delivery is also super fast and seamless. Highly recommended",
                "https://lh3.googleusercontent.com/a-/ALV-UjWUcehYPdR_iGrz0hbTONcp2rYotbuizEIUwlymDbZWi8w",
                "Madhuri Arya"
            )
        )

        testimonialModels.add(
            TestimonialModel(
                "Great App with Free Doctor Consultations",
                "20% discount, best amongst all online pharmacy and reliable service, no upfront payment till order gets confirmed for delivery. Free doctor consultation for an alternative cheaper medicine options. I liked it so far, used 4 to 5 times in last 3 months for family medicine needs",
                "https://lh3.googleusercontent.com/a-/ALV-UjWUt-W5F_nhX8jDUvDZyTRUPt4p_T_zrSOU4UXePB1mt3pC",
                "Sanjay Kapadiya"
            )
        )

        testimonialModels.add(
            TestimonialModel(
                "Quick Delivery with Huge Savings!",
                "Very good app for ordering medicine online. Fast delivery and huge discount. We get alternative of all branded medicines at a cheaper cost with very simple app interface. We can get ayurved and homeopathy medicines and otc product also just like other competitors. Thanks to Truemeds for saving huge medicine expenses.",
                "https://lh3.googleusercontent.com/a-/ALV-UjXsj83JIARfjZEoPN92TX9KyrWSqHeHLuUI0iuJ6tuQ0No",
                "Sanjay Ghorai"
            )
        )

        testimonialModels.add(
            TestimonialModel(
                "Excellent experience",
                "It was Excellent experience to use the Truemeds app. Saving with speed of delivery at the same time.",
                "https://lh3.googleusercontent.com/a-/ALV-UjWOFezAk5Y7QjrWKRk-b72pFJFYvHr4eq_9bQTHu2-pGOU",
                "Pradeep Khanna"
            )
        )
        val model = TestimonialSectionModel("What our customers have to say", testimonialModels)
        return TestimonialSectionDataModel(
            type = HomeSectionConstants.TESTIMONIAL_SECTION_CARD,
            testimonialModel = model
        )
    }


    fun getBottomSheetData(
        bottomSheetType: BottomSheetType,
        productNameList: AllCustomersOrdersResponseModel.ResponseData.Orders?,
        header: String = ""
    ): HomePageBottomSheetInfo {
        return when (bottomSheetType) {
            BottomSheetType.EMPTY -> HomePageBottomSheetInfo(
                type = BottomSheetType.EMPTY,
                priority = 0,
                null
            )

            BottomSheetType.REORDER -> HomePageBottomSheetInfo(
                priority = 0,
                type = BottomSheetType.REORDER,
                reOrder = getReorderData(productNameList)
            )

            BottomSheetType.COMPARE_AND_UNDERSTAND -> HomePageBottomSheetInfo(
                priority = 0,
                type = BottomSheetType.COMPARE_AND_UNDERSTAND,
                compareAndUnderstand = setProductComparison(getCompareAndUnderstandSubstituteData())
            )

            BottomSheetType.TERMS_AND_CONDITION -> HomePageBottomSheetInfo(
                priority = 2,
                type = BottomSheetType.TERMS_AND_CONDITION,
                termsAndCondition = PrivacyPolicyBottomSheetModel(
                    header.ifBlank { "Terms & Conditions" },
                    "",
                    ""
                )
            )

            BottomSheetType.PAYMENT_PENDING -> HomePageBottomSheetInfo(
                priority = 4,
                type = BottomSheetType.PAYMENT_PENDING,
                paymentPending = BottomSheetDefaultModel(
                    paymentType = "UPI",
                    paymentTypeLogoUrl = null,
                    payableAmount = "Pay ₹1232.45"
                )
            )

            BottomSheetType.PRIVACY_POLICY -> {
                HomePageBottomSheetInfo(
                    priority = 1,
                    type = BottomSheetType.PRIVACY_POLICY,
                    privacyPolicy = PrivacyPolicyBottomSheetModel("Privacy Policy", "", "")
                )
            }

            BottomSheetType.DOCTOR_CALL_MISSED_CALL_NOW -> HomePageBottomSheetInfo(
                priority = 5,
                type = BottomSheetType.DOCTOR_CALL_MISSED_CALL_NOW,
                doctorCallMissed = getDoctorCallMissedNow()
            )

            BottomSheetType.DOCTOR_WILL_CALL -> HomePageBottomSheetInfo(
                priority = 6,
                type = BottomSheetType.DOCTOR_WILL_CALL,
                doctorCall = DoctorCallBottomSheetModel(
                    "Our doctor will call you on priority tomorrow morning",
                    "This will help us to process your order in time",
                    null
                )
            )

            BottomSheetType.DOCTOR_CALL_MISSED_CALL_BACK -> HomePageBottomSheetInfo(
                priority = 7,
                type = BottomSheetType.DOCTOR_CALL_MISSED_CALL_BACK,
                doctorCallMissed = getDoctorCallMissedBack()
            )

            /*BottomSheetType.DOCTOR_FRAUD -> HomePageBottomSheetInfo(
                priority = 8,
                type = BottomSheetType.DOCTOR_FRAUD,
                doctorFraud = BottomSheetDefaultModel(
                    discountPercentage = 51.22,
                    sellingPrice = 1234.78
                )
            )*/

            BottomSheetType.SORRY_FOR_INCONVENIENCE -> HomePageBottomSheetInfo(
                priority = 0,
                type = BottomSheetType.SORRY_FOR_INCONVENIENCE,
                error = BottomSheetDefaultModel(
                    title = "Sorry for the inconvenience",
                    message = "We take the quality standards very seriously. Our team will call you soon to resolve this."
                )
            )

            BottomSheetType.CHOOSE_LOCATION -> HomePageBottomSheetInfo(
                priority = 3,
                type = BottomSheetType.CHOOSE_LOCATION,
                location = listOf()
            )

            BottomSheetType.DOCTOR_CALL_MISSED_CALL_NOW_WITHOUT_TIMER -> HomePageBottomSheetInfo(
                priority = 9,
                type = BottomSheetType.DOCTOR_CALL_MISSED_CALL_NOW_WITHOUT_TIMER,
                doctorCallMissed = getDoctorCallMissedNowWithoutTimer()
            )

            BottomSheetType.RATING -> HomePageBottomSheetInfo(
                priority = 11,
                type = BottomSheetType.RATING,
            )

            BottomSheetType.SAVE_CONTACT -> HomePageBottomSheetInfo(
                priority = 10,
                type = BottomSheetType.SAVE_CONTACT,
            )
        }

    }

    fun setProductComparison(data: ProductComparisonModel): ProductComparisonModel {
        data?.let {
            //var data = it.product.subsSavingsPercentage
            var data = it.product.discount
            it.product.discount = removeExtraZerosWithValidation(data ?: 0.0).toDouble()
        }
        return data
    }

    @SuppressLint("SuspiciousIndentation")
    private fun getReorderData(productNameList: AllCustomersOrdersResponseModel.ResponseData.Orders?): HomeReorderBottomSheetModel {
        return HomeReorderBottomSheetModel(
            getDeliverDetailsProductList(productNameList),
            productNameList?.orderForPatientName,
            "Placed on ${productNameList?.date}",
            context.getString(R.string.Rs) + formatDecimal(productNameList?.payableAmount ?: 0.0)

        )
    }

    suspend fun getPrivacyPolicyData(mxInternalErrorOccurred: MxInternalErrorOccurred): PrivacyPolicyBottomSheetModel {
        val response: PrivacyPolicyAndTnCResponse? = getPP(mxInternalErrorOccurred)
        return PrivacyPolicyBottomSheetModel(
            "Privacy policy", response?.responseData?.Legals?.get(0)?.header,
            response?.responseData?.Legals?.get(0)?.description
        )
    }

    suspend fun getTermsAndConditionsData(mxInternalErrorOccurred: MxInternalErrorOccurred): PrivacyPolicyBottomSheetModel {
        val response: PrivacyPolicyAndTnCResponse? = getTNC(mxInternalErrorOccurred, true)
        return PrivacyPolicyBottomSheetModel(
            "Terms & Conditions", response?.responseData?.Legals?.get(0)?.header,
            response?.responseData?.Legals?.get(0)?.description
        )
    }

    //TODO
    private fun getDoctorCallMissedNow(): DeliveryDelayModel {
        return DeliveryDelayModel(
            orderID = "12345653",
            buttonText = "Call me",
            title = "Call from our doctor\nmissed!",
            message = "Speak to the doctor within the time limit to get delivered.",
            time = "23h:20m:05s", // if timer string is not set then timer from the bottomSheet will be hidden
        )
    }

    private fun getDoctorCallMissedNowWithoutTimer(): DeliveryDelayModel {
        return DeliveryDelayModel(
            orderID = "12345653",
            buttonText = "Call me",
            title = "Call from our doctor\nmissed!",
            message = "Complete your doctor call to avoid delays in  delivery. Your estimated delivered",
        )
    }

    private fun getDoctorCallMissedBack(): DeliveryDelayModel {
        return DeliveryDelayModel(
            orderID = "12345653",
            buttonText = "Call me back",
            title = "Call from our doctor\nmissed!",
            message = "Complete your doctor call to avoid delays in  delivery. Your estimated delivery date is 13th Aug.",
        )
    }

    /*fun getOrderTrackingStatus(): List<OrderTrackingModel> {
        return listOf(
            OrderTrackingModel(
                "Doctor Call Pending",
                "Track",
                0,
                imgIcon = ContextCompat.getDrawable(context, R.drawable.phone_call_yellow),
                "#FFF7E8",
                OrderTracking.TRACK_ORDER
            ),
            OrderTrackingModel(
                "Speak to doctor within",
                "Call me",
                260000000,
                imgIcon = ContextCompat.getDrawable(
                    context,
                    com.intellihealth.salt.R.drawable.ic_alert_circle
                ),
                "#FFF7E8",
                OrderTracking.CALL_NOW
            ),
            OrderTrackingModel(
                "Doctor call missed",
                "Call me",
                0,
                imgIcon = ContextCompat.getDrawable(
                    context,
                    com.intellihealth.salt.R.drawable.ic_alert_circle
                ),
                "#FFF7E8",
                OrderTracking.CALL_NOW
            ),
            OrderTrackingModel(
                "Doctor call missed",
                "Call me back",
                0,
                imgIcon = ContextCompat.getDrawable(
                    context,
                    com.intellihealth.salt.R.drawable.ic_alert_circle
                ),
                "#FFF7E8",
                OrderTracking.CALL_ME_BACK
            ),
            OrderTrackingModel(
                "Doctor call pending",
                "Track",
                0,
                imgIcon = ContextCompat.getDrawable(context, R.drawable.phone_call_yellow),
                "#FFF7E8",
                OrderTracking.TRACK_ORDER
            ),
            OrderTrackingModel(
                "Pharmacist Call Pending",
                "Track",
                0,
                imgIcon = ContextCompat.getDrawable(context, R.drawable.phone_call_yellow),
                "#FFF7E8",
                OrderTracking.TRACK_ORDER
            ),
            OrderTrackingModel(
                "Processing order",
                "Track",
                0,
                imgIcon = ContextCompat.getDrawable(context, R.drawable.ic_building_warehouse),
                "#E8F3EE",
                OrderTracking.TRACK_ORDER
            ),
            OrderTrackingModel(
                "Order ready to ship",
                "Track",
                0,
                imgIcon = ContextCompat.getDrawable(context, R.drawable.ic_circle_check),
                "#E8F3EE",
                OrderTracking.TRACK_ORDER
            ),
            OrderTrackingModel(
                "Order ready to ship",
                "Pay now",
                0,
                imgIcon = ContextCompat.getDrawable(context, R.drawable.ic_circle_check),
                "#E8F3EE",
                OrderTracking.PAY_NOW
            ),
            OrderTrackingModel(
                "Payment pending",
                "Pay now",
                0,
                imgIcon = ContextCompat.getDrawable(context, R.drawable.ic_coin_rupee),
                "#FFF7E8",
                OrderTracking.PAY_NOW
            ),
            OrderTrackingModel(
                "Order dispatched",
                "Track",
                0,
                imgIcon = ContextCompat.getDrawable(context, R.drawable.ic_box_seam),
                "#E8F3EE",
                OrderTracking.TRACK_ORDER
            ),
            OrderTrackingModel(
                "Order dispatched",
                "Pay now",
                0,
                imgIcon = ContextCompat.getDrawable(context, R.drawable.ic_box_seam),
                "#E8F3EE",
                OrderTracking.PAY_NOW
            ),
            OrderTrackingModel(
                "Order out for delivery",
                "Track",
                0,
                imgIcon = ContextCompat.getDrawable(context, R.drawable.ic_truck_delivery),
                "#E8F3EE",
                OrderTracking.TRACK_ORDER
            )
        )
    }*/

    private fun getCompareAndUnderstandSubstituteData(): ProductComparisonModel {
        return ProductComparisonModel(
            title = "Compare and understand",
            product = ProductInfoModel.Product(
                productCode = "abcde",
                skuName = "Shelcal",
                availabilityStatus = "Available",
                isAvailable = true,
                suppliedByTm = true,
                manufacturerName = "Torrent Pharmaceuticals Ltd",
                maxCappedQty = 10,
                mrp = 119.50,
                sellingPrice = 100.00,
                discount = 20.0,
                packSize = "10.00",
                unit = "Tablet",
                packForm = "Strip",
                pricePerUnitLabel = "₹95.60",
                productImageUrl = "https://assets.truemeds.in/Images/ProductImage/TM-TACR1-036336/SHELCAL-500-MG-250IU-Tablet-15_1.webp",
                qty = 1,
                composition = "Elemental Calcium (500Mg)/ Vitamin D3 (cholecalciferol) (250lu)",
                subsSavingsPercentage = "51%",
                cxAcceptedSubs = false,
                switchBackSkuName = "",
                switchBackProductCode = "",
                switchBackImageUrl = "",
                preSubsSkuName = "",
                preSubsProductCode = "",
                usersAlsoBoughtMessage = "500 users bought this instead",

                callback = object : StepperCallback {
                    override fun cartItemPlus(qty: Int) {
                        Log.d("qwerty", "Plus qty = $qty")
                    }

                    override fun cartItemMinus(qty: Int) {
                        Log.d("qwerty", "Minus qty = $qty")
                    }

                    override fun stepperError(msg: String?) {
                        msg?.let { Log.d("qwerty", it) }
                    }
                },
                subsFound = true,
                productCallback = object : FullWidthProductCardCallback {
                    override fun removeButtonClick(productCode: String) {
                        Log.d("qwerty", productCode)
                    }

                    override fun switchBackOrg(
                        productCode: String,
                        switchBackAvailability: Boolean
                    ) {
                        Log.d("qwerty", productCode)
                    }

                    override fun substituteCheck(productCode: String) {
                        Log.d("qwerty", productCode)
                    }
                }
            ),
            suggestion = ProductInfoModel.Product(
                productCode = "abcde",
                skuName = "Cipcal",
                availabilityStatus = "Available",
                isAvailable = true,
                suppliedByTm = true,
                manufacturerName = "Cipla Ltd",
                maxCappedQty = 10,
                mrp = 120.0,
                sellingPrice = 100.00,
                discount = 51.00,
                packSize = "10.00",
                unit = "Tablet",
                packForm = "Strip",
                pricePerUnitLabel = "₹58.55",
                productImageUrl = "https://assets.truemeds.in/Images/ProductImage/TM-TACR1-008255/CIPCAL-500-MG-250IU-Tablet-15_1.webp",
                qty = 1,
                composition = "Elemental Calcium (500Mg)/ Vitamin D3 (cholecalciferol) (250lu)",

                subsSavingsPercentage = "51%",
                cxAcceptedSubs = false,
                switchBackSkuName = "",
                switchBackProductCode = "",
                switchBackImageUrl = "",
                preSubsSkuName = "",
                preSubsProductCode = "",
                usersAlsoBoughtMessage = "500 users bought this instead",

                callback = object : StepperCallback {
                    override fun cartItemPlus(qty: Int) {
                        Log.d("qwerty", "Plus qty = $qty")
                    }

                    override fun cartItemMinus(qty: Int) {
                        Log.d("qwerty", "Minus qty = $qty")
                    }

                    override fun stepperError(msg: String?) {
                        msg?.let { Log.d("qwerty", it) }
                    }
                },
                subsFound = true,
                productCallback = object : FullWidthProductCardCallback {
                    override fun removeButtonClick(productCode: String) {
                        Log.d("qwerty", productCode)
                    }

                    override fun switchBackOrg(
                        productCode: String,
                        switchBackAvailability: Boolean
                    ) {
                        Log.d("qwerty", productCode)
                    }

                    override fun substituteCheck(productCode: String) {
                        Log.d("qwerty", productCode)
                    }
                }
            ),
            isCollapsible = true
        )
    }

    suspend fun getSuperCategoryList(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        sessionToken: String,
        selectedWarehouseID: String
    ): HomePageOtcResponse? {
        var response: HomePageOtcResponse? = null
        when (val res =
            homePageRepository.fetchHomePageCategory(
                mxInternalErrorOccurred,
                sessionToken,
                selectedWarehouseID
            )) {
            is Resource.Success -> {
                res.value?.let {
                    if (it.body() != null) {
                        response = it.body()!!
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
        return response
    }

    suspend fun logout() {
        dbUseCase.deleteOfflineDbData()
        SharedPrefManager.getInstance().editor.clear().commit();
    }

    private fun getDeliverDetailsProductList(productNameList: AllCustomersOrdersResponseModel.ResponseData.Orders?): List<ProductInfoModel> {
        val medList = arrayListOf<ProductInfoModel>()
        medList.apply {
            productNameList?.productNameList?.let {
                for (item in it) {
                    val product = ProductInfoModel.Product(
                        productCode = "",
                        skuName = item.skuName,
                        manufacturerName = "",
                        discount = 20.0,
                        mrp = item.sellingPrice,
                        sellingPrice = item.sellingPrice,
                        pricePerUnitLabel = "",
                        packSize = "",
                        maxCappedQty = 10,
                        productImageUrl = "",
                        availabilityStatus = null,
                        qty = item.quantity,
                        subsSavingsPercentage = "20.3%",
                        usersAlsoBoughtMessage = "0",

                        isAvailable = true,
                        suppliedByTm = true,
                        unit = "10",
                        packForm = "",
                        cxAcceptedSubs = false,
                        switchBackSkuName = "",
                        switchBackProductCode = "",
                        switchBackImageUrl = "",
                        preSubsSkuName = "",
                        preSubsProductCode = "",


                        callback = object : StepperCallback {
                            override fun cartItemPlus(qty: Int) {
                                Log.d("qwerty", "Plus qty = $qty")
                            }

                            override fun cartItemMinus(qty: Int) {
                                Log.d("qwerty", "Minus qty = $qty")
                            }

                            override fun stepperError(msg: String?) {
                                msg?.let { Log.d("qwerty", it) }
                            }
                        },

                        productCallback = object : FullWidthProductCardCallback {
                            override fun removeButtonClick(productCode: String) {
                                Log.d("qwerty", productCode)
                            }

                            override fun switchBackOrg(
                                productCode: String,
                                switchBackAvailability: Boolean
                            ) {
                                Log.d("qwerty", productCode)
                            }

                            override fun substituteCheck(productCode: String) {
                                Log.d("qwerty", productCode)
                            }
                        },
                        subsFound = true,
                        composition = ""
                    )
                    val model = ProductInfoModel(
                        isReplaced = false,
                        isOrgAddedToCart = false,
                        isAutoReplaced = false,
                        isSubsAddedToCart = false,
                        product = product,
                        suggestion = product
                    )
                    add(model)
                }
            }
        }
        return medList
    }

    suspend fun getPP(
        mxInternalErrorOccurred: MxInternalErrorOccurred
    ): PrivacyPolicyAndTnCResponse? {
        return when (val res =
            helpFaqAndTnCRepository.getPP(mxInternalErrorOccurred)) {
            is Resource.Success -> if (res.value?.isSuccessful == true) res.value.body() else {
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
            is Resource.Success -> if (res.value?.isSuccessful == true) res.value.body() else {
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

    suspend fun acceptPpAndTnc(
        mxInternalErrorOccurred: MxInternalErrorOccurred, customerId: String, type: String
    ): ResponseBody? {
        return when (val res =
            helpFaqAndTnCRepository.acceptPPOrTNC(mxInternalErrorOccurred, customerId, type)) {
            is Resource.Success -> if (res.value?.isSuccessful == true) res.value.body() else {
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

    suspend fun fetchTruemedsContactByName(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        name: String
    ): ResponseBody? {
        var response: ResponseBody? = null
        when (val fetchTruemedsContactByNameResponse =
            homePageRepository.fetchTruemedsContactByName(mxInternalErrorOccurred, name)) {
            is Resource.Success -> {
                fetchTruemedsContactByNameResponse.value?.let {
                    response = if (it.isSuccessful) {
                        it.body()
                    } else {
                        try {
                            mxInternalErrorOccurred.errorCode = it.code()
                            mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                                it.errorBody()?.string(),
                                ApiCoreResponse::class.java
                            ).message
                            sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                        } catch (_: Exception) {
                        }
                        null
                    }
                }
            }

            is Resource.Failure -> response = null
            else -> response = null
        }
        return response
    }


    suspend fun saveContactMappingInfo(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        version: String
    ): ResponseBody? {
        var response: ResponseBody? = null
        when (val saveContactMappingInfoResponse =
            homePageRepository.saveContactMappingInfo(mxInternalErrorOccurred, version)) {
            is Resource.Success -> {
                saveContactMappingInfoResponse.value?.let {
                    response = if (it.isSuccessful) {
                        it.body()
                    } else {
                        try {
                            mxInternalErrorOccurred.errorCode = it.code()
                            mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                                it.errorBody()?.string(),
                                ApiCoreResponse::class.java
                            ).message
                            sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                        } catch (_: Exception) {
                        }
                        null
                    }
                }
            }

            is Resource.Failure -> response = null
            else -> response = null
        }
        return response
    }


}