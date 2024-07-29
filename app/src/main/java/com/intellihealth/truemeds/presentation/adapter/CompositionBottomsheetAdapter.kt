package com.intellihealth.truemeds.presentation.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.salt.models.AuthorCardModel
import com.intellihealth.truemeds.data.model.home.CompositionBSDataModel
import com.intellihealth.truemeds.databinding.CompositionBottomsheetItemBinding

class CompositionBottomsheetAdapter(
    val list: ArrayList<CompositionBSDataModel> = ArrayList()
) : RecyclerView.Adapter<CompositionBottomsheetAdapter.CompositionCardViewHolder>() {

    private lateinit var binding: CompositionBottomsheetItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CompositionCardViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.composition_bottomsheet_item,
            parent, false
        )
        return CompositionCardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CompositionCardViewHolder, position: Int) {
        val modelItem = list[position]
        holder.binding.data = modelItem
       /* if(position < list.size && position == list.size-1){
            holder.binding.vLine.visibility = View.GONE
        }*/
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class CompositionCardViewHolder(binding: CompositionBottomsheetItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val binding: CompositionBottomsheetItemBinding
        init { this.binding = binding }
    }
}