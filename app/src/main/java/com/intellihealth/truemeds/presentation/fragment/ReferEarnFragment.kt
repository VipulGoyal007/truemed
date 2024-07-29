package com.intellihealth.truemeds.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.FragmentReferAndEarnBinding
import com.intellihealth.truemeds.databinding.FragmentReferEarnBinding
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.ReferNEarnViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ReferEarnFragment: Fragment(R.layout.fragment_refer_and_earn) {
    private val binding by viewBinding(FragmentReferAndEarnBinding::bind)
    private val viewModel: ReferNEarnViewModel by viewModels<ReferNEarnViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }
}