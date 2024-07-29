package com.intellihealth.truemeds.presentation.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProvider
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.data.utils.hideKeyboard
import com.intellihealth.truemeds.databinding.ActivityHelpSubcategoryBinding
import com.intellihealth.truemeds.domain.navigation.navigateToHelpSubCategoryDetailActivity
import com.intellihealth.truemeds.presentation.bottomsheet.help.HelpBottomSheet
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.HelpViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HelpSubCategoryActivity : BaseActivity() {
    private val binding by viewBinding(ActivityHelpSubcategoryBinding::inflate)
    private lateinit var viewModel: HelpViewModel
    private lateinit var context: Context
    private var categoryName = ""
    private lateinit var helpBottomSheet: HelpBottomSheet

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[HelpViewModel::class.java]
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        //Set view model as lifecycle observer of the activity
        lifecycle.addObserver(viewModel)
        context = this
        extractIntentData()
        initView()
        setCallbacks()
        setObservers()
        updateStatusBarColor()
    }

    override fun extractIntentData(){
        intent.extras?.let { bundle ->
            categoryName = bundle.getString("category_name").toString()
            viewModel.categoryId = bundle.getString("category_id").toString()
        }
    }

    private fun initView() {
        viewModel.subCategoryApiCalling(context)
        binding.tmTopHeader.setUpMobileSectionHeadersData(
            MobileSectionHeadersModel(
                categoryName, "", "",
                "", 0
            )
        )
    }

    private fun setCallbacks() {
        binding.tmTopHeader.setBackArrowClickCallback(object : BackArrowClickCallback {
            override fun onBackArrowClick() {
                finish()
            }
        })
    }

    private fun setObservers() {
        viewModel.eventMessage.observe(this, EventObserver {
            if(it==null) return@EventObserver
            if (it.equals(MESSAGES.HELP_SUB_ITEM_CLICK)) {

                redirectToSubCategoryDetails()

            } else if (it.equals(MESSAGES.CONTACT_CUSTOMER_SUPPORT_CLICK)) {
                hideKeyboard(this@HelpSubCategoryActivity)
                initializeBottomSheet()
                helpBottomSheet.isCancelable = true
                if (!helpBottomSheet.isVisible) {
                    helpBottomSheet.show(supportFragmentManager, "SearchReOrderBottomsheet")

                }

            } else if (it.equals(MESSAGES.NO_NETWORK)) {
                showDialogBox(PopUpType.INTERNET_FAILURE, object : PopUpDialogCallback {
                    override fun onActionButtonClicked() {
                        // apiType=2 is for help sub category list api calling
                        if (viewModel.apiType == 2)
                            viewModel.subCategoryApiCalling(context)

                    }

                    override fun onCloseButtonClicked() {

                    }
                }, true)
            }
        })

        viewModel.showShimmerLiveData.observe(this) {
            if (it) {
                binding.shimmerViewContainer.startShimmerAnimation()
            } else {
                binding.shimmerViewContainer.stopShimmerAnimation()
            }
        }
    }

    private fun initializeBottomSheet() {
        helpBottomSheet = HelpBottomSheet(viewModel.helpContactNo, viewModel.helpEmailAddress)
    }

    private fun redirectToSubCategoryDetails() {
        navigateToHelpSubCategoryDetailActivity(
            params = bundleOf(
                "category_name" to categoryName,
                "issues" to  viewModel.helpListApiResponse[viewModel.itemClickedPosition]?.issues,
                "answer" to viewModel.helpListApiResponse[viewModel.itemClickedPosition]?.answers
            )
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        CommonFunc.freeMemory()
    }
}