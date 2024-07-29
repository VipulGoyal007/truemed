package com.intellihealth.truemeds.presentation.bottomsheet.help

import android.app.Dialog
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.intellihealth.salt.models.BottomsheetHeaderModel
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.home.RatingDetailsResponseModel
import com.intellihealth.truemeds.databinding.BottomsheetHelpBinding
import com.intellihealth.truemeds.presentation.callbacks.FeedbackCallback
import com.intellihealth.truemeds.presentation.viewmodel.HelpViewModel
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

class HelpBottomSheet() : BottomSheet() {
    private lateinit var binding: BottomsheetHelpBinding
    private lateinit var bottomSheetHeaderModel: BottomsheetHeaderModel
    private lateinit var dialog: BottomSheetDialog
    private var header: Boolean = true
    private lateinit var viewModel: HelpViewModel
    var helpContactNo: String=""
    var helpEmailAddress: String=""

    constructor( helpContactNo: String,  helpEmailAddress: String) : this(){
        this.helpContactNo = helpContactNo
        this.helpEmailAddress = helpEmailAddress
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.bottomsheet_help, container, false)
        viewModel = ViewModelProvider(requireActivity())[HelpViewModel::class.java]

        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        setEventListeners()
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
        setUpBottomSheetBehaviour(
            bottomSheetDialog = dialog,
            isDraggable = false,
            bottomSheetState = bottomSheetHeaderModel.bottomSheetState,
            height = bottomSheetHeaderModel.height
        )
        return dialog
    }

    private fun setEventListeners() {

        binding.ivClose.setOnClickListener {
            if (dialog.isShowing) {
                dialog.dismiss()
            }
        }

        binding.helpCallView.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + helpContactNo)
            startActivity(intent)
        }
        binding.tvContactNo.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + helpContactNo)
            startActivity(intent)
        }

        binding.tvEmail.setOnClickListener {
            val email = Intent(Intent.ACTION_SEND)
            email.putExtra(Intent.EXTRA_EMAIL, arrayOf(helpEmailAddress))
            email.setType("text/html")
            email.setPackage("com.google.android.gm")

            startActivity(Intent.createChooser(email, "Choose an Email client :"))
        }

        binding.helpMailView.setOnClickListener {

            val email = Intent(Intent.ACTION_SEND)
            email.putExtra(Intent.EXTRA_EMAIL, arrayOf<String>(helpEmailAddress))
            email.setType("text/html")
            email.setPackage("com.google.android.gm")

            startActivity(Intent.createChooser(email, "Choose an Email client :"))

        }
    }

    private fun initView() {
        binding.tvContactNo.text = helpContactNo
        //below code is written to set red dot colour of helpline text when working hours are unavailable


        if (!checkIfInRangeOfHours("09:00:00", "21:00:00")) {
            binding.tvHelpline.text = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                Html.fromHtml(getString(R.string.helpline_red), Html.FROM_HTML_MODE_COMPACT)
            } else {
                Html.fromHtml(getString(R.string.helpline_red))
            }
        }

        binding.tvEmail.text = helpEmailAddress


    }

    fun checkCurrentTimeValid(): Boolean {
        var isCurrentTimeInBetween = false
        val date = Date()
        val dateFormatWithZone =
            SimpleDateFormat("HH:mm:ss", Locale.getDefault())
        val currentTime = dateFormatWithZone.format(date)


        try {
            val string1 = "09:00:00"
            val time1: Date = SimpleDateFormat("HH:mm:ss").parse(string1)
            val calendar1 = Calendar.getInstance()
            calendar1.time = time1
            calendar1.add(Calendar.DATE, 1)
            val string2 = "21:00:00"
            val time2: Date = SimpleDateFormat("HH:mm:ss").parse(string2)
            val calendar2 = Calendar.getInstance()
            calendar2.time = time2
            calendar2.add(Calendar.DATE, 1)
            val someRandomTime = currentTime
            val d: Date = SimpleDateFormat("HH:mm:ss").parse(someRandomTime)
            val calendar3 = Calendar.getInstance()
            calendar3.time = d
            calendar3.add(Calendar.DATE, 1)
            val x: Date = calendar3.time
            if (x.after(calendar1.time) && x.before(calendar2.time)) {
                isCurrentTimeInBetween = true

            }
        } catch (e: ParseException) {
            isCurrentTimeInBetween = true
            e.printStackTrace()
        }

        return isCurrentTimeInBetween
    }

    private fun checkIfInRangeOfHours(startHour: String, endHour: String): Boolean {
        val currentTime = Calendar.getInstance().time
        val currentDate = SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(currentTime)
        val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd hh:mm", Locale.ENGLISH)
        val startDate: Date? = simpleDateFormat.parse("$currentDate $startHour")
        val endDate: Date? = simpleDateFormat.parse("$currentDate $endHour")
        return Date().after(startDate) && Date().before(endDate)
    }

    override fun getTheme() = R.style.BottomSheetDialog

}