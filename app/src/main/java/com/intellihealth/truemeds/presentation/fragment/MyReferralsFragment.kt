package com.intellihealth.truemeds.presentation.fragment

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.intellihealth.salt.callbacks.ReferralStageCallback
import com.intellihealth.salt.models.ReferralStageModel
import com.intellihealth.salt.views.Toast
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.refernearn.ReferralStatusModel
import com.intellihealth.truemeds.data.utils.isSingleClick
import com.intellihealth.truemeds.databinding.FragmentMyReferralsBinding
import com.intellihealth.truemeds.presentation.adapter.MyReferralAdapter
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.ShareSheet
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.ReferNEarnViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MyReferralsFragment : Fragment(R.layout.fragment_my_referrals) {

    private val binding by viewBinding(FragmentMyReferralsBinding::bind)
    private val viewModel: ReferNEarnViewModel by viewModels<ReferNEarnViewModel>()
    private val handler = Handler()
    private var mLastClickTime = 0L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Inflate the layout for this fragment
        binding.lifecycleOwner = this
        viewModel.getReferralStatus(SharedPrefManager.getInstance().loggedInUserId, false)
        setData()
        setObservers()
        if(SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty())
            viewModel.getWalletInfo(SharedPrefManager.getInstance().loggedInUserId)
    }

    fun setData() {
        val referralList = arrayListOf<ReferralStageModel>()

        referralList.apply {

            viewModel.referralStatusList.observe(viewLifecycleOwner) {
                it?.forEachIndexed() { index, referralModel ->

                    val referralStageModel = ReferralStatusModel.ReferralStages()
                    val model = ReferralStageModel(
                        if (referralModel?.registeredCustomerName.toString() == "") referralModel?.registeredCustomerMobile.toString() else referralModel?.registeredCustomerName.toString(),
                        referralModel?.referralOrderFlowStatus ?: "",
                        getString(R.string.remind),
                        referralModel?.referralStatus ?: "",
                        referralStageModel.toReferralStageItemModel(referralModel?.referralStages),
                        referralModel?.referralStatus.isNullOrBlank(),
                        (referralModel?.referralAmount ?: 0.0) > 0.0
                    )
                    add(model)

                }
                val referralStageCallback = object : ReferralStageCallback {
                    override fun onRemindClick(referralStageModel: ReferralStageModel) {
                        if (viewModel.referFriendChooserTitle.value != null) {
                            val title = getString(R.string.invite_your_friends_to_truemeds)
                            val text = viewModel.referFriendChooserTitle.value as String
                            handler.postDelayed({
                                ShareSheet.shareText(requireContext(), title, text)
                            }, 100)
                            viewModel.sendReferAFriendClickedEvent()
                        }
                    }
                }

                if (referralList.size > 0) {
                    binding.noReferralLayout.visibility = View.GONE
                    binding.referralListLayout.visibility = View.VISIBLE
                    if(viewModel.isRewardClicked) {
                        binding.rvReminder.apply {
                            this.adapter = MyReferralAdapter(referralStageCallback, referralList)
                            scrollToPosition(referralList.size - 1)
                        }
                    }else{
                        binding.rvReminder.apply {
                            this.adapter = MyReferralAdapter(referralStageCallback, referralList)
                        }
                    }
                } else {
                    binding.noReferralLayout.visibility = View.VISIBLE
                    binding.referralListLayout.visibility = View.GONE
                }

            }
        }
        binding.tvReferAndFriend.setOnClickListener {
            val lastRecordedData = isSingleClick(mLastClickTime)
            mLastClickTime = lastRecordedData.second
            if (viewModel.referFriendChooserTitle.value != null && lastRecordedData.first) {
                val title = getString(R.string.invite_your_friends_to_truemeds)
                val text = viewModel.referFriendChooserTitle.value as String
                handler.postDelayed({
                    ShareSheet.shareText(requireContext(), title, text)
                }, 100)
                viewModel.sendReferAFriendClickedEvent()
            }
        }

    }
    fun setObservers(){
        viewModel.eventLaunchMyReferralsWithWallet.observe(viewLifecycleOwner, EventObserver {
            it?.let {
               if(it){
                   viewModel.isRewardClicked = true
                   setData()
               }
            }
        })
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            MyReferralsFragment().apply {
            }
    }
}

