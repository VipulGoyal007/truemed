package com.intellihealth.truemeds.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J,\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096@\u00a2\u0006\u0002\u0010\u000fJ2\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010\u0014J*\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010\u000fJ8\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001cH\u0096@\u00a2\u0006\u0002\u0010\u001dJ\"\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00a2\u0006\u0002\u0010 J:\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010&J4\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0096@\u00a2\u0006\u0002\u0010\u0014J6\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010\u000eH\u0096@\u00a2\u0006\u0002\u0010/J*\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00101\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010\u000fJ:\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010,\u001a\u00020-2\u0006\u00103\u001a\u00020-2\u0006\u00104\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u00105J<\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00107\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020-2\b\u00108\u001a\u0004\u0018\u000109H\u0096@\u00a2\u0006\u0002\u0010:R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006;"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/HomePageRepositoryImpl;", "Lcom/intellihealth/truemeds/domain/repository/HomePageRepository;", "homePageRemoteDataSource", "Lcom/intellihealth/truemeds/data/repository/datasource/remote/HomePageRemoteDataSource;", "apiCallInitClass", "Lcom/intellihealth/truemeds/data/utils/ApiCallInitClass;", "(Lcom/intellihealth/truemeds/data/repository/datasource/remote/HomePageRemoteDataSource;Lcom/intellihealth/truemeds/data/utils/ApiCallInitClass;)V", "checkPincodeServiceability", "Lcom/intellihealth/truemeds/data/utils/Resource;", "Lretrofit2/Response;", "Lcom/intellihealth/truemeds/data/model/home/PinCodeServiceabilityResponse;", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "pincode", "", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchHomePageCategory", "Lcom/intellihealth/truemeds/data/model/home/HomePageOtcResponse;", "sessionToken", "wareHouseId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTruemedsContactByName", "Lokhttp3/ResponseBody;", "name", "getHomePageBanners", "Lcom/intellihealth/truemeds/data/model/home/HomePageBannersResponse;", "type", "subType", "", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRatingDetails", "Lcom/intellihealth/truemeds/data/model/home/RatingDetailsResponseModel;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVideoFaq", "Lcom/intellihealth/truemeds/data/model/home/VideoFaqAllResponse;", "page", "limit", "source", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWordpressArticle", "userAgent", "urlParam", "increaseDigitizedOrderRank", "Lcom/intellihealth/truemeds/data/model/home/IncreaseDigitizedOrderRankModel;", "orderId", "", "transactionId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveContactMappingInfo", "version", "savePopUpReasons", "optionReasonId", "optionType", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveRatingDetails", "customerId", "saveRatingDetailsRequestDataModel", "Lcom/intellihealth/truemeds/data/model/orderflow/SaveRatingDetailsRequestDataModel;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;JLcom/intellihealth/truemeds/data/model/orderflow/SaveRatingDetailsRequestDataModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_stageAndroidDebug"})
public final class HomePageRepositoryImpl implements com.intellihealth.truemeds.domain.repository.HomePageRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.data.repository.datasource.remote.HomePageRemoteDataSource homePageRemoteDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.data.utils.ApiCallInitClass apiCallInitClass = null;
    
    @javax.inject.Inject()
    public HomePageRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.remote.HomePageRemoteDataSource homePageRemoteDataSource, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.utils.ApiCallInitClass apiCallInitClass) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getHomePageBanners(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> subType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.home.HomePageBannersResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getWordpressArticle(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String userAgent, @org.jetbrains.annotations.Nullable()
    java.lang.String urlParam, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getRatingDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.home.RatingDetailsResponseModel>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getVideoFaq(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String page, @org.jetbrains.annotations.NotNull()
    java.lang.String limit, @org.jetbrains.annotations.NotNull()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object saveRatingDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, long orderId, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderflow.SaveRatingDetailsRequestDataModel saveRatingDetailsRequestDataModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object savePopUpReasons(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, long optionReasonId, @org.jetbrains.annotations.NotNull()
    java.lang.String optionType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object checkPincodeServiceability(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.String pincode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.home.PinCodeServiceabilityResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object increaseDigitizedOrderRank(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.String transactionId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.home.IncreaseDigitizedOrderRankModel>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchHomePageCategory(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionToken, @org.jetbrains.annotations.NotNull()
    java.lang.String wareHouseId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.home.HomePageOtcResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchTruemedsContactByName(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object saveContactMappingInfo(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String version, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion) {
        return null;
    }
}