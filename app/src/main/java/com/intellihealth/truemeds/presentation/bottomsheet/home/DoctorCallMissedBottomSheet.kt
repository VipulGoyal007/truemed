package com.intellihealth.truemeds.presentation.bottomsheet.home

import android.app.Dialog
import android.content.DialogInterface
import android.os.Build
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.intellihealth.salt.models.BottomsheetHeaderModel
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.home.DeliveryDelayModel
import com.intellihealth.truemeds.databinding.BottomsheetDoctorCallMissedBinding
import com.intellihealth.truemeds.mvvm.viewmodel.CountDownTimerViewModel
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel
import com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import java.util.concurrent.TimeUnit
import kotlin.math.abs


class DoctorCallMissedBottomSheet() : BottomSheetDialogFragment() {
    private lateinit var dialog: BottomSheetDialog
    private lateinit var binding: BottomsheetDoctorCallMissedBinding
    private lateinit var bottomSheetHeaderModel: BottomsheetHeaderModel
    private lateinit var countdownTimer: CountDownTimer
    private val viewModel by lazy { ViewModelProvider(requireActivity())[HomeViewModel::class.java] }
    private var job: Job? = null
    var model: DeliveryDelayModel?=null
    var callback: PopUpDialogCallback?=null
    var ftcViewModel: CountDownTimerViewModel?=null

    constructor( model: DeliveryDelayModel,
                callback: PopUpDialogCallback,
                ftcViewModel: CountDownTimerViewModel
    ) : this(){
        this.model = model
        this.callback = callback
        this.ftcViewModel=ftcViewModel
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(
                inflater,
                R.layout.bottomsheet_doctor_call_missed,
                container,
                false
            )
        binding.lifecycleOwner = viewLifecycleOwner
        binding.model = model
        binding.viewModel = viewModel
        /*   if (model != null && !model.time.isNullOrEmpty()) initFtcCountDownTimer(abs(model.time!!.toLong()))
           setListener()*/

        binding.btnCallMe.setTitle(viewModel.callMeButtonText)

        Log.e("bottomsheet_timer:::", ":::-->" + viewModel.bottomSheetDoctorCallTimerValue)
        if (!viewModel.bottomSheetDoctorCallTimerValue.isNullOrEmpty() && viewModel.bottomSheetDoctorCallTimerValue!="0") {
            // timer is working now
            startCountDownTimerNew()
            binding.tvMessage.text=getString(R.string.speak_to_doctor_msg)+" "+viewModel.bottomSheetDeliveryDate+"."


          //  initFtcCountDownTimer(abs(viewModel.bottomSheetDoctorCallTimerValue!!.toLong()))
        }
        else {
            binding.tvMessage.text=getString(R.string.complete_your_doctor_call_msg)+" "+viewModel.bottomSheetDeliveryDate+"."
            binding.clTimer.visibility = View.GONE
        }



        setListener()



        return binding.root
    }

    private fun setListener() {
        binding.ivClose.setOnClickListener {
            if (dialog.isShowing) dialog.dismiss()
        }
        binding.btnCallMe.setOnClickListener {
            dialog.dismiss()
            callback?.onActionButtonClicked()
        }

         ftcViewModel?.ftcTimeRemainingString?.observe(viewLifecycleOwner, Observer<String> { str: String ->
              if(str != "") {
                  Log.d("TAG", "setListener::::: "+str)
                  binding.tvTimer.text=str
              }

          })

    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        bottomSheetHeaderModel = BottomsheetHeaderModel(
            closeIcon = null,
            header = null,
            subHeader = null,
            icon = null,
            showIcon = false,
            showViewDragHandle = false,
            bottomSheetState = 6
        )
        dialog = BottomSheetDialog(requireContext(), theme)
       // dialog.behavior.setPeekHeight(500)
      /*  setUpBottomSheetBehaviour(
            dialog,
            true,
            bottomSheetHeaderModel.bottomSheetState,
            bottomSheetHeaderModel.height,
            bottomSheetHeaderModel
        )*/
        return dialog
    }

    override fun getTheme() = R.style.BottomSheetDialog

    private fun formatTime(millis: Long): String {
        val hours = TimeUnit.MILLISECONDS.toHours(millis)
        val minutes = TimeUnit.MILLISECONDS.toMinutes(millis) % 60
        val seconds = TimeUnit.MILLISECONDS.toSeconds(millis) % 60

        return String.format("%02dh:%02dm:%02ds", hours, minutes, seconds)
    }


    /* fun startCountDownTimer(){

         Log.e("bottomsheet_timer:::",":::-->"+model.time)
         if (model != null && !model.time.isNullOrEmpty()) {
             binding.clTimer.visibility = View.VISIBLE
             Log.d("TAG", "setListener: "+model.time)
             countdownTimer = object : CountDownTimer(kotlin.math.abs(model.time!!.toLong()), 1000) {
                 override fun onTick(millisUntilFinished: Long) {
                     Log.d("TAG", "onTick: "+millisUntilFinished)
                     val formattedTime = formatTime(millisUntilFinished)
                     binding.tvTimer.text = formattedTime
                 }

                 override fun onFinish() {
                     binding.clTimer.visibility = View.GONE
                 }
             }

             countdownTimer.start()
         }
     }*/

    fun startCountDownTimerNew() {

        Log.e("bottomsheet_timer:::", ":::-->" + viewModel.bottomSheetDoctorCallTimerValue)
        if (!viewModel.bottomSheetDoctorCallTimerValue.isNullOrEmpty() &&
            viewModel.bottomSheetDoctorCallTimerValue!="0") {
            binding.clTimer.visibility = View.VISIBLE
            Log.d("TAG", "setListener: " + viewModel.bottomSheetDoctorCallTimerValue)
            countdownTimer = object : CountDownTimer(
                kotlin.math.abs(viewModel.bottomSheetDoctorCallTimerValue!!.toLong()),
                1000
            ) {
                override fun onTick(millisUntilFinished: Long) {
                    val formattedTime = formatTime(millisUntilFinished)

                    Log.d("TAG", "onTick:::::" + millisUntilFinished + "::::" + formattedTime)

                    binding.tvTimer.text = formattedTime
                }

                override fun onFinish() {
                    binding.clTimer.visibility = View.GONE
                }
            }

            countdownTimer.start()
        }
    }

    private fun initFtcCountDownTimer(millis: Long) {
        if (ftcViewModel?.getCountDownTimerInstance() == null) {
            ftcViewModel?.ftcTimeRemainingString?.observe(
                viewLifecycleOwner,
                Observer<String> { str: String ->
                    if (str != "") {
                        //todo set timer value to text remaining
                        Log.d("TAG", "initFtcCountDownTimer doctor call: " + str)
                        Log.d("TAG", "initFtcCountDownTimer: thread " + Thread.currentThread())
                    }

                })
            ftcViewModel?.start(millis)
        } else {
            ftcViewModel?.stop()
        }


    }

    override fun onCancel(dialog: DialogInterface) {
        super.onCancel(dialog!!)
        //TODO call api here
        //Toast.makeText(requireActivity(), "CANCEL", Toast.LENGTH_SHORT).show()
    }
}