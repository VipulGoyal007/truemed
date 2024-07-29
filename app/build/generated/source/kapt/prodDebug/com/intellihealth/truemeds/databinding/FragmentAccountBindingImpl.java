package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAccountBindingImpl extends FragmentAccountBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mainLayout, 13);
        sViewsWithIds.put(R.id.login, 14);
        sViewsWithIds.put(R.id.userLogin, 15);
        sViewsWithIds.put(R.id.btnLogin, 16);
        sViewsWithIds.put(R.id.guideline, 17);
        sViewsWithIds.put(R.id.loggedInUserImage, 18);
        sViewsWithIds.put(R.id.icon, 19);
        sViewsWithIds.put(R.id.btnTnC, 20);
        sViewsWithIds.put(R.id.btnTnCMain, 21);
        sViewsWithIds.put(R.id.btnLogoutMain, 22);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final com.intellihealth.salt.views.TextView mboundView12;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAccountBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private FragmentAccountBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (com.intellihealth.salt.views.buttons.ButtonLite) bindings[9]
            , (com.intellihealth.salt.views.buttons.Button) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (com.intellihealth.salt.views.buttons.ButtonLite) bindings[22]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[20]
            , (com.intellihealth.salt.views.buttons.ButtonLite) bindings[21]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (android.view.View) bindings[17]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[19]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[18]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (androidx.recyclerview.widget.RecyclerView) bindings[10]
            , (com.intellihealth.salt.views.buttons.ButtonLite) bindings[6]
            , (com.intellihealth.salt.views.TextView) bindings[5]
            , (com.intellihealth.salt.views.TextView) bindings[3]
            , (com.intellihealth.salt.views.TextView) bindings[4]
            , (com.intellihealth.salt.views.TextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            );
        this.btnEdit.setTag(null);
        this.btnLogout.setTag(null);
        this.clTillDateSaving.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView12 = (com.intellihealth.salt.views.TextView) bindings[12];
        this.mboundView12.setTag(null);
        this.rcvItem.setTag(null);
        this.tvAddMore.setTag(null);
        this.tvEmail.setTag(null);
        this.tvName.setTag(null);
        this.tvPhone.setTag(null);
        this.tvSaved.setTag(null);
        this.userWithoutLogin.setTag(null);
        this.withLoginUi.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
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
        if (BR.model == variableId) {
            setModel((com.intellihealth.truemeds.data.model.bottomnav.AccountTabModel) variable);
        }
        else if (BR.isLoggedIn == variableId) {
            setIsLoggedIn((java.lang.Boolean) variable);
        }
        else if (BR.viewmodel == variableId) {
            setViewmodel((com.intellihealth.truemeds.presentation.viewmodel.AccountTabViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.intellihealth.truemeds.data.model.bottomnav.AccountTabModel Model) {
        this.mModel = Model;
    }
    public void setIsLoggedIn(@Nullable java.lang.Boolean IsLoggedIn) {
        this.mIsLoggedIn = IsLoggedIn;
    }
    public void setViewmodel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.AccountTabViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelUserSaved((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelCustomerMobile((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelCustomerName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewmodelUserNavMenuList((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.bottomnav.AccountTabModel>>) object, fieldId);
            case 4 :
                return onChangeViewmodelAnyOrderTab((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeViewmodelCustomerEmail((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelUserSaved(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelUserSaved, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelCustomerMobile(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelCustomerMobile, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelCustomerName(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelCustomerName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelUserNavMenuList(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.bottomnav.AccountTabModel>> ViewmodelUserNavMenuList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAnyOrderTab(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewmodelAnyOrderTab, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelCustomerEmail(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelCustomerEmail, int fieldId) {
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
        boolean viewmodelCustomerMobileIsEmpty = false;
        int viewmodelCustomerMobileIsEmptyViewmodelCustomerNameIsEmptyBooleanFalseViewmodelCustomerEmailIsEmptyBooleanFalseViewVISIBLEViewGONE = 0;
        int viewmodelCustomerMobileEqualsJavaLangStringViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelUserSaved = null;
        int viewmodelCustomerNameIsEmptyViewGONEViewVISIBLE = 0;
        boolean viewmodelCustomerNameIsEmptyViewmodelCustomerEmailIsEmptyBooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelAnyOrderTabGetValue = false;
        boolean viewmodelCustomerNameIsEmpty = false;
        boolean viewmodelCustomerMobileIsEmptyViewmodelCustomerNameIsEmptyBooleanFalse = false;
        int viewmodelCustomerEmailIsEmptyViewGONEViewVISIBLE = 0;
        boolean ViewmodelCustomerMobileIsEmpty1 = false;
        java.lang.Boolean viewmodelAnyOrderTabGetValue = null;
        java.lang.String viewmodelCustomerEmailGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelCustomerMobile = null;
        int viewmodelCustomerMobileIsEmptyBooleanTrueViewmodelCustomerNameIsEmptyBooleanTrueViewmodelCustomerEmailIsEmptyViewVISIBLEViewGONE = 0;
        boolean viewmodelCustomerMobileIsEmptyBooleanTrueViewmodelCustomerNameIsEmptyBooleanTrueViewmodelCustomerEmailIsEmpty = false;
        int viewmodelAnyOrderTabViewVISIBLEViewGONE = 0;
        boolean viewmodelCustomerMobileIsEmptyViewmodelCustomerNameIsEmptyBooleanFalseViewmodelCustomerEmailIsEmptyBooleanFalse = false;
        java.lang.String viewmodelCustomerMobileGetValue = null;
        boolean ViewmodelCustomerNameIsEmpty1 = false;
        boolean viewmodelCustomerEmailIsEmpty = false;
        java.lang.String viewmodelUserSavedGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelCustomerName = null;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.bottomnav.AccountTabModel>> viewmodelUserNavMenuList = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewmodelAnyOrderTab = null;
        int viewmodelCustomerMobileIsEmptyViewGONEViewVISIBLE = 0;
        java.lang.String viewmodelCustomerNameGetValue = null;
        java.lang.String viewmodelCustomerNameIsEmptyViewmodelCustomerEmailIsEmptyBooleanFalseTvAddMoreAndroidStringUpdateEmailIdTvAddMoreAndroidStringAddYourDetails = null;
        boolean ViewmodelCustomerEmailIsEmpty1 = false;
        java.util.List<com.intellihealth.truemeds.data.model.bottomnav.AccountTabModel> viewmodelUserNavMenuListGetValue = null;
        int viewmodelCustomerMobileEqualsJavaLangStringViewGONEViewVISIBLE = 0;
        boolean viewmodelCustomerMobileEqualsJavaLangString = false;
        boolean viewmodelCustomerMobileIsEmptyBooleanTrueViewmodelCustomerNameIsEmpty = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelCustomerEmail = null;
        com.intellihealth.truemeds.presentation.viewmodel.AccountTabViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x33fL) != 0) {


            if ((dirtyFlags & 0x301L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.userSaved
                        viewmodelUserSaved = viewmodel.getUserSaved();
                    }
                    updateLiveDataRegistration(0, viewmodelUserSaved);


                    if (viewmodelUserSaved != null) {
                        // read viewmodel.userSaved.getValue()
                        viewmodelUserSavedGetValue = viewmodelUserSaved.getValue();
                    }
            }
            if ((dirtyFlags & 0x326L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.customerMobile
                        viewmodelCustomerMobile = viewmodel.getCustomerMobile();
                    }
                    updateLiveDataRegistration(1, viewmodelCustomerMobile);


                    if (viewmodelCustomerMobile != null) {
                        // read viewmodel.customerMobile.getValue()
                        viewmodelCustomerMobileGetValue = viewmodelCustomerMobile.getValue();
                    }


                    if (viewmodelCustomerMobileGetValue != null) {
                        // read viewmodel.customerMobile.getValue().isEmpty()
                        viewmodelCustomerMobileIsEmpty = viewmodelCustomerMobileGetValue.isEmpty();
                    }
                if((dirtyFlags & 0x302L) != 0) {
                    if(viewmodelCustomerMobileIsEmpty) {
                            dirtyFlags |= 0x200000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000L;
                    }
                }
                if((dirtyFlags & 0x326L) != 0) {
                    if(viewmodelCustomerMobileIsEmpty) {
                            dirtyFlags |= 0x8000000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000000L;
                    }
                }


                    // read !viewmodel.customerMobile.getValue().isEmpty()
                    ViewmodelCustomerMobileIsEmpty1 = !viewmodelCustomerMobileIsEmpty;
                if((dirtyFlags & 0x326L) != 0) {
                    if(ViewmodelCustomerMobileIsEmpty1) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }
                if ((dirtyFlags & 0x302L) != 0) {

                        // read viewmodel.customerMobile.getValue().isEmpty() ? View.GONE : View.VISIBLE
                        viewmodelCustomerMobileIsEmptyViewGONEViewVISIBLE = ((viewmodelCustomerMobileIsEmpty) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }
                if ((dirtyFlags & 0x302L) != 0) {

                        if (viewmodelCustomerMobileGetValue != null) {
                            // read viewmodel.customerMobile.getValue().equals("")
                            viewmodelCustomerMobileEqualsJavaLangString = viewmodelCustomerMobileGetValue.equals("");
                        }
                    if((dirtyFlags & 0x302L) != 0) {
                        if(viewmodelCustomerMobileEqualsJavaLangString) {
                                dirtyFlags |= 0x2000L;
                                dirtyFlags |= 0x2000000000L;
                        }
                        else {
                                dirtyFlags |= 0x1000L;
                                dirtyFlags |= 0x1000000000L;
                        }
                    }


                        // read viewmodel.customerMobile.getValue().equals("") ? View.VISIBLE : View.GONE
                        viewmodelCustomerMobileEqualsJavaLangStringViewVISIBLEViewGONE = ((viewmodelCustomerMobileEqualsJavaLangString) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                        // read viewmodel.customerMobile.getValue().equals("") ? View.GONE : View.VISIBLE
                        viewmodelCustomerMobileEqualsJavaLangStringViewGONEViewVISIBLE = ((viewmodelCustomerMobileEqualsJavaLangString) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }
            }
            if ((dirtyFlags & 0x324L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.customerName
                        viewmodelCustomerName = viewmodel.getCustomerName();
                    }
                    updateLiveDataRegistration(2, viewmodelCustomerName);


                    if (viewmodelCustomerName != null) {
                        // read viewmodel.customerName.getValue()
                        viewmodelCustomerNameGetValue = viewmodelCustomerName.getValue();
                    }


                    if (viewmodelCustomerNameGetValue != null) {
                        // read viewmodel.customerName.getValue().isEmpty()
                        ViewmodelCustomerNameIsEmpty1 = viewmodelCustomerNameGetValue.isEmpty();
                    }
                if((dirtyFlags & 0x304L) != 0) {
                    if(ViewmodelCustomerNameIsEmpty1) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }

                if ((dirtyFlags & 0x304L) != 0) {

                        // read viewmodel.customerName.getValue().isEmpty() ? View.GONE : View.VISIBLE
                        viewmodelCustomerNameIsEmptyViewGONEViewVISIBLE = ((ViewmodelCustomerNameIsEmpty1) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }

                    // read !viewmodel.customerName.getValue().isEmpty()
                    viewmodelCustomerNameIsEmpty = !ViewmodelCustomerNameIsEmpty1;
                if((dirtyFlags & 0x324L) != 0) {
                    if(viewmodelCustomerNameIsEmpty) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }
            }
            if ((dirtyFlags & 0x308L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.userNavMenuList
                        viewmodelUserNavMenuList = viewmodel.getUserNavMenuList();
                    }
                    updateLiveDataRegistration(3, viewmodelUserNavMenuList);


                    if (viewmodelUserNavMenuList != null) {
                        // read viewmodel.userNavMenuList.getValue()
                        viewmodelUserNavMenuListGetValue = viewmodelUserNavMenuList.getValue();
                    }
            }
            if ((dirtyFlags & 0x310L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.anyOrderTab
                        viewmodelAnyOrderTab = viewmodel.getAnyOrderTab();
                    }
                    updateLiveDataRegistration(4, viewmodelAnyOrderTab);


                    if (viewmodelAnyOrderTab != null) {
                        // read viewmodel.anyOrderTab.getValue()
                        viewmodelAnyOrderTabGetValue = viewmodelAnyOrderTab.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.anyOrderTab.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelAnyOrderTabGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelAnyOrderTabGetValue);
                if((dirtyFlags & 0x310L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewmodelAnyOrderTabGetValue) {
                            dirtyFlags |= 0x20000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.anyOrderTab.getValue()) ? View.VISIBLE : View.GONE
                    viewmodelAnyOrderTabViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelAnyOrderTabGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x320L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.customerEmail
                        viewmodelCustomerEmail = viewmodel.getCustomerEmail();
                    }
                    updateLiveDataRegistration(5, viewmodelCustomerEmail);


                    if (viewmodelCustomerEmail != null) {
                        // read viewmodel.customerEmail.getValue()
                        viewmodelCustomerEmailGetValue = viewmodelCustomerEmail.getValue();
                    }


                    if (viewmodelCustomerEmailGetValue != null) {
                        // read viewmodel.customerEmail.getValue().isEmpty()
                        viewmodelCustomerEmailIsEmpty = viewmodelCustomerEmailGetValue.isEmpty();
                    }
                if((dirtyFlags & 0x320L) != 0) {
                    if(viewmodelCustomerEmailIsEmpty) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }


                    // read viewmodel.customerEmail.getValue().isEmpty() ? View.GONE : View.VISIBLE
                    viewmodelCustomerEmailIsEmptyViewGONEViewVISIBLE = ((viewmodelCustomerEmailIsEmpty) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x4000200000L) != 0) {

                if (viewmodel != null) {
                    // read viewmodel.customerName
                    viewmodelCustomerName = viewmodel.getCustomerName();
                }
                updateLiveDataRegistration(2, viewmodelCustomerName);


                if (viewmodelCustomerName != null) {
                    // read viewmodel.customerName.getValue()
                    viewmodelCustomerNameGetValue = viewmodelCustomerName.getValue();
                }


                if (viewmodelCustomerNameGetValue != null) {
                    // read viewmodel.customerName.getValue().isEmpty()
                    ViewmodelCustomerNameIsEmpty1 = viewmodelCustomerNameGetValue.isEmpty();
                }
            if((dirtyFlags & 0x304L) != 0) {
                if(ViewmodelCustomerNameIsEmpty1) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }

            if ((dirtyFlags & 0x200000L) != 0) {

                    // read !viewmodel.customerName.getValue().isEmpty()
                    viewmodelCustomerNameIsEmpty = !ViewmodelCustomerNameIsEmpty1;
                if((dirtyFlags & 0x324L) != 0) {
                    if(viewmodelCustomerNameIsEmpty) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }
            }
        }

        if ((dirtyFlags & 0x326L) != 0) {

                // read !viewmodel.customerMobile.getValue().isEmpty() ? !viewmodel.customerName.getValue().isEmpty() : false
                viewmodelCustomerMobileIsEmptyViewmodelCustomerNameIsEmptyBooleanFalse = ((ViewmodelCustomerMobileIsEmpty1) ? (viewmodelCustomerNameIsEmpty) : (false));
                // read viewmodel.customerMobile.getValue().isEmpty() ? true : viewmodel.customerName.getValue().isEmpty()
                viewmodelCustomerMobileIsEmptyBooleanTrueViewmodelCustomerNameIsEmpty = ((viewmodelCustomerMobileIsEmpty) ? (true) : (ViewmodelCustomerNameIsEmpty1));
            if((dirtyFlags & 0x326L) != 0) {
                if(viewmodelCustomerMobileIsEmptyViewmodelCustomerNameIsEmptyBooleanFalse) {
                        dirtyFlags |= 0x80000000L;
                }
                else {
                        dirtyFlags |= 0x40000000L;
                }
            }
            if((dirtyFlags & 0x326L) != 0) {
                if(viewmodelCustomerMobileIsEmptyBooleanTrueViewmodelCustomerNameIsEmpty) {
                        dirtyFlags |= 0x8000000L;
                }
                else {
                        dirtyFlags |= 0x4000000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x84080000L) != 0) {

                if (viewmodel != null) {
                    // read viewmodel.customerEmail
                    viewmodelCustomerEmail = viewmodel.getCustomerEmail();
                }
                updateLiveDataRegistration(5, viewmodelCustomerEmail);


                if (viewmodelCustomerEmail != null) {
                    // read viewmodel.customerEmail.getValue()
                    viewmodelCustomerEmailGetValue = viewmodelCustomerEmail.getValue();
                }


                if (viewmodelCustomerEmailGetValue != null) {
                    // read viewmodel.customerEmail.getValue().isEmpty()
                    viewmodelCustomerEmailIsEmpty = viewmodelCustomerEmailGetValue.isEmpty();
                }
            if((dirtyFlags & 0x320L) != 0) {
                if(viewmodelCustomerEmailIsEmpty) {
                        dirtyFlags |= 0x800000L;
                }
                else {
                        dirtyFlags |= 0x400000L;
                }
            }

            if ((dirtyFlags & 0x80000000L) != 0) {

                    // read !viewmodel.customerEmail.getValue().isEmpty()
                    ViewmodelCustomerEmailIsEmpty1 = !viewmodelCustomerEmailIsEmpty;
            }
        }

        if ((dirtyFlags & 0x324L) != 0) {

                // read !viewmodel.customerName.getValue().isEmpty() ? viewmodel.customerEmail.getValue().isEmpty() : false
                viewmodelCustomerNameIsEmptyViewmodelCustomerEmailIsEmptyBooleanFalse = ((viewmodelCustomerNameIsEmpty) ? (viewmodelCustomerEmailIsEmpty) : (false));
            if((dirtyFlags & 0x324L) != 0) {
                if(viewmodelCustomerNameIsEmptyViewmodelCustomerEmailIsEmptyBooleanFalse) {
                        dirtyFlags |= 0x800000000L;
                }
                else {
                        dirtyFlags |= 0x400000000L;
                }
            }


                // read !viewmodel.customerName.getValue().isEmpty() ? viewmodel.customerEmail.getValue().isEmpty() : false ? @android:string/update_email_id : @android:string/add_your_details
                viewmodelCustomerNameIsEmptyViewmodelCustomerEmailIsEmptyBooleanFalseTvAddMoreAndroidStringUpdateEmailIdTvAddMoreAndroidStringAddYourDetails = ((viewmodelCustomerNameIsEmptyViewmodelCustomerEmailIsEmptyBooleanFalse) ? (tvAddMore.getResources().getString(R.string.update_email_id)) : (tvAddMore.getResources().getString(R.string.add_your_details)));
        }
        if ((dirtyFlags & 0x326L) != 0) {

                // read viewmodel.customerMobile.getValue().isEmpty() ? true : viewmodel.customerName.getValue().isEmpty() ? true : viewmodel.customerEmail.getValue().isEmpty()
                viewmodelCustomerMobileIsEmptyBooleanTrueViewmodelCustomerNameIsEmptyBooleanTrueViewmodelCustomerEmailIsEmpty = ((viewmodelCustomerMobileIsEmptyBooleanTrueViewmodelCustomerNameIsEmpty) ? (true) : (viewmodelCustomerEmailIsEmpty));
                // read !viewmodel.customerMobile.getValue().isEmpty() ? !viewmodel.customerName.getValue().isEmpty() : false ? !viewmodel.customerEmail.getValue().isEmpty() : false
                viewmodelCustomerMobileIsEmptyViewmodelCustomerNameIsEmptyBooleanFalseViewmodelCustomerEmailIsEmptyBooleanFalse = ((viewmodelCustomerMobileIsEmptyViewmodelCustomerNameIsEmptyBooleanFalse) ? (ViewmodelCustomerEmailIsEmpty1) : (false));
            if((dirtyFlags & 0x326L) != 0) {
                if(viewmodelCustomerMobileIsEmptyBooleanTrueViewmodelCustomerNameIsEmptyBooleanTrueViewmodelCustomerEmailIsEmpty) {
                        dirtyFlags |= 0x2000000L;
                }
                else {
                        dirtyFlags |= 0x1000000L;
                }
            }
            if((dirtyFlags & 0x326L) != 0) {
                if(viewmodelCustomerMobileIsEmptyViewmodelCustomerNameIsEmptyBooleanFalseViewmodelCustomerEmailIsEmptyBooleanFalse) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }


                // read viewmodel.customerMobile.getValue().isEmpty() ? true : viewmodel.customerName.getValue().isEmpty() ? true : viewmodel.customerEmail.getValue().isEmpty() ? View.VISIBLE : View.GONE
                viewmodelCustomerMobileIsEmptyBooleanTrueViewmodelCustomerNameIsEmptyBooleanTrueViewmodelCustomerEmailIsEmptyViewVISIBLEViewGONE = ((viewmodelCustomerMobileIsEmptyBooleanTrueViewmodelCustomerNameIsEmptyBooleanTrueViewmodelCustomerEmailIsEmpty) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read !viewmodel.customerMobile.getValue().isEmpty() ? !viewmodel.customerName.getValue().isEmpty() : false ? !viewmodel.customerEmail.getValue().isEmpty() : false ? View.VISIBLE : View.GONE
                viewmodelCustomerMobileIsEmptyViewmodelCustomerNameIsEmptyBooleanFalseViewmodelCustomerEmailIsEmptyBooleanFalseViewVISIBLEViewGONE = ((viewmodelCustomerMobileIsEmptyViewmodelCustomerNameIsEmptyBooleanFalseViewmodelCustomerEmailIsEmptyBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x326L) != 0) {
            // api target 1

            this.btnEdit.setVisibility(viewmodelCustomerMobileIsEmptyViewmodelCustomerNameIsEmptyBooleanFalseViewmodelCustomerEmailIsEmptyBooleanFalseViewVISIBLEViewGONE);
            this.tvAddMore.setVisibility(viewmodelCustomerMobileIsEmptyBooleanTrueViewmodelCustomerNameIsEmptyBooleanTrueViewmodelCustomerEmailIsEmptyViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x302L) != 0) {
            // api target 1

            this.btnLogout.setVisibility(viewmodelCustomerMobileEqualsJavaLangStringViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPhone, viewmodelCustomerMobileGetValue);
            this.tvPhone.setVisibility(viewmodelCustomerMobileIsEmptyViewGONEViewVISIBLE);
            this.userWithoutLogin.setVisibility(viewmodelCustomerMobileEqualsJavaLangStringViewVISIBLEViewGONE);
            this.withLoginUi.setVisibility(viewmodelCustomerMobileEqualsJavaLangStringViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x310L) != 0) {
            // api target 1

            this.clTillDateSaving.setVisibility(viewmodelAnyOrderTabViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x200L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, (("v ") + (com.intellihealth.truemeds.BuildConfig.VERSION_NAME)) + ((((com.intellihealth.truemeds.BuildConfig.FLAVOR) != ("prod")) ? ((("(") + (com.intellihealth.truemeds.BuildConfig.VERSION_CODE)) + (")")) : (""))));
        }
        if ((dirtyFlags & 0x308L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.AccountMenuBindingAdapterKt.setUserNavList(this.rcvItem, viewmodelUserNavMenuListGetValue, viewmodel);
        }
        if ((dirtyFlags & 0x324L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvAddMore, viewmodelCustomerNameIsEmptyViewmodelCustomerEmailIsEmptyBooleanFalseTvAddMoreAndroidStringUpdateEmailIdTvAddMoreAndroidStringAddYourDetails);
        }
        if ((dirtyFlags & 0x320L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvEmail, viewmodelCustomerEmailGetValue);
            this.tvEmail.setVisibility(viewmodelCustomerEmailIsEmptyViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x304L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, viewmodelCustomerNameGetValue);
            this.tvName.setVisibility(viewmodelCustomerNameIsEmptyViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x301L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSaved, viewmodelUserSavedGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.userSaved
        flag 1 (0x2L): viewmodel.customerMobile
        flag 2 (0x3L): viewmodel.customerName
        flag 3 (0x4L): viewmodel.userNavMenuList
        flag 4 (0x5L): viewmodel.anyOrderTab
        flag 5 (0x6L): viewmodel.customerEmail
        flag 6 (0x7L): model
        flag 7 (0x8L): isLoggedIn
        flag 8 (0x9L): viewmodel
        flag 9 (0xaL): null
        flag 10 (0xbL): !viewmodel.customerMobile.getValue().isEmpty() ? !viewmodel.customerName.getValue().isEmpty() : false ? !viewmodel.customerEmail.getValue().isEmpty() : false ? View.VISIBLE : View.GONE
        flag 11 (0xcL): !viewmodel.customerMobile.getValue().isEmpty() ? !viewmodel.customerName.getValue().isEmpty() : false ? !viewmodel.customerEmail.getValue().isEmpty() : false ? View.VISIBLE : View.GONE
        flag 12 (0xdL): viewmodel.customerMobile.getValue().equals("") ? View.VISIBLE : View.GONE
        flag 13 (0xeL): viewmodel.customerMobile.getValue().equals("") ? View.VISIBLE : View.GONE
        flag 14 (0xfL): BuildConfig.FLAVOR != "prod" ? (("(") + (BuildConfig.VERSION_CODE)) + (")") : ""
        flag 15 (0x10L): BuildConfig.FLAVOR != "prod" ? (("(") + (BuildConfig.VERSION_CODE)) + (")") : ""
        flag 16 (0x11L): viewmodel.customerName.getValue().isEmpty() ? View.GONE : View.VISIBLE
        flag 17 (0x12L): viewmodel.customerName.getValue().isEmpty() ? View.GONE : View.VISIBLE
        flag 18 (0x13L): !viewmodel.customerName.getValue().isEmpty() ? viewmodel.customerEmail.getValue().isEmpty() : false
        flag 19 (0x14L): !viewmodel.customerName.getValue().isEmpty() ? viewmodel.customerEmail.getValue().isEmpty() : false
        flag 20 (0x15L): !viewmodel.customerMobile.getValue().isEmpty() ? !viewmodel.customerName.getValue().isEmpty() : false
        flag 21 (0x16L): !viewmodel.customerMobile.getValue().isEmpty() ? !viewmodel.customerName.getValue().isEmpty() : false
        flag 22 (0x17L): viewmodel.customerEmail.getValue().isEmpty() ? View.GONE : View.VISIBLE
        flag 23 (0x18L): viewmodel.customerEmail.getValue().isEmpty() ? View.GONE : View.VISIBLE
        flag 24 (0x19L): viewmodel.customerMobile.getValue().isEmpty() ? true : viewmodel.customerName.getValue().isEmpty() ? true : viewmodel.customerEmail.getValue().isEmpty() ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): viewmodel.customerMobile.getValue().isEmpty() ? true : viewmodel.customerName.getValue().isEmpty() ? true : viewmodel.customerEmail.getValue().isEmpty() ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): viewmodel.customerMobile.getValue().isEmpty() ? true : viewmodel.customerName.getValue().isEmpty() ? true : viewmodel.customerEmail.getValue().isEmpty()
        flag 27 (0x1cL): viewmodel.customerMobile.getValue().isEmpty() ? true : viewmodel.customerName.getValue().isEmpty() ? true : viewmodel.customerEmail.getValue().isEmpty()
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.anyOrderTab.getValue()) ? View.VISIBLE : View.GONE
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.anyOrderTab.getValue()) ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): !viewmodel.customerMobile.getValue().isEmpty() ? !viewmodel.customerName.getValue().isEmpty() : false ? !viewmodel.customerEmail.getValue().isEmpty() : false
        flag 31 (0x20L): !viewmodel.customerMobile.getValue().isEmpty() ? !viewmodel.customerName.getValue().isEmpty() : false ? !viewmodel.customerEmail.getValue().isEmpty() : false
        flag 32 (0x21L): viewmodel.customerMobile.getValue().isEmpty() ? View.GONE : View.VISIBLE
        flag 33 (0x22L): viewmodel.customerMobile.getValue().isEmpty() ? View.GONE : View.VISIBLE
        flag 34 (0x23L): !viewmodel.customerName.getValue().isEmpty() ? viewmodel.customerEmail.getValue().isEmpty() : false ? @android:string/update_email_id : @android:string/add_your_details
        flag 35 (0x24L): !viewmodel.customerName.getValue().isEmpty() ? viewmodel.customerEmail.getValue().isEmpty() : false ? @android:string/update_email_id : @android:string/add_your_details
        flag 36 (0x25L): viewmodel.customerMobile.getValue().equals("") ? View.GONE : View.VISIBLE
        flag 37 (0x26L): viewmodel.customerMobile.getValue().equals("") ? View.GONE : View.VISIBLE
        flag 38 (0x27L): viewmodel.customerMobile.getValue().isEmpty() ? true : viewmodel.customerName.getValue().isEmpty()
        flag 39 (0x28L): viewmodel.customerMobile.getValue().isEmpty() ? true : viewmodel.customerName.getValue().isEmpty()
    flag mapping end*/
    //end
}