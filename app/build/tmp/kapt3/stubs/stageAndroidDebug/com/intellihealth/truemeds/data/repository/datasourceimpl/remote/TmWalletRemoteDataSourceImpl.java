package com.intellihealth.truemeds.data.repository.datasourceimpl.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00a2\u0006\u0002\u0010\rJ\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\n\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010\u0010J0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0096@\u00a2\u0006\u0002\u0010\u0015J(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0096@\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasourceimpl/remote/TmWalletRemoteDataSourceImpl;", "Lcom/intellihealth/truemeds/data/repository/datasource/remote/TmWalletRemoteDataSource;", "walletAndReferralApi", "Lcom/intellihealth/truemeds/data/api/WalletAndReferralApi;", "contentType", "", "(Lcom/intellihealth/truemeds/data/api/WalletAndReferralApi;Ljava/lang/String;)V", "getReferralStatus", "Lretrofit2/Response;", "Lcom/intellihealth/truemeds/data/model/walletandreferral/ReferralStatusResponse;", "customerId", "isNotified", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWallet", "Lcom/intellihealth/truemeds/data/model/walletandreferral/WalletInfoResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWalletInfo", "Lcom/intellihealth/truemeds/data/model/walletandreferral/WalletTransactionInfoResponse;", "formDate", "toDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "redeemReferralCode", "Lcom/intellihealth/truemeds/data/model/walletandreferral/RedeemResponse;", "mobile", "referCode", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_stageAndroidDebug"})
public final class TmWalletRemoteDataSourceImpl implements com.intellihealth.truemeds.data.repository.datasource.remote.TmWalletRemoteDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.data.api.WalletAndReferralApi walletAndReferralApi = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String contentType = null;
    
    @javax.inject.Inject()
    public TmWalletRemoteDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.api.WalletAndReferralApi walletAndReferralApi, @javax.inject.Named(value = "content_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getWallet(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.walletandreferral.WalletInfoResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getWalletInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.Nullable()
    java.lang.String formDate, @org.jetbrains.annotations.Nullable()
    java.lang.String toDate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.walletandreferral.WalletTransactionInfoResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object redeemReferralCode(@org.jetbrains.annotations.Nullable()
    java.lang.String mobile, @org.jetbrains.annotations.Nullable()
    java.lang.String referCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.walletandreferral.RedeemResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getReferralStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, boolean isNotified, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.walletandreferral.ReferralStatusResponse>> $completion) {
        return null;
    }
}