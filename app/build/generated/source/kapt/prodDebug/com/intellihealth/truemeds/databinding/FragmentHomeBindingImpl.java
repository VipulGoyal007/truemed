package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clHeader, 5);
        sViewsWithIds.put(R.id.tmCartHeaderChip, 6);
        sViewsWithIds.put(R.id.tmWalletHeaderChip, 7);
        sViewsWithIds.put(R.id.tmSearchBar, 8);
        sViewsWithIds.put(R.id.clShimmer, 9);
        sViewsWithIds.put(R.id.clProgressBar, 10);
        sViewsWithIds.put(R.id.progressBar, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.motion.widget.MotionLayout mboundView0;
    @Nullable
    private final com.intellihealth.truemeds.databinding.ShimmerHomePageBinding mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (android.widget.ProgressBar) bindings[11]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[3]
            , (com.intellihealth.salt.views.chip.HeaderChip) bindings[6]
            , (com.intellihealth.salt.views.SearchBar) bindings[8]
            , (com.intellihealth.salt.views.chip.HeaderChip) bindings[7]
            , (com.intellihealth.salt.views.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.motion.widget.MotionLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (bindings[4] != null) ? com.intellihealth.truemeds.databinding.ShimmerHomePageBinding.bind((android.view.View) bindings[4]) : null;
        this.rvHomePage.setTag(null);
        this.shimmerViewContainer.setTag(null);
        this.tvSelectedCity.setTag(null);
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
        if (BR.city == variableId) {
            setCity((java.lang.String) variable);
        }
        else if (BR.viewmodel == variableId) {
            setViewmodel((com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCity(@Nullable java.lang.String City) {
        this.mCity = City;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.city);
        super.requestRebind();
    }
    public void setViewmodel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
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
        java.lang.String city = mCity;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.rvHomePage.setItemAnimator((androidx.recyclerview.widget.RecyclerView.ItemAnimator) null);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSelectedCity, city);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): city
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}