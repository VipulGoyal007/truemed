package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityManageAddressBindingImpl extends ActivityManageAddressBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(8);
        sIncludes.setIncludes(1, 
            new String[] {"shimmer_manage_patient"},
            new int[] {4},
            new int[] {com.intellihealth.truemeds.R.layout.shimmer_manage_patient});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mobileSectionHeadersTextWithIcons, 5);
        sViewsWithIds.put(R.id.noAddressAddedYetImg, 6);
        sViewsWithIds.put(R.id.addAddressBtn, 7);
    }
    // views
    @Nullable
    private final com.intellihealth.truemeds.databinding.ShimmerManagePatientBinding mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityManageAddressBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityManageAddressBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (com.intellihealth.salt.views.buttons.Button) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (com.intellihealth.salt.views.MobileSectionHeaders) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[1]
            );
        this.defaultCardCl.setTag(null);
        this.mainCardCl.setTag(null);
        this.manageAddressCardRv.setTag(null);
        this.mboundView1 = (com.intellihealth.truemeds.databinding.ShimmerManagePatientBinding) bindings[4];
        setContainedBinding(this.mboundView1);
        this.shimmerViewContainer.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.manageAddressViewModel == variableId) {
            setManageAddressViewModel((com.intellihealth.truemeds.presentation.viewmodel.ManageAddressViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setManageAddressViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.ManageAddressViewModel ManageAddressViewModel) {
        this.mManageAddressViewModel = ManageAddressViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.manageAddressViewModel);
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
                return onChangeManageAddressViewModelShowManageAddressView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeManageAddressViewModelShowManageAddressListView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeManageAddressViewModelShowShimmer((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeManageAddressViewModelGetManageAddressData((androidx.lifecycle.LiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeManageAddressViewModelShowManageAddressView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ManageAddressViewModelShowManageAddressView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeManageAddressViewModelShowManageAddressListView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ManageAddressViewModelShowManageAddressListView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeManageAddressViewModelShowShimmer(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ManageAddressViewModelShowShimmer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeManageAddressViewModelGetManageAddressData(androidx.lifecycle.LiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj>> ManageAddressViewModelGetManageAddressData, int fieldId) {
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
        boolean androidxDatabindingViewDataBindingSafeUnboxManageAddressViewModelShowManageAddressViewGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> manageAddressViewModelShowManageAddressView = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxManageAddressViewModelShowShimmerGetValue = false;
        int manageAddressViewModelShowManageAddressListViewViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> manageAddressViewModelShowManageAddressListView = null;
        java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj> manageAddressViewModelGetManageAddressDataGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> manageAddressViewModelShowShimmer = null;
        com.intellihealth.truemeds.presentation.viewmodel.ManageAddressViewModel manageAddressViewModel = mManageAddressViewModel;
        java.lang.Boolean manageAddressViewModelShowManageAddressViewGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxManageAddressViewModelShowManageAddressListViewGetValue = false;
        androidx.lifecycle.LiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj>> manageAddressViewModelGetManageAddressData = null;
        int manageAddressViewModelShowManageAddressViewViewVISIBLEViewGONE = 0;
        java.lang.Boolean manageAddressViewModelShowManageAddressListViewGetValue = null;
        java.lang.Boolean manageAddressViewModelShowShimmerGetValue = null;
        int manageAddressViewModelShowShimmerViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (manageAddressViewModel != null) {
                        // read manageAddressViewModel.showManageAddressView
                        manageAddressViewModelShowManageAddressView = manageAddressViewModel.getShowManageAddressView();
                    }
                    updateLiveDataRegistration(0, manageAddressViewModelShowManageAddressView);


                    if (manageAddressViewModelShowManageAddressView != null) {
                        // read manageAddressViewModel.showManageAddressView.getValue()
                        manageAddressViewModelShowManageAddressViewGetValue = manageAddressViewModelShowManageAddressView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(manageAddressViewModel.showManageAddressView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxManageAddressViewModelShowManageAddressViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(manageAddressViewModelShowManageAddressViewGetValue);
                if((dirtyFlags & 0x31L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxManageAddressViewModelShowManageAddressViewGetValue) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(manageAddressViewModel.showManageAddressView.getValue()) ? View.VISIBLE : View.GONE
                    manageAddressViewModelShowManageAddressViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxManageAddressViewModelShowManageAddressViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (manageAddressViewModel != null) {
                        // read manageAddressViewModel.showManageAddressListView
                        manageAddressViewModelShowManageAddressListView = manageAddressViewModel.getShowManageAddressListView();
                    }
                    updateLiveDataRegistration(1, manageAddressViewModelShowManageAddressListView);


                    if (manageAddressViewModelShowManageAddressListView != null) {
                        // read manageAddressViewModel.showManageAddressListView.getValue()
                        manageAddressViewModelShowManageAddressListViewGetValue = manageAddressViewModelShowManageAddressListView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(manageAddressViewModel.showManageAddressListView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxManageAddressViewModelShowManageAddressListViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(manageAddressViewModelShowManageAddressListViewGetValue);
                if((dirtyFlags & 0x32L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxManageAddressViewModelShowManageAddressListViewGetValue) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(manageAddressViewModel.showManageAddressListView.getValue()) ? View.VISIBLE : View.GONE
                    manageAddressViewModelShowManageAddressListViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxManageAddressViewModelShowManageAddressListViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (manageAddressViewModel != null) {
                        // read manageAddressViewModel.showShimmer
                        manageAddressViewModelShowShimmer = manageAddressViewModel.getShowShimmer();
                    }
                    updateLiveDataRegistration(2, manageAddressViewModelShowShimmer);


                    if (manageAddressViewModelShowShimmer != null) {
                        // read manageAddressViewModel.showShimmer.getValue()
                        manageAddressViewModelShowShimmerGetValue = manageAddressViewModelShowShimmer.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(manageAddressViewModel.showShimmer.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxManageAddressViewModelShowShimmerGetValue = androidx.databinding.ViewDataBinding.safeUnbox(manageAddressViewModelShowShimmerGetValue);
                if((dirtyFlags & 0x34L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxManageAddressViewModelShowShimmerGetValue) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(manageAddressViewModel.showShimmer.getValue()) ? View.VISIBLE : View.GONE
                    manageAddressViewModelShowShimmerViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxManageAddressViewModelShowShimmerGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (manageAddressViewModel != null) {
                        // read manageAddressViewModel.getManageAddressData
                        manageAddressViewModelGetManageAddressData = manageAddressViewModel.getGetManageAddressData();
                    }
                    updateLiveDataRegistration(3, manageAddressViewModelGetManageAddressData);


                    if (manageAddressViewModelGetManageAddressData != null) {
                        // read manageAddressViewModel.getManageAddressData.getValue()
                        manageAddressViewModelGetManageAddressDataGetValue = manageAddressViewModelGetManageAddressData.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            this.defaultCardCl.setVisibility(manageAddressViewModelShowManageAddressViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            this.manageAddressCardRv.setVisibility(manageAddressViewModelShowManageAddressListViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.ManageAddressBindingAdapterKt.setManageAddressList(this.manageAddressCardRv, manageAddressViewModelGetManageAddressDataGetValue, manageAddressViewModel);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            this.shimmerViewContainer.setVisibility(manageAddressViewModelShowShimmerViewVISIBLEViewGONE);
        }
        executeBindingsOn(mboundView1);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): manageAddressViewModel.showManageAddressView
        flag 1 (0x2L): manageAddressViewModel.showManageAddressListView
        flag 2 (0x3L): manageAddressViewModel.showShimmer
        flag 3 (0x4L): manageAddressViewModel.getManageAddressData
        flag 4 (0x5L): manageAddressViewModel
        flag 5 (0x6L): null
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(manageAddressViewModel.showManageAddressListView.getValue()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(manageAddressViewModel.showManageAddressListView.getValue()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(manageAddressViewModel.showManageAddressView.getValue()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(manageAddressViewModel.showManageAddressView.getValue()) ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(manageAddressViewModel.showShimmer.getValue()) ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(manageAddressViewModel.showShimmer.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}