package com.intellihealth.truemeds.presentation.activity

import android.content.pm.ActivityInfo
import android.os.Build
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.PlaybackException
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.video.VideoSize
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.ActivitySubstitutesBinding
import com.intellihealth.truemeds.databinding.ActivityVideoFaqBinding
import com.intellihealth.truemeds.presentation.utils.Event
import com.intellihealth.truemeds.presentation.utils.EventObserver
import com.intellihealth.truemeds.presentation.utils.ProgressTracker
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.TimeZone


@AndroidEntryPoint
class VideoFaqActivity : AppCompatActivity() {

    private var tracker: ProgressTracker? = null
    private val binding by viewBinding(ActivityVideoFaqBinding::inflate)
    var viewModel: VideoViewModel? = null

    private var simpleExoPlayer: ExoPlayer? = null

    private var runnableVideoTime: Runnable? = null
    private var handlerVideoTime: Handler? = null

    private var postVideoDelayHandler: Handler? = null
    private var postVideoDelayRunnable: Runnable? = null
    private val videoPlayedTime = 0
    private var videoPauseClicked = false
    private  var isBackPressed:kotlin.Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[VideoViewModel::class.java]
        binding.viewmodel = viewModel
        binding.lifecycleOwner = this

        updateStatusBarColor()

        hideVideoControllers()
        binding.playerView.setControllerVisibilityListener { visibility ->
            if (visibility > 0) {
                hideVideoControllers()
            } else {
                showVideoControllers()
            }
        }

       val sourcePage = intent.extras?.getString("source")
        viewModel?.videoSource?.value = intent.extras?.getString("source")

        //note :- orientation button clicked
        viewModel?.eventIvFullScreenClick?.observe(this, EventObserver label@{
            binding.btnViewAll.visibility = View.GONE
            viewModel?.lockDefaultView?.postValue(false)
            //note :- after orientation change
            if (viewModel?.isLandscapeSelected?.value == null) {
                requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
                closeFullscreenDialog()
                return@label
            }

            //note :- from portrait screen
            if (viewModel?.isFullScreen?.value == true && viewModel?.isLandscapeSelected?.value == false) {
                closeFullscreenDialog()
            } else if (viewModel?.isFullScreen?.value == false && viewModel?.isLandscapeSelected?.value == true) {
                closeFullscreenDialog()
                requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
            } else if (viewModel?.isFullScreen?.value == false && viewModel?.isLandscapeSelected?.value == false) {
                if (!viewModel?.isLandscapeSelected?.value!!) {
                    requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
                    openFullscreenDialog()
                } else {
                    requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
                }
            }
        })

        viewModel?.eventOnBackButtonClick?.observe(this, EventObserver { onBackPressed() })


        //note :-cross button


        //note :-cross button
        viewModel?.eventOnCloseClick?.observe(this, EventObserver {
            closeFullscreenDialog()
            if (viewModel?._vidListSize?.value!! <= 1) {
                finish()
            } else {
                closeFullscreenDialog()
            }
        })


        viewModel?.urlImage?.observe(this) { url: String? ->
            if (url != null) {
                Glide.with(application).asGif().load(url)
                    .into(binding.ivThumbnail)
            }
        }

        //buttons on view
        viewModel?.eventOnPlayerPlay?.observe(this, EventObserver {
            if (simpleExoPlayer != null) {
                if (viewModel?.isSecondaryPlayFlag?.value!!) {
                    simpleExoPlayer?.play()
                    viewModel?.isSecondaryPlayFlag?.setValue(false)
                } else {
                    simpleExoPlayer?.pause()
                    viewModel?.isSecondaryPlayFlag?.setValue(true)
                }
            }
        })

        viewModel?.eventOnPlayerForward?.observe(this, EventObserver { viewModel!!.nextVideo })

        //event callbacks
        viewModel!!.eventErrorToast.observe(this, EventObserver { `object` ->
            val message = `object` as String
            Toast.makeText(application, "" + message, Toast.LENGTH_LONG).show()
        })
        viewModel!!.eventRecordVideoTime.observe(this, EventObserver { recordVideoTime() })
        viewModel!!.eventClearVideoTime.observe(this, EventObserver { clearVideoTime() })
        viewModel!!.eventDiscardDelayHandler.observe(this, EventObserver { postVideoDelayHandler?.removeCallbacks(postVideoDelayRunnable!!) })

        viewModel!!.eventScrollToPosition.observe(this, EventObserver { `object` ->
            val position = `object` as Int
            binding.rvVideoList.scrollToPosition(position)
            binding.rvVideoListVertical.scrollToPosition(position)
        })


        viewModel!!.errorMessage.observe(this, EventObserver { `object` ->
            AlertDialog.Builder(this@VideoFaqActivity)
                .setMessage("Something went wrong.")
                .setPositiveButton(android.R.string.ok) { dialog, which ->
                    finish()
                    dialog.dismiss()
                }
                .setCancelable(false)
                .show()
        })


        //try {
        
        /**
         * send clickedPage and section
         * **/
        viewModel?.sendVideoEventToMixpanel(sourcePage ?: "order_status_page")

        val displayMetrics = this.resources.displayMetrics
        val dpWidth = displayMetrics.widthPixels.toFloat()


        //note:- check default orientation of individual video


        //note:- check default orientation of individual video
        viewModel?.isLandscapeSelected?.observe(this) { isLandscapeSelected: Boolean? ->
            if (isLandscapeSelected != null) {
                if (isLandscapeSelected) {
                    binding.clToolbar.visibility = View.GONE
                    requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
                    binding.ivFullScreen.visibility = View.VISIBLE
                } else {
                    requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
                    binding.playerConstrain.layoutParams.height = (dpWidth * 0.55).toInt()
                    openFullscreenDialog()
                }
            }
        }
        playFirstTime()


        viewModel?.isSecondaryPlayFlag?.observe(
            this
        ) { aBoolean: Boolean ->
            if (viewModel?.list?.isNotEmpty() == true) {
//                Log.d("qwerty", "position : " + viewModel.currentPlayingPosition + " || isSecondaryPlayFlag : " + aBoolean);



                viewModel!!.list[viewModel!!.currentPlayingPosition].playState = aBoolean
                binding.rvVideoList.adapter!!.notifyDataSetChanged()
            }
        }

        /*viewModel.getEventTriggerPlayedEvent().observe(this, objectEvent -> {
            if (simpleExoPlayer != null && simpleExoPlayer.isPlaying())
                try {
                    viewModel.sendVideoPlayedEvent(viewModel.selectedModel, viewModel.videoSource.getValue());
                } catch (Exception e) {
                    e.printStackTrace();
                }
        });*/


        /*viewModel.getEventTriggerPlayedEvent().observe(this, objectEvent -> {
            if (simpleExoPlayer != null && simpleExoPlayer.isPlaying())
                try {
                    viewModel.sendVideoPlayedEvent(viewModel.selectedModel, viewModel.videoSource.getValue());
                } catch (Exception e) {
                    e.printStackTrace();
                }
        });*/viewModel?.showHorizontalList?.observe(
            this
        ) { aBoolean: Boolean ->
            if (aBoolean) binding.playerBottomView.visibility =
                View.GONE else binding.playerBottomView.visibility =
                View.VISIBLE
        }

    }

    private fun hideVideoControllers() {
        binding.tvTitle2.visibility = View.GONE
        binding.ivFullScreen.visibility = View.GONE
        //binding.pbVideoProgress.setVisibility(View.VISIBLE);
        binding.llControllers.visibility = View.GONE
    }

    private fun showVideoControllers() {
        if (java.lang.Boolean.TRUE == viewModel?.isFullScreen?.value) binding.tvTitle2.visibility =
            View.VISIBLE
        binding.ivFullScreen.visibility = View.VISIBLE
        //        binding.pbVideoProgress.setVisibility(View.GONE);
        binding.llControllers.visibility = View.VISIBLE
    }

    private fun updateStatusBarColor() {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                window.decorView.systemUiVisibility =
                    View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR //  set status text dark
                window.statusBarColor =
                    ContextCompat.getColor(this, R.color.white) // set status background white
            }
        } catch (ignore: java.lang.Exception) {
        }
    }


    override fun onResume() {
        super.onResume()
        //note :-  when video selected
        viewModel?._video?.observe(this, this::playVideoSelected)
        startCounter()
    }


    private fun playFirstTime() {
        viewModel?.isLandscapeSelected?.value = null
        viewModel?.setPreviousToNext()
        viewModel?._vidListSize?.observe(this) { downloadListSize: Int ->
            if (downloadListSize > 0) {
                if (java.lang.Boolean.TRUE == viewModel?.isHomeScreenVideo?.value) {
                  //  if (intent.getStringExtra("video_url") != null) {
                    if (intent.extras?.getString("video_url") != null) {
                     //   if (intent.hasExtra("video_url")) {
                        if (intent.extras?.containsKey("video_url") == true) {
                            //if (getIntent().getStringExtra("video_url").contains(".mp4")) {
                            viewModel?.isHomeScreenVideo?.value = false
                            outerLoop@
                                for (i in viewModel?.dtoVideos?.value?.indices!!) {
                                    for (videoUrl in viewModel?.dtoVideos?.value!![i].video_url) {
                                       // if (videoUrl.videoUrl == intent.getStringExtra("video_url")) {
                                        if (videoUrl.videoUrl == intent.extras?.getString("video_url")) {
                                            if (videoUrl.languageCode == "HI") {
                                                viewModel?._isHindiSelected?.setValue(true)
                                            } else {
                                                viewModel?._isHindiSelected?.setValue(false)
                                            }
                                            viewModel?.playNext = i
                                            viewModel?.nextVideo
                                            break@outerLoop
                                        }
                                    }
                                }
                            if (viewModel?.playNext==0) viewModel?.nextVideo
                        }
                    } else {
                        viewModel?.playNext = 0
                        viewModel?.nextVideo
                    }
                }
            }
        }
    }


    private fun playVideoSelected(dtoVideo: String?) {
        releasePlayer()

//        DefaultTrackSelector trackSelector =new DefaultTrackSelector(this);
//        trackSelector.setParameters(trackSelector.buildUponParameters().setMaxVideoSizeSd());
        simpleExoPlayer = ExoPlayer.Builder(this)
            .setSeekBackIncrementMs(10000)
            .setSeekForwardIncrementMs(10000) //.setTrackSelector(trackSelector)
            .build()

        //note:- play from last saved position
        if (viewModel?.playerLastRecordedTime?.value != null) {
            if (viewModel?.playerLastRecordedTime?.value != 0L) {
                simpleExoPlayer?.seekTo(viewModel?.playerLastRecordedTime?.value!!)
            }
        }
        viewModel?.isSecondaryPlayFlag?.value = true
        binding.playerView.player = simpleExoPlayer
        var mediaItem: MediaItem? = null
        if (dtoVideo != null) {
            mediaItem = MediaItem.fromUri(dtoVideo)
        }
        try {
            if (mediaItem != null) {
                simpleExoPlayer?.addMediaItem(mediaItem)
                simpleExoPlayer?.prepare()
                simpleExoPlayer?.addListener(object : Player.Listener {
                    override fun onPlayerStateChanged(playWhenReady: Boolean, playbackState: Int) {
                        super<Player.Listener>.onPlayerStateChanged(playWhenReady, playbackState)
                        if (playbackState == ExoPlayer.STATE_ENDED) {
                            binding.btnViewAll.visibility = View.VISIBLE
                            viewModel?.sendVideoPlayedEvent(viewModel?.selectedModel, viewModel?.videoSource?.value?:"")

                            viewModel?.playerLastRecordedTime?.value = 0L
                            postVideoDelayHandler = Handler()
                            viewModel?.highlightNextVideo()
                            postVideoDelayRunnable = Runnable { viewModel?.nextVideo }
                            postVideoDelayHandler?.postDelayed(postVideoDelayRunnable!!, 5000)

                            //display next data
                            viewModel?.nextTitle
                            viewModel?.showHorizontalList?.postValue(true)
                            viewModel?.isVideoPaused?.value = true
                            viewModel?.isProgressVisible?.postValue(true)
                            //                            binding.pbVideoProgress.setVisibility(View.GONE);

                            //show progressbar
                            object : CountDownTimer(5000, 100) {
                                override fun onTick(millisUntilFinished: Long) {
                                    binding.progressBar2.progress =
                                        (100 - millisUntilFinished / 100).toInt()
                                }

                                override fun onFinish() {}
                            }.start()

                            viewModel?.sendVideoCompletedEvent(viewModel?.selectedModel)
                            handlerVideoTime = null
                        }
                        if (playbackState == ExoPlayer.STATE_IDLE) {
                            viewModel?.showHorizontalList?.postValue(false)
                            binding.btnViewAll.visibility = View.GONE
                        }
                        if (playbackState == ExoPlayer.STATE_READY) {
                            hideVideoControllers()
                            viewModel?.isVideoPaused?.setValue(false)
                            viewModel?.isProgressVisible?.postValue(false)
                            viewModel?.showHorizontalList?.postValue(false)
                            binding.btnViewAll.visibility = View.GONE
                            //                            binding.pbVideoProgress.setVisibility(View.VISIBLE);
                            startCounter()
                        }
                        if (playbackState == ExoPlayer.STATE_BUFFERING) {
                            viewModel?.isVideoPaused?.value = false
                            viewModel?.isProgressVisible?.postValue(false)
                            binding.appCompatImageView18.visibility = View.GONE
                            binding.playerView.hideController()
                            viewModel?.loadGif?.value = true
                            binding.btnViewAll.visibility = View.GONE
                            Glide.with(this@VideoFaqActivity).load(R.drawable.loader_grey_gif)
                                .into(binding.loadingGIF)
                        } else {
                            viewModel?.loadGif?.value = false
                            binding.appCompatImageView18.visibility = View.VISIBLE
                        }
                    }

                    override fun onVideoSizeChanged(videoSize: VideoSize) {
                        super<Player.Listener>.onVideoSizeChanged(videoSize)
                        //                        if (Boolean.TRUE.equals(viewModel.mExoPlayerFullscreen.getValue())) binding.playerView.getLayoutParams().height = videoSize.height;
                    }

                    override fun onPlayerError(error: PlaybackException) {
                        super<Player.Listener>.onPlayerError(error)
                        //Toast.makeText(getApplication(), "" + error.getMessage(), Toast.LENGTH_LONG).show();
                    }

                    override fun onIsPlayingChanged(isPlaying: Boolean) {
                        super<Player.Listener>.onIsPlayingChanged(isPlaying)
                        viewModel?.isSecondaryPlayFlag?.value = !isPlaying
                        if (isPlaying) {
                            if (tracker == null) {
                                tracker = ProgressTracker(
                                    simpleExoPlayer
                                ) { position: Long ->
                                    viewModel?.totalPlayTimeMXP = (position / 1000).toInt()
                                }
                            }
                            viewModel!!.showThumbnail.setValue(false)
                            if (videoPauseClicked) viewModel?.sendVideoContinueEvent(viewModel!!.selectedModel)

                            videoPauseClicked = false
                        } else {
                            if (tracker != null) tracker?.purgeHandler()
                            tracker = null
                            if (parseTime(viewModel!!.selectedModel!!.duration) > viewModel!!.totalPlayTimeMXP + 1 && !isBackPressed && !viewModel!!.isListItemClicked) {
                                videoPauseClicked = true
                                viewModel?.sendVideoPausedEvent(viewModel!!.selectedModel)
                            }
                        }
                        viewModel!!.isListItemClicked = false
                    }
                })
                simpleExoPlayer?.playWhenReady = true
                //binding.playerView.performClick();
            }
        } catch (e: Exception) {
            //Toast.makeText(getApplication(), "" + e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }


    override fun onBackPressed() {
        if (java.lang.Boolean.TRUE == viewModel!!.isFullScreen.value) {
            viewModel!!.onCloseClick()
        } else {
            isBackPressed = true
            if (simpleExoPlayer != null && simpleExoPlayer!!.isPlaying) {
                viewModel?.sendVideoPlayedEvent(viewModel!!.selectedModel, viewModel!!.videoSource.value?:"")
            }
            super.onBackPressed()
        }
    }

    override fun onPause() {
        super.onPause()
        recordVideoTime()
        releasePlayer()
        handlerVideoTime = null
    }


    override fun onStop() {
        super.onStop()
        viewModel!!.eventRecordVideoTime.setValue(Event(Any()))
        releasePlayer()
    }


    private fun releasePlayer() {
        if (simpleExoPlayer != null) {
            if (tracker != null) tracker!!.purgeHandler()
            tracker = null
            simpleExoPlayer!!.stop()
            simpleExoPlayer!!.release()
            simpleExoPlayer = null
        }
    }


    private fun openFullscreenDialog() {
        binding.tvTitle2.visibility = View.VISIBLE
        val displayMetrics = this.resources.displayMetrics
        val dpHeight = displayMetrics.heightPixels.toFloat()
        binding.playerView.layoutParams.height = dpHeight.toInt()
        binding.playerConstrain.layoutParams.height = dpHeight.toInt()
        binding.clToolbar.visibility = View.VISIBLE
        viewModel!!.isFullScreen.value = true

        //binding.ivFullScreen.setVisibility(View.VISIBLE);
    }


    private fun closeFullscreenDialog() {
        binding.tvTitle2.visibility = View.GONE
        val displayMetrics = this.resources.displayMetrics
        val dpWidth = displayMetrics.widthPixels.toFloat()
        binding.playerView.layoutParams.height = (dpWidth * 0.55).toInt()
        binding.playerConstrain.layoutParams.height = (dpWidth * 0.55).toInt()
        binding.clToolbar.visibility = View.VISIBLE
        viewModel!!.lockDefaultView.postValue(true)
        viewModel!!.isFullScreen.value = false

        //binding.ivFullScreen.setVisibility(View.VISIBLE);
    }

    //long videoWatchedTime = 0;
    private fun startCounter() {
        if (handlerVideoTime == null) {
            handlerVideoTime = Handler()
            runnableVideoTime = Runnable {
                if (simpleExoPlayer != null) {
                    val progress =
                        (simpleExoPlayer!!.currentPosition * 100 / simpleExoPlayer!!.duration).toInt()
                    //                    binding.pbVideoProgress.setProgress(progress);
                    binding.pbVideoProgress2.progress = progress
                    //                    Log.d("qwerty", "handlerVideoTime!=null");
                    if (handlerVideoTime != null) handlerVideoTime!!.postDelayed(
                        runnableVideoTime!!,
                        1000
                    )
                    viewModel!!.streamingDuration.postValue(convertS_DDMMYY(simpleExoPlayer!!.currentPosition))
                }
            }
            handlerVideoTime!!.postDelayed(runnableVideoTime!!, 0)
        }
    }


    private fun recordVideoTime() {
        if (simpleExoPlayer != null) viewModel!!.playerLastRecordedTime.postValue(simpleExoPlayer!!.currentPosition)
    }

    private fun clearVideoTime() {
        if (simpleExoPlayer != null) viewModel!!.playerLastRecordedTime.postValue(0L)
    }



    fun playerSeek5000() {
        simpleExoPlayer!!.seekTo(27000)
    }

    @Throws(NumberFormatException::class)
    fun parseTime(str: String?): Long {
        if (str == null) throw NumberFormatException("parseTimeString null str")
        if (str.isEmpty()) throw NumberFormatException("parseTimeString empty str")
        var h = 0
        val m: Int
        val s: Int
        val units = str.split(":".toRegex()).dropLastWhile { it.isEmpty() }
            .toTypedArray()
        when (units.size) {
            2 -> {
                // mm:ss
                m = units[0].toInt()
                s = units[1].toInt()
            }

            3 -> {
                // hh:mm:ss
                h = units[0].toInt()
                m = units[1].toInt()
                s = units[2].toInt()
            }

            else -> throw NumberFormatException("parseTimeString failed:$str")
        }
        if (m < 0 || m > 60 || s < 0 || s > 60 || h < 0) throw NumberFormatException(
            "parseTimeString range error:$str"
        )
        return h * 3600L + m * 60 + s
    }

    // given time string (hours:minutes:seconds, or mm:ss, return number of seconds.
    fun parseTimeStringToSeconds(str: String?): Long {
        return try {
            parseTime(str)
        } catch (nfe: NumberFormatException) {
            0
        }
    }


    private fun convertS_DDMMYY(sec: Long): String? {
        val df: SimpleDateFormat
        val d = Date(sec)
        if (sec >= 600000) df = SimpleDateFormat("HH:mm:ss", Locale.US) else df =
            SimpleDateFormat("mm:ss", Locale.US)
        df.setTimeZone(TimeZone.getTimeZone("GMT"))
        return df.format(d)
    }


}