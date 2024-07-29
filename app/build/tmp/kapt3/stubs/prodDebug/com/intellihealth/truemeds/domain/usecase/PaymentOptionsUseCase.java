package com.intellihealth.truemeds.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJd\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00102\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u0014H\u0002J\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00140\u001b2\u0006\u0010\u001d\u001a\u00020\u001cJ4\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001f2\u0006\u0010 \u001a\u00020\f2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010H\u0086@\u00a2\u0006\u0002\u0010\"J \u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0002\u0010(Jt\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000f2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0-2\u0006\u0010.\u001a\u00020/2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\f2\u0006\u00101\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&2\u0006\u00102\u001a\u000203Jx\u00104\u001a\u0002052\u0006\u0010%\u001a\u00020&2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000f0-2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010 \u001a\u00020\f2\u0006\u00107\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\f2\u0006\u00102\u001a\u0002032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0086@\u00a2\u0006\u0002\u00108J\u000e\u00109\u001a\u00020\u00122\u0006\u00101\u001a\u00020\u0012J&\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020/2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010@JJ\u0010A\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010\u0012\u0004\u0012\u00020/0\u001b2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00102\u0006\u0010B\u001a\u00020CH\u0086@\u00a2\u0006\u0002\u0010DJ6\u0010E\u001a\u00020\f2\u0006\u0010%\u001a\u00020&2\u0006\u00102\u001a\u0002032\u0006\u0010F\u001a\u0002032\u0006\u0010G\u001a\u00020\u00122\u0006\u0010H\u001a\u000203H\u0086@\u00a2\u0006\u0002\u0010IJ\u001e\u0010J\u001a\u00020\n2\u0006\u0010%\u001a\u00020&2\u0006\u00102\u001a\u000203H\u0086@\u00a2\u0006\u0002\u0010KJ>\u0010L\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00102\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00102\u0006\u0010M\u001a\u00020/H\u0086@\u00a2\u0006\u0002\u0010NR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006O"}, d2 = {"Lcom/intellihealth/truemeds/domain/usecase/PaymentOptionsUseCase;", "", "orderFlowRepository", "Lcom/intellihealth/truemeds/domain/repository/OrderFlowRepository;", "context", "Landroid/content/Context;", "sdkEventUseCase", "Lcom/intellihealth/truemeds/domain/usecase/analytics/SdkEventUseCase;", "(Lcom/intellihealth/truemeds/domain/repository/OrderFlowRepository;Landroid/content/Context;Lcom/intellihealth/truemeds/domain/usecase/analytics/SdkEventUseCase;)V", "addCodToPaymentOptionsList", "", "addCOD", "", "paymentOptionsList", "Ljava/util/ArrayList;", "Lcom/intellihealth/truemeds/data/model/psp/PaymentMethodResponse$ResponseData;", "Lkotlin/collections/ArrayList;", "lastPaymentMethodSelected", "", "addMoreForCod", "", "restrictCod", "payableAmountButtonText", "calculateBillDetail", "Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse;", "totalPayableAmount", "calculateBillDetailsOnBillUpdate", "Lkotlin/Pair;", "Lcom/intellihealth/salt/models/BillDetailsModel;", "billDetails", "checkForPaymentSpecificCouponApplied", "", "isPaymentSpecificCoupon", "totalPaymentOptionsList", "(ZLjava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchIconMaster", "Lcom/intellihealth/truemeds/data/model/psp/PaymentMethodResponse;", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "iconType", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPaymentMethodSelected", "Lcom/intellihealth/truemeds/presentation/model/PaymentMethodSelectionModel;", "item", "paymentList", "", "position", "", "clickedOnPage", "appliedCouponCode", "orderId", "", "processPaymentMethodsResponse", "Lcom/intellihealth/truemeds/presentation/model/PaymentSelectionResponse;", "iconMasterResponse", "couponCodeApplied", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;ZDZDZJLcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDataBasedOnPspVariant", "setErrorResponseBody", "Lcom/intellihealth/truemeds/data/utils/ResponseData;", "errorCode", "errorBody", "Lokhttp3/ResponseBody;", "isNetworkError", "(ILokhttp3/ResponseBody;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setOriginalPaymentOptionsList", "application", "Landroid/app/Application;", "(Ljava/util/ArrayList;Landroid/app/Application;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setPaymentSelectionMethod", "paymentMethodId", "paymentMethod", "paymentMode", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JJLjava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setPspViewedByCustomer", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setTemporaryPaymentOptionsList", "selectedIndex", "(Ljava/util/ArrayList;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public final class PaymentOptionsUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.repository.OrderFlowRepository orderFlowRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase sdkEventUseCase = null;
    
    @javax.inject.Inject()
    public PaymentOptionsUseCase(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.repository.OrderFlowRepository orderFlowRepository, @dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase sdkEventUseCase) {
        super();
    }
    
    /**
     * Fetch icons and payment methods
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchIconMaster(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String iconType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object processPaymentMethodsResponse(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> iconMasterResponse, @org.jetbrains.annotations.Nullable()
    java.lang.String lastPaymentMethodSelected, boolean isPaymentSpecificCoupon, @org.jetbrains.annotations.NotNull()
    java.lang.String couponCodeApplied, boolean payableAmountButtonText, double totalPayableAmount, boolean addCOD, double addMoreForCod, boolean restrictCod, long orderId, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse calculateBillDetail, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.presentation.model.PaymentSelectionResponse> $completion) {
        return null;
    }
    
    /**
     * Add COD payment method to the already existing payment option list
     */
    private final void addCodToPaymentOptionsList(boolean addCOD, java.util.ArrayList<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> paymentOptionsList, android.content.Context context, java.lang.String lastPaymentMethodSelected, double addMoreForCod, boolean restrictCod, boolean payableAmountButtonText, com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse calculateBillDetail, double totalPayableAmount) {
    }
    
    /**
     * store all payment options list as coming from the API
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setOriginalPaymentOptionsList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> paymentOptionsList, @org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Pair<? extends java.util.ArrayList<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData>, java.lang.Integer>> $completion) {
        return null;
    }
    
    /**
     * Store temporary payment options list to show view more button functionality
     * This will be applicable for only if payment specific coupon is applied on the order
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setTemporaryPaymentOptionsList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> paymentOptionsList, int selectedIndex, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.ArrayList<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.model.PaymentMethodSelectionModel onPaymentMethodSelected(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData item, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> paymentList, int position, boolean payableAmountButtonText, double totalPayableAmount, @org.jetbrains.annotations.NotNull()
    java.lang.String clickedOnPage, boolean isPaymentSpecificCoupon, @org.jetbrains.annotations.NotNull()
    java.lang.String appliedCouponCode, boolean addCOD, boolean restrictCod, double addMoreForCod, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId) {
        return null;
    }
    
    /**
     * Check if any payment specific coupon is applied on the order
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object checkForPaymentSpecificCouponApplied(boolean isPaymentSpecificCoupon, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> totalPaymentOptionsList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData>> $completion) {
        return null;
    }
    
    /**
     * In PSP screen when the user has the option to PAY
     * 1) User clicks on Pay button on PSP screen
     * 2) Selected paymentMethodId, paymentMethod and orderId gets passed to the API as request parameters
     * 3) As well as user is redirected to Payment Activity(CashFree screen) where User gets the option to Pay via different payment methods or
     * selected payment method screen.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setPaymentSelectionMethod(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, long paymentMethodId, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethod, long paymentMode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setPspViewedByCustomer(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<com.intellihealth.salt.models.BillDetailsModel, java.lang.Double> calculateBillDetailsOnBillUpdate(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.models.BillDetailsModel billDetails) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String setDataBasedOnPspVariant(@org.jetbrains.annotations.NotNull()
    java.lang.String appliedCouponCode) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setErrorResponseBody(int errorCode, @org.jetbrains.annotations.NotNull()
    okhttp3.ResponseBody errorBody, boolean isNetworkError, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.ResponseData> $completion) {
        return null;
    }
}