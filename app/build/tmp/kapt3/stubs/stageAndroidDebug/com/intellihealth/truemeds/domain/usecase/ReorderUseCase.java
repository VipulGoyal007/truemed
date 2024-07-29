package com.intellihealth.truemeds.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0082\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u001e\u0010\u000f\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0010j\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u0001`\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0086@\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/intellihealth/truemeds/domain/usecase/ReorderUseCase;", "", "orderFlowRepository", "Lcom/intellihealth/truemeds/domain/repository/OrderFlowRepository;", "sdkEventUseCase", "Lcom/intellihealth/truemeds/domain/usecase/analytics/SdkEventUseCase;", "(Lcom/intellihealth/truemeds/domain/repository/OrderFlowRepository;Lcom/intellihealth/truemeds/domain/usecase/analytics/SdkEventUseCase;)V", "reOrder", "Lcom/intellihealth/truemeds/data/model/home/ReorderResponse;", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "orderId", "", "customerId", "", "patientListDto", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "variant", "checkAutoConfirmEligibility", "", "newAlgo", "serialId", "", "reOrderMedCheck", "variantId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/Long;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;ZZLjava/lang/Integer;ZLjava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_stageAndroidDebug"})
public final class ReorderUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.repository.OrderFlowRepository orderFlowRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase sdkEventUseCase = null;
    
    @javax.inject.Inject()
    public ReorderUseCase(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.repository.OrderFlowRepository orderFlowRepository, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase sdkEventUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object reOrder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.Long> patientListDto, @org.jetbrains.annotations.Nullable()
    java.lang.String variant, boolean checkAutoConfirmEligibility, boolean newAlgo, @org.jetbrains.annotations.Nullable()
    java.lang.Integer serialId, boolean reOrderMedCheck, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.home.ReorderResponse> $completion) {
        return null;
    }
}