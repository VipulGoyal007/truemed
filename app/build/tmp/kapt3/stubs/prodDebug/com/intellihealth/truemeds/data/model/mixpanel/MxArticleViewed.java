package com.intellihealth.truemeds.data.model.mixpanel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\t\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001d\u0010&\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\tH\u00c6\u0003J\u001d\u0010\'\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\tH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u008d\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\t2\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020/H\u00d6\u0001J\t\u00100\u001a\u00020\u0003H\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R2\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR2\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011\u00a8\u00061"}, d2 = {"Lcom/intellihealth/truemeds/data/model/mixpanel/MxArticleViewed;", "", "articleAuthor", "", "articleDate", "articleId", "articleTitle", "categories", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "categoryIds", "clickedOnPage", "whId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V", "getArticleAuthor", "()Ljava/lang/String;", "setArticleAuthor", "(Ljava/lang/String;)V", "getArticleDate", "setArticleDate", "getArticleId", "setArticleId", "getArticleTitle", "setArticleTitle", "getCategories", "()Ljava/util/ArrayList;", "setCategories", "(Ljava/util/ArrayList;)V", "getCategoryIds", "setCategoryIds", "getClickedOnPage", "setClickedOnPage", "getWhId", "setWhId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodDebug"})
public final class MxArticleViewed {
    @com.google.gson.annotations.SerializedName(value = "article_author")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String articleAuthor;
    @com.google.gson.annotations.SerializedName(value = "article_date")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String articleDate;
    @com.google.gson.annotations.SerializedName(value = "article_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String articleId;
    @com.google.gson.annotations.SerializedName(value = "article_title")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String articleTitle;
    @com.google.gson.annotations.SerializedName(value = "categories")
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<java.lang.String> categories;
    @com.google.gson.annotations.SerializedName(value = "category_ids")
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<java.lang.String> categoryIds;
    @com.google.gson.annotations.SerializedName(value = "clicked_on_page")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String clickedOnPage;
    @com.google.gson.annotations.SerializedName(value = "wh_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String whId;
    
    public MxArticleViewed(@org.jetbrains.annotations.Nullable()
    java.lang.String articleAuthor, @org.jetbrains.annotations.Nullable()
    java.lang.String articleDate, @org.jetbrains.annotations.Nullable()
    java.lang.String articleId, @org.jetbrains.annotations.Nullable()
    java.lang.String articleTitle, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> categories, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> categoryIds, @org.jetbrains.annotations.Nullable()
    java.lang.String clickedOnPage, @org.jetbrains.annotations.Nullable()
    java.lang.String whId) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getArticleAuthor() {
        return null;
    }
    
    public final void setArticleAuthor(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getArticleDate() {
        return null;
    }
    
    public final void setArticleDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getArticleId() {
        return null;
    }
    
    public final void setArticleId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getArticleTitle() {
        return null;
    }
    
    public final void setArticleTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> getCategories() {
        return null;
    }
    
    public final void setCategories(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> getCategoryIds() {
        return null;
    }
    
    public final void setCategoryIds(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getClickedOnPage() {
        return null;
    }
    
    public final void setClickedOnPage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWhId() {
        return null;
    }
    
    public final void setWhId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public MxArticleViewed() {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.mixpanel.MxArticleViewed copy(@org.jetbrains.annotations.Nullable()
    java.lang.String articleAuthor, @org.jetbrains.annotations.Nullable()
    java.lang.String articleDate, @org.jetbrains.annotations.Nullable()
    java.lang.String articleId, @org.jetbrains.annotations.Nullable()
    java.lang.String articleTitle, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> categories, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> categoryIds, @org.jetbrains.annotations.Nullable()
    java.lang.String clickedOnPage, @org.jetbrains.annotations.Nullable()
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