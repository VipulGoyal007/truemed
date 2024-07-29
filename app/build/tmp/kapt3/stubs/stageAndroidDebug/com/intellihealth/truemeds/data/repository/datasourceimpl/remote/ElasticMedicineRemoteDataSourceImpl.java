package com.intellihealth.truemeds.data.repository.datasourceimpl.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010\fJF\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010\u0015JV\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@\u00a2\u0006\u0002\u0010\u001dJh\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\b2\b\u0010 \u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010!\u001a\u0004\u0018\u00010\u00192\b\u0010\"\u001a\u0004\u0018\u00010\u00192\b\u0010#\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050%H\u0096@\u00a2\u0006\u0002\u0010&J<\u0010\'\u001a\b\u0012\u0004\u0012\u00020(0\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010 \u001a\u0004\u0018\u00010\u00052\b\u0010!\u001a\u0004\u0018\u00010\u00192\b\u0010\"\u001a\u0004\u0018\u00010\u0019H\u0096@\u00a2\u0006\u0002\u0010)R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasourceimpl/remote/ElasticMedicineRemoteDataSourceImpl;", "Lcom/intellihealth/truemeds/data/repository/datasource/remote/ElasticMedicineRemoteDataSource;", "productListAndDetailsApi", "Lcom/intellihealth/truemeds/data/api/ProductListAndDetailsApi;", "contentType", "", "(Lcom/intellihealth/truemeds/data/api/ProductListAndDetailsApi;Ljava/lang/String;)V", "fetchMedicineDetails", "Lretrofit2/Response;", "Lcom/intellihealth/truemeds/presentation/model/MedicineDetailsResultResponse;", "productCd", "warehouseId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchReactiveSuggestions", "Lcom/intellihealth/truemeds/data/model/search/SearchSuggestionResponse;", "customerId", "elasticSearchType", "searchString", "isMultiSearch", "", "searchVariant", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchSearchResults", "Lcom/intellihealth/truemeds/presentation/model/SearchResultResponse;", "sizeCount", "", "page", "variantId", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Long;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCrossSellingRecommendedProducts", "Lcom/intellihealth/truemeds/data/model/productlistanddetails/CrossSellingRecommendedProductResponse;", "sessionToken", "pageNumber", "pageSize", "type", "subType", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrendingSearches", "Lcom/intellihealth/truemeds/data/model/search/TrendingSearchResponse;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_stageAndroidDebug"})
public final class ElasticMedicineRemoteDataSourceImpl implements com.intellihealth.truemeds.data.repository.datasource.remote.ElasticMedicineRemoteDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.data.api.ProductListAndDetailsApi productListAndDetailsApi = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String contentType = null;
    
    @javax.inject.Inject()
    public ElasticMedicineRemoteDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.api.ProductListAndDetailsApi productListAndDetailsApi, @javax.inject.Named(value = "content_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchReactiveSuggestions(@org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String warehouseId, @org.jetbrains.annotations.NotNull()
    java.lang.String elasticSearchType, @org.jetbrains.annotations.NotNull()
    java.lang.String searchString, boolean isMultiSearch, @org.jetbrains.annotations.NotNull()
    java.lang.String searchVariant, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.search.SearchSuggestionResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchSearchResults(@org.jetbrains.annotations.NotNull()
    java.lang.String warehouseId, @org.jetbrains.annotations.NotNull()
    java.lang.String elasticSearchType, @org.jetbrains.annotations.NotNull()
    java.lang.String searchString, int sizeCount, int page, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.NotNull()
    java.lang.String searchVariant, boolean isMultiSearch, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.presentation.model.SearchResultResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getTrendingSearches(@org.jetbrains.annotations.Nullable()
    java.lang.String warehouseId, @org.jetbrains.annotations.Nullable()
    java.lang.String sessionToken, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.search.TrendingSearchResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchMedicineDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String productCd, @org.jetbrains.annotations.NotNull()
    java.lang.String warehouseId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.presentation.model.MedicineDetailsResultResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCrossSellingRecommendedProducts(@org.jetbrains.annotations.Nullable()
    java.lang.String sessionToken, @org.jetbrains.annotations.Nullable()
    java.lang.String warehouseId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageSize, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String productCd, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> subType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse>> $completion) {
        return null;
    }
}