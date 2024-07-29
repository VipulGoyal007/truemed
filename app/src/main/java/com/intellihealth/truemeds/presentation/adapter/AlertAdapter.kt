package com.intellihealth.truemeds.presentation.adapter

import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.AdapterHomepageAlertItemBinding
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel

class AlertAdapter(
    private var imagePath: String,
    val homeViewModel: HomeViewModel
) : RecyclerView.Adapter<AlertAdapter.ItemViewHolder>() {

    private lateinit var binding: AdapterHomepageAlertItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.adapter_homepage_alert_item,
            parent, false
        )
        this.imagePath = homeViewModel.alertUrl.value ?: ""
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
//        if (homeViewModel.showShimmerHome.value == true) {
//            holder.binding.cvAlert.visibility = View.GONE
//        } else {
//            holder.binding.cvAlert.visibility = View.VISIBLE
//        }
        var height = (Resources.getSystem().displayMetrics.widthPixels * 0.293).toInt()
        holder.binding.cvAlert.layoutParams.height = height
        holder.binding.ivAlert.layoutParams.height = height
        Glide.with(holder.binding.ivAlert).load(imagePath).into(holder.binding.ivAlert)
    }

    override fun getItemCount(): Int = 1

    class ItemViewHolder(binding: AdapterHomepageAlertItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val binding: AdapterHomepageAlertItemBinding

        init {
            this.binding = binding
        }
    }

    fun setImageUrl(imagePath: String) {
        this.imagePath = imagePath
        notifyDataSetChanged()
    }
}