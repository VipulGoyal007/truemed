package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityPolicyDetailBindingImpl extends ActivityPolicyDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.txtHeader, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityPolicyDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ActivityPolicyDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ProgressBar) bindings[3]
            , (com.intellihealth.salt.views.TextView) bindings[1]
            , (com.intellihealth.salt.views.TextView) bindings[2]
            , (com.intellihealth.salt.views.MobileSectionHeaders) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar.setTag(null);
        this.txtApplicableDate.setTag(null);
        this.txtDetailContent.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.privacyTncData == variableId) {
            setPrivacyTncData((com.intellihealth.truemeds.data.model.helpfaqtnc.PrivacyPolicyAndTnCResponse.Legal) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.PolicyTncViewModel) variable);
        }
        else if (BR.description == variableId) {
            setDescription((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPrivacyTncData(@Nullable com.intellihealth.truemeds.data.model.helpfaqtnc.PrivacyPolicyAndTnCResponse.Legal PrivacyTncData) {
        this.mPrivacyTncData = PrivacyTncData;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.privacyTncData);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.PolicyTncViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    public void setDescription(@Nullable java.lang.String Description) {
        this.mDescription = Description;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.description);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelLoaderValue((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelLoaderValue(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelLoaderValue, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelLoaderValue = null;
        java.lang.String privacyTncDataHeader = null;
        java.lang.Boolean viewModelLoaderValueGetValue = null;
        com.intellihealth.truemeds.data.model.helpfaqtnc.PrivacyPolicyAndTnCResponse.Legal privacyTncData = mPrivacyTncData;
        int viewModelLoaderValueViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue = false;
        com.intellihealth.truemeds.presentation.viewmodel.PolicyTncViewModel viewModel = mViewModel;
        java.lang.String description = mDescription;

        if ((dirtyFlags & 0x12L) != 0) {



                if (privacyTncData != null) {
                    // read privacyTncData.header
                    privacyTncDataHeader = privacyTncData.getHeader();
                }
        }
        if ((dirtyFlags & 0x15L) != 0) {



                if (viewModel != null) {
                    // read viewModel.loaderValue
                    viewModelLoaderValue = viewModel.getLoaderValue();
                }
                updateLiveDataRegistration(0, viewModelLoaderValue);


                if (viewModelLoaderValue != null) {
                    // read viewModel.loaderValue.getValue()
                    viewModelLoaderValueGetValue = viewModelLoaderValue.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelLoaderValueGetValue);
            if((dirtyFlags & 0x15L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
                viewModelLoaderValueViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x18L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            this.progressBar.setVisibility(viewModelLoaderValueViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtApplicableDate, privacyTncDataHeader);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDetailContent, description);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.loaderValue
        flag 1 (0x2L): privacyTncData
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): description
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}