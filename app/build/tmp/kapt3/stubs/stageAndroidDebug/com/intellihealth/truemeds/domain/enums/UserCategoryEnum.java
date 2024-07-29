package com.intellihealth.truemeds.domain.enums;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b \b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u000e\"\u0004\b\u0013\u0010\u0010j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%\u00a8\u0006&"}, d2 = {"Lcom/intellihealth/truemeds/domain/enums/UserCategoryEnum;", "", "firebaseParameterKey", "", "apiCategoryType", "createVariantPostLogin", "", "isExperimentConcluded", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZZ)V", "getApiCategoryType", "()Ljava/lang/String;", "setApiCategoryType", "(Ljava/lang/String;)V", "getCreateVariantPostLogin", "()Z", "setCreateVariantPostLogin", "(Z)V", "getFirebaseParameterKey", "setFirebaseParameterKey", "setExperimentConcluded", "SUBS_ADD_TO_CART", "PD_SEARCH_BLUE_GREEN", "PILL_REMINDER", "PACKAGING_CHARGE", "CANCELLATION_FLOW", "CREDIT_REWARD", "ONLINE_PRE_SELECTION", "FTC_COUPON_URGENCY", "VIDEO_ON_ORDER_STATUS", "ONE_CLICK_SUBSTITUTION", "REORDER_DESIGN_EXPERIMENT", "PSP", "FTC_DYNAMIC_DISCOUNT", "NFTC_DYNAMIC_DISCOUNT", "TRADITIONAL_BASE_DISCOUNT", "SEARCH_EXPERIMENT_1", "GENERIC_CAP_DISCOUNT", "CASH_HANDLING_CHARGE", "app_stageAndroidDebug"})
public enum UserCategoryEnum {
    /*public static final*/ SUBS_ADD_TO_CART /* = new SUBS_ADD_TO_CART(null, null, false, false) */,
    /*public static final*/ PD_SEARCH_BLUE_GREEN /* = new PD_SEARCH_BLUE_GREEN(null, null, false, false) */,
    /*public static final*/ PILL_REMINDER /* = new PILL_REMINDER(null, null, false, false) */,
    /*public static final*/ PACKAGING_CHARGE /* = new PACKAGING_CHARGE(null, null, false, false) */,
    /*public static final*/ CANCELLATION_FLOW /* = new CANCELLATION_FLOW(null, null, false, false) */,
    /*public static final*/ CREDIT_REWARD /* = new CREDIT_REWARD(null, null, false, false) */,
    /*public static final*/ ONLINE_PRE_SELECTION /* = new ONLINE_PRE_SELECTION(null, null, false, false) */,
    /*public static final*/ FTC_COUPON_URGENCY /* = new FTC_COUPON_URGENCY(null, null, false, false) */,
    /*public static final*/ VIDEO_ON_ORDER_STATUS /* = new VIDEO_ON_ORDER_STATUS(null, null, false, false) */,
    /*public static final*/ ONE_CLICK_SUBSTITUTION /* = new ONE_CLICK_SUBSTITUTION(null, null, false, false) */,
    /*public static final*/ REORDER_DESIGN_EXPERIMENT /* = new REORDER_DESIGN_EXPERIMENT(null, null, false, false) */,
    /*public static final*/ PSP /* = new PSP(null, null, false, false) */,
    /*public static final*/ FTC_DYNAMIC_DISCOUNT /* = new FTC_DYNAMIC_DISCOUNT(null, null, false, false) */,
    /*public static final*/ NFTC_DYNAMIC_DISCOUNT /* = new NFTC_DYNAMIC_DISCOUNT(null, null, false, false) */,
    /*public static final*/ TRADITIONAL_BASE_DISCOUNT /* = new TRADITIONAL_BASE_DISCOUNT(null, null, false, false) */,
    /*public static final*/ SEARCH_EXPERIMENT_1 /* = new SEARCH_EXPERIMENT_1(null, null, false, false) */,
    /*public static final*/ GENERIC_CAP_DISCOUNT /* = new GENERIC_CAP_DISCOUNT(null, null, false, false) */,
    /*public static final*/ CASH_HANDLING_CHARGE /* = new CASH_HANDLING_CHARGE(null, null, false, false) */;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String firebaseParameterKey;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String apiCategoryType;
    private boolean createVariantPostLogin;
    private boolean isExperimentConcluded;
    
    UserCategoryEnum(java.lang.String firebaseParameterKey, java.lang.String apiCategoryType, boolean createVariantPostLogin, boolean isExperimentConcluded) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirebaseParameterKey() {
        return null;
    }
    
    public final void setFirebaseParameterKey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApiCategoryType() {
        return null;
    }
    
    public final void setApiCategoryType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getCreateVariantPostLogin() {
        return false;
    }
    
    public final void setCreateVariantPostLogin(boolean p0) {
    }
    
    public final boolean isExperimentConcluded() {
        return false;
    }
    
    public final void setExperimentConcluded(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<com.intellihealth.truemeds.domain.enums.UserCategoryEnum> getEntries() {
        return null;
    }
}