package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOrdersBindingImpl extends FragmentOrdersBinding implements com.intellihealth.truemeds.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(12);
        sIncludes.setIncludes(4, 
            new String[] {"shimmer_my_order"},
            new int[] {7},
            new int[] {com.intellihealth.truemeds.R.layout.shimmer_my_order});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.header, 8);
        sViewsWithIds.put(R.id.clTopList, 9);
        sViewsWithIds.put(R.id.swipe_to_refresh, 10);
        sViewsWithIds.put(R.id.ivNoPatientYet, 11);
    }
    // views
    @Nullable
    private final com.intellihealth.truemeds.databinding.ShimmerMyOrderBinding mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback21;
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    @Nullable
    private final android.view.View.OnClickListener mCallback22;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentOrdersBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentOrdersBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (com.intellihealth.salt.views.buttons.Button) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (com.intellihealth.salt.views.MobileSectionHeaders) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[4]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[10]
            , (com.intellihealth.salt.views.dropdown.DropDownHeader) bindings[1]
            , (com.intellihealth.salt.views.dropdown.DropDownHeader) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            );
        this.btnAddNewPatients.setTag(null);
        this.mboundView4 = (com.intellihealth.truemeds.databinding.ShimmerMyOrderBinding) bindings[7];
        setContainedBinding(this.mboundView4);
        this.rlNoPatientView.setTag(null);
        this.rvOrderList.setTag(null);
        this.shimmerViewContainer.setTag(null);
        this.tmDropDownOrders.setTag(null);
        this.tmDropDownPatient.setTag(null);
        this.userWithoutLogin.setTag(null);
        setRootTag(root);
        // listeners
        mCallback21 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 2);
        mCallback20 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 1);
        mCallback22 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
        }
        mboundView4.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView4.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView4.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelShowNoOrdersView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelIsLoggedIn((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelShowShimmer((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelShowDropDownPatient((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewModelMyOrdersList((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders>>) object, fieldId);
            case 5 :
                return onChangeViewModelShowMyOrdersListView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelShowNoOrdersView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowNoOrdersView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsLoggedIn(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsLoggedIn, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowShimmer(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowShimmer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowDropDownPatient(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowDropDownPatient, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMyOrdersList(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders>> ViewModelMyOrdersList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowMyOrdersListView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowMyOrdersListView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowDropDownPatientGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowNoOrdersView = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerGetValue = false;
        java.lang.Boolean viewModelShowShimmerGetValue = null;
        int viewModelShowDropDownPatientViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsLoggedIn = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowShimmer = null;
        int viewModelShowShimmerViewVISIBLEViewGONE = 0;
        int viewModelShowMyOrdersListViewViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowNoOrdersViewGetValue = false;
        int viewModelShowNoOrdersViewViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelShowNoOrdersViewGetValue = null;
        java.lang.Boolean viewModelShowDropDownPatientGetValue = null;
        java.lang.Boolean viewModelIsLoggedInGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoggedInGetValue = false;
        java.util.List<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders> viewModelMyOrdersListGetValue = null;
        java.lang.Boolean viewModelShowMyOrdersListViewGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowDropDownPatient = null;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders>> viewModelMyOrdersList = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowMyOrdersListView = null;
        int viewModelIsLoggedInViewGONEViewVISIBLE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowMyOrdersListViewGetValue = false;
        com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showNoOrdersView
                        viewModelShowNoOrdersView = viewModel.getShowNoOrdersView();
                    }
                    updateLiveDataRegistration(0, viewModelShowNoOrdersView);


                    if (viewModelShowNoOrdersView != null) {
                        // read viewModel.showNoOrdersView.getValue()
                        viewModelShowNoOrdersViewGetValue = viewModelShowNoOrdersView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showNoOrdersView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowNoOrdersViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowNoOrdersViewGetValue);
                if((dirtyFlags & 0xc1L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowNoOrdersViewGetValue) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showNoOrdersView.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowNoOrdersViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowNoOrdersViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc2L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoggedIn
                        viewModelIsLoggedIn = viewModel.isLoggedIn();
                    }
                    updateLiveDataRegistration(1, viewModelIsLoggedIn);


                    if (viewModelIsLoggedIn != null) {
                        // read viewModel.isLoggedIn.getValue()
                        viewModelIsLoggedInGetValue = viewModelIsLoggedIn.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoggedIn.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoggedInGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsLoggedInGetValue);
                if((dirtyFlags & 0xc2L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoggedInGetValue) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoggedIn.getValue()) ? View.GONE : View.VISIBLE
                    viewModelIsLoggedInViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoggedInGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0xc4L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showShimmer
                        viewModelShowShimmer = viewModel.getShowShimmer();
                    }
                    updateLiveDataRegistration(2, viewModelShowShimmer);


                    if (viewModelShowShimmer != null) {
                        // read viewModel.showShimmer.getValue()
                        viewModelShowShimmerGetValue = viewModelShowShimmer.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmer.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowShimmerGetValue);
                if((dirtyFlags & 0xc4L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerGetValue) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmer.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowShimmerViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc8L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showDropDownPatient
                        viewModelShowDropDownPatient = viewModel.getShowDropDownPatient();
                    }
                    updateLiveDataRegistration(3, viewModelShowDropDownPatient);


                    if (viewModelShowDropDownPatient != null) {
                        // read viewModel.showDropDownPatient.getValue()
                        viewModelShowDropDownPatientGetValue = viewModelShowDropDownPatient.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showDropDownPatient.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowDropDownPatientGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowDropDownPatientGetValue);
                if((dirtyFlags & 0xc8L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowDropDownPatientGetValue) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showDropDownPatient.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowDropDownPatientViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowDropDownPatientGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xd0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.myOrdersList
                        viewModelMyOrdersList = viewModel.getMyOrdersList();
                    }
                    updateLiveDataRegistration(4, viewModelMyOrdersList);


                    if (viewModelMyOrdersList != null) {
                        // read viewModel.myOrdersList.getValue()
                        viewModelMyOrdersListGetValue = viewModelMyOrdersList.getValue();
                    }
            }
            if ((dirtyFlags & 0xe0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showMyOrdersListView
                        viewModelShowMyOrdersListView = viewModel.getShowMyOrdersListView();
                    }
                    updateLiveDataRegistration(5, viewModelShowMyOrdersListView);


                    if (viewModelShowMyOrdersListView != null) {
                        // read viewModel.showMyOrdersListView.getValue()
                        viewModelShowMyOrdersListViewGetValue = viewModelShowMyOrdersListView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showMyOrdersListView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowMyOrdersListViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowMyOrdersListViewGetValue);
                if((dirtyFlags & 0xe0L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowMyOrdersListViewGetValue) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showMyOrdersListView.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowMyOrdersListViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowMyOrdersListViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.btnAddNewPatients.setOnClickListener(mCallback22);
            this.tmDropDownOrders.setOnClickListener(mCallback20);
            this.tmDropDownPatient.setOnClickListener(mCallback21);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            this.rlNoPatientView.setVisibility(viewModelShowNoOrdersViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xe0L) != 0) {
            // api target 1

            this.rvOrderList.setVisibility(viewModelShowMyOrdersListViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.MyOrdersListBindingAdapterKt.setMyOrdersList(this.rvOrderList, viewModelMyOrdersListGetValue, viewModel);
        }
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            this.shimmerViewContainer.setVisibility(viewModelShowShimmerViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            this.tmDropDownPatient.setVisibility(viewModelShowDropDownPatientViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            this.userWithoutLogin.setVisibility(viewModelIsLoggedInViewGONEViewVISIBLE);
        }
        executeBindingsOn(mboundView4);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.patientListClick();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.orderListClick();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.searchForMedicinesButtonClick();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.showNoOrdersView
        flag 1 (0x2L): viewModel.isLoggedIn
        flag 2 (0x3L): viewModel.showShimmer
        flag 3 (0x4L): viewModel.showDropDownPatient
        flag 4 (0x5L): viewModel.myOrdersList
        flag 5 (0x6L): viewModel.showMyOrdersListView
        flag 6 (0x7L): viewModel
        flag 7 (0x8L): null
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showDropDownPatient.getValue()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showDropDownPatient.getValue()) ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmer.getValue()) ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmer.getValue()) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showMyOrdersListView.getValue()) ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showMyOrdersListView.getValue()) ? View.VISIBLE : View.GONE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showNoOrdersView.getValue()) ? View.VISIBLE : View.GONE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showNoOrdersView.getValue()) ? View.VISIBLE : View.GONE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoggedIn.getValue()) ? View.GONE : View.VISIBLE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoggedIn.getValue()) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}