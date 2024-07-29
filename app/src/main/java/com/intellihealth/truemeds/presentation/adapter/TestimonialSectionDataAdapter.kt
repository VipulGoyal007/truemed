package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.home.TestimonialSectionDataModel
import com.intellihealth.truemeds.databinding.AdapterTestimonialSectionItemBinding

class TestimonialSectionDataAdapter(
    var dataModel: TestimonialSectionDataModel?
) : RecyclerView.Adapter<TestimonialSectionDataAdapter.ItemViewHolder>() {

    private lateinit var binding: AdapterTestimonialSectionItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.adapter_testimonial_section_item,
            parent, false
        )
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        dataModel?.testimonialModel?.let{
            holder.binding.testimonialSection.setTestimonialSection(it)
        }
    }

    override fun getItemCount(): Int = 1

    class ItemViewHolder(binding: AdapterTestimonialSectionItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val binding: AdapterTestimonialSectionItemBinding
        init { this.binding = binding }
    }

    fun setData(responseApi: TestimonialSectionDataModel) {
        this.dataModel = responseApi
        notifyDataSetChanged()
    }
}