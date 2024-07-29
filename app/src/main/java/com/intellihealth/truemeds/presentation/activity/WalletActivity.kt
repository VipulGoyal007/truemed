package com.intellihealth.truemeds.presentation.activity

import android.app.ActivityOptions
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.core.os.bundleOf
import androidx.core.view.updateLayoutParams
import androidx.lifecycle.ViewModelProvider
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.callbacks.FaqCallBack
import com.intellihealth.salt.models.FaqModel
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.salt.views.cards.ActionCardCallback
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.helpfaqtnc.FaqCategoryResponse
import com.intellihealth.truemeds.data.model.home.PopUpModel
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.databinding.ActivityWalletBinding
import com.intellihealth.truemeds.domain.navigation.navigateToPolicyDetailActivity
import com.intellihealth.truemeds.domain.navigation.navigateToWalletTransactionActivity
import com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.dialog.PopUpDialog
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.CommonFunc.isSingleClickParam
import com.intellihealth.truemeds.presentation.utils.ShareSheet
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.WalletViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WalletActivity : BaseActivity() {

    private val binding by viewBinding(ActivityWalletBinding::inflate)
    private lateinit var viewModel: WalletViewModel
    private val handler = Handler()
    var anim = Bundle()

    override fun extractIntentData() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()
        viewModel = ViewModelProvider(this)[WalletViewModel::class.java]
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        viewModel.pageName = "WalletActivity"
        checkForNetworkAndDoApiCallings()
        setupData()
        setAndObserveData()
        updateStatusBarColor()
        viewModel.sendTmWalletViewed()
        setupBackPressedAction()
    }

    private fun setupData() {

        anim = ActivityOptions.makeCustomAnimation(
            this@WalletActivity,
            R.anim.slide_in, 0
        ).toBundle()

        /***
         *  setting data for mobile section header
         */
        binding.mobileSectionHeaderWallet.setUpMobileSectionHeadersData(
            MobileSectionHeadersModel(
                "TM Wallet", "", "", "", 20,
                null
            )
        )
        binding.mobileSectionHeaderWallet.setBackArrowClickCallback(object :
            BackArrowClickCallback {
            override fun onBackArrowClick() {
                viewModel.sendTmWalletBackFirebaseEvent(
                    FirebaseEventModel(
                        mobile = SharedPrefManager.getInstance().loggedInUserMobile,
                        customerId = SharedPrefManager.getInstance().loggedInUserId,
                        pageName = "PatientProfile"
                    )
                )
                overridePendingTransition(0, R.anim.slide_out)
                finish()
            }
        })

        binding.clRewardSection.setOnClickListener {
            if (isSingleClickParam()) {
                openWalletTransaction(true)
            }
        }

        binding.textViewRewardTransactions.setOnClickListener {
            if (isSingleClickParam()) {
                openWalletTransaction(true)
                viewModel.sendTmWalletRewardTransactions()
            }
        }

        binding.clCreditSection.setOnClickListener {
            if (isSingleClickParam()) {
                openWalletTransaction(false)
            }
        }

        binding.textViewCreditTransactions.setOnClickListener {
            if (isSingleClickParam()) {
                openWalletTransaction(false)
                viewModel.sendTmWalletCreditTransactions()
            }
        }
        binding.tmActionWalletCard.setCallback(object : ActionCardCallback {
            override fun viewClickCallback(type: Int) {
                if (!viewModel.shareCode.value.isNullOrEmpty()) {
                    val title = getString(R.string.invite_your_friends_to_truemeds)
                    val textContent = viewModel.shareCode.value as String
                    handler.postDelayed({
                        ShareSheet.shareText(this@WalletActivity, title, textContent)
                    }, 100)

                    viewModel.sendReferAFriendClickedEvent()
                }
            }

            override fun viewCopyClick(type: Int) {
            }

        })
        binding.textViewTermsAndConditions.setOnClickListener {
            viewModel.sendTmWalletTermAndConditionFirebaseEvent(
                FirebaseEventModel(
                    mobile = SharedPrefManager.getInstance().loggedInUserMobile,
                    customerId = SharedPrefManager.getInstance().loggedInUserId,
                    pageName = "TmWallet"
                )
            )
           /* startActivity(
                Intent(
                    this@WalletActivity, PolicyDetailActivity::class.java
                ).putExtra("key", "Terms & Condition").putExtra("isPrimary", false), anim
            )*/

            navigateToPolicyDetailActivity(
                params = bundleOf(
                    "key" to "Terms & Condition",
                    "isPrimary" to false
                ),
            )
        }

    }

    private fun openWalletTransaction(isRewardTransact: Boolean) {
        navigateToWalletTransactionActivity(
            params = bundleOf(
                BundleConstants.IS_REWARD_TRANSACTION to isRewardTransact
            )
        )
    }

    private fun setupBackPressedAction() {
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                viewModel.sendTmWalletBackFirebaseEvent(
                    FirebaseEventModel(
                        mobile = SharedPrefManager.getInstance().loggedInUserMobile,
                        customerId = SharedPrefManager.getInstance().loggedInUserId,
                        pageName = "PatientProfile"
                    )
                )
                finish()
            }
        })

        binding.faqList.setEventListner(object : FaqCallBack {
            override fun viewClickCallback(position: Int) {
                viewModel.sendTmWalletFaqFirebaseEvent(
                    FirebaseEventModel(
                        mobile = SharedPrefManager.getInstance().loggedInUserMobile,
                        customerId = SharedPrefManager.getInstance().loggedInUserId,
                        pageName = "TmWallet"
                    )
                )
            }

        })
    }

    private fun initViewModelApi() {
        viewModel.getWalletInfo(SharedPrefManager.getInstance().loggedInUserId)
        viewModel.getFaqCategoryWallet()
    }

    fun checkForNetworkAndDoApiCallings() {
        if (isNetworkAvailable(this@WalletActivity)) {
            initViewModelApi()
        } else {
            showDialogBox(PopUpType.INTERNET_FAILURE, object : PopUpDialogCallback {
                override fun onActionButtonClicked() {
                    checkForNetworkAndDoApiCallings()
                }

                override fun onCloseButtonClicked() {

                }
            }, true)
        }
    }

    private fun addFaq(faqlist: List<FaqCategoryResponse.Payload>) {
        val listDataHeader: MutableList<String> = ArrayList()
        var listDataChild: HashMap<String, List<String>> = HashMap()

        faqlist.forEachIndexed() { index, element ->
            val listAnswer: MutableList<String> = ArrayList()
            element.question?.let {
                listDataHeader.add(it)
            }
            element.answer?.let {
                listAnswer.add(it)
            }
            listDataChild[element.question.toString()] = listAnswer
        }
        binding.faqList.setUpData(FaqModel(listDataHeader, listDataChild))

    }

    private fun setAndObserveData() {
        viewModel.faqById.observe(this@WalletActivity) {
            it?.let { addFaq(it) }
        }
        viewModel.walletInfoResponse.observe(this@WalletActivity) {
            it?.let {
                if ((it.responseData?.tmCashTransactions ?: 0)
                    + (it.responseData?.tmCreditTransactions ?: 0) == 0
                ) {
                    binding.clRewardSection.visibility = View.GONE
                    binding.clCreditSection.visibility = View.GONE

                    val dpRatio: Float = resources.displayMetrics.density
                    val marginLeft = (16 as Int * dpRatio).toInt()
                    val marginTop = (36 as Int * dpRatio).toInt()
                    binding.textEarnRewardHeader.updateLayoutParams<ViewGroup.MarginLayoutParams> {
                        setMargins(marginLeft, marginTop, 0, 0)
                    }

                } else {
                    binding.clRewardSection.visibility = View.VISIBLE
                    binding.clCreditSection.visibility = View.VISIBLE
                    binding.textRewardAmount.text = String.format(
                        "₹%s",
                        CommonFunc.getNumberFormat().format(it.responseData?.tmCash)
                    )
                    binding.textCreditAmount.text = String.format(
                        "₹%s",
                        CommonFunc.getNumberFormat().format(it.responseData?.tmCredit)
                    )

                    val dpRatio: Float = resources.displayMetrics.density
                    val marginLeft = (16 as Int * dpRatio).toInt()
                    val marginTop = (24 as Int * dpRatio).toInt()

                    Log.i("pixelForDp", "" + marginLeft)
                    Log.i("pixelForDp", "" + marginTop)

                    binding.textEarnRewardHeader.updateLayoutParams<ViewGroup.MarginLayoutParams> {
                        setMargins(marginLeft, marginTop, 0, 0)
                    }
                }
                //it.responseData?.referNowHeaderMessage?.let { rewardHeader-> binding.tmActionWalletCard.setDescription(rewardHeader) }
                viewModel.shareCode.postValue(it.responseData?.shareText)
            }
        }
        viewModel.loaderValue.observe(this@WalletActivity) {
            if (it) binding.progressBar.visibility = View.VISIBLE
            else binding.progressBar.visibility = View.GONE
        }
    }

    private fun showNoInternetDialog() {
        val noInternet = PopUpModel(
            icon = R.drawable.ic_no_internet,
            header = getString(R.string.noInternetConnection),
            message = getString(R.string.noInternetMessage),
            buttonText = getString(R.string.try_again),
        )
        val callback = object : PopUpDialogCallback {
            override fun onActionButtonClicked() {
                initViewModelApi()
            }

            override fun onCloseButtonClicked() {
            }
        }
        val dialog = PopUpDialog(model = noInternet, callback = callback)
        dialog.isCancelable = true
        if (!dialog.isVisible)
            this@WalletActivity?.supportFragmentManager?.let { dialog.show(it, "WalletActivity") }
    }
}