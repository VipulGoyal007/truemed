package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class UploadPrescriptionBottomsheetBindingImpl extends UploadPrescriptionBottomsheetBinding implements com.intellihealth.truemeds.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clHeader, 7);
        sViewsWithIds.put(R.id.imageClose, 8);
        sViewsWithIds.put(R.id.tvHeader, 9);
        sViewsWithIds.put(R.id.mainCardCtl, 10);
        sViewsWithIds.put(R.id.uploadPrescriptionCard, 11);
        sViewsWithIds.put(R.id.cameraMl, 12);
        sViewsWithIds.put(R.id.cameraCtl, 13);
        sViewsWithIds.put(R.id.imgCamera, 14);
        sViewsWithIds.put(R.id.tmCameraTV, 15);
        sViewsWithIds.put(R.id.galaryMl, 16);
        sViewsWithIds.put(R.id.galaryCtl, 17);
        sViewsWithIds.put(R.id.imgGalary, 18);
        sViewsWithIds.put(R.id.tmGalaryTv, 19);
        sViewsWithIds.put(R.id.pastPrescriptionCtl, 20);
        sViewsWithIds.put(R.id.imgPastPrescription, 21);
        sViewsWithIds.put(R.id.tmPastPrescriptionTv, 22);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback41;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public UploadPrescriptionBottomsheetBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private UploadPrescriptionBottomsheetBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (com.intellihealth.salt.views.buttons.Button) bindings[4]
            , (com.intellihealth.salt.views.buttons.ButtonLite) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (com.google.android.material.card.MaterialCardView) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[17]
            , (com.google.android.material.card.MaterialCardView) bindings[16]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[14]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[18]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[21]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[20]
            , (com.google.android.material.card.MaterialCardView) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (com.intellihealth.salt.views.TextView) bindings[15]
            , (com.intellihealth.salt.views.TextView) bindings[19]
            , (com.intellihealth.salt.views.TextView) bindings[22]
            , (com.intellihealth.salt.views.TextView) bindings[9]
            , (com.intellihealth.salt.views.TextView) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            );
        this.btnLessMore.setTag(null);
        this.btnNoPrescription.setTag(null);
        this.clProgress.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.pastPrescriptionMl.setTag(null);
        this.rvPrescription.setTag(null);
        this.tvPrescriptionDetail.setTag(null);
        setRootTag(root);
        // listeners
        mCallback41 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
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
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsLoading((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelMedicineList((androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>>) object, fieldId);
            case 2 :
                return onChangeViewModelShowMedicineList((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelShowDoNotHavePrescription((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewModelIsExpandable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeViewModelMedicineOgList((androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>>) object, fieldId);
            case 6 :
                return onChangeViewModelShowPastPrescriptionView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsLoading(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelIsLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMedicineList(androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> ViewModelMedicineList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowMedicineList(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowMedicineList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowDoNotHavePrescription(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowDoNotHavePrescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsExpandable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsExpandable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMedicineOgList(androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> ViewModelMedicineOgList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowPastPrescriptionView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowPastPrescriptionView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelIsLoading = null;
        java.util.List<java.lang.String> viewModelMedicineListGetValue = null;
        java.lang.String viewModelMedicineOgListSizeJavaLangStringItems = null;
        java.lang.Boolean viewModelShowMedicineListGetValue = null;
        java.lang.String viewModelMedicineOgListSizeInt1ViewModelMedicineOgListSizeJavaLangStringItemsJavaLangStringItem = null;
        java.lang.String viewModelMedicineOgListSizeInt1ViewModelMedicineOgListSizeJavaLangStringItemsJavaLangStringItemJavaLangStringInYourCartRequirePrescription = null;
        java.lang.Boolean viewModelShowPastPrescriptionViewGetValue = null;
        java.util.List<java.lang.String> viewModelMedicineOgListGetValue = null;
        int viewModelShowPastPrescriptionViewViewVISIBLEViewINVISIBLE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowDoNotHavePrescriptionGetValue = false;
        androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> viewModelMedicineList = null;
        int viewModelShowDoNotHavePrescriptionViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsExpandableGetValue = false;
        int viewModelMedicineOgListSizeInt0ViewModelShowDoNotHavePrescriptionViewVISIBLEViewGONEViewGONE = 0;
        java.lang.Boolean viewModelIsExpandableGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowPastPrescriptionViewGetValue = false;
        boolean viewModelMedicineOgListSizeInt1 = false;
        int viewModelMedicineOgListSize = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowMedicineList = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowDoNotHavePrescription = null;
        int viewModelShowMedicineListViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsExpandable = null;
        java.lang.Boolean viewModelShowDoNotHavePrescriptionGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowMedicineListGetValue = false;
        boolean viewModelMedicineOgListSizeInt0 = false;
        java.lang.Boolean viewModelIsLoadingGetValue = null;
        int viewModelIsLoadingViewVISIBLEViewGONE = 0;
        com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel viewModel = mViewModel;
        androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> viewModelMedicineOgList = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowPastPrescriptionView = null;

        if ((dirtyFlags & 0x1ffL) != 0) {


            if ((dirtyFlags & 0x181L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoading()
                        viewModelIsLoading = viewModel.isLoading();
                    }
                    updateLiveDataRegistration(0, viewModelIsLoading);


                    if (viewModelIsLoading != null) {
                        // read viewModel.isLoading().getValue()
                        viewModelIsLoadingGetValue = viewModelIsLoading.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading().getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsLoadingGetValue);
                if((dirtyFlags & 0x181L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue) {
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading().getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsLoadingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x182L) != 0) {

                    if (viewModel != null) {
                        // read viewModel._medicineList
                        viewModelMedicineList = viewModel.get_medicineList();
                    }
                    updateLiveDataRegistration(1, viewModelMedicineList);


                    if (viewModelMedicineList != null) {
                        // read viewModel._medicineList.getValue()
                        viewModelMedicineListGetValue = viewModelMedicineList.getValue();
                    }
            }
            if ((dirtyFlags & 0x184L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showMedicineList
                        viewModelShowMedicineList = viewModel.getShowMedicineList();
                    }
                    updateLiveDataRegistration(2, viewModelShowMedicineList);


                    if (viewModelShowMedicineList != null) {
                        // read viewModel.showMedicineList.getValue()
                        viewModelShowMedicineListGetValue = viewModelShowMedicineList.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showMedicineList.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowMedicineListGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowMedicineListGetValue);
                if((dirtyFlags & 0x184L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowMedicineListGetValue) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showMedicineList.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowMedicineListViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowMedicineListGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x188L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showDoNotHavePrescription
                        viewModelShowDoNotHavePrescription = viewModel.getShowDoNotHavePrescription();
                    }
                    updateLiveDataRegistration(3, viewModelShowDoNotHavePrescription);


                    if (viewModelShowDoNotHavePrescription != null) {
                        // read viewModel.showDoNotHavePrescription.getValue()
                        viewModelShowDoNotHavePrescriptionGetValue = viewModelShowDoNotHavePrescription.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showDoNotHavePrescription.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowDoNotHavePrescriptionGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowDoNotHavePrescriptionGetValue);
                if((dirtyFlags & 0x10188L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowDoNotHavePrescriptionGetValue) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showDoNotHavePrescription.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowDoNotHavePrescriptionViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowDoNotHavePrescriptionGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1b0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isExpandable
                        viewModelIsExpandable = viewModel.isExpandable();
                    }
                    updateLiveDataRegistration(4, viewModelIsExpandable);


                    if (viewModelIsExpandable != null) {
                        // read viewModel.isExpandable.getValue()
                        viewModelIsExpandableGetValue = viewModelIsExpandable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isExpandable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsExpandableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsExpandableGetValue);
            }
            if ((dirtyFlags & 0x1b8L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.medicineOgList
                        viewModelMedicineOgList = viewModel.getMedicineOgList();
                    }
                    updateLiveDataRegistration(5, viewModelMedicineOgList);


                    if (viewModelMedicineOgList != null) {
                        // read viewModel.medicineOgList.getValue()
                        viewModelMedicineOgListGetValue = viewModelMedicineOgList.getValue();
                    }


                    if (viewModelMedicineOgListGetValue != null) {
                        // read viewModel.medicineOgList.getValue().size()
                        viewModelMedicineOgListSize = viewModelMedicineOgListGetValue.size();
                    }

                if ((dirtyFlags & 0x1b0L) != 0) {
                }
                if ((dirtyFlags & 0x1a0L) != 0) {

                        // read viewModel.medicineOgList.getValue().size() > 1
                        viewModelMedicineOgListSizeInt1 = (viewModelMedicineOgListSize) > (1);
                    if((dirtyFlags & 0x1a0L) != 0) {
                        if(viewModelMedicineOgListSizeInt1) {
                                dirtyFlags |= 0x400L;
                        }
                        else {
                                dirtyFlags |= 0x200L;
                        }
                    }
                }
                if ((dirtyFlags & 0x1a8L) != 0) {

                        // read viewModel.medicineOgList.getValue().size() > 0
                        viewModelMedicineOgListSizeInt0 = (viewModelMedicineOgListSize) > (0);
                    if((dirtyFlags & 0x1a8L) != 0) {
                        if(viewModelMedicineOgListSizeInt0) {
                                dirtyFlags |= 0x10000L;
                        }
                        else {
                                dirtyFlags |= 0x8000L;
                        }
                    }
                }
            }
            if ((dirtyFlags & 0x1c0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showPastPrescriptionView
                        viewModelShowPastPrescriptionView = viewModel.getShowPastPrescriptionView();
                    }
                    updateLiveDataRegistration(6, viewModelShowPastPrescriptionView);


                    if (viewModelShowPastPrescriptionView != null) {
                        // read viewModel.showPastPrescriptionView.getValue()
                        viewModelShowPastPrescriptionViewGetValue = viewModelShowPastPrescriptionView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPastPrescriptionView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowPastPrescriptionViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowPastPrescriptionViewGetValue);
                if((dirtyFlags & 0x1c0L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowPastPrescriptionViewGetValue) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPastPrescriptionView.getValue()) ? View.VISIBLE : View.INVISIBLE
                    viewModelShowPastPrescriptionViewViewVISIBLEViewINVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowPastPrescriptionViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x400L) != 0) {

                // read (viewModel.medicineOgList.getValue().size()) + (" items")
                viewModelMedicineOgListSizeJavaLangStringItems = (viewModelMedicineOgListSize) + (" items");
        }
        if ((dirtyFlags & 0x10000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.showDoNotHavePrescription
                    viewModelShowDoNotHavePrescription = viewModel.getShowDoNotHavePrescription();
                }
                updateLiveDataRegistration(3, viewModelShowDoNotHavePrescription);


                if (viewModelShowDoNotHavePrescription != null) {
                    // read viewModel.showDoNotHavePrescription.getValue()
                    viewModelShowDoNotHavePrescriptionGetValue = viewModelShowDoNotHavePrescription.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showDoNotHavePrescription.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelShowDoNotHavePrescriptionGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowDoNotHavePrescriptionGetValue);
            if((dirtyFlags & 0x10188L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowDoNotHavePrescriptionGetValue) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showDoNotHavePrescription.getValue()) ? View.VISIBLE : View.GONE
                viewModelShowDoNotHavePrescriptionViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowDoNotHavePrescriptionGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }

        if ((dirtyFlags & 0x1a0L) != 0) {

                // read viewModel.medicineOgList.getValue().size() > 1 ? (viewModel.medicineOgList.getValue().size()) + (" items") : " Item"
                viewModelMedicineOgListSizeInt1ViewModelMedicineOgListSizeJavaLangStringItemsJavaLangStringItem = ((viewModelMedicineOgListSizeInt1) ? (viewModelMedicineOgListSizeJavaLangStringItems) : (" Item"));


                // read (viewModel.medicineOgList.getValue().size() > 1 ? (viewModel.medicineOgList.getValue().size()) + (" items") : " Item") + (" in your cart require prescription")
                viewModelMedicineOgListSizeInt1ViewModelMedicineOgListSizeJavaLangStringItemsJavaLangStringItemJavaLangStringInYourCartRequirePrescription = (viewModelMedicineOgListSizeInt1ViewModelMedicineOgListSizeJavaLangStringItemsJavaLangStringItem) + (" in your cart require prescription");
        }
        if ((dirtyFlags & 0x1a8L) != 0) {

                // read viewModel.medicineOgList.getValue().size() > 0 ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showDoNotHavePrescription.getValue()) ? View.VISIBLE : View.GONE : View.GONE
                viewModelMedicineOgListSizeInt0ViewModelShowDoNotHavePrescriptionViewVISIBLEViewGONEViewGONE = ((viewModelMedicineOgListSizeInt0) ? (viewModelShowDoNotHavePrescriptionViewVISIBLEViewGONE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.btnLessMore.setOnClickListener(mCallback41);
        }
        if ((dirtyFlags & 0x1b0L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.PastPrescriptionItemBindingKt.setPrescriptionList(this.btnLessMore, androidxDatabindingViewDataBindingSafeUnboxViewModelIsExpandableGetValue, viewModelMedicineOgListSize);
        }
        if ((dirtyFlags & 0x188L) != 0) {
            // api target 1

            this.btnNoPrescription.setVisibility(viewModelShowDoNotHavePrescriptionViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x181L) != 0) {
            // api target 1

            this.clProgress.setVisibility(viewModelIsLoadingViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1c0L) != 0) {
            // api target 1

            this.pastPrescriptionMl.setVisibility(viewModelShowPastPrescriptionViewViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0x184L) != 0) {
            // api target 1

            this.rvPrescription.setVisibility(viewModelShowMedicineListViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x182L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.PastPrescriptionItemBindingKt.setMedicineList(this.rvPrescription, viewModelMedicineListGetValue, viewModel);
        }
        if ((dirtyFlags & 0x1a0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPrescriptionDetail, viewModelMedicineOgListSizeInt1ViewModelMedicineOgListSizeJavaLangStringItemsJavaLangStringItemJavaLangStringInYourCartRequirePrescription);
        }
        if ((dirtyFlags & 0x1a8L) != 0) {
            // api target 1

            this.tvPrescriptionDetail.setVisibility(viewModelMedicineOgListSizeInt0ViewModelShowDoNotHavePrescriptionViewVISIBLEViewGONEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel.isExpandable() != null
        boolean viewModelIsExpandableJavaLangObjectNull = false;
        // !viewModel.isExpandable().getValue()
        java.lang.Boolean viewModelIsExpandable = null;
        // viewModel.isExpandable().getValue()
        java.lang.Boolean viewModelIsExpandableGetValue = null;
        // viewModel
        com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel viewModel = mViewModel;
        // viewModel.isExpandable()
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsExpandable1 = null;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {




            ViewModelIsExpandable1 = viewModel.isExpandable();

            viewModelIsExpandableJavaLangObjectNull = (ViewModelIsExpandable1) != (null);
            if (viewModelIsExpandableJavaLangObjectNull) {


                viewModelIsExpandableGetValue = ViewModelIsExpandable1.getValue();

                viewModelIsExpandable = !viewModelIsExpandableGetValue;

                viewModel.setUpUi(viewModelIsExpandable);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isLoading()
        flag 1 (0x2L): viewModel._medicineList
        flag 2 (0x3L): viewModel.showMedicineList
        flag 3 (0x4L): viewModel.showDoNotHavePrescription
        flag 4 (0x5L): viewModel.isExpandable
        flag 5 (0x6L): viewModel.medicineOgList
        flag 6 (0x7L): viewModel.showPastPrescriptionView
        flag 7 (0x8L): viewModel
        flag 8 (0x9L): null
        flag 9 (0xaL): viewModel.medicineOgList.getValue().size() > 1 ? (viewModel.medicineOgList.getValue().size()) + (" items") : " Item"
        flag 10 (0xbL): viewModel.medicineOgList.getValue().size() > 1 ? (viewModel.medicineOgList.getValue().size()) + (" items") : " Item"
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPastPrescriptionView.getValue()) ? View.VISIBLE : View.INVISIBLE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPastPrescriptionView.getValue()) ? View.VISIBLE : View.INVISIBLE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showDoNotHavePrescription.getValue()) ? View.VISIBLE : View.GONE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showDoNotHavePrescription.getValue()) ? View.VISIBLE : View.GONE
        flag 15 (0x10L): viewModel.medicineOgList.getValue().size() > 0 ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showDoNotHavePrescription.getValue()) ? View.VISIBLE : View.GONE : View.GONE
        flag 16 (0x11L): viewModel.medicineOgList.getValue().size() > 0 ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showDoNotHavePrescription.getValue()) ? View.VISIBLE : View.GONE : View.GONE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showMedicineList.getValue()) ? View.VISIBLE : View.GONE
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showMedicineList.getValue()) ? View.VISIBLE : View.GONE
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading().getValue()) ? View.VISIBLE : View.GONE
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading().getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}