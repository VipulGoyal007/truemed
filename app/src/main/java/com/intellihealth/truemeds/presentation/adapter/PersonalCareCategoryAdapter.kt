package com.intellihealth.truemeds.presentation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearSmoothScroller
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.home.ChildCategoryModel
import com.intellihealth.truemeds.databinding.AdapterPersonalCareCategoryBinding
import com.intellihealth.truemeds.presentation.callbacks.GenericCallback
import com.intellihealth.truemeds.presentation.utils.CommonFunc.smoothSnapToPosition

class PersonalCareCategoryAdapter(
    val list: List<ChildCategoryModel>,
    val context: Context,
    val callback: GenericCallback,
    var highlightProduct: Int,
) : RecyclerView.Adapter<PersonalCareCategoryViewHolder>() {
    var items: List<ChildCategoryModel> = list
    private lateinit var view: RecyclerView
    private var isPositionSet = true

    init {
        setHasStableIds(true)
    }

    override fun getItemId(position: Int): Long  = position.toLong()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PersonalCareCategoryViewHolder = PersonalCareCategoryViewHolder(
        AdapterPersonalCareCategoryBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
    )

    override fun onBindViewHolder(holder: PersonalCareCategoryViewHolder, position: Int) {
        holder.apply {
            if (isPositionSet) {
//                view.scrollToPosition(highlightProduct)
                val pos = if (highlightProduct > 0) highlightProduct - 1 else 0
                view.smoothSnapToPosition(pos, LinearSmoothScroller.SNAP_TO_START)
                isPositionSet = false
            }

            bind(items[position])
            if (position == highlightProduct) {
                binding.clCategory.setBackgroundResource(R.drawable.bg_selected_category)
                binding.divider.visibility = View.VISIBLE
            } else {
                binding.clCategory.setBackgroundResource(R.drawable.bg_unselected_category)
                binding.divider.visibility = View.INVISIBLE
            }

            itemView.setOnClickListener {
                highlightProduct = position
                callback.onActionTriggered(position)
                notifyDataSetChanged()
            }
        }
    }

    override fun getItemCount(): Int = items.size
    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        view = recyclerView
    }
}

class PersonalCareCategoryViewHolder(val binding: AdapterPersonalCareCategoryBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: ChildCategoryModel) {
        binding.model = item
    }
}