package com.intellihealth.truemeds.data.callback;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/intellihealth/truemeds/data/callback/ManagePatientListCallback;", "", "itemBoxClicked", "", "pos", "", "title", "", "app_prodDebug"})
public abstract interface ManagePatientListCallback {
    
    public abstract void itemBoxClicked(int pos, @org.jetbrains.annotations.NotNull()
    java.lang.String title);
}