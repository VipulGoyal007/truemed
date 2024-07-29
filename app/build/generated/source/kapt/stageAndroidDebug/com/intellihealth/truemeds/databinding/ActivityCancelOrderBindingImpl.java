package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCancelOrderBindingImpl extends ActivityCancelOrderBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(7);
        sIncludes.setIncludes(2, 
            new String[] {"shimmer_manage_patient"},
            new int[] {5},
            new int[] {com.intellihealth.truemeds.R.layout.shimmer_manage_patient});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.divider, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @Nullable
    private final com.intellihealth.truemeds.databinding.ShimmerManagePatientBinding mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityCancelOrderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ActivityCancelOrderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (com.intellihealth.salt.views.MobileSectionHeaders) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[2]
            , (com.intellihealth.salt.views.TextView) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (com.intellihealth.truemeds.databinding.ShimmerManagePatientBinding) bindings[5];
        setContainedBinding(this.mboundView2);
        this.mobileSectionHeadersDefaultWithoutFill.setTag(null);
        this.rvCancelOrder.setTag(null);
        this.shimmerViewContainer.setTag(null);
        this.tvHeader.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        mboundView2.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView2.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.CancelOrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.CancelOrderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView2.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelCancelOrderReasonList((androidx.lifecycle.LiveData<java.util.List<com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse.Reason>>) object, fieldId);
            case 1 :
                return onChangeViewModelShowShimmer((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelShowCancelOrderReasonListView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelHeaderType((androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelCancelOrderReasonList(androidx.lifecycle.LiveData<java.util.List<com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse.Reason>> ViewModelCancelOrderReasonList, int fieldId) {
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
    private boolean onChangeViewModelShowCancelOrderReasonListView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowCancelOrderReasonListView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelHeaderType(androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> ViewModelHeaderType, int fieldId) {
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
        int viewModelShowCancelOrderReasonListViewViewVISIBLEViewGONE = 0;
        androidx.lifecycle.LiveData<java.util.List<com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse.Reason>> viewModelCancelOrderReasonList = null;
        java.util.List<com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse.Reason> viewModelCancelOrderReasonListGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerGetValue = false;
        java.lang.Boolean viewModelShowShimmerGetValue = null;
        com.intellihealth.salt.models.MobileSectionHeadersModel viewModelHeaderTypeGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowShimmer = null;
        int viewModelShowShimmerViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelShowCancelOrderReasonListViewGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowCancelOrderReasonListView = null;
        com.intellihealth.truemeds.presentation.viewmodel.CancelOrderViewModel viewModel = mViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowCancelOrderReasonListViewGetValue = false;
        androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> viewModelHeaderType = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.cancelOrderReasonList
                        viewModelCancelOrderReasonList = viewModel.getCancelOrderReasonList();
                    }
                    updateLiveDataRegistration(0, viewModelCancelOrderReasonList);


                    if (viewModelCancelOrderReasonList != null) {
                        // read viewModel.cancelOrderReasonList.getValue()
                        viewModelCancelOrderReasonListGetValue = viewModelCancelOrderReasonList.getValue();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

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
                if((dirtyFlags & 0x32L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerGetValue) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmer.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowShimmerViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showCancelOrderReasonListView
                        viewModelShowCancelOrderReasonListView = viewModel.getShowCancelOrderReasonListView();
                    }
                    updateLiveDataRegistration(2, viewModelShowCancelOrderReasonListView);


                    if (viewModelShowCancelOrderReasonListView != null) {
                        // read viewModel.showCancelOrderReasonListView.getValue()
                        viewModelShowCancelOrderReasonListViewGetValue = viewModelShowCancelOrderReasonListView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showCancelOrderReasonListView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowCancelOrderReasonListViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowCancelOrderReasonListViewGetValue);
                if((dirtyFlags & 0x34L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowCancelOrderReasonListViewGetValue) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showCancelOrderReasonListView.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowCancelOrderReasonListViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowCancelOrderReasonListViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.headerType
                        viewModelHeaderType = viewModel.getHeaderType();
                    }
                    updateLiveDataRegistration(3, viewModelHeaderType);


                    if (viewModelHeaderType != null) {
                        // read viewModel.headerType.getValue()
                        viewModelHeaderTypeGetValue = viewModelHeaderType.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            this.mobileSectionHeadersDefaultWithoutFill.setUpMobileSectionHeadersData(viewModelHeaderTypeGetValue);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            this.rvCancelOrder.setVisibility(viewModelShowCancelOrderReasonListViewViewVISIBLEViewGONE);
            this.tvHeader.setVisibility(viewModelShowCancelOrderReasonListViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.CancelOrderBindingAdapterKt.setCancelOrderReasonList(this.rvCancelOrder, viewModelCancelOrderReasonListGetValue, viewModel);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            this.shimmerViewContainer.setVisibility(viewModelShowShimmerViewVISIBLEViewGONE);
        }
        executeBindingsOn(mboundView2);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.cancelOrderReasonList
        flag 1 (0x2L): viewModel.showShimmer
        flag 2 (0x3L): viewModel.showCancelOrderReasonListView
        flag 3 (0x4L): viewModel.headerType
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showCancelOrderReasonListView.getValue()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showCancelOrderReasonListView.getValue()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmer.getValue()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmer.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}