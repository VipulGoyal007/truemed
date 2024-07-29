package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001RB)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ \u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u001f2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u001fH\u0002J\b\u0010<\u001a\u00020\u001fH\u0016J$\u0010=\u001a\u0016\u0012\u0004\u0012\u00020:\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020:\u0018\u0001`>2\u0006\u0010?\u001a\u00020@H\u0002J\b\u0010A\u001a\u000207H\u0002J\"\u0010B\u001a\u00020\u00112\u000e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170D2\b\u0010?\u001a\u0004\u0018\u00010@H\u0002J\b\u0010E\u001a\u000207H\u0002J\u0018\u0010F\u001a\u0002072\u0006\u0010G\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u001fH\u0016J\u0018\u0010H\u001a\u00020\u00022\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u001fH\u0016J\u001c\u0010L\u001a\u0002072\b\u0010M\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010N\u001a\u00020\u001fH\u0002J,\u0010O\u001a\u0002072\b\u0010M\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010N\u001a\u00020\u001fJ\u0010\u0010P\u001a\u0002072\u0006\u0010Q\u001a\u00020\u0011H\u0007R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u001a\u0010\'\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010/\u001a\u0004\u0018\u000100X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00105\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006S"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/ProductCardStackedAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/intellihealth/truemeds/presentation/adapter/ProductCardStackedAdapter$ItemViewHolder;", "productCardDataModel", "Lcom/intellihealth/truemeds/data/model/home/ProductCardDataModel;", "homeViewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "crSellingClick", "Lcom/intellihealth/truemeds/presentation/fragment/HomeFragment$CrossSellingClick;", "(Lcom/intellihealth/truemeds/data/model/home/ProductCardDataModel;Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;Landroidx/fragment/app/FragmentManager;Lcom/intellihealth/truemeds/presentation/fragment/HomeFragment$CrossSellingClick;)V", "binding", "Lcom/intellihealth/truemeds/databinding/AdapterProductCardStackedItemBinding;", "getHomeViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;", "isApiDataEmpty", "", "()Z", "setApiDataEmpty", "(Z)V", "limitedOfferList", "Ljava/util/ArrayList;", "Lcom/intellihealth/salt/models/ProductInfoModel;", "getLimitedOfferList", "()Ljava/util/ArrayList;", "setLimitedOfferList", "(Ljava/util/ArrayList;)V", "newArrivalList", "getNewArrivalList", "pageIndex", "", "getPageIndex", "()I", "setPageIndex", "(I)V", "pageIndexStacked", "getPageIndexStacked", "setPageIndexStacked", "previousListSize", "getPreviousListSize", "setPreviousListSize", "getProductCardDataModel", "()Lcom/intellihealth/truemeds/data/model/home/ProductCardDataModel;", "setProductCardDataModel", "(Lcom/intellihealth/truemeds/data/model/home/ProductCardDataModel;)V", "shimmerState", "trendingSectionCallback", "Lcom/intellihealth/salt/views/section/ProductCardSection$ProductCardSectionCallback;", "getTrendingSectionCallback", "()Lcom/intellihealth/salt/views/section/ProductCardSection$ProductCardSectionCallback;", "setTrendingSectionCallback", "(Lcom/intellihealth/salt/views/section/ProductCardSection$ProductCardSectionCallback;)V", "viewHolder", "alsoUpdateQuantityInMainList", "", "position", "productInfoModel", "Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "qty", "getItemCount", "getItemParentList", "Lkotlin/collections/ArrayList;", "productCode", "", "getScrollPosition", "isContainsInLimitedOffer", "list", "", "manageShimmer", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "responseApi", "pageCount", "setDataAndNotify", "toggleShimmer", "isShimmerVisible", "ItemViewHolder", "app_prodDebug"})
public final class ProductCardStackedAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.intellihealth.truemeds.presentation.adapter.ProductCardStackedAdapter.ItemViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.home.ProductCardDataModel productCardDataModel;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel homeViewModel = null;
    @org.jetbrains.annotations.Nullable()
    private final androidx.fragment.app.FragmentManager fragmentManager = null;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.fragment.HomeFragment.CrossSellingClick crSellingClick;
    private int previousListSize = 0;
    private com.intellihealth.truemeds.databinding.AdapterProductCardStackedItemBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.intellihealth.salt.models.ProductInfoModel> newArrivalList = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.intellihealth.salt.models.ProductInfoModel> limitedOfferList;
    private boolean isApiDataEmpty = false;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.salt.views.section.ProductCardSection.ProductCardSectionCallback trendingSectionCallback;
    private int pageIndex = 0;
    private int pageIndexStacked = 0;
    private boolean shimmerState = false;
    private com.intellihealth.truemeds.presentation.adapter.ProductCardStackedAdapter.ItemViewHolder viewHolder;
    
    public ProductCardStackedAdapter(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.ProductCardDataModel productCardDataModel, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel homeViewModel, @org.jetbrains.annotations.Nullable()
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.fragment.HomeFragment.CrossSellingClick crSellingClick) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.ProductCardDataModel getProductCardDataModel() {
        return null;
    }
    
    public final void setProductCardDataModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.ProductCardDataModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel getHomeViewModel() {
        return null;
    }
    
    public final int getPreviousListSize() {
        return 0;
    }
    
    public final void setPreviousListSize(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.intellihealth.salt.models.ProductInfoModel> getNewArrivalList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.intellihealth.salt.models.ProductInfoModel> getLimitedOfferList() {
        return null;
    }
    
    public final void setLimitedOfferList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.intellihealth.salt.models.ProductInfoModel> p0) {
    }
    
    public final boolean isApiDataEmpty() {
        return false;
    }
    
    public final void setApiDataEmpty(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.salt.views.section.ProductCardSection.ProductCardSectionCallback getTrendingSectionCallback() {
        return null;
    }
    
    public final void setTrendingSectionCallback(@org.jetbrains.annotations.Nullable()
    com.intellihealth.salt.views.section.ProductCardSection.ProductCardSectionCallback p0) {
    }
    
    public final int getPageIndex() {
        return 0;
    }
    
    public final void setPageIndex(int p0) {
    }
    
    public final int getPageIndexStacked() {
        return 0;
    }
    
    public final void setPageIndexStacked(int p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.intellihealth.truemeds.presentation.adapter.ProductCardStackedAdapter.ItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.adapter.ProductCardStackedAdapter.ItemViewHolder holder, int position) {
    }
    
    private final java.util.ArrayList<com.intellihealth.truemeds.presentation.model.ProductInfoModel> getItemParentList(java.lang.String productCode) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setDataAndNotify(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.ProductCardDataModel responseApi, boolean isApiDataEmpty, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.fragment.HomeFragment.CrossSellingClick crSellingClick, int pageCount) {
    }
    
    private final void setData(com.intellihealth.truemeds.data.model.home.ProductCardDataModel responseApi, int pageCount) {
    }
    
    private final void alsoUpdateQuantityInMainList(int position, com.intellihealth.truemeds.presentation.model.ProductInfoModel productInfoModel, int qty) {
    }
    
    private final boolean isContainsInLimitedOffer(java.util.List<com.intellihealth.salt.models.ProductInfoModel> list, java.lang.String productCode) {
        return false;
    }
    
    private final void getScrollPosition() {
    }
    
    @androidx.annotation.MainThread()
    public final void toggleShimmer(boolean isShimmerVisible) {
    }
    
    private final void manageShimmer() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/ProductCardStackedAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/AdapterProductCardStackedItemBinding;", "(Lcom/intellihealth/truemeds/databinding/AdapterProductCardStackedItemBinding;)V", "getBinding", "()Lcom/intellihealth/truemeds/databinding/AdapterProductCardStackedItemBinding;", "app_prodDebug"})
    public static final class ItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.intellihealth.truemeds.databinding.AdapterProductCardStackedItemBinding binding = null;
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.AdapterProductCardStackedItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.databinding.AdapterProductCardStackedItemBinding getBinding() {
            return null;
        }
    }
}