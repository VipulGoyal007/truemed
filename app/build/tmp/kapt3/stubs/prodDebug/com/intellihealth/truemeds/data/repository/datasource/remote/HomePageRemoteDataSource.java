package com.intellihealth.truemeds.data.repository.datasource.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00a6@\u00a2\u0006\u0002\u0010\u0007J$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u000f\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\u0007J*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\u0006\u0010\u0012\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u00a6@\u00a2\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0018J,\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\u001eJ&\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u0006H\u00a6@\u00a2\u0006\u0002\u0010\fJ(\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00032\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\u0006H\u00a6@\u00a2\u0006\u0002\u0010\'J\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010)\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\u0007J,\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010$\u001a\u00020%2\u0006\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010-J.\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010/\u001a\u00020\u00062\u0006\u0010$\u001a\u00020%2\b\u00100\u001a\u0004\u0018\u000101H\u00a6@\u00a2\u0006\u0002\u00102\u00a8\u00063"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasource/remote/HomePageRemoteDataSource;", "", "checkPincodeServiceability", "Lretrofit2/Response;", "Lcom/intellihealth/truemeds/data/model/home/PinCodeServiceabilityResponse;", "pincode", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchHomePageCategory", "Lcom/intellihealth/truemeds/data/model/home/HomePageOtcResponse;", "sessionToken", "wareHouseId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTruemedsContactByName", "Lokhttp3/ResponseBody;", "name", "getBannersForHomePage", "Lcom/intellihealth/truemeds/data/model/home/HomePageBannersResponse;", "type", "subType", "", "(Ljava/lang/String;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRatingDetails", "Lcom/intellihealth/truemeds/data/model/home/RatingDetailsResponseModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVideoFaq", "Lcom/intellihealth/truemeds/data/model/home/VideoFaqAllResponse;", "page", "limit", "source", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWordpressArticle", "userAgent", "urlParam", "increaseDigitizedOrderRank", "Lcom/intellihealth/truemeds/data/model/home/IncreaseDigitizedOrderRankModel;", "orderId", "", "transactionId", "(Ljava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveContactMappingInfo", "version", "savePopUpReasons", "optionReasonId", "optionType", "(JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveRatingDetails", "customerId", "saveRatingDetailsRequestDataModel", "Lcom/intellihealth/truemeds/data/model/orderflow/SaveRatingDetailsRequestDataModel;", "(Ljava/lang/String;JLcom/intellihealth/truemeds/data/model/orderflow/SaveRatingDetailsRequestDataModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public abstract interface HomePageRemoteDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getBannersForHomePage(@org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> subType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.HomePageBannersResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getWordpressArticle(@org.jetbrains.annotations.NotNull()
    java.lang.String userAgent, @org.jetbrains.annotations.Nullable()
    java.lang.String urlParam, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRatingDetails(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.RatingDetailsResponseModel>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getVideoFaq(@org.jetbrains.annotations.NotNull()
    java.lang.String page, @org.jetbrains.annotations.NotNull()
    java.lang.String limit, @org.jetbrains.annotations.NotNull()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveRatingDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, long orderId, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderflow.SaveRatingDetailsRequestDataModel saveRatingDetailsRequestDataModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object savePopUpReasons(long orderId, long optionReasonId, @org.jetbrains.annotations.NotNull()
    java.lang.String optionType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object checkPincodeServiceability(@org.jetbrains.annotations.Nullable()
    java.lang.String pincode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.PinCodeServiceabilityResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object increaseDigitizedOrderRank(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.String transactionId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.IncreaseDigitizedOrderRankModel>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchHomePageCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String sessionToken, @org.jetbrains.annotations.NotNull()
    java.lang.String wareHouseId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.HomePageOtcResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchTruemedsContactByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveContactMappingInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String version, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
}