package com.intellihealth.truemeds.data.callback;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/intellihealth/truemeds/data/callback/DeleteCallback;", "", "noClick", "", "yesClick", "app_prodDebug"})
public abstract interface DeleteCallback {
    
    public abstract void yesClick();
    
    public abstract void noClick();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        public static void noClick(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.data.callback.DeleteCallback $this) {
        }
    }
}