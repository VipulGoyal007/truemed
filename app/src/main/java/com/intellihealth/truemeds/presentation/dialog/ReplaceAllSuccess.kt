package com.intellihealth.truemeds.presentation.dialog

import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.utils.removeExtraZeros
import com.intellihealth.truemeds.databinding.DialogReplaceSavingsBinding

class ReplaceAllSuccess (
    private val medCount: Int,
    private val saving: Double
) : DialogFragment() {
    private lateinit var binding: DialogReplaceSavingsBinding
    private var millis = 0L
    override fun getTheme() = R.style.RoundedCornersDialog
    
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.dialog_replace_savings, container, false)
        //Enter exit animation
        dialog?.window?.attributes?.windowAnimations = R.style.DialogAnimation
        binding.saving = removeExtraZeros(saving)
        binding.tvSaving.text = "by replacing $medCount items with substitutes"
        
//        binding.medCount = medCount
        setListener()
        
        return binding.root
    }
    
    private fun setListener() {
        
        binding.ivClose.setOnClickListener {
            if (dialog?.isShowing == true) dialog?.dismiss()
        }
        
        binding.btnOk.setOnClickListener{
            if (dialog?.isShowing == true){
                dialog?.dismiss()
            }
        }
    }
    
    override fun onDismiss(dialog: DialogInterface) {
        super.onDismiss(dialog)
    }
}