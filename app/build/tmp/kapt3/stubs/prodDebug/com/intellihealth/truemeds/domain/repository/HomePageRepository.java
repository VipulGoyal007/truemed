package com.intellihealth.truemeds.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u00a6@\u00a2\u0006\u0002\u0010\nJ2\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\u000fJ*\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\nJ8\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0017H\u00a6@\u00a2\u0006\u0002\u0010\u0018J\"\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0002\u0010\u001bJ:\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010!J4\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\tH\u00a6@\u00a2\u0006\u0002\u0010\u000fJ6\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010\tH\u00a6@\u00a2\u0006\u0002\u0010*J*\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\nJ:\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\'\u001a\u00020(2\u0006\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u00100J<\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u00102\u001a\u00020\t2\u0006\u0010\'\u001a\u00020(2\b\u00103\u001a\u0004\u0018\u000104H\u00a6@\u00a2\u0006\u0002\u00105\u00a8\u00066"}, d2 = {"Lcom/intellihealth/truemeds/domain/repository/HomePageRepository;", "", "checkPincodeServiceability", "Lcom/intellihealth/truemeds/data/utils/Resource;", "Lretrofit2/Response;", "Lcom/intellihealth/truemeds/data/model/home/PinCodeServiceabilityResponse;", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "pincode", "", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchHomePageCategory", "Lcom/intellihealth/truemeds/data/model/home/HomePageOtcResponse;", "sessionToken", "wareHouseId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTruemedsContactByName", "Lokhttp3/ResponseBody;", "name", "getHomePageBanners", "Lcom/intellihealth/truemeds/data/model/home/HomePageBannersResponse;", "type", "subType", "", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRatingDetails", "Lcom/intellihealth/truemeds/data/model/home/RatingDetailsResponseModel;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVideoFaq", "Lcom/intellihealth/truemeds/data/model/home/VideoFaqAllResponse;", "page", "limit", "source", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWordpressArticle", "userAgent", "urlParam", "increaseDigitizedOrderRank", "Lcom/intellihealth/truemeds/data/model/home/IncreaseDigitizedOrderRankModel;", "orderId", "", "transactionId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveContactMappingInfo", "version", "savePopUpReasons", "optionReasonId", "optionType", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveRatingDetails", "customerId", "saveRatingDetailsRequestDataModel", "Lcom/intellihealth/truemeds/data/model/orderflow/SaveRatingDetailsRequestDataModel;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;JLcom/intellihealth/truemeds/data/model/orderflow/SaveRatingDetailsRequestDataModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public abstract interface HomePageRepository {
    
    /**
     * This service provides banners, alert image, 3S banner for homepage
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHomePageBanners(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> subType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.home.HomePageBannersResponse>>> $completion);
    
    /**
     * This service provides list of active health articles
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getWordpressArticle(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String userAgent, @org.jetbrains.annotations.Nullable()
    java.lang.String urlParam, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRatingDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.home.RatingDetailsResponseModel>>> $completion);
    
    /**
     * This service provides Video FAQ url
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getVideoFaq(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String page, @org.jetbrains.annotations.NotNull()
    java.lang.String limit, @org.jetbrains.annotations.NotNull()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse>>> $completion);
    
    /**
     * This service used to save app rating
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveRatingDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, long orderId, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderflow.SaveRatingDetailsRequestDataModel saveRatingDetailsRequestDataModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion);
    
    /**
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object savePopUpReasons(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, long optionReasonId, @org.jetbrains.annotations.NotNull()
    java.lang.String optionType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion);
    
    /**
     * This service used to check if given pincode is serviceable/deliverable
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object checkPincodeServiceability(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.String pincode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.home.PinCodeServiceabilityResponse>>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object increaseDigitizedOrderRank(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.String transactionId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.home.IncreaseDigitizedOrderRankModel>>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchHomePageCategory(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionToken, @org.jetbrains.annotations.NotNull()
    java.lang.String wareHouseId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.home.HomePageOtcResponse>>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchTruemedsContactByName(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveContactMappingInfo(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String version, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion);
}