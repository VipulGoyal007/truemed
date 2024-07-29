package com.intellihealth.truemeds.presentation.viewmodel

import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse.Video
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.mixpanel.MxVideoPlayed
import com.intellihealth.truemeds.domain.usecase.HomePageUseCase
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxCommonProperty
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxVideoContinued
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxVideoPaused
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class VideoViewModel @Inject constructor(
    private val homePageUseCase: HomePageUseCase
) : BaseViewModel() {

    var selectedModel: Video.VideoUrl? = null
    private var videoUrl: MutableLiveData<Video.VideoUrl?> = MutableLiveData(null)
    var isLoadingData = MutableLiveData(true)
    var dtoVideos: MutableLiveData<List<Video>> = MutableLiveData<List<Video>>(emptyList<Video>())
    var _video = MutableLiveData<String?>(null)
    var isLandscapeSelected = MutableLiveData<Boolean?>(null)
    var _currentTitle = MutableLiveData("")
    var videoSource = MutableLiveData("")
    var _currentDuration = MutableLiveData("0:00")
    var streamingDuration = MutableLiveData("0:00")
    var playNext = 0
    var _vidListSize = MutableLiveData(0)
    var list: MutableList<Video> = ArrayList<Video>()
    var isListItemClicked = false
    var currentPlayingPosition = 0
    var totalPlayTimeMXP = 0
    var previousPosition = 0
    var _isHindiSelected = MutableLiveData(true)
    var playerLastRecordedTime = MutableLiveData(0L)
    var streamingDurationMXP = MutableLiveData(0L)
    var isFullScreen = MutableLiveData(false)
    var lockDefaultView = MutableLiveData(false)
    var isVideoPaused = MutableLiveData(false)
    var loadGif = MutableLiveData(false)
    var showThumbnail = MutableLiveData(true)
    var isSecondaryPlayFlag = MutableLiveData(false)
    var urlImage = MutableLiveData<String?>(null)
    var isHomeScreenVideo = MutableLiveData(true)
    var showHorizontalList = MutableLiveData(false)
    var isProgressVisible = MutableLiveData(true)
    var showController = MutableLiveData(false)
    var playingNextTitle = MutableLiveData("")

    val eventErrorToast = MutableLiveData<Event<Any>>()
    val eventRecordVideoTime = MutableLiveData<Event<Any>>()
    val eventClearVideoTime = MutableLiveData<Event<Any>>()
    val errorMessage = MutableLiveData<Event<Any>>()
    val eventIvFullScreenClick = MutableLiveData<Event<Any>>()
    val eventOnBackButtonClick = MutableLiveData<Event<Any>>()
    val eventOnCloseClick = MutableLiveData<Event<Any>>()
    val eventOnPlayerForward = MutableLiveData<Event<Any>>()
    val eventOnPlayerPlay = MutableLiveData<Event<Any>>()
    val eventDiscardDelayHandler = MutableLiveData<Event<Any>>()
    val eventScrollToPosition = MutableLiveData<Event<Any>>()
    val eventTriggerPlayedEvent = MutableLiveData<Event<Any>>()

    init {
        videos()
    }

    private fun videos() = videoApi

    //note :- clear list prior api call
    private fun clearLists() {
        list.clear()
        dtoVideos.postValue(list)
    }

    private val videoApi: Unit
        get() {
            viewModelScope.launch {
                val response = homePageUseCase.getVideoFaq(MxInternalErrorOccurred(),"0", "50", "app") ?: return@launch
                clearLists()
                isLoadingData.postValue(false)

                if (response.responseData?.data != null) {
                    response.responseData?.data.let { dtoVideos.postValue(it) }
                    list.addAll(response.responseData?.data ?: emptyList())
                    _vidListSize.postValue((response.responseData?.data ?: emptyList()).size)

                } else {
                    isLoadingData.postValue(false)
                }

            }
        }

    /*val videoApi: Unit
        //note :- video from api
        get() {
            val dashboardApi: DashboardApi = Constants.getComponent(getApplication()).dashboardApi()
            dashboardApi.fetchVideo(
                "application/json",  *//*SharedPrefManager.getInstance().getLoggedInUserAccessToken(),*//* //note :-api is open no token is needed here
                "0",
                "50",
                "app"
            ).enqueue(object : Callback<ResponseBody?> {
                override fun onResponse(
                    call: Call<ResponseBody?>,
                    response: Response<ResponseBody?>
                ) {
                    if (response.isSuccessful) {
                        try {
                            var videoList: ArrayList<VideoUrl?>
                            clearLists()
                            isLoadingData.postValue(false)

                            //note :- real response api
                            val lastKnownResponse: JSONObject =
                                Constants.getJsonResponseFromRaw(response) ?: return

                            //note :- for testing comment this
                            //JSONObject lastKnownResponse = new JSONObject(loadJSONFromAsset());
                            val options = lastKnownResponse.getJSONArray("data")
                            for (i in 0 until options.length()) {
                                videoList = ArrayList<VideoUrl?>()
                                var categoryId = 0
                                if (options.getJSONObject(i)["categoryId"] is Int) {
                                    categoryId =
                                        options.getJSONObject(i)["categoryId"].toString().toInt()
                                    val urlArray =
                                        options.getJSONObject(i).getJSONArray("video_url")
                                    for (j in 0 until urlArray.length()) {
                                        val strVideoUrl =
                                            urlArray.getJSONObject(j)["videoUrl"].toString()
                                        *//*urlArray.getJSONObject(j).get("videoUrl").toString().startsWith("https://video.truemeds.in")
                                                    || urlArray.getJSONObject(j).get("videoUrl").toString().startsWith("http://video.truemeds.in")
                                                    ? urlArray.getJSONObject(j).get("videoUrl").toString() : null;*//*videoList.add(
                                            VideoUrl(
                                                urlArray.getJSONObject(j)["videoFaqId"].toString()
                                                    .toInt(),
                                                urlArray.getJSONObject(j)["title"].toString(),
                                                urlArray.getJSONObject(j)["description"].toString(),
                                                urlArray.getJSONObject(j)["duration"].toString(),
                                                urlArray.getJSONObject(j)["language"].toString(),
                                                urlArray.getJSONObject(j)["thumbnailUrl"].toString(),
                                                strVideoUrl,
                                                urlArray.getJSONObject(j)["categoryId"].toString(),
                                                urlArray.getJSONObject(j)["categoryName"].toString(),
                                                urlArray.getJSONObject(j)["languageCode"].toString(),
                                                urlArray.getJSONObject(j)["requestedBySource"].toString(),
                                                urlArray.getJSONObject(j)["videoOrientation"].toString(),
                                                urlArray.getJSONObject(j)["thumbnailUrl_portrait"].toString()
                                            )
                                        )
                                    }
                                    //end of loop j
                                    if (videoList.size == 2) {
                                        val video = Video(
                                            categoryId,
                                            options.getJSONObject(i)["categoryName"].toString(),
                                            options.getJSONObject(i)["requestedBySource"].toString(),
                                            videoList,
                                            false,
                                            false,
                                            false
                                        )
                                        list.add(i, video)
                                    }
                                }
                            }
                            dtoVideos.postValue(list)
                            _vidListSize.postValue(options.length())
                        } catch (ignore: Exception) {
                            errorMessage.postValue(Event(Any()))
                        }
                    } else {
                        errorMessage.postValue(Event(Any()))
                        CommonFunc.sendApiErrorOrDelayLog(
                            getApplication().getApplicationContext(),
                            response.code(),
                            CommonFunc.getEndPoint(response),
                            CommonFunc.getResponseTime(response),
                            CommonFunc.getErrorMessage(response),
                            response.raw().sentRequestAtMillis,
                            true,
                            false,
                            CommonFunc.ClickedOnPage.VIDEO_FAQ.toString()
                        )
                    }
                }

                override fun onFailure(call: Call<ResponseBody?>, t: Throwable) {
                    errorMessage.postValue(Event(Any()))
                    showLoading.postValue(false)
                }
            })
        }*/


    val nextVideo: Unit
        ////run a video
        get() {

            //note :- if video reached last in list make current playing 0
            if (_vidListSize.value!! > 0) {
                if (playNext >= _vidListSize.value!!) {
                    playNext = 0
                }


                //note :- video selection for hindi or english
                var languageCode = "EN"
                if (java.lang.Boolean.TRUE == _isHindiSelected.value) languageCode = "HI"
                for (i in 0..1) {

                    //note :- this check is for the
                    if (playNext >= _vidListSize.value!!) {
                        playNext = 0
                    }
                    if (dtoVideos.value?.get(playNext)?.video_url?.get(i)?.languageCode.equals(
                            languageCode
                        )
                    ) {
                        onPlaySelected(
                            dtoVideos.value?.get(playNext)?.video_url?.get(i),
                            playNext,
                            false
                        )
                    }
                }
            }
        }

    //note :- selection play from list
    fun onPlayListSelected(
        item: Video.VideoUrl?,
        position: Int,
        fromOrientation: Boolean,
        fromTray: Boolean
    ) {
        if (position != previousPosition) {
            isListItemClicked = true
            if (fromTray) videoSource.setValue("tray") else videoSource.setValue("play_next")
            totalPlayTimeMXP = 0
            eventDiscardDelayHandler.postValue(Event(Any()))
            eventClearVideoTime.setValue(Event(Any()))
            eventTriggerPlayedEvent.postValue(Event(Any()))

            sendVideoPlayedEvent(item, videoSource.value?:"")

            onPlaySelected(item, position, fromOrientation)

            //sendVideoTrayClickedEvent(item, position);
        }
    }

    //note :- auto play next element
    private fun onPlaySelected(item: Video.VideoUrl?, position: Int, fromOrientation: Boolean) {
        selectedModel = item
        streamingDurationMXP.value = System.currentTimeMillis()
        Log.d("TAG", "onPlaySelected: streamingDurationMXP = ${streamingDurationMXP.value}")
        try {
            videoUrl.value = item
            urlImage.postValue(videoUrl.value?.thumbnailUrl)
            _currentTitle.postValue(videoUrl.value?.title)
            _currentDuration.postValue(videoUrl.value?.duration)


            //note: horizontal video list selection
            if (position == _vidListSize.value!! - 1) {
                dtoVideos.value?.get(0)?.isSelectedNext = true
            } else {
                dtoVideos.value!![position + 1].isSelectedNext = (true)
            }
            //            Log.d("qwerty", "vid_position : " +position);
//            Log.d("qwerty", "vid_previousPosition : " +previousPosition);
//            dtoVideos.getValue().get(previousPosition).setSelectedNext(false);
            dtoVideos.value!![position].isSelected = (true)
            if (position != previousPosition) dtoVideos.value!![previousPosition].isSelected =
                (false)
            previousPosition = position
            val tempList: List<Video> = dtoVideos.value!!
            dtoVideos.postValue(tempList)
            if (lockDefaultView.value == false) {
                if (videoUrl.value?.videoOrientation != null) {
                    if (videoUrl.value?.videoOrientation.equals("portrait")) {
                        isLandscapeSelected.value = false
                    } /*else {
                        isLandscapeSelected.setValue(true);
                    }*/
                }
            }
            currentPlayingPosition = position
            for (i in list.indices) list[i].playState = (true)
            _video.value = videoUrl.value?.videoUrl
            playNext = position + 1
        } catch (_: Exception) {
        }
    }

    val nextTitle: Unit
        get() {
            var playNextTitle = ""
            var imageURl = ""
            if (java.lang.Boolean.TRUE == _isHindiSelected.value) {
                playNextTitle =
                    if (playNext == _vidListSize.value) dtoVideos.value?.get(0)?.video_url?.get(1)?.title!!
                    else (dtoVideos.value)!![playNext].video_url[1].title!!

                imageURl =
                    if (playNext == _vidListSize.value) (dtoVideos.value)?.get(0)?.video_url?.get(1)?.thumbnailUrl_portrait!!
                    else (dtoVideos.value)?.get(playNext)?.video_url?.get(1)?.thumbnailUrl!!

            } else {
                playNextTitle =
                    if (playNext == _vidListSize.value) (dtoVideos.value)?.get(0)?.video_url?.get(0)?.title!!
                    else (dtoVideos.value)?.get(playNext)?.video_url?.get(0)?.title!!

                imageURl =
                    if (playNext == _vidListSize.value) (dtoVideos.value)?.get(0)?.video_url?.get(0)?.thumbnailUrl_portrait!!
                    else (dtoVideos.value)?.get(playNext)?.video_url?.get(0)?.thumbnailUrl_portrait!!
            }
            eventScrollToPosition.postValue(Event(playNext))
            showThumbnail.value = true
            urlImage.value = imageURl
            playingNextTitle.value = playNextTitle
        }

    //note :- language change trigger
    fun onLanguageChange(selection: Boolean) {
        playNext = previousPosition
        _isHindiSelected.value = selection
        dtoVideos.value = emptyList()
        dtoVideos.value = list
        Handler(Looper.getMainLooper()).postDelayed({ nextVideo }, 100)
    }

    ////////////////////////////
    /*fun loadJSONFromAsset(): String? {
        var json: String? = null
        json = try {
            //JSON file is in src/main/assets/dummData.json
            val `is`: InputStream = getApplication().getAssets().open("video_faq_response.json")
            val size = `is`.available()
            val buffer = ByteArray(size)
            `is`.read(buffer)
            `is`.close()
            kotlin.String(buffer, "UTF-8")
        } catch (ex: IOException) {
            return null
        }
        return json
    }*/

    fun setPreviousToNext() {
        playNext = previousPosition
    }

    fun onFullScreenClick() {
        eventIvFullScreenClick.postValue(Event(Any()))
    }

    fun onBackButtonClick() {
        eventOnBackButtonClick.postValue(Event(Any()))
    }

    fun onCloseClick() {
        eventOnCloseClick.postValue(Event(Any()))
        sendVideoPlayerClosedEvent(selectedModel)
    }

    fun onPlayerForward() {
        eventOnPlayerForward.postValue(Event(Any()))
    }

    fun onPlayerPlay() {
        eventOnPlayerPlay.postValue(Event(Any()))
    }

    fun highlightNextVideo() {
        dtoVideos.value!![previousPosition].isSelectedNext = (false)
        val tempList: List<Video> = dtoVideos.value!!
        dtoVideos.postValue(tempList)
    }




    fun sendVideoPlayedEvent(item: Video.VideoUrl?,source:String ) {
        if (item != null) {
            val mxModel = MxVideoPlayed()
            mxModel.source = source
            mxModel.totalPlaytime = totalPlayTimeMXP
            mxModel.timestamp = streamingDurationMXP.value
            mxModel.videoId = item.videoFaqId
            mxModel.videoName = item.title
            mxModel.whId = SharedPrefManager.getInstance().selectedWarehouseID
            sdkEventUseCase.sendVideoPlayedEvent(mxModel)
        }
    }

    fun sendVideoContinueEvent(item: Video.VideoUrl?) {
        if (item != null) {
            val mxModel = MxVideoContinued()
            mxModel.videoId = item.videoFaqId
            mxModel.timestamp = streamingDurationMXP.value
            mxModel.videoName = item.title
            mxModel.whId = SharedPrefManager.getInstance().selectedWarehouseID
            sdkEventUseCase.sendVideoContinuedEvent(mxModel)
        }
    }

    fun sendVideoCompletedEvent(item: Video.VideoUrl?) {

        if (item != null) {
            val mxModel = MxVideoContinued()
            mxModel.videoId = item.videoFaqId
            mxModel.videoName = item.title
            mxModel.whId = SharedPrefManager.getInstance().selectedWarehouseID
            sdkEventUseCase.sendVideoCompletedEvent(mxModel)
        }

    }



    fun sendVideoPlayerClosedEvent(item: Video.VideoUrl?) {
        if (item != null) {
            val mxModel = MxVideoContinued()
            mxModel.videoId = item.videoFaqId
            mxModel.videoName = item.title
            mxModel.whId = SharedPrefManager.getInstance().selectedWarehouseID
            sdkEventUseCase.sendVideoPlayerClosedEvent(mxModel)
        }
    }

    fun sendVideoPausedEvent(item: Video.VideoUrl?) {
        if (item != null) {
            val mxModel = MxVideoPaused()
            mxModel.playtime = totalPlayTimeMXP
            mxModel.timestamp = streamingDurationMXP.value
            mxModel.videoId = item.videoFaqId
            mxModel.videoName = item.title
            mxModel.whId = SharedPrefManager.getInstance().selectedWarehouseID
            sdkEventUseCase.sendVideoPausedEvent(mxModel)
        }
    }


    fun sendVideoEventToMixpanel(source: String) {
        val mxModel = MxCommonProperty()
        if(!SharedPrefManager.getInstance().selectedWarehouseID.isNullOrEmpty()) {
            mxModel.warehouseId =
                (SharedPrefManager.getInstance().selectedWarehouseID ?: "0").toInt()
        }
        sdkEventUseCase.sendSubsVideoPlayedEvent(mxModel, source)
        
    }


}