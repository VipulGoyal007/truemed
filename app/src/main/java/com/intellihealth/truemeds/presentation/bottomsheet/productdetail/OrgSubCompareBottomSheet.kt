package com.intellihealth.truemeds.presentation.bottomsheet.productdetail

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.gson.Gson
import com.intellihealth.salt.constants.FullWidthProductCardConstants
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.OrgSubCompareBottomSheetCallback
import com.intellihealth.truemeds.databinding.FragmentOrgSubCompareBinding
import com.intellihealth.truemeds.presentation.analytics.model.firebase.FbSubsView
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.json.JSONObject


class OrgSubCompareBottomSheet : BottomSheet() {

    private lateinit var dialog: BottomSheetDialog
    private lateinit var binding: FragmentOrgSubCompareBinding
    private lateinit var viewModel: ProductDetailViewModel
    private lateinit var orgSubCompareBottomSheetCallback: OrgSubCompareBottomSheetCallback
    private var suggestion_term_clicked_position: Int = 0
    private var suggestion_term_clicked: String? = null
    private var term_searched: String? = null
    private var clicked_suggestion_type: String? = null
    private var data: String? = ""
    var model: ProductInfoModel? = null
    var isSubsAddedToCart = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCancel(dialog: DialogInterface) {
        super.onCancel(dialog)
        dismiss()
        if(::viewModel.isInitialized && :: orgSubCompareBottomSheetCallback.isInitialized) {
            orgSubCompareBottomSheetCallback.closeClick(viewModel.isReload)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =
            DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_org_sub_compare,
                container,
                false
            )

        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel
        closeBottomSheet()
        eventListeners()
//        binding.header.setUpMobileSectionHeadersData(
//            TmMobileSectionHeadersModel(
//                "Compare and choose", "", "", "", 0,
//                ContextCompat.getDrawable(requireContext(), R.drawable.ic_close), null
//            )
//        )


    }


    private fun eventListeners() {

        viewModel.eventLaunchPDPage.observe(requireActivity(), EventObserver {
            if (it == null) return@EventObserver
            model?.let { it1 ->
                if(::orgSubCompareBottomSheetCallback.isInitialized)
                    orgSubCompareBottomSheetCallback.openPDPage(it.productCode, it.isSubs)
            }
        })

        viewModel.eventLaunchPDPageForSub.observe(requireActivity(), EventObserver {
            if (it == null) return@EventObserver
            model?.let { it1 ->
                if(::orgSubCompareBottomSheetCallback.isInitialized)
                    orgSubCompareBottomSheetCallback.openPDPage(it.productCode, it.isSubs)
            }
        })

    }

    private fun closeBottomSheet() {
        binding.closeBottomSheet.setOnClickListener {
            dismiss()
            if (::viewModel.isInitialized && ::orgSubCompareBottomSheetCallback.isInitialized) {
                orgSubCompareBottomSheetCallback.closeClick(viewModel.isReload)
            }
        }
    }

    private fun initArgs() {
        viewModel = ViewModelProvider(requireActivity())[ProductDetailViewModel::class.java]
        val bundle = arguments ?: return

        model = Gson().fromJson(
            bundle.getString(BundleConstants.PRODUCT_ORD_SUBS_DETAIL),
            ProductInfoModel::class.java
        )

        if (bundle.containsKey(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE)) {
            viewModel.clickedOnPage = bundle.getString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE)!!
        }
        if (bundle.containsKey(BundleConstants.POSITION)) {
            viewModel.resultPosition = bundle.getInt(BundleConstants.POSITION)
        }

        model?.cardType = FullWidthProductCardConstants.SEARCH
        model?.let {
            try {
                val json = JSONObject(bundle.getString(BundleConstants.PRODUCT_ORD_SUBS_DETAIL))
                it.product.subsSavingPercentage =
                    json.getJSONObject("product").getString("subsSavingsPercentage")
            } catch (ex: Exception) {
                ex.printStackTrace()
            }
            viewModel.suggestion_term_clicked_position = suggestion_term_clicked_position
            viewModel.suggestion_term_clicked = suggestion_term_clicked
            viewModel.term_searched = term_searched
            viewModel.clicked_suggsetion_type = clicked_suggestion_type

            viewModel.getOrgList(it)
            viewModel.getSubsList(it)
            isSubsAddedToCart = it.isSubsAddedToCart
        }

        viewModel.isReload = false
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        initArgs()
        dialog = BottomSheetDialog(requireContext(), theme)
        setUpBottomSheetBehaviour(
            dialog,
            false,
            4,
            if (isSubsAddedToCart) 68 else 80
        )
        return dialog
    }


    fun setCallback(orgSubCompareBottomSheetCallback: OrgSubCompareBottomSheetCallback) {
        this.orgSubCompareBottomSheetCallback = orgSubCompareBottomSheetCallback
    }

    fun setUpEventData(
        suggestion_term_clicked_position: Int,
        suggestion_term_clicked: String?,
        term_searched: String?,
        clicked_suggestion_type: String?
    ) {
        this.suggestion_term_clicked_position = suggestion_term_clicked_position
        this.suggestion_term_clicked = suggestion_term_clicked
        this.term_searched = term_searched
        this.clicked_suggestion_type = clicked_suggestion_type
    }

    override fun getTheme() = R.style.BottomSheetDialog

    fun newInstance(): OrgSubCompareBottomSheet {
        return OrgSubCompareBottomSheet()
    }

    override fun onResume() {
        super.onResume()
        getUpdatedDBCount()
    }

    private fun getUpdatedDBCount() {
        lifecycleScope.launch(Dispatchers.IO) {
            if(!model?.product?.productCode.isNullOrEmpty()) {
                val count = viewModel.getMedicineCount(model?.product?.productCode ?: "")
                lifecycleScope.launch(Dispatchers.Main) {
                    binding.orgCard.updateOrgStepperQuantity(count)
                }
            }
            if(!model?.suggestion?.productCode.isNullOrEmpty()) {
                val count1 = viewModel.getMedicineCount(model?.suggestion?.productCode ?: "")
                lifecycleScope.launch(Dispatchers.Main) {
                    binding.subsCard.updateOrgStepperQuantity(count1)
                }
            }
        }
    }
}