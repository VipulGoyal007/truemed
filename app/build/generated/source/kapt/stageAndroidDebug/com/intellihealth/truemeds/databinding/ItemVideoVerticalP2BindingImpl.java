package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemVideoVerticalP2BindingImpl extends ItemVideoVerticalP2Binding implements com.intellihealth.truemeds.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemVideoVerticalP2BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private ItemVideoVerticalP2BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.cardview.widget.CardView) bindings[0]
            );
        this.appCompatImageView26.setTag(null);
        this.clBackground.setTag(null);
        setRootTag(root);
        // listeners
        mCallback17 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 1);
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
        if (BR.item == variableId) {
            setItem((com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse.Video.VideoUrl) variable);
        }
        else if (BR.position == variableId) {
            setPosition((java.lang.Integer) variable);
        }
        else if (BR.selectedNext == variableId) {
            setSelectedNext((boolean) variable);
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
    public void setSelectedNext(boolean SelectedNext) {
        this.mSelectedNext = SelectedNext;
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    public void setSelected(boolean Selected) {
        this.mSelected = Selected;
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
        java.lang.String itemThumbnailUrlPortrait = null;
        java.lang.Integer position = mPosition;
        com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x21L) != 0) {



                if (item != null) {
                    // read item.thumbnailUrl_portrait
                    itemThumbnailUrlPortrait = item.getThumbnailUrl_portrait();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x21L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.VideoBindingAdapterP2.setThumbnailUrl(this.appCompatImageView26, itemThumbnailUrlPortrait);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.clBackground.setOnClickListener(mCallback17);
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






            viewModel.onPlayListSelected(item, position, true, true);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): position
        flag 2 (0x3L): selectedNext
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): selected
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}