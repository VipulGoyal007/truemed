package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentReminderAlertBindingImpl extends FragmentReminderAlertBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.headerLayout, 3);
        sViewsWithIds.put(R.id.ivHeader, 4);
        sViewsWithIds.put(R.id.tvTitle, 5);
        sViewsWithIds.put(R.id.imClose, 6);
        sViewsWithIds.put(R.id.tvUpcomingReminder, 7);
        sViewsWithIds.put(R.id.imEdit, 8);
        sViewsWithIds.put(R.id.divider, 9);
        sViewsWithIds.put(R.id.tvNextStep, 10);
        sViewsWithIds.put(R.id.divider2, 11);
        sViewsWithIds.put(R.id.tmImageStatus, 12);
        sViewsWithIds.put(R.id.tmTextHeader, 13);
        sViewsWithIds.put(R.id.tmTextSubHeader, 14);
        sViewsWithIds.put(R.id.tmOrderStatusDetailCards1, 15);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentReminderAlertBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentReminderAlertBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.intellihealth.salt.views.DividerView) bindings[9]
            , (com.intellihealth.salt.views.cards.Divider) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[12]
            , (com.intellihealth.salt.views.orderstatustimeline.OrderStatusDetailCards) bindings[15]
            , (com.intellihealth.salt.views.TextView) bindings[13]
            , (com.intellihealth.salt.views.TextView) bindings[14]
            , (com.intellihealth.salt.views.TextView) bindings[10]
            , (com.intellihealth.salt.views.TextView) bindings[2]
            , (com.intellihealth.salt.views.TextView) bindings[5]
            , (com.intellihealth.salt.views.TextView) bindings[7]
            , (com.intellihealth.salt.views.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvSnoozeTime.setTag(null);
        this.userName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.reminderViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeReminderViewModelEditReminderFrequency((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeReminderViewModelEditReminderNameValue((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeReminderViewModelEditReminderFrequency(androidx.lifecycle.MutableLiveData<java.lang.Integer> ReminderViewModelEditReminderFrequency, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeReminderViewModelEditReminderNameValue(androidx.lifecycle.MutableLiveData<java.lang.String> ReminderViewModelEditReminderNameValue, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        java.lang.String reminderViewModelEditReminderFrequencyToString = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> reminderViewModelEditReminderFrequency = null;
        com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel reminderViewModel = mReminderViewModel;
        java.lang.String javaLangStringEveryReminderViewModelEditReminderFrequencyToString = null;
        java.lang.String reminderViewModelEditReminderNameValueGetValue = null;
        java.lang.String javaLangStringEveryReminderViewModelEditReminderFrequencyToStringJavaLangStringDays = null;
        java.lang.Integer reminderViewModelEditReminderFrequencyGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> reminderViewModelEditReminderNameValue = null;
        java.lang.String javaLangStringForPatientReminderViewModelEditReminderNameValue = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (reminderViewModel != null) {
                        // read reminderViewModel.editReminderFrequency
                        reminderViewModelEditReminderFrequency = reminderViewModel.getEditReminderFrequency();
                    }
                    updateLiveDataRegistration(0, reminderViewModelEditReminderFrequency);


                    if (reminderViewModelEditReminderFrequency != null) {
                        // read reminderViewModel.editReminderFrequency.getValue()
                        reminderViewModelEditReminderFrequencyGetValue = reminderViewModelEditReminderFrequency.getValue();
                    }


                    if (reminderViewModelEditReminderFrequencyGetValue != null) {
                        // read reminderViewModel.editReminderFrequency.getValue().toString()
                        reminderViewModelEditReminderFrequencyToString = reminderViewModelEditReminderFrequencyGetValue.toString();
                    }


                    // read ("Every ") + (reminderViewModel.editReminderFrequency.getValue().toString())
                    javaLangStringEveryReminderViewModelEditReminderFrequencyToString = ("Every ") + (reminderViewModelEditReminderFrequencyToString);


                    // read (("Every ") + (reminderViewModel.editReminderFrequency.getValue().toString())) + (" Days ")
                    javaLangStringEveryReminderViewModelEditReminderFrequencyToStringJavaLangStringDays = (javaLangStringEveryReminderViewModelEditReminderFrequencyToString) + (" Days ");
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (reminderViewModel != null) {
                        // read reminderViewModel.editReminderNameValue
                        reminderViewModelEditReminderNameValue = reminderViewModel.getEditReminderNameValue();
                    }
                    updateLiveDataRegistration(1, reminderViewModelEditReminderNameValue);


                    if (reminderViewModelEditReminderNameValue != null) {
                        // read reminderViewModel.editReminderNameValue.getValue()
                        reminderViewModelEditReminderNameValueGetValue = reminderViewModelEditReminderNameValue.getValue();
                    }


                    // read ("For Patient: ") + (reminderViewModel.editReminderNameValue.getValue())
                    javaLangStringForPatientReminderViewModelEditReminderNameValue = ("For Patient: ") + (reminderViewModelEditReminderNameValueGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSnoozeTime, javaLangStringEveryReminderViewModelEditReminderFrequencyToStringJavaLangStringDays);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.userName, javaLangStringForPatientReminderViewModelEditReminderNameValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): reminderViewModel.editReminderFrequency
        flag 1 (0x2L): reminderViewModel.editReminderNameValue
        flag 2 (0x3L): reminderViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}