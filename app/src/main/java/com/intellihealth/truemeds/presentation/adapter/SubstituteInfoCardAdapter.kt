package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.AdapterSubstituteInfoCardItemBinding
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel
import com.intellihealth.salt.callbacks.ButtonClickCallback
import com.intellihealth.salt.constants.SubsInfoCardConstants
import com.intellihealth.salt.models.SubstituteInfoCardModel

class SubstituteInfoCardAdapter(
    var substituteDataModel: SubstituteInfoCardModel?,
    val homeViewModel: HomeViewModel
) : RecyclerView.Adapter<SubstituteInfoCardAdapter.ItemViewHolder>() {

    private lateinit var binding: AdapterSubstituteInfoCardItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.adapter_substitute_info_card_item,
            parent, false
        )
        if (!homeViewModel.homeGenericList.value.isNullOrEmpty()) {
            substituteDataModel = SubstituteInfoCardModel(
                "Substitutes",
                " are the smarter choice",
                homeViewModel.homeGenericList.value?.get(0)?.image ?: "",
                "Learn More",
                "View example",
                "for better understanding"
            )
        }
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        if (substituteDataModel != null) {
            holder.binding.subsInfoCard.setUpSubsInfoCardData(substituteDataModel!!)

            holder.binding.subsInfoCard.setButtonClickCallback(object : ButtonClickCallback {
                override fun buttonClick() {

                }

                override fun buttonClickWithParams(buttonType: String) {
                    when (buttonType) {
                        SubsInfoCardConstants.BUTTON_LEARN_MORE -> {
                            homeViewModel.substituteInfoCardLearnMore("Learn More")

                        }

                        SubsInfoCardConstants.BUTTON_VIEW_EXAMPLE -> {
                            homeViewModel.substituteInfoCardViewExample("View example")
                        }

                        SubsInfoCardConstants.BUTTON_IMAGE_CLICKED -> {
                            homeViewModel.substituteInfoCardImageClicked("Image clicked")
                        }
                    }
                }

            })
        }
    }

    override fun getItemCount(): Int = 1

    class ItemViewHolder(binding: AdapterSubstituteInfoCardItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val binding: AdapterSubstituteInfoCardItemBinding

        init {
            this.binding = binding
        }
    }

    fun setData(responseApi: SubstituteInfoCardModel) {
        this.substituteDataModel = responseApi
        notifyDataSetChanged()
    }
}