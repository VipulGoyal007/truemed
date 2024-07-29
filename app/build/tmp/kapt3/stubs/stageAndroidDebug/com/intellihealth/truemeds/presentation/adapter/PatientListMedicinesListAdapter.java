package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\'\u001a\u00020\u0014H\u0016J\b\u0010(\u001a\u00020)H\u0002J\u0018\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0014H\u0016J\u0018\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0014H\u0016J\u000e\u00101\u001a\u00020)2\u0006\u00102\u001a\u00020\u0004R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0010R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u00064"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/PatientListMedicinesListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/intellihealth/truemeds/presentation/adapter/PatientListMedicinesListAdapter$ItemViewHolder;", "productCardDataModel", "Lcom/intellihealth/truemeds/data/model/home/PatientAndMedicineListModel;", "homeViewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Lcom/intellihealth/truemeds/data/model/home/PatientAndMedicineListModel;Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;Landroidx/fragment/app/FragmentManager;)V", "binding", "Lcom/intellihealth/truemeds/databinding/AdapterPatientMedicinesChipsItemBinding;", "chipList", "Ljava/util/ArrayList;", "Lcom/intellihealth/salt/models/ProductCardSectionChipModel;", "getChipList", "()Ljava/util/ArrayList;", "getHomeViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;", "pageIndex", "", "getPageIndex", "()I", "setPageIndex", "(I)V", "previousListSize", "getProductCardDataModel", "()Lcom/intellihealth/truemeds/data/model/home/PatientAndMedicineListModel;", "setProductCardDataModel", "(Lcom/intellihealth/truemeds/data/model/home/PatientAndMedicineListModel;)V", "productList", "Lcom/intellihealth/salt/models/ProductInfoModel;", "getProductList", "sectionCallback", "Lcom/intellihealth/salt/views/section/ProductCardSection$ProductCardSectionCallback;", "getSectionCallback", "()Lcom/intellihealth/salt/views/section/ProductCardSection$ProductCardSectionCallback;", "setSectionCallback", "(Lcom/intellihealth/salt/views/section/ProductCardSection$ProductCardSectionCallback;)V", "getItemCount", "getScrollPosition", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "responseApi", "ItemViewHolder", "app_stageAndroidDebug"})
public final class PatientListMedicinesListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.intellihealth.truemeds.presentation.adapter.PatientListMedicinesListAdapter.ItemViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.home.PatientAndMedicineListModel productCardDataModel;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel homeViewModel = null;
    @org.jetbrains.annotations.Nullable()
    private final androidx.fragment.app.FragmentManager fragmentManager = null;
    private int previousListSize = 0;
    private int pageIndex = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.intellihealth.salt.models.ProductCardSectionChipModel> chipList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.intellihealth.salt.models.ProductInfoModel> productList = null;
    private com.intellihealth.truemeds.databinding.AdapterPatientMedicinesChipsItemBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.salt.views.section.ProductCardSection.ProductCardSectionCallback sectionCallback;
    
    public PatientListMedicinesListAdapter(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.PatientAndMedicineListModel productCardDataModel, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel homeViewModel, @org.jetbrains.annotations.Nullable()
    androidx.fragment.app.FragmentManager fragmentManager) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.PatientAndMedicineListModel getProductCardDataModel() {
        return null;
    }
    
    public final void setProductCardDataModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.PatientAndMedicineListModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel getHomeViewModel() {
        return null;
    }
    
    public final int getPageIndex() {
        return 0;
    }
    
    public final void setPageIndex(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.intellihealth.salt.models.ProductCardSectionChipModel> getChipList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.intellihealth.salt.models.ProductInfoModel> getProductList() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.salt.views.section.ProductCardSection.ProductCardSectionCallback getSectionCallback() {
        return null;
    }
    
    public final void setSectionCallback(@org.jetbrains.annotations.Nullable()
    com.intellihealth.salt.views.section.ProductCardSection.ProductCardSectionCallback p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.intellihealth.truemeds.presentation.adapter.PatientListMedicinesListAdapter.ItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.adapter.PatientListMedicinesListAdapter.ItemViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.home.PatientAndMedicineListModel responseApi) {
    }
    
    private final void getScrollPosition() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/PatientListMedicinesListAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/AdapterPatientMedicinesChipsItemBinding;", "(Lcom/intellihealth/truemeds/databinding/AdapterPatientMedicinesChipsItemBinding;)V", "getBinding", "()Lcom/intellihealth/truemeds/databinding/AdapterPatientMedicinesChipsItemBinding;", "bind", "", "list", "Lcom/intellihealth/salt/models/ProductCardSectionModel;", "setCallbacks", "trendingSectionPatientMedicinesCallback", "Lcom/intellihealth/salt/views/section/ProductCardSection$ProductCardSectionCallback;", "setMaxPageSize", "recordCount", "", "app_stageAndroidDebug"})
    public static final class ItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.intellihealth.truemeds.databinding.AdapterPatientMedicinesChipsItemBinding binding = null;
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.AdapterPatientMedicinesChipsItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.databinding.AdapterPatientMedicinesChipsItemBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.intellihealth.salt.models.ProductCardSectionModel list) {
        }
        
        public final void setCallbacks(@org.jetbrains.annotations.NotNull()
        com.intellihealth.salt.views.section.ProductCardSection.ProductCardSectionCallback trendingSectionPatientMedicinesCallback) {
        }
        
        public final void setMaxPageSize(int recordCount) {
        }
    }
}