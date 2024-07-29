package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001BK\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012.\u0010\u0005\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006j\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003`\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001a\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J4\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0016J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J,\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010 \u001a\u00020\u0016H\u0016J\u0018\u0010!\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R:\u0010\u000b\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0006j\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u0001`\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/ExpandableListAdapter;", "Landroid/widget/BaseExpandableListAdapter;", "listDataHeader", "", "", "listDataChildMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/PaymentOptionsViewModel;", "(Ljava/util/List;Ljava/util/HashMap;Lcom/intellihealth/truemeds/presentation/viewmodel/PaymentOptionsViewModel;)V", "listDataChild", "getChild", "", "groupPosition", "", "childPosition", "getChildId", "", "getChildView", "Landroid/view/View;", "isLastChild", "", "convertView", "parent", "Landroid/view/ViewGroup;", "getChildrenCount", "getGroup", "getGroupCount", "getGroupId", "getGroupView", "isExpanded", "hasStableIds", "isChildSelectable", "app_prodDebug"})
public final class ExpandableListAdapter extends android.widget.BaseExpandableListAdapter {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> listDataHeader;
    @org.jetbrains.annotations.Nullable()
    private java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> listDataChild;
    private com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel viewModel;
    
    public ExpandableListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> listDataHeader, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> listDataChildMap, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel viewModel) {
        super();
    }
    
    @java.lang.Override()
    public int getGroupCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getChildrenCount(int groupPosition) {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getGroup(int groupPosition) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getChild(int groupPosition, int childPosition) {
        return null;
    }
    
    @java.lang.Override()
    public long getGroupId(int groupPosition) {
        return 0L;
    }
    
    @java.lang.Override()
    public long getChildId(int groupPosition, int childPosition) {
        return 0L;
    }
    
    @java.lang.Override()
    public boolean hasStableIds() {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View getGroupView(int groupPosition, boolean isExpanded, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View getChildView(int groupPosition, int childPosition, boolean isLastChild, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}