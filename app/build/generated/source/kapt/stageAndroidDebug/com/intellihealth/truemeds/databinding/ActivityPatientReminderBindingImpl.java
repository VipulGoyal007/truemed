package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityPatientReminderBindingImpl extends ActivityPatientReminderBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.header, 4);
        sViewsWithIds.put(R.id.ivPlaceholder, 5);
        sViewsWithIds.put(R.id.tvPlaceholder, 6);
        sViewsWithIds.put(R.id.addReminder, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.ProgressBar mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityPatientReminderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityPatientReminderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.intellihealth.salt.views.buttons.ButtonLite) bindings[7]
            , (com.intellihealth.salt.views.MobileSectionHeaders) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (com.intellihealth.salt.views.TextView) bindings[6]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.ProgressBar) bindings[3];
        this.mboundView3.setTag(null);
        this.placeholderLayout.setTag(null);
        this.rvReminderList.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.reminderViewModel == variableId) {
            setReminderViewModel((com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setReminderViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel ReminderViewModel) {
        this.mReminderViewModel = ReminderViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.reminderViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeReminderViewModelReminderAdapterList((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.reminder.ReminderListModel.ReminderList>>) object, fieldId);
            case 1 :
                return onChangeReminderViewModelIsLoading((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeReminderViewModelShowReminderPatientList((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeReminderViewModelReminderAdapterList(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.reminder.ReminderListModel.ReminderList>> ReminderViewModelReminderAdapterList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeReminderViewModelIsLoading(androidx.lifecycle.LiveData<java.lang.Boolean> ReminderViewModelIsLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeReminderViewModelShowReminderPatientList(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ReminderViewModelShowReminderPatientList, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.reminder.ReminderListModel.ReminderList>> reminderViewModelReminderAdapterList = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxReminderViewModelShowReminderPatientListGetValue = false;
        int reminderViewModelShowReminderPatientListViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxReminderViewModelIsLoadingGetValue = false;
        java.util.List<com.intellihealth.truemeds.data.model.reminder.ReminderListModel.ReminderList> reminderViewModelReminderAdapterListGetValue = null;
        com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel reminderViewModel = mReminderViewModel;
        java.lang.Boolean reminderViewModelIsLoadingGetValue = null;
        int reminderViewModelIsLoadingViewVISIBLEViewGONE = 0;
        int reminderViewModelShowReminderPatientListViewGONEViewVISIBLE = 0;
        androidx.lifecycle.LiveData<java.lang.Boolean> reminderViewModelIsLoading = null;
        java.lang.Boolean reminderViewModelShowReminderPatientListGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> reminderViewModelShowReminderPatientList = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (reminderViewModel != null) {
                        // read reminderViewModel.reminderAdapterList
                        reminderViewModelReminderAdapterList = reminderViewModel.getReminderAdapterList();
                    }
                    updateLiveDataRegistration(0, reminderViewModelReminderAdapterList);


                    if (reminderViewModelReminderAdapterList != null) {
                        // read reminderViewModel.reminderAdapterList.getValue()
                        reminderViewModelReminderAdapterListGetValue = reminderViewModelReminderAdapterList.getValue();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (reminderViewModel != null) {
                        // read reminderViewModel.isLoading()
                        reminderViewModelIsLoading = reminderViewModel.isLoading();
                    }
                    updateLiveDataRegistration(1, reminderViewModelIsLoading);


                    if (reminderViewModelIsLoading != null) {
                        // read reminderViewModel.isLoading().getValue()
                        reminderViewModelIsLoadingGetValue = reminderViewModelIsLoading.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(reminderViewModel.isLoading().getValue())
                    androidxDatabindingViewDataBindingSafeUnboxReminderViewModelIsLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(reminderViewModelIsLoadingGetValue);
                if((dirtyFlags & 0x1aL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxReminderViewModelIsLoadingGetValue) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(reminderViewModel.isLoading().getValue()) ? View.VISIBLE : View.GONE
                    reminderViewModelIsLoadingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxReminderViewModelIsLoadingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (reminderViewModel != null) {
                        // read reminderViewModel.showReminderPatientList
                        reminderViewModelShowReminderPatientList = reminderViewModel.getShowReminderPatientList();
                    }
                    updateLiveDataRegistration(2, reminderViewModelShowReminderPatientList);


                    if (reminderViewModelShowReminderPatientList != null) {
                        // read reminderViewModel.showReminderPatientList.getValue()
                        reminderViewModelShowReminderPatientListGetValue = reminderViewModelShowReminderPatientList.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(reminderViewModel.showReminderPatientList.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxReminderViewModelShowReminderPatientListGetValue = androidx.databinding.ViewDataBinding.safeUnbox(reminderViewModelShowReminderPatientListGetValue);
                if((dirtyFlags & 0x1cL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxReminderViewModelShowReminderPatientListGetValue) {
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(reminderViewModel.showReminderPatientList.getValue()) ? View.VISIBLE : View.GONE
                    reminderViewModelShowReminderPatientListViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxReminderViewModelShowReminderPatientListGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(reminderViewModel.showReminderPatientList.getValue()) ? View.GONE : View.VISIBLE
                    reminderViewModelShowReminderPatientListViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxReminderViewModelShowReminderPatientListGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.mboundView3.setVisibility(reminderViewModelIsLoadingViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.placeholderLayout.setVisibility(reminderViewModelShowReminderPatientListViewGONEViewVISIBLE);
            this.rvReminderList.setVisibility(reminderViewModelShowReminderPatientListViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.ReminderBindingAdapterKt.setUserNavList(this.rvReminderList, reminderViewModelReminderAdapterListGetValue, reminderViewModel);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): reminderViewModel.reminderAdapterList
        flag 1 (0x2L): reminderViewModel.isLoading()
        flag 2 (0x3L): reminderViewModel.showReminderPatientList
        flag 3 (0x4L): reminderViewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(reminderViewModel.showReminderPatientList.getValue()) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(reminderViewModel.showReminderPatientList.getValue()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(reminderViewModel.isLoading().getValue()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(reminderViewModel.isLoading().getValue()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(reminderViewModel.showReminderPatientList.getValue()) ? View.GONE : View.VISIBLE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(reminderViewModel.showReminderPatientList.getValue()) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}