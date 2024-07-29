package com.intellihealth.truemeds.data.repository.datasource.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\fJ0\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u00a6@\u00a2\u0006\u0002\u0010\u0011J(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u00a6@\u00a2\u0006\u0002\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasource/remote/TmWalletRemoteDataSource;", "", "getReferralStatus", "Lretrofit2/Response;", "Lcom/intellihealth/truemeds/data/model/walletandreferral/ReferralStatusResponse;", "customerId", "", "isNotified", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWallet", "Lcom/intellihealth/truemeds/data/model/walletandreferral/WalletInfoResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWalletInfo", "Lcom/intellihealth/truemeds/data/model/walletandreferral/WalletTransactionInfoResponse;", "formDate", "toDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "redeemReferralCode", "Lcom/intellihealth/truemeds/data/model/walletandreferral/RedeemResponse;", "mobile", "referCode", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public abstract interface TmWalletRemoteDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getWallet(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.walletandreferral.WalletInfoResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getWalletInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.Nullable()
    java.lang.String formDate, @org.jetbrains.annotations.Nullable()
    java.lang.String toDate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.walletandreferral.WalletTransactionInfoResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object redeemReferralCode(@org.jetbrains.annotations.Nullable()
    java.lang.String mobile, @org.jetbrains.annotations.Nullable()
    java.lang.String referCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.walletandreferral.RedeemResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getReferralStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, boolean isNotified, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.walletandreferral.ReferralStatusResponse>> $completion);
}