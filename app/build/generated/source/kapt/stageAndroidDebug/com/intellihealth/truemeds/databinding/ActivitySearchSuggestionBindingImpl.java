package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySearchSuggestionBindingImpl extends ActivitySearchSuggestionBinding implements com.intellihealth.truemeds.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(41);
        sIncludes.setIncludes(3, 
            new String[] {"shimmer_search"},
            new int[] {22},
            new int[] {com.intellihealth.truemeds.R.layout.shimmer_search});
        sIncludes.setIncludes(13, 
            new String[] {"shimmer_wallet"},
            new int[] {23},
            new int[] {com.intellihealth.truemeds.R.layout.shimmer_wallet});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.searchBar, 24);
        sViewsWithIds.put(R.id.clData, 25);
        sViewsWithIds.put(R.id.ivSearchMedicineHolder, 26);
        sViewsWithIds.put(R.id.tvSearchMessage, 27);
        sViewsWithIds.put(R.id.clRoot, 28);
        sViewsWithIds.put(R.id.tvRecentLabel, 29);
        sViewsWithIds.put(R.id.tvPreviousLabel, 30);
        sViewsWithIds.put(R.id.vPreviousGap, 31);
        sViewsWithIds.put(R.id.clTrending, 32);
        sViewsWithIds.put(R.id.tvTrendingLabel, 33);
        sViewsWithIds.put(R.id.rvTrending, 34);
        sViewsWithIds.put(R.id.ivSearchIcon, 35);
        sViewsWithIds.put(R.id.tvSreaching, 36);
        sViewsWithIds.put(R.id.clSearchNoResultInner, 37);
        sViewsWithIds.put(R.id.ivSearchNoResult, 38);
        sViewsWithIds.put(R.id.actionPharmacist, 39);
        sViewsWithIds.put(R.id.btnSeeResult, 40);
    }
    // views
    @Nullable
    private final com.intellihealth.truemeds.databinding.ShimmerWalletBinding mboundView13;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView20;
    @Nullable
    private final com.intellihealth.truemeds.databinding.ShimmerSearchBinding mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback64;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySearchSuggestionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 41, sIncludes, sViewsWithIds));
    }
    private ActivitySearchSuggestionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 8
            , (com.intellihealth.salt.views.cards.ActionCard) bindings[39]
            , (com.intellihealth.salt.views.buttons.ButtonLite) bindings[6]
            , (com.intellihealth.salt.views.buttons.Button) bindings[40]
            , (androidx.cardview.widget.CardView) bindings[21]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[25]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[28]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[37]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[32]
            , (com.intellihealth.salt.views.chip.HeaderChip) bindings[1]
            , (android.widget.ImageView) bindings[35]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[26]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[38]
            , (androidx.core.widget.NestedScrollView) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[11]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[19]
            , (androidx.recyclerview.widget.RecyclerView) bindings[34]
            , (com.intellihealth.salt.views.SearchBar) bindings[24]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[3]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[13]
            , (com.intellihealth.salt.views.TextView) bindings[18]
            , (com.intellihealth.salt.views.TextView) bindings[30]
            , (com.intellihealth.salt.views.TextView) bindings[29]
            , (com.intellihealth.salt.views.TextView) bindings[27]
            , (com.intellihealth.salt.views.TextView) bindings[16]
            , (com.intellihealth.salt.views.TextView) bindings[36]
            , (com.intellihealth.salt.views.TextView) bindings[33]
            , (android.view.View) bindings[12]
            , (android.view.View) bindings[31]
            , (android.view.View) bindings[8]
            , (android.view.View) bindings[9]
            );
        this.btnClear.setTag(null);
        this.cardBtn.setTag(null);
        this.clDefault.setTag(null);
        this.clMain.setTag(null);
        this.clNoResult.setTag(null);
        this.clPrevious.setTag(null);
        this.clRecent.setTag(null);
        this.clSearchSuggestion.setTag(null);
        this.clSearching.setTag(null);
        this.headerChip.setTag(null);
        this.mboundView13 = (com.intellihealth.truemeds.databinding.ShimmerWalletBinding) bindings[23];
        setContainedBinding(this.mboundView13);
        this.mboundView20 = (androidx.appcompat.widget.AppCompatImageView) bindings[20];
        this.mboundView20.setTag(null);
        this.mboundView3 = (com.intellihealth.truemeds.databinding.ShimmerSearchBinding) bindings[22];
        setContainedBinding(this.mboundView3);
        this.nsRoot.setTag(null);
        this.rvPrevious.setTag(null);
        this.rvRecent.setTag(null);
        this.rvSearchSuggestion.setTag(null);
        this.shimmerViewContainer.setTag(null);
        this.shimmerViewContainerPatient.setTag(null);
        this.tvDidYouMean.setTag(null);
        this.tvSearchNoResultMessage.setTag(null);
        this.vPrevious.setTag(null);
        this.vRecent.setTag(null);
        this.vRecentGap.setTag(null);
        setRootTag(root);
        // listeners
        mCallback64 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x400L;
        }
        mboundView3.invalidateAll();
        mboundView13.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView3.hasPendingBindings()) {
            return true;
        }
        if (mboundView13.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.searchUIStateConstants == variableId) {
            setSearchUIStateConstants((com.intellihealth.truemeds.data.model.search.SearchUIStateConstants) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSearchUIStateConstants(@Nullable com.intellihealth.truemeds.data.model.search.SearchUIStateConstants SearchUIStateConstants) {
        this.mSearchUIStateConstants = SearchUIStateConstants;
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView3.setLifecycleOwner(lifecycleOwner);
        mboundView13.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelTrendingSearchList((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.search.TrendingSearchResponse.TrendingSearch>>) object, fieldId);
            case 1 :
                return onChangeViewModelSearchSuggestionList((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.search.SuggestionWithType>>) object, fieldId);
            case 2 :
                return onChangeViewModelSearchUIState((androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.search.SearchUIStateConstants>) object, fieldId);
            case 3 :
                return onChangeViewModelPreviouslyViewedList((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine>>) object, fieldId);
            case 4 :
                return onChangeViewModelSearchQuery((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelIsSuggestionLoaded((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeViewModelRecentlySearchedList((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine>>) object, fieldId);
            case 7 :
                return onChangeViewModelCartItemCount((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelTrendingSearchList(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.search.TrendingSearchResponse.TrendingSearch>> ViewModelTrendingSearchList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSearchSuggestionList(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.search.SuggestionWithType>> ViewModelSearchSuggestionList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSearchUIState(androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.search.SearchUIStateConstants> ViewModelSearchUIState, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPreviouslyViewedList(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine>> ViewModelPreviouslyViewedList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSearchQuery(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelSearchQuery, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsSuggestionLoaded(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsSuggestionLoaded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRecentlySearchedList(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine>> ViewModelRecentlySearchedList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCartItemCount(androidx.lifecycle.LiveData<java.lang.Integer> ViewModelCartItemCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
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
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.search.TrendingSearchResponse.TrendingSearch>> viewModelTrendingSearchList = null;
        boolean viewModelSearchUIStateSearchUIStateConstantsSUGGESTIONVIEW = false;
        int viewModelTrendingSearchListSize = 0;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.search.SuggestionWithType>> viewModelSearchSuggestionList = null;
        int viewModelSearchUIStateSearchUIStateConstantsSUGGESTIONVIEWBooleanTrueViewModelSearchUIStateSearchUIStateConstantsDIDYOUMEANViewVISIBLEViewGONE = 0;
        java.lang.String viewModelSearchQueryGetValue = null;
        androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.search.SearchUIStateConstants> viewModelSearchUIState = null;
        int viewModelTrendingSearchListSizeInt0ViewGONEViewVISIBLE = 0;
        boolean viewModelCartItemCountInt0 = false;
        int viewModelIsSuggestionLoadedViewModelSearchSuggestionListSizeInt0BooleanFalseViewVISIBLEViewGONE = 0;
        boolean viewModelSearchUIStateSearchUIStateConstantsLOADING = false;
        boolean viewModelRecentlySearchedListSizeInt0 = false;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine>> viewModelPreviouslyViewedList = null;
        boolean viewModelIsSuggestionLoaded = false;
        boolean viewModelSearchQueryLengthInt50 = false;
        boolean viewModelSearchUIStateSearchUIStateConstantsDEFAULTVIEW = false;
        int viewModelSearchUIStateSearchUIStateConstantsSHIMMERViewVISIBLEViewGONE = 0;
        java.lang.Integer viewModelCartItemCountGetValue = null;
        java.util.List<com.intellihealth.truemeds.data.model.search.TrendingSearchResponse.TrendingSearch> viewModelTrendingSearchListGetValue = null;
        int viewModelSearchUIStateSearchUIStateConstantsLOADINGViewVISIBLEViewGONE = 0;
        int viewModelSearchSuggestionListSize = 0;
        java.lang.Boolean viewModelIsSuggestionLoadedGetValue = null;
        int viewModelSearchUIStateSearchUIStateConstantsNORECORDSViewVISIBLEViewGONE = 0;
        boolean viewModelPreviouslyViewedListSizeInt0 = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelSearchQuery = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsSuggestionLoaded1 = null;
        com.intellihealth.truemeds.data.model.search.SearchUIStateConstants viewModelSearchUIStateGetValue = null;
        int viewModelSearchUIStateSearchUIStateConstantsDEFAULTVIEWViewVISIBLEViewGONE = 0;
        boolean viewModelTrendingSearchListSizeInt0 = false;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine>> viewModelRecentlySearchedList = null;
        int viewModelPreviouslyViewedListSize = 0;
        java.util.List<com.intellihealth.truemeds.data.model.search.SuggestionWithType> viewModelSearchSuggestionListGetValue = null;
        boolean viewModelIsSuggestionLoadedViewModelSearchSuggestionListSizeInt0BooleanFalse = false;
        boolean viewModelSearchUIStateSearchUIStateConstantsDIDYOUMEAN = false;
        java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine> viewModelRecentlySearchedListGetValue = null;
        java.lang.String viewModelSearchQueryLengthInt50JavaLangStringSorryNoResultsFoundJavaLangStringOopsNoMatchesFoundForViewModelSearchQuery = null;
        boolean viewModelSearchSuggestionListSizeInt0 = false;
        int viewModelPreviouslyViewedListSizeInt0ViewVISIBLEViewGONE = 0;
        int viewModelRecentlySearchedListSizeInt0ViewVISIBLEViewGONE = 0;
        int viewModelSearchQueryLength = 0;
        int viewModelSearchUIStateSearchUIStateConstantsLOCALDATAViewVISIBLEViewGONE = 0;
        boolean viewModelSearchUIStateSearchUIStateConstantsNORECORDS = false;
        java.lang.String javaLangStringOopsNoMatchesFoundForViewModelSearchQuery = null;
        int viewModelRecentlySearchedListSize = 0;
        int viewModelCartItemCountInt0ViewGONEViewVISIBLE = 0;
        boolean viewModelSearchUIStateSearchUIStateConstantsSHIMMER = false;
        boolean viewModelSearchUIStateSearchUIStateConstantsSUGGESTIONVIEWBooleanTrueViewModelSearchUIStateSearchUIStateConstantsDIDYOUMEAN = false;
        int viewModelSearchUIStateSearchUIStateConstantsDIDYOUMEANViewVISIBLEViewGONE = 0;
        androidx.lifecycle.LiveData<java.lang.Integer> viewModelCartItemCount = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelCartItemCountGetValue = 0;
        java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine> viewModelPreviouslyViewedListGetValue = null;
        boolean viewModelSearchUIStateSearchUIStateConstantsLOCALDATA = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsSuggestionLoadedGetValue = false;
        com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x6ffL) != 0) {


            if ((dirtyFlags & 0x601L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.trendingSearchList
                        viewModelTrendingSearchList = viewModel.getTrendingSearchList();
                    }
                    updateLiveDataRegistration(0, viewModelTrendingSearchList);


                    if (viewModelTrendingSearchList != null) {
                        // read viewModel.trendingSearchList.getValue()
                        viewModelTrendingSearchListGetValue = viewModelTrendingSearchList.getValue();
                    }


                    if (viewModelTrendingSearchListGetValue != null) {
                        // read viewModel.trendingSearchList.getValue().size()
                        viewModelTrendingSearchListSize = viewModelTrendingSearchListGetValue.size();
                    }


                    // read viewModel.trendingSearchList.getValue().size() != 0
                    viewModelTrendingSearchListSizeInt0 = (viewModelTrendingSearchListSize) != (0);
                if((dirtyFlags & 0x601L) != 0) {
                    if(viewModelTrendingSearchListSizeInt0) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read viewModel.trendingSearchList.getValue().size() != 0 ? View.GONE : View.VISIBLE
                    viewModelTrendingSearchListSizeInt0ViewGONEViewVISIBLE = ((viewModelTrendingSearchListSizeInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x602L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.searchSuggestionList
                        viewModelSearchSuggestionList = viewModel.getSearchSuggestionList();
                    }
                    updateLiveDataRegistration(1, viewModelSearchSuggestionList);


                    if (viewModelSearchSuggestionList != null) {
                        // read viewModel.searchSuggestionList.getValue()
                        viewModelSearchSuggestionListGetValue = viewModelSearchSuggestionList.getValue();
                    }
            }
            if ((dirtyFlags & 0x604L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.searchUIState
                        viewModelSearchUIState = viewModel.getSearchUIState();
                    }
                    updateLiveDataRegistration(2, viewModelSearchUIState);


                    if (viewModelSearchUIState != null) {
                        // read viewModel.searchUIState.getValue()
                        viewModelSearchUIStateGetValue = viewModelSearchUIState.getValue();
                    }


                    // read viewModel.searchUIState.getValue() == SearchUIStateConstants.SUGGESTION_VIEW
                    viewModelSearchUIStateSearchUIStateConstantsSUGGESTIONVIEW = (viewModelSearchUIStateGetValue) == (com.intellihealth.truemeds.data.model.search.SearchUIStateConstants.SUGGESTION_VIEW);
                    // read viewModel.searchUIState.getValue() == SearchUIStateConstants.LOADING
                    viewModelSearchUIStateSearchUIStateConstantsLOADING = (viewModelSearchUIStateGetValue) == (com.intellihealth.truemeds.data.model.search.SearchUIStateConstants.LOADING);
                    // read viewModel.searchUIState.getValue() == SearchUIStateConstants.DEFAULT_VIEW
                    viewModelSearchUIStateSearchUIStateConstantsDEFAULTVIEW = (viewModelSearchUIStateGetValue) == (com.intellihealth.truemeds.data.model.search.SearchUIStateConstants.DEFAULT_VIEW);
                    // read viewModel.searchUIState.getValue() == SearchUIStateConstants.DID_YOU_MEAN
                    viewModelSearchUIStateSearchUIStateConstantsDIDYOUMEAN = (viewModelSearchUIStateGetValue) == (com.intellihealth.truemeds.data.model.search.SearchUIStateConstants.DID_YOU_MEAN);
                    // read viewModel.searchUIState.getValue() == SearchUIStateConstants.NO_RECORDS
                    viewModelSearchUIStateSearchUIStateConstantsNORECORDS = (viewModelSearchUIStateGetValue) == (com.intellihealth.truemeds.data.model.search.SearchUIStateConstants.NO_RECORDS);
                    // read viewModel.searchUIState.getValue() == SearchUIStateConstants.SHIMMER
                    viewModelSearchUIStateSearchUIStateConstantsSHIMMER = (viewModelSearchUIStateGetValue) == (com.intellihealth.truemeds.data.model.search.SearchUIStateConstants.SHIMMER);
                    // read viewModel.searchUIState.getValue() == SearchUIStateConstants.LOCAL_DATA
                    viewModelSearchUIStateSearchUIStateConstantsLOCALDATA = (viewModelSearchUIStateGetValue) == (com.intellihealth.truemeds.data.model.search.SearchUIStateConstants.LOCAL_DATA);
                if((dirtyFlags & 0x604L) != 0) {
                    if(viewModelSearchUIStateSearchUIStateConstantsSUGGESTIONVIEW) {
                            dirtyFlags |= 0x4000000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000000L;
                    }
                }
                if((dirtyFlags & 0x604L) != 0) {
                    if(viewModelSearchUIStateSearchUIStateConstantsLOADING) {
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                    }
                }
                if((dirtyFlags & 0x604L) != 0) {
                    if(viewModelSearchUIStateSearchUIStateConstantsDEFAULTVIEW) {
                            dirtyFlags |= 0x1000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000L;
                    }
                }
                if((dirtyFlags & 0x604L) != 0) {
                    if(viewModelSearchUIStateSearchUIStateConstantsDIDYOUMEAN) {
                            dirtyFlags |= 0x10000000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000000L;
                    }
                }
                if((dirtyFlags & 0x604L) != 0) {
                    if(viewModelSearchUIStateSearchUIStateConstantsNORECORDS) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }
                if((dirtyFlags & 0x604L) != 0) {
                    if(viewModelSearchUIStateSearchUIStateConstantsSHIMMER) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }
                if((dirtyFlags & 0x604L) != 0) {
                    if(viewModelSearchUIStateSearchUIStateConstantsLOCALDATA) {
                            dirtyFlags |= 0x400000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000L;
                    }
                }


                    // read viewModel.searchUIState.getValue() == SearchUIStateConstants.LOADING ? View.VISIBLE : View.GONE
                    viewModelSearchUIStateSearchUIStateConstantsLOADINGViewVISIBLEViewGONE = ((viewModelSearchUIStateSearchUIStateConstantsLOADING) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.searchUIState.getValue() == SearchUIStateConstants.DEFAULT_VIEW ? View.VISIBLE : View.GONE
                    viewModelSearchUIStateSearchUIStateConstantsDEFAULTVIEWViewVISIBLEViewGONE = ((viewModelSearchUIStateSearchUIStateConstantsDEFAULTVIEW) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.searchUIState.getValue() == SearchUIStateConstants.DID_YOU_MEAN ? View.VISIBLE : View.GONE
                    viewModelSearchUIStateSearchUIStateConstantsDIDYOUMEANViewVISIBLEViewGONE = ((viewModelSearchUIStateSearchUIStateConstantsDIDYOUMEAN) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.searchUIState.getValue() == SearchUIStateConstants.NO_RECORDS ? View.VISIBLE : View.GONE
                    viewModelSearchUIStateSearchUIStateConstantsNORECORDSViewVISIBLEViewGONE = ((viewModelSearchUIStateSearchUIStateConstantsNORECORDS) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.searchUIState.getValue() == SearchUIStateConstants.SHIMMER ? View.VISIBLE : View.GONE
                    viewModelSearchUIStateSearchUIStateConstantsSHIMMERViewVISIBLEViewGONE = ((viewModelSearchUIStateSearchUIStateConstantsSHIMMER) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.searchUIState.getValue() == SearchUIStateConstants.LOCAL_DATA ? View.VISIBLE : View.GONE
                    viewModelSearchUIStateSearchUIStateConstantsLOCALDATAViewVISIBLEViewGONE = ((viewModelSearchUIStateSearchUIStateConstantsLOCALDATA) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x608L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.previouslyViewedList
                        viewModelPreviouslyViewedList = viewModel.getPreviouslyViewedList();
                    }
                    updateLiveDataRegistration(3, viewModelPreviouslyViewedList);


                    if (viewModelPreviouslyViewedList != null) {
                        // read viewModel.previouslyViewedList.getValue()
                        viewModelPreviouslyViewedListGetValue = viewModelPreviouslyViewedList.getValue();
                    }


                    if (viewModelPreviouslyViewedListGetValue != null) {
                        // read viewModel.previouslyViewedList.getValue().size
                        viewModelPreviouslyViewedListSize = viewModelPreviouslyViewedListGetValue.size();
                    }


                    // read viewModel.previouslyViewedList.getValue().size > 0
                    viewModelPreviouslyViewedListSizeInt0 = (viewModelPreviouslyViewedListSize) > (0);
                if((dirtyFlags & 0x608L) != 0) {
                    if(viewModelPreviouslyViewedListSizeInt0) {
                            dirtyFlags |= 0x40000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000L;
                    }
                }


                    // read viewModel.previouslyViewedList.getValue().size > 0 ? View.VISIBLE : View.GONE
                    viewModelPreviouslyViewedListSizeInt0ViewVISIBLEViewGONE = ((viewModelPreviouslyViewedListSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x610L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.searchQuery
                        viewModelSearchQuery = viewModel.getSearchQuery();
                    }
                    updateLiveDataRegistration(4, viewModelSearchQuery);


                    if (viewModelSearchQuery != null) {
                        // read viewModel.searchQuery.getValue()
                        viewModelSearchQueryGetValue = viewModelSearchQuery.getValue();
                    }


                    if (viewModelSearchQueryGetValue != null) {
                        // read viewModel.searchQuery.getValue().length
                        viewModelSearchQueryLength = viewModelSearchQueryGetValue.length();
                    }


                    // read viewModel.searchQuery.getValue().length >= 50
                    viewModelSearchQueryLengthInt50 = (viewModelSearchQueryLength) >= (50);
                if((dirtyFlags & 0x610L) != 0) {
                    if(viewModelSearchQueryLengthInt50) {
                            dirtyFlags |= 0x10000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x622L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isSuggestionLoaded
                        ViewModelIsSuggestionLoaded1 = viewModel.isSuggestionLoaded();
                    }
                    updateLiveDataRegistration(5, ViewModelIsSuggestionLoaded1);


                    if (ViewModelIsSuggestionLoaded1 != null) {
                        // read viewModel.isSuggestionLoaded.getValue()
                        viewModelIsSuggestionLoadedGetValue = ViewModelIsSuggestionLoaded1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSuggestionLoaded.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsSuggestionLoadedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsSuggestionLoadedGetValue);


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSuggestionLoaded.getValue())
                    viewModelIsSuggestionLoaded = !androidxDatabindingViewDataBindingSafeUnboxViewModelIsSuggestionLoadedGetValue;
                if((dirtyFlags & 0x622L) != 0) {
                    if(viewModelIsSuggestionLoaded) {
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x640L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.recentlySearchedList
                        viewModelRecentlySearchedList = viewModel.getRecentlySearchedList();
                    }
                    updateLiveDataRegistration(6, viewModelRecentlySearchedList);


                    if (viewModelRecentlySearchedList != null) {
                        // read viewModel.recentlySearchedList.getValue()
                        viewModelRecentlySearchedListGetValue = viewModelRecentlySearchedList.getValue();
                    }


                    if (viewModelRecentlySearchedListGetValue != null) {
                        // read viewModel.recentlySearchedList.getValue().size
                        viewModelRecentlySearchedListSize = viewModelRecentlySearchedListGetValue.size();
                    }


                    // read viewModel.recentlySearchedList.getValue().size > 0
                    viewModelRecentlySearchedListSizeInt0 = (viewModelRecentlySearchedListSize) > (0);
                if((dirtyFlags & 0x640L) != 0) {
                    if(viewModelRecentlySearchedListSizeInt0) {
                            dirtyFlags |= 0x100000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000L;
                    }
                }


                    // read viewModel.recentlySearchedList.getValue().size > 0 ? View.VISIBLE : View.GONE
                    viewModelRecentlySearchedListSizeInt0ViewVISIBLEViewGONE = ((viewModelRecentlySearchedListSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x680L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.cartItemCount
                        viewModelCartItemCount = viewModel.getCartItemCount();
                    }
                    updateLiveDataRegistration(7, viewModelCartItemCount);


                    if (viewModelCartItemCount != null) {
                        // read viewModel.cartItemCount.getValue()
                        viewModelCartItemCountGetValue = viewModelCartItemCount.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.cartItemCount.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelCartItemCountGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelCartItemCountGetValue);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.cartItemCount.getValue()) == 0
                    viewModelCartItemCountInt0 = (androidxDatabindingViewDataBindingSafeUnboxViewModelCartItemCountGetValue) == (0);
                if((dirtyFlags & 0x680L) != 0) {
                    if(viewModelCartItemCountInt0) {
                            dirtyFlags |= 0x1000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.cartItemCount.getValue()) == 0 ? View.GONE : View.VISIBLE
                    viewModelCartItemCountInt0ViewGONEViewVISIBLE = ((viewModelCartItemCountInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x4000000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.searchSuggestionList
                    viewModelSearchSuggestionList = viewModel.getSearchSuggestionList();
                }
                updateLiveDataRegistration(1, viewModelSearchSuggestionList);


                if (viewModelSearchSuggestionList != null) {
                    // read viewModel.searchSuggestionList.getValue()
                    viewModelSearchSuggestionListGetValue = viewModelSearchSuggestionList.getValue();
                }


                if (viewModelSearchSuggestionListGetValue != null) {
                    // read viewModel.searchSuggestionList.getValue().size()
                    viewModelSearchSuggestionListSize = viewModelSearchSuggestionListGetValue.size();
                }


                // read viewModel.searchSuggestionList.getValue().size() > 0
                viewModelSearchSuggestionListSizeInt0 = (viewModelSearchSuggestionListSize) > (0);
        }
        if ((dirtyFlags & 0x8000000L) != 0) {

                // read ("Oops! No matches found for ") + (viewModel.searchQuery.getValue())
                javaLangStringOopsNoMatchesFoundForViewModelSearchQuery = ("Oops! No matches found for ") + (viewModelSearchQueryGetValue);
        }
        if ((dirtyFlags & 0x604L) != 0) {

                // read viewModel.searchUIState.getValue() == SearchUIStateConstants.SUGGESTION_VIEW ? true : viewModel.searchUIState.getValue() == SearchUIStateConstants.DID_YOU_MEAN
                viewModelSearchUIStateSearchUIStateConstantsSUGGESTIONVIEWBooleanTrueViewModelSearchUIStateSearchUIStateConstantsDIDYOUMEAN = ((viewModelSearchUIStateSearchUIStateConstantsSUGGESTIONVIEW) ? (true) : (viewModelSearchUIStateSearchUIStateConstantsDIDYOUMEAN));
            if((dirtyFlags & 0x604L) != 0) {
                if(viewModelSearchUIStateSearchUIStateConstantsSUGGESTIONVIEWBooleanTrueViewModelSearchUIStateSearchUIStateConstantsDIDYOUMEAN) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }


                // read viewModel.searchUIState.getValue() == SearchUIStateConstants.SUGGESTION_VIEW ? true : viewModel.searchUIState.getValue() == SearchUIStateConstants.DID_YOU_MEAN ? View.VISIBLE : View.GONE
                viewModelSearchUIStateSearchUIStateConstantsSUGGESTIONVIEWBooleanTrueViewModelSearchUIStateSearchUIStateConstantsDIDYOUMEANViewVISIBLEViewGONE = ((viewModelSearchUIStateSearchUIStateConstantsSUGGESTIONVIEWBooleanTrueViewModelSearchUIStateSearchUIStateConstantsDIDYOUMEAN) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }

        if ((dirtyFlags & 0x622L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSuggestionLoaded.getValue()) ? viewModel.searchSuggestionList.getValue().size() > 0 : false
                viewModelIsSuggestionLoadedViewModelSearchSuggestionListSizeInt0BooleanFalse = ((viewModelIsSuggestionLoaded) ? (viewModelSearchSuggestionListSizeInt0) : (false));
            if((dirtyFlags & 0x622L) != 0) {
                if(viewModelIsSuggestionLoadedViewModelSearchSuggestionListSizeInt0BooleanFalse) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSuggestionLoaded.getValue()) ? viewModel.searchSuggestionList.getValue().size() > 0 : false ? View.VISIBLE : View.GONE
                viewModelIsSuggestionLoadedViewModelSearchSuggestionListSizeInt0BooleanFalseViewVISIBLEViewGONE = ((viewModelIsSuggestionLoadedViewModelSearchSuggestionListSizeInt0BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x610L) != 0) {

                // read viewModel.searchQuery.getValue().length >= 50 ? "Sorry, no results found" : ("Oops! No matches found for ") + (viewModel.searchQuery.getValue())
                viewModelSearchQueryLengthInt50JavaLangStringSorryNoResultsFoundJavaLangStringOopsNoMatchesFoundForViewModelSearchQuery = ((viewModelSearchQueryLengthInt50) ? ("Sorry, no results found") : (javaLangStringOopsNoMatchesFoundForViewModelSearchQuery));
        }
        // batch finished
        if ((dirtyFlags & 0x400L) != 0) {
            // api target 1

            this.btnClear.setOnClickListener(mCallback64);
        }
        if ((dirtyFlags & 0x622L) != 0) {
            // api target 1

            this.cardBtn.setVisibility(viewModelIsSuggestionLoadedViewModelSearchSuggestionListSizeInt0BooleanFalseViewVISIBLEViewGONE);
            this.mboundView20.setVisibility(viewModelIsSuggestionLoadedViewModelSearchSuggestionListSizeInt0BooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x604L) != 0) {
            // api target 1

            this.clDefault.setVisibility(viewModelSearchUIStateSearchUIStateConstantsDEFAULTVIEWViewVISIBLEViewGONE);
            this.clNoResult.setVisibility(viewModelSearchUIStateSearchUIStateConstantsNORECORDSViewVISIBLEViewGONE);
            this.clSearchSuggestion.setVisibility(viewModelSearchUIStateSearchUIStateConstantsSUGGESTIONVIEWBooleanTrueViewModelSearchUIStateSearchUIStateConstantsDIDYOUMEANViewVISIBLEViewGONE);
            this.clSearching.setVisibility(viewModelSearchUIStateSearchUIStateConstantsLOADINGViewVISIBLEViewGONE);
            this.nsRoot.setVisibility(viewModelSearchUIStateSearchUIStateConstantsLOCALDATAViewVISIBLEViewGONE);
            this.shimmerViewContainer.setVisibility(viewModelSearchUIStateSearchUIStateConstantsSHIMMERViewVISIBLEViewGONE);
            com.intellihealth.truemeds.presentation.bindingadapter.SearchResultBindingAdapterKt.startStopAnimation(this.shimmerViewContainer, viewModelSearchUIStateSearchUIStateConstantsSHIMMER);
            this.tvDidYouMean.setVisibility(viewModelSearchUIStateSearchUIStateConstantsDIDYOUMEANViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x608L) != 0) {
            // api target 1

            this.clPrevious.setVisibility(viewModelPreviouslyViewedListSizeInt0ViewVISIBLEViewGONE);
            com.intellihealth.truemeds.presentation.bindingadapter.SearchsuggestionBindingAdapterKt.setPreviousHistoryList(this.rvPrevious, viewModelPreviouslyViewedListGetValue, viewModel);
            this.vPrevious.setVisibility(viewModelPreviouslyViewedListSizeInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x640L) != 0) {
            // api target 1

            this.clRecent.setVisibility(viewModelRecentlySearchedListSizeInt0ViewVISIBLEViewGONE);
            com.intellihealth.truemeds.presentation.bindingadapter.SearchsuggestionBindingAdapterKt.setRecentHistoryList(this.rvRecent, viewModelRecentlySearchedListGetValue, viewModel);
            this.vRecent.setVisibility(viewModelRecentlySearchedListSizeInt0ViewVISIBLEViewGONE);
            this.vRecentGap.setVisibility(viewModelRecentlySearchedListSizeInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x680L) != 0) {
            // api target 1

            this.headerChip.setVisibility(viewModelCartItemCountInt0ViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x602L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.SearchsuggestionBindingAdapterKt.setSearchSuggestionList(this.rvSearchSuggestion, viewModelSearchSuggestionListGetValue, viewModel);
        }
        if ((dirtyFlags & 0x601L) != 0) {
            // api target 1

            this.shimmerViewContainerPatient.setVisibility(viewModelTrendingSearchListSizeInt0ViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x610L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSearchNoResultMessage, viewModelSearchQueryLengthInt50JavaLangStringSorryNoResultsFoundJavaLangStringOopsNoMatchesFoundForViewModelSearchQuery);
        }
        executeBindingsOn(mboundView3);
        executeBindingsOn(mboundView13);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onClearRecentlySearch();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.trendingSearchList
        flag 1 (0x2L): viewModel.searchSuggestionList
        flag 2 (0x3L): viewModel.searchUIState
        flag 3 (0x4L): viewModel.previouslyViewedList
        flag 4 (0x5L): viewModel.searchQuery
        flag 5 (0x6L): viewModel.isSuggestionLoaded
        flag 6 (0x7L): viewModel.recentlySearchedList
        flag 7 (0x8L): viewModel.cartItemCount
        flag 8 (0x9L): searchUIStateConstants
        flag 9 (0xaL): viewModel
        flag 10 (0xbL): null
        flag 11 (0xcL): viewModel.searchUIState.getValue() == SearchUIStateConstants.SUGGESTION_VIEW ? true : viewModel.searchUIState.getValue() == SearchUIStateConstants.DID_YOU_MEAN ? View.VISIBLE : View.GONE
        flag 12 (0xdL): viewModel.searchUIState.getValue() == SearchUIStateConstants.SUGGESTION_VIEW ? true : viewModel.searchUIState.getValue() == SearchUIStateConstants.DID_YOU_MEAN ? View.VISIBLE : View.GONE
        flag 13 (0xeL): viewModel.trendingSearchList.getValue().size() != 0 ? View.GONE : View.VISIBLE
        flag 14 (0xfL): viewModel.trendingSearchList.getValue().size() != 0 ? View.GONE : View.VISIBLE
        flag 15 (0x10L): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSuggestionLoaded.getValue()) ? viewModel.searchSuggestionList.getValue().size() > 0 : false ? View.VISIBLE : View.GONE
        flag 16 (0x11L): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSuggestionLoaded.getValue()) ? viewModel.searchSuggestionList.getValue().size() > 0 : false ? View.VISIBLE : View.GONE
        flag 17 (0x12L): viewModel.searchUIState.getValue() == SearchUIStateConstants.SHIMMER ? View.VISIBLE : View.GONE
        flag 18 (0x13L): viewModel.searchUIState.getValue() == SearchUIStateConstants.SHIMMER ? View.VISIBLE : View.GONE
        flag 19 (0x14L): viewModel.searchUIState.getValue() == SearchUIStateConstants.LOADING ? View.VISIBLE : View.GONE
        flag 20 (0x15L): viewModel.searchUIState.getValue() == SearchUIStateConstants.LOADING ? View.VISIBLE : View.GONE
        flag 21 (0x16L): viewModel.searchUIState.getValue() == SearchUIStateConstants.NO_RECORDS ? View.VISIBLE : View.GONE
        flag 22 (0x17L): viewModel.searchUIState.getValue() == SearchUIStateConstants.NO_RECORDS ? View.VISIBLE : View.GONE
        flag 23 (0x18L): viewModel.searchUIState.getValue() == SearchUIStateConstants.DEFAULT_VIEW ? View.VISIBLE : View.GONE
        flag 24 (0x19L): viewModel.searchUIState.getValue() == SearchUIStateConstants.DEFAULT_VIEW ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSuggestionLoaded.getValue()) ? viewModel.searchSuggestionList.getValue().size() > 0 : false
        flag 26 (0x1bL): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSuggestionLoaded.getValue()) ? viewModel.searchSuggestionList.getValue().size() > 0 : false
        flag 27 (0x1cL): viewModel.searchQuery.getValue().length >= 50 ? "Sorry, no results found" : ("Oops! No matches found for ") + (viewModel.searchQuery.getValue())
        flag 28 (0x1dL): viewModel.searchQuery.getValue().length >= 50 ? "Sorry, no results found" : ("Oops! No matches found for ") + (viewModel.searchQuery.getValue())
        flag 29 (0x1eL): viewModel.previouslyViewedList.getValue().size > 0 ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): viewModel.previouslyViewedList.getValue().size > 0 ? View.VISIBLE : View.GONE
        flag 31 (0x20L): viewModel.recentlySearchedList.getValue().size > 0 ? View.VISIBLE : View.GONE
        flag 32 (0x21L): viewModel.recentlySearchedList.getValue().size > 0 ? View.VISIBLE : View.GONE
        flag 33 (0x22L): viewModel.searchUIState.getValue() == SearchUIStateConstants.LOCAL_DATA ? View.VISIBLE : View.GONE
        flag 34 (0x23L): viewModel.searchUIState.getValue() == SearchUIStateConstants.LOCAL_DATA ? View.VISIBLE : View.GONE
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.cartItemCount.getValue()) == 0 ? View.GONE : View.VISIBLE
        flag 36 (0x25L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.cartItemCount.getValue()) == 0 ? View.GONE : View.VISIBLE
        flag 37 (0x26L): viewModel.searchUIState.getValue() == SearchUIStateConstants.SUGGESTION_VIEW ? true : viewModel.searchUIState.getValue() == SearchUIStateConstants.DID_YOU_MEAN
        flag 38 (0x27L): viewModel.searchUIState.getValue() == SearchUIStateConstants.SUGGESTION_VIEW ? true : viewModel.searchUIState.getValue() == SearchUIStateConstants.DID_YOU_MEAN
        flag 39 (0x28L): viewModel.searchUIState.getValue() == SearchUIStateConstants.DID_YOU_MEAN ? View.VISIBLE : View.GONE
        flag 40 (0x29L): viewModel.searchUIState.getValue() == SearchUIStateConstants.DID_YOU_MEAN ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}