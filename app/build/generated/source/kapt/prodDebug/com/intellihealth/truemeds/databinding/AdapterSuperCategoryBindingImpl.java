package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AdapterSuperCategoryBindingImpl extends AdapterSuperCategoryBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clCategoryMain, 4);
        sViewsWithIds.put(R.id.tvTextShopByCategories, 5);
        sViewsWithIds.put(R.id.bothRecyclerview, 6);
        sViewsWithIds.put(R.id.llCategory, 7);
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AdapterSuperCategoryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private AdapterSuperCategoryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (com.intellihealth.salt.views.buttons.Button) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (com.intellihealth.salt.views.TextView) bindings[5]
            );
        this.btnViewAll.setTag(null);
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.rvCategory.setTag(null);
        this.rvSuperCategory.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
        if (BR.position == variableId) {
            setPosition((java.lang.Integer) variable);
        }
        else if (BR.superCategoryList == variableId) {
            setSuperCategoryList((java.util.List<com.intellihealth.truemeds.data.model.home.SuperCategoryModel>) variable);
        }
        else if (BR.categoryLevel2List == variableId) {
            setCategoryLevel2List((java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel>) variable);
        }
        else if (BR.superCategory == variableId) {
            setSuperCategory((java.lang.String) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPosition(@Nullable java.lang.Integer Position) {
        this.mPosition = Position;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.position);
        super.requestRebind();
    }
    public void setSuperCategoryList(@Nullable java.util.List<com.intellihealth.truemeds.data.model.home.SuperCategoryModel> SuperCategoryList) {
        this.mSuperCategoryList = SuperCategoryList;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.superCategoryList);
        super.requestRebind();
    }
    public void setCategoryLevel2List(@Nullable java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel> CategoryLevel2List) {
        this.mCategoryLevel2List = CategoryLevel2List;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.categoryLevel2List);
        super.requestRebind();
    }
    public void setSuperCategory(@Nullable java.lang.String SuperCategory) {
        this.mSuperCategory = SuperCategory;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.superCategory);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelOtcBanners((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.SuperCategoryModel.BannersItem>>) object, fieldId);
            case 1 :
                return onChangeViewModelSuperCategoryList((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.SuperCategoryModel>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelOtcBanners(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.SuperCategoryModel.BannersItem>> ViewModelOtcBanners, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSuperCategoryList(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.SuperCategoryModel>> ViewModelSuperCategoryList, int fieldId) {
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
        boolean viewModelSuperCategoryListSizeInt0 = false;
        java.lang.Integer position = mPosition;
        java.util.List<com.intellihealth.truemeds.data.model.home.SuperCategoryModel> superCategoryList = mSuperCategoryList;
        int superCategoryListGetPositionId = 0;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.SuperCategoryModel.BannersItem>> viewModelOtcBanners = null;
        int viewModelSuperCategoryListSizeInt0ViewVISIBLEViewGONE = 0;
        java.util.List<com.intellihealth.truemeds.data.model.home.SuperCategoryModel.BannersItem> superCategoryListSizeInt0SuperCategoryListGetPositionBannersViewModelOtcBanners = null;
        java.util.List<com.intellihealth.truemeds.data.model.home.SuperCategoryModel.BannersItem> viewModelOtcBannersGetValue = null;
        com.intellihealth.truemeds.data.model.home.SuperCategoryModel superCategoryListGetPosition = null;
        java.util.List<com.intellihealth.truemeds.data.model.home.SuperCategoryModel> viewModelSuperCategoryListGetValue = null;
        java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel> categoryLevel2List = mCategoryLevel2List;
        boolean superCategoryListSizeInt0 = false;
        java.lang.String superCategory = mSuperCategory;
        int superCategoryListSize = 0;
        int viewModelSuperCategoryListSize = 0;
        int superCategoryListSizeInt0SuperCategoryListGetPositionIdInt1 = 0;
        int androidxDatabindingViewDataBindingSafeUnboxPosition = 0;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.SuperCategoryModel>> viewModelSuperCategoryList = null;
        com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel viewModel = mViewModel;
        java.util.List<com.intellihealth.truemeds.data.model.home.SuperCategoryModel.BannersItem> superCategoryListGetPositionBanners = null;

        if ((dirtyFlags & 0xddL) != 0) {



                if (superCategoryList != null) {
                    // read superCategoryList.size
                    superCategoryListSize = superCategoryList.size();
                }


                // read superCategoryList.size > 0
                superCategoryListSizeInt0 = (superCategoryListSize) > (0);
            if((dirtyFlags & 0xddL) != 0) {
                if(superCategoryListSizeInt0) {
                        dirtyFlags |= 0x800L;
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x400L;
                        dirtyFlags |= 0x1000L;
                }
            }
        }
        if ((dirtyFlags & 0xa0L) != 0) {
        }
        if ((dirtyFlags & 0xdfL) != 0) {


            if ((dirtyFlags & 0xc8L) != 0) {
            }
            if ((dirtyFlags & 0xc2L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.superCategoryList
                        viewModelSuperCategoryList = viewModel.getSuperCategoryList();
                    }
                    updateLiveDataRegistration(1, viewModelSuperCategoryList);


                    if (viewModelSuperCategoryList != null) {
                        // read viewModel.superCategoryList.getValue()
                        viewModelSuperCategoryListGetValue = viewModelSuperCategoryList.getValue();
                    }


                    if (viewModelSuperCategoryListGetValue != null) {
                        // read viewModel.superCategoryList.getValue().size()
                        viewModelSuperCategoryListSize = viewModelSuperCategoryListGetValue.size();
                    }


                    // read viewModel.superCategoryList.getValue().size() > 0
                    viewModelSuperCategoryListSizeInt0 = (viewModelSuperCategoryListSize) > (0);
                if((dirtyFlags & 0xc2L) != 0) {
                    if(viewModelSuperCategoryListSizeInt0) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read viewModel.superCategoryList.getValue().size() > 0 ? View.VISIBLE : View.GONE
                    viewModelSuperCategoryListSizeInt0ViewVISIBLEViewGONE = ((viewModelSuperCategoryListSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x2800L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(position)
                androidxDatabindingViewDataBindingSafeUnboxPosition = androidx.databinding.ViewDataBinding.safeUnbox(position);


                if (superCategoryList != null) {
                    // read superCategoryList.get(androidx.databinding.ViewDataBinding.safeUnbox(position))
                    superCategoryListGetPosition = superCategoryList.get(androidxDatabindingViewDataBindingSafeUnboxPosition);
                }

            if ((dirtyFlags & 0x2000L) != 0) {

                    if (superCategoryListGetPosition != null) {
                        // read superCategoryList.get(androidx.databinding.ViewDataBinding.safeUnbox(position)).id
                        superCategoryListGetPositionId = superCategoryListGetPosition.getId();
                    }
            }
            if ((dirtyFlags & 0x800L) != 0) {

                    if (superCategoryListGetPosition != null) {
                        // read superCategoryList.get(androidx.databinding.ViewDataBinding.safeUnbox(position)).banners
                        superCategoryListGetPositionBanners = superCategoryListGetPosition.getBanners();
                    }
            }
        }
        if ((dirtyFlags & 0x400L) != 0) {

                if (viewModel != null) {
                    // read viewModel.otcBanners
                    viewModelOtcBanners = viewModel.getOtcBanners();
                }
                updateLiveDataRegistration(0, viewModelOtcBanners);


                if (viewModelOtcBanners != null) {
                    // read viewModel.otcBanners.getValue()
                    viewModelOtcBannersGetValue = viewModelOtcBanners.getValue();
                }
        }

        if ((dirtyFlags & 0xddL) != 0) {

                // read superCategoryList.size > 0 ? superCategoryList.get(androidx.databinding.ViewDataBinding.safeUnbox(position)).banners : viewModel.otcBanners.getValue()
                superCategoryListSizeInt0SuperCategoryListGetPositionBannersViewModelOtcBanners = ((superCategoryListSizeInt0) ? (superCategoryListGetPositionBanners) : (viewModelOtcBannersGetValue));
                // read superCategoryList.size > 0 ? superCategoryList.get(androidx.databinding.ViewDataBinding.safeUnbox(position)).id : 1
                superCategoryListSizeInt0SuperCategoryListGetPositionIdInt1 = ((superCategoryListSizeInt0) ? (superCategoryListGetPositionId) : (1));
        }
        // batch finished
        if ((dirtyFlags & 0xa0L) != 0) {
            // api target 1

            this.btnViewAll.setTitle(superCategory);
        }
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            this.mboundView0.setVisibility(viewModelSuperCategoryListSizeInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xddL) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.HomeBindingAdapterKt.setCategories(this.rvCategory, categoryLevel2List, superCategoryListSizeInt0SuperCategoryListGetPositionBannersViewModelOtcBanners, superCategoryListSizeInt0SuperCategoryListGetPositionIdInt1, viewModel);
        }
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.HomeBindingAdapterKt.setSuperCategories(this.rvSuperCategory, superCategoryList, viewModel);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.otcBanners
        flag 1 (0x2L): viewModel.superCategoryList
        flag 2 (0x3L): position
        flag 3 (0x4L): superCategoryList
        flag 4 (0x5L): categoryLevel2List
        flag 5 (0x6L): superCategory
        flag 6 (0x7L): viewModel
        flag 7 (0x8L): null
        flag 8 (0x9L): viewModel.superCategoryList.getValue().size() > 0 ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewModel.superCategoryList.getValue().size() > 0 ? View.VISIBLE : View.GONE
        flag 10 (0xbL): superCategoryList.size > 0 ? superCategoryList.get(androidx.databinding.ViewDataBinding.safeUnbox(position)).banners : viewModel.otcBanners.getValue()
        flag 11 (0xcL): superCategoryList.size > 0 ? superCategoryList.get(androidx.databinding.ViewDataBinding.safeUnbox(position)).banners : viewModel.otcBanners.getValue()
        flag 12 (0xdL): superCategoryList.size > 0 ? superCategoryList.get(androidx.databinding.ViewDataBinding.safeUnbox(position)).id : 1
        flag 13 (0xeL): superCategoryList.size > 0 ? superCategoryList.get(androidx.databinding.ViewDataBinding.safeUnbox(position)).id : 1
    flag mapping end*/
    //end
}