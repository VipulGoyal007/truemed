package com.intellihealth.truemeds.mvvm.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u001b\u001a\u00020\u0019H\u0014J\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0007J\u0016\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007J\u0006\u0010 \u001a\u00020\u0019R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\f0\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006!"}, d2 = {"Lcom/intellihealth/truemeds/mvvm/viewmodel/CountDownTimerViewModel;", "Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModel;", "mainDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "_ftcTimeRemainingInMillis", "Landroidx/lifecycle/MutableLiveData;", "", "_ftcTimeRemainingString", "", "kotlin.jvm.PlatformType", "_tickInterval", "Lkotlin/time/Duration;", "countDownTimer", "Landroid/os/CountDownTimer;", "ftcTimeRemainingInMillis", "Landroidx/lifecycle/LiveData;", "getFtcTimeRemainingInMillis", "()Landroidx/lifecycle/LiveData;", "ftcTimeRemainingString", "getFtcTimeRemainingString", "tickIntervalMs", "getTickIntervalMs", "()J", "clearInstance", "", "getCountDownTimerInstance", "onCleared", "start", "millis", "currentTime", "expiryTime", "stop", "app_prodDebug"})
public final class CountDownTimerViewModel extends com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineDispatcher mainDispatcher = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> _ftcTimeRemainingInMillis = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _ftcTimeRemainingString = null;
    @org.jetbrains.annotations.Nullable()
    private android.os.CountDownTimer countDownTimer;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.time.Duration> _tickInterval = null;
    
    public CountDownTimerViewModel(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher mainDispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Long> getFtcTimeRemainingInMillis() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getFtcTimeRemainingString() {
        return null;
    }
    
    private final long getTickIntervalMs() {
        return 0L;
    }
    
    public final void stop() {
    }
    
    public final void start(long currentTime, long expiryTime) {
    }
    
    public final void start(long millis) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.os.CountDownTimer getCountDownTimerInstance() {
        return null;
    }
    
    public final void clearInstance() {
    }
    
    public CountDownTimerViewModel() {
        super();
    }
}