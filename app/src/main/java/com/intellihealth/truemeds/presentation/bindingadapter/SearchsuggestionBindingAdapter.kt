package com.intellihealth.truemeds.presentation.bindingadapter

import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.bumptech.glide.Glide
import com.intellihealth.truemeds.data.model.search.SuggestionWithType
import com.intellihealth.truemeds.data.model.search.TrendingSearchResponse
import com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine
import com.intellihealth.truemeds.presentation.adapter.PreviousSearchItemAdapter
import com.intellihealth.truemeds.presentation.adapter.RecentSearchHistoryAdapter
import com.intellihealth.truemeds.presentation.adapter.SearchSuggestionAdapter
import com.intellihealth.truemeds.presentation.adapter.TrendingSearchHistoryAdapter
import com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel


@BindingAdapter("setRecentHistoryList", "viewmodel")
fun setRecentHistoryList(
    view: RecyclerView,
    list: List<RecentMedicine>,
    viewModel: SearchViewModel
) {
    view.adapter?.run {
        //notify
        if (this is RecentSearchHistoryAdapter) {
            this.items = list
            this.viewmodel = viewmodel
            if (list.size >= 4)
                view.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL)
            else
                view.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)

            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = RecentSearchHistoryAdapter(list, viewModel)
    }
}
@BindingAdapter("setTrendingList", "viewmodel")
fun setTrendingList(
    view: RecyclerView,
    list: List<TrendingSearchResponse.TrendingSearch>,
    viewModel: SearchViewModel
) {
    view.adapter?.run {
        //notify
        if (this is TrendingSearchHistoryAdapter) {
            this.items = list
            this.viewmodel = viewmodel
            if (list.size >= 4)
                view.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL)
            else
                view.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)

            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = TrendingSearchHistoryAdapter(list, viewModel)
        if (list.size >= 4)
            view.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL)
        else
            view.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)

//        view.adapter.notifyDataSetChanged()

    }
}

@BindingAdapter("name", "search")
fun setMedicineNameWithHighlight(textView: AppCompatTextView?, data: String?, searchText: String) {
    if (textView != null) {
        textView.text = data//CommonFunc.toTitleCase(data) //remove this for highlight effect
    }
}

@BindingAdapter("setPreviousHistoryList", "viewmodel")
fun setPreviousHistoryList(
    view: RecyclerView,
    list: List<RecentMedicine>,
    viewModel: SearchViewModel
) {
    view.adapter?.run {
        //notify
        if (this is PreviousSearchItemAdapter) {
            this.items = list
            this.viewmodel = viewmodel
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = PreviousSearchItemAdapter(list, viewModel)
    }
    /*if (view != null && view.adapter != null) {
        if (view.adapter is PreviousSearchItemAdapter) {
            (view.adapter as PreviousSearchItemAdapter?)!!.items = list
            view.adapter.notifyDataSetChanged()
        }
    } else {
        val adapter = PreviousSearchItemAdapter(list, viewModel)
        view!!.adapter = adapter
    }*/
}
@BindingAdapter("setSearchSuggestionList", "viewmodel")
fun setSearchSuggestionList(
    view: RecyclerView,
    list: List<SuggestionWithType>,
    viewModel: SearchViewModel
) {
    view.adapter?.run {
        //notify
        if (this is SearchSuggestionAdapter) {
            this.items = list
            this.viewmodel = viewmodel
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = SearchSuggestionAdapter(list, viewModel)
    }
    /*if (view != null && view.adapter != null) {
        if (view.adapter is PreviousSearchItemAdapter) {
            (view.adapter as PreviousSearchItemAdapter?)!!.items = list
            view.adapter.notifyDataSetChanged()
        }
    } else {
        val adapter = PreviousSearchItemAdapter(list, viewModel)
        view!!.adapter = adapter
    }*/
}

@BindingAdapter("setImageFromArrayUrl")
fun setImageFromArrayUrl(imgVw: AppCompatImageView, imgUrl: String?) {
    if (!imgUrl.isNullOrEmpty()) {
        val imgUrlList: List<String> = imgUrl.split(",")
        val singleUrl = imgUrlList[0] + "?tr=cm-pad_resize,lo-true,w-160"
        Glide.with(imgVw.context)
            .load(singleUrl)
            .into(imgVw)
    }
}


