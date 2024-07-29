package com.intellihealth.truemeds.presentation.activity

import android.content.Context
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.hideKeyboard
import com.intellihealth.truemeds.databinding.ActivityHelpSubcategoryDetailBinding
import com.intellihealth.truemeds.presentation.bottomsheet.help.HelpBottomSheet
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.HelpViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HelpSubCategoryDetailActivity : BaseActivity() {
    private val binding by viewBinding(ActivityHelpSubcategoryDetailBinding::inflate)
    private lateinit var viewModel: HelpViewModel
    private lateinit var context: Context
    private lateinit var helpBottomSheet: HelpBottomSheet

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[HelpViewModel::class.java]
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        lifecycle.addObserver(viewModel)
        context = this
        extractIntentData()
        setCallbacks()
        setObservers()
        updateStatusBarColor()
    }

    override fun extractIntentData(){
        intent.extras?.let { bundle ->
            val categoryName = bundle.getString("category_name")
            val issues = bundle.getString("issues")
            val answer = bundle.getString("answer")

            binding.tmTopHeader.setUpMobileSectionHeadersData(
                MobileSectionHeadersModel(
                    categoryName, "", "",
                    "", 0
                )
            )
            binding.tvSubCategoryTitle.text = issues
            binding.tvSubCategoryAnswer.text = answer
        }?: kotlin.run {
            finish()
        }
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

            if (it.equals(MESSAGES.CONTACT_CUSTOMER_SUPPORT_CLICK)) {
                hideKeyboard(this@HelpSubCategoryDetailActivity)
                initializeBottomSheet()
                helpBottomSheet.isCancelable = true
                if (!helpBottomSheet.isVisible) {
                    helpBottomSheet.show(supportFragmentManager, "SearchReOrderBottomsheet")

                }
            }

        })

    }

    private fun initializeBottomSheet() {
        helpBottomSheet = HelpBottomSheet(viewModel.helpContactNo, viewModel.helpEmailAddress)
    }

    override fun onDestroy() {
        super.onDestroy()
        CommonFunc.freeMemory()
    }
}