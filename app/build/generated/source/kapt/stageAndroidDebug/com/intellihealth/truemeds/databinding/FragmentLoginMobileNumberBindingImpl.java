package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLoginMobileNumberBindingImpl extends FragmentLoginMobileNumberBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvLoginMobileNumber, 3);
        sViewsWithIds.put(R.id.flexboxLoginTermsConditions, 4);
        sViewsWithIds.put(R.id.tvSigning, 5);
        sViewsWithIds.put(R.id.tvTermsConditions, 6);
        sViewsWithIds.put(R.id.btnGetOtp, 7);
        sViewsWithIds.put(R.id.progressBar, 8);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentLoginMobileNumberBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentLoginMobileNumberBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.intellihealth.salt.views.buttons.Button) bindings[7]
            , (androidx.cardview.widget.CardView) bindings[2]
            , (android.widget.LinearLayout) bindings[1]
            , (com.google.android.flexbox.FlexboxLayout) bindings[4]
            , (android.widget.ProgressBar) bindings[8]
            , (androidx.core.widget.NestedScrollView) bindings[0]
            , (com.intellihealth.salt.views.edittext.InputFieldLayout) bindings[3]
            , (com.intellihealth.salt.views.TextView) bindings[5]
            , (com.intellihealth.salt.views.buttons.ButtonLite) bindings[6]
            );
        this.btnTrueCallerLogin.setTag(null);
        this.divider.setTag(null);
        this.scrollView.setTag(null);
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
        if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.LoginViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
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
        int viewModelCheckTrueCallerAvailabilityViewVISIBLEViewGONE = 0;
        boolean viewModelCheckTrueCallerAvailability = false;
        com.intellihealth.truemeds.presentation.viewmodel.LoginViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.checkTrueCallerAvailability()
                    viewModelCheckTrueCallerAvailability = viewModel.checkTrueCallerAvailability();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(viewModelCheckTrueCallerAvailability) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read viewModel.checkTrueCallerAvailability() ? View.VISIBLE : View.GONE
                viewModelCheckTrueCallerAvailabilityViewVISIBLEViewGONE = ((viewModelCheckTrueCallerAvailability) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.btnTrueCallerLogin.setVisibility(viewModelCheckTrueCallerAvailabilityViewVISIBLEViewGONE);
            this.divider.setVisibility(viewModelCheckTrueCallerAvailabilityViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
        flag 2 (0x3L): viewModel.checkTrueCallerAvailability() ? View.VISIBLE : View.GONE
        flag 3 (0x4L): viewModel.checkTrueCallerAvailability() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}