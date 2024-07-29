package com.intellihealth.truemeds.data.callback;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&J!\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016\u00a2\u0006\u0002\u0010\nJ)\u0010\u000b\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\rH\u0016\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/intellihealth/truemeds/data/callback/OrgSubCompareBottomSheetCallback;", "", "closeClick", "", "isReload", "", "openPDPage", "productCode", "", "subs", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "openPDPageCart", "productInfoModel", "Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;)V", "app_prodDebug"})
public abstract interface OrgSubCompareBottomSheetCallback {
    
    public abstract void closeClick(boolean isReload);
    
    public abstract void openPDPage(@org.jetbrains.annotations.Nullable()
    java.lang.String productCode, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean subs);
    
    public abstract void openPDPageCart(@org.jetbrains.annotations.Nullable()
    java.lang.String productCode, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean subs, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel productInfoModel);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        public static void openPDPage(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.data.callback.OrgSubCompareBottomSheetCallback $this, @org.jetbrains.annotations.Nullable()
        java.lang.String productCode, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean subs) {
        }
        
        public static void openPDPageCart(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.data.callback.OrgSubCompareBottomSheetCallback $this, @org.jetbrains.annotations.Nullable()
        java.lang.String productCode, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean subs, @org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.presentation.model.ProductInfoModel productInfoModel) {
        }
    }
}