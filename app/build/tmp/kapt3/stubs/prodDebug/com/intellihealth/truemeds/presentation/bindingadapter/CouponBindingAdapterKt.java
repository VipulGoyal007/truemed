package com.intellihealth.truemeds.presentation.bindingadapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u001a0\u0010\b\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0007\u001a\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0007\u001a(\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0007\u001a\u001e\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0007\u00a8\u0006\u001b"}, d2 = {"observeTimerValue", "", "view", "Lcom/intellihealth/salt/views/cards/CouponCtaCards;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/CouponViewModel;", "couponModel", "Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse$Coupon;", "setCouponList", "Landroidx/recyclerview/widget/RecyclerView;", "couponList", "", "currentCartValue", "", "setErrorMessage", "textView", "Lcom/intellihealth/salt/views/TextView;", "cartValue", "setStickyData", "stickyNonStickyNotification", "Lcom/intellihealth/salt/views/StickyNonStickyNotification;", "lifeCycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "setTermsAndCondition", "list", "", "Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse$Coupon$TermsAndCondition;", "app_prodDebug"})
public final class CouponBindingAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"setCouponListData", "viewModel", "currentCartValue"})
    public static final void setCouponList(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> couponList, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel viewModel, double currentCartValue) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setErrorMessage"})
    public static final void setErrorMessage(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.views.TextView textView, double cartValue) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"observeTimerValue", "couponModel"})
    public static final void observeTimerValue(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.views.cards.CouponCtaCards view, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel viewModel, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon couponModel) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setStickyData", "couponModel", "lifeCycleOwner"})
    public static final void setStickyData(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.views.StickyNonStickyNotification stickyNonStickyNotification, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel viewModel, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon couponModel, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifeCycleOwner) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setTermsAndCondition"})
    public static final void setTermsAndCondition(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.views.TextView view, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon.TermsAndCondition> list) {
    }
}