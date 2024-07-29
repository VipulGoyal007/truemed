package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentReminderBottomSheetBindingImpl extends FragmentReminderBottomSheetBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.headerLayout, 6);
        sViewsWithIds.put(R.id.ivHeader, 7);
        sViewsWithIds.put(R.id.imClose, 8);
        sViewsWithIds.put(R.id.nsLayout, 9);
        sViewsWithIds.put(R.id.recyclerviewHeader, 10);
        sViewsWithIds.put(R.id.tmDropDownPatientList, 11);
        sViewsWithIds.put(R.id.setReminder, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.intellihealth.salt.views.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentReminderBottomSheetBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentReminderBottomSheetBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (com.intellihealth.salt.views.dropdown.DropDownHeader) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (com.intellihealth.salt.views.TextView) bindings[10]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (com.intellihealth.salt.views.buttons.ButtonLite) bindings[12]
            , (com.intellihealth.salt.views.dropdown.DropDownDefault) bindings[11]
            , (com.intellihealth.salt.views.TextView) bindings[3]
            , (com.intellihealth.salt.views.TextView) bindings[1]
            );
        this.dropDownHeader.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (com.intellihealth.salt.views.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.rvReminderTimer.setTag(null);
        this.tvName.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelAddReminderFromOrderStatusActivity((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelAlertReminderNameValue((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelAddReminderTitle((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelReminderFrequencyListData((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.reminder.FrequencyListModel.FrequencyList>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelAddReminderFromOrderStatusActivity(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelAddReminderFromOrderStatusActivity, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAlertReminderNameValue(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelAlertReminderNameValue, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAddReminderTitle(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelAddReminderTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelReminderFrequencyListData(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.reminder.FrequencyListModel.FrequencyList>> ViewModelReminderFrequencyListData, int fieldId) {
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
        java.lang.String viewModelAddReminderTitleToString = null;
        java.lang.String viewModelAddReminderTitleGetValue = null;
        java.lang.String javaLangStringForPatientViewModelAlertReminderNameValue = null;
        int viewModelAddReminderFromOrderStatusActivityViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelAddReminderFromOrderStatusActivity = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelAlertReminderNameValue = null;
        java.lang.Boolean viewModelAddReminderFromOrderStatusActivityGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelAddReminderFromOrderStatusActivityGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelAddReminderTitle = null;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.reminder.FrequencyListModel.FrequencyList>> viewModelReminderFrequencyListData = null;
        java.util.List<com.intellihealth.truemeds.data.model.reminder.FrequencyListModel.FrequencyList> viewModelReminderFrequencyListDataGetValue = null;
        int viewModelAddReminderFromOrderStatusActivityViewGONEViewVISIBLE = 0;
        java.lang.String viewModelAlertReminderNameValueGetValue = null;
        com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.addReminderFromOrderStatusActivity
                        viewModelAddReminderFromOrderStatusActivity = viewModel.getAddReminderFromOrderStatusActivity();
                    }
                    updateLiveDataRegistration(0, viewModelAddReminderFromOrderStatusActivity);


                    if (viewModelAddReminderFromOrderStatusActivity != null) {
                        // read viewModel.addReminderFromOrderStatusActivity.getValue()
                        viewModelAddReminderFromOrderStatusActivityGetValue = viewModelAddReminderFromOrderStatusActivity.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.addReminderFromOrderStatusActivity.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelAddReminderFromOrderStatusActivityGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelAddReminderFromOrderStatusActivityGetValue);
                if((dirtyFlags & 0x31L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelAddReminderFromOrderStatusActivityGetValue) {
                            dirtyFlags |= 0x80L;
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.addReminderFromOrderStatusActivity.getValue()) ? View.VISIBLE : View.GONE
                    viewModelAddReminderFromOrderStatusActivityViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelAddReminderFromOrderStatusActivityGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.addReminderFromOrderStatusActivity.getValue()) ? View.GONE : View.VISIBLE
                    viewModelAddReminderFromOrderStatusActivityViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelAddReminderFromOrderStatusActivityGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.alertReminderNameValue
                        viewModelAlertReminderNameValue = viewModel.getAlertReminderNameValue();
                    }
                    updateLiveDataRegistration(1, viewModelAlertReminderNameValue);


                    if (viewModelAlertReminderNameValue != null) {
                        // read viewModel.alertReminderNameValue.getValue()
                        viewModelAlertReminderNameValueGetValue = viewModelAlertReminderNameValue.getValue();
                    }


                    // read ("For Patient: ") + (viewModel.alertReminderNameValue.getValue())
                    javaLangStringForPatientViewModelAlertReminderNameValue = ("For Patient: ") + (viewModelAlertReminderNameValueGetValue);
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.addReminderTitle
                        viewModelAddReminderTitle = viewModel.getAddReminderTitle();
                    }
                    updateLiveDataRegistration(2, viewModelAddReminderTitle);


                    if (viewModelAddReminderTitle != null) {
                        // read viewModel.addReminderTitle.getValue()
                        viewModelAddReminderTitleGetValue = viewModelAddReminderTitle.getValue();
                    }


                    if (viewModelAddReminderTitleGetValue != null) {
                        // read viewModel.addReminderTitle.getValue().toString()
                        viewModelAddReminderTitleToString = viewModelAddReminderTitleGetValue.toString();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.reminderFrequencyListData
                        viewModelReminderFrequencyListData = viewModel.getReminderFrequencyListData();
                    }
                    updateLiveDataRegistration(3, viewModelReminderFrequencyListData);


                    if (viewModelReminderFrequencyListData != null) {
                        // read viewModel.reminderFrequencyListData.getValue()
                        viewModelReminderFrequencyListDataGetValue = viewModelReminderFrequencyListData.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            this.dropDownHeader.setVisibility(viewModelAddReminderFromOrderStatusActivityViewGONEViewVISIBLE);
            this.mboundView2.setVisibility(viewModelAddReminderFromOrderStatusActivityViewVISIBLEViewGONE);
            this.tvName.setVisibility(viewModelAddReminderFromOrderStatusActivityViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, javaLangStringForPatientViewModelAlertReminderNameValue);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.ReminderBindingAdapterKt.setReminderFrequency(this.rvReminderTimer, viewModelReminderFrequencyListDataGetValue, viewModel);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, viewModelAddReminderTitleToString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.addReminderFromOrderStatusActivity
        flag 1 (0x2L): viewModel.alertReminderNameValue
        flag 2 (0x3L): viewModel.addReminderTitle
        flag 3 (0x4L): viewModel.reminderFrequencyListData
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.addReminderFromOrderStatusActivity.getValue()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.addReminderFromOrderStatusActivity.getValue()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.addReminderFromOrderStatusActivity.getValue()) ? View.GONE : View.VISIBLE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.addReminderFromOrderStatusActivity.getValue()) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}