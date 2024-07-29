package com.intellihealth.truemeds.presentation.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProvider
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.callbacks.SearchBarCallback
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.data.utils.hideKeyboard
import com.intellihealth.truemeds.databinding.ActivityHelpBinding
import com.intellihealth.truemeds.domain.navigation.navigateToHelpSubCategoryActivity
import com.intellihealth.truemeds.domain.navigation.navigateToHelpSubCategoryDetailActivity
import com.intellihealth.truemeds.presentation.bottomsheet.help.HelpBottomSheet
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.utils.CommonFunc.isSingleClickParam
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.HelpViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HelpActivity : BaseActivity() {
    private val binding by viewBinding(ActivityHelpBinding::inflate)
    private lateinit var viewModel: HelpViewModel
    private lateinit var context: Context
    private lateinit var helpBottomSheet: HelpBottomSheet

    override fun extractIntentData(){

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[HelpViewModel::class.java]
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        lifecycle.addObserver(viewModel)
        context = this
        initView()
        setCallbacks()
        setObservers()
        updateStatusBarColor()
    }

    private fun initView() {
        binding.searchBar.setPlaceHolderText("Search for topic or question")
        binding.searchBar.setSearchEnable(true)
        binding.searchBar.setStartIconAsSearch(true)
        binding.tmTopHeader.setUpMobileSectionHeadersData(
            MobileSectionHeadersModel(
                getString(R.string.need_help), "", "",
                "", 0
            )
        )


        binding.searchBar.setWatcher(object : TextWatcher {
            override fun beforeTextChanged(searchString: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(searchString: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(searchString: Editable?) {
                filter(searchString.toString())
            }

        })
        viewModel.getAllHelpCategory(context)
    }

    private fun setCallbacks() {
        binding.tmTopHeader.setBackArrowClickCallback(object : BackArrowClickCallback {
            override fun onBackArrowClick() {
                overridePendingTransition(0, R.anim.slide_out)
                finish()
            }
        })

        binding.searchBar.setCallBack(object : SearchBarCallback {
            override fun onClearClick() {
                binding.searchBar.setSearchText("")
                hideKeyboard(this@HelpActivity)
            }

            override fun onIconClick() {
            }

            override fun onViewClick() {
            }
        })

    }

    private fun setObservers() {
        viewModel.eventMessage.observe(this, EventObserver {
            if (it != null) {
                if (it.equals(MESSAGES.HELP_SUB_ITEM_CLICK_HELP_PAGE)) {
                    if (viewModel.selectedCategory != null)
                        redirectToSubCategoryDetails(
                            viewModel.selectedCategory?.categoryName ?: "",
                            viewModel.selectedCategory?.issues ?: "",
                            viewModel.selectedCategory?.answers ?: ""
                        )


                } else if (it.equals(MESSAGES.HELP_ITEM_CLICK)) {
                    viewModel.helpListApiResponse.clear()
                    navigateToHelpSubCategoryActivity(
                        params = bundleOf(
                            "category_name" to
                            viewModel.filteredlist[viewModel.itemClickedPosition].categoryName,
                            "category_id" to
                            viewModel.filteredlist[viewModel.itemClickedPosition].categoryId.toString()
                        )
                    )
                } else if (it.equals(MESSAGES.CONTACT_CUSTOMER_SUPPORT_CLICK)) {
                    hideKeyboard(this@HelpActivity)
                    initializeBottomSheet()
                    helpBottomSheet.isCancelable = true
                    if (!helpBottomSheet.isVisible && isSingleClickParam()) {
                        helpBottomSheet.show(supportFragmentManager, "SearchReOrderBottomsheet")

                    }

                } else if (it.equals(MESSAGES.NO_NETWORK)) {
                    showDialogBox(PopUpType.INTERNET_FAILURE, object : PopUpDialogCallback {
                        override fun onActionButtonClicked() {
                            // apiType=1 is for help list api calling
                            if (viewModel.apiType == 1)
                                viewModel.getAllHelpCategory(context)

                        }

                        override fun onCloseButtonClicked() {
                        }
                    }, true)
                }
            }

        })


        viewModel.showShimmerLiveData.observe(this) {
            if (it != null && it) {
                binding.shimmerViewContainer.startShimmerAnimation()
            } else {
                binding.shimmerViewContainer.stopShimmerAnimation()
            }
        }
    }

    private fun initializeBottomSheet() {
        helpBottomSheet = HelpBottomSheet(viewModel.helpContactNo, viewModel.helpEmailAddress)
    }

    private fun filter(text: String) {
        viewModel.performFilterOperation(text)
    }

    private fun redirectToSubCategoryDetails(categoryName: String, issues: String, answer: String) {
        navigateToHelpSubCategoryDetailActivity(
            params = bundleOf(
                "category_name" to categoryName,
                "issues" to issues,
                "answer" to answer
            )
        )
    }
}