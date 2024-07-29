package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse
import com.intellihealth.truemeds.databinding.ItemVideoP2Binding
import com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel
import java.lang.Boolean
import kotlin.Int
import kotlin.Long

class VideoAdapterP2(items: List<VideoFaqAllResponse.Video>, viewModel: VideoViewModel) :
    RecyclerView.Adapter<VideoAdapterP2.ViewHolder?>() {
    @JvmField
    var items: List<VideoFaqAllResponse.Video>
    @JvmField
    var viewModel: VideoViewModel

    init {
        setHasStableIds(true)
        this.items = items
        this.viewModel = viewModel
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = DataBindingUtil.inflate<ItemVideoP2Binding>(
            LayoutInflater.from(parent.context),
            R.layout.item_video_p2,
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val (_, _, _, video_url, isSelected, _, playState) = items[position]
        var languageCode = "EN"
        if (Boolean.TRUE == viewModel._isHindiSelected.value) languageCode = "HI"
        if (!video_url.isEmpty())
            for (i in 0..1) {
                if (video_url[i].languageCode == languageCode) {
                    holder.binding.item = video_url[i]
                }
            }
        holder.binding.viewModel = viewModel
        holder.binding.position = position
        holder.binding.selected = Boolean.TRUE == isSelected
        if (playState) {
            Glide.with(holder.binding.ivPlay.context).load(R.drawable.ic_play)
                .into(holder.binding.ivPlay)
            holder.binding.tvIsVideoPlaying.visibility = View.GONE
        } else {
            Glide.with(holder.binding.ivPlay.context)
                .load(R.drawable.ic_pause).into(holder.binding.ivPlay)
            holder.binding.tvIsVideoPlaying.visibility = View.VISIBLE
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(val binding: ItemVideoP2Binding) : RecyclerView.ViewHolder(
        binding.root
    )
}