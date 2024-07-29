package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCouponBindingImpl extends ActivityCouponBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.header, 7);
        sViewsWithIds.put(R.id.textAvailableOffer, 8);
        sViewsWithIds.put(R.id.imgNoCouponAvailable, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityCouponBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivityCouponBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (com.intellihealth.salt.views.edittext.InputFieldLayout) bindings[2]
            , (com.intellihealth.salt.views.MobileSectionHeaders) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[9]
            , (android.widget.ProgressBar) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (com.intellihealth.salt.views.TextView) bindings[8]
            );
        this.clCoupon.setTag(null);
        this.clNoCoupon.setTag(null);
        this.edtApplyCoupon.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.progressBar.setTag(null);
        this.recyclerViewCouponListing.setTag(null);
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
        if (BR.currentCartValue == variableId) {
            setCurrentCartValue((java.lang.Double) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCurrentCartValue(@Nullable java.lang.Double CurrentCartValue) {
        this.mCurrentCartValue = CurrentCartValue;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.currentCartValue);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel ViewModel) {
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
                return onChangeViewModelCouponList((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon>>) object, fieldId);
            case 2 :
                return onChangeViewModelErrorMsgHelper((androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData>) object, fieldId);
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
    private boolean onChangeViewModelCouponList(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon>> ViewModelCouponList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelErrorMsgHelper(androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> ViewModelErrorMsgHelper, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelLoaderValue = null;
        boolean viewModelCouponListSizeInt0 = false;
        java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> viewModelCouponListGetValue = null;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon>> viewModelCouponList = null;
        boolean ViewModelCouponListSizeInt01 = false;
        com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData viewModelErrorMsgHelperGetValue = null;
        java.lang.Double currentCartValue = mCurrentCartValue;
        int viewModelCouponListSize = 0;
        androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> viewModelErrorMsgHelper = null;
        int viewModelCouponListSizeInt0ViewGONEViewVISIBLE = 0;
        double androidxDatabindingViewDataBindingSafeUnboxCurrentCartValue = 0.0;
        java.lang.Boolean viewModelLoaderValueGetValue = null;
        int viewModelLoaderValueViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue = false;
        com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel viewModel = mViewModel;
        int viewModelLoaderValueViewGONEViewVISIBLE = 0;
        int ViewModelCouponListSizeInt0ViewGONEViewVISIBLE1 = 0;

        if ((dirtyFlags & 0x3aL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(currentCartValue)
                androidxDatabindingViewDataBindingSafeUnboxCurrentCartValue = androidx.databinding.ViewDataBinding.safeUnbox(currentCartValue);
        }
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
                            dirtyFlags |= 0x200L;
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
                    viewModelLoaderValueViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.GONE : View.VISIBLE
                    viewModelLoaderValueViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x3aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.couponList
                        viewModelCouponList = viewModel.getCouponList();
                    }
                    updateLiveDataRegistration(1, viewModelCouponList);


                    if (viewModelCouponList != null) {
                        // read viewModel.couponList.getValue()
                        viewModelCouponListGetValue = viewModelCouponList.getValue();
                    }

                if ((dirtyFlags & 0x32L) != 0) {

                        if (viewModelCouponListGetValue != null) {
                            // read viewModel.couponList.getValue().size()
                            viewModelCouponListSize = viewModelCouponListGetValue.size();
                        }


                        // read viewModel.couponList.getValue().size() > 0
                        viewModelCouponListSizeInt0 = (viewModelCouponListSize) > (0);
                        // read viewModel.couponList.getValue().size() == 0
                        ViewModelCouponListSizeInt01 = (viewModelCouponListSize) == (0);
                    if((dirtyFlags & 0x32L) != 0) {
                        if(viewModelCouponListSizeInt0) {
                                dirtyFlags |= 0x2000L;
                        }
                        else {
                                dirtyFlags |= 0x1000L;
                        }
                    }
                    if((dirtyFlags & 0x32L) != 0) {
                        if(ViewModelCouponListSizeInt01) {
                                dirtyFlags |= 0x80L;
                        }
                        else {
                                dirtyFlags |= 0x40L;
                        }
                    }


                        // read viewModel.couponList.getValue().size() > 0 ? View.GONE : View.VISIBLE
                        ViewModelCouponListSizeInt0ViewGONEViewVISIBLE1 = ((viewModelCouponListSizeInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                        // read viewModel.couponList.getValue().size() == 0 ? View.GONE : View.VISIBLE
                        viewModelCouponListSizeInt0ViewGONEViewVISIBLE = ((ViewModelCouponListSizeInt01) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.errorMsgHelper
                        viewModelErrorMsgHelper = viewModel.getErrorMsgHelper();
                    }
                    updateLiveDataRegistration(2, viewModelErrorMsgHelper);


                    if (viewModelErrorMsgHelper != null) {
                        // read viewModel.errorMsgHelper.getValue()
                        viewModelErrorMsgHelperGetValue = viewModelErrorMsgHelper.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            this.clCoupon.setVisibility(viewModelCouponListSizeInt0ViewGONEViewVISIBLE);
            this.clNoCoupon.setVisibility(ViewModelCouponListSizeInt0ViewGONEViewVISIBLE1);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.ErrorMessageBindingAdapterKt.setErrorMessage(this.edtApplyCoupon, viewModelErrorMsgHelperGetValue);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(viewModelLoaderValueViewGONEViewVISIBLE);
            this.progressBar.setVisibility(viewModelLoaderValueViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x3aL) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.CouponBindingAdapterKt.setCouponList(this.recyclerViewCouponListing, viewModelCouponListGetValue, viewModel, androidxDatabindingViewDataBindingSafeUnboxCurrentCartValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.loaderValue
        flag 1 (0x2L): viewModel.couponList
        flag 2 (0x3L): viewModel.errorMsgHelper
        flag 3 (0x4L): currentCartValue
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
        flag 6 (0x7L): viewModel.couponList.getValue().size() == 0 ? View.GONE : View.VISIBLE
        flag 7 (0x8L): viewModel.couponList.getValue().size() == 0 ? View.GONE : View.VISIBLE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.GONE : View.VISIBLE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.GONE : View.VISIBLE
        flag 12 (0xdL): viewModel.couponList.getValue().size() > 0 ? View.GONE : View.VISIBLE
        flag 13 (0xeL): viewModel.couponList.getValue().size() > 0 ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}