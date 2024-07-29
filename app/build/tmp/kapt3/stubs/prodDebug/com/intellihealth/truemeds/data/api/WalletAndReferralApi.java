package com.intellihealth.truemeds.data.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ2\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u000eJJ\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0013JB\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0018\u00a8\u0006\u0019"}, d2 = {"Lcom/intellihealth/truemeds/data/api/WalletAndReferralApi;", "", "getReferralStatus", "Lretrofit2/Response;", "Lcom/intellihealth/truemeds/data/model/walletandreferral/ReferralStatusResponse;", "contentType", "", "authorization", "customerId", "isNotified", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWallet", "Lcom/intellihealth/truemeds/data/model/walletandreferral/WalletInfoResponse;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWalletInfo", "Lcom/intellihealth/truemeds/data/model/walletandreferral/WalletTransactionInfoResponse;", "formDate", "toDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "redeemReferralCode", "Lcom/intellihealth/truemeds/data/model/walletandreferral/RedeemResponse;", "mobile", "referCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public abstract interface WalletAndReferralApi {
    
    @retrofit2.http.GET(value = "/CustomerService/v1/getWalletInfo")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getWallet(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String authorization, @retrofit2.http.Query(value = "customerId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.walletandreferral.WalletInfoResponse>> $completion);
    
    @retrofit2.http.POST(value = "/CustomerService/v1/walletTransactionInfo")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getWalletInfo(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String authorization, @retrofit2.http.Query(value = "customerId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @retrofit2.http.Query(value = "fromDate")
    @org.jetbrains.annotations.Nullable()
    java.lang.String formDate, @retrofit2.http.Query(value = "toDate")
    @org.jetbrains.annotations.Nullable()
    java.lang.String toDate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.walletandreferral.WalletTransactionInfoResponse>> $completion);
    
    @retrofit2.http.POST(value = "/CustomerService/v1/redeem")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object redeemReferralCode(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.Nullable()
    java.lang.String contentType, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String authorization, @retrofit2.http.Query(value = "mobile")
    @org.jetbrains.annotations.Nullable()
    java.lang.String mobile, @retrofit2.http.Query(value = "referCode")
    @org.jetbrains.annotations.Nullable()
    java.lang.String referCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.walletandreferral.RedeemResponse>> $completion);
    
    @retrofit2.http.GET(value = "/CustomerService/v1/getReferralStatus")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getReferralStatus(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String authorization, @retrofit2.http.Query(value = "customerId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @retrofit2.http.Query(value = "isNotified")
    boolean isNotified, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.walletandreferral.ReferralStatusResponse>> $completion);
}