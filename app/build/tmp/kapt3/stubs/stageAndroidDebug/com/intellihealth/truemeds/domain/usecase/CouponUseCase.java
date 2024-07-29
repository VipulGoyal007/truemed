package com.intellihealth.truemeds.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006Jd\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0086@\u00a2\u0006\u0002\u0010\u0018JL\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016J:\u0010\u001d\u001a\u00020\u001a2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\u000eJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010!JB\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010\'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\fH\u0086@\u00a2\u0006\u0002\u0010*J\u0010\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010 \u001a\u00020\fJ&\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020%2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0086@\u00a2\u0006\u0002\u00104J\u0018\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u000e2\u0006\u00108\u001a\u000209H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2 = {"Lcom/intellihealth/truemeds/domain/usecase/CouponUseCase;", "", "orderFlowRepository", "Lcom/intellihealth/truemeds/domain/repository/OrderFlowRepository;", "sdkEventUseCase", "Lcom/intellihealth/truemeds/domain/usecase/analytics/SdkEventUseCase;", "(Lcom/intellihealth/truemeds/domain/repository/OrderFlowRepository;Lcom/intellihealth/truemeds/domain/usecase/analytics/SdkEventUseCase;)V", "applyAndRemoveCouponCode", "Lcom/intellihealth/truemeds/data/model/coupon/CouponSaveRemoveResponse;", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "orderId", "", "paymentId", "", "offerId", "billDetailsData", "Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData;", "clickedOnPage", "coupon", "Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse$Coupon;", "medicineListDataReceived", "", "Lcom/intellihealth/truemeds/data/model/orderflow/MedicineListDetailsSent;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JLjava/lang/String;Ljava/lang/String;Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData;Ljava/lang/String;Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse$Coupon;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "callCouponAppliedEvent", "", "clickedOnPag", "discountAmountApiResponse", "callCouponRemovedEvent", "convertMillisToDate", "Ljava/util/Date;", "millis", "(Ljava/lang/Long;)Ljava/util/Date;", "fetchAllOffers", "Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse;", "result", "", "pinCode", "offerType", "categoryType", "variantId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCalendarData", "Ljava/util/Calendar;", "setErrorResponseBody", "Lcom/intellihealth/truemeds/data/utils/ResponseData;", "errorCode", "errorBody", "Lokhttp3/ResponseBody;", "isNetworkError", "", "(ILokhttp3/ResponseBody;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setStickyNotificationData", "Lcom/intellihealth/salt/models/StickyNonStickyNotificationModel;", "couponCode", "context", "Landroid/content/Context;", "app_stageAndroidDebug"})
public final class CouponUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.repository.OrderFlowRepository orderFlowRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase sdkEventUseCase = null;
    
    @javax.inject.Inject()
    public CouponUseCase(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.repository.OrderFlowRepository orderFlowRepository, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase sdkEventUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchAllOffers(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, int result, @org.jetbrains.annotations.NotNull()
    java.lang.String pinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String offerType, @org.jetbrains.annotations.NotNull()
    java.lang.String categoryType, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object applyAndRemoveCouponCode(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentId, @org.jetbrains.annotations.NotNull()
    java.lang.String offerId, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData billDetailsData, @org.jetbrains.annotations.NotNull()
    java.lang.String clickedOnPage, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon coupon, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.orderflow.MedicineListDetailsSent> medicineListDataReceived, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Calendar getCalendarData(long millis) {
        return null;
    }
    
    public final void callCouponRemovedEvent(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData billDetailsData, @org.jetbrains.annotations.NotNull()
    java.lang.String clickedOnPag, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon coupon, long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String discountAmountApiResponse) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date convertMillisToDate(@org.jetbrains.annotations.Nullable()
    java.lang.Long millis) {
        return null;
    }
    
    public final void callCouponAppliedEvent(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData billDetailsData, @org.jetbrains.annotations.NotNull()
    java.lang.String clickedOnPag, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon coupon, long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String discountAmountApiResponse, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.orderflow.MedicineListDetailsSent> medicineListDataReceived) {
    }
    
    private final com.intellihealth.salt.models.StickyNonStickyNotificationModel setStickyNotificationData(java.lang.String couponCode, android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setErrorResponseBody(int errorCode, @org.jetbrains.annotations.NotNull()
    okhttp3.ResponseBody errorBody, boolean isNetworkError, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.ResponseData> $completion) {
        return null;
    }
}