package com.intellihealth.truemeds.data.repository.datasource.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasource/remote/VideoFaqRemoteDataSource;", "", "getVideos", "Lretrofit2/Response;", "Lcom/intellihealth/truemeds/data/model/home/VideoFaqAllResponse;", "page", "", "limit", "source", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public abstract interface VideoFaqRemoteDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getVideos(@org.jetbrains.annotations.NotNull()
    java.lang.String page, @org.jetbrains.annotations.NotNull()
    java.lang.String limit, @org.jetbrains.annotations.NotNull()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse>> $completion);
}