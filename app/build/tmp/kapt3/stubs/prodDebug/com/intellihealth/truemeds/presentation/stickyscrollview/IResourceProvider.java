package com.intellihealth.truemeds.presentation.stickyscrollview;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/intellihealth/truemeds/presentation/stickyscrollview/IResourceProvider;", "", "getResourceId", "", "styleResId", "recycle", "", "app_prodDebug"})
public abstract interface IResourceProvider {
    
    public abstract int getResourceId(@androidx.annotation.StyleableRes()
    int styleResId);
    
    public abstract void recycle();
}