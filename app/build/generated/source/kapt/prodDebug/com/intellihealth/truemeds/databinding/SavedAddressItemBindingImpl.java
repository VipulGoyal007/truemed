package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SavedAddressItemBindingImpl extends SavedAddressItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cl_saved_address, 4);
        sViewsWithIds.put(R.id.ivEditSavedAddress, 5);
        sViewsWithIds.put(R.id.tvPinCodeUnserviceable, 6);
        sViewsWithIds.put(R.id.ivEditInfo, 7);
        sViewsWithIds.put(R.id.vertical_guideline, 8);
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SavedAddressItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private SavedAddressItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (com.intellihealth.salt.views.radiofield.Radio) bindings[1]
            , (com.intellihealth.salt.views.TextView) bindings[3]
            , (com.intellihealth.salt.views.TextView) bindings[2]
            , (com.intellihealth.salt.views.TextView) bindings[6]
            , (androidx.constraintlayout.widget.Guideline) bindings[8]
            );
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.radioHeader.setTag(null);
        this.tvAddress.setTag(null);
        this.tvLabelRight.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.savedAddressData == variableId) {
            setSavedAddressData((com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSavedAddressData(@Nullable com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj SavedAddressData) {
        this.mSavedAddressData = SavedAddressData;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.savedAddressData);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean savedAddressDataIsServicableJavaLangObjectNullBooleanTrueSavedAddressDataIsServicable = false;
        java.lang.Boolean savedAddressDataIsServicable = null;
        java.lang.String savedAddressDataAddressTypeJavaLangStringSavedAddressDataPincode = null;
        java.lang.String savedAddressDataAddressTypeJavaLangString = null;
        java.lang.String savedAddressDataPincode = null;
        com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj savedAddressData = mSavedAddressData;
        float savedAddressDataIsServicableJavaLangObjectNullBooleanTrueSavedAddressDataIsServicableFloat1fFloat6f = 0f;
        java.lang.String savedAddressDataClubbedAddress = null;
        java.lang.String savedAddressDataAddressTypeJavaLangStringSavedAddressDataPincodeJavaLangString = null;
        boolean savedAddressDataIsServicableJavaLangObjectNull = false;
        java.lang.String savedAddressDataAddressType = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (savedAddressData != null) {
                    // read savedAddressData.isServicable
                    savedAddressDataIsServicable = savedAddressData.isServicable();
                    // read savedAddressData.pincode
                    savedAddressDataPincode = savedAddressData.getPincode();
                    // read savedAddressData.clubbedAddress
                    savedAddressDataClubbedAddress = savedAddressData.getClubbedAddress();
                    // read savedAddressData.addressType
                    savedAddressDataAddressType = savedAddressData.getAddressType();
                }


                // read savedAddressData.isServicable == null
                savedAddressDataIsServicableJavaLangObjectNull = (savedAddressDataIsServicable) == (null);
                // read (savedAddressData.addressType) + (" (")
                savedAddressDataAddressTypeJavaLangString = (savedAddressDataAddressType) + (" (");
            if((dirtyFlags & 0x3L) != 0) {
                if(savedAddressDataIsServicableJavaLangObjectNull) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read ((savedAddressData.addressType) + (" (")) + (savedAddressData.pincode)
                savedAddressDataAddressTypeJavaLangStringSavedAddressDataPincode = (savedAddressDataAddressTypeJavaLangString) + (savedAddressDataPincode);


                // read (((savedAddressData.addressType) + (" (")) + (savedAddressData.pincode)) + (")")
                savedAddressDataAddressTypeJavaLangStringSavedAddressDataPincodeJavaLangString = (savedAddressDataAddressTypeJavaLangStringSavedAddressDataPincode) + (")");
        }
        // batch finished

        if ((dirtyFlags & 0x3L) != 0) {

                // read savedAddressData.isServicable == null ? true : savedAddressData.isServicable
                savedAddressDataIsServicableJavaLangObjectNullBooleanTrueSavedAddressDataIsServicable = ((savedAddressDataIsServicableJavaLangObjectNull) ? (true) : (savedAddressDataIsServicable));
            if((dirtyFlags & 0x3L) != 0) {
                if(savedAddressDataIsServicableJavaLangObjectNullBooleanTrueSavedAddressDataIsServicable) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read savedAddressData.isServicable == null ? true : savedAddressData.isServicable ? 1f : .6f
                savedAddressDataIsServicableJavaLangObjectNullBooleanTrueSavedAddressDataIsServicableFloat1fFloat6f = ((savedAddressDataIsServicableJavaLangObjectNullBooleanTrueSavedAddressDataIsServicable) ? (1f) : (.6f));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 11
            if(getBuildSdkInt() >= 11) {

                this.radioHeader.setAlpha(savedAddressDataIsServicableJavaLangObjectNullBooleanTrueSavedAddressDataIsServicableFloat1fFloat6f);
                this.tvAddress.setAlpha(savedAddressDataIsServicableJavaLangObjectNullBooleanTrueSavedAddressDataIsServicableFloat1fFloat6f);
                this.tvLabelRight.setAlpha(savedAddressDataIsServicableJavaLangObjectNullBooleanTrueSavedAddressDataIsServicableFloat1fFloat6f);
            }
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvAddress, savedAddressDataClubbedAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvLabelRight, savedAddressDataAddressTypeJavaLangStringSavedAddressDataPincodeJavaLangString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): savedAddressData
        flag 1 (0x2L): null
        flag 2 (0x3L): savedAddressData.isServicable == null ? true : savedAddressData.isServicable
        flag 3 (0x4L): savedAddressData.isServicable == null ? true : savedAddressData.isServicable
        flag 4 (0x5L): savedAddressData.isServicable == null ? true : savedAddressData.isServicable ? 1f : .6f
        flag 5 (0x6L): savedAddressData.isServicable == null ? true : savedAddressData.isServicable ? 1f : .6f
    flag mapping end*/
    //end
}