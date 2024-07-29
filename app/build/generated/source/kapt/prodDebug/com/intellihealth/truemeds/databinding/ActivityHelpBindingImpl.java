package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityHelpBindingImpl extends ActivityHelpBinding implements com.intellihealth.truemeds.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(9);
        sIncludes.setIncludes(1, 
            new String[] {"shimmer_manage_patient"},
            new int[] {5},
            new int[] {com.intellihealth.truemeds.R.layout.shimmer_manage_patient});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tmTopHeader, 6);
        sViewsWithIds.put(R.id.llBottom, 7);
        sViewsWithIds.put(R.id.tvStillHaveQuestion, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @Nullable
    private final com.intellihealth.truemeds.databinding.ShimmerManagePatientBinding mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback43;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHelpBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ActivityHelpBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.intellihealth.salt.views.buttons.ButtonLite) bindings[4]
            , (com.google.android.flexbox.FlexboxLayout) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (com.intellihealth.salt.views.SearchBar) bindings[2]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[1]
            , (com.intellihealth.salt.views.MobileSectionHeaders) bindings[6]
            , (com.intellihealth.salt.views.TextView) bindings[8]
            );
        this.btnLinkSmall.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.intellihealth.truemeds.databinding.ShimmerManagePatientBinding) bindings[5];
        setContainedBinding(this.mboundView1);
        this.rvNeedHelpList.setTag(null);
        this.searchBar.setTag(null);
        this.shimmerViewContainer.setTag(null);
        setRootTag(root);
        // listeners
        mCallback43 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.HelpViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.HelpViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
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
                return onChangeViewModelShowHelpListView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelShowShimmer((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelHelpList((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelShowHelpListView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowHelpListView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowShimmer(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowShimmer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelHelpList(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList>> ViewModelHelpList, int fieldId) {
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
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerGetValue = false;
        java.lang.Boolean viewModelShowShimmerGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowHelpListView = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowShimmer = null;
        int viewModelShowShimmerViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList>> viewModelHelpList = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowHelpListViewGetValue = false;
        java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList> viewModelHelpListGetValue = null;
        int viewModelShowHelpListViewViewVISIBLEViewGONE = 0;
        com.intellihealth.truemeds.presentation.viewmodel.HelpViewModel viewModel = mViewModel;
        java.lang.Boolean viewModelShowHelpListViewGetValue = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showHelpListView
                        viewModelShowHelpListView = viewModel.getShowHelpListView();
                    }
                    updateLiveDataRegistration(0, viewModelShowHelpListView);


                    if (viewModelShowHelpListView != null) {
                        // read viewModel.showHelpListView.getValue()
                        viewModelShowHelpListViewGetValue = viewModelShowHelpListView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showHelpListView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowHelpListViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowHelpListViewGetValue);
                if((dirtyFlags & 0x19L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowHelpListViewGetValue) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showHelpListView.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowHelpListViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowHelpListViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showShimmer
                        viewModelShowShimmer = viewModel.getShowShimmer();
                    }
                    updateLiveDataRegistration(1, viewModelShowShimmer);


                    if (viewModelShowShimmer != null) {
                        // read viewModel.showShimmer.getValue()
                        viewModelShowShimmerGetValue = viewModelShowShimmer.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmer.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowShimmerGetValue);
                if((dirtyFlags & 0x1aL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerGetValue) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmer.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowShimmerViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.helpList
                        viewModelHelpList = viewModel.getHelpList();
                    }
                    updateLiveDataRegistration(2, viewModelHelpList);


                    if (viewModelHelpList != null) {
                        // read viewModel.helpList.getValue()
                        viewModelHelpListGetValue = viewModelHelpList.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.btnLinkSmall.setOnClickListener(mCallback43);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.rvNeedHelpList.setVisibility(viewModelShowHelpListViewViewVISIBLEViewGONE);
            this.searchBar.setVisibility(viewModelShowHelpListViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.HelpListBindingAdapterKt.setHelpList(this.rvNeedHelpList, viewModelHelpListGetValue, viewModel);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.shimmerViewContainer.setVisibility(viewModelShowShimmerViewVISIBLEViewGONE);
        }
        executeBindingsOn(mboundView1);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.intellihealth.truemeds.presentation.viewmodel.HelpViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.contactCustomerSupportClick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.showHelpListView
        flag 1 (0x2L): viewModel.showShimmer
        flag 2 (0x3L): viewModel.helpList
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmer.getValue()) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmer.getValue()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showHelpListView.getValue()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showHelpListView.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}