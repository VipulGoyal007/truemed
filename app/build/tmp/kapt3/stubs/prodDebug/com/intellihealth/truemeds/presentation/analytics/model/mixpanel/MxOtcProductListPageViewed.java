package com.intellihealth.truemeds.presentation.analytics.model.mixpanel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u00a2\u0006\u0002\u0010\rJ\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\bH\u00c6\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nH\u00c6\u0003J\t\u0010)\u001a\u00020\bH\u00c6\u0003J\t\u0010*\u001a\u00020\bH\u00c6\u0003Ji\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\bH\u00c6\u0001J\u0013\u0010,\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020/H\u00d6\u0001J\t\u00100\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001e\u0010\f\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000f\"\u0004\b\u001e\u0010\u0011R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0017\"\u0004\b \u0010\u0019R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019\u00a8\u00061"}, d2 = {"Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxOtcProductListPageViewed;", "", "superCategoryName", "", "categoryName", "subCategoryName", "clickedOnPage", "filterApplied", "", "brandsSelected", "", "bannerViewed", "isEmpty", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;ZZ)V", "getBannerViewed", "()Z", "setBannerViewed", "(Z)V", "getBrandsSelected", "()Ljava/util/List;", "setBrandsSelected", "(Ljava/util/List;)V", "getCategoryName", "()Ljava/lang/String;", "setCategoryName", "(Ljava/lang/String;)V", "getClickedOnPage", "setClickedOnPage", "getFilterApplied", "setFilterApplied", "setEmpty", "getSubCategoryName", "setSubCategoryName", "getSuperCategoryName", "setSuperCategoryName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "app_prodDebug"})
@androidx.annotation.Keep()
public final class MxOtcProductListPageViewed {
    @com.google.gson.annotations.SerializedName(value = "super_category_name")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String superCategoryName;
    @com.google.gson.annotations.SerializedName(value = "category_name")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String categoryName;
    @com.google.gson.annotations.SerializedName(value = "sub_category_name")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String subCategoryName;
    @com.google.gson.annotations.SerializedName(value = "clicked_on_page")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String clickedOnPage;
    @com.google.gson.annotations.SerializedName(value = "filter_applied")
    private boolean filterApplied;
    @com.google.gson.annotations.SerializedName(value = "brands_selected")
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> brandsSelected;
    @com.google.gson.annotations.SerializedName(value = "banner_viewed")
    private boolean bannerViewed;
    @com.google.gson.annotations.SerializedName(value = "is_empty")
    private boolean isEmpty;
    
    public MxOtcProductListPageViewed(@org.jetbrains.annotations.Nullable()
    java.lang.String superCategoryName, @org.jetbrains.annotations.Nullable()
    java.lang.String categoryName, @org.jetbrains.annotations.Nullable()
    java.lang.String subCategoryName, @org.jetbrains.annotations.Nullable()
    java.lang.String clickedOnPage, boolean filterApplied, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> brandsSelected, boolean bannerViewed, boolean isEmpty) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSuperCategoryName() {
        return null;
    }
    
    public final void setSuperCategoryName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCategoryName() {
        return null;
    }
    
    public final void setCategoryName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubCategoryName() {
        return null;
    }
    
    public final void setSubCategoryName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getClickedOnPage() {
        return null;
    }
    
    public final void setClickedOnPage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getFilterApplied() {
        return false;
    }
    
    public final void setFilterApplied(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getBrandsSelected() {
        return null;
    }
    
    public final void setBrandsSelected(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    public final boolean getBannerViewed() {
        return false;
    }
    
    public final void setBannerViewed(boolean p0) {
    }
    
    public final boolean isEmpty() {
        return false;
    }
    
    public final void setEmpty(boolean p0) {
    }
    
    public MxOtcProductListPageViewed() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component6() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean component8() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxOtcProductListPageViewed copy(@org.jetbrains.annotations.Nullable()
    java.lang.String superCategoryName, @org.jetbrains.annotations.Nullable()
    java.lang.String categoryName, @org.jetbrains.annotations.Nullable()
    java.lang.String subCategoryName, @org.jetbrains.annotations.Nullable()
    java.lang.String clickedOnPage, boolean filterApplied, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> brandsSelected, boolean bannerViewed, boolean isEmpty) {
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