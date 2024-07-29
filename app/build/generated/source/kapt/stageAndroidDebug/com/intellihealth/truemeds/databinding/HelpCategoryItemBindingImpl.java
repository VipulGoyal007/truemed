package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HelpCategoryItemBindingImpl extends HelpCategoryItemBinding implements com.intellihealth.truemeds.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clFilter, 2);
        sViewsWithIds.put(R.id.tvSubCategoryTitle, 3);
        sViewsWithIds.put(R.id.ivNextArrow, 4);
        sViewsWithIds.put(R.id.tmDivider1, 5);
        sViewsWithIds.put(R.id.helpCategoryCard, 6);
        sViewsWithIds.put(R.id.dividerHelpCategoryCard, 7);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HelpCategoryItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private HelpCategoryItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.view.View) bindings[7]
            , (com.intellihealth.salt.views.HelpCategories) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (com.intellihealth.salt.views.cards.Divider) bindings[5]
            , (com.intellihealth.salt.views.TextView) bindings[3]
            );
        this.clFilterHelpCategoryCard.setTag(null);
        this.constraitMain.setTag(null);
        setRootTag(root);
        // listeners
        mCallback13 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 1);
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
        if (BR.itemPosition == variableId) {
            setItemPosition((java.lang.Integer) variable);
        }
        else if (BR.category == variableId) {
            setCategory((com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.HelpViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemPosition(@Nullable java.lang.Integer ItemPosition) {
        this.mItemPosition = ItemPosition;
    }
    public void setCategory(@Nullable com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList Category) {
        this.mCategory = Category;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.category);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.HelpViewModel ViewModel) {
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
        com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList category = mCategory;
        com.intellihealth.truemeds.presentation.viewmodel.HelpViewModel viewModel = mViewModel;
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.clFilterHelpCategoryCard.setOnClickListener(mCallback13);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // category
        com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList category = mCategory;
        // viewModel
        com.intellihealth.truemeds.presentation.viewmodel.HelpViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {



            viewModel.helpSubCategoryListItemClick(category);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemPosition
        flag 1 (0x2L): category
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}