package com.intellihealth.truemeds.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J:\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/VideoRepositoryImpl;", "Lcom/intellihealth/truemeds/domain/repository/VideoFaqRepository;", "videoFaqRemoteDataSource", "Lcom/intellihealth/truemeds/data/repository/datasource/remote/VideoFaqRemoteDataSource;", "apiCallInitClass", "Lcom/intellihealth/truemeds/data/utils/ApiCallInitClass;", "(Lcom/intellihealth/truemeds/data/repository/datasource/remote/VideoFaqRemoteDataSource;Lcom/intellihealth/truemeds/data/utils/ApiCallInitClass;)V", "getVideos", "Lcom/intellihealth/truemeds/data/utils/Resource;", "Lretrofit2/Response;", "Lcom/intellihealth/truemeds/data/model/home/VideoFaqAllResponse;", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "page", "", "limit", "source", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_stageAndroidDebug"})
public final class VideoRepositoryImpl implements com.intellihealth.truemeds.domain.repository.VideoFaqRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.data.repository.datasource.remote.VideoFaqRemoteDataSource videoFaqRemoteDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.data.utils.ApiCallInitClass apiCallInitClass = null;
    
    @javax.inject.Inject()
    public VideoRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.remote.VideoFaqRemoteDataSource videoFaqRemoteDataSource, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.utils.ApiCallInitClass apiCallInitClass) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getVideos(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String page, @org.jetbrains.annotations.NotNull()
    java.lang.String limit, @org.jetbrains.annotations.NotNull()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse>>> $completion) {
        return null;
    }
}