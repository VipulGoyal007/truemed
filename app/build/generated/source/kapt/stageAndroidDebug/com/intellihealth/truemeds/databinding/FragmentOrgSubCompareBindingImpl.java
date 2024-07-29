package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOrgSubCompareBindingImpl extends FragmentOrgSubCompareBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.headerLayout, 3);
        sViewsWithIds.put(R.id.tvTitle, 4);
        sViewsWithIds.put(R.id.closeBottomSheet, 5);
        sViewsWithIds.put(R.id.scroll, 6);
        sViewsWithIds.put(R.id.orgTitle, 7);
        sViewsWithIds.put(R.id.ivTriangleView, 8);
        sViewsWithIds.put(R.id.subsIcon, 9);
        sViewsWithIds.put(R.id.subsTitle, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentOrgSubCompareBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentOrgSubCompareBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (com.intellihealth.salt.views.cards.FullWidthProductCard) bindings[1]
            , (com.intellihealth.salt.views.TextView) bindings[7]
            , (androidx.core.widget.NestedScrollView) bindings[6]
            , (com.intellihealth.salt.views.cards.FullWidthProductCard) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[9]
            , (com.intellihealth.salt.views.TextView) bindings[10]
            , (com.intellihealth.salt.views.TextView) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.orgCard.setTag(null);
        this.subsCard.setTag(null);
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
        if (BR.subsModel == variableId) {
            setSubsModel((com.intellihealth.salt.models.ProductInfoModel) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel) variable);
        }
        else if (BR.orgModel == variableId) {
            setOrgModel((com.intellihealth.salt.models.ProductInfoModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSubsModel(@Nullable com.intellihealth.salt.models.ProductInfoModel SubsModel) {
        this.mSubsModel = SubsModel;
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    public void setOrgModel(@Nullable com.intellihealth.salt.models.ProductInfoModel OrgModel) {
        this.mOrgModel = OrgModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelOrgBottomSheet((androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.ProductInfoModel>) object, fieldId);
            case 1 :
                return onChangeViewModelSbsBottomSheet((androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.ProductInfoModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelOrgBottomSheet(androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.ProductInfoModel> ViewModelOrgBottomSheet, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSbsBottomSheet(androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.ProductInfoModel> ViewModelSbsBottomSheet, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.ProductInfoModel> viewModelOrgBottomSheet = null;
        com.intellihealth.salt.models.ProductInfoModel viewModelOrgBottomSheetGetValue = null;
        com.intellihealth.salt.models.ProductInfoModel viewModelSbsBottomSheetGetValue = null;
        com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel viewModel = mViewModel;
        androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.ProductInfoModel> viewModelSbsBottomSheet = null;

        if ((dirtyFlags & 0x2bL) != 0) {


            if ((dirtyFlags & 0x29L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.orgBottomSheet
                        viewModelOrgBottomSheet = viewModel.getOrgBottomSheet();
                    }
                    updateLiveDataRegistration(0, viewModelOrgBottomSheet);


                    if (viewModelOrgBottomSheet != null) {
                        // read viewModel.orgBottomSheet.getValue()
                        viewModelOrgBottomSheetGetValue = viewModelOrgBottomSheet.getValue();
                    }
            }
            if ((dirtyFlags & 0x2aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.sbsBottomSheet
                        viewModelSbsBottomSheet = viewModel.getSbsBottomSheet();
                    }
                    updateLiveDataRegistration(1, viewModelSbsBottomSheet);


                    if (viewModelSbsBottomSheet != null) {
                        // read viewModel.sbsBottomSheet.getValue()
                        viewModelSbsBottomSheetGetValue = viewModelSbsBottomSheet.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            this.orgCard.setCrossSellingData(viewModelOrgBottomSheetGetValue);
        }
        if ((dirtyFlags & 0x2aL) != 0) {
            // api target 1

            this.subsCard.setCrossSellingData(viewModelSbsBottomSheetGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.orgBottomSheet
        flag 1 (0x2L): viewModel.sbsBottomSheet
        flag 2 (0x3L): subsModel
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): orgModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}