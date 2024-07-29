package com.intellihealth.truemeds.data.model.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\bO\b\u0086\b\u0018\u00002\u00020\u0001:\u0006pqrstuB\u008f\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0001\u0012\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010\u000f\u0012\b\u0010$\u001a\u0004\u0018\u00010%\u0012\b\u0010&\u001a\u0004\u0018\u00010\'\u00a2\u0006\u0002\u0010(J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0013\u0010R\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fH\u00c6\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0010\u0010T\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0010\u0010U\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u00109J\u0010\u0010V\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u00109J\u000b\u0010W\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u0010\u0010X\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0010\u0010Z\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\u000b\u0010[\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u001fH\u00c6\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0013\u0010`\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010\u000fH\u00c6\u0003J\u0010\u0010a\u001a\u0004\u0018\u00010%H\u00c6\u0003\u00a2\u0006\u0002\u0010KJ\u000b\u0010b\u001a\u0004\u0018\u00010\'H\u00c6\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u00ca\u0002\u0010j\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0012\b\u0002\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00012\u0012\b\u0002\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010\u000f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\'H\u00c6\u0001\u00a2\u0006\u0002\u0010kJ\u0013\u0010l\u001a\u00020\u00112\b\u0010m\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010n\u001a\u00020\u0019H\u00d6\u0001J\t\u0010o\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u001b\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\n\n\u0002\u00106\u001a\u0004\b\u0010\u00105R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\n\n\u0002\u00106\u001a\u0004\b\u0012\u00105R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00100R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\n\n\u0002\u0010:\u001a\u0004\b8\u00109R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\n\n\u0002\u0010:\u001a\u0004\b;\u00109R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\n\n\u0002\u0010@\u001a\u0004\b>\u0010?R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\n\n\u0002\u00106\u001a\u0004\bA\u00105R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\n\n\u0002\u0010@\u001a\u0004\bB\u0010?R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010 \u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u00100R\u0013\u0010!\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010,R\u001b\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u00104R\u0015\u0010$\u001a\u0004\u0018\u00010%\u00a2\u0006\n\n\u0002\u0010L\u001a\u0004\bJ\u0010KR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u00100R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u00100R\u0013\u0010&\u001a\u0004\u0018\u00010\'\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010P\u00a8\u0006v"}, d2 = {"Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse;", "", "message", "", "statusValue", "statusCode", "addressDetails", "Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$AddressDetails;", "alternateNumber", "cancelledReason", "checkerDesk", "deliveryDate", "finalCalcAmt", "Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$FinalCalcAmt;", "imageMasterDto", "", "isChronicAdded", "", "isOtcAdded", "orderDate", "", "orderId", "orderStatus", "Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$OrderStatus;", "orgSubsId", "", "otcOrder", "patientId", "paymentMode", "Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$PaymentMode;", "paymentSelectionInfo", "Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$PaymentSelectionInfo;", "paymentStatus", "paymentTypeRestriction", "productSubsMappingList", "Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$ProductSubsMapping;", "savings", "", "workflowStatusId", "Lcom/intellihealth/truemeds/data/model/productlistanddetails/WorkflowStatusId;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$AddressDetails;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$FinalCalcAmt;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$OrderStatus;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$PaymentMode;Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$PaymentSelectionInfo;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Ljava/lang/Double;Lcom/intellihealth/truemeds/data/model/productlistanddetails/WorkflowStatusId;)V", "getAddressDetails", "()Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$AddressDetails;", "getAlternateNumber", "()Ljava/lang/Object;", "getCancelledReason", "getCheckerDesk", "getDeliveryDate", "()Ljava/lang/String;", "getFinalCalcAmt", "()Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$FinalCalcAmt;", "getImageMasterDto", "()Ljava/util/List;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMessage", "getOrderDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOrderId", "getOrderStatus", "()Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$OrderStatus;", "getOrgSubsId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOtcOrder", "getPatientId", "getPaymentMode", "()Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$PaymentMode;", "getPaymentSelectionInfo", "()Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$PaymentSelectionInfo;", "getPaymentStatus", "getPaymentTypeRestriction", "getProductSubsMappingList", "getSavings", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getStatusCode", "getStatusValue", "getWorkflowStatusId", "()Lcom/intellihealth/truemeds/data/model/productlistanddetails/WorkflowStatusId;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$AddressDetails;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$FinalCalcAmt;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$OrderStatus;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$PaymentMode;Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$PaymentSelectionInfo;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Ljava/lang/Double;Lcom/intellihealth/truemeds/data/model/productlistanddetails/WorkflowStatusId;)Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse;", "equals", "other", "hashCode", "toString", "AddressDetails", "FinalCalcAmt", "OrderStatus", "PaymentMode", "PaymentSelectionInfo", "ProductSubsMapping", "app_stageAndroidDebug"})
public final class OrderDetailsResponse {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String message = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String statusValue = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String statusCode = null;
    @org.jetbrains.annotations.Nullable()
    private final com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.AddressDetails addressDetails = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object alternateNumber = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object cancelledReason = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object checkerDesk = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String deliveryDate = null;
    @org.jetbrains.annotations.Nullable()
    private final com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.FinalCalcAmt finalCalcAmt = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.Object> imageMasterDto = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean isChronicAdded = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean isOtcAdded = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long orderDate = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long orderId = null;
    @org.jetbrains.annotations.Nullable()
    private final com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.OrderStatus orderStatus = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer orgSubsId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean otcOrder = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer patientId = null;
    @org.jetbrains.annotations.Nullable()
    private final com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.PaymentMode paymentMode = null;
    @org.jetbrains.annotations.Nullable()
    private final com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.PaymentSelectionInfo paymentSelectionInfo = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String paymentStatus = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object paymentTypeRestriction = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.ProductSubsMapping> productSubsMappingList = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double savings = null;
    @org.jetbrains.annotations.Nullable()
    private final com.intellihealth.truemeds.data.model.productlistanddetails.WorkflowStatusId workflowStatusId = null;
    
    public OrderDetailsResponse(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String statusValue, @org.jetbrains.annotations.Nullable()
    java.lang.String statusCode, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.AddressDetails addressDetails, @org.jetbrains.annotations.Nullable()
    java.lang.Object alternateNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Object cancelledReason, @org.jetbrains.annotations.Nullable()
    java.lang.Object checkerDesk, @org.jetbrains.annotations.Nullable()
    java.lang.String deliveryDate, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.FinalCalcAmt finalCalcAmt, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> imageMasterDto, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isChronicAdded, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isOtcAdded, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderDate, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.OrderStatus orderStatus, @org.jetbrains.annotations.Nullable()
    java.lang.Integer orgSubsId, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean otcOrder, @org.jetbrains.annotations.Nullable()
    java.lang.Integer patientId, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.PaymentMode paymentMode, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.PaymentSelectionInfo paymentSelectionInfo, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentStatus, @org.jetbrains.annotations.Nullable()
    java.lang.Object paymentTypeRestriction, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.ProductSubsMapping> productSubsMappingList, @org.jetbrains.annotations.Nullable()
    java.lang.Double savings, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.productlistanddetails.WorkflowStatusId workflowStatusId) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatusValue() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatusCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.AddressDetails getAddressDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAlternateNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCancelledReason() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCheckerDesk() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeliveryDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.FinalCalcAmt getFinalCalcAmt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> getImageMasterDto() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isChronicAdded() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isOtcAdded() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getOrderDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getOrderId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.OrderStatus getOrderStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getOrgSubsId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getOtcOrder() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPatientId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.PaymentMode getPaymentMode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.PaymentSelectionInfo getPaymentSelectionInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPaymentStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPaymentTypeRestriction() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.ProductSubsMapping> getProductSubsMappingList() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSavings() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.productlistanddetails.WorkflowStatusId getWorkflowStatusId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.OrderStatus component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.PaymentMode component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.PaymentSelectionInfo component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.ProductSubsMapping> component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.productlistanddetails.WorkflowStatusId component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.AddressDetails component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.FinalCalcAmt component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.home.OrderDetailsResponse copy(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String statusValue, @org.jetbrains.annotations.Nullable()
    java.lang.String statusCode, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.AddressDetails addressDetails, @org.jetbrains.annotations.Nullable()
    java.lang.Object alternateNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Object cancelledReason, @org.jetbrains.annotations.Nullable()
    java.lang.Object checkerDesk, @org.jetbrains.annotations.Nullable()
    java.lang.String deliveryDate, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.FinalCalcAmt finalCalcAmt, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> imageMasterDto, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isChronicAdded, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isOtcAdded, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderDate, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.OrderStatus orderStatus, @org.jetbrains.annotations.Nullable()
    java.lang.Integer orgSubsId, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean otcOrder, @org.jetbrains.annotations.Nullable()
    java.lang.Integer patientId, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.PaymentMode paymentMode, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.PaymentSelectionInfo paymentSelectionInfo, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentStatus, @org.jetbrains.annotations.Nullable()
    java.lang.Object paymentTypeRestriction, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.ProductSubsMapping> productSubsMappingList, @org.jetbrains.annotations.Nullable()
    java.lang.Double savings, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.productlistanddetails.WorkflowStatusId workflowStatusId) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b:\b\u0086\b\u0018\u00002\u00020\u0001B\u00a5\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u000b\u0010,\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0010\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0010\u00101\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u000b\u00102\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u000b\u00104\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u000b\u00109\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u00ce\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020\u00032\b\u0010>\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010?\u001a\u00020\u0005H\u00d6\u0001J\t\u0010@\u001a\u00020\u0007H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b!\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b#\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\'\u0010\u001aR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b(\u0010\u0017R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b)\u0010\u001aR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001d\u00a8\u0006A"}, d2 = {"Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$AddressDetails;", "", "active", "", "addressId", "", "addressType", "", "addressline1", "addressline2", "addressline3", "cityId", "cityName", "countryId", "countryName", "landmark", "pincode", "pincodeId", "selected", "stateId", "stateName", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;)V", "getActive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAddressId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAddressType", "()Ljava/lang/String;", "getAddressline1", "getAddressline2", "getAddressline3", "getCityId", "getCityName", "getCountryId", "getCountryName", "getLandmark", "getPincode", "getPincodeId", "getSelected", "getStateId", "getStateName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;)Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$AddressDetails;", "equals", "other", "hashCode", "toString", "app_stageAndroidDebug"})
    public static final class AddressDetails {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean active = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer addressId = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String addressType = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String addressline1 = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String addressline2 = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String addressline3 = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer cityId = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String cityName = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer countryId = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String countryName = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String landmark = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String pincode = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer pincodeId = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean selected = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer stateId = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String stateName = null;
        
        public AddressDetails(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean active, @org.jetbrains.annotations.Nullable()
        java.lang.Integer addressId, @org.jetbrains.annotations.Nullable()
        java.lang.String addressType, @org.jetbrains.annotations.Nullable()
        java.lang.String addressline1, @org.jetbrains.annotations.Nullable()
        java.lang.String addressline2, @org.jetbrains.annotations.Nullable()
        java.lang.String addressline3, @org.jetbrains.annotations.Nullable()
        java.lang.Integer cityId, @org.jetbrains.annotations.Nullable()
        java.lang.String cityName, @org.jetbrains.annotations.Nullable()
        java.lang.Integer countryId, @org.jetbrains.annotations.Nullable()
        java.lang.String countryName, @org.jetbrains.annotations.Nullable()
        java.lang.String landmark, @org.jetbrains.annotations.Nullable()
        java.lang.String pincode, @org.jetbrains.annotations.Nullable()
        java.lang.Integer pincodeId, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean selected, @org.jetbrains.annotations.Nullable()
        java.lang.Integer stateId, @org.jetbrains.annotations.Nullable()
        java.lang.String stateName) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getActive() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getAddressId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAddressType() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAddressline1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAddressline2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAddressline3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCityId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCityName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCountryId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCountryName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLandmark() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPincode() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getPincodeId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getSelected() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getStateId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getStateName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component12() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component13() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component14() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component15() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component16() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.AddressDetails copy(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean active, @org.jetbrains.annotations.Nullable()
        java.lang.Integer addressId, @org.jetbrains.annotations.Nullable()
        java.lang.String addressType, @org.jetbrains.annotations.Nullable()
        java.lang.String addressline1, @org.jetbrains.annotations.Nullable()
        java.lang.String addressline2, @org.jetbrains.annotations.Nullable()
        java.lang.String addressline3, @org.jetbrains.annotations.Nullable()
        java.lang.Integer cityId, @org.jetbrains.annotations.Nullable()
        java.lang.String cityName, @org.jetbrains.annotations.Nullable()
        java.lang.Integer countryId, @org.jetbrains.annotations.Nullable()
        java.lang.String countryName, @org.jetbrains.annotations.Nullable()
        java.lang.String landmark, @org.jetbrains.annotations.Nullable()
        java.lang.String pincode, @org.jetbrains.annotations.Nullable()
        java.lang.Integer pincodeId, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean selected, @org.jetbrains.annotations.Nullable()
        java.lang.Integer stateId, @org.jetbrains.annotations.Nullable()
        java.lang.String stateName) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00a1\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010\'\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010)\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010-\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u0010\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u00aa\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001\u00a2\u0006\u0002\u00103J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00107\u001a\u000208H\u00d6\u0001J\t\u00109\u001a\u00020\u000fH\u00d6\u0001R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0018\u0010\u0014R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0019\u0010\u0014R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001b\u0010\u0014R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001f\u0010\u0014R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b \u0010\u0014R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b!\u0010\u0014R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u001a\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b#\u0010\u0014R\u001a\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b$\u0010\u0014\u00a8\u0006:"}, d2 = {"Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$FinalCalcAmt;", "", "couponDiscountPrice", "", "deliveryCharge", "discount", "payableAmt", "orderId", "", "mrp", "packagingCharge", "savingValue", "tmCash", "tmCredit", "couponCode", "", "addMoreForFreeDelivery", "savingsText", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V", "getAddMoreForFreeDelivery", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCouponCode", "()Ljava/lang/String;", "getCouponDiscountPrice", "getDeliveryCharge", "getDiscount", "getMrp", "getOrderId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPackagingCharge", "getPayableAmt", "getSavingValue", "getSavingsText", "getTmCash", "getTmCredit", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$FinalCalcAmt;", "equals", "", "other", "hashCode", "", "toString", "app_stageAndroidDebug"})
    public static final class FinalCalcAmt {
        @com.google.gson.annotations.SerializedName(value = "couponDiscountAmt")
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Double couponDiscountPrice = null;
        @com.google.gson.annotations.SerializedName(value = "deliveryCharge")
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Double deliveryCharge = null;
        @com.google.gson.annotations.SerializedName(value = "discount")
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Double discount = null;
        @com.google.gson.annotations.SerializedName(value = "payableAmt")
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Double payableAmt = null;
        @com.google.gson.annotations.SerializedName(value = "orderId")
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long orderId = null;
        @com.google.gson.annotations.SerializedName(value = "mrp")
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Double mrp = null;
        @com.google.gson.annotations.SerializedName(value = "packagingCharge")
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Double packagingCharge = null;
        @com.google.gson.annotations.SerializedName(value = "savingValue")
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Double savingValue = null;
        @com.google.gson.annotations.SerializedName(value = "tmCash")
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Double tmCash = null;
        @com.google.gson.annotations.SerializedName(value = "tmCredit")
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Double tmCredit = null;
        @com.google.gson.annotations.SerializedName(value = "couponCode")
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String couponCode = null;
        @com.google.gson.annotations.SerializedName(value = "addMoreForFreeDelivery")
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Double addMoreForFreeDelivery = null;
        @com.google.gson.annotations.SerializedName(value = "savingsText")
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String savingsText = null;
        
        public FinalCalcAmt(@org.jetbrains.annotations.Nullable()
        java.lang.Double couponDiscountPrice, @org.jetbrains.annotations.Nullable()
        java.lang.Double deliveryCharge, @org.jetbrains.annotations.Nullable()
        java.lang.Double discount, @org.jetbrains.annotations.Nullable()
        java.lang.Double payableAmt, @org.jetbrains.annotations.Nullable()
        java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
        java.lang.Double mrp, @org.jetbrains.annotations.Nullable()
        java.lang.Double packagingCharge, @org.jetbrains.annotations.Nullable()
        java.lang.Double savingValue, @org.jetbrains.annotations.Nullable()
        java.lang.Double tmCash, @org.jetbrains.annotations.Nullable()
        java.lang.Double tmCredit, @org.jetbrains.annotations.Nullable()
        java.lang.String couponCode, @org.jetbrains.annotations.Nullable()
        java.lang.Double addMoreForFreeDelivery, @org.jetbrains.annotations.Nullable()
        java.lang.String savingsText) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getCouponDiscountPrice() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getDeliveryCharge() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getDiscount() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getPayableAmt() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getOrderId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getMrp() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getPackagingCharge() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getSavingValue() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getTmCash() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getTmCredit() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCouponCode() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getAddMoreForFreeDelivery() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSavingsText() {
            return null;
        }
        
        public FinalCalcAmt() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component12() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component13() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.FinalCalcAmt copy(@org.jetbrains.annotations.Nullable()
        java.lang.Double couponDiscountPrice, @org.jetbrains.annotations.Nullable()
        java.lang.Double deliveryCharge, @org.jetbrains.annotations.Nullable()
        java.lang.Double discount, @org.jetbrains.annotations.Nullable()
        java.lang.Double payableAmt, @org.jetbrains.annotations.Nullable()
        java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
        java.lang.Double mrp, @org.jetbrains.annotations.Nullable()
        java.lang.Double packagingCharge, @org.jetbrains.annotations.Nullable()
        java.lang.Double savingValue, @org.jetbrains.annotations.Nullable()
        java.lang.Double tmCash, @org.jetbrains.annotations.Nullable()
        java.lang.Double tmCredit, @org.jetbrains.annotations.Nullable()
        java.lang.String couponCode, @org.jetbrains.annotations.Nullable()
        java.lang.Double addMoreForFreeDelivery, @org.jetbrains.annotations.Nullable()
        java.lang.String savingsText) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u000b\u0010&\u001a\u0004\u0018\u00010\nH\u00c6\u0003Jz\u0010\'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\u00032\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020\fH\u00d6\u0001J\t\u0010,\u001a\u00020\nH\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019\u00a8\u0006-"}, d2 = {"Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$OrderStatus;", "", "active", "", "createdBy", "createdOn", "description", "lastModifiedBy", "lastModifiedOn", "name", "", "serialId", "", "value", "(Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getActive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCreatedBy", "()Ljava/lang/Object;", "getCreatedOn", "getDescription", "getLastModifiedBy", "getLastModifiedOn", "getName", "()Ljava/lang/String;", "getSerialId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$OrderStatus;", "equals", "other", "hashCode", "toString", "app_stageAndroidDebug"})
    public static final class OrderStatus {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean active = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object createdBy = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object createdOn = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object description = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object lastModifiedBy = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object lastModifiedOn = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String name = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer serialId = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String value = null;
        
        public OrderStatus(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean active, @org.jetbrains.annotations.Nullable()
        java.lang.Object createdBy, @org.jetbrains.annotations.Nullable()
        java.lang.Object createdOn, @org.jetbrains.annotations.Nullable()
        java.lang.Object description, @org.jetbrains.annotations.Nullable()
        java.lang.Object lastModifiedBy, @org.jetbrains.annotations.Nullable()
        java.lang.Object lastModifiedOn, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.Integer serialId, @org.jetbrains.annotations.Nullable()
        java.lang.String value) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getActive() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getCreatedBy() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getCreatedOn() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getLastModifiedBy() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getLastModifiedOn() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getSerialId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getValue() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.OrderStatus copy(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean active, @org.jetbrains.annotations.Nullable()
        java.lang.Object createdBy, @org.jetbrains.annotations.Nullable()
        java.lang.Object createdOn, @org.jetbrains.annotations.Nullable()
        java.lang.Object description, @org.jetbrains.annotations.Nullable()
        java.lang.Object lastModifiedBy, @org.jetbrains.annotations.Nullable()
        java.lang.Object lastModifiedOn, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.Integer serialId, @org.jetbrains.annotations.Nullable()
        java.lang.String value) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u000b\u0010&\u001a\u0004\u0018\u00010\nH\u00c6\u0003Jz\u0010\'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\u00032\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020\fH\u00d6\u0001J\t\u0010,\u001a\u00020\nH\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019\u00a8\u0006-"}, d2 = {"Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$PaymentMode;", "", "active", "", "createdBy", "createdOn", "description", "lastModifiedBy", "lastModifiedOn", "name", "", "serialId", "", "value", "(Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getActive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCreatedBy", "()Ljava/lang/Object;", "getCreatedOn", "getDescription", "getLastModifiedBy", "getLastModifiedOn", "getName", "()Ljava/lang/String;", "getSerialId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$PaymentMode;", "equals", "other", "hashCode", "toString", "app_stageAndroidDebug"})
    public static final class PaymentMode {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean active = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object createdBy = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object createdOn = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object description = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object lastModifiedBy = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object lastModifiedOn = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String name = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer serialId = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String value = null;
        
        public PaymentMode(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean active, @org.jetbrains.annotations.Nullable()
        java.lang.Object createdBy, @org.jetbrains.annotations.Nullable()
        java.lang.Object createdOn, @org.jetbrains.annotations.Nullable()
        java.lang.Object description, @org.jetbrains.annotations.Nullable()
        java.lang.Object lastModifiedBy, @org.jetbrains.annotations.Nullable()
        java.lang.Object lastModifiedOn, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.Integer serialId, @org.jetbrains.annotations.Nullable()
        java.lang.String value) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getActive() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getCreatedBy() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getCreatedOn() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getLastModifiedBy() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getLastModifiedOn() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getSerialId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getValue() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.PaymentMode copy(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean active, @org.jetbrains.annotations.Nullable()
        java.lang.Object createdBy, @org.jetbrains.annotations.Nullable()
        java.lang.Object createdOn, @org.jetbrains.annotations.Nullable()
        java.lang.Object description, @org.jetbrains.annotations.Nullable()
        java.lang.Object lastModifiedBy, @org.jetbrains.annotations.Nullable()
        java.lang.Object lastModifiedOn, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.Integer serialId, @org.jetbrains.annotations.Nullable()
        java.lang.String value) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017Jn\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006("}, d2 = {"Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$PaymentSelectionInfo;", "", "lastPaymentMethod", "", "lastPaymentMethodIconUrl", "lastPaymentMethodId", "paymentMethod", "paymentMethodIconUrl", "paymentMethodId", "paymentNote", "paymentSpecificCouponApplied", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Boolean;)V", "getLastPaymentMethod", "()Ljava/lang/String;", "getLastPaymentMethodIconUrl", "getLastPaymentMethodId", "()Ljava/lang/Object;", "getPaymentMethod", "getPaymentMethodIconUrl", "getPaymentMethodId", "getPaymentNote", "getPaymentSpecificCouponApplied", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$PaymentSelectionInfo;", "equals", "other", "hashCode", "", "toString", "app_stageAndroidDebug"})
    public static final class PaymentSelectionInfo {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String lastPaymentMethod = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String lastPaymentMethodIconUrl = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object lastPaymentMethodId = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object paymentMethod = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object paymentMethodIconUrl = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object paymentMethodId = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String paymentNote = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean paymentSpecificCouponApplied = null;
        
        public PaymentSelectionInfo(@org.jetbrains.annotations.Nullable()
        java.lang.String lastPaymentMethod, @org.jetbrains.annotations.Nullable()
        java.lang.String lastPaymentMethodIconUrl, @org.jetbrains.annotations.Nullable()
        java.lang.Object lastPaymentMethodId, @org.jetbrains.annotations.Nullable()
        java.lang.Object paymentMethod, @org.jetbrains.annotations.Nullable()
        java.lang.Object paymentMethodIconUrl, @org.jetbrains.annotations.Nullable()
        java.lang.Object paymentMethodId, @org.jetbrains.annotations.Nullable()
        java.lang.String paymentNote, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean paymentSpecificCouponApplied) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLastPaymentMethod() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLastPaymentMethodIconUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getLastPaymentMethodId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getPaymentMethod() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getPaymentMethodIconUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getPaymentMethodId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPaymentNote() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getPaymentSpecificCouponApplied() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.PaymentSelectionInfo copy(@org.jetbrains.annotations.Nullable()
        java.lang.String lastPaymentMethod, @org.jetbrains.annotations.Nullable()
        java.lang.String lastPaymentMethodIconUrl, @org.jetbrains.annotations.Nullable()
        java.lang.Object lastPaymentMethodId, @org.jetbrains.annotations.Nullable()
        java.lang.Object paymentMethod, @org.jetbrains.annotations.Nullable()
        java.lang.Object paymentMethodIconUrl, @org.jetbrains.annotations.Nullable()
        java.lang.Object paymentMethodId, @org.jetbrains.annotations.Nullable()
        java.lang.String paymentNote, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean paymentSpecificCouponApplied) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0003\b\u0081\u0001\b\u0086\b\u0018\u00002\u00020\u0001B\u00a9\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\n\u0012\b\u0010 \u001a\u0004\u0018\u00010\n\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010$\u001a\u0004\u0018\u00010\n\u0012\b\u0010%\u001a\u0004\u0018\u00010\n\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\'\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010+\u001a\u0004\u0018\u00010\n\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u00100J\u0010\u0010c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0010\u0010d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0010\u0010e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u000b\u0010f\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0010\u0010g\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010CJ\u000b\u0010h\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0010\u0010i\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010:J\u0010\u0010j\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010:J\u000b\u0010k\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0010\u0010l\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010CJ\u000b\u0010m\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0010\u0010n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u000b\u0010o\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0010\u0010p\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010:J\u0010\u0010q\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u000b\u0010r\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0010\u0010u\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010:J\u0010\u0010v\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010:J\u0010\u0010w\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u000b\u0010x\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0010\u0010y\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u000b\u0010z\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0010\u0010{\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010:J\u0010\u0010|\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010:J\u000b\u0010}\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0010\u0010\u007f\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010CJ\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0011\u0010\u0082\u0001\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010:J\u0011\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010CJ\u0011\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00102J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0011\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0011\u0010\u008a\u0001\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010:J\u0011\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0011\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0088\u0004\u0010\u008d\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001\u00a2\u0006\u0003\u0010\u008e\u0001J\u0015\u0010\u008f\u0001\u001a\u00020\u00032\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u0091\u0001\u001a\u00020\nH\u00d6\u0001J\n\u0010\u0092\u0001\u001a\u00020\u0010H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b4\u00102R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b5\u00102R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b6\u00102R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b7\u00102R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b8\u00102R\u0015\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010;\u001a\u0004\b9\u0010:R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b<\u00102R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b=\u00102R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b>\u00102R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b?\u00102R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\n\n\u0002\u0010D\u001a\u0004\bB\u0010CR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010AR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010;\u001a\u0004\bF\u0010:R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010;\u001a\u0004\bG\u0010:R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010AR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\n\n\u0002\u0010D\u001a\u0004\bI\u0010CR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010AR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010AR\u0015\u0010\u001a\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010;\u001a\u0004\bL\u0010:R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\bM\u00102R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010AR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010AR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010AR\u0015\u0010\u001f\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010;\u001a\u0004\bQ\u0010:R\u0015\u0010 \u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010;\u001a\u0004\bR\u0010:R\u0015\u0010!\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\bS\u00102R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010AR\u0013\u0010#\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010AR\u0015\u0010$\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010;\u001a\u0004\bV\u0010:R\u0015\u0010%\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010;\u001a\u0004\bW\u0010:R\u0013\u0010&\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0013\u0010\'\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010AR\u0015\u0010(\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\n\n\u0002\u0010D\u001a\u0004\b[\u0010CR\u0013\u0010)\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010AR\u0013\u0010*\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010AR\u0015\u0010+\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010;\u001a\u0004\b^\u0010:R\u0015\u0010,\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\n\n\u0002\u0010D\u001a\u0004\b_\u0010CR\u0013\u0010-\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u0010AR\u0013\u0010.\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010AR\u0013\u0010/\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u0010A\u00a8\u0006\u0093\u0001"}, d2 = {"Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$ProductSubsMapping;", "", "coldChainDisabled", "", "crossSellingProduct", "cxAcceptedSubs", "cxKeepOriginal", "cxOrgAdded", "disabled", "finalSubsId", "", "medActive", "medReOrder", "orgAvailable", "orgColdStorage", "orgCompanyName", "", "orgDiscount", "", "orgGenericBranded", "orgMaxCappedQty", "orgMaxCappedWeight", "orgMedName", "orgMrp", "orgPackSize", "orgProductCd", "orgQuantity", "orgRxRequired", "orgStrength", "orgSubGroup", "orgUnit", "productDetailsId", "statusId", "subsColdStorage", "subsCompanyName", "subsGenericBranded", "subsMaxCappedQty", "subsMaxCappedWeight", "subsMedList", "subsMedName", "subsMrp", "subsPackSize", "subsProductCd", "subsQuantity", "subsSellingPrice", "subsStrength", "subsSubGroup", "subsUnit", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getColdChainDisabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCrossSellingProduct", "getCxAcceptedSubs", "getCxKeepOriginal", "getCxOrgAdded", "getDisabled", "getFinalSubsId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMedActive", "getMedReOrder", "getOrgAvailable", "getOrgColdStorage", "getOrgCompanyName", "()Ljava/lang/String;", "getOrgDiscount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getOrgGenericBranded", "getOrgMaxCappedQty", "getOrgMaxCappedWeight", "getOrgMedName", "getOrgMrp", "getOrgPackSize", "getOrgProductCd", "getOrgQuantity", "getOrgRxRequired", "getOrgStrength", "getOrgSubGroup", "getOrgUnit", "getProductDetailsId", "getStatusId", "getSubsColdStorage", "getSubsCompanyName", "getSubsGenericBranded", "getSubsMaxCappedQty", "getSubsMaxCappedWeight", "getSubsMedList", "()Ljava/lang/Object;", "getSubsMedName", "getSubsMrp", "getSubsPackSize", "getSubsProductCd", "getSubsQuantity", "getSubsSellingPrice", "getSubsStrength", "getSubsSubGroup", "getSubsUnit", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$ProductSubsMapping;", "equals", "other", "hashCode", "toString", "app_stageAndroidDebug"})
    public static final class ProductSubsMapping {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean coldChainDisabled = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean crossSellingProduct = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean cxAcceptedSubs = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean cxKeepOriginal = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean cxOrgAdded = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean disabled = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer finalSubsId = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean medActive = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean medReOrder = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean orgAvailable = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean orgColdStorage = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String orgCompanyName = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Double orgDiscount = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String orgGenericBranded = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer orgMaxCappedQty = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer orgMaxCappedWeight = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String orgMedName = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Double orgMrp = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String orgPackSize = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String orgProductCd = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer orgQuantity = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean orgRxRequired = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String orgStrength = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String orgSubGroup = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String orgUnit = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer productDetailsId = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer statusId = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean subsColdStorage = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String subsCompanyName = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String subsGenericBranded = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer subsMaxCappedQty = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer subsMaxCappedWeight = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object subsMedList = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String subsMedName = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Double subsMrp = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String subsPackSize = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String subsProductCd = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer subsQuantity = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Double subsSellingPrice = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String subsStrength = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String subsSubGroup = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String subsUnit = null;
        
        public ProductSubsMapping(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean coldChainDisabled, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean crossSellingProduct, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean cxAcceptedSubs, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean cxKeepOriginal, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean cxOrgAdded, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean disabled, @org.jetbrains.annotations.Nullable()
        java.lang.Integer finalSubsId, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean medActive, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean medReOrder, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean orgAvailable, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean orgColdStorage, @org.jetbrains.annotations.Nullable()
        java.lang.String orgCompanyName, @org.jetbrains.annotations.Nullable()
        java.lang.Double orgDiscount, @org.jetbrains.annotations.Nullable()
        java.lang.String orgGenericBranded, @org.jetbrains.annotations.Nullable()
        java.lang.Integer orgMaxCappedQty, @org.jetbrains.annotations.Nullable()
        java.lang.Integer orgMaxCappedWeight, @org.jetbrains.annotations.Nullable()
        java.lang.String orgMedName, @org.jetbrains.annotations.Nullable()
        java.lang.Double orgMrp, @org.jetbrains.annotations.Nullable()
        java.lang.String orgPackSize, @org.jetbrains.annotations.Nullable()
        java.lang.String orgProductCd, @org.jetbrains.annotations.Nullable()
        java.lang.Integer orgQuantity, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean orgRxRequired, @org.jetbrains.annotations.Nullable()
        java.lang.String orgStrength, @org.jetbrains.annotations.Nullable()
        java.lang.String orgSubGroup, @org.jetbrains.annotations.Nullable()
        java.lang.String orgUnit, @org.jetbrains.annotations.Nullable()
        java.lang.Integer productDetailsId, @org.jetbrains.annotations.Nullable()
        java.lang.Integer statusId, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean subsColdStorage, @org.jetbrains.annotations.Nullable()
        java.lang.String subsCompanyName, @org.jetbrains.annotations.Nullable()
        java.lang.String subsGenericBranded, @org.jetbrains.annotations.Nullable()
        java.lang.Integer subsMaxCappedQty, @org.jetbrains.annotations.Nullable()
        java.lang.Integer subsMaxCappedWeight, @org.jetbrains.annotations.Nullable()
        java.lang.Object subsMedList, @org.jetbrains.annotations.Nullable()
        java.lang.String subsMedName, @org.jetbrains.annotations.Nullable()
        java.lang.Double subsMrp, @org.jetbrains.annotations.Nullable()
        java.lang.String subsPackSize, @org.jetbrains.annotations.Nullable()
        java.lang.String subsProductCd, @org.jetbrains.annotations.Nullable()
        java.lang.Integer subsQuantity, @org.jetbrains.annotations.Nullable()
        java.lang.Double subsSellingPrice, @org.jetbrains.annotations.Nullable()
        java.lang.String subsStrength, @org.jetbrains.annotations.Nullable()
        java.lang.String subsSubGroup, @org.jetbrains.annotations.Nullable()
        java.lang.String subsUnit) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getColdChainDisabled() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getCrossSellingProduct() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getCxAcceptedSubs() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getCxKeepOriginal() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getCxOrgAdded() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getDisabled() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getFinalSubsId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getMedActive() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getMedReOrder() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getOrgAvailable() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getOrgColdStorage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOrgCompanyName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getOrgDiscount() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOrgGenericBranded() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getOrgMaxCappedQty() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getOrgMaxCappedWeight() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOrgMedName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getOrgMrp() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOrgPackSize() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOrgProductCd() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getOrgQuantity() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getOrgRxRequired() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOrgStrength() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOrgSubGroup() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOrgUnit() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getProductDetailsId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getStatusId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getSubsColdStorage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSubsCompanyName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSubsGenericBranded() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getSubsMaxCappedQty() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getSubsMaxCappedWeight() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getSubsMedList() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSubsMedName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getSubsMrp() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSubsPackSize() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSubsProductCd() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getSubsQuantity() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getSubsSellingPrice() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSubsStrength() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSubsSubGroup() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSubsUnit() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component12() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component13() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component14() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component15() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component16() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component17() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component18() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component19() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component20() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component21() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component22() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component23() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component24() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component25() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component26() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component27() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component28() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component29() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component30() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component31() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component32() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component33() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component34() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component35() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component36() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component37() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component38() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component39() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component40() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component41() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component42() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.ProductSubsMapping copy(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean coldChainDisabled, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean crossSellingProduct, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean cxAcceptedSubs, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean cxKeepOriginal, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean cxOrgAdded, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean disabled, @org.jetbrains.annotations.Nullable()
        java.lang.Integer finalSubsId, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean medActive, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean medReOrder, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean orgAvailable, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean orgColdStorage, @org.jetbrains.annotations.Nullable()
        java.lang.String orgCompanyName, @org.jetbrains.annotations.Nullable()
        java.lang.Double orgDiscount, @org.jetbrains.annotations.Nullable()
        java.lang.String orgGenericBranded, @org.jetbrains.annotations.Nullable()
        java.lang.Integer orgMaxCappedQty, @org.jetbrains.annotations.Nullable()
        java.lang.Integer orgMaxCappedWeight, @org.jetbrains.annotations.Nullable()
        java.lang.String orgMedName, @org.jetbrains.annotations.Nullable()
        java.lang.Double orgMrp, @org.jetbrains.annotations.Nullable()
        java.lang.String orgPackSize, @org.jetbrains.annotations.Nullable()
        java.lang.String orgProductCd, @org.jetbrains.annotations.Nullable()
        java.lang.Integer orgQuantity, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean orgRxRequired, @org.jetbrains.annotations.Nullable()
        java.lang.String orgStrength, @org.jetbrains.annotations.Nullable()
        java.lang.String orgSubGroup, @org.jetbrains.annotations.Nullable()
        java.lang.String orgUnit, @org.jetbrains.annotations.Nullable()
        java.lang.Integer productDetailsId, @org.jetbrains.annotations.Nullable()
        java.lang.Integer statusId, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean subsColdStorage, @org.jetbrains.annotations.Nullable()
        java.lang.String subsCompanyName, @org.jetbrains.annotations.Nullable()
        java.lang.String subsGenericBranded, @org.jetbrains.annotations.Nullable()
        java.lang.Integer subsMaxCappedQty, @org.jetbrains.annotations.Nullable()
        java.lang.Integer subsMaxCappedWeight, @org.jetbrains.annotations.Nullable()
        java.lang.Object subsMedList, @org.jetbrains.annotations.Nullable()
        java.lang.String subsMedName, @org.jetbrains.annotations.Nullable()
        java.lang.Double subsMrp, @org.jetbrains.annotations.Nullable()
        java.lang.String subsPackSize, @org.jetbrains.annotations.Nullable()
        java.lang.String subsProductCd, @org.jetbrains.annotations.Nullable()
        java.lang.Integer subsQuantity, @org.jetbrains.annotations.Nullable()
        java.lang.Double subsSellingPrice, @org.jetbrains.annotations.Nullable()
        java.lang.String subsStrength, @org.jetbrains.annotations.Nullable()
        java.lang.String subsSubGroup, @org.jetbrains.annotations.Nullable()
        java.lang.String subsUnit) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}