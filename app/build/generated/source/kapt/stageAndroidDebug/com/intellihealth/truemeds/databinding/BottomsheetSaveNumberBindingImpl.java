package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BottomsheetSaveNumberBindingImpl extends BottomsheetSaveNumberBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imgClose, 2);
        sViewsWithIds.put(R.id.imgCall, 3);
        sViewsWithIds.put(R.id.textBestExperience, 4);
        sViewsWithIds.put(R.id.textClickSave, 5);
        sViewsWithIds.put(R.id.btnSaveContact, 6);
    }
    // views
    @NonNull
    private final android.widget.ProgressBar mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BottomsheetSaveNumberBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private BottomsheetSaveNumberBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.intellihealth.salt.views.buttons.Button) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (com.intellihealth.salt.views.TextView) bindings[4]
            , (com.intellihealth.salt.views.TextView) bindings[5]
            );
        this.clSaveCall.setTag(null);
        this.mboundView1 = (android.widget.ProgressBar) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.viewmodel == variableId) {
            setViewmodel((com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelShowLoadingOnSaveContact((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelShowLoadingOnSaveContact(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewmodelShowLoadingOnSaveContact, int fieldId) {
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
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelShowLoadingOnSaveContactGetValue = false;
        int viewmodelShowLoadingOnSaveContactViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewmodelShowLoadingOnSaveContact = null;
        java.lang.Boolean viewmodelShowLoadingOnSaveContactGetValue = null;
        com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.showLoadingOnSaveContact
                    viewmodelShowLoadingOnSaveContact = viewmodel.getShowLoadingOnSaveContact();
                }
                updateLiveDataRegistration(0, viewmodelShowLoadingOnSaveContact);


                if (viewmodelShowLoadingOnSaveContact != null) {
                    // read viewmodel.showLoadingOnSaveContact.getValue()
                    viewmodelShowLoadingOnSaveContactGetValue = viewmodelShowLoadingOnSaveContact.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showLoadingOnSaveContact.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewmodelShowLoadingOnSaveContactGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelShowLoadingOnSaveContactGetValue);
            if((dirtyFlags & 0x7L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewmodelShowLoadingOnSaveContactGetValue) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showLoadingOnSaveContact.getValue()) ? View.VISIBLE : View.GONE
                viewmodelShowLoadingOnSaveContactViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelShowLoadingOnSaveContactGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(viewmodelShowLoadingOnSaveContactViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.showLoadingOnSaveContact
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showLoadingOnSaveContact.getValue()) ? View.VISIBLE : View.GONE
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showLoadingOnSaveContact.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}