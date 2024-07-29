package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BottomsheetLocationBindingImpl extends BottomsheetLocationBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clHeader, 10);
        sViewsWithIds.put(R.id.tvHeader, 11);
        sViewsWithIds.put(R.id.imageClose, 12);
        sViewsWithIds.put(R.id.nestedScrollView, 13);
        sViewsWithIds.put(R.id.clScrollable, 14);
        sViewsWithIds.put(R.id.clLocationNudge, 15);
        sViewsWithIds.put(R.id.tvCurrentLocation, 16);
        sViewsWithIds.put(R.id.divider_location, 17);
        sViewsWithIds.put(R.id.tvLoginToView, 18);
        sViewsWithIds.put(R.id.tvManageAddress, 19);
    }
    // views
    @NonNull
    private final android.widget.ProgressBar mboundView9;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BottomsheetLocationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private BottomsheetLocationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (com.intellihealth.salt.views.cards.Divider) bindings[17]
            , (com.intellihealth.salt.views.edittext.InputFieldLayout) bindings[2]
            , (androidx.constraintlayout.widget.Group) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[12]
            , (androidx.core.widget.NestedScrollView) bindings[13]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (com.intellihealth.salt.views.TextView) bindings[16]
            , (com.intellihealth.salt.views.TextView) bindings[11]
            , (com.intellihealth.salt.views.TextView) bindings[18]
            , (com.intellihealth.salt.views.TextView) bindings[19]
            , (com.intellihealth.salt.views.TextView) bindings[6]
            , (com.intellihealth.salt.views.TextView) bindings[5]
            , (android.view.View) bindings[1]
            );
        this.clFooter.setTag(null);
        this.clLoggedOut.setTag(null);
        this.clRoot.setTag(null);
        this.etInputFieldPinCode.setTag(null);
        this.groupLoggedIn.setTag(null);
        this.mboundView9 = (android.widget.ProgressBar) bindings[9];
        this.mboundView9.setTag(null);
        this.rvSavedAddresses.setTag(null);
        this.tvNoSaveAddresses.setTag(null);
        this.tvSaveAddresses.setTag(null);
        this.viewDragHandle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
        if (BR.isUserLoggedIn == variableId) {
            setIsUserLoggedIn((java.lang.Boolean) variable);
        }
        else if (BR.callbackLocation == variableId) {
            setCallbackLocation((com.intellihealth.truemeds.data.callback.ChooseLocationCallback) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsUserLoggedIn(@Nullable java.lang.Boolean IsUserLoggedIn) {
        this.mIsUserLoggedIn = IsUserLoggedIn;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.isUserLoggedIn);
        super.requestRebind();
    }
    public void setCallbackLocation(@Nullable com.intellihealth.truemeds.data.callback.ChooseLocationCallback CallbackLocation) {
        this.mCallbackLocation = CallbackLocation;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.callbackLocation);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsLoadingView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelPincodeData((androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData>) object, fieldId);
            case 2 :
                return onChangeViewModelGetAddressList((androidx.lifecycle.LiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsLoadingView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsLoadingView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPincodeData(androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> ViewModelPincodeData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelGetAddressList(androidx.lifecycle.LiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj>> ViewModelGetAddressList, int fieldId) {
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
        int isUserLoggedInViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelIsLoadingViewGetValue = null;
        int viewModelIsLoadingViewViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingViewGetValue = false;
        java.lang.Boolean isUserLoggedIn = mIsUserLoggedIn;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsLoadingView = null;
        androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> viewModelPincodeData = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsUserLoggedIn = false;
        int isUserLoggedInViewModelGetAddressListSizeInt0BooleanFalseViewVISIBLEViewGONE = 0;
        int IsUserLoggedInViewModelGetAddressListSizeInt0BooleanFalseViewVISIBLEViewGONE1 = 0;
        int viewModelGetAddressListSize = 0;
        boolean isUserLoggedInViewModelGetAddressListSizeInt0BooleanFalse = false;
        androidx.lifecycle.LiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj>> viewModelGetAddressList = null;
        boolean viewModelGetAddressListSizeInt0 = false;
        com.intellihealth.truemeds.data.callback.ChooseLocationCallback callbackLocation = mCallbackLocation;
        boolean IsUserLoggedInViewModelGetAddressListSizeInt0BooleanFalse1 = false;
        int isUserLoggedInViewGONEViewVISIBLE = 0;
        java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj> viewModelGetAddressListGetValue = null;
        int viewModelGetAddressListSizeInt0ViewGONEViewVISIBLE = 0;
        com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData viewModelPincodeDataGetValue = null;
        com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel viewModel = mViewModel;
        boolean ViewModelGetAddressListSizeInt01 = false;

        if ((dirtyFlags & 0x6cL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isUserLoggedIn)
                androidxDatabindingViewDataBindingSafeUnboxIsUserLoggedIn = androidx.databinding.ViewDataBinding.safeUnbox(isUserLoggedIn);
            if((dirtyFlags & 0x48L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsUserLoggedIn) {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x100000L;
                }
                else {
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x80000L;
                }
            }
            if((dirtyFlags & 0x6cL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsUserLoggedIn) {
                        dirtyFlags |= 0x10000L;
                        dirtyFlags |= 0x40000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                        dirtyFlags |= 0x20000L;
                }
            }

            if ((dirtyFlags & 0x48L) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(isUserLoggedIn) ? View.VISIBLE : View.GONE
                    isUserLoggedInViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxIsUserLoggedIn) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(isUserLoggedIn) ? View.GONE : View.VISIBLE
                    isUserLoggedInViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxIsUserLoggedIn) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        if ((dirtyFlags & 0x74L) != 0) {
        }
        if ((dirtyFlags & 0x77L) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoadingView()
                        viewModelIsLoadingView = viewModel.isLoadingView();
                    }
                    updateLiveDataRegistration(0, viewModelIsLoadingView);


                    if (viewModelIsLoadingView != null) {
                        // read viewModel.isLoadingView().getValue()
                        viewModelIsLoadingViewGetValue = viewModelIsLoadingView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoadingView().getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsLoadingViewGetValue);
                if((dirtyFlags & 0x61L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingViewGetValue) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoadingView().getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsLoadingViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.pincodeData
                        viewModelPincodeData = viewModel.getPincodeData();
                    }
                    updateLiveDataRegistration(1, viewModelPincodeData);


                    if (viewModelPincodeData != null) {
                        // read viewModel.pincodeData.getValue()
                        viewModelPincodeDataGetValue = viewModelPincodeData.getValue();
                    }
            }
            if ((dirtyFlags & 0x74L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.getAddressList
                        viewModelGetAddressList = viewModel.getGetAddressList();
                    }
                    updateLiveDataRegistration(2, viewModelGetAddressList);


                    if (viewModelGetAddressList != null) {
                        // read viewModel.getAddressList.getValue()
                        viewModelGetAddressListGetValue = viewModelGetAddressList.getValue();
                    }

                if ((dirtyFlags & 0x64L) != 0) {

                        if (viewModelGetAddressListGetValue != null) {
                            // read viewModel.getAddressList.getValue().size()
                            viewModelGetAddressListSize = viewModelGetAddressListGetValue.size();
                        }


                        // read viewModel.getAddressList.getValue().size() == 0
                        viewModelGetAddressListSizeInt0 = (viewModelGetAddressListSize) == (0);
                    if((dirtyFlags & 0x64L) != 0) {
                        if(viewModelGetAddressListSizeInt0) {
                                dirtyFlags |= 0x400000L;
                        }
                        else {
                                dirtyFlags |= 0x200000L;
                        }
                    }


                        // read viewModel.getAddressList.getValue().size() == 0 ? View.GONE : View.VISIBLE
                        viewModelGetAddressListSizeInt0ViewGONEViewVISIBLE = ((viewModelGetAddressListSizeInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x50000L) != 0) {



                if (viewModel != null) {
                    // read viewModel.getAddressList
                    viewModelGetAddressList = viewModel.getGetAddressList();
                }
                updateLiveDataRegistration(2, viewModelGetAddressList);


                if (viewModelGetAddressList != null) {
                    // read viewModel.getAddressList.getValue()
                    viewModelGetAddressListGetValue = viewModelGetAddressList.getValue();
                }


                if (viewModelGetAddressListGetValue != null) {
                    // read viewModel.getAddressList.getValue().size()
                    viewModelGetAddressListSize = viewModelGetAddressListGetValue.size();
                }

            if ((dirtyFlags & 0x10000L) != 0) {

                    // read viewModel.getAddressList.getValue().size() == 0
                    viewModelGetAddressListSizeInt0 = (viewModelGetAddressListSize) == (0);
                if((dirtyFlags & 0x64L) != 0) {
                    if(viewModelGetAddressListSizeInt0) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }
            }
            if ((dirtyFlags & 0x40000L) != 0) {

                    // read viewModel.getAddressList.getValue().size() != 0
                    ViewModelGetAddressListSizeInt01 = (viewModelGetAddressListSize) != (0);
            }
        }

        if ((dirtyFlags & 0x6cL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(isUserLoggedIn) ? viewModel.getAddressList.getValue().size() == 0 : false
                isUserLoggedInViewModelGetAddressListSizeInt0BooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxIsUserLoggedIn) ? (viewModelGetAddressListSizeInt0) : (false));
                // read androidx.databinding.ViewDataBinding.safeUnbox(isUserLoggedIn) ? viewModel.getAddressList.getValue().size() != 0 : false
                IsUserLoggedInViewModelGetAddressListSizeInt0BooleanFalse1 = ((androidxDatabindingViewDataBindingSafeUnboxIsUserLoggedIn) ? (ViewModelGetAddressListSizeInt01) : (false));
            if((dirtyFlags & 0x6cL) != 0) {
                if(isUserLoggedInViewModelGetAddressListSizeInt0BooleanFalse) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }
            if((dirtyFlags & 0x6cL) != 0) {
                if(IsUserLoggedInViewModelGetAddressListSizeInt0BooleanFalse1) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isUserLoggedIn) ? viewModel.getAddressList.getValue().size() == 0 : false ? View.VISIBLE : View.GONE
                isUserLoggedInViewModelGetAddressListSizeInt0BooleanFalseViewVISIBLEViewGONE = ((isUserLoggedInViewModelGetAddressListSizeInt0BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(isUserLoggedIn) ? viewModel.getAddressList.getValue().size() != 0 : false ? View.VISIBLE : View.GONE
                IsUserLoggedInViewModelGetAddressListSizeInt0BooleanFalseViewVISIBLEViewGONE1 = ((IsUserLoggedInViewModelGetAddressListSizeInt0BooleanFalse1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x6cL) != 0) {
            // api target 1

            this.clFooter.setVisibility(IsUserLoggedInViewModelGetAddressListSizeInt0BooleanFalseViewVISIBLEViewGONE1);
            this.tvNoSaveAddresses.setVisibility(isUserLoggedInViewModelGetAddressListSizeInt0BooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x48L) != 0) {
            // api target 1

            this.clLoggedOut.setVisibility(isUserLoggedInViewGONEViewVISIBLE);
            this.groupLoggedIn.setVisibility(isUserLoggedInViewVISIBLEViewGONE);
            this.viewDragHandle.setVisibility(isUserLoggedInViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.ErrorMessageBindingAdapterKt.setErrorMessage(this.etInputFieldPinCode, viewModelPincodeDataGetValue);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            this.mboundView9.setVisibility(viewModelIsLoadingViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            this.rvSavedAddresses.setVisibility(viewModelGetAddressListSizeInt0ViewGONEViewVISIBLE);
            this.tvSaveAddresses.setVisibility(viewModelGetAddressListSizeInt0ViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x74L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.HomeBindingAdapterKt.setSavedAddressList(this.rvSavedAddresses, viewModelGetAddressListGetValue, callbackLocation);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isLoadingView()
        flag 1 (0x2L): viewModel.pincodeData
        flag 2 (0x3L): viewModel.getAddressList
        flag 3 (0x4L): isUserLoggedIn
        flag 4 (0x5L): callbackLocation
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(isUserLoggedIn) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(isUserLoggedIn) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoadingView().getValue()) ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoadingView().getValue()) ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(isUserLoggedIn) ? viewModel.getAddressList.getValue().size() == 0 : false ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(isUserLoggedIn) ? viewModel.getAddressList.getValue().size() == 0 : false ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(isUserLoggedIn) ? viewModel.getAddressList.getValue().size() != 0 : false ? View.VISIBLE : View.GONE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(isUserLoggedIn) ? viewModel.getAddressList.getValue().size() != 0 : false ? View.VISIBLE : View.GONE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(isUserLoggedIn) ? viewModel.getAddressList.getValue().size() == 0 : false
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(isUserLoggedIn) ? viewModel.getAddressList.getValue().size() == 0 : false
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(isUserLoggedIn) ? viewModel.getAddressList.getValue().size() != 0 : false
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(isUserLoggedIn) ? viewModel.getAddressList.getValue().size() != 0 : false
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(isUserLoggedIn) ? View.GONE : View.VISIBLE
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(isUserLoggedIn) ? View.GONE : View.VISIBLE
        flag 21 (0x16L): viewModel.getAddressList.getValue().size() == 0 ? View.GONE : View.VISIBLE
        flag 22 (0x17L): viewModel.getAddressList.getValue().size() == 0 ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}