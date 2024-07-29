package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AdapterReminderTimeItemBindingImpl extends AdapterReminderTimeItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.divider, 3);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AdapterReminderTimeItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private AdapterReminderTimeItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.intellihealth.salt.views.cards.Divider) bindings[3]
            , (com.intellihealth.salt.views.radiofield.RadioFieldLayout) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.intellihealth.salt.views.TextView) bindings[2]
            );
        this.radio.setTag(null);
        this.radioLayout.setTag(null);
        this.tvDate.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.reminderItem == variableId) {
            setReminderItem((com.intellihealth.truemeds.data.model.reminder.FrequencyListModel.FrequencyList) variable);
        }
        else if (BR.view == variableId) {
            setView((android.view.View) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setReminderItem(@Nullable com.intellihealth.truemeds.data.model.reminder.FrequencyListModel.FrequencyList ReminderItem) {
        this.mReminderItem = ReminderItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.reminderItem);
        super.requestRebind();
    }
    public void setView(@Nullable android.view.View View) {
        this.mView = View;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.intellihealth.truemeds.data.model.reminder.FrequencyListModel.FrequencyList reminderItem = mReminderItem;
        boolean reminderItemSelected = false;
        java.lang.String reminderItemShowReminderDate = null;
        int reminderItemIsSelectedViewVISIBLEViewGONE = 0;
        boolean reminderItemIsSelected = false;

        if ((dirtyFlags & 0x5L) != 0) {



                if (reminderItem != null) {
                    // read reminderItem.selected
                    reminderItemSelected = reminderItem.isSelected();
                    // read reminderItem.showReminderDate
                    reminderItemShowReminderDate = reminderItem.getShowReminderDate();
                    // read reminderItem.isSelected
                    reminderItemIsSelected = reminderItem.isSelected();
                }
            if((dirtyFlags & 0x5L) != 0) {
                if(reminderItemIsSelected) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read reminderItem.isSelected ? View.VISIBLE : View.GONE
                reminderItemIsSelectedViewVISIBLEViewGONE = ((reminderItemIsSelected) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.radio.setSelected(reminderItemSelected);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDate, reminderItemShowReminderDate);
            this.tvDate.setVisibility(reminderItemIsSelectedViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): reminderItem
        flag 1 (0x2L): view
        flag 2 (0x3L): null
        flag 3 (0x4L): reminderItem.isSelected ? View.VISIBLE : View.GONE
        flag 4 (0x5L): reminderItem.isSelected ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}