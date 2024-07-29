package com.intellihealth.truemeds.data.repository.datasource.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\bJF\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\u0011JV\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u00a6@\u00a2\u0006\u0002\u0010\u0019Jh\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\u0010 \u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\"H\u00a6@\u00a2\u0006\u0002\u0010#J<\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u0015H\u00a6@\u00a2\u0006\u0002\u0010&\u00a8\u0006\'"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasource/remote/ElasticMedicineRemoteDataSource;", "", "fetchMedicineDetails", "Lretrofit2/Response;", "Lcom/intellihealth/truemeds/presentation/model/MedicineDetailsResultResponse;", "productCd", "", "warehouseId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchReactiveSuggestions", "Lcom/intellihealth/truemeds/data/model/search/SearchSuggestionResponse;", "customerId", "elasticSearchType", "searchString", "isMultiSearch", "", "searchVariant", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchSearchResults", "Lcom/intellihealth/truemeds/presentation/model/SearchResultResponse;", "sizeCount", "", "page", "variantId", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Long;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCrossSellingRecommendedProducts", "Lcom/intellihealth/truemeds/data/model/productlistanddetails/CrossSellingRecommendedProductResponse;", "sessionToken", "pageNumber", "pageSize", "type", "productCode", "subType", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrendingSearches", "Lcom/intellihealth/truemeds/data/model/search/TrendingSearchResponse;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public abstract interface ElasticMedicineRemoteDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchReactiveSuggestions(@org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String warehouseId, @org.jetbrains.annotations.NotNull()
    java.lang.String elasticSearchType, @org.jetbrains.annotations.NotNull()
    java.lang.String searchString, boolean isMultiSearch, @org.jetbrains.annotations.NotNull()
    java.lang.String searchVariant, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.search.SearchSuggestionResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchSearchResults(@org.jetbrains.annotations.NotNull()
    java.lang.String warehouseId, @org.jetbrains.annotations.NotNull()
    java.lang.String elasticSearchType, @org.jetbrains.annotations.NotNull()
    java.lang.String searchString, int sizeCount, int page, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.NotNull()
    java.lang.String searchVariant, boolean isMultiSearch, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.presentation.model.SearchResultResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchMedicineDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String productCd, @org.jetbrains.annotations.NotNull()
    java.lang.String warehouseId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.presentation.model.MedicineDetailsResultResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCrossSellingRecommendedProducts(@org.jetbrains.annotations.Nullable()
    java.lang.String sessionToken, @org.jetbrains.annotations.Nullable()
    java.lang.String warehouseId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageSize, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String productCode, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> subType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTrendingSearches(@org.jetbrains.annotations.Nullable()
    java.lang.String warehouseId, @org.jetbrains.annotations.Nullable()
    java.lang.String sessionToken, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.search.TrendingSearchResponse>> $completion);
}