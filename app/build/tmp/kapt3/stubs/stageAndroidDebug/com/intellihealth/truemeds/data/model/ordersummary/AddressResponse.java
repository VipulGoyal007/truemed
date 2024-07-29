package com.intellihealth.truemeds.data.model.ordersummary;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001*B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\bH\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u000bH\u00c6\u0003JA\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020\bH\u00d6\u0001J\t\u0010)\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006+"}, d2 = {"Lcom/intellihealth/truemeds/data/model/ordersummary/AddressResponse;", "", "message", "", "responseData", "", "Lcom/intellihealth/truemeds/data/model/ordersummary/AddressResponse$ResponseData;", "statusCode", "", "statusValue", "timeTakenInMs", "", "(Ljava/lang/String;Ljava/util/List;ILjava/lang/String;J)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getResponseData", "()Ljava/util/List;", "setResponseData", "(Ljava/util/List;)V", "getStatusCode", "()I", "setStatusCode", "(I)V", "getStatusValue", "setStatusValue", "getTimeTakenInMs", "()J", "setTimeTakenInMs", "(J)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "ResponseData", "app_stageAndroidDebug"})
public final class AddressResponse {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String message;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.ordersummary.AddressResponse.ResponseData> responseData;
    private int statusCode;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String statusValue;
    private long timeTakenInMs;
    
    public AddressResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.ordersummary.AddressResponse.ResponseData> responseData, int statusCode, @org.jetbrains.annotations.NotNull()
    java.lang.String statusValue, long timeTakenInMs) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.ordersummary.AddressResponse.ResponseData> getResponseData() {
        return null;
    }
    
    public final void setResponseData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.ordersummary.AddressResponse.ResponseData> p0) {
    }
    
    public final int getStatusCode() {
        return 0;
    }
    
    public final void setStatusCode(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatusValue() {
        return null;
    }
    
    public final void setStatusValue(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getTimeTakenInMs() {
        return 0L;
    }
    
    public final void setTimeTakenInMs(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.ordersummary.AddressResponse.ResponseData> component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final long component5() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.ordersummary.AddressResponse copy(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.ordersummary.AddressResponse.ResponseData> responseData, int statusCode, @org.jetbrains.annotations.NotNull()
    java.lang.String statusValue, long timeTakenInMs) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\bW\b\u0086\b\u0018\u00002\u00020\u0001B\u00e1\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010J\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\t\u0010K\u001a\u00020\fH\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010Q\u001a\u00020\fH\u00c6\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\t\u0010S\u001a\u00020\fH\u00c6\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u000b\u0010V\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010Z\u001a\u00020\fH\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u00ea\u0001\u0010]\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000f\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0015\u001a\u00020\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0017\u001a\u00020\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010^J\u0013\u0010_\u001a\u00020\u00032\b\u0010`\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010a\u001a\u00020\fH\u00d6\u0001J\t\u0010b\u001a\u00020\u0007H\u00d6\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010\'R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010%\"\u0004\b+\u0010\'R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010%\"\u0004\b-\u0010\'R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010%\"\u0004\b3\u0010\'R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010%\"\u0004\b5\u0010\'R\u001a\u0010\u000f\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010/\"\u0004\b7\u00101R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010%\"\u0004\b9\u0010\'R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010%\"\u0004\b;\u0010\'R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010%\"\u0004\b=\u0010\'R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010%\"\u0004\b?\u0010\'R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010%\"\u0004\bA\u0010\'R\u001a\u0010\u0015\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010/\"\u0004\bC\u00101R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\bD\u0010\u001b\"\u0004\bE\u0010\u001dR\u001a\u0010\u0017\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010/\"\u0004\bG\u00101R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010%\"\u0004\bI\u0010\'\u00a8\u0006c"}, d2 = {"Lcom/intellihealth/truemeds/data/model/ordersummary/AddressResponse$ResponseData;", "", "active", "", "addressId", "", "addressType", "", "addressline1", "addressline2", "addressline3", "cityId", "", "cityName", "clubbedAddress", "countryId", "countryName", "customerCity", "customerState", "landmark", "pincode", "pincodeId", "selected", "stateId", "stateName", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;ILjava/lang/String;)V", "getActive", "()Ljava/lang/Boolean;", "setActive", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getAddressId", "()Ljava/lang/Long;", "setAddressId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getAddressType", "()Ljava/lang/String;", "setAddressType", "(Ljava/lang/String;)V", "getAddressline1", "setAddressline1", "getAddressline2", "setAddressline2", "getAddressline3", "setAddressline3", "getCityId", "()I", "setCityId", "(I)V", "getCityName", "setCityName", "getClubbedAddress", "setClubbedAddress", "getCountryId", "setCountryId", "getCountryName", "setCountryName", "getCustomerCity", "setCustomerCity", "getCustomerState", "setCustomerState", "getLandmark", "setLandmark", "getPincode", "setPincode", "getPincodeId", "setPincodeId", "getSelected", "setSelected", "getStateId", "setStateId", "getStateName", "setStateName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;ILjava/lang/String;)Lcom/intellihealth/truemeds/data/model/ordersummary/AddressResponse$ResponseData;", "equals", "other", "hashCode", "toString", "app_stageAndroidDebug"})
    public static final class ResponseData {
        @org.jetbrains.annotations.Nullable()
        private java.lang.Boolean active;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Long addressId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String addressType;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String addressline1;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String addressline2;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String addressline3;
        private int cityId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String cityName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String clubbedAddress;
        private int countryId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String countryName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String customerCity;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String customerState;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String landmark;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String pincode;
        private int pincodeId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Boolean selected;
        private int stateId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String stateName;
        
        public ResponseData(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean active, @org.jetbrains.annotations.Nullable()
        java.lang.Long addressId, @org.jetbrains.annotations.Nullable()
        java.lang.String addressType, @org.jetbrains.annotations.Nullable()
        java.lang.String addressline1, @org.jetbrains.annotations.Nullable()
        java.lang.String addressline2, @org.jetbrains.annotations.Nullable()
        java.lang.String addressline3, int cityId, @org.jetbrains.annotations.Nullable()
        java.lang.String cityName, @org.jetbrains.annotations.Nullable()
        java.lang.String clubbedAddress, int countryId, @org.jetbrains.annotations.Nullable()
        java.lang.String countryName, @org.jetbrains.annotations.Nullable()
        java.lang.String customerCity, @org.jetbrains.annotations.Nullable()
        java.lang.String customerState, @org.jetbrains.annotations.Nullable()
        java.lang.String landmark, @org.jetbrains.annotations.Nullable()
        java.lang.String pincode, int pincodeId, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean selected, int stateId, @org.jetbrains.annotations.Nullable()
        java.lang.String stateName) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getActive() {
            return null;
        }
        
        public final void setActive(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getAddressId() {
            return null;
        }
        
        public final void setAddressId(@org.jetbrains.annotations.Nullable()
        java.lang.Long p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAddressType() {
            return null;
        }
        
        public final void setAddressType(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAddressline1() {
            return null;
        }
        
        public final void setAddressline1(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAddressline2() {
            return null;
        }
        
        public final void setAddressline2(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAddressline3() {
            return null;
        }
        
        public final void setAddressline3(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final int getCityId() {
            return 0;
        }
        
        public final void setCityId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCityName() {
            return null;
        }
        
        public final void setCityName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getClubbedAddress() {
            return null;
        }
        
        public final void setClubbedAddress(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final int getCountryId() {
            return 0;
        }
        
        public final void setCountryId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCountryName() {
            return null;
        }
        
        public final void setCountryName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCustomerCity() {
            return null;
        }
        
        public final void setCustomerCity(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCustomerState() {
            return null;
        }
        
        public final void setCustomerState(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLandmark() {
            return null;
        }
        
        public final void setLandmark(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPincode() {
            return null;
        }
        
        public final void setPincode(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final int getPincodeId() {
            return 0;
        }
        
        public final void setPincodeId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getSelected() {
            return null;
        }
        
        public final void setSelected(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        public final int getStateId() {
            return 0;
        }
        
        public final void setStateId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getStateName() {
            return null;
        }
        
        public final void setStateName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public ResponseData() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component1() {
            return null;
        }
        
        public final int component10() {
            return 0;
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
        public final java.lang.String component13() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component14() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component15() {
            return null;
        }
        
        public final int component16() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component17() {
            return null;
        }
        
        public final int component18() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component19() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component2() {
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
        
        public final int component7() {
            return 0;
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
        public final com.intellihealth.truemeds.data.model.ordersummary.AddressResponse.ResponseData copy(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean active, @org.jetbrains.annotations.Nullable()
        java.lang.Long addressId, @org.jetbrains.annotations.Nullable()
        java.lang.String addressType, @org.jetbrains.annotations.Nullable()
        java.lang.String addressline1, @org.jetbrains.annotations.Nullable()
        java.lang.String addressline2, @org.jetbrains.annotations.Nullable()
        java.lang.String addressline3, int cityId, @org.jetbrains.annotations.Nullable()
        java.lang.String cityName, @org.jetbrains.annotations.Nullable()
        java.lang.String clubbedAddress, int countryId, @org.jetbrains.annotations.Nullable()
        java.lang.String countryName, @org.jetbrains.annotations.Nullable()
        java.lang.String customerCity, @org.jetbrains.annotations.Nullable()
        java.lang.String customerState, @org.jetbrains.annotations.Nullable()
        java.lang.String landmark, @org.jetbrains.annotations.Nullable()
        java.lang.String pincode, int pincodeId, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean selected, int stateId, @org.jetbrains.annotations.Nullable()
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
}