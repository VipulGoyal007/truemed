package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BottomsheetModificationItemBindingImpl extends BottomsheetModificationItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clHeader, 3);
        sViewsWithIds.put(R.id.viewDragHandle, 4);
        sViewsWithIds.put(R.id.imageClose, 5);
        sViewsWithIds.put(R.id.textView, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BottomsheetModificationItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private BottomsheetModificationItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (com.intellihealth.salt.views.TextView) bindings[6]
            , (com.intellihealth.salt.views.TextView) bindings[1]
            , (com.intellihealth.salt.views.cards.Divider) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (androidx.recyclerview.widget.RecyclerView) bindings[2];
        this.mboundView2.setTag(null);
        this.tvHeader.setTag(null);
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
        if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelCombinedModificationList((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.orderstatus.ModificationItem>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelCombinedModificationList(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.orderstatus.ModificationItem>> ViewModelCombinedModificationList, int fieldId) {
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
        int viewModelCombinedModificationListSize = 0;
        boolean viewModelCombinedModificationListSizeInt1 = false;
        java.lang.String viewModelCombinedModificationListSizeJavaLangStringItemWereModified = null;
        java.lang.String viewModelCombinedModificationListSizeInt1ViewModelCombinedModificationListSizeJavaLangStringItemsWereModifiedViewModelCombinedModificationListSizeJavaLangStringItemWereModified = null;
        java.lang.String viewModelCombinedModificationListSizeJavaLangStringItemsWereModified = null;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.orderstatus.ModificationItem>> viewModelCombinedModificationList = null;
        java.util.List<com.intellihealth.truemeds.data.model.orderstatus.ModificationItem> viewModelCombinedModificationListGetValue = null;
        com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.combinedModificationList
                    viewModelCombinedModificationList = viewModel.getCombinedModificationList();
                }
                updateLiveDataRegistration(0, viewModelCombinedModificationList);


                if (viewModelCombinedModificationList != null) {
                    // read viewModel.combinedModificationList.getValue()
                    viewModelCombinedModificationListGetValue = viewModelCombinedModificationList.getValue();
                }


                if (viewModelCombinedModificationListGetValue != null) {
                    // read viewModel.combinedModificationList.getValue().size()
                    viewModelCombinedModificationListSize = viewModelCombinedModificationListGetValue.size();
                }


                // read viewModel.combinedModificationList.getValue().size() > 1
                viewModelCombinedModificationListSizeInt1 = (viewModelCombinedModificationListSize) > (1);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelCombinedModificationListSizeInt1) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x8L) != 0) {

                // read (viewModel.combinedModificationList.getValue().size()) + (" item were modified")
                viewModelCombinedModificationListSizeJavaLangStringItemWereModified = (viewModelCombinedModificationListSize) + (" item were modified");
        }
        if ((dirtyFlags & 0x10L) != 0) {

                // read (viewModel.combinedModificationList.getValue().size()) + (" items were modified")
                viewModelCombinedModificationListSizeJavaLangStringItemsWereModified = (viewModelCombinedModificationListSize) + (" items were modified");
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read viewModel.combinedModificationList.getValue().size() > 1 ? (viewModel.combinedModificationList.getValue().size()) + (" items were modified") : (viewModel.combinedModificationList.getValue().size()) + (" item were modified")
                viewModelCombinedModificationListSizeInt1ViewModelCombinedModificationListSizeJavaLangStringItemsWereModifiedViewModelCombinedModificationListSizeJavaLangStringItemWereModified = ((viewModelCombinedModificationListSizeInt1) ? (viewModelCombinedModificationListSizeJavaLangStringItemsWereModified) : (viewModelCombinedModificationListSizeJavaLangStringItemWereModified));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.OrderStatusBindingAdapterKt.setModificationItemList(this.mboundView2, viewModelCombinedModificationListGetValue, viewModel);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHeader, viewModelCombinedModificationListSizeInt1ViewModelCombinedModificationListSizeJavaLangStringItemsWereModifiedViewModelCombinedModificationListSizeJavaLangStringItemWereModified);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.combinedModificationList
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.combinedModificationList.getValue().size() > 1 ? (viewModel.combinedModificationList.getValue().size()) + (" items were modified") : (viewModel.combinedModificationList.getValue().size()) + (" item were modified")
        flag 4 (0x5L): viewModel.combinedModificationList.getValue().size() > 1 ? (viewModel.combinedModificationList.getValue().size()) + (" items were modified") : (viewModel.combinedModificationList.getValue().size()) + (" item were modified")
    flag mapping end*/
    //end
}