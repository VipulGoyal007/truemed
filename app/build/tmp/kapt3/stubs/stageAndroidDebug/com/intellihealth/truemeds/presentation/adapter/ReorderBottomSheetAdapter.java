package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0013\u0014\u0015\u0016\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/ReorderBottomSheetAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "data", "Lcom/intellihealth/truemeds/data/model/home/HomeReorderBottomSheetModel;", "(Landroid/content/Context;Lcom/intellihealth/truemeds/data/model/home/HomeReorderBottomSheetModel;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "FooterViewHolder", "HeaderViewHolder", "NormalViewHolder", "ViewHolder", "app_stageAndroidDebug"})
public final class ReorderBottomSheetAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.home.HomeReorderBottomSheetModel data;
    private static final int FOOTER_VIEW = 1;
    private static final int HEADER_VIEW = 2;
    @org.jetbrains.annotations.NotNull()
    public static final com.intellihealth.truemeds.presentation.adapter.ReorderBottomSheetAdapter.Companion Companion = null;
    
    public ReorderBottomSheetAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.HomeReorderBottomSheetModel data) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/ReorderBottomSheetAdapter$Companion;", "", "()V", "FOOTER_VIEW", "", "HEADER_VIEW", "app_stageAndroidDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/ReorderBottomSheetAdapter$FooterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/BottomsheetReorderFooterBinding;", "data", "Lcom/intellihealth/truemeds/data/model/home/HomeReorderBottomSheetModel;", "(Lcom/intellihealth/truemeds/databinding/BottomsheetReorderFooterBinding;Lcom/intellihealth/truemeds/data/model/home/HomeReorderBottomSheetModel;)V", "getBinding", "()Lcom/intellihealth/truemeds/databinding/BottomsheetReorderFooterBinding;", "app_stageAndroidDebug"})
    public static final class FooterViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.intellihealth.truemeds.databinding.BottomsheetReorderFooterBinding binding = null;
        
        public FooterViewHolder(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.BottomsheetReorderFooterBinding binding, @org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.data.model.home.HomeReorderBottomSheetModel data) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.databinding.BottomsheetReorderFooterBinding getBinding() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/ReorderBottomSheetAdapter$HeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/BottomsheetReorderHeaderBinding;", "(Lcom/intellihealth/truemeds/databinding/BottomsheetReorderHeaderBinding;)V", "getBinding", "()Lcom/intellihealth/truemeds/databinding/BottomsheetReorderHeaderBinding;", "app_stageAndroidDebug"})
    public static final class HeaderViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.intellihealth.truemeds.databinding.BottomsheetReorderHeaderBinding binding = null;
        
        public HeaderViewHolder(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.BottomsheetReorderHeaderBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.databinding.BottomsheetReorderHeaderBinding getBinding() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/ReorderBottomSheetAdapter$NormalViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/BottomsheetReorderItemBinding;", "data", "Lcom/intellihealth/truemeds/data/model/home/HomeReorderBottomSheetModel;", "(Lcom/intellihealth/truemeds/databinding/BottomsheetReorderItemBinding;Lcom/intellihealth/truemeds/data/model/home/HomeReorderBottomSheetModel;)V", "getBinding", "()Lcom/intellihealth/truemeds/databinding/BottomsheetReorderItemBinding;", "app_stageAndroidDebug"})
    public static final class NormalViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.intellihealth.truemeds.databinding.BottomsheetReorderItemBinding binding = null;
        
        public NormalViewHolder(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.BottomsheetReorderItemBinding binding, @org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.data.model.home.HomeReorderBottomSheetModel data) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.databinding.BottomsheetReorderItemBinding getBinding() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0096\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/ReorderBottomSheetAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/intellihealth/truemeds/presentation/adapter/ReorderBottomSheetAdapter;Landroid/view/View;)V", "bindView", "", "position", "", "app_stageAndroidDebug"})
    public class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public ViewHolder(@org.jetbrains.annotations.Nullable()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bindView(int position) {
        }
    }
}