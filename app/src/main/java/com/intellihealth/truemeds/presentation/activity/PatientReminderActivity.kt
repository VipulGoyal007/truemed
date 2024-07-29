package com.intellihealth.truemeds.presentation.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProvider
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.callbacks.ButtonClickCallback
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.salt.views.Toast
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.databinding.ActivityPatientReminderBinding
import com.intellihealth.truemeds.domain.navigation.navigateToSearchSuggestionActivity
import com.intellihealth.truemeds.presentation.bottomsheet.AddReminderBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.ReminderDeleteFragment
import com.intellihealth.truemeds.presentation.bottomsheet.ReminderEditFragment
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PatientReminderActivity : BaseActivity() {

    private val binding by viewBinding(ActivityPatientReminderBinding::inflate)
    private lateinit var context: Context
    private lateinit var viewModel: ReminderViewModel
    private var reminderBottomSheet = AddReminderBottomSheet()
    private var reminderDeleteFragment = ReminderDeleteFragment()
    private var reminderEditFragment = ReminderEditFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        context = this
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[ReminderViewModel::class.java]
        binding.reminderViewModel = viewModel
        binding.lifecycleOwner = this

        extractIntentData()

        viewModel.getReminderList()

        binding.header.setUpMobileSectionHeadersData(
            MobileSectionHeadersModel(
                "Set Reminder", "", "", null, 0,
                null, null
            )
        )

        binding.header.setBackArrowClickCallback(object : BackArrowClickCallback {
            override fun onBackArrowClick() {
                overridePendingTransition(0, R.anim.slide_out)
                finish()
            }
        })

        binding.header.setButtonClickCallback(object : ButtonClickCallback {
            override fun buttonClick() {
                viewModel.getPatientNameList()
            }

            override fun buttonClickWithParams(buttonType: String) {

            }
        })

        viewModel.patientNameList.observe(this, EventObserver {
            if (!it.isNullOrEmpty()) {
                reminderBottomSheet.isCancelable = true
                if (!reminderBottomSheet.isVisible) {
                    viewModel.addReminderFromOrderStatusActivity.value = false
                    viewModel.addReminderTitle.value = "Set reminder"
                    reminderBottomSheet.setReminderViewModel(viewModel, viewModel.mxReminderSuccessfullySetData(), false)
                    viewModel.currentPage = "account_screen"
                    reminderBottomSheet.show(
                        supportFragmentManager, "PatientReminderBottomSheet"
                    )
                    viewModel.sendReminderBottomSheetViewedEvent()
                }

            } else {
                Toast().showCustomToastMessage(
                    context,
                    getString(R.string.reminders_set_for_all_patients)
                )
            }

        })

        binding.addReminder.setOnClickListener {
            if (isReminderFlow()) {
                //need to clear list if for drop down reminder set because if all reminder delete then in
                // reminderAdapterList
                viewModel.reminderAdapterList.value = emptyList()
                reminderBottomSheet.isCancelable = true
                if (!reminderBottomSheet.isVisible)
                    viewModel.addReminderFromOrderStatusActivity.value = false
                viewModel.addReminderTitle.value = "Set reminder"
                reminderBottomSheet.setReminderViewModel(viewModel, viewModel.mxReminderSuccessfullySetData(), false)
                viewModel.currentPage = "account_screen"
                reminderBottomSheet.show(
                    supportFragmentManager, "PatientReminderBottomSheet"
                )
                viewModel.sendReminderBottomSheetViewedEvent()

            } else {
                navigateToSearchSuggestionActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "pill_reminder",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "start_ordering"
                    ),
                    flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )
            }
        }

        viewModel.eventDeleteReminder.observe(this, EventObserver {
            reminderDeleteFragment.isCancelable = true
            if (!reminderDeleteFragment.isVisible) {
                viewModel.currentPage = "account_screen"
                reminderDeleteFragment.setReminderViewModel(viewModel, (it))
                reminderDeleteFragment.show(
                    supportFragmentManager, "DeleteReminderBottomSheet"
                )
            }

        })


        viewModel.eventEditReminder.observe(this) {
            reminderEditFragment = ReminderEditFragment()
            viewModel.currentPage = "account_screen"
            reminderEditFragment.setReminderViewModel(viewModel)
            reminderEditFragment.isCancelable = true
            if (!reminderEditFragment.isVisible) {
                reminderEditFragment.show(
                    supportFragmentManager, "EditReminderBottomSheet"
                )
                viewModel.sendReminderEditClickedEvent()
            }

        }

        /****
         * 1) Update button and Text view text on the basis of isFtc.
         */
        setButtonOrTitleText()
        updateStatusBarColor()
        setEventListener()

        viewModel.showReminderPatientList.observe(this) {
            if (it) {
                binding.header.setUpMobileSectionHeadersData(
                    MobileSectionHeadersModel(
                        "Set Reminder",
                        "",
                        "",
                        "Add Reminder",
                        0,
                        ContextCompat.getDrawable(applicationContext, R.drawable.ic_plus_reminder),
                        null
                    )
                )
            } else {
                binding.header.setUpMobileSectionHeadersData(
                    MobileSectionHeadersModel(
                        "Set Reminder",
                        "",
                        "",
                        null,
                        0,
                        ContextCompat.getDrawable(applicationContext, R.drawable.ic_plus_reminder),
                        null
                    )
                )
            }
        }

    }

    override fun extractIntentData(){
        intent.extras?.let { bundle ->
            viewModel.currentPage = bundle.getString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE).toString()
        }
    }
    private fun setButtonOrTitleText() {
        if (isReminderFlow()) {
            binding.tvPlaceholder.text =
                getString(R.string.set_an_order_reminder_and_never_run_out_of_medicines)
            binding.addReminder.text = getString(R.string.add_a_reminder)
        } else {
            binding.tvPlaceholder.text = getString(R.string.place_an_order_and_set_your_reminder)
            binding.addReminder.text = getString(R.string.place_an_order)
        }
    }

    private fun setEventListener() {
        viewModel.eventMessage.observe(this, EventObserver {
            if (it != null) {
                if (it.equals(MESSAGES.DELETE_REMINDER_SUCCESSFULLY)) {
                    /***
                     * This is called to clear cache
                     */
                    binding.rvReminderList.removeAllViewsInLayout()
                    viewModel.getReminderList()
                } else if (it.equals(MESSAGES.SET_REMINDER_SUCCESSFULLY)) {
                    binding.rvReminderList.removeAllViewsInLayout()
                    viewModel.getReminderList()
                }
            }
        })
    }


    private fun isReminderFlow(): Boolean {
        return (SharedPrefManager.getInstance().activeOrderCount > 0
                || SharedPrefManager.getInstance().deliveredOrderCount > 0)
    }

//    override fun onBackPressed() {
//        finish()
//        overridePendingTransition(0, R.anim.slide_out)
//        super.onBackPressed()
//
//    }
}