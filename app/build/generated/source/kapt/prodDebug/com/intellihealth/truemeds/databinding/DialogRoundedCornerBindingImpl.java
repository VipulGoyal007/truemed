package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogRoundedCornerBindingImpl extends DialogRoundedCornerBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ivPopup, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogRoundedCornerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private DialogRoundedCornerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.intellihealth.salt.views.buttons.Button) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (com.intellihealth.salt.views.TextView) bindings[2]
            , (com.intellihealth.salt.views.TextView) bindings[3]
            , (com.intellihealth.salt.views.TextView) bindings[4]
            );
        this.btnAction.setTag(null);
        this.ivClose.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvHeader.setTag(null);
        this.tvMessage.setTag(null);
        this.tvSpanMessage.setTag(null);
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
        if (BR.model == variableId) {
            setModel((com.intellihealth.truemeds.data.model.home.PopUpModel) variable);
        }
        else if (BR.callback == variableId) {
            setCallback((com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.intellihealth.truemeds.data.model.home.PopUpModel Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }
    public void setCallback(@Nullable com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback Callback) {
        this.mCallback = Callback;
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
        com.intellihealth.truemeds.data.model.home.PopUpModel model = mModel;
        java.lang.String modelMessage = null;
        int modelIsSpannableTextViewINVISIBLEViewVISIBLE = 0;
        int modelIsSpannableTextViewVISIBLEViewGONE = 0;
        int modelShowCloseButtonViewVISIBLEViewGONE = 0;
        int modelButtonTextJavaLangObjectNullViewGONEViewVISIBLE = 0;
        boolean modelButtonTextJavaLangObjectNull = false;
        boolean modelIsSpannableText = false;
        boolean modelShowCloseButton = false;
        java.lang.String modelHeader = null;
        java.lang.String modelButtonText = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (model != null) {
                    // read model.message
                    modelMessage = model.getMessage();
                    // read model.isSpannableText
                    modelIsSpannableText = model.isSpannableText();
                    // read model.showCloseButton
                    modelShowCloseButton = model.getShowCloseButton();
                    // read model.header
                    modelHeader = model.getHeader();
                    // read model.buttonText
                    modelButtonText = model.getButtonText();
                }
            if((dirtyFlags & 0x5L) != 0) {
                if(modelIsSpannableText) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x5L) != 0) {
                if(modelShowCloseButton) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }


                // read model.isSpannableText ? View.INVISIBLE : View.VISIBLE
                modelIsSpannableTextViewINVISIBLEViewVISIBLE = ((modelIsSpannableText) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
                // read model.isSpannableText ? View.VISIBLE : View.GONE
                modelIsSpannableTextViewVISIBLEViewGONE = ((modelIsSpannableText) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read model.showCloseButton ? View.VISIBLE : View.GONE
                modelShowCloseButtonViewVISIBLEViewGONE = ((modelShowCloseButton) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read model.buttonText == null
                modelButtonTextJavaLangObjectNull = (modelButtonText) == (null);
            if((dirtyFlags & 0x5L) != 0) {
                if(modelButtonTextJavaLangObjectNull) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }


                // read model.buttonText == null ? View.GONE : View.VISIBLE
                modelButtonTextJavaLangObjectNullViewGONEViewVISIBLE = ((modelButtonTextJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.btnAction.setVisibility(modelButtonTextJavaLangObjectNullViewGONEViewVISIBLE);
            this.btnAction.setTitle(modelButtonText);
            this.ivClose.setVisibility(modelShowCloseButtonViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHeader, modelHeader);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvMessage, modelMessage);
            this.tvMessage.setVisibility(modelIsSpannableTextViewINVISIBLEViewVISIBLE);
            this.tvSpanMessage.setVisibility(modelIsSpannableTextViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): callback
        flag 2 (0x3L): null
        flag 3 (0x4L): model.isSpannableText ? View.INVISIBLE : View.VISIBLE
        flag 4 (0x5L): model.isSpannableText ? View.INVISIBLE : View.VISIBLE
        flag 5 (0x6L): model.isSpannableText ? View.VISIBLE : View.GONE
        flag 6 (0x7L): model.isSpannableText ? View.VISIBLE : View.GONE
        flag 7 (0x8L): model.showCloseButton ? View.VISIBLE : View.GONE
        flag 8 (0x9L): model.showCloseButton ? View.VISIBLE : View.GONE
        flag 9 (0xaL): model.buttonText == null ? View.GONE : View.VISIBLE
        flag 10 (0xbL): model.buttonText == null ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}