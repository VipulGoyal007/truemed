package com.intellihealth.truemeds.presentation.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.constants.InputFieldConstants
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.home.PopUpModel
import com.intellihealth.truemeds.databinding.ActivityProductListViewAllBinding
import com.intellihealth.truemeds.databinding.ActivityReferAndEarnBinding
import com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase
import com.intellihealth.truemeds.presentation.analytics.FirebaseEvent
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.dialog.PopUpDialog
import com.intellihealth.truemeds.presentation.fragment.ReferAndEarnFragment
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel
import com.intellihealth.truemeds.presentation.viewmodel.ReferNEarnViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ReferAndEarnActivity : BaseActivity() {

    private val binding by viewBinding(ActivityReferAndEarnBinding::inflate)
    private lateinit var viewModel: ReferNEarnViewModel
    @Inject
    lateinit var firebaseEventUseCase: FirebaseEventUseCase
    private var autoClaimReferCode = ""
    override fun extractIntentData(){
        intent.extras?.let { bundle ->

            if (bundle.containsKey("autoClaimCode")) {
                autoClaimReferCode =
                    bundle.getString("autoClaimCode").toString()

                val code = autoClaimReferCode.lowercase()
                viewModel.redeemReferralCode(
                    this,
                    SharedPrefManager.getInstance().loggedInUserId,
                    SharedPrefManager.getInstance().loggedInUserMobile, code
                )
            }
    }}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        firebaseEventUseCase.logFirebaseEvent(FirebaseEvent.FIREBASE_REFER_AND_EARN_VIEW,"ReferNEarn")
        viewModel = ViewModelProvider(this)[ReferNEarnViewModel::class.java]
        setContentView(binding.root)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        //getIntentAndProcess()

        extractIntentData()
        setupMobileSectionHeader()
        openReferAndEarnFragment()
        binding.header.setBackArrowClickCallback(object :
            BackArrowClickCallback {
            override fun onBackArrowClick() {
                overridePendingTransition(0, R.anim.slide_out)
                finish()
            }
        })

        updateStatusBarColor()
    }

    private fun getIntentAndProcess(){
      /*  if(intent.hasExtra("autoClaimCode") && intent.getStringExtra("autoClaimCode")!=null){
            autoClaimReferCode = intent.getStringExtra("autoClaimCode").toString()
            val code = autoClaimReferCode.lowercase()
            viewModel.redeemReferralCode(
                this,
                SharedPrefManager.getInstance().loggedInUserId,
                SharedPrefManager.getInstance().loggedInUserMobile, code
            )
        }*/


    }

    private fun setupMobileSectionHeader() {
        binding.header.setUpMobileSectionHeadersData(
            MobileSectionHeadersModel(
                "Refer and Earn", "", "", "", 0,
                null, ContextCompat.getDrawable(applicationContext, R.drawable.ic_back_arrow)
            )
        )
        viewModel.loaderValue.observe(this) {
            if (!it) {
                //openReferAndEarnFragment()
            }

        }


        viewModel.redeemResponse.observe(this) { it ->
            it?.responseData?.Success?.let { _ ->
                val tmWalletAmount = HomeViewModel.tmWallet.value ?: 0.0
                HomeViewModel.tmWallet.postValue(tmWalletAmount.plus(200))
                var dialog: PopUpDialog? = null
                val rewardSuccess = PopUpModel(
                    icon = R.drawable.ic_reward,
                    header = getString(R.string.you_have_received_200),
                    message = getString(R.string.amount_credited_to_tm_rewards),
                    buttonText = getString(R.string.order_now),
                )
                val callback = object : PopUpDialogCallback {
                    override fun onActionButtonClicked() {


                    }

                    override fun onCloseButtonClicked() {
                        dialog?.let { it1 ->
                            it1.dismiss()
                        }
                    }

                    override fun onDismissOutside() {
                        dialog?.let { it1 ->
                            it1.dismiss()
                        }
                    }

                }

                dialog = PopUpDialog(model = rewardSuccess, callback = callback)
                if (!dialog.isVisible)
                    this.supportFragmentManager.let { dialog.show(it, "RewardSuccess") }
            }

        }


    }

    private fun openReferAndEarnFragment() {
        val fragment = ReferAndEarnFragment()
        val bundle = Bundle()
        bundle.putString("showHeader", "hide")
        bundle.putString("autoClaimReferCode",autoClaimReferCode)
        fragment.arguments = bundle
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.referNEarnContainer, fragment)
            .commit()
        viewModel.setEventReferralScreenViewed(false)
    }

//    override fun onBackPressed() {
//        finish()
//        overridePendingTransition(0, R.anim.slide_out)
//        super.onBackPressed()
//
//    }

}