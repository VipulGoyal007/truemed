package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.utils.highlightView
import com.intellihealth.salt.utils.scaleViewBy
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.RvOtcItemBinding
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.viewmodel.CartViewModel

class ReorderOtcProductAdapter(
    var mList: List<ProductInfoModel>,
    var viewModel: CartViewModel,
) : RecyclerView.Adapter<ReorderOtcProductAdapter.MyViewHolder>() {

    val noOfItems = viewModel.otcApiList.value?.size

    class MyViewHolder(binding: RvOtcItemBinding) : RecyclerView.ViewHolder(binding.root) {
//        val ivIcon: ImageView = itemView.findViewById(R.id.ivIcon)
//        val ivBackground: ImageView = itemView.findViewById(R.id.ivBackground)
        val binding: RvOtcItemBinding

        init {
            this.binding = binding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MyViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.rv_otc_item,
                parent,
                false
            )
        )

    //note:- infinite scroll
    override fun getItemCount() = if (mList.isNotEmpty()) {
        if (mList.size > 5) {
            Integer.MAX_VALUE
        } else {
            mList.size
        }
    } else {
        0
    }//mList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.viewModel = viewModel
        holder.binding.position = position
        //note:- infinite scroll
        holder.binding.item = mList[position % mList.size]
        holder.binding.executePendingBindings()
        if (position == 0 || position == viewModel.otcRefreshIndex){
            holder.binding.ivIcon.scaleViewBy(
                startScale = 1f,
                endScale = 2.0f,
                isAnimationRequired = true
            )
            holder.binding.ivBackground.highlightView(
                ContextCompat.getDrawable(holder.binding.ivBackground.context,R.drawable.bg_faint_blue_radius_60)!!
            )
        }
    }


}