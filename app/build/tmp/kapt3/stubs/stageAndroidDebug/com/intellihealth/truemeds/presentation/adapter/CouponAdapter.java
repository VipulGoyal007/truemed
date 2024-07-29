package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B%\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u0018\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aH\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006&"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/CouponAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/intellihealth/truemeds/presentation/adapter/CouponAdapter$ItemViewHolder;", "couponList", "", "Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse$Coupon;", "couponViewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/CouponViewModel;", "currentCartValue", "", "(Ljava/util/List;Lcom/intellihealth/truemeds/presentation/viewmodel/CouponViewModel;D)V", "binding", "Lcom/intellihealth/truemeds/databinding/AdapterCouponItemBinding;", "getCouponList", "()Ljava/util/List;", "setCouponList", "(Ljava/util/List;)V", "getCouponViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/CouponViewModel;", "setCouponViewModel", "(Lcom/intellihealth/truemeds/presentation/viewmodel/CouponViewModel;)V", "getCurrentCartValue", "()D", "setCurrentCartValue", "(D)V", "getItemCount", "", "getItemId", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ItemViewHolder", "app_stageAndroidDebug"})
public final class CouponAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.intellihealth.truemeds.presentation.adapter.CouponAdapter.ItemViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> couponList;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel couponViewModel;
    private double currentCartValue;
    private com.intellihealth.truemeds.databinding.AdapterCouponItemBinding binding;
    
    public CouponAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> couponList, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel couponViewModel, double currentCartValue) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> getCouponList() {
        return null;
    }
    
    public final void setCouponList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel getCouponViewModel() {
        return null;
    }
    
    public final void setCouponViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel p0) {
    }
    
    public final double getCurrentCartValue() {
        return 0.0;
    }
    
    public final void setCurrentCartValue(double p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.intellihealth.truemeds.presentation.adapter.CouponAdapter.ItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.adapter.CouponAdapter.ItemViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J/\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u001dR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r\u00a8\u0006\u001e"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/CouponAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/AdapterCouponItemBinding;", "(Lcom/intellihealth/truemeds/databinding/AdapterCouponItemBinding;)V", "getBinding", "()Lcom/intellihealth/truemeds/databinding/AdapterCouponItemBinding;", "setBinding", "lastClickApplyBottomSheet", "", "getLastClickApplyBottomSheet", "()J", "setLastClickApplyBottomSheet", "(J)V", "lastClickApplyCTA", "getLastClickApplyCTA", "setLastClickApplyCTA", "lastClickApplyTNC", "getLastClickApplyTNC", "setLastClickApplyTNC", "bindView", "", "item", "Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse$Coupon;", "couponViewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/CouponViewModel;", "currentCartValue", "", "actualExpiryDate", "(Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse$Coupon;Lcom/intellihealth/truemeds/presentation/viewmodel/CouponViewModel;DLjava/lang/Long;)V", "app_stageAndroidDebug"})
    public static final class ItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.intellihealth.truemeds.databinding.AdapterCouponItemBinding binding;
        private long lastClickApplyCTA = 0L;
        private long lastClickApplyBottomSheet = 0L;
        private long lastClickApplyTNC = 0L;
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.AdapterCouponItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.databinding.AdapterCouponItemBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.AdapterCouponItemBinding p0) {
        }
        
        public final long getLastClickApplyCTA() {
            return 0L;
        }
        
        public final void setLastClickApplyCTA(long p0) {
        }
        
        public final long getLastClickApplyBottomSheet() {
            return 0L;
        }
        
        public final void setLastClickApplyBottomSheet(long p0) {
        }
        
        public final long getLastClickApplyTNC() {
            return 0L;
        }
        
        public final void setLastClickApplyTNC(long p0) {
        }
        
        public final void bindView(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon item, @org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel couponViewModel, double currentCartValue, @org.jetbrains.annotations.Nullable()
        java.lang.Long actualExpiryDate) {
        }
    }
}