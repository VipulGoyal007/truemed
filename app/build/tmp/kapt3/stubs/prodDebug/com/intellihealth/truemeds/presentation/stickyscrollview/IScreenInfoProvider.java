package com.intellihealth.truemeds.presentation.stickyscrollview;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0005\u00a8\u0006\n"}, d2 = {"Lcom/intellihealth/truemeds/presentation/stickyscrollview/IScreenInfoProvider;", "", "navigationBarHeight", "", "getNavigationBarHeight", "()I", "screenHeight", "getScreenHeight", "screenWidth", "getScreenWidth", "app_prodDebug"})
public abstract interface IScreenInfoProvider {
    
    public abstract int getScreenHeight();
    
    public abstract int getScreenWidth();
    
    public abstract int getNavigationBarHeight();
}