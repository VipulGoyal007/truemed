package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BottomsheetDoctorCallMissedBindingImpl extends BottomsheetDoctorCallMissedBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clHeader, 3);
        sViewsWithIds.put(R.id.ivClose, 4);
        sViewsWithIds.put(R.id.tvMessage, 5);
        sViewsWithIds.put(R.id.clTimer, 6);
        sViewsWithIds.put(R.id.ivClockTimer, 7);
        sViewsWithIds.put(R.id.tvTimer, 8);
        sViewsWithIds.put(R.id.tmDivider, 9);
        sViewsWithIds.put(R.id.btnCallMe, 10);
        sViewsWithIds.put(R.id.progressBar, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.intellihealth.salt.views.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BottomsheetDoctorCallMissedBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private BottomsheetDoctorCallMissedBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.intellihealth.salt.views.buttons.Button) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (android.widget.ProgressBar) bindings[11]
            , (com.intellihealth.salt.views.cards.Divider) bindings[9]
            , (com.intellihealth.salt.views.TextView) bindings[5]
            , (com.intellihealth.salt.views.TextView) bindings[1]
            , (android.widget.TextView) bindings[8]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (com.intellihealth.salt.views.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.tvOrderID.setTag(null);
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
        if (BR.model == variableId) {
            setModel((com.intellihealth.truemeds.data.model.home.DeliveryDelayModel) variable);
        }
        else if (BR.view == variableId) {
            setView((android.view.View) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.intellihealth.truemeds.data.model.home.DeliveryDelayModel Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }
    public void setView(@Nullable android.view.View View) {
        this.mView = View;
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel ViewModel) {
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
        com.intellihealth.truemeds.data.model.home.DeliveryDelayModel model = mModel;
        java.lang.String modelTitle = null;
        java.lang.String viewModelBottomSheetDoctorCallOrderId = null;
        com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel viewModel = mViewModel;
        java.lang.String javaLangStringOrderIDViewModelBottomSheetDoctorCallOrderId = null;

        if ((dirtyFlags & 0x9L) != 0) {



                if (model != null) {
                    // read model.title
                    modelTitle = model.getTitle();
                }
        }
        if ((dirtyFlags & 0xcL) != 0) {



                if (viewModel != null) {
                    // read viewModel.bottomSheetDoctorCallOrderId
                    viewModelBottomSheetDoctorCallOrderId = viewModel.getBottomSheetDoctorCallOrderId();
                }


                // read ("Order ID :") + (viewModel.bottomSheetDoctorCallOrderId)
                javaLangStringOrderIDViewModelBottomSheetDoctorCallOrderId = ("Order ID :") + (viewModelBottomSheetDoctorCallOrderId);
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, modelTitle);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvOrderID, javaLangStringOrderIDViewModelBottomSheetDoctorCallOrderId);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): view
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}