package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySubstitutesBindingImpl extends ActivitySubstitutesBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.msHeader, 1);
        sViewsWithIds.put(R.id.ivHeaderImage, 2);
        sViewsWithIds.put(R.id.tvSubstituteSafe, 3);
        sViewsWithIds.put(R.id.tvDescription, 4);
        sViewsWithIds.put(R.id.rvSubsList, 5);
        sViewsWithIds.put(R.id.divider, 6);
        sViewsWithIds.put(R.id.tvMedTitle, 7);
        sViewsWithIds.put(R.id.rvMedList, 8);
        sViewsWithIds.put(R.id.medDivider, 9);
        sViewsWithIds.put(R.id.tvSaveMore, 10);
        sViewsWithIds.put(R.id.tvPlaceorder, 11);
        sViewsWithIds.put(R.id.clMoneyLayout, 12);
        sViewsWithIds.put(R.id.tvPlace, 13);
        sViewsWithIds.put(R.id.appCompatImageView2, 14);
        sViewsWithIds.put(R.id.ivBottomLine, 15);
        sViewsWithIds.put(R.id.startOrderingNow, 16);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySubstitutesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ActivitySubstitutesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (com.intellihealth.salt.views.cards.Divider) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[15]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (com.intellihealth.salt.views.cards.Divider) bindings[9]
            , (com.intellihealth.salt.views.MobileSectionHeaders) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (com.intellihealth.salt.views.buttons.ButtonLite) bindings[16]
            , (com.intellihealth.salt.views.TextView) bindings[4]
            , (com.intellihealth.salt.views.TextView) bindings[7]
            , (com.intellihealth.salt.views.TextView) bindings[13]
            , (com.intellihealth.salt.views.TextView) bindings[11]
            , (com.intellihealth.salt.views.TextView) bindings[10]
            , (com.intellihealth.salt.views.TextView) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}