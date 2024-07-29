package com.intellihealth.truemeds.presentation.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/intellihealth/truemeds/presentation/utils/LoginUtil;", "", "()V", "processUserLoginDetails", "Lcom/intellihealth/truemeds/domain/enums/LoginStatus;", "context", "Landroid/content/Context;", "it", "Lcom/intellihealth/truemeds/data/model/login/LoginVerificationResponse;", "(Landroid/content/Context;Lcom/intellihealth/truemeds/data/model/login/LoginVerificationResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public final class LoginUtil {
    @org.jetbrains.annotations.NotNull()
    public static final com.intellihealth.truemeds.presentation.utils.LoginUtil INSTANCE = null;
    
    private LoginUtil() {
        super();
    }
    
    /**
     * 1) If isNewCustomer flag is true then trigger SignUpSuccessful event
     * 2) Trigger login successful
     * 3) CleverTap onUserLogin api to update user profile info
     * 4) Set data in shared preference
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object processUserLoginDetails(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.login.LoginVerificationResponse it, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.domain.enums.LoginStatus> $completion) {
        return null;
    }
}