package com.intellihealth.truemeds.data.model.search;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u00a2\u0006\u0002\u0010\rJ\u0010\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u00c6\u0003JP\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\'J\u0013\u0010(\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020\u0003H\u00d6\u0001J\t\u0010+\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u0006,"}, d2 = {"Lcom/intellihealth/truemeds/data/model/search/SuggestionResponseData;", "", "timeTaken", "", "searchType", "", "didYouMeanTriggered", "", "suggestionWithType", "", "Lcom/intellihealth/truemeds/data/model/search/SuggestionWithType;", "productList", "Lcom/intellihealth/truemeds/data/model/search/ProductList;", "(Ljava/lang/Integer;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V", "getDidYouMeanTriggered", "()Z", "setDidYouMeanTriggered", "(Z)V", "getProductList", "()Ljava/util/List;", "setProductList", "(Ljava/util/List;)V", "getSearchType", "()Ljava/lang/String;", "setSearchType", "(Ljava/lang/String;)V", "getSuggestionWithType", "setSuggestionWithType", "getTimeTaken", "()Ljava/lang/Integer;", "setTimeTaken", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)Lcom/intellihealth/truemeds/data/model/search/SuggestionResponseData;", "equals", "other", "hashCode", "toString", "app_prodDebug"})
public final class SuggestionResponseData {
    @com.google.gson.annotations.SerializedName(value = "timeTaken")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer timeTaken;
    @com.google.gson.annotations.SerializedName(value = "searchType")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String searchType;
    @com.google.gson.annotations.SerializedName(value = "didYouMean")
    private boolean didYouMeanTriggered;
    @com.google.gson.annotations.SerializedName(value = "suggestionWithType")
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.search.SuggestionWithType> suggestionWithType;
    @com.google.gson.annotations.SerializedName(value = "productList")
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.search.ProductList> productList;
    
    public SuggestionResponseData(@org.jetbrains.annotations.Nullable()
    java.lang.Integer timeTaken, @org.jetbrains.annotations.Nullable()
    java.lang.String searchType, boolean didYouMeanTriggered, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.search.SuggestionWithType> suggestionWithType, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.search.ProductList> productList) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTimeTaken() {
        return null;
    }
    
    public final void setTimeTaken(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSearchType() {
        return null;
    }
    
    public final void setSearchType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getDidYouMeanTriggered() {
        return false;
    }
    
    public final void setDidYouMeanTriggered(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.search.SuggestionWithType> getSuggestionWithType() {
        return null;
    }
    
    public final void setSuggestionWithType(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.search.SuggestionWithType> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.search.ProductList> getProductList() {
        return null;
    }
    
    public final void setProductList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.search.ProductList> p0) {
    }
    
    public SuggestionResponseData() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.search.SuggestionWithType> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.search.ProductList> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.search.SuggestionResponseData copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer timeTaken, @org.jetbrains.annotations.Nullable()
    java.lang.String searchType, boolean didYouMeanTriggered, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.search.SuggestionWithType> suggestionWithType, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.search.ProductList> productList) {
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