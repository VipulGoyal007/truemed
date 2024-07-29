package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BottomsheetPaymentCarouselBindingImpl extends BottomsheetPaymentCarouselBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.viewDragHandle, 11);
        sViewsWithIds.put(R.id.constraintLayout, 12);
        sViewsWithIds.put(R.id.cl_coupon_info, 13);
        sViewsWithIds.put(R.id.imageInfoCircle, 14);
        sViewsWithIds.put(R.id.tvCouponInfoDescription, 15);
        sViewsWithIds.put(R.id.cl_coupon_offer_content, 16);
        sViewsWithIds.put(R.id.tvMinOrderValue, 17);
        sViewsWithIds.put(R.id.tvDiscountCashback, 18);
        sViewsWithIds.put(R.id.tvCouponExpiry, 19);
        sViewsWithIds.put(R.id.divider3, 20);
        sViewsWithIds.put(R.id.tvTermsAndConditionsLabel, 21);
        sViewsWithIds.put(R.id.nestedScrollview, 22);
        sViewsWithIds.put(R.id.imageClose, 23);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BottomsheetPaymentCarouselBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private BottomsheetPaymentCarouselBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.intellihealth.salt.views.buttons.ButtonLite) bindings[9]
            , (com.intellihealth.salt.views.buttons.ButtonLite) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (android.view.View) bindings[20]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[23]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[14]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.core.widget.NestedScrollView) bindings[22]
            , (com.intellihealth.salt.views.TextView) bindings[7]
            , (com.intellihealth.salt.views.TextView) bindings[19]
            , (com.intellihealth.salt.views.TextView) bindings[3]
            , (com.intellihealth.salt.views.TextView) bindings[15]
            , (com.intellihealth.salt.views.TextView) bindings[18]
            , (com.intellihealth.salt.views.TextView) bindings[5]
            , (com.intellihealth.salt.views.TextView) bindings[6]
            , (com.intellihealth.salt.views.TextView) bindings[2]
            , (com.intellihealth.salt.views.TextView) bindings[4]
            , (com.intellihealth.salt.views.TextView) bindings[17]
            , (com.intellihealth.salt.views.TextView) bindings[21]
            , (com.intellihealth.salt.views.cards.Divider) bindings[11]
            );
        this.btnApplyCoupon.setTag(null);
        this.btnRemoveCoupon.setTag(null);
        this.clButton.setTag(null);
        this.imgLeft.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textTermsAndConditions.setTag(null);
        this.tvCouponHeader.setTag(null);
        this.tvDiscountCashbackValue.setTag(null);
        this.tvExpiryDays.setTag(null);
        this.tvHeader.setTag(null);
        this.tvMinCartValue.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.lifeCycle == variableId) {
            setLifeCycle((androidx.lifecycle.LifecycleOwner) variable);
        }
        else if (BR.expires == variableId) {
            setExpires((java.lang.Integer) variable);
        }
        else if (BR.applyCouponData == variableId) {
            setApplyCouponData((com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon) variable);
        }
        else if (BR.discount == variableId) {
            setDiscount((java.lang.String) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.CartViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLifeCycle(@Nullable androidx.lifecycle.LifecycleOwner LifeCycle) {
        this.mLifeCycle = LifeCycle;
    }
    public void setExpires(@Nullable java.lang.Integer Expires) {
        this.mExpires = Expires;
    }
    public void setApplyCouponData(@Nullable com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon ApplyCouponData) {
        this.mApplyCouponData = ApplyCouponData;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.applyCouponData);
        super.requestRebind();
    }
    public void setDiscount(@Nullable java.lang.String Discount) {
        this.mDiscount = Discount;
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.CartViewModel ViewModel) {
        this.mViewModel = ViewModel;
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
        java.lang.Double applyCouponDataDiscountValue = null;
        java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon.TermsAndCondition> applyCouponDataTermsAndConditions = null;
        int applyCouponDataPromoCodeJavaLangObjectNullViewVISIBLEViewGONE = 0;
        boolean applyCouponDataPromoCodeJavaLangObjectNull = false;
        java.lang.String applyCouponDataImage = null;
        java.lang.String applyCouponDataPromoCode = null;
        int applyCouponDataIsCouponAppliedBooleanTrueViewVISIBLEViewGONE = 0;
        java.lang.String applyCouponDataExpiryDays = null;
        java.lang.String applyCouponDataTitle = null;
        int applyCouponDataIsCouponAppliedBooleanTrueViewGONEViewVISIBLE = 0;
        java.lang.Integer applyCouponDataMinCartValue = null;
        com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon applyCouponData = mApplyCouponData;
        java.lang.String applyCouponDataMinCartValueJavaLangString = null;
        boolean applyCouponDataIsCouponApplied = false;
        boolean applyCouponDataIsCouponAppliedBooleanTrue = false;
        java.lang.String applyCouponDataDiscountValueJavaLangString = null;

        if ((dirtyFlags & 0x24L) != 0) {



                if (applyCouponData != null) {
                    // read applyCouponData.discountValue
                    applyCouponDataDiscountValue = applyCouponData.getDiscountValue();
                    // read applyCouponData.termsAndConditions
                    applyCouponDataTermsAndConditions = applyCouponData.getTermsAndConditions();
                    // read applyCouponData.image
                    applyCouponDataImage = applyCouponData.getImage();
                    // read applyCouponData.promoCode
                    applyCouponDataPromoCode = applyCouponData.getPromoCode();
                    // read applyCouponData.expiryDays
                    applyCouponDataExpiryDays = applyCouponData.getExpiryDays();
                    // read applyCouponData.title
                    applyCouponDataTitle = applyCouponData.getTitle();
                    // read applyCouponData.minCartValue
                    applyCouponDataMinCartValue = applyCouponData.getMinCartValue();
                    // read applyCouponData.isCouponApplied
                    applyCouponDataIsCouponApplied = applyCouponData.isCouponApplied();
                }


                // read (applyCouponData.discountValue) + ("")
                applyCouponDataDiscountValueJavaLangString = (applyCouponDataDiscountValue) + ("");
                // read applyCouponData.promoCode != null
                applyCouponDataPromoCodeJavaLangObjectNull = (applyCouponDataPromoCode) != (null);
                // read (applyCouponData.minCartValue) + ("")
                applyCouponDataMinCartValueJavaLangString = (applyCouponDataMinCartValue) + ("");
                // read applyCouponData.isCouponApplied == true
                applyCouponDataIsCouponAppliedBooleanTrue = (applyCouponDataIsCouponApplied) == (true);
            if((dirtyFlags & 0x24L) != 0) {
                if(applyCouponDataPromoCodeJavaLangObjectNull) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
            if((dirtyFlags & 0x24L) != 0) {
                if(applyCouponDataIsCouponAppliedBooleanTrue) {
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x400L;
                }
            }


                // read applyCouponData.promoCode != null ? View.VISIBLE : View.GONE
                applyCouponDataPromoCodeJavaLangObjectNullViewVISIBLEViewGONE = ((applyCouponDataPromoCodeJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read applyCouponData.isCouponApplied == true ? View.VISIBLE : View.GONE
                applyCouponDataIsCouponAppliedBooleanTrueViewVISIBLEViewGONE = ((applyCouponDataIsCouponAppliedBooleanTrue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read applyCouponData.isCouponApplied == true ? View.GONE : View.VISIBLE
                applyCouponDataIsCouponAppliedBooleanTrueViewGONEViewVISIBLE = ((applyCouponDataIsCouponAppliedBooleanTrue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x24L) != 0) {
            // api target 1

            this.btnApplyCoupon.setVisibility(applyCouponDataIsCouponAppliedBooleanTrueViewGONEViewVISIBLE);
            this.btnRemoveCoupon.setVisibility(applyCouponDataIsCouponAppliedBooleanTrueViewVISIBLEViewGONE);
            this.clButton.setVisibility(applyCouponDataPromoCodeJavaLangObjectNullViewVISIBLEViewGONE);
            com.intellihealth.truemeds.presentation.bindingadapter.CartBindingAdapterKt.setUrl(this.imgLeft, applyCouponDataImage, (android.graphics.drawable.Drawable)null, (boolean)false, (java.lang.String)null);
            com.intellihealth.truemeds.presentation.bindingadapter.CouponBindingAdapterKt.setTermsAndCondition(this.textTermsAndConditions, applyCouponDataTermsAndConditions);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCouponHeader, applyCouponDataTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDiscountCashbackValue, applyCouponDataDiscountValueJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvExpiryDays, applyCouponDataExpiryDays);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHeader, applyCouponDataPromoCode);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvMinCartValue, applyCouponDataMinCartValueJavaLangString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): lifeCycle
        flag 1 (0x2L): expires
        flag 2 (0x3L): applyCouponData
        flag 3 (0x4L): discount
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
        flag 6 (0x7L): applyCouponData.promoCode != null ? View.VISIBLE : View.GONE
        flag 7 (0x8L): applyCouponData.promoCode != null ? View.VISIBLE : View.GONE
        flag 8 (0x9L): applyCouponData.isCouponApplied == true ? View.VISIBLE : View.GONE
        flag 9 (0xaL): applyCouponData.isCouponApplied == true ? View.VISIBLE : View.GONE
        flag 10 (0xbL): applyCouponData.isCouponApplied == true ? View.GONE : View.VISIBLE
        flag 11 (0xcL): applyCouponData.isCouponApplied == true ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}