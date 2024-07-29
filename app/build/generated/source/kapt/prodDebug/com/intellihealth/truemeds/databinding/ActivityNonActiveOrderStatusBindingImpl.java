package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityNonActiveOrderStatusBindingImpl extends ActivityNonActiveOrderStatusBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(25);
        sIncludes.setIncludes(10, 
            new String[] {"shimmer_order_summary"},
            new int[] {11},
            new int[] {com.intellihealth.truemeds.R.layout.shimmer_order_summary});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.sectionHeader, 12);
        sViewsWithIds.put(R.id.nestedScrollView, 13);
        sViewsWithIds.put(R.id.mainLayout, 14);
        sViewsWithIds.put(R.id.clPatientDetails, 15);
        sViewsWithIds.put(R.id.tvPatientNameLabel, 16);
        sViewsWithIds.put(R.id.tvOrderPlacedLabel, 17);
        sViewsWithIds.put(R.id.savingCards, 18);
        sViewsWithIds.put(R.id.clBillDetails, 19);
        sViewsWithIds.put(R.id.billDetails, 20);
        sViewsWithIds.put(R.id.addressDetailCard, 21);
        sViewsWithIds.put(R.id.numberDetailCard, 22);
        sViewsWithIds.put(R.id.tmDeliveryHistoryAccordion, 23);
        sViewsWithIds.put(R.id.btnReorder, 24);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    @Nullable
    private final com.intellihealth.truemeds.databinding.ShimmerOrderSummaryBinding mboundView10;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView8;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityNonActiveOrderStatusBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 25, sIncludes, sViewsWithIds));
    }
    private ActivityNonActiveOrderStatusBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 8
            , (com.intellihealth.salt.views.cards.orderDetailCard.OrderPersonalDetailsCard) bindings[21]
            , (com.intellihealth.salt.views.cards.BillDetails) bindings[20]
            , (com.intellihealth.salt.views.buttons.Button) bindings[24]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[19]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (com.intellihealth.salt.views.cards.DoctorCallCard) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (androidx.core.widget.NestedScrollView) bindings[13]
            , (com.intellihealth.salt.views.cards.orderDetailCard.OrderPersonalDetailsCard) bindings[22]
            , (com.intellihealth.salt.views.cards.orderDetailCard.OrderedItemCard) bindings[5]
            , (com.intellihealth.salt.views.cards.SavingCard) bindings[18]
            , (com.intellihealth.salt.views.MobileSectionHeaders) bindings[12]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[10]
            , (com.intellihealth.salt.views.StickyNonStickyNotification) bindings[2]
            , (com.intellihealth.salt.views.DeliveryHistoryAccordion) bindings[23]
            , (com.intellihealth.salt.views.TextView) bindings[4]
            , (com.intellihealth.salt.views.TextView) bindings[17]
            , (com.intellihealth.salt.views.TextView) bindings[3]
            , (com.intellihealth.salt.views.TextView) bindings[16]
            , (com.intellihealth.salt.views.TextView) bindings[7]
            );
        this.clUploadPrescription.setTag(null);
        this.doctorCallCard.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (com.intellihealth.truemeds.databinding.ShimmerOrderSummaryBinding) bindings[11];
        setContainedBinding(this.mboundView10);
        this.mboundView8 = (androidx.recyclerview.widget.RecyclerView) bindings[8];
        this.mboundView8.setTag(null);
        this.orderedItemCard.setTag(null);
        this.shimmerViewContainer.setTag(null);
        this.stickyOrderStatus.setTag(null);
        this.tvOrderPlaceDate.setTag(null);
        this.tvPatientName.setTag(null);
        this.tvUploadPrescriptionLabel.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x400L;
        }
        mboundView10.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView10.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.callback == variableId) {
            setCallback((com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCallback(@Nullable com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback Callback) {
        this.mCallback = Callback;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.callback);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView10.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelDoctorCallCardModel((androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.DoctorCallCardModel>) object, fieldId);
            case 1 :
                return onChangeViewModelNotificationType((androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.NotificationType>) object, fieldId);
            case 2 :
                return onChangeViewModelOrderDate((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelPrescriptions((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo>>) object, fieldId);
            case 4 :
                return onChangeViewModelOrderedItemsList((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.salt.models.OrderedItemCardModel>>) object, fieldId);
            case 5 :
                return onChangeViewModelPatientName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewModelShowShimmerLiveData((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeViewModelNotificationData((androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.StickyNonStickyNotificationModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelDoctorCallCardModel(androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.DoctorCallCardModel> ViewModelDoctorCallCardModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelNotificationType(androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.NotificationType> ViewModelNotificationType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelOrderDate(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelOrderDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPrescriptions(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo>> ViewModelPrescriptions, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelOrderedItemsList(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.salt.models.OrderedItemCardModel>> ViewModelOrderedItemsList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPatientName(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelPatientName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowShimmerLiveData(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowShimmerLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelNotificationData(androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.StickyNonStickyNotificationModel> ViewModelNotificationData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
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
        androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.DoctorCallCardModel> viewModelDoctorCallCardModel = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerLiveDataGetValue = false;
        com.intellihealth.salt.models.NotificationType viewModelNotificationTypeGetValue = null;
        com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback callback = mCallback;
        androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.NotificationType> viewModelNotificationType = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelOrderDate = null;
        com.intellihealth.salt.models.StickyNonStickyNotificationModel viewModelNotificationDataGetValue = null;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo>> viewModelPrescriptions = null;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.salt.models.OrderedItemCardModel>> viewModelOrderedItemsList = null;
        int viewModelPrescriptionsSize = 0;
        int viewModelShowShimmerLiveDataViewVISIBLEViewGONE = 0;
        java.lang.String viewModelOrderDateGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPatientName = null;
        int viewModelShowShimmerLiveDataViewGONEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowShimmerLiveData = null;
        int viewModelOrderedItemsListSize = 0;
        int viewModelPrescriptionsSizeInt0ViewGONEViewVISIBLE = 0;
        boolean viewModelOrderedItemsListSizeInt0 = false;
        java.lang.Boolean viewModelShowShimmerLiveDataGetValue = null;
        androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.StickyNonStickyNotificationModel> viewModelNotificationData = null;
        java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo> viewModelPrescriptionsGetValue = null;
        boolean viewModelPrescriptionsSizeInt0 = false;
        java.lang.String viewModelPatientNameGetValue = null;
        java.util.List<com.intellihealth.salt.models.OrderedItemCardModel> viewModelOrderedItemsListGetValue = null;
        int viewModelDoctorCallCardModelJavaLangObjectNullViewGONEViewVISIBLE = 0;
        com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel viewModel = mViewModel;
        com.intellihealth.salt.models.DoctorCallCardModel viewModelDoctorCallCardModelGetValue = null;
        int viewModelOrderedItemsListSizeInt0ViewVISIBLEViewGONE = 0;
        boolean viewModelDoctorCallCardModelJavaLangObjectNull = false;

        if ((dirtyFlags & 0x708L) != 0) {
        }
        if ((dirtyFlags & 0x7ffL) != 0) {


            if ((dirtyFlags & 0x601L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.doctorCallCardModel
                        viewModelDoctorCallCardModel = viewModel.getDoctorCallCardModel();
                    }
                    updateLiveDataRegistration(0, viewModelDoctorCallCardModel);


                    if (viewModelDoctorCallCardModel != null) {
                        // read viewModel.doctorCallCardModel.getValue()
                        viewModelDoctorCallCardModelGetValue = viewModelDoctorCallCardModel.getValue();
                    }


                    // read viewModel.doctorCallCardModel.getValue() == null
                    viewModelDoctorCallCardModelJavaLangObjectNull = (viewModelDoctorCallCardModelGetValue) == (null);
                if((dirtyFlags & 0x601L) != 0) {
                    if(viewModelDoctorCallCardModelJavaLangObjectNull) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }


                    // read viewModel.doctorCallCardModel.getValue() == null ? View.GONE : View.VISIBLE
                    viewModelDoctorCallCardModelJavaLangObjectNullViewGONEViewVISIBLE = ((viewModelDoctorCallCardModelJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x602L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.notificationType
                        viewModelNotificationType = viewModel.getNotificationType();
                    }
                    updateLiveDataRegistration(1, viewModelNotificationType);


                    if (viewModelNotificationType != null) {
                        // read viewModel.notificationType.getValue()
                        viewModelNotificationTypeGetValue = viewModelNotificationType.getValue();
                    }
            }
            if ((dirtyFlags & 0x604L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.orderDate
                        viewModelOrderDate = viewModel.getOrderDate();
                    }
                    updateLiveDataRegistration(2, viewModelOrderDate);


                    if (viewModelOrderDate != null) {
                        // read viewModel.orderDate.getValue()
                        viewModelOrderDateGetValue = viewModelOrderDate.getValue();
                    }
            }
            if ((dirtyFlags & 0x708L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.prescriptions
                        viewModelPrescriptions = viewModel.getPrescriptions();
                    }
                    updateLiveDataRegistration(3, viewModelPrescriptions);


                    if (viewModelPrescriptions != null) {
                        // read viewModel.prescriptions.getValue()
                        viewModelPrescriptionsGetValue = viewModelPrescriptions.getValue();
                    }

                if ((dirtyFlags & 0x608L) != 0) {

                        if (viewModelPrescriptionsGetValue != null) {
                            // read viewModel.prescriptions.getValue().size()
                            viewModelPrescriptionsSize = viewModelPrescriptionsGetValue.size();
                        }


                        // read viewModel.prescriptions.getValue().size() == 0
                        viewModelPrescriptionsSizeInt0 = (viewModelPrescriptionsSize) == (0);
                    if((dirtyFlags & 0x608L) != 0) {
                        if(viewModelPrescriptionsSizeInt0) {
                                dirtyFlags |= 0x10000L;
                        }
                        else {
                                dirtyFlags |= 0x8000L;
                        }
                    }


                        // read viewModel.prescriptions.getValue().size() == 0 ? View.GONE : View.VISIBLE
                        viewModelPrescriptionsSizeInt0ViewGONEViewVISIBLE = ((viewModelPrescriptionsSizeInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }
            }
            if ((dirtyFlags & 0x610L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.orderedItemsList
                        viewModelOrderedItemsList = viewModel.getOrderedItemsList();
                    }
                    updateLiveDataRegistration(4, viewModelOrderedItemsList);


                    if (viewModelOrderedItemsList != null) {
                        // read viewModel.orderedItemsList.getValue()
                        viewModelOrderedItemsListGetValue = viewModelOrderedItemsList.getValue();
                    }


                    if (viewModelOrderedItemsListGetValue != null) {
                        // read viewModel.orderedItemsList.getValue().size()
                        viewModelOrderedItemsListSize = viewModelOrderedItemsListGetValue.size();
                    }


                    // read viewModel.orderedItemsList.getValue().size() > 0
                    viewModelOrderedItemsListSizeInt0 = (viewModelOrderedItemsListSize) > (0);
                if((dirtyFlags & 0x610L) != 0) {
                    if(viewModelOrderedItemsListSizeInt0) {
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                    }
                }


                    // read viewModel.orderedItemsList.getValue().size() > 0 ? View.VISIBLE : View.GONE
                    viewModelOrderedItemsListSizeInt0ViewVISIBLEViewGONE = ((viewModelOrderedItemsListSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x620L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.patientName
                        viewModelPatientName = viewModel.getPatientName();
                    }
                    updateLiveDataRegistration(5, viewModelPatientName);


                    if (viewModelPatientName != null) {
                        // read viewModel.patientName.getValue()
                        viewModelPatientNameGetValue = viewModelPatientName.getValue();
                    }
            }
            if ((dirtyFlags & 0x640L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showShimmerLiveData
                        viewModelShowShimmerLiveData = viewModel.getShowShimmerLiveData();
                    }
                    updateLiveDataRegistration(6, viewModelShowShimmerLiveData);


                    if (viewModelShowShimmerLiveData != null) {
                        // read viewModel.showShimmerLiveData.getValue()
                        viewModelShowShimmerLiveDataGetValue = viewModelShowShimmerLiveData.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerLiveData.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerLiveDataGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowShimmerLiveDataGetValue);
                if((dirtyFlags & 0x640L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerLiveDataGetValue) {
                            dirtyFlags |= 0x1000L;
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerLiveData.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowShimmerLiveDataViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerLiveDataGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerLiveData.getValue()) ? View.GONE : View.VISIBLE
                    viewModelShowShimmerLiveDataViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerLiveDataGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x680L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.notificationData
                        viewModelNotificationData = viewModel.getNotificationData();
                    }
                    updateLiveDataRegistration(7, viewModelNotificationData);


                    if (viewModelNotificationData != null) {
                        // read viewModel.notificationData.getValue()
                        viewModelNotificationDataGetValue = viewModelNotificationData.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x608L) != 0) {
            // api target 1

            this.clUploadPrescription.setVisibility(viewModelPrescriptionsSizeInt0ViewGONEViewVISIBLE);
            this.tvUploadPrescriptionLabel.setVisibility(viewModelPrescriptionsSizeInt0ViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x601L) != 0) {
            // api target 1

            this.doctorCallCard.setVisibility(viewModelDoctorCallCardModelJavaLangObjectNullViewGONEViewVISIBLE);
            this.doctorCallCard.setUpDoctorCallCardData(viewModelDoctorCallCardModelGetValue);
        }
        if ((dirtyFlags & 0x640L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(viewModelShowShimmerLiveDataViewGONEViewVISIBLE);
            this.shimmerViewContainer.setVisibility(viewModelShowShimmerLiveDataViewVISIBLEViewGONE);
            com.intellihealth.truemeds.presentation.bindingadapter.SearchResultBindingAdapterKt.startStopAnimation(this.shimmerViewContainer, androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerLiveDataGetValue);
        }
        if ((dirtyFlags & 0x708L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.CartBindingAdapterKt.setPrescriptionList(this.mboundView8, viewModelPrescriptionsGetValue, callback, false, false);
        }
        if ((dirtyFlags & 0x610L) != 0) {
            // api target 1

            this.orderedItemCard.setVisibility(viewModelOrderedItemsListSizeInt0ViewVISIBLEViewGONE);
            this.orderedItemCard.setUpData(viewModelOrderedItemsListGetValue);
        }
        if ((dirtyFlags & 0x602L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.OrderStatusBindingAdapterKt.setNotificationType(this.stickyOrderStatus, viewModelNotificationTypeGetValue);
        }
        if ((dirtyFlags & 0x680L) != 0) {
            // api target 1

            this.stickyOrderStatus.setStickyNonStickyNotificationData(viewModelNotificationDataGetValue);
        }
        if ((dirtyFlags & 0x604L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvOrderPlaceDate, viewModelOrderDateGetValue);
        }
        if ((dirtyFlags & 0x620L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPatientName, viewModelPatientNameGetValue);
        }
        executeBindingsOn(mboundView10);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.doctorCallCardModel
        flag 1 (0x2L): viewModel.notificationType
        flag 2 (0x3L): viewModel.orderDate
        flag 3 (0x4L): viewModel.prescriptions
        flag 4 (0x5L): viewModel.orderedItemsList
        flag 5 (0x6L): viewModel.patientName
        flag 6 (0x7L): viewModel.showShimmerLiveData
        flag 7 (0x8L): viewModel.notificationData
        flag 8 (0x9L): callback
        flag 9 (0xaL): viewModel
        flag 10 (0xbL): null
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerLiveData.getValue()) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerLiveData.getValue()) ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerLiveData.getValue()) ? View.GONE : View.VISIBLE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerLiveData.getValue()) ? View.GONE : View.VISIBLE
        flag 15 (0x10L): viewModel.prescriptions.getValue().size() == 0 ? View.GONE : View.VISIBLE
        flag 16 (0x11L): viewModel.prescriptions.getValue().size() == 0 ? View.GONE : View.VISIBLE
        flag 17 (0x12L): viewModel.doctorCallCardModel.getValue() == null ? View.GONE : View.VISIBLE
        flag 18 (0x13L): viewModel.doctorCallCardModel.getValue() == null ? View.GONE : View.VISIBLE
        flag 19 (0x14L): viewModel.orderedItemsList.getValue().size() > 0 ? View.VISIBLE : View.GONE
        flag 20 (0x15L): viewModel.orderedItemsList.getValue().size() > 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}