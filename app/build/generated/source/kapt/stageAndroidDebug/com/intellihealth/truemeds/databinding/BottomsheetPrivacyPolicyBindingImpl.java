package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BottomsheetPrivacyPolicyBindingImpl extends BottomsheetPrivacyPolicyBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clHeader, 5);
        sViewsWithIds.put(R.id.viewDragHandle, 6);
        sViewsWithIds.put(R.id.cl_body, 7);
        sViewsWithIds.put(R.id.scrollableBodyContent, 8);
        sViewsWithIds.put(R.id.tvAcceptPrivacy, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BottomsheetPrivacyPolicyBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private BottomsheetPrivacyPolicyBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (android.widget.ScrollView) bindings[8]
            , (com.intellihealth.salt.views.buttons.Button) bindings[9]
            , (com.intellihealth.salt.views.TextView) bindings[3]
            , (com.intellihealth.salt.views.TextView) bindings[2]
            , (com.intellihealth.salt.views.TextView) bindings[1]
            , (android.view.View) bindings[6]
            );
        this.clProgress.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvBodyContent.setTag(null);
        this.tvBodyHeader.setTag(null);
        this.tvHeader.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.privacyPolicyData == variableId) {
            setPrivacyPolicyData((com.intellihealth.truemeds.data.model.home.PrivacyPolicyBottomSheetModel) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPrivacyPolicyData(@Nullable com.intellihealth.truemeds.data.model.home.PrivacyPolicyBottomSheetModel PrivacyPolicyData) {
        this.mPrivacyPolicyData = PrivacyPolicyData;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.privacyPolicyData);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelShowPpTncLoader((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelShowPpTncLoader(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowPpTncLoader, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowPpTncLoaderGetValue = false;
        java.lang.String privacyPolicyDataBodyContent = null;
        java.lang.Boolean viewModelShowPpTncLoaderGetValue = null;
        com.intellihealth.truemeds.data.model.home.PrivacyPolicyBottomSheetModel privacyPolicyData = mPrivacyPolicyData;
        java.lang.String privacyPolicyDataHeader = null;
        java.lang.String privacyPolicyDataBodyHeader = null;
        com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel viewModel = mViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowPpTncLoader = null;
        int viewModelShowPpTncLoaderViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0xaL) != 0) {



                if (privacyPolicyData != null) {
                    // read privacyPolicyData.bodyContent
                    privacyPolicyDataBodyContent = privacyPolicyData.getBodyContent();
                    // read privacyPolicyData.header
                    privacyPolicyDataHeader = privacyPolicyData.getHeader();
                    // read privacyPolicyData.bodyHeader
                    privacyPolicyDataBodyHeader = privacyPolicyData.getBodyHeader();
                }
        }
        if ((dirtyFlags & 0xdL) != 0) {



                if (viewModel != null) {
                    // read viewModel.showPpTncLoader
                    viewModelShowPpTncLoader = viewModel.getShowPpTncLoader();
                }
                updateLiveDataRegistration(0, viewModelShowPpTncLoader);


                if (viewModelShowPpTncLoader != null) {
                    // read viewModel.showPpTncLoader.getValue()
                    viewModelShowPpTncLoaderGetValue = viewModelShowPpTncLoader.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPpTncLoader.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelShowPpTncLoaderGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowPpTncLoaderGetValue);
            if((dirtyFlags & 0xdL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowPpTncLoaderGetValue) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPpTncLoader.getValue()) ? View.VISIBLE : View.GONE
                viewModelShowPpTncLoaderViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowPpTncLoaderGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.clProgress.setVisibility(viewModelShowPpTncLoaderViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvBodyContent, privacyPolicyDataBodyContent);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvBodyHeader, privacyPolicyDataBodyHeader);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHeader, privacyPolicyDataHeader);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.showPpTncLoader
        flag 1 (0x2L): privacyPolicyData
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPpTncLoader.getValue()) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPpTncLoader.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}