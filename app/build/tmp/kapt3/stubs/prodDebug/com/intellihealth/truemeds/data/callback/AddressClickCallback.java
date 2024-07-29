package com.intellihealth.truemeds.data.callback;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J \u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH&\u00a8\u0006\u000f"}, d2 = {"Lcom/intellihealth/truemeds/data/callback/AddressClickCallback;", "", "dismissToolTip", "", "toolTip", "Lcom/intellihealth/salt/views/tooltip/DefaultExpandedTooltip;", "editClick", "address", "Lcom/intellihealth/truemeds/data/model/user/GetAllAddressResponse$ResponseObj;", "locationClicked", "selectedLocation", "", "selectedAddressId", "", "selectedAddressPinCode", "app_prodDebug"})
public abstract interface AddressClickCallback {
    
    public abstract void editClick(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj address);
    
    public abstract void dismissToolTip(@org.jetbrains.annotations.Nullable()
    com.intellihealth.salt.views.tooltip.DefaultExpandedTooltip toolTip);
    
    public abstract void locationClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String selectedLocation, long selectedAddressId, @org.jetbrains.annotations.NotNull()
    java.lang.String selectedAddressPinCode);
}