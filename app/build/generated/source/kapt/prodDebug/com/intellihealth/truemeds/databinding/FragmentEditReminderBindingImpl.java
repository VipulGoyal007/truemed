package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEditReminderBindingImpl extends FragmentEditReminderBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.headerLayout, 2);
        sViewsWithIds.put(R.id.ivHeader, 3);
        sViewsWithIds.put(R.id.tvTitle, 4);
        sViewsWithIds.put(R.id.ivClose, 5);
        sViewsWithIds.put(R.id.tvLabel, 6);
        sViewsWithIds.put(R.id.inputLabel, 7);
        sViewsWithIds.put(R.id.tvReminderHeader, 8);
        sViewsWithIds.put(R.id.rvChips, 9);
        sViewsWithIds.put(R.id.left, 10);
        sViewsWithIds.put(R.id.chip1, 11);
        sViewsWithIds.put(R.id.chip3, 12);
        sViewsWithIds.put(R.id.chip5, 13);
        sViewsWithIds.put(R.id.right, 14);
        sViewsWithIds.put(R.id.chip2, 15);
        sViewsWithIds.put(R.id.chip4, 16);
        sViewsWithIds.put(R.id.chip6, 17);
        sViewsWithIds.put(R.id.deleteReminder, 18);
        sViewsWithIds.put(R.id.goBack, 19);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.intellihealth.salt.views.TextView mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentEditReminderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private FragmentEditReminderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.intellihealth.salt.views.chip.Chip) bindings[11]
            , (com.intellihealth.salt.views.chip.Chip) bindings[15]
            , (com.intellihealth.salt.views.chip.Chip) bindings[12]
            , (com.intellihealth.salt.views.chip.Chip) bindings[16]
            , (com.intellihealth.salt.views.chip.Chip) bindings[13]
            , (com.intellihealth.salt.views.chip.Chip) bindings[17]
            , (com.intellihealth.salt.views.buttons.ButtonLite) bindings[18]
            , (com.intellihealth.salt.views.buttons.ButtonLite) bindings[19]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (android.widget.EditText) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (com.intellihealth.salt.views.TextView) bindings[6]
            , (com.intellihealth.salt.views.TextView) bindings[8]
            , (com.intellihealth.salt.views.TextView) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.intellihealth.salt.views.TextView) bindings[1];
        this.mboundView1.setTag(null);
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
        else if (BR.callback == variableId) {
            setCallback((com.intellihealth.salt.views.section.ProductCardSection.ProductCardSectionCallback) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setReminderViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel ReminderViewModel) {
        this.mReminderViewModel = ReminderViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.reminderViewModel);
        super.requestRebind();
    }
    public void setCallback(@Nullable com.intellihealth.salt.views.section.ProductCardSection.ProductCardSectionCallback Callback) {
        this.mCallback = Callback;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeReminderViewModelEditReminderNameValue((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeReminderViewModelEditReminderNameValue(androidx.lifecycle.MutableLiveData<java.lang.String> ReminderViewModelEditReminderNameValue, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel reminderViewModel = mReminderViewModel;
        java.lang.String reminderViewModelEditReminderNameValueGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> reminderViewModelEditReminderNameValue = null;
        java.lang.String javaLangStringForPatientReminderViewModelEditReminderNameValue = null;

        if ((dirtyFlags & 0xbL) != 0) {



                if (reminderViewModel != null) {
                    // read reminderViewModel.editReminderNameValue
                    reminderViewModelEditReminderNameValue = reminderViewModel.getEditReminderNameValue();
                }
                updateLiveDataRegistration(0, reminderViewModelEditReminderNameValue);


                if (reminderViewModelEditReminderNameValue != null) {
                    // read reminderViewModel.editReminderNameValue.getValue()
                    reminderViewModelEditReminderNameValueGetValue = reminderViewModelEditReminderNameValue.getValue();
                }


                // read ("For Patient: ") + (reminderViewModel.editReminderNameValue.getValue())
                javaLangStringForPatientReminderViewModelEditReminderNameValue = ("For Patient: ") + (reminderViewModelEditReminderNameValueGetValue);
        }
        // batch finished
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, javaLangStringForPatientReminderViewModelEditReminderNameValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): reminderViewModel.editReminderNameValue
        flag 1 (0x2L): reminderViewModel
        flag 2 (0x3L): callback
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}