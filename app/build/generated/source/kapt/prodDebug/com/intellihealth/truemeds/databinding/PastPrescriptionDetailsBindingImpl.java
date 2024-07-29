package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PastPrescriptionDetailsBindingImpl extends PastPrescriptionDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.uploadPreascriptionDetailCard, 2);
        sViewsWithIds.put(R.id.uploadPrescriptionImgCard, 3);
        sViewsWithIds.put(R.id.customCheckBox, 4);
        sViewsWithIds.put(R.id.uploadedTxt, 5);
        sViewsWithIds.put(R.id.uploadedImageIdTxt, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PastPrescriptionDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private PastPrescriptionDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.intellihealth.salt.views.CheckFieldLayout) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.cardview.widget.CardView) bindings[3]
            , (com.intellihealth.salt.views.TextView) bindings[6]
            , (com.intellihealth.salt.views.TextView) bindings[5]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.uploadPrescriptionImg.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.model == variableId) {
            setModel((com.intellihealth.truemeds.data.model.prescription.ActiveRx) variable);
        }
        else if (BR.childIndex == variableId) {
            setChildIndex((java.lang.Integer) variable);
        }
        else if (BR.index == variableId) {
            setIndex((java.lang.Integer) variable);
        }
        else if (BR.viewmodel == variableId) {
            setViewmodel((com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.intellihealth.truemeds.data.model.prescription.ActiveRx Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }
    public void setChildIndex(@Nullable java.lang.Integer ChildIndex) {
        this.mChildIndex = ChildIndex;
    }
    public void setIndex(@Nullable java.lang.Integer Index) {
        this.mIndex = Index;
    }
    public void setViewmodel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel Viewmodel) {
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
        com.intellihealth.truemeds.data.model.prescription.ActiveRx model = mModel;
        java.lang.String modelImageUrl = null;

        if ((dirtyFlags & 0x11L) != 0) {



                if (model != null) {
                    // read model.imageUrl
                    modelImageUrl = model.getImageUrl();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.PastPrescriptionItemBindingKt.loadImage(this.uploadPrescriptionImg, modelImageUrl);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): childIndex
        flag 2 (0x3L): index
        flag 3 (0x4L): viewmodel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}