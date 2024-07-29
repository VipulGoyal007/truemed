package com.intellihealth.truemeds.presentation.bottomsheet

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.intellihealth.salt.callbacks.DropDownListener
import com.intellihealth.salt.constants.DropDownState
import com.intellihealth.salt.views.Toast
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.BottomSheetCloseCallback
import com.intellihealth.truemeds.data.model.mixpanel.MxReminderSuccessfullySet
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.databinding.FragmentReminderBottomSheetBinding
import com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase
import com.intellihealth.truemeds.presentation.analytics.FirebaseEvent
import com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class AddReminderBottomSheet() : BottomSheet() {

    private lateinit var binding: FragmentReminderBottomSheetBinding
    private lateinit var viewModel: ReminderViewModel
    private lateinit var dialog: BottomSheetDialog
    private var mxReminderSuccessfullySet: MxReminderSuccessfullySet = MxReminderSuccessfullySet()
    private var isFromOrderStatusActivity : Boolean = false

    private var bottomSheetCloseCallback: BottomSheetCloseCallback?=null
    var patientName: String = ""
    @Inject
    lateinit var firebaseEventUseCase: FirebaseEventUseCase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun setReminderViewModel(viewModel: ReminderViewModel, mxReminderSuccessfullySet: MxReminderSuccessfullySet, isFromOrderStatusActivity : Boolean) {
        this.viewModel = viewModel
        this.mxReminderSuccessfullySet = mxReminderSuccessfullySet
        this.isFromOrderStatusActivity = isFromOrderStatusActivity
    }
    fun setReminderViewModelForOrderStatus(viewModel: ReminderViewModel, bottomSheetCloseCallback: BottomSheetCloseCallback) {
        this.viewModel = viewModel
        this.bottomSheetCloseCallback = bottomSheetCloseCallback
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_reminder_bottom_sheet, container,
            false
        )
        binding.lifecycleOwner = this

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //viewModel = ViewModelProvider(this)[ReminderViewModel::class.java]
//        binding.lifecycleOwner = this
        if(::viewModel.isInitialized) {
            binding.viewModel = viewModel
            viewModel.getPatientNameList()
            viewModel.getFrequencyList()
            viewModel.eventDefaultNameDropDown.observe(viewLifecycleOwner) {
                if (viewModel.patientName.value!!.size > 1 || viewModel.patientName.value.isNullOrEmpty()) {
                    binding.dropDownHeader.setLabel(getString(R.string.select_a_patient_name))
                } else {
                    binding.dropDownHeader.setLabel(viewModel.patientName.value!![0].title)
                    patientName = viewModel.patientName.value!![0].title
                    viewModel.alertReminderNameValue.postValue(viewModel.patientName.value!![0].title)
                    viewModel.addPatientId.value = viewModel.patientName.value!![0].id
                    viewModel.editReminderPatientId.value =
                        viewModel.patientName.value!![0].id.toLong()

                }
            }
            binding.dropDownHeader.setOnClickListener {
                if (viewModel.patientName.value!!.size > 1) {
                    if (viewModel.patientName.value.isNullOrEmpty()) {
                        binding.tmDropDownPatientList.visibility = View.GONE
                    } else {
                        if (binding.tmDropDownPatientList.isVisible) {
                            binding.dropDownHeader.setStateOpen(DropDownState.CLOSED)
                            binding.tmDropDownPatientList.visibility = View.GONE

                        } else {
                            binding.dropDownHeader.setStateOpen(DropDownState.OPEN)
                            binding.tmDropDownPatientList.visibility = View.VISIBLE
                        }
                    }
                } else {
                    binding.tmDropDownPatientList.visibility = View.GONE
                }
            }
            viewModel.patientName.observe(viewLifecycleOwner) {
                binding.tmDropDownPatientList.setAdapter(
                    object : DropDownListener {
                        override fun dropDownData(id: Int, data: String) {
                            viewModel.addPatientId.value = id
                            viewModel.editReminderPatientId.value = id.toLong()
                            binding.dropDownHeader.setLabel(data)
                            patientName = data
                            viewModel.alertReminderNameValue.postValue(data)
                            binding.tmDropDownPatientList.visibility = View.GONE
                            binding.dropDownHeader.setStateOpen(DropDownState.CLOSED)
                        }

                        override fun dropDownCount(count: Int) {
                            binding.dropDownHeader.setStateSelected(count > 0)
                        }
                    },
                    it, false
                )
            }
            binding.setReminder.setOnClickListener {
                val reminderAlertFragment = ReminderAlertFragment()
                reminderAlertFragment.isCancelable = true
                if (viewModel.addReminderFromOrderStatusActivity.value!!) {
                    patientName = viewModel.alertReminderNameValue.value!!
                }
                if (patientName.isEmpty()) {
                    Toast().showCustomToastMessage(
                        context,
                        getString(R.string.please_select_patient)
                    )
                    return@setOnClickListener
                } else if (viewModel.reminderFrequency.value!! <= 0) {
                    Toast().showCustomToastMessage(
                        context,
                        getString(R.string.please_select_reminder_interval)
                    )
                    return@setOnClickListener
                } else {
                    reminderAlertFragment.setReminderViewModel(viewModel, bottomSheetCloseCallback)
                    reminderAlertFragment.show(
                        requireActivity().supportFragmentManager, "ReminderAlertBottomSheet"
                    )
//                viewModel.editReminderFrequency.postValue(viewModel.reminderFrequency.value)
                    patientName = ""
                    viewModel.reminderFrequency.postValue(0)
                    if (isFromOrderStatusActivity) {
                        mxReminderSuccessfullySet.reminderFrequency =
                            viewModel.reminderFrequency.value!!.toDouble()
                        mxReminderSuccessfullySet.reminderDate =
                            viewModel.convertMillisToDateFormat(viewModel.editReminderDateValue)
                        viewModel.currentPage = "order_status_screen"
                        viewModel.addReminder(mxReminderSuccessfullySet)
                        firebaseEventUseCase.logFirebaseEvent(
                            FirebaseEvent.FIREBASE_PATIENT_AND_REMINDER_SET_BUTTON_ORDER_STATUS,
                            ""
                        )
                    } else {
                        viewModel.addReminder(viewModel.mxReminderSuccessfullySetData())
                    }
                    dismiss()
                }
            }
        }
        binding.imClose.setOnClickListener {
            if(::viewModel.isInitialized) {
                viewModel.closeAddReminder.postValue(true)
            }
            dismiss()
        }

        setEventListener()
    }

    override fun onDestroy() {
        super.onDestroy()
        if(::viewModel.isInitialized)
            viewModel.reminderFrequency.postValue(0)
        patientName = ""
    }

    private fun setEventListener() {
        if(::viewModel.isInitialized) {
            viewModel.eventMessage.observe(this, EventObserver {
                if (it != null) {
                    if (it.equals(MESSAGES.SET_REMINDER_SUCCESSFULLY)) {
                        Toast().showCustomToastMessage(context, "Add Reminder Successfully")
                        dismiss()
                    } else if (it.equals(MESSAGES.SET_REMINDER_FAILED)) {
                        Toast().showCustomToastMessage(context, "Add Reminder Failed")
                        dismiss()
                    }
                }
            })
        }
    }


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        dialog = BottomSheetDialog(requireContext(), theme)
        setUpBottomSheetBehaviour(
            dialog,
            false,
            6,
            80
        )


        return dialog
    }

    override fun getTheme() = R.style.BottomSheetDialog
}