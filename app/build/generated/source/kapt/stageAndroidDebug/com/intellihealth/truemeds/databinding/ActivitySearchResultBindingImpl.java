package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySearchResultBindingImpl extends ActivitySearchResultBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(15);
        sIncludes.setIncludes(8, 
            new String[] {"shimmer_search_result_page_with_item_in_card"},
            new int[] {10},
            new int[] {com.intellihealth.truemeds.R.layout.shimmer_search_result_page_with_item_in_card});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.searchBar, 11);
        sViewsWithIds.put(R.id.clSearchNoResultInner, 12);
        sViewsWithIds.put(R.id.ivSearchNoResult, 13);
        sViewsWithIds.put(R.id.actionPharmacist, 14);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @Nullable
    private final com.intellihealth.truemeds.databinding.ShimmerSearchResultPageWithItemInCardBinding mboundView8;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySearchResultBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private ActivitySearchResultBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 9
            , (com.intellihealth.salt.views.cards.ActionCard) bindings[14]
            , (com.intellihealth.salt.views.Carts) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (com.intellihealth.salt.views.chip.HeaderChip) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[13]
            , (android.widget.ProgressBar) bindings[7]
            , (com.intellihealth.salt.views.StickyNonStickyNotification) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (com.intellihealth.salt.views.SearchBar) bindings[11]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[8]
            , (com.intellihealth.salt.views.TextView) bindings[5]
            , (com.intellihealth.salt.views.TextView) bindings[3]
            );
        this.cartView.setTag(null);
        this.clNoResult.setTag(null);
        this.headerChip.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView8 = (com.intellihealth.truemeds.databinding.ShimmerSearchResultPageWithItemInCardBinding) bindings[10];
        setContainedBinding(this.mboundView8);
        this.pbLoadMore.setTag(null);
        this.promoCard.setTag(null);
        this.rvSearchResult.setTag(null);
        this.shimmerViewContainer.setTag(null);
        this.tvResultMessage.setTag(null);
        this.tvSearchNoResultMessage.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8000L;
        }
        mboundView8.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView8.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.lifeCycle == variableId) {
            setLifeCycle((androidx.lifecycle.LifecycleOwner) variable);
        }
        else if (BR.searchText == variableId) {
            setSearchText((java.lang.String) variable);
        }
        else if (BR.applyCouponData == variableId) {
            setApplyCouponData((com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon) variable);
        }
        else if (BR.fragmentManager == variableId) {
            setFragmentManager((androidx.fragment.app.FragmentManager) variable);
        }
        else if (BR.couponViewModel == variableId) {
            setCouponViewModel((com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel) variable);
        }
        else if (BR.viewmodel == variableId) {
            setViewmodel((com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLifeCycle(@Nullable androidx.lifecycle.LifecycleOwner LifeCycle) {
        this.mLifeCycle = LifeCycle;
    }
    public void setSearchText(@Nullable java.lang.String SearchText) {
        this.mSearchText = SearchText;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.searchText);
        super.requestRebind();
    }
    public void setApplyCouponData(@Nullable com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon ApplyCouponData) {
        this.mApplyCouponData = ApplyCouponData;
    }
    public void setFragmentManager(@Nullable androidx.fragment.app.FragmentManager FragmentManager) {
        this.mFragmentManager = FragmentManager;
        synchronized(this) {
            mDirtyFlags |= 0x1000L;
        }
        notifyPropertyChanged(BR.fragmentManager);
        super.requestRebind();
    }
    public void setCouponViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel CouponViewModel) {
        this.mCouponViewModel = CouponViewModel;
    }
    public void setViewmodel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x4000L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView8.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelFtcCouponData((androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon>) object, fieldId);
            case 1 :
                return onChangeViewmodelSearchResultList((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>>) object, fieldId);
            case 2 :
                return onChangeViewmodelCartItemCount((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
            case 3 :
                return onChangeViewmodelShowSearching((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewmodelTotalSearchCount((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 5 :
                return onChangeViewmodelSearchQuery((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewmodelShowProgressBar((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeViewmodelCartModel((androidx.lifecycle.LiveData<com.intellihealth.salt.models.CartModel>) object, fieldId);
            case 8 :
                return onChangeViewmodelNoResultSRP((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelFtcCouponData(androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> ViewmodelFtcCouponData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelSearchResultList(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> ViewmodelSearchResultList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelCartItemCount(androidx.lifecycle.LiveData<java.lang.Integer> ViewmodelCartItemCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelShowSearching(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewmodelShowSearching, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelTotalSearchCount(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewmodelTotalSearchCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelSearchQuery(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelSearchQuery, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelShowProgressBar(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewmodelShowProgressBar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelCartModel(androidx.lifecycle.LiveData<com.intellihealth.salt.models.CartModel> ViewmodelCartModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelNoResultSRP(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewmodelNoResultSRP, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> viewmodelFtcCouponData = null;
        boolean viewmodelSearchResultListSizeInt0 = false;
        boolean viewmodelCartItemCountInt0 = false;
        java.lang.Boolean viewmodelShowSearchingGetValue = null;
        int viewmodelSearchResultListSize = 0;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> viewmodelSearchResultList = null;
        int viewmodelSearchQueryLength = 0;
        androidx.lifecycle.LiveData<java.lang.Integer> viewmodelCartItemCount = null;
        java.lang.String javaLangStringShowingViewmodelTotalSearchCountJavaLangStringResultsFor = null;
        com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon viewmodelFtcCouponDataGetValue = null;
        int viewmodelShowSearchingBooleanTrueViewmodelSearchResultListIsEmptyViewGONEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewmodelShowSearching = null;
        boolean viewmodelFtcCouponDataJavaLangObjectNull = false;
        int viewmodelNoResultSRPBooleanTrueViewmodelFtcCouponDataJavaLangObjectNullViewGONEViewVISIBLE = 0;
        java.lang.String javaLangStringShowingViewmodelTotalSearchCountJavaLangStringResultsForSearchText = null;
        int viewmodelSearchResultListSizeInt0ViewVISIBLEViewGONE = 0;
        boolean viewmodelSearchQueryLengthInt50 = false;
        int viewmodelShowProgressBarViewVISIBLEViewGONE = 0;
        java.lang.String searchText = mSearchText;
        java.lang.String viewmodelSearchQueryLengthInt50JavaLangStringSorryNoResultsFoundJavaLangStringOopsNoMatchesFoundForSearchText = null;
        com.intellihealth.salt.models.CartModel viewmodelCartModelGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewmodelTotalSearchCount = null;
        java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> viewmodelSearchResultListGetValue = null;
        java.lang.Boolean viewmodelNoResultSRPGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewmodelCartItemCountGetValue = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelShowProgressBarGetValue = false;
        int viewmodelNoResultSRPViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelSearchQuery = null;
        boolean viewmodelNoResultSRPBooleanTrueViewmodelFtcCouponDataJavaLangObjectNull = false;
        java.lang.Boolean viewmodelShowProgressBarGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelShowSearchingGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewmodelShowProgressBar = null;
        boolean viewmodelSearchResultListIsEmpty = false;
        java.lang.Integer viewmodelTotalSearchCountGetValue = null;
        androidx.lifecycle.LiveData<com.intellihealth.salt.models.CartModel> viewmodelCartModel = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewmodelNoResultSRP = null;
        int viewmodelShowSearchingViewVISIBLEViewGONE = 0;
        int viewmodelCartItemCountInt0ViewGONEViewVISIBLE = 0;
        boolean viewmodelShowSearchingBooleanTrueViewmodelSearchResultListIsEmpty = false;
        androidx.fragment.app.FragmentManager fragmentManager = mFragmentManager;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelNoResultSRPGetValue = false;
        java.lang.String viewmodelSearchQueryGetValue = null;
        java.lang.String javaLangStringOopsNoMatchesFoundForSearchText = null;
        java.lang.String javaLangStringShowingViewmodelTotalSearchCount = null;
        java.lang.Integer viewmodelCartItemCountGetValue = null;
        com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0xc410L) != 0) {
        }
        if ((dirtyFlags & 0xd002L) != 0) {
        }
        if ((dirtyFlags & 0xd5ffL) != 0) {


            if ((dirtyFlags & 0xd002L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.searchResultList
                        viewmodelSearchResultList = viewmodel.getSearchResultList();
                    }
                    updateLiveDataRegistration(1, viewmodelSearchResultList);


                    if (viewmodelSearchResultList != null) {
                        // read viewmodel.searchResultList.getValue()
                        viewmodelSearchResultListGetValue = viewmodelSearchResultList.getValue();
                    }

                if ((dirtyFlags & 0xc002L) != 0) {

                        if (viewmodelSearchResultListGetValue != null) {
                            // read viewmodel.searchResultList.getValue().size()
                            viewmodelSearchResultListSize = viewmodelSearchResultListGetValue.size();
                        }


                        // read viewmodel.searchResultList.getValue().size() > 0
                        viewmodelSearchResultListSizeInt0 = (viewmodelSearchResultListSize) > (0);
                    if((dirtyFlags & 0xc002L) != 0) {
                        if(viewmodelSearchResultListSizeInt0) {
                                dirtyFlags |= 0x200000L;
                        }
                        else {
                                dirtyFlags |= 0x100000L;
                        }
                    }


                        // read viewmodel.searchResultList.getValue().size() > 0 ? View.VISIBLE : View.GONE
                        viewmodelSearchResultListSizeInt0ViewVISIBLEViewGONE = ((viewmodelSearchResultListSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0xc004L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.cartItemCount
                        viewmodelCartItemCount = viewmodel.getCartItemCount();
                    }
                    updateLiveDataRegistration(2, viewmodelCartItemCount);


                    if (viewmodelCartItemCount != null) {
                        // read viewmodel.cartItemCount.getValue()
                        viewmodelCartItemCountGetValue = viewmodelCartItemCount.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.cartItemCount.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelCartItemCountGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelCartItemCountGetValue);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.cartItemCount.getValue()) == 0
                    viewmodelCartItemCountInt0 = (androidxDatabindingViewDataBindingSafeUnboxViewmodelCartItemCountGetValue) == (0);
                if((dirtyFlags & 0xc004L) != 0) {
                    if(viewmodelCartItemCountInt0) {
                            dirtyFlags |= 0x200000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.cartItemCount.getValue()) == 0 ? View.GONE : View.VISIBLE
                    viewmodelCartItemCountInt0ViewGONEViewVISIBLE = ((viewmodelCartItemCountInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0xc00aL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.showSearching
                        viewmodelShowSearching = viewmodel.getShowSearching();
                    }
                    updateLiveDataRegistration(3, viewmodelShowSearching);


                    if (viewmodelShowSearching != null) {
                        // read viewmodel.showSearching.getValue()
                        viewmodelShowSearchingGetValue = viewmodelShowSearching.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showSearching.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelShowSearchingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelShowSearchingGetValue);
                if((dirtyFlags & 0xc008L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewmodelShowSearchingGetValue) {
                            dirtyFlags |= 0x80000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000L;
                    }
                }
                if((dirtyFlags & 0xc00aL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewmodelShowSearchingGetValue) {
                            dirtyFlags |= 0x800000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000000L;
                    }
                }

                if ((dirtyFlags & 0xc008L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showSearching.getValue()) ? View.VISIBLE : View.GONE
                        viewmodelShowSearchingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelShowSearchingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0xc410L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.totalSearchCount
                        viewmodelTotalSearchCount = viewmodel.getTotalSearchCount();
                    }
                    updateLiveDataRegistration(4, viewmodelTotalSearchCount);


                    if (viewmodelTotalSearchCount != null) {
                        // read viewmodel.totalSearchCount.getValue()
                        viewmodelTotalSearchCountGetValue = viewmodelTotalSearchCount.getValue();
                    }


                    // read ("Showing ") + (viewmodel.totalSearchCount.getValue())
                    javaLangStringShowingViewmodelTotalSearchCount = ("Showing ") + (viewmodelTotalSearchCountGetValue);


                    // read (("Showing ") + (viewmodel.totalSearchCount.getValue())) + (" results for ")
                    javaLangStringShowingViewmodelTotalSearchCountJavaLangStringResultsFor = (javaLangStringShowingViewmodelTotalSearchCount) + (" results for ");


                    // read ((("Showing ") + (viewmodel.totalSearchCount.getValue())) + (" results for ")) + (searchText)
                    javaLangStringShowingViewmodelTotalSearchCountJavaLangStringResultsForSearchText = (javaLangStringShowingViewmodelTotalSearchCountJavaLangStringResultsFor) + (searchText);
            }
            if ((dirtyFlags & 0xc420L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.searchQuery
                        viewmodelSearchQuery = viewmodel.getSearchQuery();
                    }
                    updateLiveDataRegistration(5, viewmodelSearchQuery);


                    if (viewmodelSearchQuery != null) {
                        // read viewmodel.searchQuery.getValue()
                        viewmodelSearchQueryGetValue = viewmodelSearchQuery.getValue();
                    }


                    if (viewmodelSearchQueryGetValue != null) {
                        // read viewmodel.searchQuery.getValue().length
                        viewmodelSearchQueryLength = viewmodelSearchQueryGetValue.length();
                    }


                    // read viewmodel.searchQuery.getValue().length >= 50
                    viewmodelSearchQueryLengthInt50 = (viewmodelSearchQueryLength) >= (50);
                if((dirtyFlags & 0xc420L) != 0) {
                    if(viewmodelSearchQueryLengthInt50) {
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000L;
                    }
                }
            }
            if ((dirtyFlags & 0xc040L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.showProgressBar
                        viewmodelShowProgressBar = viewmodel.getShowProgressBar();
                    }
                    updateLiveDataRegistration(6, viewmodelShowProgressBar);


                    if (viewmodelShowProgressBar != null) {
                        // read viewmodel.showProgressBar.getValue()
                        viewmodelShowProgressBarGetValue = viewmodelShowProgressBar.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showProgressBar.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelShowProgressBarGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelShowProgressBarGetValue);
                if((dirtyFlags & 0xc040L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewmodelShowProgressBarGetValue) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showProgressBar.getValue()) ? View.VISIBLE : View.GONE
                    viewmodelShowProgressBarViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelShowProgressBarGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc080L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.cartModel
                        viewmodelCartModel = viewmodel.getCartModel();
                    }
                    updateLiveDataRegistration(7, viewmodelCartModel);


                    if (viewmodelCartModel != null) {
                        // read viewmodel.cartModel.getValue()
                        viewmodelCartModelGetValue = viewmodelCartModel.getValue();
                    }
            }
            if ((dirtyFlags & 0xc101L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.noResultSRP
                        viewmodelNoResultSRP = viewmodel.getNoResultSRP();
                    }
                    updateLiveDataRegistration(8, viewmodelNoResultSRP);


                    if (viewmodelNoResultSRP != null) {
                        // read viewmodel.noResultSRP.getValue()
                        viewmodelNoResultSRPGetValue = viewmodelNoResultSRP.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.noResultSRP.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelNoResultSRPGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelNoResultSRPGetValue);
                if((dirtyFlags & 0xc100L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewmodelNoResultSRPGetValue) {
                            dirtyFlags |= 0x8000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000L;
                    }
                }
                if((dirtyFlags & 0xc101L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewmodelNoResultSRPGetValue) {
                            dirtyFlags |= 0x20000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000L;
                    }
                }

                if ((dirtyFlags & 0xc100L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.noResultSRP.getValue()) ? View.VISIBLE : View.GONE
                        viewmodelNoResultSRPViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelNoResultSRPGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x10000000L) != 0) {

                if (viewmodel != null) {
                    // read viewmodel.ftcCouponData
                    viewmodelFtcCouponData = viewmodel.getFtcCouponData();
                }
                updateLiveDataRegistration(0, viewmodelFtcCouponData);


                if (viewmodelFtcCouponData != null) {
                    // read viewmodel.ftcCouponData.getValue()
                    viewmodelFtcCouponDataGetValue = viewmodelFtcCouponData.getValue();
                }


                // read viewmodel.ftcCouponData.getValue() == null
                viewmodelFtcCouponDataJavaLangObjectNull = (viewmodelFtcCouponDataGetValue) == (null);
        }
        if ((dirtyFlags & 0x400000000L) != 0) {

                if (viewmodel != null) {
                    // read viewmodel.searchResultList
                    viewmodelSearchResultList = viewmodel.getSearchResultList();
                }
                updateLiveDataRegistration(1, viewmodelSearchResultList);


                if (viewmodelSearchResultList != null) {
                    // read viewmodel.searchResultList.getValue()
                    viewmodelSearchResultListGetValue = viewmodelSearchResultList.getValue();
                }


                if (viewmodelSearchResultListGetValue != null) {
                    // read viewmodel.searchResultList.getValue().isEmpty()
                    viewmodelSearchResultListIsEmpty = viewmodelSearchResultListGetValue.isEmpty();
                }
        }
        if ((dirtyFlags & 0x1000000L) != 0) {



                // read ("Oops! No matches found for ") + (searchText)
                javaLangStringOopsNoMatchesFoundForSearchText = ("Oops! No matches found for ") + (searchText);
        }

        if ((dirtyFlags & 0xc420L) != 0) {

                // read viewmodel.searchQuery.getValue().length >= 50 ? "Sorry, no results found" : ("Oops! No matches found for ") + (searchText)
                viewmodelSearchQueryLengthInt50JavaLangStringSorryNoResultsFoundJavaLangStringOopsNoMatchesFoundForSearchText = ((viewmodelSearchQueryLengthInt50) ? ("Sorry, no results found") : (javaLangStringOopsNoMatchesFoundForSearchText));
        }
        if ((dirtyFlags & 0xc101L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.noResultSRP.getValue()) ? true : viewmodel.ftcCouponData.getValue() == null
                viewmodelNoResultSRPBooleanTrueViewmodelFtcCouponDataJavaLangObjectNull = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelNoResultSRPGetValue) ? (true) : (viewmodelFtcCouponDataJavaLangObjectNull));
            if((dirtyFlags & 0xc101L) != 0) {
                if(viewmodelNoResultSRPBooleanTrueViewmodelFtcCouponDataJavaLangObjectNull) {
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x40000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.noResultSRP.getValue()) ? true : viewmodel.ftcCouponData.getValue() == null ? View.GONE : View.VISIBLE
                viewmodelNoResultSRPBooleanTrueViewmodelFtcCouponDataJavaLangObjectNullViewGONEViewVISIBLE = ((viewmodelNoResultSRPBooleanTrueViewmodelFtcCouponDataJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0xc00aL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showSearching.getValue()) ? true : viewmodel.searchResultList.getValue().isEmpty()
                viewmodelShowSearchingBooleanTrueViewmodelSearchResultListIsEmpty = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelShowSearchingGetValue) ? (true) : (viewmodelSearchResultListIsEmpty));
            if((dirtyFlags & 0xc00aL) != 0) {
                if(viewmodelShowSearchingBooleanTrueViewmodelSearchResultListIsEmpty) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showSearching.getValue()) ? true : viewmodel.searchResultList.getValue().isEmpty() ? View.GONE : View.VISIBLE
                viewmodelShowSearchingBooleanTrueViewmodelSearchResultListIsEmptyViewGONEViewVISIBLE = ((viewmodelShowSearchingBooleanTrueViewmodelSearchResultListIsEmpty) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0xc004L) != 0) {
            // api target 1

            this.cartView.setVisibility(viewmodelCartItemCountInt0ViewGONEViewVISIBLE);
            this.headerChip.setVisibility(viewmodelCartItemCountInt0ViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xc080L) != 0) {
            // api target 1

            this.cartView.setUpCartData(viewmodelCartModelGetValue);
        }
        if ((dirtyFlags & 0xc100L) != 0) {
            // api target 1

            this.clNoResult.setVisibility(viewmodelNoResultSRPViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc040L) != 0) {
            // api target 1

            this.pbLoadMore.setVisibility(viewmodelShowProgressBarViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc101L) != 0) {
            // api target 1

            this.promoCard.setVisibility(viewmodelNoResultSRPBooleanTrueViewmodelFtcCouponDataJavaLangObjectNullViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xc00aL) != 0) {
            // api target 1

            this.rvSearchResult.setVisibility(viewmodelShowSearchingBooleanTrueViewmodelSearchResultListIsEmptyViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xd002L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.SearchResultBindingAdapterKt.setSearchResulList(this.rvSearchResult, viewmodelSearchResultListGetValue, viewmodel, fragmentManager);
        }
        if ((dirtyFlags & 0xc008L) != 0) {
            // api target 1

            this.shimmerViewContainer.setVisibility(viewmodelShowSearchingViewVISIBLEViewGONE);
            com.intellihealth.truemeds.presentation.bindingadapter.SearchResultBindingAdapterKt.startStopAnimation(this.shimmerViewContainer, androidxDatabindingViewDataBindingSafeUnboxViewmodelShowSearchingGetValue);
        }
        if ((dirtyFlags & 0xc002L) != 0) {
            // api target 1

            this.tvResultMessage.setVisibility(viewmodelSearchResultListSizeInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc410L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.MyOrdersListBindingAdapterKt.commonBindingForSpanTextWithOutColor(this.tvResultMessage, javaLangStringShowingViewmodelTotalSearchCountJavaLangStringResultsForSearchText, searchText);
        }
        if ((dirtyFlags & 0xc420L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSearchNoResultMessage, viewmodelSearchQueryLengthInt50JavaLangStringSorryNoResultsFoundJavaLangStringOopsNoMatchesFoundForSearchText);
        }
        executeBindingsOn(mboundView8);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.ftcCouponData
        flag 1 (0x2L): viewmodel.searchResultList
        flag 2 (0x3L): viewmodel.cartItemCount
        flag 3 (0x4L): viewmodel.showSearching
        flag 4 (0x5L): viewmodel.totalSearchCount
        flag 5 (0x6L): viewmodel.searchQuery
        flag 6 (0x7L): viewmodel.showProgressBar
        flag 7 (0x8L): viewmodel.cartModel
        flag 8 (0x9L): viewmodel.noResultSRP
        flag 9 (0xaL): lifeCycle
        flag 10 (0xbL): searchText
        flag 11 (0xcL): applyCouponData
        flag 12 (0xdL): fragmentManager
        flag 13 (0xeL): couponViewModel
        flag 14 (0xfL): viewmodel
        flag 15 (0x10L): null
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showSearching.getValue()) ? true : viewmodel.searchResultList.getValue().isEmpty() ? View.GONE : View.VISIBLE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showSearching.getValue()) ? true : viewmodel.searchResultList.getValue().isEmpty() ? View.GONE : View.VISIBLE
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.noResultSRP.getValue()) ? true : viewmodel.ftcCouponData.getValue() == null ? View.GONE : View.VISIBLE
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.noResultSRP.getValue()) ? true : viewmodel.ftcCouponData.getValue() == null ? View.GONE : View.VISIBLE
        flag 20 (0x15L): viewmodel.searchResultList.getValue().size() > 0 ? View.VISIBLE : View.GONE
        flag 21 (0x16L): viewmodel.searchResultList.getValue().size() > 0 ? View.VISIBLE : View.GONE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showProgressBar.getValue()) ? View.VISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showProgressBar.getValue()) ? View.VISIBLE : View.GONE
        flag 24 (0x19L): viewmodel.searchQuery.getValue().length >= 50 ? "Sorry, no results found" : ("Oops! No matches found for ") + (searchText)
        flag 25 (0x1aL): viewmodel.searchQuery.getValue().length >= 50 ? "Sorry, no results found" : ("Oops! No matches found for ") + (searchText)
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.noResultSRP.getValue()) ? View.VISIBLE : View.GONE
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.noResultSRP.getValue()) ? View.VISIBLE : View.GONE
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.noResultSRP.getValue()) ? true : viewmodel.ftcCouponData.getValue() == null
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.noResultSRP.getValue()) ? true : viewmodel.ftcCouponData.getValue() == null
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showSearching.getValue()) ? View.VISIBLE : View.GONE
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showSearching.getValue()) ? View.VISIBLE : View.GONE
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.cartItemCount.getValue()) == 0 ? View.GONE : View.VISIBLE
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.cartItemCount.getValue()) == 0 ? View.GONE : View.VISIBLE
        flag 34 (0x23L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showSearching.getValue()) ? true : viewmodel.searchResultList.getValue().isEmpty()
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showSearching.getValue()) ? true : viewmodel.searchResultList.getValue().isEmpty()
    flag mapping end*/
    //end
}