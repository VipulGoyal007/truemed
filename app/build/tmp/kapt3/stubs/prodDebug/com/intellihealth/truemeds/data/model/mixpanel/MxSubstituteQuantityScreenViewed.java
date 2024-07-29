package com.intellihealth.truemeds.data.model.mixpanel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b-\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b\u0012\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u000fJ\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010-\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010.\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010/\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0013\u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000bH\u00c6\u0003J\u0013\u00101\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000bH\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\fH\u00c6\u0003J|\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b2\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\fH\u00c6\u0001\u00a2\u0006\u0002\u00104J\u0013\u00105\u001a\u00020\u00032\b\u00106\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00107\u001a\u00020\u0005H\u00d6\u0001J\t\u00108\u001a\u00020\fH\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R(\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R \u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*\u00a8\u00069"}, d2 = {"Lcom/intellihealth/truemeds/data/model/mixpanel/MxSubstituteQuantityScreenViewed;", "", "isReplaceAll", "", "replaceAllTotalPossibleSavings", "", "replaceSavings", "", "replaceableItemsCount", "replacedItemsCount", "selectedSubstitutableItemsList", "", "", "selectedSubstituteItemsList", "whId", "(ZLjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "()Z", "setReplaceAll", "(Z)V", "getReplaceAllTotalPossibleSavings", "()Ljava/lang/Integer;", "setReplaceAllTotalPossibleSavings", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getReplaceSavings", "()Ljava/lang/Double;", "setReplaceSavings", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getReplaceableItemsCount", "setReplaceableItemsCount", "getReplacedItemsCount", "setReplacedItemsCount", "getSelectedSubstitutableItemsList", "()Ljava/util/List;", "setSelectedSubstitutableItemsList", "(Ljava/util/List;)V", "getSelectedSubstituteItemsList", "setSelectedSubstituteItemsList", "getWhId", "()Ljava/lang/String;", "setWhId", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ZLjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/intellihealth/truemeds/data/model/mixpanel/MxSubstituteQuantityScreenViewed;", "equals", "other", "hashCode", "toString", "app_prodDebug"})
public final class MxSubstituteQuantityScreenViewed {
    @com.google.gson.annotations.SerializedName(value = "is_replace_all")
    private boolean isReplaceAll;
    @com.google.gson.annotations.SerializedName(value = "replace_all_total_possible_savings")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer replaceAllTotalPossibleSavings;
    @com.google.gson.annotations.SerializedName(value = "replace_savings")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double replaceSavings;
    @com.google.gson.annotations.SerializedName(value = "replaceable_items_count")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer replaceableItemsCount;
    @com.google.gson.annotations.SerializedName(value = "replaced_items_count")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer replacedItemsCount;
    @com.google.gson.annotations.SerializedName(value = "selected_substitutable_items_list")
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> selectedSubstitutableItemsList;
    @com.google.gson.annotations.SerializedName(value = "selected_substitute_items_list")
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> selectedSubstituteItemsList;
    @com.google.gson.annotations.SerializedName(value = "wh_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String whId;
    
    public MxSubstituteQuantityScreenViewed(boolean isReplaceAll, @org.jetbrains.annotations.Nullable()
    java.lang.Integer replaceAllTotalPossibleSavings, @org.jetbrains.annotations.Nullable()
    java.lang.Double replaceSavings, @org.jetbrains.annotations.Nullable()
    java.lang.Integer replaceableItemsCount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer replacedItemsCount, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> selectedSubstitutableItemsList, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> selectedSubstituteItemsList, @org.jetbrains.annotations.Nullable()
    java.lang.String whId) {
        super();
    }
    
    public final boolean isReplaceAll() {
        return false;
    }
    
    public final void setReplaceAll(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getReplaceAllTotalPossibleSavings() {
        return null;
    }
    
    public final void setReplaceAllTotalPossibleSavings(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getReplaceSavings() {
        return null;
    }
    
    public final void setReplaceSavings(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getReplaceableItemsCount() {
        return null;
    }
    
    public final void setReplaceableItemsCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getReplacedItemsCount() {
        return null;
    }
    
    public final void setReplacedItemsCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getSelectedSubstitutableItemsList() {
        return null;
    }
    
    public final void setSelectedSubstitutableItemsList(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getSelectedSubstituteItemsList() {
        return null;
    }
    
    public final void setSelectedSubstituteItemsList(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWhId() {
        return null;
    }
    
    public final void setWhId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public MxSubstituteQuantityScreenViewed() {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.mixpanel.MxSubstituteQuantityScreenViewed copy(boolean isReplaceAll, @org.jetbrains.annotations.Nullable()
    java.lang.Integer replaceAllTotalPossibleSavings, @org.jetbrains.annotations.Nullable()
    java.lang.Double replaceSavings, @org.jetbrains.annotations.Nullable()
    java.lang.Integer replaceableItemsCount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer replacedItemsCount, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> selectedSubstitutableItemsList, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> selectedSubstituteItemsList, @org.jetbrains.annotations.Nullable()
    java.lang.String whId) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}