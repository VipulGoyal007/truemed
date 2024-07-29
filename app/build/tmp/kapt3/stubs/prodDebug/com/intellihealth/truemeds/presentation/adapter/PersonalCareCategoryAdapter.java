package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u001f\u001a\u00020\u000bH\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000bH\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001eH\u0016J\u0018\u0010&\u001a\u00020$2\u0006\u0010\'\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u000bH\u0016J\u0018\u0010(\u001a\u00020\u00022\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000bH\u0016R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/PersonalCareCategoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/intellihealth/truemeds/presentation/adapter/PersonalCareCategoryViewHolder;", "list", "", "Lcom/intellihealth/truemeds/data/model/home/ChildCategoryModel;", "context", "Landroid/content/Context;", "callback", "Lcom/intellihealth/truemeds/presentation/callbacks/GenericCallback;", "highlightProduct", "", "(Ljava/util/List;Landroid/content/Context;Lcom/intellihealth/truemeds/presentation/callbacks/GenericCallback;I)V", "getCallback", "()Lcom/intellihealth/truemeds/presentation/callbacks/GenericCallback;", "getContext", "()Landroid/content/Context;", "getHighlightProduct", "()I", "setHighlightProduct", "(I)V", "isPositionSet", "", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getList", "view", "Landroidx/recyclerview/widget/RecyclerView;", "getItemCount", "getItemId", "", "position", "onAttachedToRecyclerView", "", "recyclerView", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_prodDebug"})
public final class PersonalCareCategoryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.intellihealth.truemeds.presentation.adapter.PersonalCareCategoryViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel> list = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.callbacks.GenericCallback callback = null;
    private int highlightProduct;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel> items;
    private androidx.recyclerview.widget.RecyclerView view;
    private boolean isPositionSet = true;
    
    public PersonalCareCategoryAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel> list, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.callbacks.GenericCallback callback, int highlightProduct) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel> getList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.callbacks.GenericCallback getCallback() {
        return null;
    }
    
    public final int getHighlightProduct() {
        return 0;
    }
    
    public final void setHighlightProduct(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel> p0) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.intellihealth.truemeds.presentation.adapter.PersonalCareCategoryViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.adapter.PersonalCareCategoryViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onAttachedToRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
}