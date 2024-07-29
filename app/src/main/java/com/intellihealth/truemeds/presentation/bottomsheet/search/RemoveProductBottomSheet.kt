package com.intellihealth.truemeds.presentation.bottomsheet.search

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.DeleteCallback
import com.intellihealth.truemeds.data.model.home.RatingDetailsResponseModel
import com.intellihealth.truemeds.databinding.FragmentRemoveProductBottomSheetBinding
import com.intellihealth.truemeds.presentation.callbacks.FeedbackCallback

class RemoveProductBottomSheet() : BottomSheet() {
    private lateinit var binding: FragmentRemoveProductBottomSheetBinding
    private lateinit var dialog: BottomSheetDialog
    var callback: DeleteCallback? = null

    constructor(callback: DeleteCallback) : this() {
        this.callback = callback
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_remove_product_bottom_sheet, container, false)
        binding = DataBindingUtil.bind(view)!!
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.deleteProduct.setOnClickListener {
            callback?.yesClick()
            dismiss()
        }
        binding.notDeleteProduct.setOnClickListener {
            dismiss()
        }
        binding.ivClose.setOnClickListener {
            dismiss()
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        dialog = BottomSheetDialog(requireContext(), theme)
        setUpBottomSheetBehaviour(
            dialog,
            true,
            6,
            40
        )
        return dialog
    }

    override fun getTheme() = R.style.BottomSheetDialog
}