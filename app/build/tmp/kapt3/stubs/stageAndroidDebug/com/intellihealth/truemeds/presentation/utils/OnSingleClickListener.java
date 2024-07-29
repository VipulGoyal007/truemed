package com.intellihealth.truemeds.presentation.utils;

/**
 * This class allows a single click and prevents multiple clicks on
 * the same button in rapid succession. Setting unclickable is not enough
 * because click events may still be queued up.
 *
 * Override onSingleClick() to handle single clicks.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/intellihealth/truemeds/presentation/utils/OnSingleClickListener;", "Landroid/view/View$OnClickListener;", "()V", "mLastClickTime", "", "onClick", "", "v", "Landroid/view/View;", "onSingleClick", "Companion", "app_stageAndroidDebug"})
public abstract class OnSingleClickListener implements android.view.View.OnClickListener {
    public static final long MIN_DELAY_MS = 1000L;
    private long mLastClickTime = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final com.intellihealth.truemeds.presentation.utils.OnSingleClickListener.Companion Companion = null;
    
    public OnSingleClickListener() {
        super();
    }
    
    public abstract void onSingleClick(@org.jetbrains.annotations.NotNull()
    android.view.View v);
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/intellihealth/truemeds/presentation/utils/OnSingleClickListener$Companion;", "", "()V", "MIN_DELAY_MS", "", "app_stageAndroidDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}