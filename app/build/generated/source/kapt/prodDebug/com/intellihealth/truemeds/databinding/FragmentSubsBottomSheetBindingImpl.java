package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSubsBottomSheetBindingImpl extends FragmentSubsBottomSheetBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.headerLayout, 3);
        sViewsWithIds.put(R.id.ivClose, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSubsBottomSheetBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentSubsBottomSheetBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.intellihealth.salt.views.cards.FullWidthProductCard) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (com.intellihealth.salt.views.TextView) bindings[1]
            );
        this.full.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvTitle.setTag(null);
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
        if (BR.title == variableId) {
            setTitle((java.lang.String) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTitle(@Nullable java.lang.String Title) {
        this.mTitle = Title;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.title);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel ViewModel) {
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
                return onChangeViewModelCompareNChooseSubs((androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.ProductInfoModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelCompareNChooseSubs(androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.ProductInfoModel> ViewModelCompareNChooseSubs, int fieldId) {
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
        java.lang.String title = mTitle;
        com.intellihealth.salt.models.ProductInfoModel viewModelCompareNChooseSubsGetValue = null;
        com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel viewModel = mViewModel;
        java.lang.String javaLangStringRecommendedSubstituteForTitle = null;
        androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.ProductInfoModel> viewModelCompareNChooseSubs = null;

        if ((dirtyFlags & 0xaL) != 0) {



                // read ("Recommended Substitute for ") + (title)
                javaLangStringRecommendedSubstituteForTitle = ("Recommended Substitute for ") + (title);
        }
        if ((dirtyFlags & 0xdL) != 0) {



                if (viewModel != null) {
                    // read viewModel.compareNChooseSubs
                    viewModelCompareNChooseSubs = viewModel.getCompareNChooseSubs();
                }
                updateLiveDataRegistration(0, viewModelCompareNChooseSubs);


                if (viewModelCompareNChooseSubs != null) {
                    // read viewModel.compareNChooseSubs.getValue()
                    viewModelCompareNChooseSubsGetValue = viewModelCompareNChooseSubs.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.full.setCrossSellingData(viewModelCompareNChooseSubsGetValue);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, javaLangStringRecommendedSubstituteForTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.compareNChooseSubs
        flag 1 (0x2L): title
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}