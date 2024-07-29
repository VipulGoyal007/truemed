package com.intellihealth.truemeds.presentation.bottomsheet

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.intellihealth.salt.callbacks.CloseIconClickCallback
import com.intellihealth.salt.models.BottomsheetHeaderModel
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.HealthArticleBottomsheetBinding
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel

class HealthArticleBottomSheet() : BottomSheetDialogFragment() {
    private lateinit var bottomSheetHeaderModel: BottomsheetHeaderModel
    private lateinit var dialog: BottomSheetDialog
    lateinit var binding : HealthArticleBottomsheetBinding
//    var viewmodel: HealthArticlesViewModel? = healthArticlesViewModel

    private var header: Boolean=true
//    private lateinit var healthArticlesViewModel: HealthArticlesViewModel

    private val healthArticlesViewModel by lazy { ViewModelProvider(requireActivity())[HealthArticlesViewModel::class.java] }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.health_article_bottomsheet, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.healthArticleItemRv.isNestedScrollingEnabled = false
//        val view = inflater.inflate(R.layout.health_article_bottomsheet, container, false)
//        binding = DataBindingUtil.bind(view)!!
        binding.healthArticlesViewModel = healthArticlesViewModel
        return binding.root
    }



    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        dialog = BottomSheetDialog(requireActivity(), theme)
        /*setUpBottomSheetBehaviour(
            dialog,
            true,
            6,
            60
        )*/
        dialog.setOnShowListener { dialogInterface: DialogInterface? ->
            val bottomSheetDialog = dialogInterface as BottomSheetDialog?
            setupFullHeight(bottomSheetDialog!!)
        }
        return dialog
    }

    fun openBottomSheet(header: Boolean, height: Int, bottomSheetState: Int) {
        this.header=header
        bottomSheetHeaderModel = BottomsheetHeaderModel(
            "Category", "gyhfvyhg",
            com.intellihealth.salt.R.drawable.ic_refresh, true,
            com.intellihealth.salt.R.drawable.ic_search_close, header, height,
            bottomSheetState
        )
    }

    fun setupFullHeight(bottomSheetDialog: BottomSheetDialog) {

        //this condition is commented for now
        val bottomSheet =
            bottomSheetDialog.findViewById<FrameLayout>(com.google.android.material.R.id.design_bottom_sheet)
        if (bottomSheet != null) {
                BottomSheetBehavior.from(bottomSheet).apply {
                    peekHeight = getBottomSheetDialogDefaultHeight()
                    isDraggable=false
                    state = BottomSheetBehavior.STATE_COLLAPSED
                }


            }
    }

    private fun getWindowHeight(): Int {
        val displayMetrics = DisplayMetrics()
        requireActivity().windowManager.defaultDisplay.getMetrics(displayMetrics)
        return (displayMetrics.heightPixels).toInt()
    }

    private fun getBottomSheetDialogDefaultHeight(): Int {
        return getWindowHeight() * 60 / 100
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpData()
        setEventListeners()

    }
    private fun setUpData(){
       /* binding.BottomSheetHeader.setBottomsheetHeaderData(
            bottomSheetHeaderModel
        )*/
    }

    private fun setEventListeners() {
        binding.imageClose.setOnClickListener(View.OnClickListener {
            if (dialog.isShowing) {
                dialog.dismiss()
            }
        })
    }
    override fun getTheme(): Int {
        return R.style.BottomSheetDialog
    }
}