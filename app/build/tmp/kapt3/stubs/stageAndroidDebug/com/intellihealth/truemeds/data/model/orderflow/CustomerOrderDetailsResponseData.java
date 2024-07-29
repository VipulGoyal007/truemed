package com.intellihealth.truemeds.data.model.orderflow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\bl\b\u0086\b\u0018\u00002\u00020\u0001B\u00a5\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010Y\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u0010\u0010Z\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u00100J\u0010\u0010[\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u00100J\u0010\u0010\\\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u00100J\u0010\u0010]\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u0010\u0010^\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u000b\u0010_\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010`\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u0010\u0010a\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u00100J\u0010\u0010b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u0010\u0010c\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u00100J\u0010\u0010d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u0010\u0010e\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u00100J\u0010\u0010f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u00100J\u0010\u0010g\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u00100J\u000b\u0010h\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010k\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u0010l\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u0010m\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u00100J\u0010\u0010n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u00100J\u000b\u0010o\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u00ae\u0002\u0010q\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010rJ\u0013\u0010s\u001a\u00020\u000b2\b\u0010t\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010u\u001a\u00020\u0003H\u00d6\u0001J\t\u0010v\u001a\u00020\u0006H\u00d6\u0001R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\"\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010*\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R \u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00103\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00103\u001a\u0004\b4\u00100\"\u0004\b5\u00102R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00103\u001a\u0004\b6\u00100\"\u0004\b7\u00102R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b8\u0010 \"\u0004\b9\u0010\"R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00103\u001a\u0004\b:\u00100\"\u0004\b;\u00102R \u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010,\"\u0004\b=\u0010.R\"\u0010\u001b\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00103\u001a\u0004\b\u001b\u00100\"\u0004\b>\u00102R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b?\u0010 \"\u0004\b@\u0010\"R \u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010,\"\u0004\bB\u0010.R\"\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00103\u001a\u0004\bC\u00100\"\u0004\bD\u00102R \u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010,\"\u0004\bF\u0010.R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\bG\u0010 \"\u0004\bH\u0010\"R\"\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00103\u001a\u0004\bI\u00100\"\u0004\bJ\u00102R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010*\u001a\u0004\bK\u0010\'\"\u0004\bL\u0010)R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00103\u001a\u0004\bM\u00100\"\u0004\bN\u00102R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010,\"\u0004\bP\u0010.R \u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010,\"\u0004\bR\u0010.R\"\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00103\u001a\u0004\bS\u00100\"\u0004\bT\u00102R\"\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00103\u001a\u0004\bU\u00100\"\u0004\bV\u00102R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\bW\u0010 \"\u0004\bX\u0010\"\u00a8\u0006w"}, d2 = {"Lcom/intellihealth/truemeds/data/model/orderflow/CustomerOrderDetailsResponseData;", "", "orderId", "", "subsId", "prevPaymentId", "", "addressId", "", "patientId", "cxHasActiveAddress", "", "cxHasActivePatient", "regMobNumber", "altMobNumber", "drCallRequired", "pharmacistCallRequired", "orderReorder", "addedPatientCount", "addedAddressCount", "edd", "deliveryDays", "reorder", "orderTypeId", "rxRequired", "chronic", "otc", "isGeneric", "orderType", "orderInState", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getAddedAddressCount", "()Ljava/lang/Integer;", "setAddedAddressCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getAddedPatientCount", "setAddedPatientCount", "getAddressId", "()Ljava/lang/Long;", "setAddressId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getAltMobNumber", "()Ljava/lang/String;", "setAltMobNumber", "(Ljava/lang/String;)V", "getChronic", "()Ljava/lang/Boolean;", "setChronic", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getCxHasActiveAddress", "setCxHasActiveAddress", "getCxHasActivePatient", "setCxHasActivePatient", "getDeliveryDays", "setDeliveryDays", "getDrCallRequired", "setDrCallRequired", "getEdd", "setEdd", "setGeneric", "getOrderId", "setOrderId", "getOrderInState", "setOrderInState", "getOrderReorder", "setOrderReorder", "getOrderType", "setOrderType", "getOrderTypeId", "setOrderTypeId", "getOtc", "setOtc", "getPatientId", "setPatientId", "getPharmacistCallRequired", "setPharmacistCallRequired", "getPrevPaymentId", "setPrevPaymentId", "getRegMobNumber", "setRegMobNumber", "getReorder", "setReorder", "getRxRequired", "setRxRequired", "getSubsId", "setSubsId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/intellihealth/truemeds/data/model/orderflow/CustomerOrderDetailsResponseData;", "equals", "other", "hashCode", "toString", "app_stageAndroidDebug"})
public final class CustomerOrderDetailsResponseData {
    @com.google.gson.annotations.SerializedName(value = "orderId")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer orderId;
    @com.google.gson.annotations.SerializedName(value = "subsId")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer subsId;
    @com.google.gson.annotations.SerializedName(value = "prevPaymentId")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String prevPaymentId;
    @com.google.gson.annotations.SerializedName(value = "addressId")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long addressId;
    @com.google.gson.annotations.SerializedName(value = "patientId")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long patientId;
    @com.google.gson.annotations.SerializedName(value = "cxHasActiveAddress")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean cxHasActiveAddress;
    @com.google.gson.annotations.SerializedName(value = "cxHasActivePatient")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean cxHasActivePatient;
    @com.google.gson.annotations.SerializedName(value = "regMobNumber")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String regMobNumber;
    @com.google.gson.annotations.SerializedName(value = "altMobNumber")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String altMobNumber;
    @com.google.gson.annotations.SerializedName(value = "drCallRequired")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean drCallRequired;
    @com.google.gson.annotations.SerializedName(value = "pharmacistCallRequired")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean pharmacistCallRequired;
    @com.google.gson.annotations.SerializedName(value = "orderReorder")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean orderReorder;
    @com.google.gson.annotations.SerializedName(value = "addedPatientCount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer addedPatientCount;
    @com.google.gson.annotations.SerializedName(value = "addedAddressCount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer addedAddressCount;
    @com.google.gson.annotations.SerializedName(value = "edd")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String edd;
    @com.google.gson.annotations.SerializedName(value = "deliveryDays")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer deliveryDays;
    @com.google.gson.annotations.SerializedName(value = "reorder")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean reorder;
    @com.google.gson.annotations.SerializedName(value = "orderTypeId")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer orderTypeId;
    @com.google.gson.annotations.SerializedName(value = "rxRequired")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean rxRequired;
    @com.google.gson.annotations.SerializedName(value = "chronic")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean chronic;
    @com.google.gson.annotations.SerializedName(value = "otc")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean otc;
    @com.google.gson.annotations.SerializedName(value = "generic")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isGeneric;
    @com.google.gson.annotations.SerializedName(value = "orderType")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String orderType;
    @com.google.gson.annotations.SerializedName(value = "orderInState")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String orderInState;
    
    public CustomerOrderDetailsResponseData(@org.jetbrains.annotations.Nullable()
    java.lang.Integer orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer subsId, @org.jetbrains.annotations.Nullable()
    java.lang.String prevPaymentId, @org.jetbrains.annotations.Nullable()
    java.lang.Long addressId, @org.jetbrains.annotations.Nullable()
    java.lang.Long patientId, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean cxHasActiveAddress, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean cxHasActivePatient, @org.jetbrains.annotations.Nullable()
    java.lang.String regMobNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String altMobNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean drCallRequired, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean pharmacistCallRequired, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean orderReorder, @org.jetbrains.annotations.Nullable()
    java.lang.Integer addedPatientCount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer addedAddressCount, @org.jetbrains.annotations.Nullable()
    java.lang.String edd, @org.jetbrains.annotations.Nullable()
    java.lang.Integer deliveryDays, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean reorder, @org.jetbrains.annotations.Nullable()
    java.lang.Integer orderTypeId, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean rxRequired, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean chronic, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean otc, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isGeneric, @org.jetbrains.annotations.Nullable()
    java.lang.String orderType, @org.jetbrains.annotations.Nullable()
    java.lang.String orderInState) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getOrderId() {
        return null;
    }
    
    public final void setOrderId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSubsId() {
        return null;
    }
    
    public final void setSubsId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPrevPaymentId() {
        return null;
    }
    
    public final void setPrevPaymentId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getAddressId() {
        return null;
    }
    
    public final void setAddressId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getPatientId() {
        return null;
    }
    
    public final void setPatientId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getCxHasActiveAddress() {
        return null;
    }
    
    public final void setCxHasActiveAddress(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getCxHasActivePatient() {
        return null;
    }
    
    public final void setCxHasActivePatient(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRegMobNumber() {
        return null;
    }
    
    public final void setRegMobNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAltMobNumber() {
        return null;
    }
    
    public final void setAltMobNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getDrCallRequired() {
        return null;
    }
    
    public final void setDrCallRequired(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getPharmacistCallRequired() {
        return null;
    }
    
    public final void setPharmacistCallRequired(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getOrderReorder() {
        return null;
    }
    
    public final void setOrderReorder(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getAddedPatientCount() {
        return null;
    }
    
    public final void setAddedPatientCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getAddedAddressCount() {
        return null;
    }
    
    public final void setAddedAddressCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEdd() {
        return null;
    }
    
    public final void setEdd(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDeliveryDays() {
        return null;
    }
    
    public final void setDeliveryDays(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getReorder() {
        return null;
    }
    
    public final void setReorder(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getOrderTypeId() {
        return null;
    }
    
    public final void setOrderTypeId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getRxRequired() {
        return null;
    }
    
    public final void setRxRequired(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getChronic() {
        return null;
    }
    
    public final void setChronic(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getOtc() {
        return null;
    }
    
    public final void setOtc(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isGeneric() {
        return null;
    }
    
    public final void setGeneric(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrderType() {
        return null;
    }
    
    public final void setOrderType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrderInState() {
        return null;
    }
    
    public final void setOrderInState(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public CustomerOrderDetailsResponseData() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
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
    public final java.lang.Boolean component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
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
    public final java.lang.Boolean component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component21() {
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
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.orderflow.CustomerOrderDetailsResponseData copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer subsId, @org.jetbrains.annotations.Nullable()
    java.lang.String prevPaymentId, @org.jetbrains.annotations.Nullable()
    java.lang.Long addressId, @org.jetbrains.annotations.Nullable()
    java.lang.Long patientId, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean cxHasActiveAddress, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean cxHasActivePatient, @org.jetbrains.annotations.Nullable()
    java.lang.String regMobNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String altMobNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean drCallRequired, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean pharmacistCallRequired, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean orderReorder, @org.jetbrains.annotations.Nullable()
    java.lang.Integer addedPatientCount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer addedAddressCount, @org.jetbrains.annotations.Nullable()
    java.lang.String edd, @org.jetbrains.annotations.Nullable()
    java.lang.Integer deliveryDays, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean reorder, @org.jetbrains.annotations.Nullable()
    java.lang.Integer orderTypeId, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean rxRequired, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean chronic, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean otc, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isGeneric, @org.jetbrains.annotations.Nullable()
    java.lang.String orderType, @org.jetbrains.annotations.Nullable()
    java.lang.String orderInState) {
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