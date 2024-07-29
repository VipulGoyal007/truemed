package com.intellihealth.truemeds.presentation.activity;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001XB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020-H\u0002J\b\u0010/\u001a\u00020-H\u0002J\b\u00100\u001a\u00020-H\u0002J\b\u00101\u001a\u00020-H\u0016J\b\u00102\u001a\u00020-H\u0002J\b\u00103\u001a\u00020-H\u0002J\u0018\u00104\u001a\u00020-2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000206H\u0002J\b\u00108\u001a\u00020-H\u0002J\u0006\u00109\u001a\u00020\bJ\u0006\u0010:\u001a\u00020\bJ\u0010\u0010;\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010<\u001a\u00020-H\u0016J\u0012\u0010=\u001a\u00020-2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u0012\u0010@\u001a\u00020-2\b\u0010A\u001a\u0004\u0018\u00010BH\u0014J-\u0010C\u001a\u00020-2\u0006\u0010D\u001a\u00020\u00052\u000e\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0F2\u0006\u0010G\u001a\u00020HH\u0016\u00a2\u0006\u0002\u0010IJ\u0006\u0010J\u001a\u00020-J\b\u0010K\u001a\u00020-H\u0002J\u0010\u0010L\u001a\u00020-2\u0006\u0010M\u001a\u00020NH\u0002J\b\u0010O\u001a\u00020-H\u0002J\u0016\u0010P\u001a\u00020-2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020\bJ\b\u0010T\u001a\u00020-H\u0002J\u000e\u0010U\u001a\u00020-2\u0006\u0010V\u001a\u00020$J\b\u0010W\u001a\u00020-H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010(\u001a\u0004\b%\u0010&R\u000e\u0010)\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006Y"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/AddAddressActivity;", "Lcom/intellihealth/truemeds/presentation/activity/BaseActivity;", "Landroid/view/View$OnClickListener;", "()V", "ENABLE_GPS_REQUEST", "", "LOCATION_PERMISSIONS_REQUEST", "addPatient", "", "addPatientFrom", "", "addressModel", "Lcom/intellihealth/truemeds/data/model/user/GetAllAddressResponse$ResponseObj;", "binding", "Lcom/intellihealth/truemeds/databinding/ActivityAddAddressBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/ActivityAddAddressBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/ActivityViewBindingDelegate;", "context", "Landroid/content/Context;", "editDeleteAddressBottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/EditDeleteAddressBottomSheet;", "enterPin", "fromDeliveryDelay", "fromUserLocationClick", "fusedLocationProvider", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "isEditClick", "isEditWithChipId", "isFromCart", "locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "locationRequest", "Lcom/google/android/gms/location/LocationRequest;", "manageAddressViewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/ManageAddressViewModel;", "getManageAddressViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/ManageAddressViewModel;", "manageAddressViewModel$delegate", "Lkotlin/Lazy;", "onTouchPin", "redirectToCart", "resumeFromPermissionRequest", "addEditTextChangeListener", "", "checkLocationPermission", "deSelectChips", "doOtherChipItemSelection", "extractIntentData", "getCurrentGPSLocation", "getIntentData", "getLocalityName", "lat", "", "lng", "hideChipErrorText", "isEmptyFieldsValue", "isFieldsValueChange", "isLocationEnabled", "onBackPressed", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "openBottomSheet", "requestLocationPermission", "scrollToPosition", "view", "Lcom/intellihealth/salt/views/edittext/InputFieldLayout;", "setEventListener", "setFieldState", "state", "Lcom/intellihealth/salt/constants/InputFieldConstants;", "isEnabled", "setInputDigits", "setManageAddressViewModel", "viewModel", "showEnableLocationPopup", "ChipType", "app_prodDebug"})
public final class AddAddressActivity extends com.intellihealth.truemeds.presentation.activity.BaseActivity implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj addressModel;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.ActivityViewBindingDelegate binding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.bottomsheet.EditDeleteAddressBottomSheet editDeleteAddressBottomSheet;
    private boolean isEditClick = false;
    private boolean onTouchPin = false;
    private final int LOCATION_PERMISSIONS_REQUEST = 101;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationProvider;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.gms.location.LocationRequest locationRequest = null;
    private boolean resumeFromPermissionRequest = false;
    private boolean fromUserLocationClick = false;
    private final int ENABLE_GPS_REQUEST = 103;
    private android.content.Context context;
    private boolean addPatient = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String addPatientFrom = "";
    private boolean isFromCart = false;
    private boolean redirectToCart = false;
    private boolean fromDeliveryDelay = false;
    private int isEditWithChipId = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String enterPin = "";
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy manageAddressViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.gms.location.LocationCallback locationCallback = null;
    
    public AddAddressActivity() {
        super();
    }
    
    private final com.intellihealth.truemeds.databinding.ActivityAddAddressBinding getBinding() {
        return null;
    }
    
    private final com.intellihealth.truemeds.presentation.viewmodel.ManageAddressViewModel getManageAddressViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void scrollToPosition(com.intellihealth.salt.views.edittext.InputFieldLayout view) {
    }
    
    @java.lang.Override()
    public void extractIntentData() {
    }
    
    private final void getIntentData() {
    }
    
    private final void setInputDigits() {
    }
    
    private final void setEventListener() {
    }
    
    private final void addEditTextChangeListener() {
    }
    
    public final void setFieldState(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.constants.InputFieldConstants state, boolean isEnabled) {
    }
    
    public final boolean isFieldsValueChange() {
        return false;
    }
    
    public final void openBottomSheet() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public final boolean isEmptyFieldsValue() {
        return false;
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void hideChipErrorText() {
    }
    
    private final void doOtherChipItemSelection() {
    }
    
    private final void deSelectChips() {
    }
    
    private final void checkLocationPermission() {
    }
    
    private final void requestLocationPermission() {
    }
    
    private final boolean isLocationEnabled(android.content.Context context) {
        return false;
    }
    
    private final void getLocalityName(double lat, double lng) {
    }
    
    private final void getCurrentGPSLocation() {
    }
    
    private final void showEnableLocationPopup() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    public final void setManageAddressViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.ManageAddressViewModel viewModel) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/AddAddressActivity$ChipType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "SELECTED", "UNSELECTED", "app_prodDebug"})
    public static enum ChipType {
        /*public static final*/ SELECTED /* = new SELECTED(0) */,
        /*public static final*/ UNSELECTED /* = new UNSELECTED(0) */;
        private final int value = 0;
        
        ChipType(int value) {
        }
        
        public final int getValue() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.intellihealth.truemeds.presentation.activity.AddAddressActivity.ChipType> getEntries() {
            return null;
        }
    }
}