package com.intellihealth.truemeds.presentation.stickyscrollview;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a8\u0006\f"}, d2 = {"Lcom/intellihealth/truemeds/presentation/stickyscrollview/IScrollViewListener;", "", "onScrollChanged", "", "l", "", "t", "oldl", "oldt", "onScrollStopped", "isStopped", "", "app_stageAndroidDebug"})
public abstract interface IScrollViewListener {
    
    public abstract void onScrollChanged(int l, int t, int oldl, int oldt);
    
    public abstract void onScrollStopped(boolean isStopped);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        public static void onScrollChanged(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.presentation.stickyscrollview.IScrollViewListener $this, int l, int t, int oldl, int oldt) {
        }
        
        public static void onScrollStopped(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.presentation.stickyscrollview.IScrollViewListener $this, boolean isStopped) {
        }
    }
}