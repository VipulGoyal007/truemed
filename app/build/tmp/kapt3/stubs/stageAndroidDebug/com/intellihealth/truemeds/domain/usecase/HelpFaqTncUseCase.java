package com.intellihealth.truemeds.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\rJ \u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0002\u0010\u0013J&\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@\u00a2\u0006\u0002\u0010\u0019JX\u0010\u001a\u001a<\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001c\u0012,\u0012*\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00150\u001dj\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0015`\u001e0\u001b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0018H\u0086@\u00a2\u0006\u0002\u0010\u0019J\u0018\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\rJ \u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010#\u001a\u00020$H\u0086@\u00a2\u0006\u0002\u0010%J&\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020$H\u0086@\u00a2\u0006\u0002\u0010,R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/intellihealth/truemeds/domain/usecase/HelpFaqTncUseCase;", "", "appContext", "Landroid/content/Context;", "helpFaqAndTnCRepository", "Lcom/intellihealth/truemeds/domain/repository/HelpFaqAndTnCRepository;", "sdkEventUseCase", "Lcom/intellihealth/truemeds/domain/usecase/analytics/SdkEventUseCase;", "(Landroid/content/Context;Lcom/intellihealth/truemeds/domain/repository/HelpFaqAndTnCRepository;Lcom/intellihealth/truemeds/domain/usecase/analytics/SdkEventUseCase;)V", "getAllFAQCategory", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/FaqCategoryResponse;", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllHelpCategory", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/HelpCategoryResponse;", "getAllHelpSubCategory", "reasonId", "", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategoryById", "", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/FaqCategoryResponse$Payload;", "id", "", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFAQByCategory", "Lkotlin/Pair;", "", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "categoryId", "getPP", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/PrivacyPolicyAndTnCResponse;", "getTNC", "isPrimary", "", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setErrorResponseBody", "Lcom/intellihealth/truemeds/data/utils/ResponseData;", "errorCode", "errorBody", "Lokhttp3/ResponseBody;", "isNetworkError", "(ILokhttp3/ResponseBody;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_stageAndroidDebug"})
public final class HelpFaqTncUseCase {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context appContext = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.repository.HelpFaqAndTnCRepository helpFaqAndTnCRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase sdkEventUseCase = null;
    
    @javax.inject.Inject()
    public HelpFaqTncUseCase(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context appContext, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.repository.HelpFaqAndTnCRepository helpFaqAndTnCRepository, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase sdkEventUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllFAQCategory(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.helpfaqtnc.FaqCategoryResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFAQByCategory(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, int categoryId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Pair<? extends java.util.List<java.lang.String>, ? extends java.util.HashMap<java.lang.String, java.util.List<java.lang.String>>>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setErrorResponseBody(int errorCode, @org.jetbrains.annotations.NotNull()
    okhttp3.ResponseBody errorBody, boolean isNetworkError, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.ResponseData> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllHelpCategory(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllHelpSubCategory(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String reasonId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPP(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.helpfaqtnc.PrivacyPolicyAndTnCResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTNC(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, boolean isPrimary, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.helpfaqtnc.PrivacyPolicyAndTnCResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCategoryById(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.FaqCategoryResponse.Payload>> $completion) {
        return null;
    }
}