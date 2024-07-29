package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010f\u001a\u00020g2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010h\u001a\u00020i2\u0006\u0010:\u001a\u00020;J\u000e\u0010j\u001a\u00020g2\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010k\u001a\u00020gH\u0002J\b\u0010l\u001a\u00020gH\u0002J\b\u0010m\u001a\u00020gH\u0002J\u001c\u0010n\u001a\u00020g2\b\u0010o\u001a\u0004\u0018\u00010p2\b\u0010q\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010r\u001a\u00020g2\b\u0010q\u001a\u0004\u0018\u00010\u001aH\u0016J\u0016\u0010s\u001a\u00020g2\u0006\u0010t\u001a\u00020uH\u0082@\u00a2\u0006\u0002\u0010vJ\u0006\u0010w\u001a\u00020gJ\u0006\u0010x\u001a\u00020gJ\u0016\u0010y\u001a\u00020g2\u0006\u0010t\u001a\u00020uH\u0082@\u00a2\u0006\u0002\u0010vR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR(\u0010%\u001a\u0010\u0012\f\u0012\n (*\u0004\u0018\u00010\'0\'0&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R(\u00101\u001a\u0010\u0012\f\u0012\n (*\u0004\u0018\u00010\'0\'0&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010*\"\u0004\b3\u0010,R\u001a\u00104\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010:\u001a\u00020;X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R(\u0010@\u001a\u0010\u0012\f\u0012\n (*\u0004\u0018\u00010\u001a0\u001a0&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010*\"\u0004\bB\u0010,R\u001a\u0010C\u001a\u00020;X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010=\"\u0004\bE\u0010?R\u001a\u0010F\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u001c\"\u0004\bH\u0010\u001eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0K0J8F\u00a2\u0006\u0006\u001a\u0004\bM\u0010NR\u001a\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0K0&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0K0J8F\u00a2\u0006\u0006\u001a\u0004\bQ\u0010NR\u001a\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0K0&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010S\u001a\u0010\u0012\f\u0012\n (*\u0004\u0018\u00010\'0\'0&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010*\"\u0004\bU\u0010,R(\u0010V\u001a\u0010\u0012\f\u0012\n (*\u0004\u0018\u00010\'0\'0&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010*\"\u0004\bX\u0010,R\u001d\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0K0J8F\u00a2\u0006\u0006\u001a\u0004\bZ\u0010NR\u001a\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0K0&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\\\u001a\u0010\u0012\f\u0012\n (*\u0004\u0018\u00010\'0\'0&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010*\"\u0004\b^\u0010,R\u001a\u0010_\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u0010\u001c\"\u0004\ba\u0010\u001eR(\u0010b\u001a\u0010\u0012\f\u0012\n (*\u0004\u0018\u00010c0c0&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010*\"\u0004\be\u0010,\u00a8\u0006z"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/PaymentStatusViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/cashfree/pg/core/api/callback/CFCheckoutResponseCallback;", "cashFreeUseCase", "Lcom/intellihealth/truemeds/domain/usecase/CashFreeUseCase;", "orderFlowUseCase", "Lcom/intellihealth/truemeds/domain/usecase/OrderFlowUseCase;", "sdkEventUseCase", "Lcom/intellihealth/truemeds/domain/usecase/analytics/SdkEventUseCase;", "context", "Landroid/content/Context;", "(Lcom/intellihealth/truemeds/domain/usecase/CashFreeUseCase;Lcom/intellihealth/truemeds/domain/usecase/OrderFlowUseCase;Lcom/intellihealth/truemeds/domain/usecase/analytics/SdkEventUseCase;Landroid/content/Context;)V", "billDetails", "Lcom/intellihealth/salt/models/BillDetailsModel;", "getBillDetails", "()Lcom/intellihealth/salt/models/BillDetailsModel;", "setBillDetails", "(Lcom/intellihealth/salt/models/BillDetailsModel;)V", "billDetailsResponse", "Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData;", "getBillDetailsResponse", "()Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData;", "setBillDetailsResponse", "(Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData;)V", "clickedOnPage", "", "getClickedOnPage", "()Ljava/lang/String;", "setClickedOnPage", "(Ljava/lang/String;)V", "code", "getCode", "setCode", "currentOrderStatus", "getCurrentOrderStatus", "setCurrentOrderStatus", "finishPage", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getFinishPage", "()Landroidx/lifecycle/MutableLiveData;", "setFinishPage", "(Landroidx/lifecycle/MutableLiveData;)V", "isReorder", "()Z", "setReorder", "(Z)V", "launchPaymentPage", "getLaunchPaymentPage", "setLaunchPaymentPage", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "getMxInternalErrorOccurred", "()Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "setMxInternalErrorOccurred", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;)V", "orderId", "", "getOrderId", "()J", "setOrderId", "(J)V", "paymentMethod", "getPaymentMethod", "setPaymentMethod", "paymentMethodId", "getPaymentMethodId", "setPaymentMethodId", "paymentSessionId", "getPaymentSessionId", "setPaymentSessionId", "showCancelledPopupEventLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/intellihealth/truemeds/presentation/viewmodel/events/Event;", "", "getShowCancelledPopupEventLiveData", "()Landroidx/lifecycle/LiveData;", "showCancelledPopupEventMutableLiveData", "showPaymentErrorPopupEventLiveData", "getShowPaymentErrorPopupEventLiveData", "showPaymentErrorPopupEventMutableLiveData", "showPaymentFailureView", "getShowPaymentFailureView", "setShowPaymentFailureView", "showPaymentHoldOnView", "getShowPaymentHoldOnView", "setShowPaymentHoldOnView", "showPaymentPendingPopupEventLiveData", "getShowPaymentPendingPopupEventLiveData", "showPaymentPendingPopupEventMutableLiveData", "showPaymentSuccessView", "getShowPaymentSuccessView", "setShowPaymentSuccessView", "status", "getStatus", "setStatus", "totalPayableAmount", "", "getTotalPayableAmount", "setTotalPayableAmount", "doDropCheckoutPayment", "", "getCartBillDetails", "Lkotlinx/coroutines/Job;", "initCashFreeSdk", "loadOnPaymentError", "loadOnPaymentPending", "loadPageOnPaymentCancelled", "onPaymentFailure", "cfErrorResponse", "Lcom/cashfree/pg/core/api/utils/CFErrorResponse;", "orderID", "onPaymentVerify", "processPaymentDetails", "jsonObject", "Lcom/google/gson/JsonObject;", "(Lcom/google/gson/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "triggerPaymentFailedEvent", "triggerPaymentSuccessEvent", "updateUI", "app_stageAndroidDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class PaymentStatusViewModel extends androidx.lifecycle.ViewModel implements androidx.lifecycle.DefaultLifecycleObserver, com.cashfree.pg.core.api.callback.CFCheckoutResponseCallback {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.CashFreeUseCase cashFreeUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.OrderFlowUseCase orderFlowUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase sdkEventUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showPaymentSuccessView;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showPaymentFailureView;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showPaymentHoldOnView;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> launchPaymentPage;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> finishPage;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String status = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String code = "";
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> showCancelledPopupEventMutableLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> showPaymentErrorPopupEventMutableLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> showPaymentPendingPopupEventMutableLiveData = null;
    private long orderId = 0L;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> paymentMethod;
    private long paymentMethodId = 0L;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String paymentSessionId = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currentOrderStatus = "";
    private boolean isReorder = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String clickedOnPage = "";
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.salt.models.BillDetailsModel billDetails;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData billDetailsResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Double> totalPayableAmount;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred;
    
    @javax.inject.Inject()
    public PaymentStatusViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.CashFreeUseCase cashFreeUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.OrderFlowUseCase orderFlowUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase sdkEventUseCase, @dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowPaymentSuccessView() {
        return null;
    }
    
    public final void setShowPaymentSuccessView(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowPaymentFailureView() {
        return null;
    }
    
    public final void setShowPaymentFailureView(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowPaymentHoldOnView() {
        return null;
    }
    
    public final void setShowPaymentHoldOnView(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLaunchPaymentPage() {
        return null;
    }
    
    public final void setLaunchPaymentPage(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getFinishPage() {
        return null;
    }
    
    public final void setFinishPage(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCode() {
        return null;
    }
    
    public final void setCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getShowCancelledPopupEventLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getShowPaymentErrorPopupEventLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getShowPaymentPendingPopupEventLiveData() {
        return null;
    }
    
    public final long getOrderId() {
        return 0L;
    }
    
    public final void setOrderId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPaymentMethod() {
        return null;
    }
    
    public final void setPaymentMethod(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final long getPaymentMethodId() {
        return 0L;
    }
    
    public final void setPaymentMethodId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPaymentSessionId() {
        return null;
    }
    
    public final void setPaymentSessionId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentOrderStatus() {
        return null;
    }
    
    public final void setCurrentOrderStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isReorder() {
        return false;
    }
    
    public final void setReorder(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClickedOnPage() {
        return null;
    }
    
    public final void setClickedOnPage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.models.BillDetailsModel getBillDetails() {
        return null;
    }
    
    public final void setBillDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.models.BillDetailsModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData getBillDetailsResponse() {
        return null;
    }
    
    public final void setBillDetailsResponse(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Double> getTotalPayableAmount() {
        return null;
    }
    
    public final void setTotalPayableAmount(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Double> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred getMxInternalErrorOccurred() {
        return null;
    }
    
    public final void setMxInternalErrorOccurred(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred p0) {
    }
    
    public final void initCashFreeSdk(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onPaymentVerify(@org.jetbrains.annotations.Nullable()
    java.lang.String orderID) {
    }
    
    @java.lang.Override()
    public void onPaymentFailure(@org.jetbrains.annotations.Nullable()
    com.cashfree.pg.core.api.utils.CFErrorResponse cfErrorResponse, @org.jetbrains.annotations.Nullable()
    java.lang.String orderID) {
    }
    
    private final java.lang.Object processPaymentDetails(com.google.gson.JsonObject jsonObject, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object updateUI(com.google.gson.JsonObject jsonObject, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final void loadPageOnPaymentCancelled() {
    }
    
    private final void loadOnPaymentError() {
    }
    
    private final void loadOnPaymentPending() {
    }
    
    private final void doDropCheckoutPayment(android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getCartBillDetails(long orderId) {
        return null;
    }
    
    public final void triggerPaymentFailedEvent() {
    }
    
    public final void triggerPaymentSuccessEvent() {
    }
}