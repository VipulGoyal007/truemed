package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityHomePageBindingImpl extends ActivityHomePageBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.containerFragment, 4);
        sViewsWithIds.put(R.id.bottomNavigationView, 5);
        sViewsWithIds.put(R.id.clFooter, 6);
        sViewsWithIds.put(R.id.orderTracking, 7);
        sViewsWithIds.put(R.id.ftcCouponNotification, 8);
        sViewsWithIds.put(R.id.progressBar, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHomePageBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivityHomePageBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (com.google.android.material.bottomnavigation.BottomNavigationView) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (android.widget.FrameLayout) bindings[4]
            , (com.intellihealth.salt.views.StickyNonStickyNotification) bindings[8]
            , (com.intellihealth.salt.views.orders.OrderTracking) bindings[7]
            , (android.widget.ProgressBar) bindings[9]
            , (com.intellihealth.salt.views.Carts) bindings[1]
            , (android.view.View) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.tmCarts.setTag(null);
        this.vwClickBlocker.setTag(null);
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
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel ViewModel) {
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
                return onChangeViewModelLoaderValue((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelShowShimmerHome((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelShowBlockerVw20((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelCartModel((androidx.lifecycle.LiveData<com.intellihealth.salt.models.CartModel>) object, fieldId);
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
    private boolean onChangeViewModelShowShimmerHome(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelShowShimmerHome, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowBlockerVw20(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowBlockerVw20, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCartModel(androidx.lifecycle.LiveData<com.intellihealth.salt.models.CartModel> ViewModelCartModel, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelLoaderValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowBlockerVw20GetValue = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelShowShimmerHome = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerHomeGetValue = false;
        boolean viewModelShowShimmerHomeViewModelShowBlockerVw20BooleanFalse = false;
        com.intellihealth.salt.models.CartModel viewModelCartModelGetValue = null;
        java.lang.Boolean viewModelShowBlockerVw20GetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowBlockerVw20 = null;
        int viewModelShowShimmerHomeViewModelShowBlockerVw20BooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelShowShimmerHomeGetValue = null;
        java.lang.Boolean viewModelLoaderValueGetValue = null;
        int viewModelLoaderValueViewVISIBLEViewGONE = 0;
        androidx.lifecycle.LiveData<com.intellihealth.salt.models.CartModel> viewModelCartModel = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue = false;
        com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

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
                if((dirtyFlags & 0x31L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
                    viewModelLoaderValueViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x36L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showShimmerHome
                        viewModelShowShimmerHome = viewModel.getShowShimmerHome();
                    }
                    updateLiveDataRegistration(1, viewModelShowShimmerHome);


                    if (viewModelShowShimmerHome != null) {
                        // read viewModel.showShimmerHome.getValue()
                        viewModelShowShimmerHomeGetValue = viewModelShowShimmerHome.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerHome.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerHomeGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowShimmerHomeGetValue);
                if((dirtyFlags & 0x36L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerHomeGetValue) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.cartModel
                        viewModelCartModel = viewModel.getCartModel();
                    }
                    updateLiveDataRegistration(3, viewModelCartModel);


                    if (viewModelCartModel != null) {
                        // read viewModel.cartModel.getValue()
                        viewModelCartModelGetValue = viewModelCartModel.getValue();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x80L) != 0) {

                if (viewModel != null) {
                    // read viewModel.showBlockerVw20
                    viewModelShowBlockerVw20 = viewModel.getShowBlockerVw20();
                }
                updateLiveDataRegistration(2, viewModelShowBlockerVw20);


                if (viewModelShowBlockerVw20 != null) {
                    // read viewModel.showBlockerVw20.getValue()
                    viewModelShowBlockerVw20GetValue = viewModelShowBlockerVw20.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showBlockerVw20.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelShowBlockerVw20GetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowBlockerVw20GetValue);
        }

        if ((dirtyFlags & 0x36L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerHome.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showBlockerVw20.getValue()) : false
                viewModelShowShimmerHomeViewModelShowBlockerVw20BooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerHomeGetValue) ? (androidxDatabindingViewDataBindingSafeUnboxViewModelShowBlockerVw20GetValue) : (false));
            if((dirtyFlags & 0x36L) != 0) {
                if(viewModelShowShimmerHomeViewModelShowBlockerVw20BooleanFalse) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerHome.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showBlockerVw20.getValue()) : false ? View.VISIBLE : View.GONE
                viewModelShowShimmerHomeViewModelShowBlockerVw20BooleanFalseViewVISIBLEViewGONE = ((viewModelShowShimmerHomeViewModelShowBlockerVw20BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(viewModelLoaderValueViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            this.tmCarts.setUpCartData(viewModelCartModelGetValue);
        }
        if ((dirtyFlags & 0x36L) != 0) {
            // api target 1

            this.vwClickBlocker.setVisibility(viewModelShowShimmerHomeViewModelShowBlockerVw20BooleanFalseViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.loaderValue
        flag 1 (0x2L): viewModel.showShimmerHome
        flag 2 (0x3L): viewModel.showBlockerVw20
        flag 3 (0x4L): viewModel.cartModel
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerHome.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showBlockerVw20.getValue()) : false
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerHome.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showBlockerVw20.getValue()) : false
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerHome.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showBlockerVw20.getValue()) : false ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerHome.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showBlockerVw20.getValue()) : false ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}