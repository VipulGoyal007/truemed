package com.intellihealth.truemeds.presentation.callbacks;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/intellihealth/truemeds/presentation/callbacks/SmsListener;", "", "messageReceived", "", "messageText", "", "onSmsTimeOut", "app_prodDebug"})
public abstract interface SmsListener {
    
    public abstract void messageReceived(@org.jetbrains.annotations.Nullable()
    java.lang.String messageText);
    
    public abstract void onSmsTimeOut();
}