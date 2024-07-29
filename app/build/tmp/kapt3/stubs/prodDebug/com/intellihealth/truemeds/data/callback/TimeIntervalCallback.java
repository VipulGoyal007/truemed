package com.intellihealth.truemeds.data.callback;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/intellihealth/truemeds/data/callback/TimeIntervalCallback;", "", "onEditCustomDatesClicked", "", "selectedCustomTimeIntervalCallback", "selectedFromDate", "Ljava/util/Date;", "selectedToDate", "selectedTimeIntervalCallback", "selectedTimeInterval", "", "app_prodDebug"})
public abstract interface TimeIntervalCallback {
    
    public abstract void selectedCustomTimeIntervalCallback(@org.jetbrains.annotations.NotNull()
    java.util.Date selectedFromDate, @org.jetbrains.annotations.NotNull()
    java.util.Date selectedToDate);
    
    public abstract void selectedTimeIntervalCallback(@org.jetbrains.annotations.Nullable()
    java.lang.String selectedTimeInterval);
    
    public abstract void onEditCustomDatesClicked();
}