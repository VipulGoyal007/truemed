package com.intellihealth.truemeds.data.repository.datasourceimpl.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0096@\u00a2\u0006\u0002\u0010\rJ$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\n2\u0006\u0010\u0015\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0002\u0010\rJ*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\n2\u0006\u0010\u0018\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u001aH\u0096@\u00a2\u0006\u0002\u0010\u001bJ\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\nH\u0096@\u00a2\u0006\u0002\u0010\u001eJ,\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\n2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0002\u0010$J&\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00140\n2\u0006\u0010&\u001a\u00020\u00072\b\u0010\'\u001a\u0004\u0018\u00010\u0007H\u0096@\u00a2\u0006\u0002\u0010\u0012J(\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\n2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010\u0007H\u0096@\u00a2\u0006\u0002\u0010-J\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00140\n2\u0006\u0010/\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0002\u0010\rJ,\u00100\u001a\b\u0012\u0004\u0012\u00020\u00140\n2\u0006\u0010*\u001a\u00020+2\u0006\u00101\u001a\u00020+2\u0006\u00102\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0002\u00103J.\u00104\u001a\b\u0012\u0004\u0012\u00020\u00140\n2\u0006\u00105\u001a\u00020\u00072\u0006\u0010*\u001a\u00020+2\b\u00106\u001a\u0004\u0018\u000107H\u0096@\u00a2\u0006\u0002\u00108R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasourceimpl/remote/HomePageRemoteDataSourceImpl;", "Lcom/intellihealth/truemeds/data/repository/datasource/remote/HomePageRemoteDataSource;", "context", "Landroid/content/Context;", "homePageApi", "Lcom/intellihealth/truemeds/data/api/HomePageApi;", "contentType", "", "(Landroid/content/Context;Lcom/intellihealth/truemeds/data/api/HomePageApi;Ljava/lang/String;)V", "checkPincodeServiceability", "Lretrofit2/Response;", "Lcom/intellihealth/truemeds/data/model/home/PinCodeServiceabilityResponse;", "pincode", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchHomePageCategory", "Lcom/intellihealth/truemeds/data/model/home/HomePageOtcResponse;", "sessionToken", "wareHouseId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTruemedsContactByName", "Lokhttp3/ResponseBody;", "name", "getBannersForHomePage", "Lcom/intellihealth/truemeds/data/model/home/HomePageBannersResponse;", "type", "subType", "", "(Ljava/lang/String;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRatingDetails", "Lcom/intellihealth/truemeds/data/model/home/RatingDetailsResponseModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVideoFaq", "Lcom/intellihealth/truemeds/data/model/home/VideoFaqAllResponse;", "page", "limit", "source", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWordpressArticle", "userAgent", "urlParam", "increaseDigitizedOrderRank", "Lcom/intellihealth/truemeds/data/model/home/IncreaseDigitizedOrderRankModel;", "orderId", "", "transactionId", "(Ljava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveContactMappingInfo", "version", "savePopUpReasons", "optionReasonId", "optionType", "(JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveRatingDetails", "customerId", "saveRatingDetailsRequestDataModel", "Lcom/intellihealth/truemeds/data/model/orderflow/SaveRatingDetailsRequestDataModel;", "(Ljava/lang/String;JLcom/intellihealth/truemeds/data/model/orderflow/SaveRatingDetailsRequestDataModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public final class HomePageRemoteDataSourceImpl implements com.intellihealth.truemeds.data.repository.datasource.remote.HomePageRemoteDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.data.api.HomePageApi homePageApi = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String contentType = null;
    
    @javax.inject.Inject()
    public HomePageRemoteDataSourceImpl(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.api.HomePageApi homePageApi, @javax.inject.Named(value = "content_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getBannersForHomePage(@org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> subType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.HomePageBannersResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getWordpressArticle(@org.jetbrains.annotations.NotNull()
    java.lang.String userAgent, @org.jetbrains.annotations.Nullable()
    java.lang.String urlParam, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getRatingDetails(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.RatingDetailsResponseModel>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getVideoFaq(@org.jetbrains.annotations.NotNull()
    java.lang.String page, @org.jetbrains.annotations.NotNull()
    java.lang.String limit, @org.jetbrains.annotations.NotNull()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object saveRatingDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, long orderId, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderflow.SaveRatingDetailsRequestDataModel saveRatingDetailsRequestDataModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object savePopUpReasons(long orderId, long optionReasonId, @org.jetbrains.annotations.NotNull()
    java.lang.String optionType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object checkPincodeServiceability(@org.jetbrains.annotations.Nullable()
    java.lang.String pincode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.PinCodeServiceabilityResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object increaseDigitizedOrderRank(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.String transactionId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.IncreaseDigitizedOrderRankModel>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchHomePageCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String sessionToken, @org.jetbrains.annotations.NotNull()
    java.lang.String wareHouseId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.HomePageOtcResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchTruemedsContactByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object saveContactMappingInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String version, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
}