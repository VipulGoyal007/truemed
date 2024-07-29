package com.intellihealth.truemeds.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00e2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002\u00a2\u0006\u0002\u0010\rJ \u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0002\u0010\u0014J \u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0002\u0010\u0014J\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\nH\u0002J\u0006\u0010\"\u001a\u00020\u0018J\u0012\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001b\u001a\u0004\u0018\u00010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020(0\'2\b\u0010\u001b\u001a\u0004\u0018\u00010%J\u0012\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,J\u001c\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010/\u001a\u0004\u0018\u00010\nH\u0002J\u001a\u00100\u001a\u00020 2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010/\u001a\u0004\u0018\u00010\nH\u0002J\u0018\u00101\u001a\u00020\u00182\b\u00102\u001a\u0004\u0018\u0001032\u0006\u0010\u001d\u001a\u00020\u001eJ(\u00104\u001a\u0004\u0018\u0001052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u00106\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u00107J\"\u00108\u001a\u0004\u0018\u0001092\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010%2\u0006\u0010:\u001a\u00020\u001eJ2\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020\n2\b\u0010A\u001a\u0004\u0018\u00010\n2\b\u0010B\u001a\u0004\u0018\u00010\nJ\u0012\u0010C\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\nH\u0002J\"\u0010D\u001a\u0004\u0018\u00010E2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010=\u001a\u00020>2\b\u0010F\u001a\u0004\u0018\u00010\nJ \u0010G\u001a\u00020H2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010%2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010I\u001a\u00020\u001e2\u0006\u0010J\u001a\u00020\nH\u0002J(\u0010K\u001a\u0004\u0018\u00010L2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010M\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u00107J4\u0010N\u001a\u0004\u0018\u00010O2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u00106\u001a\u00020\n2\b\u0010P\u001a\u0004\u0018\u00010\n2\b\u0010Q\u001a\u0004\u0018\u00010\nH\u0086@\u00a2\u0006\u0002\u0010RJ&\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020 2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u001eH\u0082@\u00a2\u0006\u0002\u0010YR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006Z"}, d2 = {"Lcom/intellihealth/truemeds/domain/usecase/OrderStatusUseCase;", "", "orderStatusRepository", "Lcom/intellihealth/truemeds/domain/repository/OrderStatusRepository;", "context", "Landroid/content/Context;", "sdkEventUseCase", "Lcom/intellihealth/truemeds/domain/usecase/analytics/SdkEventUseCase;", "(Lcom/intellihealth/truemeds/domain/repository/OrderStatusRepository;Landroid/content/Context;Lcom/intellihealth/truemeds/domain/usecase/analytics/SdkEventUseCase;)V", "convertDecimalFormat", "", "payableAmt", "", "(Ljava/lang/Double;)Ljava/lang/String;", "deleteAlternateNumberForOrder", "Lcom/intellihealth/truemeds/data/model/orderstatus/DeleteAlternateNumberResponse;", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "orderId", "", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateReturnUrlApiCall", "Lcom/intellihealth/truemeds/data/model/orderstatus/GenerateReturnUrlResponse;", "getAddressDetailsData", "Lcom/intellihealth/salt/models/OrderPersonalDetailsModel;", "patientDetail", "Lcom/intellihealth/truemeds/data/model/orderflow/PatientDetail;", "responseData", "Lcom/intellihealth/truemeds/data/model/ordersummary/AddressResponse$ResponseData;", "fromOrderStatus", "", "getBgColor", "", "orderStatusBgColor", "getCustomerEmailAddress", "getDeliveryAccordionData", "Lcom/intellihealth/salt/models/HistoryAccordionModel;", "Lcom/intellihealth/truemeds/data/model/orderstatus/OrderStatusResponse$ResponseData;", "getDetailedTimeLineData", "", "Lcom/intellihealth/salt/models/DetailedTimelineModel;", "getDoctorCallData", "Lcom/intellihealth/salt/models/DoctorCallCardModel;", "doctorDetails", "Lcom/intellihealth/truemeds/data/model/orderstatus/OrderStatusResponse$DoctorDetails;", "getDrawableResourceIdForSticky", "Landroid/graphics/drawable/Drawable;", "imageName", "getDrawableResourceIdForTimeLine", "getNumberDetails", "customerOrderDetailsResponseData", "Lcom/intellihealth/truemeds/data/model/orderflow/CustomerOrderDetailsResponseData;", "getOrderStatusAndDetailsData", "Lcom/intellihealth/truemeds/data/model/orderstatus/OrderStatusResponse;", "customerId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrderTrackerData", "Lcom/intellihealth/salt/models/OrderTrackerModel;", "fromActionBtnChange", "getPaymentBottomData", "Lcom/intellihealth/salt/models/PaymentContainerModel;", "bill", "Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse;", "paymentEnable", "paymentMode", "cashHandlingPayMsg", "cashHandlingRefundMsg", "getProgressBarColor", "getSavingCardData", "Lcom/intellihealth/salt/models/SavingCardsModel;", "pageTitle", "getStickyOrderStatusData", "Lcom/intellihealth/salt/models/StickyNonStickyNotificationModel;", "isReturnWindowClosed", "givenDateStr", "saveAlternateNumberForOrder", "Lcom/intellihealth/truemeds/data/model/orderstatus/AlternateNumberResponse;", "alternateNumber", "saveCustomerEmailAddress", "Lcom/intellihealth/truemeds/data/model/user/SaveEmailResponse;", "emailId", "transactionId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setErrorResponseBody", "Lcom/intellihealth/truemeds/data/utils/ResponseData;", "errorCode", "errorBody", "Lokhttp3/ResponseBody;", "isNetworkError", "(ILokhttp3/ResponseBody;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public final class OrderStatusUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.repository.OrderStatusRepository orderStatusRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase sdkEventUseCase = null;
    
    @javax.inject.Inject()
    public OrderStatusUseCase(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.repository.OrderStatusRepository orderStatusRepository, @dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase sdkEventUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getOrderStatusAndDetailsData(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.orderstatus.OrderStatusResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.salt.models.OrderTrackerModel getOrderTrackerData(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderstatus.OrderStatusResponse.ResponseData responseData, boolean fromActionBtnChange) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.salt.models.DetailedTimelineModel> getDetailedTimeLineData(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderstatus.OrderStatusResponse.ResponseData responseData) {
        return null;
    }
    
    private final int getDrawableResourceIdForTimeLine(android.content.Context context, java.lang.String imageName) {
        return 0;
    }
    
    private final int getBgColor(java.lang.String orderStatusBgColor) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.salt.models.DoctorCallCardModel getDoctorCallData(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderstatus.OrderStatusResponse.DoctorDetails doctorDetails) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.models.StickyNonStickyNotificationModel getStickyOrderStatusData(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderstatus.OrderStatusResponse.ResponseData responseData, boolean fromOrderStatus) {
        return null;
    }
    
    private final android.graphics.drawable.Drawable getDrawableResourceIdForSticky(android.content.Context context, java.lang.String imageName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.models.OrderPersonalDetailsModel getAddressDetailsData(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.orderflow.PatientDetail patientDetail, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.ordersummary.AddressResponse.ResponseData responseData, boolean fromOrderStatus) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.models.OrderPersonalDetailsModel getNumberDetails(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderflow.CustomerOrderDetailsResponseData customerOrderDetailsResponseData, boolean fromOrderStatus) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.models.OrderPersonalDetailsModel getCustomerEmailAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.models.PaymentContainerModel getPaymentBottomData(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse bill, boolean paymentEnable, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentMode, @org.jetbrains.annotations.Nullable()
    java.lang.String cashHandlingPayMsg, @org.jetbrains.annotations.Nullable()
    java.lang.String cashHandlingRefundMsg) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.salt.models.SavingCardsModel getSavingCardData(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse bill, @org.jetbrains.annotations.Nullable()
    java.lang.String pageTitle) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.salt.models.HistoryAccordionModel getDeliveryAccordionData(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderstatus.OrderStatusResponse.ResponseData responseData) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveAlternateNumberForOrder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String alternateNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.orderstatus.AlternateNumberResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveCustomerEmailAddress(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.Nullable()
    java.lang.String emailId, @org.jetbrains.annotations.Nullable()
    java.lang.String transactionId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.user.SaveEmailResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object generateReturnUrlApiCall(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.orderstatus.GenerateReturnUrlResponse> $completion) {
        return null;
    }
    
    private final java.lang.Object setErrorResponseBody(int errorCode, okhttp3.ResponseBody errorBody, boolean isNetworkError, kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.ResponseData> $completion) {
        return null;
    }
    
    private final int getProgressBarColor(java.lang.String orderStatusBgColor) {
        return 0;
    }
    
    private final java.lang.String convertDecimalFormat(java.lang.Double payableAmt) {
        return null;
    }
    
    private final boolean isReturnWindowClosed(java.lang.String givenDateStr) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteAlternateNumberForOrder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.orderstatus.DeleteAlternateNumberResponse> $completion) {
        return null;
    }
}