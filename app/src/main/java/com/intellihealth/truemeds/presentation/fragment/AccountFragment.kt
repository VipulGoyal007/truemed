package com.intellihealth.truemeds.presentation.fragment

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.utils.isSingleClick
import com.intellihealth.truemeds.data.utils.removeExtraZerosWithValidation
import com.intellihealth.truemeds.databinding.FragmentAccountBinding
import com.intellihealth.truemeds.domain.enums.LoginFromScreen
import com.intellihealth.truemeds.domain.navigation.navigateToEditProfileActivity
import com.intellihealth.truemeds.domain.navigation.navigateToHealthArticlesActivity
import com.intellihealth.truemeds.domain.navigation.navigateToHelpActivity
import com.intellihealth.truemeds.domain.navigation.navigateToManageAddressActivity
import com.intellihealth.truemeds.domain.navigation.navigateToManagePatientActivity
import com.intellihealth.truemeds.domain.navigation.navigateToMyOrdersActivity
import com.intellihealth.truemeds.domain.navigation.navigateToPatientReminderActivity
import com.intellihealth.truemeds.domain.navigation.navigateToPoliciesPageActivity
import com.intellihealth.truemeds.domain.navigation.navigateToReferAndEarnActivity
import com.intellihealth.truemeds.domain.navigation.navigateToWalletActivity
import com.intellihealth.truemeds.presentation.activity.HomePageActivity
import com.intellihealth.truemeds.presentation.activity.PatientReminderActivity
import com.intellihealth.truemeds.presentation.activity.WalletActivity
import com.intellihealth.truemeds.presentation.bottomsheet.logout.LogoutBottomSheet
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.BundleConstants.INITIATED_LOGIN_FROM_SCREEN
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.AccountTabViewModel
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel
import com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AccountFragment : Fragment(R.layout.fragment_account) {

    private val binding by viewBinding(FragmentAccountBinding::bind)
    private val logoutBottomSheet = LogoutBottomSheet()
    var anim = Bundle()
    private lateinit var managePatientViewModel: ManagePatientViewModel
    private var mLastClickTime = 0L
    private var isEditProfileClicked = false
    private val viewModel: AccountTabViewModel by lazy {
        ViewModelProvider(this)[AccountTabViewModel::class.java]
    }

    private fun initView() {
        managePatientViewModel = ViewModelProvider(this)[ManagePatientViewModel::class.java]

        managePatientViewModel.eventUpdateDbAccountFragment.observe(viewLifecycleOwner) {
            if (it) viewModel.getUserData()
        }

        HomeViewModel.postLoginAction.observe(viewLifecycleOwner) {
            if (it) {
                viewModel.getUserData()
            }
        }

        HomeViewModel.tmWallet.observe(viewLifecycleOwner) {
            if (it > 0.0)
                viewModel.tmWalletData.postValue(removeExtraZerosWithValidation(it))
            else
                viewModel.tmWalletData.postValue("")
        }



        binding.btnLogoutMain.setTextColor(
            ContextCompat.getColor(
                requireContext(),
                com.intellihealth.salt.R.color.tm_core_color_red_500
            )
        )
        binding.viewmodel = viewModel

        binding.lifecycleOwner = requireActivity()
        binding.btnLogout.setOnClickListener {
            logoutBottomSheet.isCancelable = true
            logoutBottomSheet.openBottomSheet(true, 90, 6)
            logoutBottomSheet.setViewModel(viewModel)
            if (!logoutBottomSheet.isVisible)
                logoutBottomSheet.show(
                    requireActivity().supportFragmentManager, "logoutBottomSheet"
                )
        }

        binding.btnLogoutMain.setOnClickListener {
            logoutBottomSheet.isCancelable = true
            logoutBottomSheet.openBottomSheet(true, 90, 6)
            logoutBottomSheet.setViewModel(viewModel)
            if (!logoutBottomSheet.isVisible)
                logoutBottomSheet.show(
                    requireActivity().supportFragmentManager, "logoutBottomSheet"
                )
        }

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        binding.lifecycleOwner = viewLifecycleOwner
        viewModel.eventOpenAccountTabItem.observe(viewLifecycleOwner, EventObserver {
            if (it != null) {
                launchActivity(it.first, it.second)
            }
        })

        anim = ActivityOptions.makeCustomAnimation(
            requireContext(),
            R.anim.activity_slide_from_right, R.anim.activity_slide_to_left
        ).toBundle()
        viewModel.createNavMenuList()
        //updateStatusBarColor()
        clickListener()
        //validateUI()
    }

    override fun onStart() {
        super.onStart()
        viewModel.getUserData()
    }

    private fun clickListener() {
        binding.btnEdit.setOnClickListener {
            isEditProfileClicked = true
            navigateToEditProfileActivity(
                params = bundleOf(
                    BundleConstants.USER_PROFILE_DATA to viewModel.customerDetail,
                    BundleConstants.IS_EDIT_PROFILE_CLICK to isEditProfileClicked
                )
            )
        }

        binding.btnTnC.setOnClickListener {
            //startActivity(Intent(context, PoliciesPageActivity::class.java), anim)
            navigateToPoliciesPageActivity()
        }
        binding.btnTnCMain.setOnClickListener {
            //startActivity(Intent(context, PoliciesPageActivity::class.java), anim)
            navigateToPoliciesPageActivity()
        }

        binding.btnLogin.setOnClickListener {

            val lastRecordedData = isSingleClick(mLastClickTime)
            mLastClickTime = lastRecordedData.second
            if (lastRecordedData.first) {
                INITIATED_LOGIN_FROM_SCREEN = LoginFromScreen.ACCOUNT
                (activity as HomePageActivity).pageSection="login_register"
                (activity as HomePageActivity).login_clicked_on_page="account_page"
                (activity as HomePageActivity).initializationTrueCallerOAuth()
            }
        }

        binding.tvAddMore.setOnClickListener {
            isEditProfileClicked = !viewModel.customerName.value.isNullOrEmpty() && viewModel.customerEmail.value.isNullOrEmpty()
            navigateToEditProfileActivity(
                params = bundleOf(
                    BundleConstants.IS_EDIT_PROFILE_CLICK to isEditProfileClicked
                )
            )

        }


    }


    private fun launchActivity(activityName: String, position: Int) {

        when (activityName) {
            "My Orders" ->
                (activity as HomePageActivity).verifyLoginAndRedirect(LoginFromScreen.ACCOUNT, "my_order") {
                    //this line is changed because reloadMyOrders is observed twice on MyOrdersActivity
                    if (HomeViewModel.reloadMyOrders.value == false)
                        HomeViewModel.reloadMyOrders.postValue(true)
                    navigateToMyOrdersActivity()
            }

            "TM Wallet" -> (activity as HomePageActivity).verifyLoginAndRedirect(LoginFromScreen.ACCOUNT, "tm_wallet") {
                navigateToWalletActivity()
            }

            "Manage Patients" -> (activity as HomePageActivity).verifyLoginAndRedirect(
                LoginFromScreen.ACCOUNT, "manage_patient"
            ) {
                navigateToManagePatientActivity(
                    params = bundleOf(
                        BundleConstants.IS_FROM_ACCOUNT_FRAGMENT to true,
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "account"
                    )
                )
            }

            "Manage Addresses" -> (activity as HomePageActivity).verifyLoginAndRedirect(
                LoginFromScreen.ACCOUNT, "manage_address"
            ) {
                navigateToManageAddressActivity(
                    params = bundleOf(
                        BundleConstants.IS_FROM_ACCOUNT_FRAGMENT to true
                    )
                )
            }

            "Refer and Earn" -> (activity as HomePageActivity).verifyLoginAndRedirect(
                LoginFromScreen.ACCOUNT, "refer_and_earn"
            ) {
                navigateToReferAndEarnActivity()

            }

            "Reminder" -> (activity as HomePageActivity).verifyLoginAndRedirect(LoginFromScreen.ACCOUNT, "reminder") {
                navigateToPatientReminderActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "account"
                    )
                )
            }

            "Health Articles" ->{
                navigateToHealthArticlesActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "account"
                    )
                )
                viewModel.eventArticleSectionViewedEvent("account")
            }


            "Help" ->  navigateToHelpActivity()
        }
    }

    override fun onHiddenChanged(hidden: Boolean) {
        super.onHiddenChanged(hidden)
        if (!hidden) {
            binding.isLoggedIn =
                SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty()
        }
    }

    override fun onResume() {
        super.onResume()
        binding.rcvItem.adapter?.notifyItemChanged(1)
        binding.isLoggedIn =
            SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty()
        viewModel.customerMobile.value = SharedPrefManager.getInstance().loggedInUserMobile
    }
}