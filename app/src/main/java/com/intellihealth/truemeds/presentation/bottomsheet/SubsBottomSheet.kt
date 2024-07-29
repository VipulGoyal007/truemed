package com.intellihealth.truemeds.presentation.bottomsheet

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
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
import com.intellihealth.truemeds.databinding.FragmentSubsBottomSheetBinding
import com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase
import com.intellihealth.truemeds.presentation.analytics.FirebaseEvent
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class SubsBottomSheet : BottomSheet() {
    private lateinit var binding: FragmentSubsBottomSheetBinding
    private lateinit var dialog: BottomSheetDialog
    private lateinit var viewModel: ProductDetailViewModel
    private var orgSubCompareBottomSheetCallback: OrgSubCompareBottomSheetCallback?=null
    private lateinit var model: ProductInfoModel
    private var suggestion_term_clicked_position: Int = 0
    private var suggestion_term_clicked: String? = null
    private var term_searched: String? = null
    private var clicked_suggestion_type: String? = null

    @Inject
    lateinit var firebaseEventUseCase: FirebaseEventUseCase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCancel(dialog: DialogInterface) {
        super.onCancel(dialog)
        if (orgSubCompareBottomSheetCallback != null)
            orgSubCompareBottomSheetCallback?.closeClick(viewModel.isReload)
    }

    fun setProductViewModel(viewModel: ProductDetailViewModel) {
        this.viewModel = viewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        firebaseEventUseCase.logFirebaseEvent(FirebaseEvent.FIREBASE_SEARCH_SUBS_VIEW,"")
        val view = inflater.inflate(R.layout.fragment_subs_bottom_sheet, container, false)

        viewModel = ViewModelProvider(requireActivity())[ProductDetailViewModel::class.java]

        binding = DataBindingUtil.bind(view)!!

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        dismissMissBottomSheet()
        initArgs()
        eventListeners()
    }

    private fun initArgs() {

        val bundle = arguments ?: return

        val title = bundle.getString(BundleConstants.PRODUCT_SUBS_TITLE)
        viewModel.suggestion_term_clicked_position = bundle.getInt(BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED_POSITION)
        viewModel.term_searched = bundle.getString(BundleConstants.BUNDLE_KEY_TERM_SEARCHED)
        Log.d("TAG", "initArgs: ${viewModel.term_searched}")
        viewModel.resultPosition = bundle.getInt(BundleConstants.POSITION)
        if (bundle.containsKey(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE)) {
            viewModel.clickedOnPage = bundle.getString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE)!!
        }
        binding.title = title
        model = Gson().fromJson(
            bundle.getString(BundleConstants.PRODUCT_SUBS_DETAIL),
            ProductInfoModel::class.java
        )
        model.cardType = FullWidthProductCardConstants.COMPARE_N_CHOOSE
        model?.let {
//            viewModel.getOrgList(model)
            viewModel.term_searched = term_searched
            viewModel.getSubsBottomSheet(it)
            

        }

        viewModel.isReload = false
    }

    private fun dismissMissBottomSheet() {
        binding.ivClose.setOnClickListener {
            dismiss()
            orgSubCompareBottomSheetCallback?.closeClick(viewModel.isReload)
        }
    }

    private fun eventListeners() {

        viewModel.eventLaunchPDPageForSub.observe(requireActivity(), EventObserver {
            if (it == null) return@EventObserver
            orgSubCompareBottomSheetCallback?.openPDPage(it.productCode,it.isSubs)
        })
    }


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        dialog = BottomSheetDialog(requireContext(), theme)
        setUpBottomSheetBehaviour(
            dialog,
            true,
            4,
            45
        )
        return dialog
    }

    override fun getTheme() = R.style.BottomSheetDialog
    
    fun setUpEventData(suggestion_term_clicked_position: Int,
                       suggestion_term_clicked: String?,
                       term_searched: String?,
                       clicked_suggestion_type: String?) {
        this.suggestion_term_clicked_position = suggestion_term_clicked_position
        this.suggestion_term_clicked = suggestion_term_clicked
        this.term_searched = term_searched
        this.clicked_suggestion_type = clicked_suggestion_type
    }
    
    
    fun newInstance(): SubsBottomSheet {
        return SubsBottomSheet()
    }

    fun setCallback(orgSubCompareBottomSheetCallback: OrgSubCompareBottomSheetCallback) {
        this.orgSubCompareBottomSheetCallback = orgSubCompareBottomSheetCallback
    }

    override fun onResume() {
        super.onResume()
        getUpdatedDBCount()
    }

    private fun getUpdatedDBCount() {
        if(!model.suggestion?.productCode.isNullOrEmpty()) {
            lifecycleScope.launch(Dispatchers.IO) {
                val count = viewModel.getMedicineCount(model.suggestion?.productCode ?: "")
                lifecycleScope.launch(Dispatchers.Main) {
                    binding.full.updateOrgStepperQuantity(count)
                }
            }
        }
    }
}