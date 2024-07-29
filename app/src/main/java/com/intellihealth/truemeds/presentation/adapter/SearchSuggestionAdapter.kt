package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.callbacks.SearchItemClickCallback
import com.intellihealth.salt.models.SearchSuggestionModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.search.SuggestionWithType
import com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine
import com.intellihealth.truemeds.databinding.SearchSuggestionRecentRvItemBinding
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel

class SearchSuggestionAdapter(var items: List<SuggestionWithType>, var viewmodel: SearchViewModel) :
    RecyclerView.Adapter<SearchSuggestionAdapter.MedicineViewHolder>() {
    init {
        setHasStableIds(true)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MedicineViewHolder {
        val binding: SearchSuggestionRecentRvItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.search_suggestion_recent_rv_item, parent, false
        )
        return MedicineViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MedicineViewHolder, position: Int) {
        try {
            var didYouMean = viewmodel.showDidYouMean.value ?: false
            var inSection = items[position].inSection ?: ""
            holder.binding.searchSuggestionItem.setSearchSuggestionItem(SearchSuggestionModel(
                title = items[position].text,
                subtitle = items[position].inSection,
                isSearchIcon = didYouMean || inSection.isNotEmpty()
            ))

            val searchCallback = object : SearchItemClickCallback {
                override fun onSearchItemClick() {
                    try {
                        if(items.isNotEmpty()) {
                            viewmodel.mxTermSearchedTriggered = false
                            val recentMed = RecentMedicine(
                                null,
                                items[position].text ?: "",
                                "",
                                0,
                                SharedPrefManager.getInstance().loggedInUserAccessToken,
                                System.currentTimeMillis(),
                                items[position].type ?: "",
                                true,
                                "",
                                ""
                            )
                            viewmodel.insertRecentlySearchMedicineInDB(recentMed)
                            viewmodel.suggestion_term_clicked_position = position
                            viewmodel.onClickSuggestionItem.postValue(items[position])
                            viewmodel.selectedItemQC = items[position].qc
                            viewmodel.selectedItemRT =
                                if (items[position].rt == null) null else items[position].rt.toString()
    //                viewmodel.clickedSuggestionType=items[position].inSection.toString()
                            viewmodel.clickedSuggestionType = items[position].type ?: ""
                            viewmodel.suggestion_term_clicked = items[position].text.toString()
                        }
                    }catch (_:Exception){

                    }
                }
            }


            holder.binding.searchSuggestionItem.searchCallback(searchCallback)

//        holder.binding.setItem(items[position])
            holder.binding.viewmodel = viewmodel
            holder.binding.index = position
        } catch (_: Exception) {
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun getItemId(position: Int): Long {
        return (position + 1).toLong()
    }

    inner class MedicineViewHolder(binding: SearchSuggestionRecentRvItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var binding: SearchSuggestionRecentRvItemBinding

        init {
            this.binding = binding
        }
    }
}