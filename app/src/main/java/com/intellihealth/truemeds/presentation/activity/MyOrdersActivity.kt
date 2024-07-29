package com.intellihealth.truemeds.presentation.activity

import android.content.Context
import android.os.Bundle
import android.window.OnBackInvokedDispatcher
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModelProvider
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.salt.views.Toast
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.ActivityManagePatientBinding
import com.intellihealth.truemeds.databinding.ActivityMyOrdersBinding
import com.intellihealth.truemeds.presentation.bottomsheet.filter.FilterBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.myorder.MyOrderBottomSheet
import com.intellihealth.truemeds.presentation.fragment.MyOrdersFragment
import com.intellihealth.truemeds.presentation.fragment.ReferAndEarnFragment
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MyOrdersActivity : BaseActivity() {
    private val binding by viewBinding(ActivityMyOrdersBinding::inflate)
    private lateinit var viewModel: MyOrderViewModel
    private lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[MyOrderViewModel::class.java]
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        //Set view model as lifecycle observer of the activity
        lifecycle.addObserver(viewModel)
        context = this
        initView()
        setCallbacks()
        updateStatusBarColor()
    }

    fun initView() {

        binding.tmTopHeader.setUpMobileSectionHeadersData(
            MobileSectionHeadersModel(
                getString(R.string.my_orders), "", "",
                "", 0
            )
        )
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragment: Fragment = MyOrdersFragment()
        val bundle = Bundle()
        bundle.putString("showHeaderMyOrder", "hide")
        fragment.arguments = bundle
        fragmentManager.beginTransaction().add(R.id.containerFragment, fragment).commit()
    }
    private fun setCallbacks(){
        binding.tmTopHeader.setBackArrowClickCallback(object :
            BackArrowClickCallback {
            override fun onBackArrowClick() {
                overridePendingTransition(0, R.anim.slide_out)
                finish()

            }
        })
    }

    override fun extractIntentData(){}
}