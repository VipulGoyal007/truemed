package com.intellihealth.truemeds.mvvm.viewmodel

import android.os.CountDownTimer
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.DateUtils
import com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.time.Duration.Companion.seconds

class CountDownTimerViewModel(
    private val mainDispatcher: CoroutineDispatcher = Dispatchers.Main,
) : BaseViewModel() {

    private val _ftcTimeRemainingInMillis = MutableLiveData<Long>(0)
    val ftcTimeRemainingInMillis: LiveData<Long>
        get() = _ftcTimeRemainingInMillis

    private val _ftcTimeRemainingString = MutableLiveData("")
    val ftcTimeRemainingString: LiveData<String>
        get() = _ftcTimeRemainingString

    private var countDownTimer: CountDownTimer? = null

    private val _tickInterval = MutableLiveData(1.seconds)
    private val tickIntervalMs
        get() = _tickInterval.value?.inWholeMilliseconds ?: 0L

    fun stop() {
        viewModelScope.launch(mainDispatcher) {
            _ftcTimeRemainingInMillis.value = 0
            _ftcTimeRemainingString.value = ""
            countDownTimer?.cancel()
            countDownTimer = null
        }
    }

    fun start(currentTime: Long, expiryTime: Long) {
        val millis = DateUtils.convertEpochTimeStampToDateMillis(expiryTime, currentTime);
        start(millis!!)
    }

    fun start(millis: Long) {
        viewModelScope.launch(mainDispatcher) {

            if (millis < 1) {
                _ftcTimeRemainingInMillis.postValue(0)
                _ftcTimeRemainingString.postValue("")
            }

            countDownTimer?.cancel()
            countDownTimer = null

            countDownTimer = object : CountDownTimer(millis, tickIntervalMs) {
                override fun onTick(millisUntilFinished: Long) {

                    BundleConstants.MX_FTC_COUNTDOWN_TIME_IN_SEC =
                        DateUtils.convertMillisToSeconds(millisUntilFinished)

                    var millisRemains = millisUntilFinished

                    val secondsInMilli: Long = 1000
                    val minutesInMilli = secondsInMilli * 60
                    val hoursInMilli = minutesInMilli * 60

                    //Hours
                    val elapsedHours = millisRemains / hoursInMilli

                    //Minutes
                    millisRemains %= hoursInMilli
                    val elapsedMinutes = millisRemains / minutesInMilli

                    //Seconds
                    millisRemains %= minutesInMilli
                    val elapsedSeconds = millisRemains / secondsInMilli

                    val timeRemains = if (elapsedHours > 0) {
                        String.format("%02d:%02d:%02dhrs",
                            elapsedHours,
                            elapsedMinutes,
                            elapsedSeconds)
                    } else {
                       // String.format("%02d:%02dmins", elapsedMinutes, elapsedSeconds)
                        String.format("%02dm:%02ds", elapsedMinutes, elapsedSeconds)
                    }

                    _ftcTimeRemainingInMillis.postValue(millisUntilFinished)
                    _ftcTimeRemainingString.postValue(timeRemains)

                    Log.e("timer_millesss::::","::::"+millisUntilFinished+"::::"+timeRemains)
                }

                override fun onFinish() {
                    _ftcTimeRemainingInMillis.postValue(0)
                    _ftcTimeRemainingString.postValue("")
                }
            }.also {
                it.start()
            }
        }
    }

    override fun onCleared() {
        countDownTimer?.cancel()
        countDownTimer = null
        super.onCleared()
    }

    fun getCountDownTimerInstance() : CountDownTimer? = countDownTimer
    fun clearInstance() {
        countDownTimer?.cancel()
        countDownTimer = null
    }
}