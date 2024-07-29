package com.intellihealth.truemeds.presentation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.AuthorCardItemBinding
import com.intellihealth.salt.models.AuthorCardModel

class AuthorCardAdapter(
    val context: Context,
    val list: ArrayList<AuthorCardModel> = ArrayList()
) : RecyclerView.Adapter<AuthorCardAdapter.AuthorCardViewHolder>() {

    private lateinit var binding: AuthorCardItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AuthorCardViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.author_card_item,
            parent, false
        )
        return AuthorCardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AuthorCardViewHolder, position: Int) {
        with(holder.binding) {
            this.authorData = list[position]
        }
    }

    override fun getItemCount(): Int = list.size

    class AuthorCardViewHolder(binding: AuthorCardItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val binding: AuthorCardItemBinding
        init { this.binding = binding }
    }
}