package com.intellihealth.truemeds.presentation.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse;
import com.intellihealth.truemeds.databinding.ItemVideoVerticalP2Binding;
import com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel;

import java.util.List;

public class VideoVerticalAdapterP2 extends RecyclerView.Adapter<VideoVerticalAdapterP2.ViewHolder> {
   public List<VideoFaqAllResponse.Video> items;
    public VideoViewModel viewModel;

    public VideoVerticalAdapterP2(List<VideoFaqAllResponse.Video> items, VideoViewModel viewModel) {
        setHasStableIds(true);
        this.items = items;
        this.viewModel = viewModel;
    }

    @NonNull
    @Override
    public VideoVerticalAdapterP2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemVideoVerticalP2Binding binding =
                DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                        R.layout.item_video_vertical_p2, parent, false);
        return new ViewHolder(binding);
    }


    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public void onBindViewHolder(@NonNull VideoVerticalAdapterP2.ViewHolder holder, int position) {
        VideoFaqAllResponse.Video item = items.get(position);


        String languageCode = "EN";
        if (Boolean.TRUE.equals(viewModel.get_isHindiSelected().getValue())) languageCode = "HI";
        for (int i = 0; i < 2; i++) {
            if (item.getVideo_url().get(i).getLanguageCode().equals(languageCode)) {
                holder.binding.setItem(item.getVideo_url().get(i));
            }
        }

        holder.binding.setViewModel(viewModel);
        holder.binding.setPosition(position);
        holder.binding.setSelected(item.isSelected());
        holder.binding.setSelectedNext(item.isSelectedNext());
    }


    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ItemVideoVerticalP2Binding binding;

        public ViewHolder(@NonNull ItemVideoVerticalP2Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}