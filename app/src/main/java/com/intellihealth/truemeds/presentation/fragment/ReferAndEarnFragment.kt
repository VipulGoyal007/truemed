package com.intellihealth.truemeds.presentation.fragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.salt.views.Toast
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.FragmentReferAndEarnBinding
import com.intellihealth.truemeds.presentation.activity.ReferAndEarnActivity
import com.intellihealth.truemeds.presentation.adapter.ViewPagerAdapter
import com.intellihealth.truemeds.presentation.callbacks.ReferCallback
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.ReferNEarnViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class ReferAndEarnFragment : Fragment(R.layout.fragment_refer_and_earn), ReferCallback {
    private val binding by viewBinding(FragmentReferAndEarnBinding::bind)
    private lateinit var pagerAdapter: ViewPagerAdapter
    private val viewModel: ReferNEarnViewModel by viewModels<ReferNEarnViewModel>()
    private val myReferralsFragment = MyReferralsFragment.newInstance()
   // var isBottomNav: Boolean=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        viewModel = ViewModelProvider(requireActivity()).get(ReferNEarnViewModel::class.java)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Inflate the layout for this fragment
//        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_refer_and_earn, container, false )
        binding.lifecycleOwner = requireActivity()
        setupMobileSectionHeader()
        val argument1 = arguments?.getString("showHeader")
        if (argument1 == "hide") {
            //  isBottomNav=false
            binding.header.visibility = View.GONE
        }else{
            // isBottomNav=true
            binding.header.visibility = View.VISIBLE
        }
        setListeners()
        setUpViewPager()
    }
    private fun setUpViewPager() {
        pagerAdapter = ViewPagerAdapter(requireActivity())
        pagerAdapter.addItem("Refer Now",ReferNowFragment.newInstance(this))
        pagerAdapter.addItem("My Referrals", myReferralsFragment)
        binding.viewPager.adapter = pagerAdapter
        binding.viewPager.offscreenPageLimit = 2
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = pagerAdapter.getPageTitle(position)
        }.attach()
      //  viewModel.setEventReferralScreenViewed(isBottomNav)
    }

    private fun setListeners() {

        viewModel.eventLaunchMyReferrals.observe(viewLifecycleOwner, EventObserver {
//            it?.let {
            Toast().showCustomToastMessage(requireActivity(), "Test")
                if (viewModel.remindClick) {
                    binding.viewPager.currentItem = 2
                    viewModel.remindClick = false
                }
//            }
        })


    }

    companion object {

        @JvmStatic
        fun newIntent(context: Context): Intent {
            return Intent(context, ReferAndEarnActivity::class.java)
        }

    }

    override fun onRemindClick() {
        binding.viewPager.currentItem = 2
        viewModel.remindClick = false
    }

    override fun onRewardClick() {
        binding.viewPager.currentItem = 2
        viewModel.isRewardClicked = true
        viewModel.launchMyReferralsWithWallet.postValue(Event(true))
        myReferralsFragment.setData()
    }

    private fun setupMobileSectionHeader() {
        binding.header.setUpMobileSectionHeadersData(
            MobileSectionHeadersModel(
                "Refer and Earn", "", "", "", 0,
                null, null)
            )
    }
}