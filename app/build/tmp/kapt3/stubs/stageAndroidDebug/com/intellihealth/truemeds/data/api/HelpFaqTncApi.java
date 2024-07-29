package com.intellihealth.truemeds.data.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JB\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00a2\u0006\u0002\u0010\nJ6\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00a2\u0006\u0002\u0010\rJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0010J6\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00a7@\u00a2\u0006\u0002\u0010\u0014J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0010J6\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00a2\u0006\u0002\u0010\rJ \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u001bJ*\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u001d\u001a\u00020\u001eH\u00a7@\u00a2\u0006\u0002\u0010\u001f\u00a8\u0006 "}, d2 = {"Lcom/intellihealth/truemeds/data/api/HelpFaqTncApi;", "", "acceptPPOrTNC", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "contentType", "", "authorization", "customerId", "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkIfCustomerAcceptedPPAndTNC", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/AcceptedPPAndTnCResponse;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllFAQCategory", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/FaqCategoryResponse;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFAQByCategory", "categoryId", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHelpCategory", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/HelpCategoryResponse;", "getHelpCategoryDetails", "id", "getPP", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/PrivacyPolicyAndTnCResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTNC", "isPrimary", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_stageAndroidDebug"})
public abstract interface HelpFaqTncApi {
    
    @retrofit2.http.GET(value = "/CustomerService/v1/getHelpCategory")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHelpCategory(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse>> $completion);
    
    @retrofit2.http.GET(value = "/CustomerService/v1/getHelpCategoryDetails")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHelpCategoryDetails(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String authorization, @retrofit2.http.Query(value = "id")
    @org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse>> $completion);
    
    @retrofit2.http.POST(value = "/CustomerService/faq/category")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllFAQCategory(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.helpfaqtnc.FaqCategoryResponse>> $completion);
    
    @retrofit2.http.POST(value = "/CustomerService/faq/id/category")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFAQByCategory(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String authorization, @retrofit2.http.Query(value = "categoryId")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer categoryId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.helpfaqtnc.FaqCategoryResponse>> $completion);
    
    @retrofit2.http.GET(value = "/CustomerService/v1/getPP")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPP(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.Nullable()
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.helpfaqtnc.PrivacyPolicyAndTnCResponse>> $completion);
    
    @retrofit2.http.GET(value = "/CustomerService/v1/getTNC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTNC(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.Nullable()
    java.lang.String contentType, @retrofit2.http.Query(value = "isPrimary")
    boolean isPrimary, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.helpfaqtnc.PrivacyPolicyAndTnCResponse>> $completion);
    
    @retrofit2.http.GET(value = "/CustomerService/checkIfCustomerAcceptedPPAndTNC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object checkIfCustomerAcceptedPPAndTNC(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String authorization, @retrofit2.http.Query(value = "customerId")
    @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.helpfaqtnc.AcceptedPPAndTnCResponse>> $completion);
    
    @retrofit2.http.POST(value = "/CustomerService/v1/acceptPPOrTNC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object acceptPPOrTNC(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String authorization, @retrofit2.http.Query(value = "customerId")
    @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @retrofit2.http.Query(value = "type")
    @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
}