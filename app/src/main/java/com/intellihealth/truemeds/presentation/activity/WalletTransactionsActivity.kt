package com.intellihealth.truemeds.presentation.activity

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.callbacks.FaqCallBack
import com.intellihealth.salt.models.FaqModel
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.TimeIntervalCallback
import com.intellihealth.truemeds.data.model.helpfaqtnc.FaqCategoryResponse
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.databinding.ActivityWalletBinding
import com.intellihealth.truemeds.databinding.ActivityWalletTranasctionsBinding
import com.intellihealth.truemeds.domain.navigation.navigateToPolicyDetailActivity
import com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase
import com.intellihealth.truemeds.presentation.adapter.TransactionItemAdapter
import com.intellihealth.truemeds.presentation.analytics.FirebaseEvent
import com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel
import com.intellihealth.truemeds.presentation.bottomsheet.wallet.ChooseTimeIntervalBottomSheet
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.CommonFunc.isSingleClickParam
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.WalletViewModel
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import javax.inject.Inject

@AndroidEntryPoint
class WalletTransactionsActivity : BaseActivity() {

    private val binding by viewBinding(ActivityWalletTranasctionsBinding::inflate)
    private lateinit var viewModel:WalletViewModel
    private var isRewardTransaction: Boolean = false
    private var selectedTimeIntervalFromBottomSheet: String ? = "Recent"
    private var strFromDate: String = ""
    private var strToDate: String = ""
    var strSelectedCustomDate: String = ""
    private var selectedDateFromBottomSheet: Date? = null
    private var selectedDateToBottomSheet: Date? = null
    private var bottomSheet: ChooseTimeIntervalBottomSheet? =null
    private var isFirstTimeDataLoaded: Boolean = false
    var anim = Bundle()

    @Inject
    lateinit var firebaseEventUseCase: FirebaseEventUseCase
    override fun extractIntentData(){
        intent.extras?.let { bundle ->
            isRewardTransaction = bundle.getBoolean(BundleConstants.IS_REWARD_TRANSACTION)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()
      //  isRewardTransaction = intent.getBooleanExtra(BundleConstants.IS_REWARD_TRANSACTION, false)

        extractIntentData()

        binding.isRewardTransaction = isRewardTransaction
        viewModel = ViewModelProvider(this)[WalletViewModel::class.java]
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        viewModel.pageName="WalletTransactionsActivity"
        setupOnBackPresses()
        viewModel.sendTmWalletTransactionFirebaseEvent(isRewardTransaction,
            FirebaseEventModel(
                mobile = SharedPrefManager.getInstance().loggedInUserMobile,
                customerId = SharedPrefManager.getInstance().loggedInUserId,
                pageName = "TmWallet"
            )
        )

        viewModel.isRewardTransaction.postValue(isRewardTransaction)
        setupData()
        /*if (NetworkConnectivityUtil.isNetworkConnected(this@WalletTransactionsActivity)) {
            initViewModelApi()
        }else{
            showNoInternetDialog()
            binding.progressBar.visibility = View.GONE
        }

         */
        checkForNetworkAndDoApiCallings()
        setAndObserveData()
        updateStatusBarColor()
    }

    private fun setupData() {

        anim = ActivityOptions.makeCustomAnimation(
            this@WalletTransactionsActivity,
            R.anim.slide_in, 0
        ).toBundle()

        /***
         *  setting data for mobile section header
         */
        val headerText = if(isRewardTransaction) "TM Rewards" else "TM Credits"
        binding.mobileSectionHeaderWalletTransactions.setUpMobileSectionHeadersData(
            MobileSectionHeadersModel(
                headerText, "", "", "", 20,
                null
            )
        )
        binding.mobileSectionHeaderWalletTransactions.setBackArrowClickCallback(object :
            BackArrowClickCallback {
            override fun onBackArrowClick() {
                backFirebaseEventCall()
                onBackPressed()
            }
        })
        val customDateCallback = object:TimeIntervalCallback {
            override fun selectedCustomTimeIntervalCallback(
                selectedFromDate: Date,
                selectedToDate: Date
            ) {
                strFromDate = SimpleDateFormat("yyyy-MM-dd").format(selectedFromDate)
                strToDate = SimpleDateFormat("yyyy-MM-dd").format(selectedToDate)
                strSelectedCustomDate = SimpleDateFormat("MMM. dd,yyyy").format(selectedFromDate).plus(" to ").plus(SimpleDateFormat("MMM. dd,yyyy").format(selectedToDate))
                binding.textSelectedCustomDates.text = strSelectedCustomDate
                selectedDateFromBottomSheet = selectedFromDate
                selectedDateToBottomSheet = selectedToDate
                bottomSheet?.dismiss()
            }

            override fun selectedTimeIntervalCallback(selectedTimeInterval: String?) {
                Log.d("TAG", "selectedTimeIntervalCallback: $selectedTimeInterval")
                selectedTimeIntervalFromBottomSheet = selectedTimeInterval
                viewModel.selectedTimeIntervalFromBottomSheet.postValue(selectedTimeInterval)
                binding.textViewRewardTransactions.text = selectedTimeIntervalFromBottomSheet
            }

            override fun onEditCustomDatesClicked() {

            }
        }
        binding.textViewRewardTransactions.setOnClickListener {
            if (isSingleClickParam()) {
                bottomSheet = ChooseTimeIntervalBottomSheet(
                    selectedDateFromBottomSheet,
                    selectedDateToBottomSheet,
                    strSelectedCustomDate,
                    viewModel.timeIntervalBottomSheetData,
                    customDateCallback,
                    viewModel.selectedTimeIntervalFromBottomSheet.value
                )
                bottomSheet?.isCancelable = true
                if (bottomSheet?.isVisible == false)
                    bottomSheet?.show(supportFragmentManager, "ChooseTimeIntervalBottomSheet")


            }
        }
        binding.textViewTermsAndConditionsTransactions.setOnClickListener {
           /* startActivity(
                Intent(
                    this@WalletTransactionsActivity, PolicyDetailActivity::class.java
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

    private fun backFirebaseEventCall() {
        if (isRewardTransaction){
            firebaseEventUseCase.logFirebaseEvent(FirebaseEvent.FIREBASE_TM_REWARDS_BACK,"TmTransaction")
        }else{
            firebaseEventUseCase.logFirebaseEvent(FirebaseEvent.FIREBASE_TM_CREDIT_BACK,"TmTransaction")
        }
    }

    private fun initViewModelApi() {
        Handler(Looper.getMainLooper()).postDelayed({
            if (isRewardTransaction) {
                viewModel.getFaqCategoryReward()
            } else {
                viewModel.getFaqCategoryCredit()
            }
        },150)
    }
    private fun setAndObserveData() {
        viewModel.faqById.observe(this@WalletTransactionsActivity) {
            if (it != null) {
                addFaq(it)
            }
        }
        viewModel.transactionList.observe(this@WalletTransactionsActivity){
            if (viewModel.getWalletTransactionsCount == 1 && it.isNullOrEmpty()) {
                binding.textViewRewardTransactions.visibility = View.GONE
            }
            it?.let {
                if(it.isNotEmpty()) {
                    binding.rvWalletTransaction.visibility = View.VISIBLE
                    binding.icNoRecords.visibility = View.GONE
                    val adapter = TransactionItemAdapter(list = it)
                    binding.rvWalletTransaction.adapter = adapter
                    binding.contentScroll.visibility = View.VISIBLE
                    if(!isFirstTimeDataLoaded)
                       isFirstTimeDataLoaded = true
                    viewModel.loaderValue.postValue(false)
                }else{
                    binding.rvWalletTransaction.visibility = View.GONE
                    binding.icNoRecords.visibility = View.VISIBLE
                    binding.contentScroll.visibility = View.VISIBLE
                    if(!isFirstTimeDataLoaded)
                       isFirstTimeDataLoaded = true
                    viewModel.loaderValue.postValue(false)

                }
            }
        }
        viewModel.selectedTimeIntervalFromBottomSheet.observe(this@WalletTransactionsActivity){
            when (it) {
                "Recent" -> {
                    if (isNetworkAvailable(this@WalletTransactionsActivity)) {
                        showRecentTransactionList()
                    }
                }
                "Last 7 Days" -> {
                   showLastSevenDaysTransactionList()
                }
                "Last Month" -> {
                  showLastMonthTransactionList()
                    callDateFilerFirebaseevent()
                }
                "This Month" -> {
                  showThisMonthTransactionList()
                    callDateFilerFirebaseevent()
                }
                "Custom Dates" -> {
                  showCustomTransactionList()
                    callDateFilerFirebaseevent()
                }
            }
        }
        viewModel.loaderValue.observe(this@WalletTransactionsActivity){
            if(isFirstTimeDataLoaded){
                binding.contentScroll.visibility = View.VISIBLE
            }
            if (it){
                binding.progressBar.visibility = View.VISIBLE
            }
            else {binding.progressBar.visibility = View.GONE}
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
        binding.faqListWalletTransactions.setUpData(FaqModel(listDataHeader, listDataChild))

        binding.faqListWalletTransactions.setEventListner(object : FaqCallBack{
            override fun viewClickCallback(position: Int) {
                if (isRewardTransaction) firebaseEventUseCase.logFirebaseEvent(
                    FirebaseEvent.FIREBASE_TM_REWARDS_FAQS,
                    "TmTransaction"
                ) else firebaseEventUseCase.logFirebaseEvent(
                    FirebaseEvent.FIREBASE_TM_CREDIT_FAQS,
                    "TmTransaction"
                )
            }

        })

    }
    private fun showLastSevenDaysTransactionList(){
        Handler(Looper.getMainLooper()).post {
            val calendar = Calendar.getInstance()
            calendar[Calendar.HOUR_OF_DAY] = 23
            calendar[Calendar.MINUTE] = 59
            calendar[Calendar.SECOND] = 59
            val toDate = calendar.time
            calendar.add(Calendar.DAY_OF_YEAR, -6)
            calendar[Calendar.HOUR_OF_DAY] = 0
            calendar[Calendar.MINUTE] = 0
            calendar[Calendar.SECOND] = 0
            val fromDate = calendar.time
            strFromDate = SimpleDateFormat("yyyy-MM-dd").format(fromDate)
            strToDate = SimpleDateFormat("yyyy-MM-dd").format(toDate)
            viewModel.getWalletTransactions(
                SharedPrefManager.getInstance().loggedInUserId,
                strFromDate,
                strToDate
            )
        }
    }
    private fun showRecentTransactionList(){
        binding.progressBar.visibility = View.VISIBLE
        binding.textSelectedCustomDates.visibility = View.GONE
        Handler(Looper.getMainLooper()).post {
            val calendar = Calendar.getInstance()
            calendar[Calendar.HOUR_OF_DAY] = 23
            calendar[Calendar.MINUTE] = 59
            calendar[Calendar.SECOND] = 59
            val toDate = calendar.time
            calendar.add(Calendar.DAY_OF_YEAR, -7)
            calendar[Calendar.HOUR_OF_DAY] = 0
            calendar[Calendar.MINUTE] = 0
            calendar[Calendar.SECOND] = 0
            strFromDate = "2019-01-01"
            strToDate = SimpleDateFormat("yyyy-MM-dd").format(toDate)
            viewModel.getWalletTransactions(
                SharedPrefManager.getInstance().loggedInUserId,
                strFromDate,
                strToDate
            )
        }
    }
    private fun showLastMonthTransactionList(){
        binding.textSelectedCustomDates.visibility = View.GONE
        Handler(Looper.getMainLooper()).post {
            val calendar = Calendar.getInstance()
            // add -1 month to current month
            calendar.add(Calendar.MONTH, -1)
            // set DATE to 1, so first date of previous month
            calendar[Calendar.DATE] = 1
            calendar[Calendar.HOUR_OF_DAY] = 0
            calendar[Calendar.MINUTE] = 0
            calendar[Calendar.SECOND] = 0
            val fromDate = calendar.time
            // set actual maximum date of previous month
            calendar[Calendar.DATE] = calendar.getActualMaximum(Calendar.DAY_OF_MONTH)
            calendar[Calendar.HOUR_OF_DAY] = 23
            calendar[Calendar.MINUTE] = 59
            calendar[Calendar.SECOND] = 59
            val toDate = calendar.time
            strFromDate = SimpleDateFormat("yyyy-MM-dd").format(fromDate)
            strToDate = SimpleDateFormat("yyyy-MM-dd").format(toDate)

            viewModel.getWalletTransactions(
                SharedPrefManager.getInstance().loggedInUserId,
                strFromDate,
                strToDate
            )
        }
    }
    private fun showThisMonthTransactionList(){
        binding.textSelectedCustomDates.visibility = View.GONE
        Handler(Looper.getMainLooper()).post {
            val calendar = Calendar.getInstance()
            // set DATE to 1, so first date of previous month
            calendar[Calendar.DATE] = 1
            calendar[Calendar.HOUR_OF_DAY] = 0
            calendar[Calendar.MINUTE] = 0
            calendar[Calendar.SECOND] = 0
            val fromDate = calendar.time

            // set actual maximum date of previous month
            calendar[Calendar.DATE] = calendar.getActualMaximum(Calendar.DAY_OF_MONTH)
            calendar[Calendar.HOUR_OF_DAY] = 23
            calendar[Calendar.MINUTE] = 59
            calendar[Calendar.SECOND] = 59
            val toDate = calendar.time
            strFromDate = SimpleDateFormat("yyyy-MM-dd").format(fromDate)
            strToDate = SimpleDateFormat("yyyy-MM-dd").format(toDate)

            viewModel.getWalletTransactions(
                SharedPrefManager.getInstance().loggedInUserId,
                strFromDate,
                strToDate
            )

        }

    }
    private fun showCustomTransactionList(){
        binding.textSelectedCustomDates.visibility = View.VISIBLE
        if(strFromDate.isNotEmpty() && strToDate.isNotEmpty()) {
            Handler().post {
                viewModel.getWalletTransactions(
                    SharedPrefManager.getInstance().loggedInUserId,
                    strFromDate,
                    strToDate
                )

            }
        }

    }
    fun checkForNetworkAndDoApiCallings(type:Int=0){
        if (isNetworkAvailable(this@WalletTransactionsActivity)) {

            //type 1 is for recent transaction list
            when (type) {
                0 -> {
                    initViewModelApi()
                }
                1 -> {
                    showRecentTransactionList()
                }
                else -> {
                    showRecentTransactionList()
                    initViewModelApi()
                }
            }
        }
        else {
            showDialogBox(PopUpType.INTERNET_FAILURE, object : PopUpDialogCallback {
                override fun onActionButtonClicked() {
                    checkForNetworkAndDoApiCallings(3)
                }

                override fun onCloseButtonClicked() {

                }
            }, true)
        }
    }

    private fun setupOnBackPresses() {
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                backFirebaseEventCall()
                finish()
            }
        })
    }

    fun callDateFilerFirebaseevent(){
        firebaseEventUseCase.logFirebaseEvent(FirebaseEvent.FIREBASE_TM_WALLET_TRANSACTION_DATE,"TmTransaction")
    }
}