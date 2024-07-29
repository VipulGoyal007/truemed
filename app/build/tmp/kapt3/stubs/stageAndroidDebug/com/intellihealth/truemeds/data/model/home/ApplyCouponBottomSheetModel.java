package com.intellihealth.truemeds.data.model.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\tH\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\u0083\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001J\u0013\u00103\u001a\u00020\t2\b\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u000206H\u00d6\u0001J\t\u00107\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0012\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0015R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0012R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0012\u00a8\u00068"}, d2 = {"Lcom/intellihealth/truemeds/data/model/home/ApplyCouponBottomSheetModel;", "", "header", "", "headerContent", "subHeaderContent", "buttonText", "timerData", "isTimerVisible", "", "minOrderValue", "discountCashback", "expiryDays", "termsAndCondition", "setStickyData", "Lcom/intellihealth/salt/models/StickyNonStickyNotificationModel;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/intellihealth/salt/models/StickyNonStickyNotificationModel;)V", "getButtonText", "()Ljava/lang/String;", "getDiscountCashback", "setDiscountCashback", "(Ljava/lang/String;)V", "getExpiryDays", "setExpiryDays", "getHeader", "getHeaderContent", "()Z", "setTimerVisible", "(Z)V", "getMinOrderValue", "setMinOrderValue", "getSetStickyData", "()Lcom/intellihealth/salt/models/StickyNonStickyNotificationModel;", "setSetStickyData", "(Lcom/intellihealth/salt/models/StickyNonStickyNotificationModel;)V", "getSubHeaderContent", "getTermsAndCondition", "setTermsAndCondition", "getTimerData", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_stageAndroidDebug"})
public final class ApplyCouponBottomSheetModel {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String header = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String headerContent = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String subHeaderContent = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String buttonText = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String timerData = null;
    private boolean isTimerVisible;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String minOrderValue;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String discountCashback;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String expiryDays;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String termsAndCondition;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.salt.models.StickyNonStickyNotificationModel setStickyData;
    
    public ApplyCouponBottomSheetModel(@org.jetbrains.annotations.Nullable()
    java.lang.String header, @org.jetbrains.annotations.Nullable()
    java.lang.String headerContent, @org.jetbrains.annotations.Nullable()
    java.lang.String subHeaderContent, @org.jetbrains.annotations.Nullable()
    java.lang.String buttonText, @org.jetbrains.annotations.Nullable()
    java.lang.String timerData, boolean isTimerVisible, @org.jetbrains.annotations.NotNull()
    java.lang.String minOrderValue, @org.jetbrains.annotations.NotNull()
    java.lang.String discountCashback, @org.jetbrains.annotations.NotNull()
    java.lang.String expiryDays, @org.jetbrains.annotations.NotNull()
    java.lang.String termsAndCondition, @org.jetbrains.annotations.Nullable()
    com.intellihealth.salt.models.StickyNonStickyNotificationModel setStickyData) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHeader() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHeaderContent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubHeaderContent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getButtonText() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTimerData() {
        return null;
    }
    
    public final boolean isTimerVisible() {
        return false;
    }
    
    public final void setTimerVisible(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMinOrderValue() {
        return null;
    }
    
    public final void setMinOrderValue(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDiscountCashback() {
        return null;
    }
    
    public final void setDiscountCashback(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getExpiryDays() {
        return null;
    }
    
    public final void setExpiryDays(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTermsAndCondition() {
        return null;
    }
    
    public final void setTermsAndCondition(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.salt.models.StickyNonStickyNotificationModel getSetStickyData() {
        return null;
    }
    
    public final void setSetStickyData(@org.jetbrains.annotations.Nullable()
    com.intellihealth.salt.models.StickyNonStickyNotificationModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.salt.models.StickyNonStickyNotificationModel component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
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
    
    public final boolean component6() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.home.ApplyCouponBottomSheetModel copy(@org.jetbrains.annotations.Nullable()
    java.lang.String header, @org.jetbrains.annotations.Nullable()
    java.lang.String headerContent, @org.jetbrains.annotations.Nullable()
    java.lang.String subHeaderContent, @org.jetbrains.annotations.Nullable()
    java.lang.String buttonText, @org.jetbrains.annotations.Nullable()
    java.lang.String timerData, boolean isTimerVisible, @org.jetbrains.annotations.NotNull()
    java.lang.String minOrderValue, @org.jetbrains.annotations.NotNull()
    java.lang.String discountCashback, @org.jetbrains.annotations.NotNull()
    java.lang.String expiryDays, @org.jetbrains.annotations.NotNull()
    java.lang.String termsAndCondition, @org.jetbrains.annotations.Nullable()
    com.intellihealth.salt.models.StickyNonStickyNotificationModel setStickyData) {
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