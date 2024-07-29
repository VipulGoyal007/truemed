package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityPaymentBindingImpl extends ActivityPaymentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ivPaymentSuccess, 5);
        sViewsWithIds.put(R.id.tvPaymentSuccessful, 6);
        sViewsWithIds.put(R.id.ivHoldOn, 7);
        sViewsWithIds.put(R.id.tvHoldOn, 8);
        sViewsWithIds.put(R.id.ivPaymentFailure, 9);
        sViewsWithIds.put(R.id.tvPaymentFailure, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.intellihealth.salt.views.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityPaymentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ActivityPaymentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[9]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (com.intellihealth.salt.views.TextView) bindings[8]
            , (com.intellihealth.salt.views.TextView) bindings[10]
            , (com.intellihealth.salt.views.TextView) bindings[6]
            );
        this.clHoldOnView.setTag(null);
        this.clPaymentFailureView.setTag(null);
        this.clPaymentSuccessView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (com.intellihealth.salt.views.TextView) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelTotalPayableAmount((androidx.lifecycle.MutableLiveData<java.lang.Double>) object, fieldId);
            case 1 :
                return onChangeViewModelShowPaymentSuccessView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelShowPaymentHoldOnView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelShowPaymentFailureView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelTotalPayableAmount(androidx.lifecycle.MutableLiveData<java.lang.Double> ViewModelTotalPayableAmount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowPaymentSuccessView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowPaymentSuccessView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowPaymentHoldOnView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowPaymentHoldOnView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowPaymentFailureView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowPaymentFailureView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        androidx.lifecycle.MutableLiveData<java.lang.Double> viewModelTotalPayableAmount = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowPaymentSuccessViewGetValue = false;
        java.lang.Boolean viewModelShowPaymentFailureViewGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowPaymentHoldOnViewGetValue = false;
        java.lang.Boolean viewModelShowPaymentSuccessViewGetValue = null;
        java.lang.Double viewModelTotalPayableAmountGetValue = null;
        int viewModelShowPaymentFailureViewViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowPaymentSuccessView = null;
        java.lang.Boolean viewModelShowPaymentHoldOnViewGetValue = null;
        java.lang.String javaLangStringYourPaymentOfViewModelTotalPayableAmount = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowPaymentFailureViewGetValue = false;
        java.lang.String javaLangStringYourPaymentOfViewModelTotalPayableAmountJavaLangStringHasBeenReceived = null;
        int viewModelShowPaymentSuccessViewViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowPaymentHoldOnView = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowPaymentFailureView = null;
        com.intellihealth.truemeds.presentation.viewmodel.PaymentStatusViewModel viewModel = mViewModel;
        int viewModelShowPaymentHoldOnViewViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.totalPayableAmount
                        viewModelTotalPayableAmount = viewModel.getTotalPayableAmount();
                    }
                    updateLiveDataRegistration(0, viewModelTotalPayableAmount);


                    if (viewModelTotalPayableAmount != null) {
                        // read viewModel.totalPayableAmount.getValue()
                        viewModelTotalPayableAmountGetValue = viewModelTotalPayableAmount.getValue();
                    }


                    // read ("Your payment of ₹") + (viewModel.totalPayableAmount.getValue())
                    javaLangStringYourPaymentOfViewModelTotalPayableAmount = ("Your payment of ₹") + (viewModelTotalPayableAmountGetValue);


                    // read (("Your payment of ₹") + (viewModel.totalPayableAmount.getValue())) + (" has been received")
                    javaLangStringYourPaymentOfViewModelTotalPayableAmountJavaLangStringHasBeenReceived = (javaLangStringYourPaymentOfViewModelTotalPayableAmount) + (" has been received");
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showPaymentSuccessView
                        viewModelShowPaymentSuccessView = viewModel.getShowPaymentSuccessView();
                    }
                    updateLiveDataRegistration(1, viewModelShowPaymentSuccessView);


                    if (viewModelShowPaymentSuccessView != null) {
                        // read viewModel.showPaymentSuccessView.getValue()
                        viewModelShowPaymentSuccessViewGetValue = viewModelShowPaymentSuccessView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPaymentSuccessView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowPaymentSuccessViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowPaymentSuccessViewGetValue);
                if((dirtyFlags & 0x32L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowPaymentSuccessViewGetValue) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPaymentSuccessView.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowPaymentSuccessViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowPaymentSuccessViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showPaymentHoldOnView
                        viewModelShowPaymentHoldOnView = viewModel.getShowPaymentHoldOnView();
                    }
                    updateLiveDataRegistration(2, viewModelShowPaymentHoldOnView);


                    if (viewModelShowPaymentHoldOnView != null) {
                        // read viewModel.showPaymentHoldOnView.getValue()
                        viewModelShowPaymentHoldOnViewGetValue = viewModelShowPaymentHoldOnView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPaymentHoldOnView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowPaymentHoldOnViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowPaymentHoldOnViewGetValue);
                if((dirtyFlags & 0x34L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowPaymentHoldOnViewGetValue) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPaymentHoldOnView.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowPaymentHoldOnViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowPaymentHoldOnViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showPaymentFailureView
                        viewModelShowPaymentFailureView = viewModel.getShowPaymentFailureView();
                    }
                    updateLiveDataRegistration(3, viewModelShowPaymentFailureView);


                    if (viewModelShowPaymentFailureView != null) {
                        // read viewModel.showPaymentFailureView.getValue()
                        viewModelShowPaymentFailureViewGetValue = viewModelShowPaymentFailureView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPaymentFailureView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowPaymentFailureViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowPaymentFailureViewGetValue);
                if((dirtyFlags & 0x38L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowPaymentFailureViewGetValue) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPaymentFailureView.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowPaymentFailureViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowPaymentFailureViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            this.clHoldOnView.setVisibility(viewModelShowPaymentHoldOnViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            this.clPaymentFailureView.setVisibility(viewModelShowPaymentFailureViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            this.clPaymentSuccessView.setVisibility(viewModelShowPaymentSuccessViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, javaLangStringYourPaymentOfViewModelTotalPayableAmountJavaLangStringHasBeenReceived);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.totalPayableAmount
        flag 1 (0x2L): viewModel.showPaymentSuccessView
        flag 2 (0x3L): viewModel.showPaymentHoldOnView
        flag 3 (0x4L): viewModel.showPaymentFailureView
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPaymentFailureView.getValue()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPaymentFailureView.getValue()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPaymentSuccessView.getValue()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPaymentSuccessView.getValue()) ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPaymentHoldOnView.getValue()) ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPaymentHoldOnView.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}