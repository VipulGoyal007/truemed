package com.intellihealth.truemeds.presentation.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.callbacks.BlogCardCallback
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.HealthArticlesItemBinding
import com.intellihealth.truemeds.databinding.ProgressBarItemBinding
import com.intellihealth.truemeds.presentation.model.BlogCardModel
import com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel

class HealthArticleAdapter(
    var itemList: List<BlogCardModel?>,
    var viewmodel: HealthArticlesViewModel
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    /*var viewmodel: HealthArticlesViewModel? = null
    var itemList: List<BlogCardModel?> = Collections.emptyList()*/
    lateinit var binding: HealthArticlesItemBinding;
    private lateinit var bindingLoad: ProgressBarItemBinding;

    companion object {
        private const val VIEW_TYPE_ITEM = 1
        private const val VIEW_TYPE_LOADING = 2
    }

    init {
        setHasStableIds(true)
    }

    /*constructor (viewmodel: HealthArticlesViewModel?) : this() {
        this.viewmodel = viewmodel
    }*/

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            VIEW_TYPE_ITEM -> {
                binding = DataBindingUtil.inflate(
                    LayoutInflater.from(parent.context),
                    R.layout.health_articles_item, parent, false
                );
                ViewHolderOne(binding, viewmodel)
            }

            VIEW_TYPE_LOADING -> {
                bindingLoad = DataBindingUtil.inflate(
                    LayoutInflater.from(parent.context),
                    R.layout.progress_bar_item, parent, false
                );
                ViewHolderTwo(bindingLoad)
            }

            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ViewHolderOne -> {
                if (itemList[position] != null) {
                    holder.binding.heathArticleCard.setBlogCardData(itemList[position]?.toSdkObject())
                    holder.binding.heathArticleCard.setCallback(object : BlogCardCallback {
                        override fun readClickCallback(blogModel: com.intellihealth.salt.models.BlogCardModel) {
                            viewmodel?.healthArticleClick(itemList[position])
                        }

                        override fun viewAllClickCallback() {
                        }

                        override fun viewClickCallback(blogModel: com.intellihealth.salt.models.BlogCardModel) {
                            viewmodel?.healthArticleClick(itemList[position])
                        }

                    })
                }
            }

            is ViewHolderTwo -> holder.bind()
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun getItemViewType(position: Int): Int {
        return if (itemList[position] == null) VIEW_TYPE_LOADING else VIEW_TYPE_ITEM
    }

    class ViewHolderOne(
        var binding: HealthArticlesItemBinding,
        var viewmodel: HealthArticlesViewModel?
    ) : RecyclerView.ViewHolder(binding.root) {


    }

    class ViewHolderTwo(private var binding: ProgressBarItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() =
            with(binding) {
                progressBar.visibility = View.VISIBLE
            }
    }


    override fun getItemId(position: Int): Long {
        return position.toLong()
    }


    /*fun setData(itemList: List<BlogCardModel?>) {
        this.itemList = itemList
        notifyDataSetChanged()
    }*/
}