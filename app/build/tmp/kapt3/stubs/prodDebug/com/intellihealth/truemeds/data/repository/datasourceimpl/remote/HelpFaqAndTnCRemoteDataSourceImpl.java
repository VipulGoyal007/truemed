package com.intellihealth.truemeds.data.repository.datasourceimpl.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\n\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0096@\u00a2\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\bH\u0096@\u00a2\u0006\u0002\u0010\u0012J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\b2\u0006\u0010\u001a\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010\u000fJ\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\bH\u0096@\u00a2\u0006\u0002\u0010\u0012J\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@\u00a2\u0006\u0002\u0010 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasourceimpl/remote/HelpFaqAndTnCRemoteDataSourceImpl;", "Lcom/intellihealth/truemeds/data/repository/datasource/remote/HelpFaqAndTnCRemoteDataSource;", "helpFaqTncApi", "Lcom/intellihealth/truemeds/data/api/HelpFaqTncApi;", "contentType", "", "(Lcom/intellihealth/truemeds/data/api/HelpFaqTncApi;Ljava/lang/String;)V", "acceptPPOrTNC", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "customerId", "type", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkIfCustomerAcceptedPPAndTNC", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/AcceptedPPAndTnCResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllFAQCategory", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/FaqCategoryResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFAQByCategory", "categoryId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHelpCategory", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/HelpCategoryResponse;", "getHelpCategoryDetails", "reasonId", "getPP", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/PrivacyPolicyAndTnCResponse;", "getTNC", "isPrimary", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public final class HelpFaqAndTnCRemoteDataSourceImpl implements com.intellihealth.truemeds.data.repository.datasource.remote.HelpFaqAndTnCRemoteDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.data.api.HelpFaqTncApi helpFaqTncApi = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String contentType = null;
    
    @javax.inject.Inject()
    public HelpFaqAndTnCRemoteDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.api.HelpFaqTncApi helpFaqTncApi, @javax.inject.Named(value = "content_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getHelpCategory(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getHelpCategoryDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String reasonId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getAllFAQCategory(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.helpfaqtnc.FaqCategoryResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getFAQByCategory(int categoryId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.helpfaqtnc.FaqCategoryResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getPP(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.helpfaqtnc.PrivacyPolicyAndTnCResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getTNC(boolean isPrimary, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.helpfaqtnc.PrivacyPolicyAndTnCResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object checkIfCustomerAcceptedPPAndTNC(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.helpfaqtnc.AcceptedPPAndTnCResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object acceptPPOrTNC(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
}