package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\b\u0010!\u001a\u00020\u000eH\u0016J\u0010\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u000eH\u0016J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020%H\u0002J\u001a\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00022\b\b\u0001\u0010#\u001a\u00020\u000eH\u0016J\u0018\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u000eH\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000e0\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006."}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/CartAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/intellihealth/truemeds/presentation/adapter/CartViewHolder;", "list", "", "Lcom/intellihealth/truemeds/presentation/model/CartMedicineModel;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/CartViewModel;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Ljava/util/List;Lcom/intellihealth/truemeds/presentation/viewmodel/CartViewModel;Landroidx/fragment/app/FragmentManager;)V", "MIN_DELAY_MS", "", "coolDownSeconds", "", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "lastClickTime", "mLastClickSuggestionTime", "mLastClickTime", "previousMap", "Ljava/util/HashMap;", "", "viewmodel", "getViewmodel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/CartViewModel;", "setViewmodel", "(Lcom/intellihealth/truemeds/presentation/viewmodel/CartViewModel;)V", "getItemCount", "getItemId", "position", "isSingleClick", "", "isSuggestionSingleClick", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_stageAndroidDebug"})
public final class CartAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.intellihealth.truemeds.presentation.adapter.CartViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private final androidx.fragment.app.FragmentManager fragmentManager = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.presentation.model.CartMedicineModel> items;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.viewmodel.CartViewModel viewmodel;
    @org.jetbrains.annotations.NotNull()
    private java.util.HashMap<java.lang.String, java.lang.Integer> previousMap;
    private long lastClickTime = 0L;
    private final int coolDownSeconds = 4;
    private long mLastClickTime = 0L;
    private long mLastClickSuggestionTime = 0L;
    private final long MIN_DELAY_MS = 1000L;
    
    public CartAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.presentation.model.CartMedicineModel> list, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.CartViewModel viewModel, @org.jetbrains.annotations.Nullable()
    androidx.fragment.app.FragmentManager fragmentManager) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.fragment.app.FragmentManager getFragmentManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.presentation.model.CartMedicineModel> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.presentation.model.CartMedicineModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.viewmodel.CartViewModel getViewmodel() {
        return null;
    }
    
    public final void setViewmodel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.CartViewModel p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.intellihealth.truemeds.presentation.adapter.CartViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.adapter.CartViewHolder holder, @android.annotation.SuppressLint(value = {"RecyclerView"})
    int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    private final boolean isSingleClick() {
        return false;
    }
    
    private final boolean isSuggestionSingleClick() {
        return false;
    }
}