package com.intellihealth.truemeds.presentation.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.google.common.reflect.TypeToken
import com.google.gson.Gson
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.models.FaqModel
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.helpfaqtnc.FaqCategoryResponse
import com.intellihealth.truemeds.databinding.ActivityEditProfileBinding
import com.intellihealth.truemeds.databinding.ActivityFaqViewAllBinding
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import java.lang.reflect.Type

@AndroidEntryPoint
class
FaqViewAllActivity : BaseActivity() {

    private val binding by viewBinding(ActivityFaqViewAllBinding::inflate)
    private var faqList: List<FaqCategoryResponse.Payload>? =
        ArrayList()
    var listDataHeader = emptyList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        extractIntentData()
        setMobileSectionHeander()
        setFaqList(faqList)
        addClickListener()
    }

    override fun extractIntentData() {
        intent.extras?.let { bundle ->
            val type: Type = object :
                TypeToken<List<FaqCategoryResponse.Payload>?>() {}.type
            faqList = Gson().fromJson(bundle.getString(BundleConstants.FAQ_LIST), type)
        }
    }

    private fun addClickListener() {
        binding.header.setBackArrowClickCallback(object :
            BackArrowClickCallback {
            override fun onBackArrowClick() {
                finish()
            }
        })
    }

    private fun setFaqList(faqList: List<FaqCategoryResponse.Payload>?) {
        val listDataHeader: MutableList<String> = ArrayList()
        val listDataChild: HashMap<String, List<String>> = HashMap()
        faqList?.forEachIndexed { _, element ->
            val listAnswer: MutableList<String> = ArrayList()
            element.question?.let {
                listDataHeader.add(it)
            }
            element.answer?.let {
                listAnswer.add(it)
            }
            listDataChild[element.question.toString()] = listAnswer
        }
        binding.faqFullList.setUpData(FaqModel(listDataHeader, listDataChild))
    }

    private fun setMobileSectionHeander() {
        binding.header.setUpMobileSectionHeadersData(
            MobileSectionHeadersModel(
                "Frequently asked questions", "", "", "", 0,
                null, ContextCompat.getDrawable(applicationContext, R.drawable.ic_back_arrow)
            )
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        CommonFunc.freeMemory()
    }
}