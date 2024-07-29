package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b*\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b8\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0091\u0001\u001a\u00020^H\u0002J\u0007\u0010\u0092\u0001\u001a\u00020^J\u0007\u0010\u0093\u0001\u001a\u00020^J\u0007\u0010\u0094\u0001\u001a\u00020^J\u0007\u0010\u0095\u0001\u001a\u00020^J\u0010\u0010\u0096\u0001\u001a\u00020^2\u0007\u0010\u0097\u0001\u001a\u00020\u0011J-\u0010\u0098\u0001\u001a\u00020^2\t\u0010\u0099\u0001\u001a\u0004\u0018\u00010q2\u0007\u0010\u009a\u0001\u001a\u00020\u00152\u0007\u0010\u009b\u0001\u001a\u00020\u00112\u0007\u0010\u009c\u0001\u001a\u00020\u0011J&\u0010\u009d\u0001\u001a\u00020^2\t\u0010\u0099\u0001\u001a\u0004\u0018\u00010q2\u0007\u0010\u009a\u0001\u001a\u00020\u00152\u0007\u0010\u009b\u0001\u001a\u00020\u0011H\u0002J\u0007\u0010\u009e\u0001\u001a\u00020^J\u0007\u0010\u009f\u0001\u001a\u00020^J\u0012\u0010\u00a0\u0001\u001a\u00020^2\t\u0010\u0099\u0001\u001a\u0004\u0018\u00010qJ\u0012\u0010\u00a1\u0001\u001a\u00020^2\t\u0010\u0099\u0001\u001a\u0004\u0018\u00010qJ\u0010\u0010\u00a2\u0001\u001a\u00020^2\u0007\u0010\u00a3\u0001\u001a\u00020\u0007J\u0012\u0010\u00a4\u0001\u001a\u00020^2\t\u0010\u0099\u0001\u001a\u0004\u0018\u00010qJ\u001b\u0010\u00a5\u0001\u001a\u00020^2\t\u0010\u0099\u0001\u001a\u0004\u0018\u00010q2\u0007\u0010\u00a3\u0001\u001a\u00020\u0007J\u0012\u0010\u00a6\u0001\u001a\u00020^2\t\u0010\u0099\u0001\u001a\u0004\u0018\u00010qJ\u0007\u0010\u00a7\u0001\u001a\u00020^J\t\u0010\u00a8\u0001\u001a\u00020^H\u0002R(\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\r\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR(\u0010\u0010\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00110\u00110\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\fR(\u0010\u0014\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00150\u00150\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\fR\"\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR&\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\n\"\u0004\b$\u0010\fR\u001d\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0&0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\nR\u001d\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0&0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\nR\u001d\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0&0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\nR\u001d\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0&0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\nR\u001d\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0&0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\nR\u001d\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0&0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\nR\u001d\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0&0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\nR\u001d\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0&0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\nR\u001d\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0&0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\nR\u001d\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0&0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\nR\u001d\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0&0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\nR\u001d\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0&0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010?\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00110\u00110\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\n\"\u0004\b@\u0010\fR(\u0010A\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00110\u00110\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\n\"\u0004\bB\u0010\fR\"\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\n\"\u0004\bD\u0010\fR\u001a\u0010E\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR(\u0010I\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00110\u00110\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\n\"\u0004\bJ\u0010\fR(\u0010K\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00110\u00110\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\n\"\u0004\bL\u0010\fR(\u0010M\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00110\u00110\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\n\"\u0004\bN\u0010\fR(\u0010O\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00110\u00110\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\n\"\u0004\bP\u0010\fR \u0010Q\u001a\b\u0012\u0004\u0012\u00020\"0RX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR(\u0010W\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00110\u00110\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\n\"\u0004\bY\u0010\fR(\u0010Z\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00110\u00110\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\n\"\u0004\b\\\u0010\fR\u0011\u0010]\u001a\u00020^8F\u00a2\u0006\u0006\u001a\u0004\b_\u0010`R\u0011\u0010a\u001a\u00020^8F\u00a2\u0006\u0006\u001a\u0004\bb\u0010`R\u001a\u0010c\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u001d\"\u0004\be\u0010\u001fR(\u0010f\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010g0g0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\n\"\u0004\bi\u0010\fR(\u0010j\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010\n\"\u0004\bl\u0010\fR\u001a\u0010m\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bn\u0010\u001d\"\u0004\bo\u0010\u001fR\u001c\u0010p\u001a\u0004\u0018\u00010qX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR(\u0010v\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00110\u00110\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bw\u0010\n\"\u0004\bx\u0010\fR(\u0010y\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00110\u00110\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bz\u0010\n\"\u0004\b{\u0010\fR(\u0010|\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00110\u00110\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b}\u0010\n\"\u0004\b~\u0010\fR*\u0010\u007f\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010\n\"\u0005\b\u0081\u0001\u0010\fR+\u0010\u0082\u0001\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010g0g0\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010\n\"\u0005\b\u0084\u0001\u0010\fR\u001d\u0010\u0085\u0001\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010\u001d\"\u0005\b\u0087\u0001\u0010\u001fR%\u0010\u0088\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010\n\"\u0005\b\u008a\u0001\u0010\fR\u0016\u0010\u008b\u0001\u001a\u00020^8BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010`R+\u0010\u008d\u0001\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010\n\"\u0005\b\u008f\u0001\u0010\fR\u0017\u0010\u0090\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010q0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00a9\u0001"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/VideoViewModel;", "Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModel;", "homePageUseCase", "Lcom/intellihealth/truemeds/domain/usecase/HomePageUseCase;", "(Lcom/intellihealth/truemeds/domain/usecase/HomePageUseCase;)V", "_currentDuration", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "get_currentDuration", "()Landroidx/lifecycle/MutableLiveData;", "set_currentDuration", "(Landroidx/lifecycle/MutableLiveData;)V", "_currentTitle", "get_currentTitle", "set_currentTitle", "_isHindiSelected", "", "get_isHindiSelected", "set_isHindiSelected", "_vidListSize", "", "get_vidListSize", "set_vidListSize", "_video", "get_video", "set_video", "currentPlayingPosition", "getCurrentPlayingPosition", "()I", "setCurrentPlayingPosition", "(I)V", "dtoVideos", "", "Lcom/intellihealth/truemeds/data/model/home/VideoFaqAllResponse$Video;", "getDtoVideos", "setDtoVideos", "errorMessage", "Lcom/intellihealth/truemeds/presentation/utils/Event;", "", "getErrorMessage", "eventClearVideoTime", "getEventClearVideoTime", "eventDiscardDelayHandler", "getEventDiscardDelayHandler", "eventErrorToast", "getEventErrorToast", "eventIvFullScreenClick", "getEventIvFullScreenClick", "eventOnBackButtonClick", "getEventOnBackButtonClick", "eventOnCloseClick", "getEventOnCloseClick", "eventOnPlayerForward", "getEventOnPlayerForward", "eventOnPlayerPlay", "getEventOnPlayerPlay", "eventRecordVideoTime", "getEventRecordVideoTime", "eventScrollToPosition", "getEventScrollToPosition", "eventTriggerPlayedEvent", "getEventTriggerPlayedEvent", "isFullScreen", "setFullScreen", "isHomeScreenVideo", "setHomeScreenVideo", "isLandscapeSelected", "setLandscapeSelected", "isListItemClicked", "()Z", "setListItemClicked", "(Z)V", "isLoadingData", "setLoadingData", "isProgressVisible", "setProgressVisible", "isSecondaryPlayFlag", "setSecondaryPlayFlag", "isVideoPaused", "setVideoPaused", "list", "", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "loadGif", "getLoadGif", "setLoadGif", "lockDefaultView", "getLockDefaultView", "setLockDefaultView", "nextTitle", "", "getNextTitle", "()Lkotlin/Unit;", "nextVideo", "getNextVideo", "playNext", "getPlayNext", "setPlayNext", "playerLastRecordedTime", "", "getPlayerLastRecordedTime", "setPlayerLastRecordedTime", "playingNextTitle", "getPlayingNextTitle", "setPlayingNextTitle", "previousPosition", "getPreviousPosition", "setPreviousPosition", "selectedModel", "Lcom/intellihealth/truemeds/data/model/home/VideoFaqAllResponse$Video$VideoUrl;", "getSelectedModel", "()Lcom/intellihealth/truemeds/data/model/home/VideoFaqAllResponse$Video$VideoUrl;", "setSelectedModel", "(Lcom/intellihealth/truemeds/data/model/home/VideoFaqAllResponse$Video$VideoUrl;)V", "showController", "getShowController", "setShowController", "showHorizontalList", "getShowHorizontalList", "setShowHorizontalList", "showThumbnail", "getShowThumbnail", "setShowThumbnail", "streamingDuration", "getStreamingDuration", "setStreamingDuration", "streamingDurationMXP", "getStreamingDurationMXP", "setStreamingDurationMXP", "totalPlayTimeMXP", "getTotalPlayTimeMXP", "setTotalPlayTimeMXP", "urlImage", "getUrlImage", "setUrlImage", "videoApi", "getVideoApi", "videoSource", "getVideoSource", "setVideoSource", "videoUrl", "clearLists", "highlightNextVideo", "onBackButtonClick", "onCloseClick", "onFullScreenClick", "onLanguageChange", "selection", "onPlayListSelected", "item", "position", "fromOrientation", "fromTray", "onPlaySelected", "onPlayerForward", "onPlayerPlay", "sendVideoCompletedEvent", "sendVideoContinueEvent", "sendVideoEventToMixpanel", "source", "sendVideoPausedEvent", "sendVideoPlayedEvent", "sendVideoPlayerClosedEvent", "setPreviousToNext", "videos", "app_prodDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class VideoViewModel extends com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.HomePageUseCase homePageUseCase = null;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse.Video.VideoUrl selectedModel;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse.Video.VideoUrl> videoUrl;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoadingData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse.Video>> dtoVideos;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> _video;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLandscapeSelected;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> _currentTitle;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> videoSource;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> _currentDuration;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> streamingDuration;
    private int playNext = 0;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> _vidListSize;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse.Video> list;
    private boolean isListItemClicked = false;
    private int currentPlayingPosition = 0;
    private int totalPlayTimeMXP = 0;
    private int previousPosition = 0;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isHindiSelected;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Long> playerLastRecordedTime;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Long> streamingDurationMXP;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isFullScreen;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> lockDefaultView;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isVideoPaused;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> loadGif;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showThumbnail;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSecondaryPlayFlag;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> urlImage;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isHomeScreenVideo;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showHorizontalList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isProgressVisible;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showController;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> playingNextTitle;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.utils.Event<java.lang.Object>> eventErrorToast = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.utils.Event<java.lang.Object>> eventRecordVideoTime = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.utils.Event<java.lang.Object>> eventClearVideoTime = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.utils.Event<java.lang.Object>> errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.utils.Event<java.lang.Object>> eventIvFullScreenClick = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.utils.Event<java.lang.Object>> eventOnBackButtonClick = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.utils.Event<java.lang.Object>> eventOnCloseClick = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.utils.Event<java.lang.Object>> eventOnPlayerForward = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.utils.Event<java.lang.Object>> eventOnPlayerPlay = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.utils.Event<java.lang.Object>> eventDiscardDelayHandler = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.utils.Event<java.lang.Object>> eventScrollToPosition = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.utils.Event<java.lang.Object>> eventTriggerPlayedEvent = null;
    
    @javax.inject.Inject()
    public VideoViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.HomePageUseCase homePageUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse.Video.VideoUrl getSelectedModel() {
        return null;
    }
    
    public final void setSelectedModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse.Video.VideoUrl p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoadingData() {
        return null;
    }
    
    public final void setLoadingData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse.Video>> getDtoVideos() {
        return null;
    }
    
    public final void setDtoVideos(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse.Video>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> get_video() {
        return null;
    }
    
    public final void set_video(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLandscapeSelected() {
        return null;
    }
    
    public final void setLandscapeSelected(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> get_currentTitle() {
        return null;
    }
    
    public final void set_currentTitle(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getVideoSource() {
        return null;
    }
    
    public final void setVideoSource(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> get_currentDuration() {
        return null;
    }
    
    public final void set_currentDuration(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getStreamingDuration() {
        return null;
    }
    
    public final void setStreamingDuration(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final int getPlayNext() {
        return 0;
    }
    
    public final void setPlayNext(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> get_vidListSize() {
        return null;
    }
    
    public final void set_vidListSize(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse.Video> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse.Video> p0) {
    }
    
    public final boolean isListItemClicked() {
        return false;
    }
    
    public final void setListItemClicked(boolean p0) {
    }
    
    public final int getCurrentPlayingPosition() {
        return 0;
    }
    
    public final void setCurrentPlayingPosition(int p0) {
    }
    
    public final int getTotalPlayTimeMXP() {
        return 0;
    }
    
    public final void setTotalPlayTimeMXP(int p0) {
    }
    
    public final int getPreviousPosition() {
        return 0;
    }
    
    public final void setPreviousPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> get_isHindiSelected() {
        return null;
    }
    
    public final void set_isHindiSelected(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Long> getPlayerLastRecordedTime() {
        return null;
    }
    
    public final void setPlayerLastRecordedTime(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Long> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Long> getStreamingDurationMXP() {
        return null;
    }
    
    public final void setStreamingDurationMXP(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Long> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isFullScreen() {
        return null;
    }
    
    public final void setFullScreen(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLockDefaultView() {
        return null;
    }
    
    public final void setLockDefaultView(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isVideoPaused() {
        return null;
    }
    
    public final void setVideoPaused(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoadGif() {
        return null;
    }
    
    public final void setLoadGif(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowThumbnail() {
        return null;
    }
    
    public final void setShowThumbnail(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSecondaryPlayFlag() {
        return null;
    }
    
    public final void setSecondaryPlayFlag(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getUrlImage() {
        return null;
    }
    
    public final void setUrlImage(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isHomeScreenVideo() {
        return null;
    }
    
    public final void setHomeScreenVideo(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowHorizontalList() {
        return null;
    }
    
    public final void setShowHorizontalList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isProgressVisible() {
        return null;
    }
    
    public final void setProgressVisible(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowController() {
        return null;
    }
    
    public final void setShowController(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPlayingNextTitle() {
        return null;
    }
    
    public final void setPlayingNextTitle(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.utils.Event<java.lang.Object>> getEventErrorToast() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.utils.Event<java.lang.Object>> getEventRecordVideoTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.utils.Event<java.lang.Object>> getEventClearVideoTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.utils.Event<java.lang.Object>> getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.utils.Event<java.lang.Object>> getEventIvFullScreenClick() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.utils.Event<java.lang.Object>> getEventOnBackButtonClick() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.utils.Event<java.lang.Object>> getEventOnCloseClick() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.utils.Event<java.lang.Object>> getEventOnPlayerForward() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.utils.Event<java.lang.Object>> getEventOnPlayerPlay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.utils.Event<java.lang.Object>> getEventDiscardDelayHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.utils.Event<java.lang.Object>> getEventScrollToPosition() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.utils.Event<java.lang.Object>> getEventTriggerPlayedEvent() {
        return null;
    }
    
    private final void videos() {
    }
    
    private final void clearLists() {
    }
    
    private final kotlin.Unit getVideoApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Unit getNextVideo() {
        return null;
    }
    
    public final void onPlayListSelected(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse.Video.VideoUrl item, int position, boolean fromOrientation, boolean fromTray) {
    }
    
    private final void onPlaySelected(com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse.Video.VideoUrl item, int position, boolean fromOrientation) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Unit getNextTitle() {
        return null;
    }
    
    public final void onLanguageChange(boolean selection) {
    }
    
    public final void setPreviousToNext() {
    }
    
    public final void onFullScreenClick() {
    }
    
    public final void onBackButtonClick() {
    }
    
    public final void onCloseClick() {
    }
    
    public final void onPlayerForward() {
    }
    
    public final void onPlayerPlay() {
    }
    
    public final void highlightNextVideo() {
    }
    
    public final void sendVideoPlayedEvent(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse.Video.VideoUrl item, @org.jetbrains.annotations.NotNull()
    java.lang.String source) {
    }
    
    public final void sendVideoContinueEvent(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse.Video.VideoUrl item) {
    }
    
    public final void sendVideoCompletedEvent(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse.Video.VideoUrl item) {
    }
    
    public final void sendVideoPlayerClosedEvent(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse.Video.VideoUrl item) {
    }
    
    public final void sendVideoPausedEvent(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse.Video.VideoUrl item) {
    }
    
    public final void sendVideoEventToMixpanel(@org.jetbrains.annotations.NotNull()
    java.lang.String source) {
    }
}