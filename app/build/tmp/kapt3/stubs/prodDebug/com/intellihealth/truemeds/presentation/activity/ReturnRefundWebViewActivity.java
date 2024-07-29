package com.intellihealth.truemeds.presentation.activity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 12\u00020\u0001:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010\nJ\b\u0010#\u001a\u00020 H\u0002J\"\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\b\u0010*\u001a\u00020 H\u0016J\u0012\u0010+\u001a\u00020 2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\b\u0010.\u001a\u00020 H\u0014J\b\u0010/\u001a\u00020 H\u0002J\b\u00100\u001a\u00020 H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0017\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/ReturnRefundWebViewActivity;", "Lcom/intellihealth/truemeds/presentation/activity/BaseActivity;", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/ActivityReturnRefundWebBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/ActivityReturnRefundWebBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/ActivityViewBindingDelegate;", "imageFilePath", "", "getImageFilePath", "()Ljava/lang/String;", "setImageFilePath", "(Ljava/lang/String;)V", "mContext", "Landroid/content/Context;", "mCurrentPhotoPath", "mMediaUri", "Landroid/net/Uri;", "mUploadMessage", "Landroid/webkit/ValueCallback;", "uploadMessage", "", "getUploadMessage", "()Landroid/webkit/ValueCallback;", "setUploadMessage", "(Landroid/webkit/ValueCallback;)V", "url", "createImageFile", "Ljava/io/File;", "extractIntentData", "", "getPhotoFileUri", "fileName", "initWebView", "onActivityResult", "requestCode", "", "resultCode", "intent", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "openCameraIntent", "openCameraIntent1", "Companion", "app_prodDebug"})
public final class ReturnRefundWebViewActivity extends com.intellihealth.truemeds.presentation.activity.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.ActivityViewBindingDelegate binding$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private android.content.Context mContext;
    @org.jetbrains.annotations.Nullable()
    private android.webkit.ValueCallback<android.net.Uri> mUploadMessage;
    @org.jetbrains.annotations.Nullable()
    private android.webkit.ValueCallback<android.net.Uri[]> uploadMessage;
    @org.jetbrains.annotations.Nullable()
    private android.net.Uri mMediaUri;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String url;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mCurrentPhotoPath = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String imageFilePath;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "ReturnRefund";
    private static final int REQUEST_FILE_CHOOSER = 100;
    private static final int REQUEST_CAMERA = 200;
    private static final int REQUEST_CAMERA_1 = 300;
    @org.jetbrains.annotations.NotNull()
    public static final com.intellihealth.truemeds.presentation.activity.ReturnRefundWebViewActivity.Companion Companion = null;
    
    public ReturnRefundWebViewActivity() {
        super();
    }
    
    private final com.intellihealth.truemeds.databinding.ActivityReturnRefundWebBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.webkit.ValueCallback<android.net.Uri[]> getUploadMessage() {
        return null;
    }
    
    public final void setUploadMessage(@org.jetbrains.annotations.Nullable()
    android.webkit.ValueCallback<android.net.Uri[]> p0) {
    }
    
    @java.lang.Override()
    public void extractIntentData() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initWebView() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getPhotoFileUri(@org.jetbrains.annotations.Nullable()
    java.lang.String fileName) {
        return null;
    }
    
    private final void openCameraIntent1() {
    }
    
    private final void openCameraIntent() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImageFilePath() {
        return null;
    }
    
    public final void setImageFilePath(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    private final java.io.File createImageFile() throws java.io.IOException {
        return null;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/ReturnRefundWebViewActivity$Companion;", "", "()V", "REQUEST_CAMERA", "", "REQUEST_CAMERA_1", "REQUEST_FILE_CHOOSER", "TAG", "", "app_prodDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}