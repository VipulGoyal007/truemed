package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BottomsheetItemNoLongerAvailableBindingImpl extends BottomsheetItemNoLongerAvailableBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.topHeader, 3);
        sViewsWithIds.put(R.id.viewDragHandle, 4);
        sViewsWithIds.put(R.id.ivClose, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BottomsheetItemNoLongerAvailableBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private BottomsheetItemNoLongerAvailableBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (com.intellihealth.salt.views.TextView) bindings[1]
            , (android.view.View) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rvCart.setTag(null);
        this.tvSubCategoryTitle.setTag(null);
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
        if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.CartViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.CartViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelListUnavailableItems((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>>) object, fieldId);
            case 1 :
                return onChangeViewModelItemsNotAvailableCount((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelListUnavailableItems(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> ViewModelListUnavailableItems, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelItemsNotAvailableCount(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelItemsNotAvailableCount, int fieldId) {
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
        java.lang.String stringFormatJavaLangStringViewModelItemsNotAvailableCountJavaLangStringTvSubCategoryTitleAndroidStringItemsAreNoLongerAvailableWithCount = null;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> viewModelListUnavailableItems = null;
        boolean viewModelItemsNotAvailableCountInt1 = false;
        java.lang.String stringFormatJavaLangStringViewModelItemsNotAvailableCountJavaLangStringTvSubCategoryTitleAndroidStringItemsAreNoLongerAvailableSingleCount = null;
        java.lang.String javaLangStringViewModelItemsNotAvailableCountJavaLangString = null;
        java.lang.String viewModelItemsNotAvailableCountInt1StringFormatJavaLangStringViewModelItemsNotAvailableCountJavaLangStringTvSubCategoryTitleAndroidStringItemsAreNoLongerAvailableWithCountStringFormatJavaLangStringViewModelItemsNotAvailableCountJavaLangStringTvSubCategoryTitleAndroidStringItemsAreNoLongerAvailableSingleCount = null;
        java.lang.String javaLangStringViewModelItemsNotAvailableCountJavaLangStringTvSubCategoryTitleAndroidStringItemsAreNoLongerAvailableWithCount = null;
        java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> viewModelListUnavailableItemsGetValue = null;
        java.lang.Integer viewModelItemsNotAvailableCountGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelItemsNotAvailableCount = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelItemsNotAvailableCountGetValue = 0;
        java.lang.String javaLangStringViewModelItemsNotAvailableCount = null;
        com.intellihealth.truemeds.presentation.viewmodel.CartViewModel viewModel = mViewModel;
        java.lang.String javaLangStringViewModelItemsNotAvailableCountJavaLangStringTvSubCategoryTitleAndroidStringItemsAreNoLongerAvailableSingleCount = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.listUnavailableItems
                        viewModelListUnavailableItems = viewModel.getListUnavailableItems();
                    }
                    updateLiveDataRegistration(0, viewModelListUnavailableItems);


                    if (viewModelListUnavailableItems != null) {
                        // read viewModel.listUnavailableItems.getValue()
                        viewModelListUnavailableItemsGetValue = viewModelListUnavailableItems.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.itemsNotAvailableCount
                        viewModelItemsNotAvailableCount = viewModel.getItemsNotAvailableCount();
                    }
                    updateLiveDataRegistration(1, viewModelItemsNotAvailableCount);


                    if (viewModelItemsNotAvailableCount != null) {
                        // read viewModel.itemsNotAvailableCount.getValue()
                        viewModelItemsNotAvailableCountGetValue = viewModelItemsNotAvailableCount.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.itemsNotAvailableCount.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelItemsNotAvailableCountGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelItemsNotAvailableCountGetValue);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.itemsNotAvailableCount.getValue()) > 1
                    viewModelItemsNotAvailableCountInt1 = (androidxDatabindingViewDataBindingSafeUnboxViewModelItemsNotAvailableCountGetValue) > (1);
                if((dirtyFlags & 0xeL) != 0) {
                    if(viewModelItemsNotAvailableCountInt1) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x30L) != 0) {

                // read ("") + (viewModel.itemsNotAvailableCount.getValue())
                javaLangStringViewModelItemsNotAvailableCount = ("") + (viewModelItemsNotAvailableCountGetValue);


                // read (("") + (viewModel.itemsNotAvailableCount.getValue())) + (" ")
                javaLangStringViewModelItemsNotAvailableCountJavaLangString = (javaLangStringViewModelItemsNotAvailableCount) + (" ");

            if ((dirtyFlags & 0x20L) != 0) {

                    // read ((("") + (viewModel.itemsNotAvailableCount.getValue())) + (" ")) + (@android:string/items_are_no_longer_available_with_count)
                    javaLangStringViewModelItemsNotAvailableCountJavaLangStringTvSubCategoryTitleAndroidStringItemsAreNoLongerAvailableWithCount = (javaLangStringViewModelItemsNotAvailableCountJavaLangString) + (tvSubCategoryTitle.getResources().getString(R.string.items_are_no_longer_available_with_count));


                    // read String.format(((("") + (viewModel.itemsNotAvailableCount.getValue())) + (" ")) + (@android:string/items_are_no_longer_available_with_count))
                    stringFormatJavaLangStringViewModelItemsNotAvailableCountJavaLangStringTvSubCategoryTitleAndroidStringItemsAreNoLongerAvailableWithCount = java.lang.String.format(javaLangStringViewModelItemsNotAvailableCountJavaLangStringTvSubCategoryTitleAndroidStringItemsAreNoLongerAvailableWithCount);
            }
            if ((dirtyFlags & 0x10L) != 0) {

                    // read ((("") + (viewModel.itemsNotAvailableCount.getValue())) + (" ")) + (@android:string/items_are_no_longer_available_single_count)
                    javaLangStringViewModelItemsNotAvailableCountJavaLangStringTvSubCategoryTitleAndroidStringItemsAreNoLongerAvailableSingleCount = (javaLangStringViewModelItemsNotAvailableCountJavaLangString) + (tvSubCategoryTitle.getResources().getString(R.string.items_are_no_longer_available_single_count));


                    // read String.format(((("") + (viewModel.itemsNotAvailableCount.getValue())) + (" ")) + (@android:string/items_are_no_longer_available_single_count))
                    stringFormatJavaLangStringViewModelItemsNotAvailableCountJavaLangStringTvSubCategoryTitleAndroidStringItemsAreNoLongerAvailableSingleCount = java.lang.String.format(javaLangStringViewModelItemsNotAvailableCountJavaLangStringTvSubCategoryTitleAndroidStringItemsAreNoLongerAvailableSingleCount);
            }
        }

        if ((dirtyFlags & 0xeL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.itemsNotAvailableCount.getValue()) > 1 ? String.format(((("") + (viewModel.itemsNotAvailableCount.getValue())) + (" ")) + (@android:string/items_are_no_longer_available_with_count)) : String.format(((("") + (viewModel.itemsNotAvailableCount.getValue())) + (" ")) + (@android:string/items_are_no_longer_available_single_count))
                viewModelItemsNotAvailableCountInt1StringFormatJavaLangStringViewModelItemsNotAvailableCountJavaLangStringTvSubCategoryTitleAndroidStringItemsAreNoLongerAvailableWithCountStringFormatJavaLangStringViewModelItemsNotAvailableCountJavaLangStringTvSubCategoryTitleAndroidStringItemsAreNoLongerAvailableSingleCount = ((viewModelItemsNotAvailableCountInt1) ? (stringFormatJavaLangStringViewModelItemsNotAvailableCountJavaLangStringTvSubCategoryTitleAndroidStringItemsAreNoLongerAvailableWithCount) : (stringFormatJavaLangStringViewModelItemsNotAvailableCountJavaLangStringTvSubCategoryTitleAndroidStringItemsAreNoLongerAvailableSingleCount));
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.ItemNoLongerAvailabeBindingAdapterKt.setItemNoLongerAvailableList(this.rvCart, viewModelListUnavailableItemsGetValue, viewModel);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSubCategoryTitle, viewModelItemsNotAvailableCountInt1StringFormatJavaLangStringViewModelItemsNotAvailableCountJavaLangStringTvSubCategoryTitleAndroidStringItemsAreNoLongerAvailableWithCountStringFormatJavaLangStringViewModelItemsNotAvailableCountJavaLangStringTvSubCategoryTitleAndroidStringItemsAreNoLongerAvailableSingleCount);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.listUnavailableItems
        flag 1 (0x2L): viewModel.itemsNotAvailableCount
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.itemsNotAvailableCount.getValue()) > 1 ? String.format(((("") + (viewModel.itemsNotAvailableCount.getValue())) + (" ")) + (@android:string/items_are_no_longer_available_with_count)) : String.format(((("") + (viewModel.itemsNotAvailableCount.getValue())) + (" ")) + (@android:string/items_are_no_longer_available_single_count))
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.itemsNotAvailableCount.getValue()) > 1 ? String.format(((("") + (viewModel.itemsNotAvailableCount.getValue())) + (" ")) + (@android:string/items_are_no_longer_available_with_count)) : String.format(((("") + (viewModel.itemsNotAvailableCount.getValue())) + (" ")) + (@android:string/items_are_no_longer_available_single_count))
    flag mapping end*/
    //end
}