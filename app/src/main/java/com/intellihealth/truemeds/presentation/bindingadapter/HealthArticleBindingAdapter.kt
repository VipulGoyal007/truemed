package com.intellihealth.truemeds.presentation.bindingadapter

import android.graphics.Typeface
import android.text.Spannable
import android.text.SpannableString
import android.text.style.StyleSpan
import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.models.BlogCardModel
import com.intellihealth.salt.models.BlogModel
import com.intellihealth.salt.views.TextView
import com.intellihealth.truemeds.data.model.bottomnav.AccountTabModel
import com.intellihealth.truemeds.data.model.home.BlogSectionDataModel
import com.intellihealth.truemeds.data.model.user.GetAllPatientResponse
import com.intellihealth.truemeds.presentation.adapter.AccountTabAdapter
import com.intellihealth.truemeds.presentation.adapter.HealthArtcileBlogListAdapter
import com.intellihealth.truemeds.presentation.adapter.ManagePatientAdapter
import com.intellihealth.truemeds.presentation.viewmodel.AccountTabViewModel
import com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel

@BindingAdapter("setSubTitle", "healthArticlesViewModel")
fun setSubTitle(
    view: TextView,
    subTitle: String,
    healthArticlesViewModel: HealthArticlesViewModel
) {
    view.run {
        //notify
        val formattedText = "By $subTitle ${healthArticlesViewModel.date.value}"

        val spannable = SpannableString(formattedText)
        val endBold =  2 + subTitle.length+1  // Length of "By" plus the length of subTitle

        spannable.setSpan(StyleSpan(Typeface.BOLD), 2, endBold, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        view.text = spannable
    } ?: run {
    }

}

@BindingAdapter("setHealthArticleSuggestionList", "healthArticlesViewModel")
fun setHealthArticleSuggestionList(
    view: RecyclerView,
    list: BlogSectionDataModel?,
    healthArticlesViewModel: HealthArticlesViewModel
) {
    if (list==null) return
    view.adapter?.run {
        //notify
        if (this is HealthArtcileBlogListAdapter) {
            this.blogSectionDataModel = list
            this.homeViewModel = healthArticlesViewModel
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = HealthArtcileBlogListAdapter(list, healthArticlesViewModel)
    }
}