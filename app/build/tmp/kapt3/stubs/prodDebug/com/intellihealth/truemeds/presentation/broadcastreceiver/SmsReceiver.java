package com.intellihealth.truemeds.presentation.broadcastreceiver;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/intellihealth/truemeds/presentation/broadcastreceiver/SmsReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "app_prodDebug"})
public final class SmsReceiver extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.Nullable()
    private static com.intellihealth.truemeds.presentation.callbacks.SmsListener mListener;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SMS_RETRIEVED_ACTION = "com.google.android.gms.auth.api.phone.SMS_RETRIEVED";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SMS_RETRIEVE_STATUS = "com.google.android.gms.auth.api.phone.EXTRA_STATUS";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SMS_RETRIEVED_MESSAGE = "com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE";
    @org.jetbrains.annotations.NotNull()
    public static final com.intellihealth.truemeds.presentation.broadcastreceiver.SmsReceiver.Companion Companion = null;
    
    public SmsReceiver() {
        super();
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/intellihealth/truemeds/presentation/broadcastreceiver/SmsReceiver$Companion;", "", "()V", "SMS_RETRIEVED_ACTION", "", "SMS_RETRIEVED_MESSAGE", "SMS_RETRIEVE_STATUS", "mListener", "Lcom/intellihealth/truemeds/presentation/callbacks/SmsListener;", "setListener", "", "listener", "app_prodDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void setListener(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.presentation.callbacks.SmsListener listener) {
        }
    }
}