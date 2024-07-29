package com.intellihealth.truemeds.presentation.callbacks;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/intellihealth/truemeds/presentation/callbacks/CouponBottomSheetCallback;", "", "applyCouponButtonClick", "", "couponCodeResponse", "Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse$Coupon;", "removeCouponButtonClick", "app_stageAndroidDebug"})
public abstract interface CouponBottomSheetCallback {
    
    public abstract void applyCouponButtonClick(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon couponCodeResponse);
    
    public abstract void removeCouponButtonClick(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon couponCodeResponse);
}