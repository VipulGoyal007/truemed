package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BottomsheetMyorderBindingImpl extends BottomsheetMyorderBinding implements com.intellihealth.truemeds.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.helpTopHeader, 5);
        sViewsWithIds.put(R.id.tvSubCategoryTitle, 6);
        sViewsWithIds.put(R.id.ivClose, 7);
        sViewsWithIds.put(R.id.entireListingView, 8);
        sViewsWithIds.put(R.id.clSelectType, 9);
        sViewsWithIds.put(R.id.tvOrderStatus, 10);
        sViewsWithIds.put(R.id.tvPatients, 11);
        sViewsWithIds.put(R.id.divider, 12);
        sViewsWithIds.put(R.id.clShowList, 13);
        sViewsWithIds.put(R.id.clButtonView, 14);
        sViewsWithIds.put(R.id.clClear, 15);
        sViewsWithIds.put(R.id.clApply, 16);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BottomsheetMyorderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private BottomsheetMyorderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.intellihealth.salt.views.buttons.Button) bindings[4]
            , (com.intellihealth.salt.views.buttons.Button) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (com.intellihealth.salt.views.cards.Divider) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (com.intellihealth.salt.views.TextView) bindings[10]
            , (com.intellihealth.salt.views.TextView) bindings[11]
            , (com.intellihealth.salt.views.TextView) bindings[6]
            );
        this.btnApply.setTag(null);
        this.btnClear.setTag(null);
        this.parentLayout.setTag(null);
        this.rvOrderList.setTag(null);
        this.rvPatientList.setTag(null);
        setRootTag(root);
        // listeners
        mCallback19 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 2);
        mCallback18 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 1);
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
        if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel ViewModel) {
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
                return onChangeViewModelPatientsBottomSheetListTemp((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient>>) object, fieldId);
            case 1 :
                return onChangeViewModelOrdersBottomSheetListTemp((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderTypeResponse.OrderType>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelPatientsBottomSheetListTemp(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient>> ViewModelPatientsBottomSheetListTemp, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelOrdersBottomSheetListTemp(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderTypeResponse.OrderType>> ViewModelOrdersBottomSheetListTemp, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient>> viewModelPatientsBottomSheetListTemp = null;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderTypeResponse.OrderType>> viewModelOrdersBottomSheetListTemp = null;
        java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderTypeResponse.OrderType> viewModelOrdersBottomSheetListTempGetValue = null;
        java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient> viewModelPatientsBottomSheetListTempGetValue = null;
        com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.patientsBottomSheetListTemp
                        viewModelPatientsBottomSheetListTemp = viewModel.getPatientsBottomSheetListTemp();
                    }
                    updateLiveDataRegistration(0, viewModelPatientsBottomSheetListTemp);


                    if (viewModelPatientsBottomSheetListTemp != null) {
                        // read viewModel.patientsBottomSheetListTemp.getValue()
                        viewModelPatientsBottomSheetListTempGetValue = viewModelPatientsBottomSheetListTemp.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ordersBottomSheetListTemp
                        viewModelOrdersBottomSheetListTemp = viewModel.getOrdersBottomSheetListTemp();
                    }
                    updateLiveDataRegistration(1, viewModelOrdersBottomSheetListTemp);


                    if (viewModelOrdersBottomSheetListTemp != null) {
                        // read viewModel.ordersBottomSheetListTemp.getValue()
                        viewModelOrdersBottomSheetListTempGetValue = viewModelOrdersBottomSheetListTemp.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.btnApply.setOnClickListener(mCallback19);
            this.btnClear.setOnClickListener(mCallback18);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.OrderTypeListBindingAdapterKt.setOrderTypeList(this.rvOrderList, viewModelOrdersBottomSheetListTempGetValue, viewModel);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.PatientTypeListBindingAdapterKt.setPatientTypeList(this.rvPatientList, viewModelPatientsBottomSheetListTempGetValue, viewModel);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel viewModel = mViewModel;
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
                com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.bottomSheetClearClick();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.patientsBottomSheetListTemp
        flag 1 (0x2L): viewModel.ordersBottomSheetListTemp
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}