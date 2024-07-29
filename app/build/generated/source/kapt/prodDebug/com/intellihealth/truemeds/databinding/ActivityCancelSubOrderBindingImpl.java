package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCancelSubOrderBindingImpl extends ActivityCancelSubOrderBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(13);
        sIncludes.setIncludes(2, 
            new String[] {"shimmer_manage_patient"},
            new int[] {6},
            new int[] {com.intellihealth.truemeds.R.layout.shimmer_manage_patient});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.divider, 7);
        sViewsWithIds.put(R.id.scroll, 8);
        sViewsWithIds.put(R.id.edtOther, 9);
        sViewsWithIds.put(R.id.tvOtherErrorMsg, 10);
        sViewsWithIds.put(R.id.bottomLine, 11);
        sViewsWithIds.put(R.id.cancelOrderBtn, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @Nullable
    private final com.intellihealth.truemeds.databinding.ShimmerManagePatientBinding mboundView2;
    @NonNull
    private final android.widget.ProgressBar mboundView5;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityCancelSubOrderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityCancelSubOrderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (androidx.appcompat.widget.AppCompatImageView) bindings[11]
            , (com.intellihealth.salt.views.buttons.ButtonLite) bindings[12]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (android.widget.EditText) bindings[9]
            , (com.intellihealth.salt.views.MobileSectionHeaders) bindings[1]
            , (com.intellihealth.salt.views.radiofield.RadioList) bindings[4]
            , (androidx.core.widget.NestedScrollView) bindings[8]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[2]
            , (com.intellihealth.salt.views.TextView) bindings[3]
            , (com.intellihealth.salt.views.TextView) bindings[10]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (com.intellihealth.truemeds.databinding.ShimmerManagePatientBinding) bindings[6];
        setContainedBinding(this.mboundView2);
        this.mboundView5 = (android.widget.ProgressBar) bindings[5];
        this.mboundView5.setTag(null);
        this.mobileSectionHeadersDefaultWithoutFill.setTag(null);
        this.rvListVertical.setTag(null);
        this.shimmerViewContainer.setTag(null);
        this.tvHeader.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
        if (BR.model == variableId) {
            setModel((com.intellihealth.salt.models.RadioListModel) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.CancelOrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.intellihealth.salt.models.RadioListModel Model) {
        this.mModel = Model;
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.CancelOrderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
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
                return onChangeViewModelShowCancelOrderSubReasonListView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelIsLoading((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelHeaderType((androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel>) object, fieldId);
            case 3 :
                return onChangeViewModelShowShimmerForSubReason((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelShowCancelOrderSubReasonListView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowCancelOrderSubReasonListView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsLoading(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelIsLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelHeaderType(androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> ViewModelHeaderType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowShimmerForSubReason(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowShimmerForSubReason, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowCancelOrderSubReasonListView = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelIsLoading = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerForSubReasonGetValue = false;
        java.lang.Boolean viewModelShowShimmerForSubReasonGetValue = null;
        androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> viewModelHeaderType = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue = false;
        int viewModelShowShimmerForSubReasonViewVISIBLEViewGONE = 0;
        com.intellihealth.salt.models.MobileSectionHeadersModel viewModelHeaderTypeGetValue = null;
        java.lang.Boolean viewModelIsLoadingGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowShimmerForSubReason = null;
        int viewModelIsLoadingViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelShowCancelOrderSubReasonListViewGetValue = null;
        com.intellihealth.truemeds.presentation.viewmodel.CancelOrderViewModel viewModel = mViewModel;
        int viewModelShowCancelOrderSubReasonListViewViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowCancelOrderSubReasonListViewGetValue = false;

        if ((dirtyFlags & 0x6fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showCancelOrderSubReasonListView
                        viewModelShowCancelOrderSubReasonListView = viewModel.getShowCancelOrderSubReasonListView();
                    }
                    updateLiveDataRegistration(0, viewModelShowCancelOrderSubReasonListView);


                    if (viewModelShowCancelOrderSubReasonListView != null) {
                        // read viewModel.showCancelOrderSubReasonListView.getValue()
                        viewModelShowCancelOrderSubReasonListViewGetValue = viewModelShowCancelOrderSubReasonListView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showCancelOrderSubReasonListView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowCancelOrderSubReasonListViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowCancelOrderSubReasonListViewGetValue);
                if((dirtyFlags & 0x61L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowCancelOrderSubReasonListViewGetValue) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showCancelOrderSubReasonListView.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowCancelOrderSubReasonListViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowCancelOrderSubReasonListViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoading()
                        viewModelIsLoading = viewModel.isLoading();
                    }
                    updateLiveDataRegistration(1, viewModelIsLoading);


                    if (viewModelIsLoading != null) {
                        // read viewModel.isLoading().getValue()
                        viewModelIsLoadingGetValue = viewModelIsLoading.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading().getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsLoadingGetValue);
                if((dirtyFlags & 0x62L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading().getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsLoadingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.headerType
                        viewModelHeaderType = viewModel.getHeaderType();
                    }
                    updateLiveDataRegistration(2, viewModelHeaderType);


                    if (viewModelHeaderType != null) {
                        // read viewModel.headerType.getValue()
                        viewModelHeaderTypeGetValue = viewModelHeaderType.getValue();
                    }
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showShimmerForSubReason
                        viewModelShowShimmerForSubReason = viewModel.getShowShimmerForSubReason();
                    }
                    updateLiveDataRegistration(3, viewModelShowShimmerForSubReason);


                    if (viewModelShowShimmerForSubReason != null) {
                        // read viewModel.showShimmerForSubReason.getValue()
                        viewModelShowShimmerForSubReasonGetValue = viewModelShowShimmerForSubReason.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerForSubReason.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerForSubReasonGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowShimmerForSubReasonGetValue);
                if((dirtyFlags & 0x68L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerForSubReasonGetValue) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerForSubReason.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowShimmerForSubReasonViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerForSubReasonGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            this.mboundView5.setVisibility(viewModelIsLoadingViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            this.mobileSectionHeadersDefaultWithoutFill.setUpMobileSectionHeadersData(viewModelHeaderTypeGetValue);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            this.rvListVertical.setVisibility(viewModelShowCancelOrderSubReasonListViewViewVISIBLEViewGONE);
            this.tvHeader.setVisibility(viewModelShowCancelOrderSubReasonListViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            this.shimmerViewContainer.setVisibility(viewModelShowShimmerForSubReasonViewVISIBLEViewGONE);
        }
        executeBindingsOn(mboundView2);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.showCancelOrderSubReasonListView
        flag 1 (0x2L): viewModel.isLoading()
        flag 2 (0x3L): viewModel.headerType
        flag 3 (0x4L): viewModel.showShimmerForSubReason
        flag 4 (0x5L): model
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerForSubReason.getValue()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerForSubReason.getValue()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading().getValue()) ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading().getValue()) ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showCancelOrderSubReasonListView.getValue()) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showCancelOrderSubReasonListView.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}