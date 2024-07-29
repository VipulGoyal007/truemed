package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J&\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020g2\u0006\u0010L\u001a\u00020G2\u0006\u0010C\u001a\u0002062\u0006\u0010h\u001a\u00020GJ\u000e\u0010i\u001a\u00020e2\u0006\u0010j\u001a\u000206J\u0006\u0010k\u001a\u00020eJ\u000e\u0010l\u001a\u00020e2\u0006\u0010L\u001a\u000206J\u000e\u0010m\u001a\u00020e2\u0006\u0010n\u001a\u00020GR\u001f\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR!\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR!\u0010\u0011\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0#8F\u00a2\u0006\u0006\u001a\u0004\b&\u0010\'R&\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\r\"\u0004\b*\u0010+R\u001f\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0#8F\u00a2\u0006\u0006\u001a\u0004\b-\u0010\'R!\u0010.\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\n0#8F\u00a2\u0006\u0006\u001a\u0004\b/\u0010\'R!\u00100\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\n0#8F\u00a2\u0006\u0006\u001a\u0004\b1\u0010\'R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030$0#8F\u00a2\u0006\u0006\u001a\u0004\b4\u0010\'R\u001a\u00105\u001a\u000206X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010;\u001a\u000206X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u00108\"\u0004\b=\u0010:R \u0010>\u001a\b\u0012\u0004\u0012\u00020?0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\r\"\u0004\bA\u0010+R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00140#8F\u00a2\u0006\u0006\u001a\u0004\bB\u0010\'R \u0010C\u001a\b\u0012\u0004\u0012\u0002060\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\r\"\u0004\bE\u0010+R\u001a\u0010F\u001a\u00020GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001a\u0010L\u001a\u000206X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u00108\"\u0004\bN\u0010:R \u0010O\u001a\b\u0012\u0004\u0012\u0002060\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\r\"\u0004\bQ\u0010+R \u0010R\u001a\b\u0012\u0004\u0012\u00020\u00140\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\r\"\u0004\bT\u0010+R \u0010U\u001a\b\u0012\u0004\u0012\u00020\u00140\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\r\"\u0004\bW\u0010+R\u001d\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030$0\t\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010\rR \u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00140\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\r\"\u0004\b\\\u0010+R\u0017\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00140#8F\u00a2\u0006\u0006\u001a\u0004\b^\u0010\'R \u0010_\u001a\b\u0012\u0004\u0012\u00020\u00140\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u0010\r\"\u0004\ba\u0010+R\u0017\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00140#8F\u00a2\u0006\u0006\u001a\u0004\bc\u0010\'\u00a8\u0006o"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/CancelOrderViewModel;", "Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "cancelOrderUseCase", "Lcom/intellihealth/truemeds/domain/usecase/CancelOrderUseCase;", "context", "Landroid/content/Context;", "(Lcom/intellihealth/truemeds/domain/usecase/CancelOrderUseCase;Landroid/content/Context;)V", "_cancelOrderRadioList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/intellihealth/salt/models/RadioListModel;", "get_cancelOrderRadioList", "()Landroidx/lifecycle/MutableLiveData;", "_cancelOrderReasonList", "Lcom/intellihealth/truemeds/data/model/cancelorder/CancelReasonResponse$Reason;", "get_cancelOrderReasonList", "_cancelOrderSubReasonList", "get_cancelOrderSubReasonList", "_isLoading", "", "kotlin.jvm.PlatformType", "appOrderCancelledModel", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxAppOrderCancelled;", "getAppOrderCancelledModel", "()Lcom/intellihealth/truemeds/data/model/mixpanel/MxAppOrderCancelled;", "setAppOrderCancelledModel", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxAppOrderCancelled;)V", "billDetailsResponse", "Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse;", "getBillDetailsResponse", "()Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse;", "setBillDetailsResponse", "(Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse;)V", "cancelOrderEventLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/intellihealth/truemeds/presentation/viewmodel/events/Event;", "", "getCancelOrderEventLiveData", "()Landroidx/lifecycle/LiveData;", "cancelOrderEventMutableLiveData", "getCancelOrderEventMutableLiveData", "setCancelOrderEventMutableLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "cancelOrderRadioList", "getCancelOrderRadioList", "cancelOrderReasonList", "getCancelOrderReasonList", "cancelOrderSubReasonList", "getCancelOrderSubReasonList", "eventMessage", "Lcom/intellihealth/truemeds/data/utils/MESSAGES;", "getEventMessage", "firstPageCancelFinalReason", "", "getFirstPageCancelFinalReason", "()Ljava/lang/String;", "setFirstPageCancelFinalReason", "(Ljava/lang/String;)V", "firstPageCancelReason", "getFirstPageCancelReason", "setFirstPageCancelReason", "headerType", "Lcom/intellihealth/salt/models/MobileSectionHeadersModel;", "getHeaderType", "setHeaderType", "isLoading", "notes", "getNotes", "setNotes", "previousPos", "", "getPreviousPos", "()I", "setPreviousPos", "(I)V", "reasonId", "getReasonId", "setReasonId", "selectedReasonId", "getSelectedReasonId", "setSelectedReasonId", "showCancelOrderReasonListView", "getShowCancelOrderReasonListView", "setShowCancelOrderReasonListView", "showCancelOrderSubReasonListView", "getShowCancelOrderSubReasonListView", "setShowCancelOrderSubReasonListView", "showMessage", "getShowMessage", "showShimmer", "getShowShimmer", "setShowShimmer", "showShimmerForSubOrderLiveData", "getShowShimmerForSubOrderLiveData", "showShimmerForSubReason", "getShowShimmerForSubReason", "setShowShimmerForSubReason", "showShimmerLiveData", "getShowShimmerLiveData", "cancelOrder", "", "orderId", "", "currentOrderStatus", "eventAppOrderCancelled", "from", "getCancelOrderList", "getCancelOrderSubList", "radioClickPosition", "currentPos", "app_prodDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class CancelOrderViewModel extends com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel implements androidx.lifecycle.DefaultLifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.CancelOrderUseCase cancelOrderUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.mixpanel.MxAppOrderCancelled appOrderCancelledModel;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse.Reason>> _cancelOrderReasonList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse.Reason>> _cancelOrderSubReasonList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.salt.models.RadioListModel>> _cancelOrderRadioList = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showShimmer;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showShimmerForSubReason;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showCancelOrderReasonListView;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showCancelOrderSubReasonListView;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> cancelOrderEventMutableLiveData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MESSAGES>> showMessage = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String reasonId = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String firstPageCancelReason = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String firstPageCancelFinalReason = "";
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> selectedReasonId;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> notes;
    private int previousPos = -1;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse billDetailsResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> headerType;
    
    @javax.inject.Inject()
    public CancelOrderViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.CancelOrderUseCase cancelOrderUseCase, @dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.mixpanel.MxAppOrderCancelled getAppOrderCancelledModel() {
        return null;
    }
    
    public final void setAppOrderCancelledModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.mixpanel.MxAppOrderCancelled p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse.Reason>> get_cancelOrderReasonList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse.Reason>> getCancelOrderReasonList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse.Reason>> get_cancelOrderSubReasonList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.intellihealth.salt.models.RadioListModel>> getCancelOrderRadioList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.salt.models.RadioListModel>> get_cancelOrderRadioList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse.Reason>> getCancelOrderSubReasonList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowShimmer() {
        return null;
    }
    
    public final void setShowShimmer(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowShimmerLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowShimmerForSubReason() {
        return null;
    }
    
    public final void setShowShimmerForSubReason(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowShimmerForSubOrderLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowCancelOrderReasonListView() {
        return null;
    }
    
    public final void setShowCancelOrderReasonListView(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowCancelOrderSubReasonListView() {
        return null;
    }
    
    public final void setShowCancelOrderSubReasonListView(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getCancelOrderEventMutableLiveData() {
        return null;
    }
    
    public final void setCancelOrderEventMutableLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getCancelOrderEventLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MESSAGES>> getShowMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MESSAGES>> getEventMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReasonId() {
        return null;
    }
    
    public final void setReasonId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirstPageCancelReason() {
        return null;
    }
    
    public final void setFirstPageCancelReason(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirstPageCancelFinalReason() {
        return null;
    }
    
    public final void setFirstPageCancelFinalReason(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSelectedReasonId() {
        return null;
    }
    
    public final void setSelectedReasonId(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getNotes() {
        return null;
    }
    
    public final void setNotes(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final int getPreviousPos() {
        return 0;
    }
    
    public final void setPreviousPos(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse getBillDetailsResponse() {
        return null;
    }
    
    public final void setBillDetailsResponse(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> getHeaderType() {
        return null;
    }
    
    public final void setHeaderType(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> p0) {
    }
    
    public final void getCancelOrderList() {
    }
    
    public final void getCancelOrderSubList(@org.jetbrains.annotations.NotNull()
    java.lang.String reasonId) {
    }
    
    public final void cancelOrder(long orderId, int reasonId, @org.jetbrains.annotations.NotNull()
    java.lang.String notes, int currentOrderStatus) {
    }
    
    public final void radioClickPosition(int currentPos) {
    }
    
    public final void eventAppOrderCancelled(@org.jetbrains.annotations.NotNull()
    java.lang.String from) {
    }
}