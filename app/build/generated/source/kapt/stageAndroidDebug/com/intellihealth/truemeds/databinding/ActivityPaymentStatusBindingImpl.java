package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityPaymentStatusBindingImpl extends ActivityPaymentStatusBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ivPaymentSuccess, 4);
        sViewsWithIds.put(R.id.tvPaymentSuccessful, 5);
        sViewsWithIds.put(R.id.ivHoldOn, 6);
        sViewsWithIds.put(R.id.tvHoldOn, 7);
        sViewsWithIds.put(R.id.ivPaymentFailure, 8);
        sViewsWithIds.put(R.id.tvPaymentFailure, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityPaymentStatusBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivityPaymentStatusBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (com.intellihealth.salt.views.TextView) bindings[7]
            , (com.intellihealth.salt.views.TextView) bindings[9]
            , (com.intellihealth.salt.views.TextView) bindings[5]
            );
        this.clHoldOnView.setTag(null);
        this.clPaymentFailureView.setTag(null);
        this.clPaymentSuccessView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.PaymentStatusViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.PaymentStatusViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelShowPaymentSuccessView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelShowPaymentHoldOnView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelShowPaymentFailureView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelShowPaymentSuccessView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowPaymentSuccessView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowPaymentHoldOnView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowPaymentHoldOnView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowPaymentFailureView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowPaymentFailureView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowPaymentSuccessViewGetValue = false;
        java.lang.Boolean viewModelShowPaymentFailureViewGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowPaymentHoldOnViewGetValue = false;
        java.lang.Boolean viewModelShowPaymentSuccessViewGetValue = null;
        int viewModelShowPaymentFailureViewViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowPaymentSuccessView = null;
        java.lang.Boolean viewModelShowPaymentHoldOnViewGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowPaymentFailureViewGetValue = false;
        int viewModelShowPaymentSuccessViewViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowPaymentHoldOnView = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowPaymentFailureView = null;
        com.intellihealth.truemeds.presentation.viewmodel.PaymentStatusViewModel viewModel = mViewModel;
        int viewModelShowPaymentHoldOnViewViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showPaymentSuccessView
                        viewModelShowPaymentSuccessView = viewModel.getShowPaymentSuccessView();
                    }
                    updateLiveDataRegistration(0, viewModelShowPaymentSuccessView);


                    if (viewModelShowPaymentSuccessView != null) {
                        // read viewModel.showPaymentSuccessView.getValue()
                        viewModelShowPaymentSuccessViewGetValue = viewModelShowPaymentSuccessView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPaymentSuccessView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowPaymentSuccessViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowPaymentSuccessViewGetValue);
                if((dirtyFlags & 0x19L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowPaymentSuccessViewGetValue) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPaymentSuccessView.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowPaymentSuccessViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowPaymentSuccessViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showPaymentHoldOnView
                        viewModelShowPaymentHoldOnView = viewModel.getShowPaymentHoldOnView();
                    }
                    updateLiveDataRegistration(1, viewModelShowPaymentHoldOnView);


                    if (viewModelShowPaymentHoldOnView != null) {
                        // read viewModel.showPaymentHoldOnView.getValue()
                        viewModelShowPaymentHoldOnViewGetValue = viewModelShowPaymentHoldOnView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPaymentHoldOnView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowPaymentHoldOnViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowPaymentHoldOnViewGetValue);
                if((dirtyFlags & 0x1aL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowPaymentHoldOnViewGetValue) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPaymentHoldOnView.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowPaymentHoldOnViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowPaymentHoldOnViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showPaymentFailureView
                        viewModelShowPaymentFailureView = viewModel.getShowPaymentFailureView();
                    }
                    updateLiveDataRegistration(2, viewModelShowPaymentFailureView);


                    if (viewModelShowPaymentFailureView != null) {
                        // read viewModel.showPaymentFailureView.getValue()
                        viewModelShowPaymentFailureViewGetValue = viewModelShowPaymentFailureView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPaymentFailureView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowPaymentFailureViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowPaymentFailureViewGetValue);
                if((dirtyFlags & 0x1cL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowPaymentFailureViewGetValue) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPaymentFailureView.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowPaymentFailureViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowPaymentFailureViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.clHoldOnView.setVisibility(viewModelShowPaymentHoldOnViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.clPaymentFailureView.setVisibility(viewModelShowPaymentFailureViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.clPaymentSuccessView.setVisibility(viewModelShowPaymentSuccessViewViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.showPaymentSuccessView
        flag 1 (0x2L): viewModel.showPaymentHoldOnView
        flag 2 (0x3L): viewModel.showPaymentFailureView
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPaymentFailureView.getValue()) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPaymentFailureView.getValue()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPaymentSuccessView.getValue()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPaymentSuccessView.getValue()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPaymentHoldOnView.getValue()) ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPaymentHoldOnView.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}