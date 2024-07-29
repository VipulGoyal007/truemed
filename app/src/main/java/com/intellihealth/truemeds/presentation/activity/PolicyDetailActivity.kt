package com.intellihealth.truemeds.presentation.activity

import android.content.Context
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.constants.MobileSectionTypeConstants
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.helpfaqtnc.PrivacyPolicyAndTnCResponse
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.databinding.ActivityPoliciesPageBinding
import com.intellihealth.truemeds.databinding.ActivityPolicyDetailBinding
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.PolicyTncViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class PolicyDetailActivity : BaseActivity() {

    private val binding by viewBinding(ActivityPolicyDetailBinding::inflate)
    private lateinit var viewModel: PolicyTncViewModel
    private lateinit var privacyTncResponse: PrivacyPolicyAndTnCResponse.Legal
    var receivedData = ""
    var isPrimary = true
    private lateinit var context: Context
    // Initialize the custom loader
//    private lateinit var customLoader: CustomLoader

    override fun extractIntentData() {
        intent.extras?.let { bundle ->
            receivedData = bundle.getString("key").toString()
            isPrimary = bundle.getBoolean("isPrimary", true) ?: true
        }
        /*  receivedData = intent?.getStringExtra("key").toString()
        isPrimary = intent?.getBooleanExtra("isPrimary", true) ?: true*/
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_policy_detail)

        extractIntentData()
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[PolicyTncViewModel::class.java]
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        lifecycle.addObserver(viewModel)
        context = this
//        customLoader = CustomLoader(this)

        //Set view model as lifecycle observer of the activity
        initView()
        updateStatusBarColor()
        setObservers()
    }

    private fun initView() {
        val header = MobileSectionHeadersModel(
            headerText = if (receivedData == "Terms Condition") "Terms & Conditions" else "Privacy Policy",
            cartCount = 0,
            buttonText = null,
            subHeaderText = null,
            subHeaderTextTwo = null
        )
        binding.txtHeader.setUpMobileSectionHeadersData(header)
        binding.txtHeader.setMobileSectionHeadersViewType(MobileSectionTypeConstants.DEFAULT_WITH_FILL)
        binding.txtHeader.setBackArrowClickCallback(object :
            BackArrowClickCallback {
            override fun onBackArrowClick() {
                overridePendingTransition(0, R.anim.slide_out)
                finish()
            }
        })
        // Receive data from the Intent
        // Receive data from the Intent
        if (receivedData.equals("Privacy Policy")) {
            viewModel.getPrivacyPolicyDescription(context)
        } else {
            viewModel.getTermsConditionDescription(context, isPrimary)
        }

        binding.txtHeader.setUpMobileSectionHeadersData(
            MobileSectionHeadersModel(
                receivedData, "", "",
                "", 0
            )
        )
        getPolicyTnCData()
    }

    private fun getPolicyTnCData() {
        viewModel.privacyTncResponse.observe(this, EventObserver {
            if (!it.isNullOrEmpty()) {
                var description = it[0].description ?: ""
                description = description.replace("\\r".toRegex(), "\n")
                description = description.replace("\\\n", System.getProperty("line.separator"))
                binding.privacyTncData = it[0]
                binding.description = description
            }
        })
    }

    private fun setObservers() {
        viewModel.eventMessage.observe(this, EventObserver {

            if (it.equals(MESSAGES.NO_NETWORK)) {
                showDialogBox(PopUpType.INTERNET_FAILURE, object : PopUpDialogCallback {
                    override fun onActionButtonClicked() {
                        // apiType=1 is for privacy policy description api calling
                        if (viewModel.apiType == 1)
                            viewModel.getPrivacyPolicyDescription(context)
                        // apiType=2 is for terms and conditions description api calling
                        else if (viewModel.apiType == 2)
                            viewModel.getTermsConditionDescription(context, isPrimary)

                    }

                    override fun onCloseButtonClicked() {
                        finish()
                    }
                }, true)
            }


        })


    }


//    override fun onBackPressed() {
//        finish()
//        overridePendingTransition(0, R.anim.slide_out)
//        super.onBackPressed()
//
//    }
}