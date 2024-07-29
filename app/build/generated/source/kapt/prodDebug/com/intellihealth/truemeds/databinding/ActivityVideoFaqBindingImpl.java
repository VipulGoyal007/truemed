package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityVideoFaqBindingImpl extends ActivityVideoFaqBinding implements com.intellihealth.truemeds.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvTitle, 35);
        sViewsWithIds.put(R.id.toggleButton, 36);
        sViewsWithIds.put(R.id.playerConstrain, 37);
        sViewsWithIds.put(R.id.playerBottomView, 38);
        sViewsWithIds.put(R.id.view3, 39);
        sViewsWithIds.put(R.id.tvRelatedVideos, 40);
        sViewsWithIds.put(R.id.llControllers1, 41);
        sViewsWithIds.put(R.id.pbVideoProgress2, 42);
        sViewsWithIds.put(R.id.loading_indicator, 43);
    }
    // views
    @NonNull
    private final android.view.View mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback55;
    @Nullable
    private final android.view.View.OnClickListener mCallback56;
    @Nullable
    private final android.view.View.OnClickListener mCallback49;
    @Nullable
    private final android.view.View.OnClickListener mCallback52;
    @Nullable
    private final android.view.View.OnClickListener mCallback54;
    @Nullable
    private final android.view.View.OnClickListener mCallback53;
    @Nullable
    private final android.view.View.OnClickListener mCallback47;
    @Nullable
    private final android.view.View.OnClickListener mCallback50;
    @Nullable
    private final android.view.View.OnClickListener mCallback48;
    @Nullable
    private final android.view.View.OnClickListener mCallback51;
    @Nullable
    private final android.view.View.OnClickListener mCallback45;
    @Nullable
    private final android.view.View.OnClickListener mCallback46;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityVideoFaqBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 44, sIncludes, sViewsWithIds));
    }
    private ActivityVideoFaqBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 16
            , (androidx.appcompat.widget.AppCompatImageView) bindings[16]
            , (com.intellihealth.salt.views.buttons.Button) bindings[33]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.constraintlayout.widget.Group) bindings[27]
            , (androidx.constraintlayout.widget.Group) bindings[20]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[26]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[14]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[9]
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[41]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[17]
            , (android.widget.ProgressBar) bindings[43]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[34]
            , (android.widget.ProgressBar) bindings[42]
            , (android.view.View) bindings[38]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[37]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[11]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[29]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[10]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[28]
            , (com.google.android.exoplayer2.ui.PlayerView) bindings[5]
            , (android.widget.ProgressBar) bindings[15]
            , (androidx.recyclerview.widget.RecyclerView) bindings[22]
            , (androidx.recyclerview.widget.RecyclerView) bindings[32]
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[36]
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[23]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[24]
            , (com.intellihealth.salt.views.TextView) bindings[19]
            , (com.intellihealth.salt.views.TextView) bindings[40]
            , (com.intellihealth.salt.views.TextView) bindings[21]
            , (com.intellihealth.salt.views.TextView) bindings[18]
            , (com.intellihealth.salt.views.TextView) bindings[35]
            , (com.intellihealth.salt.views.TextView) bindings[8]
            , (com.intellihealth.salt.views.TextView) bindings[12]
            , (com.intellihealth.salt.views.TextView) bindings[30]
            , (com.intellihealth.salt.views.TextView) bindings[13]
            , (com.intellihealth.salt.views.TextView) bindings[31]
            , (android.view.View) bindings[39]
            );
        this.appCompatImageView18.setTag(null);
        this.btnViewAll.setTag(null);
        this.clRoot.setTag(null);
        this.clToolbar.setTag(null);
        this.gpBottomPlayList.setTag(null);
        this.gpPlayList.setTag(null);
        this.ivBack.setTag(null);
        this.ivClose.setTag(null);
        this.ivFullScreen.setTag(null);
        this.ivThumbnail.setTag(null);
        this.llControllers.setTag(null);
        this.loadingGIF.setTag(null);
        this.mboundView7 = (android.view.View) bindings[7];
        this.mboundView7.setTag(null);
        this.pbLoading.setTag(null);
        this.playerForward.setTag(null);
        this.playerForward1.setTag(null);
        this.playerPlay.setTag(null);
        this.playerPlay1.setTag(null);
        this.playerView.setTag(null);
        this.progressBar2.setTag(null);
        this.rvVideoList.setTag(null);
        this.rvVideoListVertical.setTag(null);
        this.toggleButton1.setTag(null);
        this.tvEnglish.setTag(null);
        this.tvEnglish1.setTag(null);
        this.tvHindi.setTag(null);
        this.tvHindi1.setTag(null);
        this.tvPlayingNext.setTag(null);
        this.tvSaveMoney.setTag(null);
        this.tvTextPlayingNext.setTag(null);
        this.tvTitle2.setTag(null);
        this.tvVideoCurrentTime.setTag(null);
        this.tvVideoCurrentTime1.setTag(null);
        this.tvVideoDuration.setTag(null);
        this.tvVideoDuration1.setTag(null);
        setRootTag(root);
        // listeners
        mCallback55 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 11);
        mCallback56 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 12);
        mCallback49 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 5);
        mCallback52 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 8);
        mCallback54 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 10);
        mCallback53 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 9);
        mCallback47 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 3);
        mCallback50 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 6);
        mCallback48 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 4);
        mCallback51 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 7);
        mCallback45 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 1);
        mCallback46 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20000L;
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
        if (BR.viewmodel == variableId) {
            setViewmodel((com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x10000L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelIsLoadingData((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewmodelCurrentDuration((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelIsHindiSelected((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewmodelIsFullScreen((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewmodelLoadGif((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeViewmodelShowThumbnail((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeViewmodelVidListSize((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 7 :
                return onChangeViewmodelIsVideoPaused((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 8 :
                return onChangeViewmodelUrlImage((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeViewmodelIsProgressVisible((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 10 :
                return onChangeViewmodelIsSecondaryPlayFlag((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 11 :
                return onChangeViewmodelCurrentTitle((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 12 :
                return onChangeViewmodelStreamingDuration((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 13 :
                return onChangeViewmodelDtoVideos((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse.Video>>) object, fieldId);
            case 14 :
                return onChangeViewmodelShowHorizontalList((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 15 :
                return onChangeViewmodelPlayingNextTitle((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelIsLoadingData(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewmodelIsLoadingData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelCurrentDuration(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelCurrentDuration, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelIsHindiSelected(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewmodelIsHindiSelected, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelIsFullScreen(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewmodelIsFullScreen, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelLoadGif(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewmodelLoadGif, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelShowThumbnail(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewmodelShowThumbnail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelVidListSize(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewmodelVidListSize, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelIsVideoPaused(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewmodelIsVideoPaused, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelUrlImage(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelUrlImage, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelIsProgressVisible(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewmodelIsProgressVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelIsSecondaryPlayFlag(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewmodelIsSecondaryPlayFlag, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelCurrentTitle(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelCurrentTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelStreamingDuration(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelStreamingDuration, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelDtoVideos(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse.Video>> ViewmodelDtoVideos, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelShowHorizontalList(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewmodelShowHorizontalList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelPlayingNextTitle(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelPlayingNextTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
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
        java.lang.Boolean viewmodelIsVideoPausedGetValue = null;
        boolean viewmodelIsFullScreenViewmodelShowHorizontalListBooleanFalse = false;
        int viewmodelIsHindiSelectedTvEnglish1AndroidColorTextColorEnSelectedTvEnglish1AndroidColorWhite = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelIsFullScreenGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewmodelIsLoadingData = null;
        android.graphics.drawable.Drawable viewmodelIsHindiSelectedTvHindi1AndroidDrawableBgVideoLanguageSelectedJavaLangObjectNull = null;
        int viewmodelIsProgressVisibleViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelCurrentDuration = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewmodelIsHindiSelected = null;
        android.graphics.drawable.Drawable viewmodelIsHindiSelectedTvHindiAndroidDrawableBgVideoLanguageSelectedJavaLangObjectNull = null;
        java.lang.Boolean viewmodelIsSecondaryPlayFlagGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelIsSecondaryPlayFlagGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewmodelIsFullScreen = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewmodelLoadGif = null;
        int viewmodelIsFullScreenViewmodelShowHorizontalListBooleanFalseViewGONEViewVISIBLE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelIsHindiSelectedGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewmodelShowThumbnail = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewmodelVidListSize = null;
        java.lang.Integer viewmodelVidListSizeGetValue = null;
        int viewmodelIsVideoPausedViewINVISIBLEViewVISIBLE = 0;
        java.lang.String viewmodelCurrentTitleGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelLoadGifGetValue = false;
        android.graphics.drawable.Drawable viewmodelIsSecondaryPlayFlagPlayerPlay1AndroidDrawableIcExoPlayPlayerPlay1AndroidDrawableIcVideoPlay = null;
        int viewmodelIsVideoPausedViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelIsLoadingDataGetValue = false;
        boolean viewmodelVidListSizeInt1 = false;
        com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel viewmodel = mViewmodel;
        android.graphics.drawable.Drawable viewmodelIsHindiSelectedJavaLangObjectNullTvEnglishAndroidDrawableBgVideoLanguageSelected = null;
        int viewmodelIsHindiSelectedTvHindi1AndroidColorWhiteTvHindi1AndroidColorTextColorEnSelected = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewmodelIsVideoPaused = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelUrlImage = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewmodelIsProgressVisible = null;
        int viewmodelVidListSizeInt1ViewVISIBLEViewGONE = 0;
        int viewmodelIsHindiSelectedTvHindiAndroidColorWhiteTvHindiAndroidColorTextColorEnSelected = 0;
        java.lang.Boolean viewmodelIsLoadingDataGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewmodelVidListSizeGetValue = 0;
        int viewmodelIsFullScreenViewGONEViewVISIBLE = 0;
        int viewmodelIsHindiSelectedTvEnglishAndroidColorTextColorEnSelectedTvEnglishAndroidColorWhite = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewmodelIsSecondaryPlayFlag = null;
        int viewmodelIsFullScreenViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelShowThumbnailGetValue = false;
        android.graphics.drawable.Drawable viewmodelIsHindiSelectedJavaLangObjectNullTvEnglish1AndroidDrawableBgVideoLanguageSelected = null;
        java.lang.Boolean viewmodelShowThumbnailGetValue = null;
        java.lang.Boolean viewmodelIsFullScreenGetValue = null;
        java.util.List<com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse.Video> viewmodelDtoVideosGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelShowHorizontalListGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelCurrentTitle = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelStreamingDuration = null;
        java.lang.Boolean viewmodelShowHorizontalListGetValue = null;
        int viewmodelLoadGifViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelCurrentDurationGetValue = null;
        int viewmodelIsFullScreenViewmodelShowHorizontalListBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse.Video>> viewmodelDtoVideos = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewmodelShowHorizontalList = null;
        java.lang.Boolean viewmodelIsProgressVisibleGetValue = null;
        java.lang.Boolean viewmodelLoadGifGetValue = null;
        java.lang.String viewmodelUrlImageGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelIsProgressVisibleGetValue = false;
        android.graphics.drawable.Drawable viewmodelIsSecondaryPlayFlagPlayerPlayAndroidDrawableIcExoPlayPlayerPlayAndroidDrawableIcVideoPlay = null;
        java.lang.Boolean viewmodelIsHindiSelectedGetValue = null;
        int viewmodelShowThumbnailViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelPlayingNextTitleGetValue = null;
        java.lang.String viewmodelStreamingDurationJavaLangString = null;
        int viewmodelIsLoadingDataViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelStreamingDurationGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelPlayingNextTitle = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelIsVideoPausedGetValue = false;

        if ((dirtyFlags & 0x3ffffL) != 0) {


            if ((dirtyFlags & 0x30001L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.isLoadingData
                        viewmodelIsLoadingData = viewmodel.isLoadingData();
                    }
                    updateLiveDataRegistration(0, viewmodelIsLoadingData);


                    if (viewmodelIsLoadingData != null) {
                        // read viewmodel.isLoadingData.getValue()
                        viewmodelIsLoadingDataGetValue = viewmodelIsLoadingData.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isLoadingData.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelIsLoadingDataGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelIsLoadingDataGetValue);
                if((dirtyFlags & 0x30001L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewmodelIsLoadingDataGetValue) {
                            dirtyFlags |= 0x2000000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isLoadingData.getValue()) ? View.VISIBLE : View.GONE
                    viewmodelIsLoadingDataViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelIsLoadingDataGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x30002L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel._currentDuration
                        viewmodelCurrentDuration = viewmodel.get_currentDuration();
                    }
                    updateLiveDataRegistration(1, viewmodelCurrentDuration);


                    if (viewmodelCurrentDuration != null) {
                        // read viewmodel._currentDuration.getValue()
                        viewmodelCurrentDurationGetValue = viewmodelCurrentDuration.getValue();
                    }
            }
            if ((dirtyFlags & 0x30004L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel._isHindiSelected
                        viewmodelIsHindiSelected = viewmodel.get_isHindiSelected();
                    }
                    updateLiveDataRegistration(2, viewmodelIsHindiSelected);


                    if (viewmodelIsHindiSelected != null) {
                        // read viewmodel._isHindiSelected.getValue()
                        viewmodelIsHindiSelectedGetValue = viewmodelIsHindiSelected.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._isHindiSelected.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelIsHindiSelectedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelIsHindiSelectedGetValue);
                if((dirtyFlags & 0x30004L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewmodelIsHindiSelectedGetValue) {
                            dirtyFlags |= 0x200000L;
                            dirtyFlags |= 0x800000L;
                            dirtyFlags |= 0x8000000L;
                            dirtyFlags |= 0x2000000000L;
                            dirtyFlags |= 0x8000000000L;
                            dirtyFlags |= 0x80000000000L;
                            dirtyFlags |= 0x800000000000L;
                            dirtyFlags |= 0x8000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                            dirtyFlags |= 0x400000L;
                            dirtyFlags |= 0x4000000L;
                            dirtyFlags |= 0x1000000000L;
                            dirtyFlags |= 0x4000000000L;
                            dirtyFlags |= 0x40000000000L;
                            dirtyFlags |= 0x400000000000L;
                            dirtyFlags |= 0x4000000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._isHindiSelected.getValue()) ? @android:color/text_color_en_selected : @android:color/white
                    viewmodelIsHindiSelectedTvEnglish1AndroidColorTextColorEnSelectedTvEnglish1AndroidColorWhite = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelIsHindiSelectedGetValue) ? (getColorFromResource(tvEnglish1, R.color.text_color_en_selected)) : (getColorFromResource(tvEnglish1, R.color.white)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._isHindiSelected.getValue()) ? @android:drawable/bg_video_language_selected : null
                    viewmodelIsHindiSelectedTvHindi1AndroidDrawableBgVideoLanguageSelectedJavaLangObjectNull = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelIsHindiSelectedGetValue) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(tvHindi1.getContext(), R.drawable.bg_video_language_selected)) : (null));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._isHindiSelected.getValue()) ? @android:drawable/bg_video_language_selected : null
                    viewmodelIsHindiSelectedTvHindiAndroidDrawableBgVideoLanguageSelectedJavaLangObjectNull = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelIsHindiSelectedGetValue) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(tvHindi.getContext(), R.drawable.bg_video_language_selected)) : (null));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._isHindiSelected.getValue()) ? null : @android:drawable/bg_video_language_selected
                    viewmodelIsHindiSelectedJavaLangObjectNullTvEnglishAndroidDrawableBgVideoLanguageSelected = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelIsHindiSelectedGetValue) ? (null) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(tvEnglish.getContext(), R.drawable.bg_video_language_selected)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._isHindiSelected.getValue()) ? @android:color/white : @android:color/text_color_en_selected
                    viewmodelIsHindiSelectedTvHindi1AndroidColorWhiteTvHindi1AndroidColorTextColorEnSelected = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelIsHindiSelectedGetValue) ? (getColorFromResource(tvHindi1, R.color.white)) : (getColorFromResource(tvHindi1, R.color.text_color_en_selected)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._isHindiSelected.getValue()) ? @android:color/white : @android:color/text_color_en_selected
                    viewmodelIsHindiSelectedTvHindiAndroidColorWhiteTvHindiAndroidColorTextColorEnSelected = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelIsHindiSelectedGetValue) ? (getColorFromResource(tvHindi, R.color.white)) : (getColorFromResource(tvHindi, R.color.text_color_en_selected)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._isHindiSelected.getValue()) ? @android:color/text_color_en_selected : @android:color/white
                    viewmodelIsHindiSelectedTvEnglishAndroidColorTextColorEnSelectedTvEnglishAndroidColorWhite = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelIsHindiSelectedGetValue) ? (getColorFromResource(tvEnglish, R.color.text_color_en_selected)) : (getColorFromResource(tvEnglish, R.color.white)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._isHindiSelected.getValue()) ? null : @android:drawable/bg_video_language_selected
                    viewmodelIsHindiSelectedJavaLangObjectNullTvEnglish1AndroidDrawableBgVideoLanguageSelected = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelIsHindiSelectedGetValue) ? (null) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(tvEnglish1.getContext(), R.drawable.bg_video_language_selected)));
            }
            if ((dirtyFlags & 0x34008L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.isFullScreen
                        viewmodelIsFullScreen = viewmodel.isFullScreen();
                    }
                    updateLiveDataRegistration(3, viewmodelIsFullScreen);


                    if (viewmodelIsFullScreen != null) {
                        // read viewmodel.isFullScreen.getValue()
                        viewmodelIsFullScreenGetValue = viewmodelIsFullScreen.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isFullScreen.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelIsFullScreenGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelIsFullScreenGetValue);
                if((dirtyFlags & 0x34008L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewmodelIsFullScreenGetValue) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }
                if((dirtyFlags & 0x30008L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewmodelIsFullScreenGetValue) {
                            dirtyFlags |= 0x200000000000L;
                            dirtyFlags |= 0x2000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000000L;
                            dirtyFlags |= 0x1000000000000L;
                    }
                }

                if ((dirtyFlags & 0x30008L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isFullScreen.getValue()) ? View.GONE : View.VISIBLE
                        viewmodelIsFullScreenViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelIsFullScreenGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isFullScreen.getValue()) ? View.VISIBLE : View.GONE
                        viewmodelIsFullScreenViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelIsFullScreenGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x30010L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.loadGif
                        viewmodelLoadGif = viewmodel.getLoadGif();
                    }
                    updateLiveDataRegistration(4, viewmodelLoadGif);


                    if (viewmodelLoadGif != null) {
                        // read viewmodel.loadGif.getValue()
                        viewmodelLoadGifGetValue = viewmodelLoadGif.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.loadGif.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelLoadGifGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelLoadGifGetValue);
                if((dirtyFlags & 0x30010L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewmodelLoadGifGetValue) {
                            dirtyFlags |= 0x20000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.loadGif.getValue()) ? View.VISIBLE : View.GONE
                    viewmodelLoadGifViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelLoadGifGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x30020L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.showThumbnail
                        viewmodelShowThumbnail = viewmodel.getShowThumbnail();
                    }
                    updateLiveDataRegistration(5, viewmodelShowThumbnail);


                    if (viewmodelShowThumbnail != null) {
                        // read viewmodel.showThumbnail.getValue()
                        viewmodelShowThumbnailGetValue = viewmodelShowThumbnail.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showThumbnail.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelShowThumbnailGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelShowThumbnailGetValue);
                if((dirtyFlags & 0x30020L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewmodelShowThumbnailGetValue) {
                            dirtyFlags |= 0x800000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showThumbnail.getValue()) ? View.VISIBLE : View.GONE
                    viewmodelShowThumbnailViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelShowThumbnailGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x30040L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel._vidListSize
                        viewmodelVidListSize = viewmodel.get_vidListSize();
                    }
                    updateLiveDataRegistration(6, viewmodelVidListSize);


                    if (viewmodelVidListSize != null) {
                        // read viewmodel._vidListSize.getValue()
                        viewmodelVidListSizeGetValue = viewmodelVidListSize.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._vidListSize.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelVidListSizeGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelVidListSizeGetValue);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._vidListSize.getValue()) > 1
                    viewmodelVidListSizeInt1 = (androidxDatabindingViewDataBindingSafeUnboxViewmodelVidListSizeGetValue) > (1);
                if((dirtyFlags & 0x30040L) != 0) {
                    if(viewmodelVidListSizeInt1) {
                            dirtyFlags |= 0x20000000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._vidListSize.getValue()) > 1 ? View.VISIBLE : View.GONE
                    viewmodelVidListSizeInt1ViewVISIBLEViewGONE = ((viewmodelVidListSizeInt1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x30080L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.isVideoPaused
                        viewmodelIsVideoPaused = viewmodel.isVideoPaused();
                    }
                    updateLiveDataRegistration(7, viewmodelIsVideoPaused);


                    if (viewmodelIsVideoPaused != null) {
                        // read viewmodel.isVideoPaused.getValue()
                        viewmodelIsVideoPausedGetValue = viewmodelIsVideoPaused.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isVideoPaused.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelIsVideoPausedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelIsVideoPausedGetValue);
                if((dirtyFlags & 0x30080L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewmodelIsVideoPausedGetValue) {
                            dirtyFlags |= 0x80000000L;
                            dirtyFlags |= 0x800000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000L;
                            dirtyFlags |= 0x400000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isVideoPaused.getValue()) ? View.INVISIBLE : View.VISIBLE
                    viewmodelIsVideoPausedViewINVISIBLEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelIsVideoPausedGetValue) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isVideoPaused.getValue()) ? View.VISIBLE : View.GONE
                    viewmodelIsVideoPausedViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelIsVideoPausedGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x30100L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.urlImage
                        viewmodelUrlImage = viewmodel.getUrlImage();
                    }
                    updateLiveDataRegistration(8, viewmodelUrlImage);


                    if (viewmodelUrlImage != null) {
                        // read viewmodel.urlImage.getValue()
                        viewmodelUrlImageGetValue = viewmodelUrlImage.getValue();
                    }
            }
            if ((dirtyFlags & 0x30200L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.isProgressVisible
                        viewmodelIsProgressVisible = viewmodel.isProgressVisible();
                    }
                    updateLiveDataRegistration(9, viewmodelIsProgressVisible);


                    if (viewmodelIsProgressVisible != null) {
                        // read viewmodel.isProgressVisible.getValue()
                        viewmodelIsProgressVisibleGetValue = viewmodelIsProgressVisible.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isProgressVisible.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelIsProgressVisibleGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelIsProgressVisibleGetValue);
                if((dirtyFlags & 0x30200L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewmodelIsProgressVisibleGetValue) {
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isProgressVisible.getValue()) ? View.VISIBLE : View.GONE
                    viewmodelIsProgressVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelIsProgressVisibleGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x30400L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.isSecondaryPlayFlag
                        viewmodelIsSecondaryPlayFlag = viewmodel.isSecondaryPlayFlag();
                    }
                    updateLiveDataRegistration(10, viewmodelIsSecondaryPlayFlag);


                    if (viewmodelIsSecondaryPlayFlag != null) {
                        // read viewmodel.isSecondaryPlayFlag.getValue()
                        viewmodelIsSecondaryPlayFlagGetValue = viewmodelIsSecondaryPlayFlag.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isSecondaryPlayFlag.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelIsSecondaryPlayFlagGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelIsSecondaryPlayFlagGetValue);
                if((dirtyFlags & 0x30400L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewmodelIsSecondaryPlayFlagGetValue) {
                            dirtyFlags |= 0x200000000L;
                            dirtyFlags |= 0x200000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000L;
                            dirtyFlags |= 0x100000000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isSecondaryPlayFlag.getValue()) ? @android:drawable/ic_exo_play : @android:drawable/ic_video_play
                    viewmodelIsSecondaryPlayFlagPlayerPlay1AndroidDrawableIcExoPlayPlayerPlay1AndroidDrawableIcVideoPlay = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelIsSecondaryPlayFlagGetValue) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(playerPlay1.getContext(), R.drawable.ic_exo_play)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(playerPlay1.getContext(), R.drawable.ic_video_play)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isSecondaryPlayFlag.getValue()) ? @android:drawable/ic_exo_play : @android:drawable/ic_video_play
                    viewmodelIsSecondaryPlayFlagPlayerPlayAndroidDrawableIcExoPlayPlayerPlayAndroidDrawableIcVideoPlay = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelIsSecondaryPlayFlagGetValue) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(playerPlay.getContext(), R.drawable.ic_exo_play)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(playerPlay.getContext(), R.drawable.ic_video_play)));
            }
            if ((dirtyFlags & 0x30800L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel._currentTitle
                        viewmodelCurrentTitle = viewmodel.get_currentTitle();
                    }
                    updateLiveDataRegistration(11, viewmodelCurrentTitle);


                    if (viewmodelCurrentTitle != null) {
                        // read viewmodel._currentTitle.getValue()
                        viewmodelCurrentTitleGetValue = viewmodelCurrentTitle.getValue();
                    }
            }
            if ((dirtyFlags & 0x31000L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.streamingDuration
                        viewmodelStreamingDuration = viewmodel.getStreamingDuration();
                    }
                    updateLiveDataRegistration(12, viewmodelStreamingDuration);


                    if (viewmodelStreamingDuration != null) {
                        // read viewmodel.streamingDuration.getValue()
                        viewmodelStreamingDurationGetValue = viewmodelStreamingDuration.getValue();
                    }


                    // read (viewmodel.streamingDuration.getValue()) + ("/")
                    viewmodelStreamingDurationJavaLangString = (viewmodelStreamingDurationGetValue) + ("/");
            }
            if ((dirtyFlags & 0x32000L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.dtoVideos
                        viewmodelDtoVideos = viewmodel.getDtoVideos();
                    }
                    updateLiveDataRegistration(13, viewmodelDtoVideos);


                    if (viewmodelDtoVideos != null) {
                        // read viewmodel.dtoVideos.getValue()
                        viewmodelDtoVideosGetValue = viewmodelDtoVideos.getValue();
                    }
            }
            if ((dirtyFlags & 0x38000L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.playingNextTitle
                        viewmodelPlayingNextTitle = viewmodel.getPlayingNextTitle();
                    }
                    updateLiveDataRegistration(15, viewmodelPlayingNextTitle);


                    if (viewmodelPlayingNextTitle != null) {
                        // read viewmodel.playingNextTitle.getValue()
                        viewmodelPlayingNextTitleGetValue = viewmodelPlayingNextTitle.getValue();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x80000L) != 0) {

                if (viewmodel != null) {
                    // read viewmodel.showHorizontalList
                    viewmodelShowHorizontalList = viewmodel.getShowHorizontalList();
                }
                updateLiveDataRegistration(14, viewmodelShowHorizontalList);


                if (viewmodelShowHorizontalList != null) {
                    // read viewmodel.showHorizontalList.getValue()
                    viewmodelShowHorizontalListGetValue = viewmodelShowHorizontalList.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showHorizontalList.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewmodelShowHorizontalListGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelShowHorizontalListGetValue);
        }

        if ((dirtyFlags & 0x34008L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isFullScreen.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showHorizontalList.getValue()) : false
                viewmodelIsFullScreenViewmodelShowHorizontalListBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelIsFullScreenGetValue) ? (androidxDatabindingViewDataBindingSafeUnboxViewmodelShowHorizontalListGetValue) : (false));
            if((dirtyFlags & 0x34008L) != 0) {
                if(viewmodelIsFullScreenViewmodelShowHorizontalListBooleanFalse) {
                        dirtyFlags |= 0x20000000L;
                        dirtyFlags |= 0x80000000000000L;
                }
                else {
                        dirtyFlags |= 0x10000000L;
                        dirtyFlags |= 0x40000000000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isFullScreen.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showHorizontalList.getValue()) : false ? View.GONE : View.VISIBLE
                viewmodelIsFullScreenViewmodelShowHorizontalListBooleanFalseViewGONEViewVISIBLE = ((viewmodelIsFullScreenViewmodelShowHorizontalListBooleanFalse) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isFullScreen.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showHorizontalList.getValue()) : false ? View.VISIBLE : View.GONE
                viewmodelIsFullScreenViewmodelShowHorizontalListBooleanFalseViewVISIBLEViewGONE = ((viewmodelIsFullScreenViewmodelShowHorizontalListBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x30080L) != 0) {
            // api target 1

            this.appCompatImageView18.setVisibility(viewmodelIsVideoPausedViewVISIBLEViewGONE);
            this.mboundView7.setVisibility(viewmodelIsVideoPausedViewVISIBLEViewGONE);
            this.playerView.setVisibility(viewmodelIsVideoPausedViewINVISIBLEViewVISIBLE);
        }
        if ((dirtyFlags & 0x20000L) != 0) {
            // api target 1

            this.btnViewAll.setOnClickListener(mCallback56);
            this.ivBack.setOnClickListener(mCallback45);
            this.ivClose.setOnClickListener(mCallback53);
            this.ivFullScreen.setOnClickListener(mCallback50);
            this.playerForward.setOnClickListener(mCallback49);
            this.playerForward1.setOnClickListener(mCallback55);
            this.playerPlay.setOnClickListener(mCallback48);
            this.playerPlay1.setOnClickListener(mCallback54);
            this.tvEnglish.setOnClickListener(mCallback47);
            this.tvEnglish1.setOnClickListener(mCallback52);
            this.tvHindi.setOnClickListener(mCallback46);
            this.tvHindi1.setOnClickListener(mCallback51);
        }
        if ((dirtyFlags & 0x30008L) != 0) {
            // api target 1

            this.clToolbar.setVisibility(viewmodelIsFullScreenViewGONEViewVISIBLE);
            this.gpPlayList.setVisibility(viewmodelIsFullScreenViewGONEViewVISIBLE);
            this.ivClose.setVisibility(viewmodelIsFullScreenViewVISIBLEViewGONE);
            this.toggleButton1.setVisibility(viewmodelIsFullScreenViewVISIBLEViewGONE);
            this.tvTitle2.setVisibility(viewmodelIsFullScreenViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x34008L) != 0) {
            // api target 1

            this.gpBottomPlayList.setVisibility(viewmodelIsFullScreenViewmodelShowHorizontalListBooleanFalseViewVISIBLEViewGONE);
            this.llControllers.setVisibility(viewmodelIsFullScreenViewmodelShowHorizontalListBooleanFalseViewGONEViewVISIBLE);
            this.tvPlayingNext.setVisibility(viewmodelIsFullScreenViewmodelShowHorizontalListBooleanFalseViewVISIBLEViewGONE);
            this.tvTextPlayingNext.setVisibility(viewmodelIsFullScreenViewmodelShowHorizontalListBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x30040L) != 0) {
            // api target 1

            this.ivFullScreen.setVisibility(viewmodelVidListSizeInt1ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x30020L) != 0) {
            // api target 1

            this.ivThumbnail.setVisibility(viewmodelShowThumbnailViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x30100L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.VideoBindingAdapterP2.setThumbnailUrl(this.ivThumbnail, viewmodelUrlImageGetValue);
        }
        if ((dirtyFlags & 0x30010L) != 0) {
            // api target 1

            this.loadingGIF.setVisibility(viewmodelLoadGifViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x30001L) != 0) {
            // api target 1

            this.pbLoading.setVisibility(viewmodelIsLoadingDataViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x30400L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.playerPlay, viewmodelIsSecondaryPlayFlagPlayerPlayAndroidDrawableIcExoPlayPlayerPlayAndroidDrawableIcVideoPlay);
            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.playerPlay1, viewmodelIsSecondaryPlayFlagPlayerPlay1AndroidDrawableIcExoPlayPlayerPlay1AndroidDrawableIcVideoPlay);
        }
        if ((dirtyFlags & 0x30200L) != 0) {
            // api target 1

            this.progressBar2.setVisibility(viewmodelIsProgressVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x32000L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.VideoBindingAdapterP2.setVideosList(this.rvVideoList, viewmodelDtoVideosGetValue, viewmodel);
            com.intellihealth.truemeds.presentation.bindingadapter.VideoBindingAdapterP2.setVerticalVideosList(this.rvVideoListVertical, viewmodelDtoVideosGetValue, viewmodel);
        }
        if ((dirtyFlags & 0x30004L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.tvEnglish, viewmodelIsHindiSelectedJavaLangObjectNullTvEnglishAndroidDrawableBgVideoLanguageSelected);
            this.tvEnglish.setTextColor(viewmodelIsHindiSelectedTvEnglishAndroidColorTextColorEnSelectedTvEnglishAndroidColorWhite);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.tvEnglish1, viewmodelIsHindiSelectedJavaLangObjectNullTvEnglish1AndroidDrawableBgVideoLanguageSelected);
            this.tvEnglish1.setTextColor(viewmodelIsHindiSelectedTvEnglish1AndroidColorTextColorEnSelectedTvEnglish1AndroidColorWhite);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.tvHindi, viewmodelIsHindiSelectedTvHindiAndroidDrawableBgVideoLanguageSelectedJavaLangObjectNull);
            this.tvHindi.setTextColor(viewmodelIsHindiSelectedTvHindiAndroidColorWhiteTvHindiAndroidColorTextColorEnSelected);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.tvHindi1, viewmodelIsHindiSelectedTvHindi1AndroidDrawableBgVideoLanguageSelectedJavaLangObjectNull);
            this.tvHindi1.setTextColor(viewmodelIsHindiSelectedTvHindi1AndroidColorWhiteTvHindi1AndroidColorTextColorEnSelected);
        }
        if ((dirtyFlags & 0x38000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPlayingNext, viewmodelPlayingNextTitleGetValue);
        }
        if ((dirtyFlags & 0x30800L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSaveMoney, viewmodelCurrentTitleGetValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle2, viewmodelCurrentTitleGetValue);
        }
        if ((dirtyFlags & 0x31000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvVideoCurrentTime, viewmodelStreamingDurationJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvVideoCurrentTime1, viewmodelStreamingDurationJavaLangString);
        }
        if ((dirtyFlags & 0x30002L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvVideoDuration, viewmodelCurrentDurationGetValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvVideoDuration1, viewmodelCurrentDurationGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 11: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.onPlayerForward();
                }
                break;
            }
            case 12: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.onFullScreenClick();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.onPlayerForward();
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.onLanguageChange(false);
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.onPlayerPlay();
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.onCloseClick();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.onLanguageChange(false);
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.onFullScreenClick();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.onPlayerPlay();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.onLanguageChange(true);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.onBackButtonClick();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.onLanguageChange(true);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.isLoadingData
        flag 1 (0x2L): viewmodel._currentDuration
        flag 2 (0x3L): viewmodel._isHindiSelected
        flag 3 (0x4L): viewmodel.isFullScreen
        flag 4 (0x5L): viewmodel.loadGif
        flag 5 (0x6L): viewmodel.showThumbnail
        flag 6 (0x7L): viewmodel._vidListSize
        flag 7 (0x8L): viewmodel.isVideoPaused
        flag 8 (0x9L): viewmodel.urlImage
        flag 9 (0xaL): viewmodel.isProgressVisible
        flag 10 (0xbL): viewmodel.isSecondaryPlayFlag
        flag 11 (0xcL): viewmodel._currentTitle
        flag 12 (0xdL): viewmodel.streamingDuration
        flag 13 (0xeL): viewmodel.dtoVideos
        flag 14 (0xfL): viewmodel.showHorizontalList
        flag 15 (0x10L): viewmodel.playingNextTitle
        flag 16 (0x11L): viewmodel
        flag 17 (0x12L): null
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isFullScreen.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showHorizontalList.getValue()) : false
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isFullScreen.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showHorizontalList.getValue()) : false
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._isHindiSelected.getValue()) ? @android:color/text_color_en_selected : @android:color/white
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._isHindiSelected.getValue()) ? @android:color/text_color_en_selected : @android:color/white
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._isHindiSelected.getValue()) ? @android:drawable/bg_video_language_selected : null
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._isHindiSelected.getValue()) ? @android:drawable/bg_video_language_selected : null
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isProgressVisible.getValue()) ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isProgressVisible.getValue()) ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._isHindiSelected.getValue()) ? @android:drawable/bg_video_language_selected : null
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._isHindiSelected.getValue()) ? @android:drawable/bg_video_language_selected : null
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isFullScreen.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showHorizontalList.getValue()) : false ? View.GONE : View.VISIBLE
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isFullScreen.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showHorizontalList.getValue()) : false ? View.GONE : View.VISIBLE
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isVideoPaused.getValue()) ? View.INVISIBLE : View.VISIBLE
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isVideoPaused.getValue()) ? View.INVISIBLE : View.VISIBLE
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isSecondaryPlayFlag.getValue()) ? @android:drawable/ic_exo_play : @android:drawable/ic_video_play
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isSecondaryPlayFlag.getValue()) ? @android:drawable/ic_exo_play : @android:drawable/ic_video_play
        flag 34 (0x23L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isVideoPaused.getValue()) ? View.VISIBLE : View.GONE
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isVideoPaused.getValue()) ? View.VISIBLE : View.GONE
        flag 36 (0x25L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._isHindiSelected.getValue()) ? null : @android:drawable/bg_video_language_selected
        flag 37 (0x26L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._isHindiSelected.getValue()) ? null : @android:drawable/bg_video_language_selected
        flag 38 (0x27L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._isHindiSelected.getValue()) ? @android:color/white : @android:color/text_color_en_selected
        flag 39 (0x28L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._isHindiSelected.getValue()) ? @android:color/white : @android:color/text_color_en_selected
        flag 40 (0x29L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._vidListSize.getValue()) > 1 ? View.VISIBLE : View.GONE
        flag 41 (0x2aL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._vidListSize.getValue()) > 1 ? View.VISIBLE : View.GONE
        flag 42 (0x2bL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._isHindiSelected.getValue()) ? @android:color/white : @android:color/text_color_en_selected
        flag 43 (0x2cL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._isHindiSelected.getValue()) ? @android:color/white : @android:color/text_color_en_selected
        flag 44 (0x2dL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isFullScreen.getValue()) ? View.GONE : View.VISIBLE
        flag 45 (0x2eL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isFullScreen.getValue()) ? View.GONE : View.VISIBLE
        flag 46 (0x2fL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._isHindiSelected.getValue()) ? @android:color/text_color_en_selected : @android:color/white
        flag 47 (0x30L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._isHindiSelected.getValue()) ? @android:color/text_color_en_selected : @android:color/white
        flag 48 (0x31L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isFullScreen.getValue()) ? View.VISIBLE : View.GONE
        flag 49 (0x32L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isFullScreen.getValue()) ? View.VISIBLE : View.GONE
        flag 50 (0x33L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._isHindiSelected.getValue()) ? null : @android:drawable/bg_video_language_selected
        flag 51 (0x34L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel._isHindiSelected.getValue()) ? null : @android:drawable/bg_video_language_selected
        flag 52 (0x35L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.loadGif.getValue()) ? View.VISIBLE : View.GONE
        flag 53 (0x36L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.loadGif.getValue()) ? View.VISIBLE : View.GONE
        flag 54 (0x37L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isFullScreen.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showHorizontalList.getValue()) : false ? View.VISIBLE : View.GONE
        flag 55 (0x38L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isFullScreen.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showHorizontalList.getValue()) : false ? View.VISIBLE : View.GONE
        flag 56 (0x39L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isSecondaryPlayFlag.getValue()) ? @android:drawable/ic_exo_play : @android:drawable/ic_video_play
        flag 57 (0x3aL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isSecondaryPlayFlag.getValue()) ? @android:drawable/ic_exo_play : @android:drawable/ic_video_play
        flag 58 (0x3bL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showThumbnail.getValue()) ? View.VISIBLE : View.GONE
        flag 59 (0x3cL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.showThumbnail.getValue()) ? View.VISIBLE : View.GONE
        flag 60 (0x3dL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isLoadingData.getValue()) ? View.VISIBLE : View.GONE
        flag 61 (0x3eL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isLoadingData.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}