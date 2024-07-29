package com.intellihealth.truemeds.data.model.coupon;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001)B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\bH\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0001H\u00c6\u0003JA\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0001H\u00c6\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020\bH\u00d6\u0001J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\n\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006*"}, d2 = {"Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse;", "", "message", "", "responseData", "", "Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse$Coupon;", "statusCode", "", "statusValue", "timeTakenInMs", "(Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/Object;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getResponseData", "()Ljava/util/List;", "setResponseData", "(Ljava/util/List;)V", "getStatusCode", "()I", "setStatusCode", "(I)V", "getStatusValue", "setStatusValue", "getTimeTakenInMs", "()Ljava/lang/Object;", "setTimeTakenInMs", "(Ljava/lang/Object;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "Coupon", "app_stageAndroidDebug"})
public final class CouponCodeResponse {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String message;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> responseData;
    private int statusCode;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String statusValue;
    @org.jetbrains.annotations.NotNull()
    private java.lang.Object timeTakenInMs;
    
    public CouponCodeResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> responseData, int statusCode, @org.jetbrains.annotations.NotNull()
    java.lang.String statusValue, @org.jetbrains.annotations.NotNull()
    java.lang.Object timeTakenInMs) {
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
    public final java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> getResponseData() {
        return null;
    }
    
    public final void setResponseData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> p0) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getTimeTakenInMs() {
        return null;
    }
    
    public final void setTimeTakenInMs(@org.jetbrains.annotations.NotNull()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse copy(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> responseData, int statusCode, @org.jetbrains.annotations.NotNull()
    java.lang.String statusValue, @org.jetbrains.annotations.NotNull()
    java.lang.Object timeTakenInMs) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\by\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u00a5\u0001\u00a6\u0001B\u00f1\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\'\u001a\u00020\u0005\u0012\u0006\u0010(\u001a\u00020)\u00a2\u0006\u0002\u0010*J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u007f\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0011H\u00c6\u0003J\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00104J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00104J\u0010\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u00c6\u0003J\u0012\u0010\u0085\u0001\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0016H\u00c6\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0011H\u00c6\u0003J\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00104J\u0011\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00104J\n\u0010\u008a\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u0010AJ\u0011\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u0010AJ\u0011\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u0010AJ\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0096\u0001\u001a\u00020)H\u00c6\u0003J\u0011\u0010\u0097\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010HJ\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u009b\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010HJ\u0011\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010aJ\u0080\u0003\u0010\u009d\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00112\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\'\u001a\u00020\u00052\b\b\u0002\u0010(\u001a\u00020)H\u00c6\u0001\u00a2\u0006\u0003\u0010\u009e\u0001J\u0015\u0010\u009f\u0001\u001a\u00020\u00052\t\u0010\u00a0\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00a1\u0001\u001a\u00020\u000eH\u00d6\u0001J\b\u0010\u00a2\u0001\u001a\u00030\u00a3\u0001J\n\u0010\u00a4\u0001\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010%\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u001e\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010,\"\u0004\b0\u0010.R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010(\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010D\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010,\"\u0004\bF\u0010.R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010K\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001e\u0010 \u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010D\u001a\u0004\bL\u0010A\"\u0004\bM\u0010CR\u001e\u0010!\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010D\u001a\u0004\bN\u0010A\"\u0004\bO\u0010CR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010,\"\u0004\bQ\u0010.R\u001c\u0010$\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010,\"\u0004\bS\u0010.R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010,\"\u0004\bU\u0010.R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010,\"\u0004\bW\u0010.R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010,\"\u0004\bY\u0010.R\u001a\u0010\'\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010Z\"\u0004\b[\u0010\\R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\b\u001c\u00104\"\u0004\b]\u00106R\u001e\u0010\f\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010K\u001a\u0004\b^\u0010H\"\u0004\b_\u0010JR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010d\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001a\u0010\u000f\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001c\u0010&\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010,\"\u0004\bj\u0010.R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\bk\u00104\"\u0004\bl\u00106R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bq\u0010,\"\u0004\br\u0010.R\u0011\u0010\u001d\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bs\u0010,R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\bt\u00104\"\u0004\bu\u00106R\u001c\u0010#\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u0010,\"\u0004\bw\u0010.R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bx\u0010n\"\u0004\by\u0010pR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bz\u0010,\"\u0004\b{\u0010.R\u001a\u0010\u001b\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b|\u00109\"\u0004\b}\u0010;\u00a8\u0006\u00a7\u0001"}, d2 = {"Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse$Coupon;", "", "colorCode", "", "couponCodeRequired", "", "description", "discountValue", "", "ftcUrgencyDescription", "image", "infoPanel", "maxDiscount", "minCartValue", "", "offerId", "couponExpiryPeriod", "", "offersVisible", "promoCode", "showFtcCounter", "termsAndConditions", "", "Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse$Coupon$TermsAndCondition;", "paymentMethods", "Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse$Coupon$PaymentMethod;", "title", "validity", "isOfferApplied", "savingAmount", "applyLabel", "currentDate", "expiryDate", "expiryDateFromApi", "expiryDays", "subHeader", "expiryMsg", "applicableOn", "offerTypeMsg", "isCouponApplied", "couponType", "Lcom/intellihealth/salt/constants/CouponConstant;", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;IJLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/String;JLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/intellihealth/salt/constants/CouponConstant;)V", "getApplicableOn", "()Ljava/lang/String;", "setApplicableOn", "(Ljava/lang/String;)V", "getApplyLabel", "setApplyLabel", "getColorCode", "setColorCode", "getCouponCodeRequired", "()Ljava/lang/Boolean;", "setCouponCodeRequired", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getCouponExpiryPeriod", "()J", "setCouponExpiryPeriod", "(J)V", "getCouponType", "()Lcom/intellihealth/salt/constants/CouponConstant;", "setCouponType", "(Lcom/intellihealth/salt/constants/CouponConstant;)V", "getCurrentDate", "()Ljava/lang/Long;", "setCurrentDate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getDescription", "setDescription", "getDiscountValue", "()Ljava/lang/Double;", "setDiscountValue", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getExpiryDate", "setExpiryDate", "getExpiryDateFromApi", "setExpiryDateFromApi", "getExpiryDays", "setExpiryDays", "getExpiryMsg", "setExpiryMsg", "getFtcUrgencyDescription", "setFtcUrgencyDescription", "getImage", "setImage", "getInfoPanel", "setInfoPanel", "()Z", "setCouponApplied", "(Z)V", "setOfferApplied", "getMaxDiscount", "setMaxDiscount", "getMinCartValue", "()Ljava/lang/Integer;", "setMinCartValue", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getOfferId", "()I", "setOfferId", "(I)V", "getOfferTypeMsg", "setOfferTypeMsg", "getOffersVisible", "setOffersVisible", "getPaymentMethods", "()Ljava/util/List;", "setPaymentMethods", "(Ljava/util/List;)V", "getPromoCode", "setPromoCode", "getSavingAmount", "getShowFtcCounter", "setShowFtcCounter", "getSubHeader", "setSubHeader", "getTermsAndConditions", "setTermsAndConditions", "getTitle", "setTitle", "getValidity", "setValidity", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;IJLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/String;JLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/intellihealth/salt/constants/CouponConstant;)Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse$Coupon;", "equals", "other", "hashCode", "toSdkObject", "Lcom/intellihealth/salt/models/CouponModel;", "toString", "PaymentMethod", "TermsAndCondition", "app_stageAndroidDebug"})
    public static final class Coupon {
        @org.jetbrains.annotations.Nullable()
        private java.lang.String colorCode;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Boolean couponCodeRequired;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String description;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Double discountValue;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String ftcUrgencyDescription;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String image;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String infoPanel;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Double maxDiscount;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer minCartValue;
        private int offerId;
        private long couponExpiryPeriod;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Boolean offersVisible;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String promoCode;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Boolean showFtcCounter;
        @org.jetbrains.annotations.NotNull()
        private java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon.TermsAndCondition> termsAndConditions;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon.PaymentMethod> paymentMethods;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String title;
        private long validity;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Boolean isOfferApplied;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String savingAmount = null;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String applyLabel;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Long currentDate;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Long expiryDate;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Long expiryDateFromApi;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String expiryDays;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String subHeader;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String expiryMsg;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String applicableOn;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String offerTypeMsg;
        private boolean isCouponApplied;
        @org.jetbrains.annotations.NotNull()
        private com.intellihealth.salt.constants.CouponConstant couponType;
        
        public Coupon(@org.jetbrains.annotations.Nullable()
        java.lang.String colorCode, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean couponCodeRequired, @org.jetbrains.annotations.Nullable()
        java.lang.String description, @org.jetbrains.annotations.Nullable()
        java.lang.Double discountValue, @org.jetbrains.annotations.Nullable()
        java.lang.String ftcUrgencyDescription, @org.jetbrains.annotations.Nullable()
        java.lang.String image, @org.jetbrains.annotations.Nullable()
        java.lang.String infoPanel, @org.jetbrains.annotations.Nullable()
        java.lang.Double maxDiscount, @org.jetbrains.annotations.Nullable()
        java.lang.Integer minCartValue, int offerId, long couponExpiryPeriod, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean offersVisible, @org.jetbrains.annotations.Nullable()
        java.lang.String promoCode, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean showFtcCounter, @org.jetbrains.annotations.NotNull()
        java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon.TermsAndCondition> termsAndConditions, @org.jetbrains.annotations.Nullable()
        java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon.PaymentMethod> paymentMethods, @org.jetbrains.annotations.Nullable()
        java.lang.String title, long validity, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isOfferApplied, @org.jetbrains.annotations.NotNull()
        java.lang.String savingAmount, @org.jetbrains.annotations.NotNull()
        java.lang.String applyLabel, @org.jetbrains.annotations.Nullable()
        java.lang.Long currentDate, @org.jetbrains.annotations.Nullable()
        java.lang.Long expiryDate, @org.jetbrains.annotations.Nullable()
        java.lang.Long expiryDateFromApi, @org.jetbrains.annotations.Nullable()
        java.lang.String expiryDays, @org.jetbrains.annotations.Nullable()
        java.lang.String subHeader, @org.jetbrains.annotations.Nullable()
        java.lang.String expiryMsg, @org.jetbrains.annotations.Nullable()
        java.lang.String applicableOn, @org.jetbrains.annotations.Nullable()
        java.lang.String offerTypeMsg, boolean isCouponApplied, @org.jetbrains.annotations.NotNull()
        com.intellihealth.salt.constants.CouponConstant couponType) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getColorCode() {
            return null;
        }
        
        public final void setColorCode(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getCouponCodeRequired() {
            return null;
        }
        
        public final void setCouponCodeRequired(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDescription() {
            return null;
        }
        
        public final void setDescription(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getDiscountValue() {
            return null;
        }
        
        public final void setDiscountValue(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFtcUrgencyDescription() {
            return null;
        }
        
        public final void setFtcUrgencyDescription(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getImage() {
            return null;
        }
        
        public final void setImage(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getInfoPanel() {
            return null;
        }
        
        public final void setInfoPanel(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getMaxDiscount() {
            return null;
        }
        
        public final void setMaxDiscount(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getMinCartValue() {
            return null;
        }
        
        public final void setMinCartValue(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        public final int getOfferId() {
            return 0;
        }
        
        public final void setOfferId(int p0) {
        }
        
        public final long getCouponExpiryPeriod() {
            return 0L;
        }
        
        public final void setCouponExpiryPeriod(long p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getOffersVisible() {
            return null;
        }
        
        public final void setOffersVisible(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPromoCode() {
            return null;
        }
        
        public final void setPromoCode(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getShowFtcCounter() {
            return null;
        }
        
        public final void setShowFtcCounter(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon.TermsAndCondition> getTermsAndConditions() {
            return null;
        }
        
        public final void setTermsAndConditions(@org.jetbrains.annotations.NotNull()
        java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon.TermsAndCondition> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon.PaymentMethod> getPaymentMethods() {
            return null;
        }
        
        public final void setPaymentMethods(@org.jetbrains.annotations.Nullable()
        java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon.PaymentMethod> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTitle() {
            return null;
        }
        
        public final void setTitle(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final long getValidity() {
            return 0L;
        }
        
        public final void setValidity(long p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isOfferApplied() {
            return null;
        }
        
        public final void setOfferApplied(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSavingAmount() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getApplyLabel() {
            return null;
        }
        
        public final void setApplyLabel(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getCurrentDate() {
            return null;
        }
        
        public final void setCurrentDate(@org.jetbrains.annotations.Nullable()
        java.lang.Long p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getExpiryDate() {
            return null;
        }
        
        public final void setExpiryDate(@org.jetbrains.annotations.Nullable()
        java.lang.Long p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getExpiryDateFromApi() {
            return null;
        }
        
        public final void setExpiryDateFromApi(@org.jetbrains.annotations.Nullable()
        java.lang.Long p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getExpiryDays() {
            return null;
        }
        
        public final void setExpiryDays(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSubHeader() {
            return null;
        }
        
        public final void setSubHeader(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getExpiryMsg() {
            return null;
        }
        
        public final void setExpiryMsg(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getApplicableOn() {
            return null;
        }
        
        public final void setApplicableOn(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOfferTypeMsg() {
            return null;
        }
        
        public final void setOfferTypeMsg(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final boolean isCouponApplied() {
            return false;
        }
        
        public final void setCouponApplied(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.salt.constants.CouponConstant getCouponType() {
            return null;
        }
        
        public final void setCouponType(@org.jetbrains.annotations.NotNull()
        com.intellihealth.salt.constants.CouponConstant p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.salt.models.CouponModel toSdkObject() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        public final int component10() {
            return 0;
        }
        
        public final long component11() {
            return 0L;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component12() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component13() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component14() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon.TermsAndCondition> component15() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon.PaymentMethod> component16() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component17() {
            return null;
        }
        
        public final long component18() {
            return 0L;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component19() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component20() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component21() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component22() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component23() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component24() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component25() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component26() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component27() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component28() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component29() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        public final boolean component30() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.salt.constants.CouponConstant component31() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component4() {
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
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon copy(@org.jetbrains.annotations.Nullable()
        java.lang.String colorCode, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean couponCodeRequired, @org.jetbrains.annotations.Nullable()
        java.lang.String description, @org.jetbrains.annotations.Nullable()
        java.lang.Double discountValue, @org.jetbrains.annotations.Nullable()
        java.lang.String ftcUrgencyDescription, @org.jetbrains.annotations.Nullable()
        java.lang.String image, @org.jetbrains.annotations.Nullable()
        java.lang.String infoPanel, @org.jetbrains.annotations.Nullable()
        java.lang.Double maxDiscount, @org.jetbrains.annotations.Nullable()
        java.lang.Integer minCartValue, int offerId, long couponExpiryPeriod, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean offersVisible, @org.jetbrains.annotations.Nullable()
        java.lang.String promoCode, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean showFtcCounter, @org.jetbrains.annotations.NotNull()
        java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon.TermsAndCondition> termsAndConditions, @org.jetbrains.annotations.Nullable()
        java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon.PaymentMethod> paymentMethods, @org.jetbrains.annotations.Nullable()
        java.lang.String title, long validity, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isOfferApplied, @org.jetbrains.annotations.NotNull()
        java.lang.String savingAmount, @org.jetbrains.annotations.NotNull()
        java.lang.String applyLabel, @org.jetbrains.annotations.Nullable()
        java.lang.Long currentDate, @org.jetbrains.annotations.Nullable()
        java.lang.Long expiryDate, @org.jetbrains.annotations.Nullable()
        java.lang.Long expiryDateFromApi, @org.jetbrains.annotations.Nullable()
        java.lang.String expiryDays, @org.jetbrains.annotations.Nullable()
        java.lang.String subHeader, @org.jetbrains.annotations.Nullable()
        java.lang.String expiryMsg, @org.jetbrains.annotations.Nullable()
        java.lang.String applicableOn, @org.jetbrains.annotations.Nullable()
        java.lang.String offerTypeMsg, boolean isCouponApplied, @org.jetbrains.annotations.NotNull()
        com.intellihealth.salt.constants.CouponConstant couponType) {
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0007H\u00c6\u0003J\t\u0010$\u001a\u00020\u0007H\u00c6\u0003J\t\u0010%\u001a\u00020\u0007H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0007H\u00c6\u0003JO\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010)\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020,H\u00d6\u0001J\t\u0010-\u001a\u00020\u0007H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014\u00a8\u0006."}, d2 = {"Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse$Coupon$PaymentMethod;", "", "paymentMethodId", "", "active", "", "iconType", "", "iconName", "iconPath", "createdOn", "iconSubType", "(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getActive", "()Z", "setActive", "(Z)V", "getCreatedOn", "()J", "setCreatedOn", "(J)V", "getIconName", "()Ljava/lang/String;", "setIconName", "(Ljava/lang/String;)V", "getIconPath", "setIconPath", "getIconSubType", "setIconSubType", "getIconType", "setIconType", "getPaymentMethodId", "setPaymentMethodId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "app_stageAndroidDebug"})
        public static final class PaymentMethod {
            private long paymentMethodId;
            private boolean active;
            @org.jetbrains.annotations.NotNull()
            private java.lang.String iconType;
            @org.jetbrains.annotations.NotNull()
            private java.lang.String iconName;
            @org.jetbrains.annotations.NotNull()
            private java.lang.String iconPath;
            private long createdOn;
            @org.jetbrains.annotations.NotNull()
            private java.lang.String iconSubType;
            
            public PaymentMethod(long paymentMethodId, boolean active, @org.jetbrains.annotations.NotNull()
            java.lang.String iconType, @org.jetbrains.annotations.NotNull()
            java.lang.String iconName, @org.jetbrains.annotations.NotNull()
            java.lang.String iconPath, long createdOn, @org.jetbrains.annotations.NotNull()
            java.lang.String iconSubType) {
                super();
            }
            
            public final long getPaymentMethodId() {
                return 0L;
            }
            
            public final void setPaymentMethodId(long p0) {
            }
            
            public final boolean getActive() {
                return false;
            }
            
            public final void setActive(boolean p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getIconType() {
                return null;
            }
            
            public final void setIconType(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getIconName() {
                return null;
            }
            
            public final void setIconName(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getIconPath() {
                return null;
            }
            
            public final void setIconPath(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            public final long getCreatedOn() {
                return 0L;
            }
            
            public final void setCreatedOn(long p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getIconSubType() {
                return null;
            }
            
            public final void setIconSubType(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            public final long component1() {
                return 0L;
            }
            
            public final boolean component2() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component4() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component5() {
                return null;
            }
            
            public final long component6() {
                return 0L;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component7() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon.PaymentMethod copy(long paymentMethodId, boolean active, @org.jetbrains.annotations.NotNull()
            java.lang.String iconType, @org.jetbrains.annotations.NotNull()
            java.lang.String iconName, @org.jetbrains.annotations.NotNull()
            java.lang.String iconPath, long createdOn, @org.jetbrains.annotations.NotNull()
            java.lang.String iconSubType) {
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse$Coupon$TermsAndCondition;", "", "description", "", "id", "", "offersId", "(Ljava/lang/String;II)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getId", "()I", "setId", "(I)V", "getOffersId", "setOffersId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_stageAndroidDebug"})
        public static final class TermsAndCondition {
            @org.jetbrains.annotations.NotNull()
            private java.lang.String description;
            private int id;
            private int offersId;
            
            public TermsAndCondition(@org.jetbrains.annotations.NotNull()
            java.lang.String description, int id, int offersId) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getDescription() {
                return null;
            }
            
            public final void setDescription(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            public final int getId() {
                return 0;
            }
            
            public final void setId(int p0) {
            }
            
            public final int getOffersId() {
                return 0;
            }
            
            public final void setOffersId(int p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            public final int component2() {
                return 0;
            }
            
            public final int component3() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon.TermsAndCondition copy(@org.jetbrains.annotations.NotNull()
            java.lang.String description, int id, int offersId) {
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
}