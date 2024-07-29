package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityOtcCategoryBindingImpl extends ActivityOtcCategoryBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.header, 12);
        sViewsWithIds.put(R.id.contentScroll, 13);
        sViewsWithIds.put(R.id.clSticky, 14);
        sViewsWithIds.put(R.id.divider, 15);
        sViewsWithIds.put(R.id.flProductList, 16);
        sViewsWithIds.put(R.id.ivNoResult, 17);
        sViewsWithIds.put(R.id.tvSearchNoResultMessage, 18);
        sViewsWithIds.put(R.id.tvTitle, 19);
        sViewsWithIds.put(R.id.tvMessage, 20);
        sViewsWithIds.put(R.id.btnCurrentLocation, 21);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityOtcCategoryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private ActivityOtcCategoryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 9
            , (com.intellihealth.salt.views.buttons.Button) bindings[21]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (com.intellihealth.truemeds.presentation.stickyscrollview.StickyScrollView) bindings[13]
            , (com.intellihealth.salt.views.cards.Divider) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (com.intellihealth.salt.views.MobileSectionHeaders) bindings[12]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[17]
            , (android.widget.ProgressBar) bindings[9]
            , (android.widget.ProgressBar) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (com.intellihealth.salt.views.Carts) bindings[11]
            , (com.intellihealth.salt.views.TopDeals) bindings[7]
            , (com.intellihealth.salt.views.TextView) bindings[20]
            , (com.intellihealth.salt.views.TextView) bindings[3]
            , (com.intellihealth.salt.views.TextView) bindings[18]
            , (com.intellihealth.salt.views.TextView) bindings[19]
            );
        this.clFooter.setTag(null);
        this.clNoResult.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar.setTag(null);
        this.progressBarEmpty.setTag(null);
        this.rvBanner.setTag(null);
        this.rvBottomProductCard.setTag(null);
        this.rvCategories.setTag(null);
        this.rvTopProductCard.setTag(null);
        this.tmCarts.setTag(null);
        this.topDeals.setTag(null);
        this.tvPrescription.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8000L;
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
        if (BR.bannerList == variableId) {
            setBannerList((java.util.List<com.intellihealth.truemeds.data.model.home.SuperCategoryModel.BannersItem>) variable);
        }
        else if (BR.selectedChild == variableId) {
            setSelectedChild((java.lang.Integer) variable);
        }
        else if (BR.callback == variableId) {
            setCallback((com.intellihealth.salt.callbacks.ProductCardCallback) variable);
        }
        else if (BR.categoryListener == variableId) {
            setCategoryListener((com.intellihealth.truemeds.presentation.callbacks.GenericCallback) variable);
        }
        else if (BR.fragmentManager == variableId) {
            setFragmentManager((androidx.fragment.app.FragmentManager) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setBannerList(@Nullable java.util.List<com.intellihealth.truemeds.data.model.home.SuperCategoryModel.BannersItem> BannerList) {
        this.mBannerList = BannerList;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.bannerList);
        super.requestRebind();
    }
    public void setSelectedChild(@Nullable java.lang.Integer SelectedChild) {
        this.mSelectedChild = SelectedChild;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.selectedChild);
        super.requestRebind();
    }
    public void setCallback(@Nullable com.intellihealth.salt.callbacks.ProductCardCallback Callback) {
        this.mCallback = Callback;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.callback);
        super.requestRebind();
    }
    public void setCategoryListener(@Nullable com.intellihealth.truemeds.presentation.callbacks.GenericCallback CategoryListener) {
        this.mCategoryListener = CategoryListener;
        synchronized(this) {
            mDirtyFlags |= 0x1000L;
        }
        notifyPropertyChanged(BR.categoryListener);
        super.requestRebind();
    }
    public void setFragmentManager(@Nullable androidx.fragment.app.FragmentManager FragmentManager) {
        this.mFragmentManager = FragmentManager;
        synchronized(this) {
            mDirtyFlags |= 0x2000L;
        }
        notifyPropertyChanged(BR.fragmentManager);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4000L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelChildCategoryList((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel>>) object, fieldId);
            case 1 :
                return onChangeViewModelIsEmptyData((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelTopDeals((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>>) object, fieldId);
            case 3 :
                return onChangeViewModelEmptyList((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>>) object, fieldId);
            case 4 :
                return onChangeViewModelCartData((androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.CartModel>) object, fieldId);
            case 5 :
                return onChangeViewModelCartModel((androidx.lifecycle.LiveData<com.intellihealth.salt.models.CartModel>) object, fieldId);
            case 6 :
                return onChangeViewModelIsLoading((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeViewModelAppliedFilterCount((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 8 :
                return onChangeViewModelProductList((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelChildCategoryList(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel>> ViewModelChildCategoryList, int fieldId) {
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
    private boolean onChangeViewModelTopDeals(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> ViewModelTopDeals, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEmptyList(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> ViewModelEmptyList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCartData(androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.CartModel> ViewModelCartData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCartModel(androidx.lifecycle.LiveData<com.intellihealth.salt.models.CartModel> ViewModelCartModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsLoading(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelIsLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAppliedFilterCount(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelAppliedFilterCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelProductList(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> ViewModelProductList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
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
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue = false;
        java.util.List<com.intellihealth.truemeds.data.model.home.SuperCategoryModel.BannersItem> bannerList = mBannerList;
        java.lang.Integer selectedChild = mSelectedChild;
        java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> viewModelProductListSubListInt6ViewModelProductListSize = null;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel>> viewModelChildCategoryList = null;
        int viewModelCartModelCountInt0ViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsEmptyData = null;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> viewModelTopDeals = null;
        com.intellihealth.salt.callbacks.ProductCardCallback callback = mCallback;
        com.intellihealth.salt.models.CartModel viewModelCartModelGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelAppliedFilterCountGetValue = 0;
        boolean viewModelTopDealsSizeInt0 = false;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> viewModelEmptyList = null;
        com.intellihealth.truemeds.presentation.callbacks.GenericCallback categoryListener = mCategoryListener;
        boolean viewModelAppliedFilterCountInt0 = false;
        java.lang.String tvPrescriptionAndroidStringFilterJavaLangStringViewModelAppliedFilterCountJavaLangString = null;
        boolean viewModelProductListSizeInt6 = false;
        int viewModelIsLoadingViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.CartModel> viewModelCartData = null;
        int androidxDatabindingViewDataBindingSafeUnboxSelectedChild = 0;
        boolean viewModelCartModelCountInt0 = false;
        java.lang.String viewModelAppliedFilterCountInt0TvPrescriptionAndroidStringFilterJavaLangStringViewModelAppliedFilterCountJavaLangStringTvPrescriptionAndroidStringFilter = null;
        androidx.lifecycle.LiveData<com.intellihealth.salt.models.CartModel> viewModelCartModel = null;
        java.lang.Integer viewModelCartModelCount = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelIsLoading = null;
        java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> viewModelProductListGetValue = null;
        java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> viewModelProductListSizeInt6ViewModelProductListSubListInt6ViewModelProductListSizeViewModelEmptyList = null;
        java.lang.Integer viewModelAppliedFilterCountGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelAppliedFilterCount = null;
        java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel> viewModelChildCategoryListGetValue = null;
        int viewModelProductListSizeInt0ViewVISIBLEViewGONE = 0;
        java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> viewModelEmptyListGetValue = null;
        java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> viewModelProductListSizeInt6ViewModelProductListSubListInt0Int6ViewModelProductList = null;
        java.lang.Boolean viewModelIsEmptyDataGetValue = null;
        boolean viewModelProductListSizeInt0 = false;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> viewModelProductList = null;
        androidx.fragment.app.FragmentManager fragmentManager = mFragmentManager;
        int viewModelProductListSize = 0;
        int viewModelTopDealsSize = 0;
        java.lang.Boolean viewModelIsLoadingGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsEmptyDataGetValue = false;
        java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> viewModelTopDealsGetValue = null;
        int viewModelIsEmptyDataViewVISIBLEViewGONE = 0;
        com.intellihealth.salt.models.CartModel viewModelCartDataGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelCartModelCount = 0;
        java.lang.String tvPrescriptionAndroidStringFilterJavaLangStringViewModelAppliedFilterCount = null;
        int viewModelIsEmptyDataViewGONEViewVISIBLE = 0;
        int viewModelTopDealsSizeInt0ViewVISIBLEViewGONE = 0;
        com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel viewModel = mViewModel;
        java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> viewModelProductListSubListInt0Int6 = null;
        int ViewModelProductListSize1 = 0;

        if ((dirtyFlags & 0xc200L) != 0) {
        }
        if ((dirtyFlags & 0xd401L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(selectedChild)
                androidxDatabindingViewDataBindingSafeUnboxSelectedChild = androidx.databinding.ViewDataBinding.safeUnbox(selectedChild);
        }
        if ((dirtyFlags & 0xe908L) != 0) {
        }
        if ((dirtyFlags & 0xffffL) != 0) {


            if ((dirtyFlags & 0xd401L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.childCategoryList
                        viewModelChildCategoryList = viewModel.getChildCategoryList();
                    }
                    updateLiveDataRegistration(0, viewModelChildCategoryList);


                    if (viewModelChildCategoryList != null) {
                        // read viewModel.childCategoryList.getValue()
                        viewModelChildCategoryListGetValue = viewModelChildCategoryList.getValue();
                    }
            }
            if ((dirtyFlags & 0xc002L) != 0) {

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
                if((dirtyFlags & 0xc002L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsEmptyDataGetValue) {
                            dirtyFlags |= 0x20000000L;
                            dirtyFlags |= 0x80000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000L;
                            dirtyFlags |= 0x40000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEmptyData.getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsEmptyDataViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsEmptyDataGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEmptyData.getValue()) ? View.GONE : View.VISIBLE
                    viewModelIsEmptyDataViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsEmptyDataGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0xc004L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.topDeals
                        viewModelTopDeals = viewModel.getTopDeals();
                    }
                    updateLiveDataRegistration(2, viewModelTopDeals);


                    if (viewModelTopDeals != null) {
                        // read viewModel.topDeals.getValue()
                        viewModelTopDealsGetValue = viewModelTopDeals.getValue();
                    }


                    if (viewModelTopDealsGetValue != null) {
                        // read viewModel.topDeals.getValue().size()
                        viewModelTopDealsSize = viewModelTopDealsGetValue.size();
                    }


                    // read viewModel.topDeals.getValue().size() > 0
                    viewModelTopDealsSizeInt0 = (viewModelTopDealsSize) > (0);
                if((dirtyFlags & 0xc004L) != 0) {
                    if(viewModelTopDealsSizeInt0) {
                            dirtyFlags |= 0x200000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000L;
                    }
                }


                    // read viewModel.topDeals.getValue().size() > 0 ? View.VISIBLE : View.GONE
                    viewModelTopDealsSizeInt0ViewVISIBLEViewGONE = ((viewModelTopDealsSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc010L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.cartData
                        viewModelCartData = viewModel.getCartData();
                    }
                    updateLiveDataRegistration(4, viewModelCartData);


                    if (viewModelCartData != null) {
                        // read viewModel.cartData.getValue()
                        viewModelCartDataGetValue = viewModelCartData.getValue();
                    }
            }
            if ((dirtyFlags & 0xc020L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.cartModel
                        viewModelCartModel = viewModel.getCartModel();
                    }
                    updateLiveDataRegistration(5, viewModelCartModel);


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
                if((dirtyFlags & 0xc020L) != 0) {
                    if(viewModelCartModelCountInt0) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.cartModel.getValue().count) > 0 ? View.VISIBLE : View.GONE
                    viewModelCartModelCountInt0ViewVISIBLEViewGONE = ((viewModelCartModelCountInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc040L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoading
                        viewModelIsLoading = viewModel.isLoading();
                    }
                    updateLiveDataRegistration(6, viewModelIsLoading);


                    if (viewModelIsLoading != null) {
                        // read viewModel.isLoading.getValue()
                        viewModelIsLoadingGetValue = viewModelIsLoading.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsLoadingGetValue);
                if((dirtyFlags & 0xc040L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsLoadingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc080L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.appliedFilterCount
                        viewModelAppliedFilterCount = viewModel.getAppliedFilterCount();
                    }
                    updateLiveDataRegistration(7, viewModelAppliedFilterCount);


                    if (viewModelAppliedFilterCount != null) {
                        // read viewModel.appliedFilterCount.getValue()
                        viewModelAppliedFilterCountGetValue = viewModelAppliedFilterCount.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.appliedFilterCount.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelAppliedFilterCountGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelAppliedFilterCountGetValue);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.appliedFilterCount.getValue()) > 0
                    viewModelAppliedFilterCountInt0 = (androidxDatabindingViewDataBindingSafeUnboxViewModelAppliedFilterCountGetValue) > (0);
                if((dirtyFlags & 0xc080L) != 0) {
                    if(viewModelAppliedFilterCountInt0) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }
            }
            if ((dirtyFlags & 0xc200L) != 0) {
            }
            if ((dirtyFlags & 0xe908L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.productList
                        viewModelProductList = viewModel.getProductList();
                    }
                    updateLiveDataRegistration(8, viewModelProductList);


                    if (viewModelProductList != null) {
                        // read viewModel.productList.getValue()
                        viewModelProductListGetValue = viewModelProductList.getValue();
                    }


                    if (viewModelProductListGetValue != null) {
                        // read viewModel.productList.getValue().size()
                        viewModelProductListSize = viewModelProductListGetValue.size();
                    }


                    // read viewModel.productList.getValue().size() > 6
                    viewModelProductListSizeInt6 = (viewModelProductListSize) > (6);
                if((dirtyFlags & 0xe908L) != 0) {
                    if(viewModelProductListSizeInt6) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }
                if((dirtyFlags & 0xe900L) != 0) {
                    if(viewModelProductListSizeInt6) {
                            dirtyFlags |= 0x8000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000L;
                    }
                }
                if ((dirtyFlags & 0xc100L) != 0) {

                        // read viewModel.productList.getValue().size() > 0
                        viewModelProductListSizeInt0 = (viewModelProductListSize) > (0);
                    if((dirtyFlags & 0xc100L) != 0) {
                        if(viewModelProductListSizeInt0) {
                                dirtyFlags |= 0x2000000L;
                        }
                        else {
                                dirtyFlags |= 0x1000000L;
                        }
                    }


                        // read viewModel.productList.getValue().size() > 0 ? View.VISIBLE : View.GONE
                        viewModelProductListSizeInt0ViewVISIBLEViewGONE = ((viewModelProductListSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x400000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.emptyList
                    viewModelEmptyList = viewModel.getEmptyList();
                }
                updateLiveDataRegistration(3, viewModelEmptyList);


                if (viewModelEmptyList != null) {
                    // read viewModel.emptyList.getValue()
                    viewModelEmptyListGetValue = viewModelEmptyList.getValue();
                }
        }
        if ((dirtyFlags & 0x200000L) != 0) {

                // read ((@android:string/filter) + (" (")) + (viewModel.appliedFilterCount.getValue())
                tvPrescriptionAndroidStringFilterJavaLangStringViewModelAppliedFilterCount = ((tvPrescription.getResources().getString(R.string.filter)) + (" (")) + (viewModelAppliedFilterCountGetValue);


                // read (((@android:string/filter) + (" (")) + (viewModel.appliedFilterCount.getValue())) + (")")
                tvPrescriptionAndroidStringFilterJavaLangStringViewModelAppliedFilterCountJavaLangString = (tvPrescriptionAndroidStringFilterJavaLangStringViewModelAppliedFilterCount) + (")");
        }
        if ((dirtyFlags & 0x8000000L) != 0) {

                if (viewModelProductListGetValue != null) {
                    // read viewModel.productList.getValue().subList(0, 6)
                    viewModelProductListSubListInt0Int6 = viewModelProductListGetValue.subList(0, 6);
                }
        }
        if ((dirtyFlags & 0x800000L) != 0) {

                if (viewModelProductListGetValue != null) {
                    // read viewModel.productList.getValue().size
                    ViewModelProductListSize1 = viewModelProductListGetValue.size();
                }


                if (viewModelProductListGetValue != null) {
                    // read viewModel.productList.getValue().subList(6, viewModel.productList.getValue().size)
                    viewModelProductListSubListInt6ViewModelProductListSize = viewModelProductListGetValue.subList(6, ViewModelProductListSize1);
                }
        }

        if ((dirtyFlags & 0xc080L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.appliedFilterCount.getValue()) > 0 ? (((@android:string/filter) + (" (")) + (viewModel.appliedFilterCount.getValue())) + (")") : @android:string/filter
                viewModelAppliedFilterCountInt0TvPrescriptionAndroidStringFilterJavaLangStringViewModelAppliedFilterCountJavaLangStringTvPrescriptionAndroidStringFilter = ((viewModelAppliedFilterCountInt0) ? (tvPrescriptionAndroidStringFilterJavaLangStringViewModelAppliedFilterCountJavaLangString) : (tvPrescription.getResources().getString(R.string.filter)));
        }
        if ((dirtyFlags & 0xe908L) != 0) {

                // read viewModel.productList.getValue().size() > 6 ? viewModel.productList.getValue().subList(6, viewModel.productList.getValue().size) : viewModel.emptyList.getValue()
                viewModelProductListSizeInt6ViewModelProductListSubListInt6ViewModelProductListSizeViewModelEmptyList = ((viewModelProductListSizeInt6) ? (viewModelProductListSubListInt6ViewModelProductListSize) : (viewModelEmptyListGetValue));
        }
        if ((dirtyFlags & 0xe900L) != 0) {

                // read viewModel.productList.getValue().size() > 6 ? viewModel.productList.getValue().subList(0, 6) : viewModel.productList.getValue()
                viewModelProductListSizeInt6ViewModelProductListSubListInt0Int6ViewModelProductList = ((viewModelProductListSizeInt6) ? (viewModelProductListSubListInt0Int6) : (viewModelProductListGetValue));
        }
        // batch finished
        if ((dirtyFlags & 0xc020L) != 0) {
            // api target 1

            this.clFooter.setVisibility(viewModelCartModelCountInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc002L) != 0) {
            // api target 1

            this.clNoResult.setVisibility(viewModelIsEmptyDataViewVISIBLEViewGONE);
            this.progressBarEmpty.setVisibility(viewModelIsEmptyDataViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xc040L) != 0) {
            // api target 1

            this.progressBar.setVisibility(viewModelIsLoadingViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc200L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.HomeBindingAdapterKt.setBanner(this.rvBanner, bannerList, viewModel);
        }
        if ((dirtyFlags & 0xc100L) != 0) {
            // api target 1

            this.rvBottomProductCard.setVisibility(viewModelProductListSizeInt0ViewVISIBLEViewGONE);
            this.rvTopProductCard.setVisibility(viewModelProductListSizeInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xe908L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.HomeBindingAdapterKt.setProductGrid(this.rvBottomProductCard, viewModelProductListSizeInt6ViewModelProductListSubListInt6ViewModelProductListSizeViewModelEmptyList, callback, viewModel, fragmentManager);
        }
        if ((dirtyFlags & 0xd401L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.HomeBindingAdapterKt.setPersonalCareList(this.rvCategories, viewModelChildCategoryListGetValue, categoryListener, androidxDatabindingViewDataBindingSafeUnboxSelectedChild);
        }
        if ((dirtyFlags & 0xe900L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.HomeBindingAdapterKt.setProductGrid(this.rvTopProductCard, viewModelProductListSizeInt6ViewModelProductListSubListInt0Int6ViewModelProductList, callback, viewModel, fragmentManager);
        }
        if ((dirtyFlags & 0xc010L) != 0) {
            // api target 1

            this.tmCarts.setUpCartData(viewModelCartDataGetValue);
        }
        if ((dirtyFlags & 0xc004L) != 0) {
            // api target 1

            this.topDeals.setVisibility(viewModelTopDealsSizeInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc080L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPrescription, viewModelAppliedFilterCountInt0TvPrescriptionAndroidStringFilterJavaLangStringViewModelAppliedFilterCountJavaLangStringTvPrescriptionAndroidStringFilter);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.childCategoryList
        flag 1 (0x2L): viewModel.isEmptyData
        flag 2 (0x3L): viewModel.topDeals
        flag 3 (0x4L): viewModel.emptyList
        flag 4 (0x5L): viewModel.cartData
        flag 5 (0x6L): viewModel.cartModel
        flag 6 (0x7L): viewModel.isLoading
        flag 7 (0x8L): viewModel.appliedFilterCount
        flag 8 (0x9L): viewModel.productList
        flag 9 (0xaL): bannerList
        flag 10 (0xbL): selectedChild
        flag 11 (0xcL): callback
        flag 12 (0xdL): categoryListener
        flag 13 (0xeL): fragmentManager
        flag 14 (0xfL): viewModel
        flag 15 (0x10L): null
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.cartModel.getValue().count) > 0 ? View.VISIBLE : View.GONE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.cartModel.getValue().count) > 0 ? View.VISIBLE : View.GONE
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue()) ? View.VISIBLE : View.GONE
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue()) ? View.VISIBLE : View.GONE
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.appliedFilterCount.getValue()) > 0 ? (((@android:string/filter) + (" (")) + (viewModel.appliedFilterCount.getValue())) + (")") : @android:string/filter
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.appliedFilterCount.getValue()) > 0 ? (((@android:string/filter) + (" (")) + (viewModel.appliedFilterCount.getValue())) + (")") : @android:string/filter
        flag 22 (0x17L): viewModel.productList.getValue().size() > 6 ? viewModel.productList.getValue().subList(6, viewModel.productList.getValue().size) : viewModel.emptyList.getValue()
        flag 23 (0x18L): viewModel.productList.getValue().size() > 6 ? viewModel.productList.getValue().subList(6, viewModel.productList.getValue().size) : viewModel.emptyList.getValue()
        flag 24 (0x19L): viewModel.productList.getValue().size() > 0 ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): viewModel.productList.getValue().size() > 0 ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): viewModel.productList.getValue().size() > 6 ? viewModel.productList.getValue().subList(0, 6) : viewModel.productList.getValue()
        flag 27 (0x1cL): viewModel.productList.getValue().size() > 6 ? viewModel.productList.getValue().subList(0, 6) : viewModel.productList.getValue()
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEmptyData.getValue()) ? View.VISIBLE : View.GONE
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEmptyData.getValue()) ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEmptyData.getValue()) ? View.GONE : View.VISIBLE
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEmptyData.getValue()) ? View.GONE : View.VISIBLE
        flag 32 (0x21L): viewModel.topDeals.getValue().size() > 0 ? View.VISIBLE : View.GONE
        flag 33 (0x22L): viewModel.topDeals.getValue().size() > 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}