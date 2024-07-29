package com.intellihealth.truemeds.presentation.bottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.intellihealth.truemeds.presentation.viewmodel.OtcSuperCategoryViewModel

class OTCSuperCategoryFilterBottomsheet : BottomSheetDialogFragment() {

    lateinit var viewModel: OtcSuperCategoryViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    /**
     * 1) Initialize binding for viewmodel, lifecycleowner
     * 2) set event listeners, observers
     * **/
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
        eventObservers()
    }

    private fun initView(){

    }

    private fun eventObservers(){

    }


}