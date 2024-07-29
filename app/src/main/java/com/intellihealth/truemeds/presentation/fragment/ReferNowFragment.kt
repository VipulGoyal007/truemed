package com.intellihealth.truemeds.presentation.fragment

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.google.gson.Gson
import com.intellihealth.salt.constants.InputFieldConstants
import com.intellihealth.salt.models.FaqModel
import com.intellihealth.salt.models.HeaderModel
import com.intellihealth.salt.models.InstructionAccordionModel
import com.intellihealth.salt.views.Toast
import com.intellihealth.salt.views.cards.ActionCardCallback
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.helpfaqtnc.FaqCategoryResponse
import com.intellihealth.truemeds.data.model.home.PopUpModel
import com.intellihealth.truemeds.data.utils.PopUpManager
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.databinding.FragmentReferNowBinding
import com.intellihealth.truemeds.domain.enums.ErrorType
import com.intellihealth.truemeds.domain.navigation.navigateToFaqViewAllActivity
import com.intellihealth.truemeds.domain.navigation.navigateToSearchSuggestionActivity
import com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase
import com.intellihealth.truemeds.presentation.activity.BaseActivity
import com.intellihealth.truemeds.presentation.activity.PolicyDetailActivity
import com.intellihealth.truemeds.presentation.analytics.FirebaseEvent
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.callbacks.ReferCallback
import com.intellihealth.truemeds.presentation.dialog.PopUpDialog
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.ShareSheet
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel
import com.intellihealth.truemeds.presentation.viewmodel.ReferNEarnViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ReferNowFragment : Fragment(R.layout.fragment_refer_now) {
    private val headerList: ArrayList<HeaderModel> = arrayListOf()
    private val binding by viewBinding(FragmentReferNowBinding::bind)
    private val viewModel: ReferNEarnViewModel by viewModels<ReferNEarnViewModel>()
    private val handler = Handler()
    private lateinit var referCallback: ReferCallback

    @Inject
    lateinit var firebaseEventUseCase: FirebaseEventUseCase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    private fun initViewModelApi() {
        if(SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty())
            viewModel.getWalletInfo(SharedPrefManager.getInstance().loggedInUserId)
        viewModel.getFaqCategory()
    }


    private fun addFaq(faqlist: List<FaqCategoryResponse.Payload>) {
        val listDataHeader: MutableList<String> = ArrayList()
        var listDataChild: HashMap<String, List<String>> = HashMap()

        faqlist.forEachIndexed() { index, element ->
            val listAnswer: MutableList<String> = ArrayList()
            if (index <= 2) {
                element.question?.let {
                    listDataHeader.add(it)
                }
                element.answer?.let {
                    listAnswer.add(it)
                }
                listDataChild[element.question.toString()] = listAnswer
            }

        }
        binding.faq.setUpData(FaqModel(listDataHeader, listDataChild))

    }

    companion object {

        @JvmStatic
        fun newInstance(referCallback: ReferCallback) = ReferNowFragment().apply {
            this.referCallback = referCallback
            arguments = Bundle().apply {
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Inflate the layout for this fragment
        binding.viewModel = viewModel
        binding.lifecycleOwner = this


        binding.btnViewMore.setOnClickListener {
            navigateToFaqViewAllActivity(
                params = bundleOf(
                    BundleConstants.FAQ_LIST to "" + Gson().toJson(viewModel.faqById.value)
                )
            )
            firebaseEventUseCase.logFirebaseEvent(FirebaseEvent.FIREBASE_REFER_AND_EARN_FAQ,"ReferNEarn")
        }
        initViewModelApi()
        viewModel.walletInfoResponse.observe(viewLifecycleOwner) {
            binding.walletInfoResponse = it
        }

        viewModel.referralCode.observe(requireActivity()) {
            if (it.isNotEmpty()) {
                if (!viewModel.alreadyRedeemed) {
                    binding.instructionAccordion.expandView()
                } else {
                    binding.etClaimReward.visibility = View.GONE
                    binding.tvClaimRewardHeader.visibility = View.GONE
                }
            }

        }

        setAndObserveData()
        setUpListener()

        binding.referFriendActionCard.setCallback(object : ActionCardCallback {
            override fun viewClickCallback(type: Int) {
                if (viewModel.referFriendChooserTitle.value != null) {
                    firebaseEventUseCase.logFirebaseEvent(FirebaseEvent.FIREBASE_REFER_AND_EARN_REFER_A_FRIEND,"ReferNEarn")
                    val title = getString(R.string.invite_your_friends_to_truemeds)
                    val text = viewModel.referFriendChooserTitle.value as String
                    handler.postDelayed({
                        ShareSheet.shareText(requireContext(), title, text)
                    }, 100)

                    viewModel.sendReferAFriendClickedEvent()
                }

            }

            override fun viewCopyClick(type: Int) {
                firebaseEventUseCase.logFirebaseEvent(FirebaseEvent.FIREBASE_REFER_AND_EARN_COPY,"ReferNEarn")
                val clipboardManager =
                    requireActivity().getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                val clipData =
                    ClipData.newPlainText("text", viewModel.referralCode.value as String)
                clipboardManager.setPrimaryClip(clipData)
                Toast().showCustomToastMessage(
                    requireActivity(),
                    requireActivity().getString(R.string.referral_code_copied)
                )
            }

        })
        viewModel.faqById.observe(viewLifecycleOwner) {
            if (it != null) {
                addFaq(it)
            }
        }
        binding.etClaimReward.setInputFieldCallback({ etData ->

            if (etData.isEmpty()) {
                updateErrorState(
                    "Please enter a valid code.",
                    InputFieldConstants.STATE_ERROR
                )
                return@setInputFieldCallback
            }
            val code = "ref_" + etData.lowercase()
            viewModel.redeemReferralCode(
                requireActivity(),
                SharedPrefManager.getInstance().loggedInUserId,
                SharedPrefManager.getInstance().loggedInUserMobile, code
            )

        }, object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable?) {
                s?.let {
                    binding.etClaimReward.setActionButtonEnabled(it.isNotEmpty())
                }
            }

        }) { v, actionId, event ->
            actionId == EditorInfo.IME_ACTION_DONE || actionId == EditorInfo.IME_NULL
            false
        }

    }

    private fun setUpListener() {
        binding.btTnc.setOnClickListener {
            startActivity(
                Intent(
                    requireActivity(), PolicyDetailActivity::class.java
                ).putExtra("key", "Terms & Condition").putExtra("isPrimary", false)
            )
        }

        binding.tmActionCartPrescription.setCallback(object : ActionCardCallback {
            override fun viewClickCallback(type: Int) {
                referCallback.onRemindClick()
            }

            override fun viewCopyClick(type: Int) {
                Toast().showCustomToastMessage(activity, "" + type)
            }

        })
        binding.walletCard.setOnClickListener {
            referCallback.onRewardClick()
        }

    }

    private fun updateErrorState(msg: String, stateError: InputFieldConstants) {
        with(binding.etClaimReward) {
            setUpState(stateError)
            setHelperText(msg, stateError)

        }
    }

    private fun setAndObserveData() {
        val header1 = viewModel.getReferralWorkingStep()
        headerList.clear()
        headerList.add(header1)
        val data = InstructionAccordionModel(headerList)
        binding.model = data

        viewModel.redeemResponse.observe(viewLifecycleOwner) { it ->
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
                        firebaseEventUseCase.logFirebaseEvent(FirebaseEvent.FIREBASE_REFER_AND_EARN_ORDER_NOW,"ReferNEarn")
                       /* startActivity(Intent(context, SearchSuggestionActivity::class.java).putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "refer_n_earn")
                            .putExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION, "order_now")
                                .addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                        )*/

                        navigateToSearchSuggestionActivity(
                            params = bundleOf(
                                BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "refer_n_earn",
                                BundleConstants.BUNDLE_KEY_PAGE_SECTION to "order_now",
                            ),
                            flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                        )

                        dialog?.let { it1 ->
                            dismissPopup(it1)
                        }

                    }

                    override fun onCloseButtonClicked() {
                        dialog?.let { it1 ->
                            dismissPopup(it1)
                        }
                    }

                    override fun onDismissOutside() {
                        dialog?.let { it1 ->
                            dismissPopup(it1)
                        }
                    }

                }

                dialog = PopUpDialog(model = rewardSuccess, callback = callback)
                if (!dialog.isVisible)
                    activity?.supportFragmentManager?.let { dialog.show(it, "RewardSuccess") }
            }

            it?.responseData?.Claimed?.let {
                updateErrorState(
                    "You have already claimed.",
                    InputFieldConstants.STATE_ERROR
                )
            }
            it?.responseData?.Conflict?.let {
                updateErrorState(
                    "Please enter a valid code.",
                    InputFieldConstants.STATE_ERROR
                )
            }



            if (it?.responseData.toString()
                    .isNullOrEmpty() || (it?.responseData?.Success.isNullOrEmpty() &&
                        it?.responseData?.Claimed.isNullOrEmpty() && it?.responseData?.Conflict.isNullOrEmpty())
            ) {
                binding.etClaimReward.setUpState(InputFieldConstants.STATE_ERROR)
                binding.etClaimReward.setHelperText(
                    it?.message ?: "",
                    InputFieldConstants.STATE_ERROR
                )
//                (activity as BaseActivity).showDialogBox(
//                    PopUpType.API_FAILURE,
//                    object : PopUpDialogCallback {
//                        override fun onActionButtonClicked() {
//                        }
//
//                        override fun onCloseButtonClicked() {
//                        }
//                    },
//                    false,
//                    "Redeem failed",
//                    it?.message ?: ""
//                )
            }
        }

        viewModel.eventOpenErrorDialog.observe(requireActivity(), EventObserver {
            if (it.equals(ErrorType.NO_NETWORK)) {
                //CommonFunc.openErrorDialog(this, ErrorType.NO_NETWORK)
                (requireActivity() as BaseActivity).showDialogBox(
                    PopUpType.INTERNET_FAILURE,
                    object : PopUpDialogCallback {
                        override fun onActionButtonClicked() {
                        }

                        override fun onCloseButtonClicked() {

                        }
                    },
                    true
                )
            }

        })


        viewModel.eventReferFailed.observe(requireActivity(), EventObserver {
            if (!isAdded) return@EventObserver
            PopUpManager.showPopUp(
                fragmentManager = requireActivity().supportFragmentManager,
                popUpType = PopUpType.REFERRAL_FAILED,
                object : PopUpDialogCallback {
                    override fun onActionButtonClicked() {}
                    override fun onCloseButtonClicked() {}
                }, false
            )
        })

    }

    private fun dismissPopup(dialog: PopUpDialog) {
        binding.etClaimReward.visibility = View.GONE
        binding.tvClaimRewardHeader.visibility = View.GONE
        dialog.dismiss()
    }

}