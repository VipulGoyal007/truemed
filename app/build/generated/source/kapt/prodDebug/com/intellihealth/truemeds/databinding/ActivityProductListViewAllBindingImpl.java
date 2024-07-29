package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityProductListViewAllBindingImpl extends ActivityProductListViewAllBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(15);
        sIncludes.setIncludes(1, 
            new String[] {"shimmer_manage_patient"},
            new int[] {7},
            new int[] {com.intellihealth.truemeds.R.layout.shimmer_manage_patient});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mobileSectionHeadersTextWithCTA, 8);
        sViewsWithIds.put(R.id.rvProductCardChips, 9);
        sViewsWithIds.put(R.id.ivNoResult, 10);
        sViewsWithIds.put(R.id.tvSearchNoResultMessage, 11);
        sViewsWithIds.put(R.id.tvTitle, 12);
        sViewsWithIds.put(R.id.tvMessage, 13);
        sViewsWithIds.put(R.id.btnCurrentLocation, 14);
    }
    // views
    @Nullable
    private final com.intellihealth.truemeds.databinding.ShimmerManagePatientBinding mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityProductListViewAllBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private ActivityProductListViewAllBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (com.intellihealth.salt.views.buttons.Button) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[10]
            , (com.intellihealth.salt.views.MobileSectionHeaders) bindings[8]
            , (android.widget.ProgressBar) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[9]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[1]
            , (com.intellihealth.salt.views.Carts) bindings[6]
            , (com.intellihealth.salt.views.TextView) bindings[13]
            , (com.intellihealth.salt.views.TextView) bindings[11]
            , (com.intellihealth.salt.views.TextView) bindings[12]
            );
        this.clFooter.setTag(null);
        this.clMainLayout.setTag(null);
        this.clNoResult.setTag(null);
        this.mboundView1 = (com.intellihealth.truemeds.databinding.ShimmerManagePatientBinding) bindings[7];
        setContainedBinding(this.mboundView1);
        this.progressBar.setTag(null);
        this.rvProductList.setTag(null);
        this.shimmerViewContainer.setTag(null);
        this.tmCarts.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2000L;
        }
        mboundView1.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView1.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.selectedChild == variableId) {
            setSelectedChild((java.lang.Integer) variable);
        }
        else if (BR.callback == variableId) {
            setCallback((com.intellihealth.salt.callbacks.ProductCardCallback) variable);
        }
        else if (BR.categoryListener == variableId) {
            setCategoryListener((com.intellihealth.truemeds.presentation.callbacks.GenericCallback) variable);
        }
        else if (BR.productCardCallback == variableId) {
            setProductCardCallback((com.intellihealth.salt.callbacks.ProductCardCallback) variable);
        }
        else if (BR.fragmentManager == variableId) {
            setFragmentManager((androidx.fragment.app.FragmentManager) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.ProductListViewAllViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSelectedChild(@Nullable java.lang.Integer SelectedChild) {
        this.mSelectedChild = SelectedChild;
    }
    public void setCallback(@Nullable com.intellihealth.salt.callbacks.ProductCardCallback Callback) {
        this.mCallback = Callback;
    }
    public void setCategoryListener(@Nullable com.intellihealth.truemeds.presentation.callbacks.GenericCallback CategoryListener) {
        this.mCategoryListener = CategoryListener;
    }
    public void setProductCardCallback(@Nullable com.intellihealth.salt.callbacks.ProductCardCallback ProductCardCallback) {
        this.mProductCardCallback = ProductCardCallback;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.productCardCallback);
        super.requestRebind();
    }
    public void setFragmentManager(@Nullable androidx.fragment.app.FragmentManager FragmentManager) {
        this.mFragmentManager = FragmentManager;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.fragmentManager);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.ProductListViewAllViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1000L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView1.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelShowProgressBar((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelIsEmptyData((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelShowProductListView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelCartData((androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.CartModel>) object, fieldId);
            case 4 :
                return onChangeViewModelCartModel((androidx.lifecycle.LiveData<com.intellihealth.salt.models.CartModel>) object, fieldId);
            case 5 :
                return onChangeViewModelShowShimmerLiveData((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeViewModelProductListObserved((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelShowProgressBar(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowProgressBar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsEmptyData(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsEmptyData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowProductListView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowProductListView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCartData(androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.CartModel> ViewModelCartData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCartModel(androidx.lifecycle.LiveData<com.intellihealth.salt.models.CartModel> ViewModelCartModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowShimmerLiveData(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelShowShimmerLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelProductListObserved(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> ViewModelProductListObserved, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowProgressBar = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerLiveDataGetValue = false;
        java.lang.Boolean viewModelShowProgressBarGetValue = null;
        int viewModelCartModelCountInt0ViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsEmptyData = null;
        java.lang.Boolean viewModelShowProductListViewGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowProductListView = null;
        com.intellihealth.salt.models.CartModel viewModelCartModelGetValue = null;
        java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> viewModelProductListObservedGetValue = null;
        androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.CartModel> viewModelCartData = null;
        int viewModelShowProgressBarViewVISIBLEViewGONE = 0;
        boolean viewModelCartModelCountInt0 = false;
        int viewModelShowShimmerLiveDataViewVISIBLEViewGONE = 0;
        com.intellihealth.salt.callbacks.ProductCardCallback productCardCallback = mProductCardCallback;
        androidx.lifecycle.LiveData<com.intellihealth.salt.models.CartModel> viewModelCartModel = null;
        java.lang.Integer viewModelCartModelCount = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelShowShimmerLiveData = null;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> viewModelProductListObserved = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowProgressBarGetValue = false;
        int viewModelShowProductListViewViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelIsEmptyDataGetValue = null;
        java.lang.Boolean viewModelShowShimmerLiveDataGetValue = null;
        androidx.fragment.app.FragmentManager fragmentManager = mFragmentManager;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsEmptyDataGetValue = false;
        int viewModelIsEmptyDataViewVISIBLEViewGONE = 0;
        com.intellihealth.salt.models.CartModel viewModelCartDataGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelCartModelCount = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowProductListViewGetValue = false;
        com.intellihealth.truemeds.presentation.viewmodel.ProductListViewAllViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3c40L) != 0) {
        }
        if ((dirtyFlags & 0x3c7fL) != 0) {


            if ((dirtyFlags & 0x3001L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showProgressBar
                        viewModelShowProgressBar = viewModel.getShowProgressBar();
                    }
                    updateLiveDataRegistration(0, viewModelShowProgressBar);


                    if (viewModelShowProgressBar != null) {
                        // read viewModel.showProgressBar.getValue()
                        viewModelShowProgressBarGetValue = viewModelShowProgressBar.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showProgressBar.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowProgressBarGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowProgressBarGetValue);
                if((dirtyFlags & 0x3001L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowProgressBarGetValue) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showProgressBar.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowProgressBarViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowProgressBarGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x3002L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isEmptyData
                        viewModelIsEmptyData = viewModel.isEmptyData();
                    }
                    updateLiveDataRegistration(1, viewModelIsEmptyData);


                    if (viewModelIsEmptyData != null) {
                        // read viewModel.isEmptyData.getValue()
                        viewModelIsEmptyDataGetValue = viewModelIsEmptyData.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEmptyData.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsEmptyDataGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsEmptyDataGetValue);
                if((dirtyFlags & 0x3002L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsEmptyDataGetValue) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEmptyData.getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsEmptyDataViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsEmptyDataGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x3004L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showProductListView
                        viewModelShowProductListView = viewModel.getShowProductListView();
                    }
                    updateLiveDataRegistration(2, viewModelShowProductListView);


                    if (viewModelShowProductListView != null) {
                        // read viewModel.showProductListView.getValue()
                        viewModelShowProductListViewGetValue = viewModelShowProductListView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showProductListView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowProductListViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowProductListViewGetValue);
                if((dirtyFlags & 0x3004L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowProductListViewGetValue) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showProductListView.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowProductListViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowProductListViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x3008L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.cartData
                        viewModelCartData = viewModel.getCartData();
                    }
                    updateLiveDataRegistration(3, viewModelCartData);


                    if (viewModelCartData != null) {
                        // read viewModel.cartData.getValue()
                        viewModelCartDataGetValue = viewModelCartData.getValue();
                    }
            }
            if ((dirtyFlags & 0x3010L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.cartModel
                        viewModelCartModel = viewModel.getCartModel();
                    }
                    updateLiveDataRegistration(4, viewModelCartModel);


                    if (viewModelCartModel != null) {
                        // read viewModel.cartModel.getValue()
                        viewModelCartModelGetValue = viewModelCartModel.getValue();
                    }


                    if (viewModelCartModelGetValue != null) {
                        // read viewModel.cartModel.getValue().count
                        viewModelCartModelCount = viewModelCartModelGetValue.getCount();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.cartModel.getValue().count)
                    androidxDatabindingViewDataBindingSafeUnboxViewModelCartModelCount = androidx.databinding.ViewDataBinding.safeUnbox(viewModelCartModelCount);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.cartModel.getValue().count) > 0
                    viewModelCartModelCountInt0 = (androidxDatabindingViewDataBindingSafeUnboxViewModelCartModelCount) > (0);
                if((dirtyFlags & 0x3010L) != 0) {
                    if(viewModelCartModelCountInt0) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.cartModel.getValue().count) > 0 ? View.VISIBLE : View.GONE
                    viewModelCartModelCountInt0ViewVISIBLEViewGONE = ((viewModelCartModelCountInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x3020L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showShimmerLiveData
                        viewModelShowShimmerLiveData = viewModel.getShowShimmerLiveData();
                    }
                    updateLiveDataRegistration(5, viewModelShowShimmerLiveData);


                    if (viewModelShowShimmerLiveData != null) {
                        // read viewModel.showShimmerLiveData.getValue()
                        viewModelShowShimmerLiveDataGetValue = viewModelShowShimmerLiveData.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerLiveData.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerLiveDataGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowShimmerLiveDataGetValue);
                if((dirtyFlags & 0x3020L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerLiveDataGetValue) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerLiveData.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowShimmerLiveDataViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerLiveDataGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x3c40L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.productListObserved
                        viewModelProductListObserved = viewModel.getProductListObserved();
                    }
                    updateLiveDataRegistration(6, viewModelProductListObserved);


                    if (viewModelProductListObserved != null) {
                        // read viewModel.productListObserved.getValue()
                        viewModelProductListObservedGetValue = viewModelProductListObserved.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x3010L) != 0) {
            // api target 1

            this.clFooter.setVisibility(viewModelCartModelCountInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x3002L) != 0) {
            // api target 1

            this.clNoResult.setVisibility(viewModelIsEmptyDataViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x3001L) != 0) {
            // api target 1

            this.progressBar.setVisibility(viewModelShowProgressBarViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x3004L) != 0) {
            // api target 1

            this.rvProductList.setVisibility(viewModelShowProductListViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x3c40L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.ProductListViewAllBindingAdapterKt.setProductListViewAllList(this.rvProductList, viewModelProductListObservedGetValue, viewModel, productCardCallback, fragmentManager);
        }
        if ((dirtyFlags & 0x3020L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.SearchResultBindingAdapterKt.startStopAnimation(this.shimmerViewContainer, androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerLiveDataGetValue);
            this.shimmerViewContainer.setVisibility(viewModelShowShimmerLiveDataViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x3008L) != 0) {
            // api target 1

            this.tmCarts.setUpCartData(viewModelCartDataGetValue);
        }
        executeBindingsOn(mboundView1);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.showProgressBar
        flag 1 (0x2L): viewModel.isEmptyData
        flag 2 (0x3L): viewModel.showProductListView
        flag 3 (0x4L): viewModel.cartData
        flag 4 (0x5L): viewModel.cartModel
        flag 5 (0x6L): viewModel.showShimmerLiveData
        flag 6 (0x7L): viewModel.productListObserved
        flag 7 (0x8L): selectedChild
        flag 8 (0x9L): callback
        flag 9 (0xaL): categoryListener
        flag 10 (0xbL): productCardCallback
        flag 11 (0xcL): fragmentManager
        flag 12 (0xdL): viewModel
        flag 13 (0xeL): null
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.cartModel.getValue().count) > 0 ? View.VISIBLE : View.GONE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.cartModel.getValue().count) > 0 ? View.VISIBLE : View.GONE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showProgressBar.getValue()) ? View.VISIBLE : View.GONE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showProgressBar.getValue()) ? View.VISIBLE : View.GONE
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerLiveData.getValue()) ? View.VISIBLE : View.GONE
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerLiveData.getValue()) ? View.VISIBLE : View.GONE
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showProductListView.getValue()) ? View.VISIBLE : View.GONE
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showProductListView.getValue()) ? View.VISIBLE : View.GONE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEmptyData.getValue()) ? View.VISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEmptyData.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}