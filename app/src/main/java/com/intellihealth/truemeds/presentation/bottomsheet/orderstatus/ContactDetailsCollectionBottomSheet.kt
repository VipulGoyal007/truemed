package com.intellihealth.truemeds.presentation.bottomsheet.orderstatus

import android.app.Dialog
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isNotEmpty
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.intellihealth.salt.constants.InputFieldConstants
import com.intellihealth.salt.views.Toast
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.databinding.BottomsheetAlternateNumberBinding
import com.intellihealth.truemeds.presentation.activity.OrderStatusActivity
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel


class ContactDetailsCollectionBottomSheet() : BottomSheetDialogFragment() {
    private lateinit var binding: BottomsheetAlternateNumberBinding
    private lateinit var dialog: BottomSheetDialog
    private var enteredMobileNo: String = ""
    var viewModel: OrderStatusViewModel?=null
    var orderId: Long=0
    var alternateNumber: String = ""
    var isEdit: Boolean = false
    private var enteredEmailId: String = ""
    private var isAddAlternateEmail: Boolean = false

    constructor(
        viewModel: OrderStatusViewModel,
        orderId: Long,
        alternateNumber: String? = "",
        isEdit: Boolean = false,
        isAddAlternateEmail : Boolean = false
    ) : this(){
        this.viewModel = viewModel
        this.orderId = orderId
        this.alternateNumber= alternateNumber?:""
        this.isEdit=isEdit
        this.isAddAlternateEmail = isAddAlternateEmail
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(
                inflater,
                R.layout.bottomsheet_alternate_number,
                container,
                false
            )
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        clickListeners()
        binding.etAlternateNumber.setInputFieldData(alternateNumber)

        if(isEdit){
            binding.btnDeleteNum.visibility = View.VISIBLE
            binding.btnAdd.setTitle("Save")
            binding.btnAdd.setEnable(false)

            binding.btnDeleteNum.setOnClickListener {
                viewModel?.isFromDeleteAlternateNumber = true
                if (isNetworkAvailable(requireContext())) {
                    binding.progressBar.visibility = View.VISIBLE
                    viewModel?.deleteAlternateNumberClick(orderId, alternateNumber)
                }
            }
        }else{
            binding.btnAdd.setTitle("Add")
            binding.btnDeleteNum.visibility = View.GONE
            binding.btnAdd.setEnable(true)
        }

        if(isAddAlternateEmail){
            with(binding){
                etAlternateNumber.setHintText(getString(R.string.enter_your_email_id))
                tvHeader.text = getString(R.string.add_email_id)
                etAlternateNumber.setInputTypeLayout(2)
                binding.btnAdd.setTitle("Save")
            }
        }else{
            binding.etAlternateNumber.setMaxLineLength(10)
        }


        viewModel?.showError?.value = null

        setObserver()
    }

    private fun setObserver(){

        viewModel?.showToast?.observe(viewLifecycleOwner){ message ->
            message?.let {
                Toast().showCustomToastMessage(
                    requireActivity(),
                    it
                )
            }
        }
    }

    private fun clickListeners() {
        binding.imageClose.setOnClickListener {
            dismiss()
        }

        binding.btnAdd.setOnClickListener {
            if(binding.btnAdd.getEnable() == false){return@setOnClickListener}

            binding.etAlternateNumber.setUpState(InputFieldConstants.STATE_DEFAULT)
            binding.etAlternateNumber.setHelperText(
                "", InputFieldConstants.STATE_DEFAULT
            )

            if(isAddAlternateEmail){
                if (enteredEmailId.isNotEmpty()) {
                    if (isNetworkAvailable(requireContext())) {
                        binding.progressBar.visibility = View.VISIBLE
                        viewModel?.saveCustomerEmailAddress(emailId = enteredEmailId.trim())
                    } else {
                        (activity as OrderStatusActivity).showDialogBox(
                            popUpType = PopUpType.INTERNET_FAILURE,
                            object : PopUpDialogCallback {
                                override fun onActionButtonClicked() {}
                                override fun onCloseButtonClicked() {
                                }
                            }, true
                        )
                    }
                }else{
                    binding.etAlternateNumber.setUpState(InputFieldConstants.STATE_ERROR)
                    binding.etAlternateNumber.setHelperText(
                        "Please enter a valid Email id",
                        InputFieldConstants.STATE_ERROR
                    )
                }
            }else{
                if (!enteredMobileNo.isNullOrEmpty()) {
                    enteredMobileNo?.let {
                        if (SharedPrefManager.getInstance().loggedInUserMobile.equals(enteredMobileNo)) {
                            binding.etAlternateNumber.setUpState(InputFieldConstants.STATE_ERROR)
                            binding.etAlternateNumber.setHelperText(
                                "This mobile number is already registered",
                                InputFieldConstants.STATE_ERROR
                            )
                        } else {
                            if (isNetworkAvailable(requireContext())) {
                                binding.progressBar.visibility = View.VISIBLE
                                viewModel?.addAlternateNumberClick(orderId, enteredMobileNo)
                            } else {
                                (activity as OrderStatusActivity).showDialogBox(
                                    popUpType = PopUpType.INTERNET_FAILURE,
                                    object : PopUpDialogCallback {
                                        override fun onActionButtonClicked() {}
                                        override fun onCloseButtonClicked() {
                                        }
                                    }, true
                                )
                            }
                        }


                    }
                } else if(enteredMobileNo.isEmpty()){
                    binding.etAlternateNumber.setUpState(InputFieldConstants.STATE_ERROR)
                    binding.etAlternateNumber.setHelperText(
                        "Please enter a mobile number",
                        InputFieldConstants.STATE_ERROR
                    )
                }else {
                    binding.etAlternateNumber.setUpState(InputFieldConstants.STATE_ERROR)
                    binding.etAlternateNumber.setHelperText(
                        "Please enter a valid mobile number",
                        InputFieldConstants.STATE_ERROR
                    )
                }
            }
        }
        binding.etAlternateNumber.setInputFieldCallback(
            { etData ->

            },
            object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {
                    if(isAddAlternateEmail){
                        enteredEmailId = s.toString()
                        if(binding.etAlternateNumber.isNotEmpty()){
                            binding.btnAdd.setEnable(true)
                        }else{
                            binding.btnAdd.setEnable(false)
                        }
                    }else{
                        enteredMobileNo = s.toString()
                        if(!enteredMobileNo.equals(alternateNumber)){
                            binding.btnAdd.setEnable(true)
                        } else{
                            binding.btnAdd.setEnable(false)
                        }
                    }

                }

                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                }

                override fun onTextChanged(
                    s: CharSequence?,
                    start: Int,
                    before: Int,
                    count: Int
                ) {

                }
            })

        viewModel?.showError?.observe(viewLifecycleOwner) { error ->
            if(viewModel?.isFromDeleteAlternateNumber == true){
                binding.etAlternateNumber.setInputFieldData("")
                dismiss()
//                if(error != null) Toast().showCustomToastMessage(context, error)
            } else if (!error.isNullOrEmpty()) {
                binding.etAlternateNumber.setUpState(InputFieldConstants.STATE_ERROR)
                binding.etAlternateNumber.setHelperText(error, InputFieldConstants.STATE_ERROR)
            } else if (error != null && error.isEmpty()) {
                binding.etAlternateNumber.setHelperText("", InputFieldConstants.STATE_SUCCESS)
                dismiss()
                viewModel?.showError?.value = null
            }
            binding.progressBar.visibility = View.GONE
        }

    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        dialog = BottomSheetDialog(requireContext(), theme)
        (dialog as BottomSheetDialog).behavior.state= BottomSheetBehavior.STATE_EXPANDED
        return dialog
    }


    override fun getTheme() = R.style.BottomSheetDialog


}