package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BottomsheetFilterBindingImpl extends BottomsheetFilterBinding implements com.intellihealth.truemeds.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.helpTopHeader, 8);
        sViewsWithIds.put(R.id.tvSubCategoryTitle, 9);
        sViewsWithIds.put(R.id.ivClose, 10);
        sViewsWithIds.put(R.id.entireListingView, 11);
        sViewsWithIds.put(R.id.clSelectType, 12);
        sViewsWithIds.put(R.id.tvBrands, 13);
        sViewsWithIds.put(R.id.divider, 14);
        sViewsWithIds.put(R.id.clShowList, 15);
        sViewsWithIds.put(R.id.divider2, 16);
        sViewsWithIds.put(R.id.clButtonView, 17);
        sViewsWithIds.put(R.id.clClear, 18);
        sViewsWithIds.put(R.id.clApply, 19);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback62;
    @Nullable
    private final android.view.View.OnClickListener mCallback61;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BottomsheetFilterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private BottomsheetFilterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.intellihealth.salt.views.buttons.Button) bindings[7]
            , (com.intellihealth.salt.views.buttons.Button) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[19]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[18]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (android.view.View) bindings[14]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[10]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (com.intellihealth.salt.views.TextView) bindings[13]
            , (com.intellihealth.salt.views.TextView) bindings[1]
            , (com.intellihealth.salt.views.TextView) bindings[2]
            , (com.intellihealth.salt.views.TextView) bindings[9]
            );
        this.btnApply.setTag(null);
        this.btnClear.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rvBrandsList.setTag(null);
        this.rvCategoryList.setTag(null);
        this.rvSubCategoryList.setTag(null);
        this.tvCategory.setTag(null);
        this.tvSubCategory.setTag(null);
        setRootTag(root);
        // listeners
        mCallback62 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 2);
        mCallback61 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 1);
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
        if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelBrandBottomSheetListTemp((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllBrandsTypeResponse.BrandType>>) object, fieldId);
            case 1 :
                return onChangeViewModelSubCategoryBottomSheetListTemp((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllSubCategoryTypeResponse.SubCategoryType>>) object, fieldId);
            case 2 :
                return onChangeViewModelCategoryBottomSheetListTemp((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelBrandBottomSheetListTemp(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllBrandsTypeResponse.BrandType>> ViewModelBrandBottomSheetListTemp, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSubCategoryBottomSheetListTemp(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllSubCategoryTypeResponse.SubCategoryType>> ViewModelSubCategoryBottomSheetListTemp, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCategoryBottomSheetListTemp(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel>> ViewModelCategoryBottomSheetListTemp, int fieldId) {
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
        boolean viewModelCategoryBottomSheetListTempSizeInt0 = false;
        int viewModelSubCategoryBottomSheetListTempSizeInt0ViewVISIBLEViewGONE = 0;
        int viewModelCategoryBottomSheetListTempSize = 0;
        boolean viewModelSubCategoryBottomSheetListTempSizeInt0 = false;
        int viewModelCategoryBottomSheetListTempSizeInt0ViewVISIBLEViewGONE = 0;
        java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel> viewModelCategoryBottomSheetListTempGetValue = null;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllBrandsTypeResponse.BrandType>> viewModelBrandBottomSheetListTemp = null;
        int viewModelSubCategoryBottomSheetListTempSize = 0;
        java.util.List<com.intellihealth.truemeds.data.model.user.GetAllBrandsTypeResponse.BrandType> viewModelBrandBottomSheetListTempGetValue = null;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllSubCategoryTypeResponse.SubCategoryType>> viewModelSubCategoryBottomSheetListTemp = null;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel>> viewModelCategoryBottomSheetListTemp = null;
        java.util.List<com.intellihealth.truemeds.data.model.user.GetAllSubCategoryTypeResponse.SubCategoryType> viewModelSubCategoryBottomSheetListTempGetValue = null;
        com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.brandBottomSheetListTemp
                        viewModelBrandBottomSheetListTemp = viewModel.getBrandBottomSheetListTemp();
                    }
                    updateLiveDataRegistration(0, viewModelBrandBottomSheetListTemp);


                    if (viewModelBrandBottomSheetListTemp != null) {
                        // read viewModel.brandBottomSheetListTemp.getValue()
                        viewModelBrandBottomSheetListTempGetValue = viewModelBrandBottomSheetListTemp.getValue();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.subCategoryBottomSheetListTemp
                        viewModelSubCategoryBottomSheetListTemp = viewModel.getSubCategoryBottomSheetListTemp();
                    }
                    updateLiveDataRegistration(1, viewModelSubCategoryBottomSheetListTemp);


                    if (viewModelSubCategoryBottomSheetListTemp != null) {
                        // read viewModel.subCategoryBottomSheetListTemp.getValue()
                        viewModelSubCategoryBottomSheetListTempGetValue = viewModelSubCategoryBottomSheetListTemp.getValue();
                    }


                    if (viewModelSubCategoryBottomSheetListTempGetValue != null) {
                        // read viewModel.subCategoryBottomSheetListTemp.getValue().size
                        viewModelSubCategoryBottomSheetListTempSize = viewModelSubCategoryBottomSheetListTempGetValue.size();
                    }


                    // read viewModel.subCategoryBottomSheetListTemp.getValue().size > 0
                    viewModelSubCategoryBottomSheetListTempSizeInt0 = (viewModelSubCategoryBottomSheetListTempSize) > (0);
                if((dirtyFlags & 0x1aL) != 0) {
                    if(viewModelSubCategoryBottomSheetListTempSizeInt0) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read viewModel.subCategoryBottomSheetListTemp.getValue().size > 0 ? View.VISIBLE : View.GONE
                    viewModelSubCategoryBottomSheetListTempSizeInt0ViewVISIBLEViewGONE = ((viewModelSubCategoryBottomSheetListTempSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.categoryBottomSheetListTemp
                        viewModelCategoryBottomSheetListTemp = viewModel.getCategoryBottomSheetListTemp();
                    }
                    updateLiveDataRegistration(2, viewModelCategoryBottomSheetListTemp);


                    if (viewModelCategoryBottomSheetListTemp != null) {
                        // read viewModel.categoryBottomSheetListTemp.getValue()
                        viewModelCategoryBottomSheetListTempGetValue = viewModelCategoryBottomSheetListTemp.getValue();
                    }


                    if (viewModelCategoryBottomSheetListTempGetValue != null) {
                        // read viewModel.categoryBottomSheetListTemp.getValue().size
                        viewModelCategoryBottomSheetListTempSize = viewModelCategoryBottomSheetListTempGetValue.size();
                    }


                    // read viewModel.categoryBottomSheetListTemp.getValue().size > 0
                    viewModelCategoryBottomSheetListTempSizeInt0 = (viewModelCategoryBottomSheetListTempSize) > (0);
                if((dirtyFlags & 0x1cL) != 0) {
                    if(viewModelCategoryBottomSheetListTempSizeInt0) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read viewModel.categoryBottomSheetListTemp.getValue().size > 0 ? View.VISIBLE : View.GONE
                    viewModelCategoryBottomSheetListTempSizeInt0ViewVISIBLEViewGONE = ((viewModelCategoryBottomSheetListTempSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.btnApply.setOnClickListener(mCallback62);
            this.btnClear.setOnClickListener(mCallback61);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.BrandsTypeListBindingAdapterKt.setBrandsTypeList(this.rvBrandsList, viewModelBrandBottomSheetListTempGetValue, viewModel);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.rvCategoryList.setVisibility(viewModelCategoryBottomSheetListTempSizeInt0ViewVISIBLEViewGONE);
            com.intellihealth.truemeds.presentation.bindingadapter.CategoryTypeListBindingAdapterKt.setCategoryTypeList(this.rvCategoryList, viewModelCategoryBottomSheetListTempGetValue, viewModel);
            this.tvCategory.setVisibility(viewModelCategoryBottomSheetListTempSizeInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.SubCategoryTypeListBindingAdapterKt.setSubCategoryTypeList(this.rvSubCategoryList, viewModelSubCategoryBottomSheetListTempGetValue, viewModel);
            this.tvSubCategory.setVisibility(viewModelSubCategoryBottomSheetListTempSizeInt0ViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.bottomSheetApplyClick(callbackArg_0);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.bottomSheetClearClick(callbackArg_0);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.brandBottomSheetListTemp
        flag 1 (0x2L): viewModel.subCategoryBottomSheetListTemp
        flag 2 (0x3L): viewModel.categoryBottomSheetListTemp
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): viewModel.subCategoryBottomSheetListTemp.getValue().size > 0 ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewModel.subCategoryBottomSheetListTemp.getValue().size > 0 ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewModel.categoryBottomSheetListTemp.getValue().size > 0 ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewModel.categoryBottomSheetListTemp.getValue().size > 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}