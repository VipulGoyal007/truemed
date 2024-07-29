package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ShimmerAccountScreenBindingImpl extends ShimmerAccountScreenBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cl1, 1);
        sViewsWithIds.put(R.id.ivGreyBox, 2);
        sViewsWithIds.put(R.id.ivTube1, 3);
        sViewsWithIds.put(R.id.ivTube2, 4);
        sViewsWithIds.put(R.id.cl2, 5);
        sViewsWithIds.put(R.id.ivGreyBox2, 6);
        sViewsWithIds.put(R.id.ivTube3, 7);
        sViewsWithIds.put(R.id.ivTube4, 8);
        sViewsWithIds.put(R.id.cl3, 9);
        sViewsWithIds.put(R.id.ivGreyBox3, 10);
        sViewsWithIds.put(R.id.ivTube5, 11);
        sViewsWithIds.put(R.id.ivTube6, 12);
        sViewsWithIds.put(R.id.cl4, 13);
        sViewsWithIds.put(R.id.ivGreyBox4, 14);
        sViewsWithIds.put(R.id.ivTube7, 15);
        sViewsWithIds.put(R.id.ivTube8, 16);
        sViewsWithIds.put(R.id.cl5, 17);
        sViewsWithIds.put(R.id.ivGreyBox5, 18);
        sViewsWithIds.put(R.id.ivTube9, 19);
        sViewsWithIds.put(R.id.ivTube10, 20);
        sViewsWithIds.put(R.id.cl6, 21);
        sViewsWithIds.put(R.id.ivGreyBox6, 22);
        sViewsWithIds.put(R.id.ivTube11, 23);
        sViewsWithIds.put(R.id.ivTube12, 24);
        sViewsWithIds.put(R.id.cl7, 25);
        sViewsWithIds.put(R.id.ivGreyBox7, 26);
        sViewsWithIds.put(R.id.ivTube13, 27);
        sViewsWithIds.put(R.id.ivTube14, 28);
        sViewsWithIds.put(R.id.cl8, 29);
        sViewsWithIds.put(R.id.ivGreyBox8, 30);
        sViewsWithIds.put(R.id.ivTube15, 31);
        sViewsWithIds.put(R.id.ivTube16, 32);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ShimmerAccountScreenBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 33, sIncludes, sViewsWithIds));
    }
    private ShimmerAccountScreenBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[21]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[25]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[29]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[10]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[14]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[18]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[22]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[26]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[30]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[20]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[23]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[24]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[27]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[28]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[31]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[32]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[11]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[12]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[15]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[16]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[19]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
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