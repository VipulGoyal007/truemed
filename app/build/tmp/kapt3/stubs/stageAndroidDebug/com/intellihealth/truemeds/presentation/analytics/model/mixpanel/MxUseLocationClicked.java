package com.intellihealth.truemeds.presentation.analytics.model.mixpanel;

@com.google.errorprone.annotations.Keep()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b.\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u000b\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0086\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u00103J\u0013\u00104\u001a\u00020\b2\b\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00106\u001a\u000207H\u00d6\u0001J\t\u00108\u001a\u00020\u0003H\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\"\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R\"\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\"\u0010\u001c\"\u0004\b#\u0010\u001eR \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0010\"\u0004\b%\u0010\u0012R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0010\"\u0004\b\'\u0010\u0012\u00a8\u00069"}, d2 = {"Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxUseLocationClicked;", "", "addressLine2", "", "city", "clickedOnPage", "pincode", "pincodeFetched", "", "pincodeFetchedResponse", "serviceable", "state", "whId", "order_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddressLine2", "()Ljava/lang/String;", "setAddressLine2", "(Ljava/lang/String;)V", "getCity", "setCity", "getClickedOnPage", "setClickedOnPage", "getOrder_id", "setOrder_id", "getPincode", "setPincode", "getPincodeFetched", "()Ljava/lang/Boolean;", "setPincodeFetched", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getPincodeFetchedResponse", "setPincodeFetchedResponse", "getServiceable", "setServiceable", "getState", "setState", "getWhId", "setWhId", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxUseLocationClicked;", "equals", "other", "hashCode", "", "toString", "app_stageAndroidDebug"})
public final class MxUseLocationClicked {
    @com.google.gson.annotations.SerializedName(value = "address_line_2")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String addressLine2;
    @com.google.gson.annotations.SerializedName(value = "city")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String city;
    @com.google.gson.annotations.SerializedName(value = "clicked_on_page")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String clickedOnPage;
    @com.google.gson.annotations.SerializedName(value = "pincode")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String pincode;
    @com.google.gson.annotations.SerializedName(value = "pincode_fetched")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean pincodeFetched;
    @com.google.gson.annotations.SerializedName(value = "pincode_fetched_response")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String pincodeFetchedResponse;
    @com.google.gson.annotations.SerializedName(value = "serviceable")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean serviceable;
    @com.google.gson.annotations.SerializedName(value = "state")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String state;
    @com.google.gson.annotations.SerializedName(value = "wh_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String whId;
    @com.google.gson.annotations.SerializedName(value = "order_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String order_id;
    
    public MxUseLocationClicked(@org.jetbrains.annotations.Nullable()
    java.lang.String addressLine2, @org.jetbrains.annotations.Nullable()
    java.lang.String city, @org.jetbrains.annotations.Nullable()
    java.lang.String clickedOnPage, @org.jetbrains.annotations.Nullable()
    java.lang.String pincode, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean pincodeFetched, @org.jetbrains.annotations.Nullable()
    java.lang.String pincodeFetchedResponse, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean serviceable, @org.jetbrains.annotations.Nullable()
    java.lang.String state, @org.jetbrains.annotations.Nullable()
    java.lang.String whId, @org.jetbrains.annotations.Nullable()
    java.lang.String order_id) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddressLine2() {
        return null;
    }
    
    public final void setAddressLine2(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCity() {
        return null;
    }
    
    public final void setCity(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getClickedOnPage() {
        return null;
    }
    
    public final void setClickedOnPage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPincode() {
        return null;
    }
    
    public final void setPincode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getPincodeFetched() {
        return null;
    }
    
    public final void setPincodeFetched(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPincodeFetchedResponse() {
        return null;
    }
    
    public final void setPincodeFetchedResponse(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getServiceable() {
        return null;
    }
    
    public final void setServiceable(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWhId() {
        return null;
    }
    
    public final void setWhId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrder_id() {
        return null;
    }
    
    public final void setOrder_id(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public MxUseLocationClicked() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxUseLocationClicked copy(@org.jetbrains.annotations.Nullable()
    java.lang.String addressLine2, @org.jetbrains.annotations.Nullable()
    java.lang.String city, @org.jetbrains.annotations.Nullable()
    java.lang.String clickedOnPage, @org.jetbrains.annotations.Nullable()
    java.lang.String pincode, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean pincodeFetched, @org.jetbrains.annotations.Nullable()
    java.lang.String pincodeFetchedResponse, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean serviceable, @org.jetbrains.annotations.Nullable()
    java.lang.String state, @org.jetbrains.annotations.Nullable()
    java.lang.String whId, @org.jetbrains.annotations.Nullable()
    java.lang.String order_id) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}