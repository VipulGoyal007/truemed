package com.intellihealth.truemeds.data.repository.datasource.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u00a6@\u00a2\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u000eJ\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\u0006\u0010\u0016\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u000eJ\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u00a6@\u00a2\u0006\u0002\u0010\u001c\u00a8\u0006\u001d"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasource/remote/HelpFaqAndTnCRemoteDataSource;", "", "acceptPPOrTNC", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "customerId", "", "type", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkIfCustomerAcceptedPPAndTNC", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/AcceptedPPAndTnCResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllFAQCategory", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/FaqCategoryResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFAQByCategory", "categoryId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHelpCategory", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/HelpCategoryResponse;", "getHelpCategoryDetails", "reasonId", "getPP", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/PrivacyPolicyAndTnCResponse;", "getTNC", "isPrimary", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_stageAndroidDebug"})
public abstract interface HelpFaqAndTnCRemoteDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHelpCategory(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHelpCategoryDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String reasonId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllFAQCategory(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.helpfaqtnc.FaqCategoryResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFAQByCategory(int categoryId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.helpfaqtnc.FaqCategoryResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPP(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.helpfaqtnc.PrivacyPolicyAndTnCResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTNC(boolean isPrimary, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.helpfaqtnc.PrivacyPolicyAndTnCResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object checkIfCustomerAcceptedPPAndTNC(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.helpfaqtnc.AcceptedPPAndTnCResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object acceptPPOrTNC(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
}