package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0004R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005\u00a8\u0006\u0018"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/TestimonialSectionDataAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/intellihealth/truemeds/presentation/adapter/TestimonialSectionDataAdapter$ItemViewHolder;", "dataModel", "Lcom/intellihealth/truemeds/data/model/home/TestimonialSectionDataModel;", "(Lcom/intellihealth/truemeds/data/model/home/TestimonialSectionDataModel;)V", "binding", "Lcom/intellihealth/truemeds/databinding/AdapterTestimonialSectionItemBinding;", "getDataModel", "()Lcom/intellihealth/truemeds/data/model/home/TestimonialSectionDataModel;", "setDataModel", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "responseApi", "ItemViewHolder", "app_prodDebug"})
public final class TestimonialSectionDataAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.intellihealth.truemeds.presentation.adapter.TestimonialSectionDataAdapter.ItemViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.home.TestimonialSectionDataModel dataModel;
    private com.intellihealth.truemeds.databinding.AdapterTestimonialSectionItemBinding binding;
    
    public TestimonialSectionDataAdapter(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.TestimonialSectionDataModel dataModel) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.TestimonialSectionDataModel getDataModel() {
        return null;
    }
    
    public final void setDataModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.TestimonialSectionDataModel p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.intellihealth.truemeds.presentation.adapter.TestimonialSectionDataAdapter.ItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.adapter.TestimonialSectionDataAdapter.ItemViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.home.TestimonialSectionDataModel responseApi) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/TestimonialSectionDataAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/AdapterTestimonialSectionItemBinding;", "(Lcom/intellihealth/truemeds/databinding/AdapterTestimonialSectionItemBinding;)V", "getBinding", "()Lcom/intellihealth/truemeds/databinding/AdapterTestimonialSectionItemBinding;", "app_prodDebug"})
    public static final class ItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.intellihealth.truemeds.databinding.AdapterTestimonialSectionItemBinding binding = null;
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.AdapterTestimonialSectionItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.databinding.AdapterTestimonialSectionItemBinding getBinding() {
            return null;
        }
    }
}