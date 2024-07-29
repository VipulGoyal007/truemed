package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemVideoP2BindingImpl extends ItemVideoP2Binding implements com.intellihealth.truemeds.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvIsVideoPlaying, 4);
        sViewsWithIds.put(R.id.ivPlay, 5);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback23;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemVideoP2BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemVideoP2BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (com.intellihealth.salt.views.TextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            );
        this.appCompatImageView26.setTag(null);
        this.appCompatTextView.setTag(null);
        this.clBackground.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback23 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 1);
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
        if (BR.item == variableId) {
            setItem((com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse.Video.VideoUrl) variable);
        }
        else if (BR.position == variableId) {
            setPosition((java.lang.Integer) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel) variable);
        }
        else if (BR.selected == variableId) {
            setSelected((boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse.Video.VideoUrl Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setPosition(@Nullable java.lang.Integer Position) {
        this.mPosition = Position;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.position);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    public void setSelected(boolean Selected) {
        this.mSelected = Selected;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.selected);
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
        com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse.Video.VideoUrl item = mItem;
        java.lang.Integer position = mPosition;
        int selectedClBackgroundAndroidColorTmSemanticColorBgPrimaryClBackgroundAndroidColorTmCoreColorWhite = 0;
        java.lang.String itemTitle = null;
        java.lang.String itemThumbnailUrl = null;
        com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel viewModel = mViewModel;
        boolean selected = mSelected;
        java.lang.String itemDuration = null;

        if ((dirtyFlags & 0x11L) != 0) {



                if (item != null) {
                    // read item.title
                    itemTitle = item.getTitle();
                    // read item.thumbnailUrl
                    itemThumbnailUrl = item.getThumbnailUrl();
                    // read item.duration
                    itemDuration = item.getDuration();
                }
        }
        if ((dirtyFlags & 0x18L) != 0) {

            if((dirtyFlags & 0x18L) != 0) {
                if(selected) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read selected ? @android:color/tm_semantic_color_bg_primary : @android:color/tm_core_color_white
                selectedClBackgroundAndroidColorTmSemanticColorBgPrimaryClBackgroundAndroidColorTmCoreColorWhite = ((selected) ? (getColorFromResource(clBackground, com.intellihealth.salt.R.color.tm_semantic_color_bg_primary)) : (getColorFromResource(clBackground, com.intellihealth.salt.R.color.tm_core_color_white)));
        }
        // batch finished
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.VideoBindingAdapterP2.setThumbnailUrl(this.appCompatImageView26, itemThumbnailUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.appCompatTextView, itemDuration);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, itemTitle);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.clBackground, androidx.databinding.adapters.Converters.convertColorToDrawable(selectedClBackgroundAndroidColorTmSemanticColorBgPrimaryClBackgroundAndroidColorTmCoreColorWhite));
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.clBackground.setOnClickListener(mCallback23);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // item
        com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse.Video.VideoUrl item = mItem;
        // position
        java.lang.Integer position = mPosition;
        // viewModel
        com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {






            viewModel.onPlayListSelected(item, position, true, false);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): position
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): selected
        flag 4 (0x5L): null
        flag 5 (0x6L): selected ? @android:color/tm_semantic_color_bg_primary : @android:color/tm_core_color_white
        flag 6 (0x7L): selected ? @android:color/tm_semantic_color_bg_primary : @android:color/tm_core_color_white
    flag mapping end*/
    //end
}